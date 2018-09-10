package godot.samples.games.pong

import godot.core.*
import godot.*

class Ball: KinematicBody2D() {

    var xVel = 300
    var yVel = 300
    lateinit var velocity: Vector2
    lateinit var visibilityNotifier2D: VisibilityNotifier2D

    override fun _ready() {
        velocity = Vector2(xVel, yVel)
        visibilityNotifier2D = VisibilityNotifier2D from getNode(NodePath("VisibilityNotifier2D"))
        visibilityNotifier2D.connect("screen_exited", getParent(), "_on_VisibilityNotifier2D_screen_exited")
    }

    override fun _physics_process(delta: Double) {
        val collisionInfo = moveAndCollide(velocity * delta)
        if (!collisionInfo.isNull()) {
            val normal = collisionInfo.normal
            velocity = velocity.bounce(normal)
            GD.print("Velocity: $velocity, normal: $normal")
        }
    }
}