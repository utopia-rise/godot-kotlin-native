package godot.samples.games.fastFinish

import godot.*
import godot.core.*

class Player: Area2D {
    var velocity = 0
    var speed = 15
    lateinit var path: PathFollow2D
    lateinit var sprite: Sprite

    constructor(): super() {
        setScript(Reference from ResourceLoader.load("res://Games/FastFinish/Scripts/Player.gdns"))
    }

    override fun _ready() {
        sprite = Sprite()
        sprite.texture = Texture from ResourceLoader.load("res://Games/FastFinish/Sprites/Player.png")
        addChild(sprite)
        path = PathFollow2D from getParent()
    }

    override fun _process(delta: Double) {
        if (Input.isActionJustPressed("ui_select"))
            velocity += 1
        path.offset += velocity.toDouble() * delta.toDouble() * speed.toDouble()
        if (path.offset > 5100) {
            GD.print("END")
            setProcess(false)
        }
    }
}