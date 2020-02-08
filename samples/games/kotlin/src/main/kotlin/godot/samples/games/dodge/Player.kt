package godot.samples.games.dodge

import godot.*
import godot.core.*

//TODO: CollisionShape
class Player : Area2D() {

    var speed: Int = 400
    lateinit var screensize: Vector2

    lateinit var playerSprite: AnimatedSprite
    lateinit var collisionShape: CollisionShape2D

    override fun _ready() {
        addUserSignal("hit")
        playerSprite = AnimatedSprite from getNode(NodePath("AnimatedSprite"))
        collisionShape = CollisionShape2D from getNode(NodePath("CollisionShape2D"))
        screensize = getViewportRect().size
        hide()

        this.connect("body_entered", this, "_on_Player_body_entered")
        this.connect("hit", getParent(), "gameOver")
    }

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
    fun _on_Player_body_entered(body: Object) {
        hide()
        emitSignal("hit")
        collisionShape.disabled = true
    }

    fun start(pos: Vector2) {
        position = pos
        show()
        collisionShape.disabled = false
    }
}
