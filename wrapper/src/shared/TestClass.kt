package simple.user.pack

import kotlin.godot.GodotObject
import kotlin.godot.Object
import kotlin.godot.core.Godot


class TestClass : Object {
    constructor() : super()
    constructor(ignored: String) : super("")


    fun method(i: Int) {
        Godot.print("invoked method: $i")
    }

    fun method(): String {
        Godot.print("invoked method that returns smth")
        return "test result"
    }
}