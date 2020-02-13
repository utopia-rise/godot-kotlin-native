package godot.samples.games.pong

import godot.*
import godot.core.*

class Enemy: KinematicBody2D() {

    var speed = 400

    override fun _physics_process(delta: Double) {
        var velocity = Vector2()
        val ball = KinematicBody2D from getParent().getNode(NodePath("Ball"))
        val ballPos = ball.getPosition()


        if (ballPos.x > this.position.x)
            velocity.x += 1.0
        else
            velocity.x -= 1.0

        if (velocity.length() > 0) {
            velocity *= speed.toDouble()
            moveAndCollide(velocity * delta)
            position.y = 12.263565.toDouble()
        }
    }

}