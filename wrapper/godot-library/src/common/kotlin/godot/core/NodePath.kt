@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core


expect class NodePath {
    constructor()
    constructor(other: String)
    constructor(other: NodePath)

    fun getName(idx: Int): String

    fun getNameCount(): Int

    fun getSubname(idx: Int): String

    fun getSubnameCount(): Int

    fun isAbsolute() : Boolean

    fun isEmpty(): Boolean

    fun getAsPropertyPath(): NodePath

    fun getConcatenatedSubnames(): String

}
