package godot.demo.platformer.platform

import godot.core.*
import godot.*
import org.godotengine.kotlin.annotation.RegisterClass
import org.godotengine.kotlin.annotation.RegisterFunction
import org.godotengine.kotlin.annotation.RegisterProperty

@RegisterClass("coin")
class MovingPlatform: Node2D() {

    @RegisterProperty(true, "Vector2()")
    var motion = Vector2()
    @RegisterProperty(true, "1.0")
    var cycle = 1.0

    var accum = 0.0

    override fun _physics_process(delta: Double){
        accum += delta * (1.0 / cycle) * TAU
        accum = fmod(accum, TAU)

        val d = sin(accum)
        val xf = Transform2D()

        xf[2]= motion * d

        (RigidBody2D from getNode(NodePath("Platform"))){
            transform = xf
        }
    }

}
