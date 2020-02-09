package godot.samples.games.main

import godot.core.*
import godot.*
import org.godotengine.kotlin.annotation.RegisterClass
import org.godotengine.kotlin.annotation.RegisterFunction

@RegisterClass
class MainScreen: Node() {

    lateinit var chooseGameButton: Button
    lateinit var quitButton: Button

    @RegisterFunction
    override fun _ready() {
        chooseGameButton = (Button from getNode(NodePath("MenuButtons/ChooseGameButton"))).apply {
            connect("pressed", this@MainScreen, "_onChooseGameButtonPressed")
        }
        quitButton = (Button from getNode(NodePath("MenuButtons/QuitButton"))).apply {
            connect("pressed", this@MainScreen, "_onQuitButtonPressed")
        }
    }

    @RegisterFunction
    fun _onChooseGameButtonPressed() {
        getTree().changeScene("res://Games/Main/Scenes/ChooseGameScreen.tscn")
    }

    @RegisterFunction
    fun _onQuitButtonPressed() {
        getTree().quit()
    }

}