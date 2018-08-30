package godot.samples.games.fastFinish

import godot.*
import godot.core.*

class Stage: Node() {
    lateinit var path: Path2D
    lateinit var player: Player
    lateinit var background: Sprite

    override fun _ready() {
        background = Sprite()
        background.texture = Texture from ResourceLoader.load("res://Games/FastFinish/Sprites/Background.png")
        background.position = Vector2(968, 537)
        addChild(background)
        path = Path2D from (PackedScene from ResourceLoader.load("res://Games/FastFinish/Scenes/PlayerPath.tscn")).instance()
        player = Player()
        path.getNode(NodePath("PathFollow2D")).addChild(player)
        addChild(path)
    }
}