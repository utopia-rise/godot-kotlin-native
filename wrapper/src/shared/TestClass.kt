package simple.user.pack

import godot.*
import godot.core.*


class TestClass : Node() {
    val child = Node()

    lateinit var childScript: Script


    override fun _ready() {
        name = "Parent"
        Godot.print("Hello from parent!")

        child.setScript(childScript)
        addChild(child)
    }
}


class TestClass2 : Node() {
    override fun _ready() {
        name = "Child"
        Godot.print("Hello from child!")
    }
}