@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

expect class PoolIntArray {
    constructor()
    constructor(other: PoolIntArray)
    constructor(other: GDArray)


    fun append(data: Int)
    fun appendArray(data: PoolIntArray)
    fun insert(idx: Int, data: Int)
    fun invert()
    fun pushBack(data: Int)
    fun remove(idx: Int)
    fun resize(size: Int)
    fun set(idx: Int, data: Int)
    operator fun get(idx: Int): Int
    fun size(): Int
}
