package kotlin.godot.core

import kotlinx.cinterop.*


internal interface CoreType {
    fun getRawMemory(memScope: MemScope): COpaquePointer
    fun setRawMemory(mem: COpaquePointer)
}


fun Int.getRawMemory(memScope: MemScope): COpaquePointer {
    return cValuesOf(this.toLong()).getPointer(memScope)
}
fun Float.getRawMemory(memScope: MemScope): COpaquePointer {
    return cValuesOf(this.toDouble()).getPointer(memScope)
}
fun Boolean.getRawMemory(memScope: MemScope): COpaquePointer {
    return cValuesOf(this.toByte()).getPointer(memScope)
}