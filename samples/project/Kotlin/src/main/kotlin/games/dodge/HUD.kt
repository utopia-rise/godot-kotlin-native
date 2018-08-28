package samples.games.dodge

import godot.*
import godot.core.GDArray
import godot.core.NodePath
import godot.core.Variant

class HUD: CanvasLayer() {

    lateinit var messageLabel: Label
    lateinit var scoreLabel: Label
    lateinit var startButton: Button
    lateinit var messageTimer: Timer
    lateinit var waitingTimer: Timer
    lateinit var gameOverTimer: Timer

    override fun _ready() {
        messageLabel = Label from getNode(NodePath("MessageLabel"))
        scoreLabel = Label from getNode(NodePath("ScoreLabel"))
        startButton = Button from getNode(NodePath("StartButton"))
        messageTimer = Timer from getNode(NodePath("MessageTimer"))
        waitingTimer = Timer from getNode(NodePath("WaitingTimer"))
        gameOverTimer = Timer from getNode(NodePath("GameOverTimer"))

        addUserSignal("startGame")
        connect("startGame", getParent(), "newGame")

        startButton.connect("pressed", this, "_onStartButtonPressed")
        messageTimer.connect("timeout", this, "_onMessageTimerTimeout")
        gameOverTimer.connect("timeout", this, "_onGameOverTimerTimeout")
    }

    fun showMessage(text: String) {
        messageLabel.text = text
        messageLabel.show()
        messageTimer.start()
    }

    fun showMenu() {
        startButton.text = "Start"
        startButton.show()
        messageLabel.text = "Dodge the\nCreeps!"
        messageLabel.show()
    }

    fun showGameOver() {
        messageLabel.text = "Game over!"
        messageLabel.show()
        gameOverTimer.start()
    }

    fun updateScore(score: Int) {
        scoreLabel.text = score.toString()
    }

    fun _onMessageTimerTimeout() {
        messageLabel.hide()
    }


    fun _onGameOverTimerTimeout() {
        messageLabel.hide()
        showMenu()
    }

    fun _onStartButtonPressed() {
        startButton.hide()
        emitSignal("startGame")
    }




}