package kotlin.godot

import godot.godot_get_class_constructor
import kotlinx.cinterop.*
import kotlin.godot.core.CoreType
import kotlin.godot.core.Godot


abstract class GodotObject : CoreType {
    internal lateinit var rawMemory: COpaquePointer


    internal constructor(mem: COpaquePointer) {
        rawMemory = mem.reinterpret<COpaquePointerVar>().pointed.value!!
    }
    constructor(name: String) {
        if (name != "" && ___godot_wrapper_nativeConstructorInvocation) {
            godot_get_class_constructor(name)?.let {
                rawMemory = it.reinterpret<CFunction<() -> COpaquePointer>>()()
                //globalObjectPool.add(rawMemory.toLong(), this) // TODO: put destructor somewhere
            }
        }
    }


    final override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return rawMemory
    }
    final override fun setRawMemory(mem: COpaquePointer) {
        rawMemory = mem
    }
}


internal var ___godot_wrapper_nativeConstructorInvocation: Boolean = true