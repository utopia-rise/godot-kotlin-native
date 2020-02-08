@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

expect class PoolColorArray {
    constructor()
    constructor(other: PoolColorArray)
    constructor(other: GDArray)


    fun append(data: Color)
    fun appendArray(data: PoolColorArray)
    fun insert(idx: Int, data: Color)
    fun invert()
    fun pushBack(data: Color)
    fun remove(idx: Int)
    fun resize(size: Int)
    fun set(idx: Int, data: Color)

    operator fun get(idx: Int): Color

    fun size(): Int
}
