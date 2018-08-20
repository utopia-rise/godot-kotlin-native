package simple.user.pack

import kotlinx.cinterop.*
import kotlin.godot.*
import kotlin.godot.core.*


class TestClass : Node() {
    override fun _ready() {
        setName("Parent")
        Godot.print("Hello from parent!")


        val res = ResourceLoader.load("res://godot_wrapper/TestClass2.gdns")
        Godot.print("Loaded: ${res.getPath()}")
        val script = Script from res
        Godot.print("Script: ${script.getSourceCode()}")

        /*val child = Node()
        child.setScript(ResourceLoader.load("res://godot_wrapper/TestClass2.gdns"))
        addChild(child)*/
    }
}


class TestClass2 : Node() {
    override fun _ready() {
        setName("Child")
        Godot.print("Hello from child!")
    }
}