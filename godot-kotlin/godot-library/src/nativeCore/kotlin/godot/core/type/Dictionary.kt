package godot.core

import godot.core.NativeCoreType
import godot.gdnative.godot_array
import godot.gdnative.godot_dictionary
import kotlinx.cinterop.*

class Dictionary<T> : NativeCoreType<godot_dictionary>, Iterable<T> {
    //PROPERTIES
    val size: Int
        get() = this.size()

    //CONSTRUCTOR
    constructor() {
        callNative {
            checkNotNull(Godot.gdnative.godot_dictionary_new)(it)
        }
    }

    constructor(other: Dictionary<T>) {
        callNative {
            checkNotNull(Godot.gdnative.godot_dictionary_new_copy)(it, other._handle.ptr)
        }
    }

    internal constructor(native: CValue<godot_dictionary>) {
        memScoped {
            this@Dictionary.setRawMemory(native.ptr)
        }
    }

    internal constructor(mem: COpaquePointer) {
        this.setRawMemory(mem)
    }

    //INTEROP
    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return _handle.getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        _handle = mem.reinterpret<godot_dictionary>().pointed.readValue()
    }



    //API

    //UTILITIES
    internal inline fun <T> callNative(block: MemScope.(CPointer<godot_dictionary>) -> T): T {
        return callNative(this, block)
    }
}
