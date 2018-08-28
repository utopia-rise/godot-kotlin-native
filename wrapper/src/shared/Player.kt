package dodge

import godot.*
import godot.core.GodotArray
import godot.core.Rect2
import godot.core.Vector2

//TODO: CollisionShape
class Player() : Area2D() {

    var speed: Float = 400f
    lateinit var screensize: Vector2

    val playerSprite = PlayerSprite()
    val collisionShape = PlayerCollisionShape()

    override fun _ready() {
        addUserSignal("hit")
        this.addChild(playerSprite)
        this.addChild(collisionShape)
        screensize = getViewportRect().size
        hide()
    }

    override fun _process(delta: Float) {
        var velocity = Vector2()
        if (Input.isActionPressed("ui_right"))
            velocity.x += 1
        if (Input.isActionPressed("ui_left"))
            velocity.x -= 1
        if (Input.isActionPressed("ui_up"))
            velocity.y -= 1
        if (Input.isActionPressed("ui_down"))
            velocity.y += 1
        if (velocity.length() != 0f) {
            velocity = velocity.normalized() * speed
            playerSprite.play()
        }
        else
            playerSprite.stop()

        position += velocity * delta
        if (position.x < 0) position.x = 0f
        else if (position.x > screensize.x) position.x = screensize.x
        if (position.y < 0) position.y = 0f
        else if (position.y > screensize.y) position.y = screensize.y

        if (velocity.x != 0f) {
            playerSprite.setAnimation("right")
            playerSprite.flipV = false
            playerSprite.flipH = velocity.x < 0
        }
        else if (velocity.y != 0f) {
            playerSprite.setAnimation("up")
            playerSprite.flipH = false
            playerSprite.flipV = velocity.y > 0
        }
        this.connect("body_entered", this, "_on_Player_body_entered")
        this.connect("hit", getParent(), "game_over")
    }

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