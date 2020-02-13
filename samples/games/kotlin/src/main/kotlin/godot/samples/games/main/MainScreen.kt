package godot.samples.games.main

import godot.core.*
import godot.*

class MainScreen: Node() {

    lateinit var chooseGameButton: Button
    lateinit var quitButton: Button

    override fun _ready() {
        chooseGameButton = (Button from getNode(NodePath("MenuButtons/ChooseGameButton"))).apply {
            connect("pressed", this@MainScreen, "_onChooseGameButtonPressed")
        }
        quitButton = (Button from getNode(NodePath("MenuButtons/QuitButton"))).apply {
            connect("pressed", this@MainScreen, "_onQuitButtonPressed")
        }
    }

    fun _onChooseGameButtonPressed() {
        getTree().changeScene("res://Games/Main/Scenes/ChooseGameScreen.tscn")
    }

    fun _onQuitButtonPressed() {
        getTree().quit()
    }

}