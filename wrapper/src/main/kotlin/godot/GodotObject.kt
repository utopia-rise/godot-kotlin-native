package godot

import godot.gdnative.godot_get_class_constructor
import kotlinx.cinterop.*
import godot.core.CoreType
import godot.core.Variant
import godot.registration.nativeConstructorInvocationFlag
import godot.registration.nonNativeConstructorRawMemory


abstract class GodotObject : CoreType {
    internal var rawMemory: COpaquePointer? = null


    internal constructor(mem: COpaquePointer) {
        rawMemory = mem.reinterpret<COpaquePointerVar>().pointed.value
    }
    internal constructor(variant: Variant) {
        godot.fromVariant(this, variant)
    }
    constructor(name: String) {
        if (nativeConstructorInvocationFlag) {
            if (name != "") {
                godot_get_class_constructor(name)?.let {
                    rawMemory = it.reinterpret<CFunction<() -> COpaquePointer>>()()
                    // TODO: put destructor somewhere
                } ?: throw NotImplementedError("There is no constructor for class $name in GD")
            }
        } else {
            nativeConstructorInvocationFlag = true
            rawMemory = nonNativeConstructorRawMemory!!
        }
    }


    internal fun rawMem(): COpaquePointer {
        return rawMemory ?: throw NullPointerException("Attempt to use null object: $this")
    }
    override fun isNull(): Boolean = rawMemory == null


    final override fun getRawMemory(memScope: MemScope): COpaquePointer = rawMem()
    final override fun setRawMemory(mem: COpaquePointer) {
        rawMemory = mem
    }
}