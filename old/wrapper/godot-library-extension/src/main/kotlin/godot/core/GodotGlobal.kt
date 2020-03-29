package godot.core

import godot.Object
import godot.core.coroutines.FunctionState
import godot.core.coroutines.YieldContext
import godot.core.GD


fun <T> GD.Companion.yielding(owner: Object, block: suspend YieldContext<T>.() -> T): FunctionState<T> {
    return FunctionState(owner, block)
}