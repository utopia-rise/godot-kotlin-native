package kotlin.godot

import kotlinx.cinterop.COpaquePointer


open class Object : GodotObject {
    constructor() : super("Object")
    internal constructor(mem: COpaquePointer) : super(mem)
    protected constructor(name: String) : super("")

}