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
        GD.print("Hello from parent!")

        child.setScript(childScript)
        addChild(child)
    }

    fun _on_test(arr: GDArray) {
        GD.print("\"test\" emitted!")

        for ((i,arg) in arr.withIndex())
            GD.print("$i: $arg")
    }
}


class TestClass2 : Node() {
    override fun _ready() {
        name = "Child"
        GD.print("Hello from child!")

        val arr = godotArrayOf(1, "Sanya", Color(1, 0, 0))
        getParent().emitSignal("test", arr)
    }
}