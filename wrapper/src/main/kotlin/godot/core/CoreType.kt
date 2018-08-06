package kotlin.godot.core

import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.MemScope


internal interface CoreType {
    fun godotPointer(memScope: MemScope): COpaquePointer
}