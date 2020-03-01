package godot.demo.platformer.coin

import godot.core.*
import godot.*
import org.godotengine.kotlin.annotation.RegisterClass
import org.godotengine.kotlin.annotation.RegisterFunction
import org.godotengine.kotlin.annotation.RegisterProperty

@RegisterClass("coin")
class Coin: Area2D() {

    @RegisterProperty(false, "false")
    var taken = false

    @RegisterFunction
    override fun _ready() {
        connect("body_entered", this, "onBodyEnter")
    }

    @RegisterFunction
    fun onBodyEnter(body: Node){
        if (!taken && body.isClass("Player")){
            (AnimationPlayer from getNode(NodePath("AnimationPlayer"))).play("taken")
        }

    }
}