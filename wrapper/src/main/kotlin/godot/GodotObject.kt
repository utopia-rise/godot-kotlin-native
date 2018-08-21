package kotlin.godot

import godot.godot_get_class_constructor
import kotlinx.cinterop.*
import kotlin.godot.core.CoreType
import kotlin.godot.core.Godot
import kotlin.godot.core.Variant
import kotlin.godot.registration.fromVariant


abstract class GodotObject : CoreType {
    internal var rawMemory: COpaquePointer? = null


    internal constructor(mem: COpaquePointer) {
        rawMemory = mem.reinterpret<COpaquePointerVar>().pointed.value ?: throw NullPointerException("Godot function returned null")
    }
    internal constructor(variant: Variant) {
        fromVariant(this, variant)
    }
    constructor(name: String) {
        if (name != "") {
            godot_get_class_constructor(name)?.let {
                rawMemory = it.reinterpret<CFunction<() -> COpaquePointer>>()()
                // TODO: put destructor somewhere
            } ?: throw NotImplementedError("There is no constructor for class $name in Godot")
        }
    }


    internal fun rawMem(): COpaquePointer {
        return rawMemory ?: throw NullPointerException("Attempt to use uninitialized object: $this")
    }


    final override fun getRawMemory(memScope: MemScope): COpaquePointer = rawMem()
    final override fun setRawMemory(mem: COpaquePointer) {
        rawMemory = mem
    }
}