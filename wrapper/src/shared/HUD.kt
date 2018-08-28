import godot.*
import godot.Control.Companion.PRESET_CENTER
import godot.Control.Companion.PRESET_CENTER_BOTTOM
import godot.Control.Companion.PRESET_CENTER_TOP
import godot.core.Vector2
import kotlin.coroutines.experimental.*

class HUD: CanvasLayer() {

    var scoreLabel = Label()
    var messageLabel = Label()
    var startButton = Button()
    var messageTimer = Timer()
    var gameOverTimer = Timer()

    override fun _ready() {
        connect("start_game", getParent(), "newGame")

        val font = DynamicFont("res://fonts/Xolonium-Regular.ttf")
        font.size = 64

        addUserSignal("start_game")

        addChild(scoreLabel)
        scoreLabel.setAnchorsPreset(PRESET_CENTER_TOP)
        scoreLabel.setBegin(Vector2(-25, 0))
        scoreLabel.setEnd(Vector2(25, 100))
        scoreLabel.text = "0"
        scoreLabel.addFontOverride("Xolonium-Regular", font)

        addChild(messageLabel)
        messageLabel.setAnchorsPreset(PRESET_CENTER)
        messageLabel.setBegin(Vector2(-200, -150))
        messageLabel.setEnd(Vector2(200,0))
        messageLabel.text = "Dodge the\nCreeps!"
        messageLabel.addFontOverride("Xolonium-Regular", font)

        addChild(startButton)
        startButton.setAnchorsPreset(PRESET_CENTER_BOTTOM)
        startButton.setBegin(Vector2(-100, -200))
        startButton.setEnd(Vector2(100,-100))
        startButton.text = "Start"
        startButton.addFontOverride("Xolonium-Regular", font)
        startButton.connect("pressed", this, "_onStartButtonPressed")


        addChild(messageTimer)
        messageTimer.waitTime = 2f
        messageTimer.oneShot = true
        messageTimer.connect("timeout", this, "_onMessageTimerTimeout")

        addChild(gameOverTimer)
        gameOverTimer.waitTime = 2f
        gameOverTimer.oneShot = true
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
        emitSignal("start_game")
    }




}