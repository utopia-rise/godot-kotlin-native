package godot.samples.games.pong

import godot.*
import godot.core.*
import org.godotengine.kotlin.annotation.RegisterClass
import org.godotengine.kotlin.annotation.RegisterFunction
import org.godotengine.kotlin.annotation.RegisterProperty

@RegisterClass
class Player: KinematicBody2D() {

    @RegisterProperty(true, "400")
    var speed = 400

    @RegisterFunction
    override fun _physics_process(delta: Double) {

        var velocity = Vector2()

        if (Input.isActionPressed("ui_right"))
            velocity.x += 1.0
        if (Input.isActionPressed("ui_left"))
            velocity.x -= 1.0

        if (velocity.length() > 0) {
            velocity *= speed.toDouble()
            moveAndCollide(velocity * delta)
            position.y = 1057.388062.toDouble()
        }
    }
}