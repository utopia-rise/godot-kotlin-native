@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

expect class PoolVector3Array {
    constructor()
    constructor(other: PoolVector3Array)
    constructor(other: GDArray)

    fun append(data: Vector3)
    fun appendArray(data: PoolVector3Array)
    fun insert(idx: Int, data: Vector3)
    fun invert()
    fun pushBack(data: Vector3)
    fun remove(idx: Int)
    fun resize(size: Int)
    fun set(idx: Int, data: Vector3)
    operator fun get(idx: Int): Vector3
    fun size(): Int
}
