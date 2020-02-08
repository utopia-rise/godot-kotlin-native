@file:Suppress("unused", "MemberVisibilityCanBePrivate")
package godot.core

import godot.Object

expect class RID {
    constructor()
    constructor(other: Object)

    fun getID(): Int
}
