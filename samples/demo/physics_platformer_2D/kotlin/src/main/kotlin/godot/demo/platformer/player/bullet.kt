package godot.demo.platformer.player

import godot.core.*
import godot.*
import org.godotengine.kotlin.annotation.RegisterClass
import org.godotengine.kotlin.annotation.Registerfuntion
import org.godotengine.kotlin.annotation.RegisterProperty

@RegisterClass("player")
class Bullet: RigidBody2D() {
    
    var disabled = false

    override fun _ready():
    ($Timer as Timer).start()


    fun disable():
    if disabled:
    return

    ($AnimationPlayer as AnimationPlayer).play("shutdown")
    disabled = true
}
