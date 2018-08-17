package simple.user.pack

import godot.godot_method_bind_get_method
import kotlinx.cinterop.*
import kotlin.godot.Node
import kotlin.godot.ResourceLoader
import kotlin.godot.core.Godot
import kotlin.godot.core.Variant
import kotlin.system.getTimeMillis


class TestClass : Node() {
    override fun _ready() {
        setName("Parent")
        Godot.print("Hello from parent!")

        val child = Node()
        child.setScript(ResourceLoader.load("res://godot_wrapper/TestClass2.gdns"))

        addChild(child)
    }
}


class TestClass2 : Node() {
    override fun _ready() {
        setName("Child")
        Godot.print("Hello from child!")
    }
}