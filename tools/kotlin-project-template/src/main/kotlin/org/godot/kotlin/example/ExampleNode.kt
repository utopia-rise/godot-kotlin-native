package org.godot.kotlin.example

import godot.Node
import godot.core.GD
import org.godotengine.kotlin.annotation.RegisterClass
import org.godotengine.kotlin.annotation.RegisterFunction


@RegisterClass
class ExampleNode : Node {
    constructor() : super()

    @RegisterFunction
    override fun _ready() {
        GD.print("Hello Godot!")
    }
}