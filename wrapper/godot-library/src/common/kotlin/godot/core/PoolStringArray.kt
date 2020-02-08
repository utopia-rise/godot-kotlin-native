@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

expect class PoolStringArray {
    constructor()
    constructor(other: PoolStringArray)
    constructor(other: GDArray)

    fun append(data: String)
    fun appendArray(data: GDArray)
    fun insert(idx: Int, data: String)
    fun invert()
    fun pushBack(data: String)
    fun remove(idx: Int)
    fun resize(size: Int)
    fun set(idx: Int, data: String)
    operator fun get(idx: Int): String
    fun size(): Int
}
