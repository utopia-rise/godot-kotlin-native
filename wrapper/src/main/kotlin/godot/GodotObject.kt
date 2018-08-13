package kotlin.godot

import godot.godot_get_class_constructor
import kotlinx.cinterop.*
import kotlin.godot.core.CoreType


abstract class GodotObject : CoreType {
    private lateinit var rawMemory: COpaquePointer


    internal constructor(mem: COpaquePointer) {
        rawMemory = mem
    }
    constructor(name: String) {
        if (name != "") {
            godot_get_class_constructor(name)?.let {
                rawMemory = it.reinterpret<CFunction<() -> COpaquePointer>>()()
            }
        }
    }


    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return rawMemory
    }
    override fun setRawMemory(mem: COpaquePointer) {
        rawMemory = mem
    }
}