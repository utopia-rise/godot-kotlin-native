@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

expect class PoolRealArray {

    constructor()
    constructor(other: PoolRealArray)
    constructor(other: GDArray)

    fun append(data: Double)
    fun appendArray(data: PoolRealArray)
    fun insert(idx: Int, data: Double)
    fun invert()
    fun pushBack(data: Double)
    fun remove(idx: Int)
    fun resize(size: Int)
    fun set(idx: Int, data: Double)
    operator fun get(idx: Int): Double
    fun size(): Int
}
