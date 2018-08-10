package kotlin.godot.core

import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.MemScope


open class Rect2: CoreType {
    constructor()
    constructor(a: Number, b: Number, c: Number, d: Number)


    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setRawMemory(mem: COpaquePointer) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}