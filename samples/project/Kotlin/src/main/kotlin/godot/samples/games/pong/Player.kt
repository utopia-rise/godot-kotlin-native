package godot.samples.games.pong

import godot.*
import godot.core.*

class Player: KinematicBody2D() {

    var speed = 400

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