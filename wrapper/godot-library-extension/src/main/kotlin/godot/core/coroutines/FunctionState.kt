package godot.core.coroutines

import godot.Object


class FunctionState<T> internal constructor(
        owner: Object,
        block: suspend YieldContext<T>.() -> T
) {
    data class ReturnValue<T>(val value: T)

    private var returnedValue: ReturnValue<T>? = null
    private val context = YieldContext(block, this, owner) {
            value -> returnedValue = ReturnValue(value)
    }


    val result: T
        get() {
            if (returnedValue == null)
                throw IllegalStateException("Function hasn't finished yet")
            return returnedValue!!.value
        }
    val finished: Boolean
        get() = returnedValue != null


    fun <K> resume(value: K) = apply {
        if (finished)
            throw IllegalStateException("Function has finished.")
        context.resume(value)
    }
    fun resume() = resume(null)
}