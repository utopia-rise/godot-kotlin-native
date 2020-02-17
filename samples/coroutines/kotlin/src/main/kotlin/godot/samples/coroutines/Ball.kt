package godot.samples.coroutines

import godot.Input
import godot.Node2D
import godot.core.Variant
import godot.core.Vector2


class Ball : Node2D {
    constructor() : super()
    constructor(value: Variant) : super(value)


    var moveSpeed = 2.0

    // This is wired up from the Godot editor to react to our own "move" signal
    fun move(step: Vector2) {
        translate(step)
    }

    override fun _process(delta: Double) {
        val step = Vector2()

        if (Input.isActionPressed("ui_right"))
            step.x += moveSpeed
        if (Input.isActionPressed("ui_left"))
            step.x -= moveSpeed
        if (Input.isActionPressed("ui_up"))
            step.y -= moveSpeed
        if (Input.isActionPressed("ui_down"))
            step.y += moveSpeed

        if (step.x != 0.0 || step.y != 0.0)
            emitSignal("move", step)
    }
}