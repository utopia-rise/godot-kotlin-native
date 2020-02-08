@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import godot.Object


expect class GDArray { // FIXME: .copy
    constructor(size: Int = 0, init: (Int) -> Variant = { Variant() })
    constructor(other: GDArray)
    constructor(other: Array<*>)

    constructor(other: PoolByteArray)
    constructor(other: PoolIntArray)
    constructor(other: PoolRealArray)
    constructor(other: PoolColorArray)
    constructor(other: PoolVector2Array)
    constructor(other: PoolVector3Array)
    constructor(other: PoolStringArray)


    fun toKotlinArray(): Array<Variant>

    operator fun iterator(): Iterator<Variant>

    fun withIndex(): Iterator<Pair<Int,Variant>>

    val indices: Iterator<Int>

    fun clear()

    fun isEmpty(): Boolean

    fun invert()

    fun remove(idx: Int)

    fun size(): Int

    fun resize(size: Int)

    fun sort()

    operator fun get(idx: Int): Variant?

    fun append(v: Variant)

    fun count(v: Variant): Int

    fun erase(v: Variant)

    fun front(): Variant

    fun back(): Variant

    fun find(v: Variant, from: Int): Int

    fun findLast(v: Variant): Int

    fun has(v: Variant): Boolean

    fun insert(pos: Int, v : Variant)

    fun popBack(): Variant

    fun pushBack(v : Variant)

    fun popFront(): Variant

    fun pushFront(v : Variant)

    fun rfind(v: Variant, from: Int): Int

    fun sortCustom(obj: Object, func: String)

    fun bsearch(value: Variant, before: Boolean): Int

    fun bsearchCustom(value: Variant, obj: Object, func: String, before: Boolean): Int

    fun duplicate(deep: Boolean): GDArray

    fun max(): Variant

    fun min(): Variant

    fun shuffle()
}

fun Array<*>.toGDArray(): GDArray = GDArray(this)

fun godotArrayOf(vararg params: Any?): GDArray = GDArray(params)
