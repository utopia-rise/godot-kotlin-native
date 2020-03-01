package godot.samples.games.pong

import godot.core.*
import godot.*
import org.godotengine.kotlin.annotation.RegisterClass
import org.godotengine.kotlin.annotation.RegisterFunction
import org.godotengine.kotlin.annotation.RegisterProperty

@RegisterClass("Games/Pong/Scripts")
class Ball: KinematicBody2D() {

    @RegisterProperty(true)
    var xVel = 300
    @RegisterProperty(true)
    var yVel = 300

    @RegisterProperty(true) //TODO: cedric -> remove!!!
    var testProperty = NodePath("some/node/path")

    lateinit var velocity: Vector2
    lateinit var visibilityNotifier2D: VisibilityNotifier2D

    @RegisterFunction
    override fun _ready() {
        velocity = Vector2(xVel, yVel)
        visibilityNotifier2D = VisibilityNotifier2D from getNode(NodePath("VisibilityNotifier2D"))
        visibilityNotifier2D.connect("screen_exited", getParent(), "_on_VisibilityNotifier2D_screen_exited")
    }

    @RegisterFunction
    override fun _physics_process(delta: Double) {
        val collisionInfo = moveAndCollide(velocity * delta)
        if (!collisionInfo.isNull()) {
            val normal = collisionInfo.normal
            velocity = velocity.bounce(normal)
            GD.print("Velocity: $velocity, normal: $normal")
        }
    }
}