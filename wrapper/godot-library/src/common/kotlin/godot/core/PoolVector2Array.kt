@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

expect class PoolVector2Array {
    constructor()
    constructor(other: PoolVector2Array)
    constructor(other: GDArray)

    fun append(data: Vector2)
    fun appendArray(data: PoolVector2Array)
    fun insert(idx: Int, data: Vector2)
    fun invert()
    fun pushBack(data: Vector2)
    fun remove(idx: Int)
    fun resize(size: Int)
    fun set(idx: Int, data: Vector2)
    operator fun get(idx: Int): Vector2
    fun size(): Int
}
