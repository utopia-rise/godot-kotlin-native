package godot.samples.games.dodge

import godot.*
import godot.core.GDArray
import platform.posix.rand
import godot.core.NodePath

class Mob: RigidBody2D() {
    var minSpeed = 150
    var maxSpeed = 250
    val animationList = arrayOf("fly", "walk", "swim")

    lateinit var animatedSprite: AnimatedSprite
    lateinit var visibilityNotifier2D: VisibilityNotifier2D

    override fun _ready() {
        animatedSprite = AnimatedSprite from getNode(NodePath("AnimatedSprite"))
        visibilityNotifier2D = VisibilityNotifier2D from getNode(NodePath("VisibilityNotifier"))

        visibilityNotifier2D.connect("screen_exited", this, "_on_VisibilityNotifier2D_screen_exited")
        animatedSprite.setAnimation(animationList[rand() % animationList.size])
        animatedSprite.play()
    }

    fun _on_VisibilityNotifier2D_screen_exited() {
        queueFree()
    }
}