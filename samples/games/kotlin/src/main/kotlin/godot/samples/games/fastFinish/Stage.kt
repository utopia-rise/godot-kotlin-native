package godot.samples.games.fastFinish

import godot.*
import godot.core.*
import org.godotengine.kotlin.annotation.RegisterClass
import org.godotengine.kotlin.annotation.RegisterFunction

@RegisterClass("Games/FastFinish/Scripts")
class Stage: Node() {
    lateinit var path: Path2D
    lateinit var player: Player
    lateinit var background: Sprite

    @RegisterFunction
    override fun _ready() {
        background = Sprite().apply {
            texture = Texture from ResourceLoader.load("res://Games/FastFinish/Sprites/Background.png")
            position = Vector2(968, 537)
        }
        addChild(background)
        path = Path2D from (PackedScene from ResourceLoader.load("res://Games/FastFinish/Scenes/PlayerPath.tscn")).instance()
        player = Player()
        path.getNode(NodePath("PathFollow2D")).addChild(player)
        addChild(path)
    }

    @RegisterFunction
    override fun _unhandled_input(event: InputEvent) {
        if (event.isActionPressed("ui_cancel")) {
            getTree().changeScene("res://Games/Main/Scenes/ChooseGameScreen.tscn")
        }
    }
}