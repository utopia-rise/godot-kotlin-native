package godot.samples.games.dodge

import godot.*
import godot.core.GDArray
import platform.posix.rand
import godot.core.NodePath
import org.godotengine.kotlin.annotation.RegisterClass
import org.godotengine.kotlin.annotation.RegisterFunction
import org.godotengine.kotlin.annotation.RegisterProperty

@RegisterClass("Games/Dodge/Scripts")
class Mob: RigidBody2D() {
    @RegisterProperty(true)
    var minSpeed = 150
    @RegisterProperty(true)
    var maxSpeed = 250
    val animationList = arrayOf("fly", "walk", "swim")

    lateinit var animatedSprite: AnimatedSprite
    lateinit var visibilityNotifier2D: VisibilityNotifier2D

    @RegisterFunction
    override fun _ready() {
        addToGroup("enemies")
        animatedSprite = AnimatedSprite from getNode(NodePath("AnimatedSprite"))
        visibilityNotifier2D = VisibilityNotifier2D from getNode(NodePath("VisibilityNotifier"))

        visibilityNotifier2D.connect("screen_exited", this, "_on_VisibilityNotifier2D_screen_exited")
        animatedSprite.setAnimation(animationList[rand() % animationList.size])
        animatedSprite.play()
    }

    @RegisterFunction
    fun _on_VisibilityNotifier2D_screen_exited() {
        queueFree()
    }
}