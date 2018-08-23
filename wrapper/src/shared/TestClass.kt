package simple.user.pack

import godot.*
import godot.core.*


class TestClass : Node() {
    val child = Node()

    lateinit var childScript: Script


    init {
        connect("test", this, "_on_test")
    }

    override fun _ready() {
        name = "Parent"
        Godot.print("Hello from parent!")

        child.setScript(childScript)
        addChild(child)
    }

    fun _on_test() {
        Godot.print("\"test\" emitted!")
    }
}


class TestClass2 : Node() {
    override fun _ready() {
        name = "Child"
        Godot.print("Hello from child!")

        getParent().emitSignal("test")
    }
}