package yield


class GD {
    companion object {
        fun <T> yielded(block: suspend YieldContext<T>.() -> T): FunctionState<T> {
            return FunctionState(block)
        }
    }
}
