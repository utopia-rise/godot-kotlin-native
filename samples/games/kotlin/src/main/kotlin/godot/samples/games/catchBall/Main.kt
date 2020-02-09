package godot.samples.games.catchBall

import godot.*
import org.godotengine.kotlin.annotation.RegisterClass
import org.godotengine.kotlin.annotation.RegisterFunction

@RegisterClass
class Main: Node() {

    @RegisterFunction
    override fun _unhandled_input(event: InputEvent) {
        if (event.isActionPressed("ui_cancel")) {
            getTree().changeScene("res://Games/Main/Scenes/ChooseGameScreen.tscn")
        }
    }
}