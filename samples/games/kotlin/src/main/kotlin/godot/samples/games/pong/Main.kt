package godot.samples.games.pong

import godot.InputEvent
import godot.KinematicBody2D
import godot.Label
import godot.Node
import godot.core.NodePath
import godot.core.Variant
import godot.core.Vector2
import org.godotengine.kotlin.annotation.*

@RegisterClass
class Main : Node() {

    lateinit var ball: KinematicBody2D
    lateinit var ballStartPos: Vector2
    lateinit var ballStartVel: Vector2

    @Master
    @RegisterProperty(false, "0")
    var yourScore = 0
    var enemyScore = 0

    interface Signals {
        @RegisterSignal
        fun testSignal() {}
        @RegisterSignal("0", "\"foo\"")
        fun testSignalWithArgs(intArg: Int, stringArg: String) {}
    }

    @RegisterFunction
    override fun _ready() {
        ball = KinematicBody2D from getNode(NodePath("Ball"))
        ballStartPos = ball.getPosition()
        ballStartVel = Vector2(ball.get("xVel").toDouble(), ball.get("yVel").toDouble())
        startGame()
    }

    @RegisterFunction(Remote::class)
    fun startGame() {
        ball.position = ballStartPos
        ball.set("xVel", Variant(ballStartVel.x))
        ball.set("yVel", Variant(ballStartVel.y))
        val yourScoreLabel = Label from getNode(NodePath("YourScore"))
        val enemyScoreLabel = Label from getNode(NodePath("EnemyScore"))
        yourScoreLabel.setText("YOU:\n$yourScore")
        enemyScoreLabel.setText("ENEMY:\n$enemyScore")
    }

    fun _on_VisibilityNotifier2D_screen_exited() {
        if (ball.position.y < 0)
            yourScore += 1
        else
            enemyScore += 1
        startGame()
    }

    @Remote
    @RegisterFunction
    fun varargTest(foo: String, bar: Int, vararg params: Int): String {
        return ""
    }

    @RegisterFunction
    override fun _unhandled_input(event: InputEvent) {
        if (event.isActionPressed("ui_cancel")) {
            getTree().changeScene("res://Games/Main/Scenes/ChooseGameScreen.tscn")
        }
    }
}