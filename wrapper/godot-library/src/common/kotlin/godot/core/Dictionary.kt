@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core


expect class Dictionary {
    constructor()
    constructor(other: Dictionary)


    fun clear()
    fun isEmpty(): Boolean

    fun size(): Int

    fun toJson(): String

    fun hasAll(keys: GDArray): Boolean

    fun keys(): GDArray

    fun values(): GDArray

    fun erase(key: Variant)

    fun has(key: Variant): Boolean

    fun get(key: Variant): Variant?
}
