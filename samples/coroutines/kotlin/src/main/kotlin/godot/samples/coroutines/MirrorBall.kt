package godot.samples.coroutines

import godot.Node2D
import godot.core.*


class MirrorBall : Node2D {
    constructor() : super()
    constructor(value: Variant) : super(value)


    lateinit var ballPath: NodePath
    lateinit var center: Vector2


    private lateinit var ball: Node2D

    override fun _ready() {
        ball = Node2D from getNode(ballPath)
        follow()
    }

    private fun follow() = GD.yielding<Unit>(this) {
        while (true) {
            yield(ball, "move")
            position = center + (center - ball.position)
        }
    }
}