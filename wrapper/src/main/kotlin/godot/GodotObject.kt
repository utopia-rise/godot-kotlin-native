package godot

import godot.gdnative.godot_get_class_constructor
import kotlinx.cinterop.*
import godot.core.CoreType
import godot.core.Variant
import godot.registration.nativeConstructorInvocationFlag
import godot.registration.nonNativeConstructorRawMemory


abstract class GodotObject : CoreType {
    private var godotCoreMemory: COpaquePointer? = null


    internal constructor(mem: COpaquePointer) {
        godotCoreMemory = mem.reinterpret<COpaquePointerVar>().pointed.value
    }
    internal constructor(variant: Variant) {
        godot.fromVariant(this, variant)
    }
    internal constructor(name: String) {
        if (nativeConstructorInvocationFlag) {
            if (name != "") {
                godot_get_class_constructor(name)?.let {
                    godotCoreMemory = it.reinterpret<CFunction<() -> COpaquePointer>>()()
                    // TODO: put destructor somewhere
                } ?: throw NotImplementedError("There is no constructor for class $name in GD")
            }
        } else {
            nativeConstructorInvocationFlag = true
            godotCoreMemory = nonNativeConstructorRawMemory!!
        }
    }


    override fun isNull(): Boolean = godotCoreMemory == null


    internal val rawMemory: COpaquePointer
        get() = godotCoreMemory ?: throw NullPointerException("Attempt to use null object: $this")


    final override fun getRawMemory(memScope: MemScope): COpaquePointer = rawMemory
    final override fun setRawMemory(mem: COpaquePointer) {
        godotCoreMemory = mem
    }
}