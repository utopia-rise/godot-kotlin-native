package godot.samples.coroutines

import godot.Node2D
import godot.core.*
import org.godotengine.kotlin.annotation.RegisterClass
import org.godotengine.kotlin.annotation.RegisterFunction
import org.godotengine.kotlin.annotation.RegisterProperty


@RegisterClass("Scripts/")
class MirrorBall : Node2D() {

    @RegisterProperty(true)
    var ballPath: NodePath = NodePath("../Ball")
    var center = Vector2()


    private lateinit var ball: Node2D

    @RegisterFunction
    override fun _ready() {
        ball = Node2D from getNode(ballPath)
        follow()
    }

    private fun follow() = GD.yielding<Unit>(this) {
        while (true) {
            yield(ball, Ball.Signal::move.name)
            position = center + ball.position
        }
    }
}