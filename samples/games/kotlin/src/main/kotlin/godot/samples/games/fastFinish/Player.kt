package godot.samples.games.fastFinish

import godot.*
import godot.core.*
import org.godotengine.kotlin.annotation.RegisterClass
import org.godotengine.kotlin.annotation.RegisterFunction

@RegisterClass
class Player : Area2D() {
    var velocity = 0.0
    var speed = 30.0
    lateinit var path: PathFollow2D
    lateinit var sprite: Sprite

    init {
        setScript(Reference from ResourceLoader.load("res://Games/FastFinish/Scripts/Player.gdns"))
    }

    @RegisterFunction
    override fun _ready() {
        sprite = Sprite().apply {
            texture = Texture from ResourceLoader.load("res://Games/FastFinish/Sprites/Player.png")
        }
        addChild(sprite)
        path = PathFollow2D from getParent()
    }

    @RegisterFunction
    override fun _process(delta: Double) {
        if (Input.isActionJustPressed("ui_select"))
            velocity += 2

        if(velocity > 0) velocity -= 0.15
        else velocity = 0.0

        path.offset += velocity * delta * speed

        if (path.offset > 5100) {
            GD.print("END")
            setProcess(false)
        }
    }
}