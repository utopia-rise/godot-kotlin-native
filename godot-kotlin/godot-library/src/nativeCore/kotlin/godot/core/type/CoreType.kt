package godot.core

import kotlinx.cinterop.*


internal interface CoreType {
    fun getRawMemory(memScope: MemScope): COpaquePointer
    fun setRawMemory(mem: COpaquePointer)
}

fun Long.getRawMemory(memScope: MemScope): COpaquePointer {
    return cValuesOf(this).getPointer(memScope)
}

fun Double.getRawMemory(memScope: MemScope): COpaquePointer {
    return cValuesOf(this).getPointer(memScope)
}

fun Boolean.getRawMemory(memScope: MemScope): COpaquePointer {
    return cValuesOf(this.toByte()).getPointer(memScope)
}
