package godot.samples.games.dodge

import godot.*
import godot.core.NodePath
import godot.core.Vector2
import org.godotengine.kotlin.annotation.RegisterClass
import org.godotengine.kotlin.annotation.RegisterFunction
import org.godotengine.kotlin.annotation.RegisterProperty
import org.godotengine.kotlin.annotation.RegisterSignal

//TODO: CollisionShape
@RegisterClass("Games/Dodge/Scripts")
class Player : Area2D() {

    @RegisterProperty(true)
    var speed: Int = 400
    lateinit var screensize: Vector2

    lateinit var playerSprite: AnimatedSprite
    lateinit var collisionShape: CollisionShape2D

    interface Signal {
        @RegisterSignal
        fun hit() {}
    }

    @RegisterFunction
    override fun _ready() {
        addUserSignal(Signal::hit.name)
        playerSprite = AnimatedSprite from getNode(NodePath("AnimatedSprite"))
        collisionShape = CollisionShape2D from getNode(NodePath("CollisionShape2D"))
        screensize = getViewportRect().size
        hide()

        this.connect("body_entered", this, "_on_Player_body_entered")
        this.connect(Signal::hit.name, getParent(), "gameOver")
    }

    @RegisterFunction
    override fun _process(delta: Double) {
        var velocity = Vector2()

        if (Input.isActionPressed("ui_right"))
            velocity.x += 1
        if (Input.isActionPressed("ui_left"))
            velocity.x -= 1
        if (Input.isActionPressed("ui_up"))
            velocity.y -= 1
        if (Input.isActionPressed("ui_down"))
            velocity.y += 1

        if (velocity.length() != 0.0) {
            velocity = velocity.normalized() * speed.toDouble()
            playerSprite.play()
        } else {
            playerSprite.stop()
        }

        position += velocity * delta

        if (position.x < 0) {
            position {
                x = 0.0
            }
        } else if (position.x > screensize.x) {
            position {
                x = screensize.x
            }
        }

        if (position.y < 0) {
            position {
                y = 0.0
            }
        } else if (position.y > screensize.y) {
            position {
                y = screensize.y
            }
        }

        if (velocity.x != 0.0) {
            playerSprite.setAnimation("right")
            playerSprite.flipV = false
            playerSprite.flipH = velocity.x < 0
        } else if (velocity.y != 0.0) {
            playerSprite.setAnimation("up")
            playerSprite.flipH = false
            playerSprite.flipV = velocity.y > 0
        }
    }

    @Suppress("UNUSED_PARAMETER")
    @RegisterFunction
    fun _on_Player_body_entered(body: Object) {
        hide()
        emitSignal(Signal::hit.name)
        collisionShape.callDeferred("set_disabled", true)
    }

    @RegisterFunction
    fun start(pos: Vector2) {
        position = pos
        show()
        collisionShape.callDeferred("set_disabled", false)
    }
}