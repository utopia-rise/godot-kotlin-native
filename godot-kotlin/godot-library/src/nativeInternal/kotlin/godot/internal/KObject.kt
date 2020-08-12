package godot.internal

import godot.core.Godot
import godot.core.Variant
import kotlinx.cinterop.COpaquePointer

@Suppress("LeakingThis")
abstract class KObject {
    internal open fun __new(): COpaquePointer {
        throw NotImplementedError("__new not implemented for ${this::class.simpleName}")
    }
    lateinit var ptr: COpaquePointer

    init {
        if (Godot.shouldInitPtr()) {
            ptr = __new()
        }
    }

    open fun _onInit() {}
    open fun _onDestroy() {}
}
