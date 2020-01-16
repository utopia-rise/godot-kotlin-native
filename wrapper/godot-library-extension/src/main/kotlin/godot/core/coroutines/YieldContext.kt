package godot.core.coroutines

import godot.Object
import godot.core.GD
import godot.core.Variant
import godot.core.godotArrayOf
import kotlinx.cinterop.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import platform.posix.EXIT_FAILURE
import kotlin.system.exitProcess


class YieldContext<T> internal constructor(
        private val block: suspend YieldContext<T>.() -> T,
        private val functionState: FunctionState<T>,
        private val owner: Object,
        private val applyResult: (T) -> Unit
) {
    private val yieldPipe = Channel<Any?>()
    private val resumePipe = Channel<Any?>()

    private var paused = false


    init {
        runBlocking {
            GlobalScope.launch {
                try {
                    applyResult(block())
                }
                catch (e: Throwable) {
                    GD.printError(e.message.toString(), "coroutine block", owner.toString(), 0)
                    e.printStackTrace()
                    exitProcess(EXIT_FAILURE)
                }

                yieldPipe.cancel()
            }
            yieldPipe.receiveOrNull()
        }
    }


    suspend fun <K> yield(): K {
        paused = true
        yieldPipe.send(null)
        @Suppress("UNCHECKED_CAST") val result = resumePipe.receive() as? K
            ?: throw IllegalStateException("Resume types mismatch")
        paused = false

        return result
    }
    suspend fun yield() {
        paused = true
        yieldPipe.send(null)
        resumePipe.receive()
        paused = false
    }
    suspend fun yield(target: Object, signal: String) {
        val pointer = StableRef.create(functionState).asCPointer()
        val params = godotArrayOf(pointer.toLong(), target, owner, signal)

        do {
        } while (target.isConnected(signal, owner, "__yieldSignalListener"))

        owner.__yieldSignalFunction = ::yieldSignalListener
        target.connect(signal, owner, "__yieldSignalListener", params)

        params.clear()
        yield()
    }


    internal fun resume(value: Any?) {
        if (paused) {
            runBlocking {
                resumePipe.send(value)
                yieldPipe.receiveOrNull()
            }
        }
    }


    companion object {
        private fun yieldSignalListener(args: Array<out Variant>) {
            if (args.size < 4)
                throw IllegalStateException("Implicit yieldSignalListener call with less than 4 parameters")

            val pointer: COpaquePointer = args[args.size - 4].toLong().toCPointer()
                    ?: throw IllegalStateException("yieldSignalListener called with non-pointer parameter")
            val target = args[args.size - 3].toObject()
            val owner = args[args.size - 2].toObject()
            val signal = args[args.size - 1].toString()

            val ref = pointer.asStableRef<FunctionState<*>>()
            val monitor = ref.get()

            target.disconnect(signal, owner, "__yieldSignalListener")
            monitor.resume()

            ref.dispose()
        }
    }
}