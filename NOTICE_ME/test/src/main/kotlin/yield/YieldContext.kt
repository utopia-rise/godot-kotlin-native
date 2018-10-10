package yield

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


class YieldContext<T> internal constructor(
        private val block: suspend YieldContext<T>.() -> T,
        private val applyResult: (T) -> Unit
) {
    private val yieldPipe = Channel<Any?>()
    private val resumePipe = Channel<Any?>()

    private var paused = false


    init {
        runBlocking {
            GlobalScope.launch {
                applyResult(block())
                yieldPipe.cancel()
            }
            yieldPipe.receiveOrNull()
        }
    }


    suspend fun <T> yield(): T {
        yieldPipe.send(null)
        paused = true
        @Suppress("UNCHECKED_CAST") val result = resumePipe.receive() as? T
            ?: throw IllegalStateException("Resume types mismatch")
        paused = false
        return result
    }


    internal fun resume(value: Any?) {
        if (paused) {
            runBlocking {
                resumePipe.send(value)
                yieldPipe.receiveOrNull()
            }
        }
    }
    suspend fun yield() = yield<Any?>()
}