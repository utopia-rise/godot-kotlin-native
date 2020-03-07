package godot.samples.coroutines

import godot.Input
import godot.Node2D
import godot.core.Variant
import godot.core.Vector2
import org.godotengine.kotlin.annotation.RegisterClass
import org.godotengine.kotlin.annotation.RegisterFunction
import org.godotengine.kotlin.annotation.RegisterSignal


@RegisterClass("Scripts/")
class Ball : Node2D() {

    var moveSpeed = 2.0

    interface Signal {
        @RegisterSignal
        fun move(step: Vector2) {}
    }

    // This is wired up from the Godot editor to react to our own "move" signal
    @RegisterFunction
    fun move(step: Vector2) {
        translate(step)
    }

    @RegisterFunction
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
            emitSignal(Signal::move.name, step)
    }
}