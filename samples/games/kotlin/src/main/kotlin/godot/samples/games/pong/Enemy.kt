package godot.samples.games.pong

import godot.*
import godot.core.*
import org.godotengine.kotlin.annotation.RegisterClass
import org.godotengine.kotlin.annotation.RegisterFunction
import org.godotengine.kotlin.annotation.RegisterProperty

@RegisterClass("Games/Pong/Scripts")
class Enemy: KinematicBody2D() {

    @RegisterProperty(true)
    var speed = 400

    @RegisterFunction
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