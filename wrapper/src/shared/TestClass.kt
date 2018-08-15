package simple.user.pack

import kotlin.godot.Node
import kotlin.godot.core.Godot


class TestClass : Node() {
    override fun _ready() {
        Godot.print("I AM ALIVE")
    }
}