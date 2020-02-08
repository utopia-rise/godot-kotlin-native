@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

expect class PoolByteArray {
    constructor()
    constructor(other: PoolByteArray)
    constructor(other: GDArray)


    fun append(data: UByte)
    fun appendArray(data: PoolByteArray)
    fun insert(idx: Int, data: UByte)
    fun invert()
    fun pushBack(data: UByte)
    fun remove(idx: Int)
    fun resize(size: Int)
    fun set(idx: Int, data: UByte)
    operator fun get(idx: Int): UByte
    fun size(): Int
}
