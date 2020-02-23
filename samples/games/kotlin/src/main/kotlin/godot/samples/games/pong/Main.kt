package godot.samples.games.pong

import godot.InputEvent
import godot.KinematicBody2D
import godot.Label
import godot.Node
import godot.core.NodePath
import godot.core.Variant
import godot.core.Vector2
import org.godotengine.kotlin.annotation.*
import godot.registration.PropertyHint
import godot.registration.RPCMode
import kotlin.reflect.KClass

@RegisterClass("Games/Pong/Scripts")
class Main : Node() {

    lateinit var ball: KinematicBody2D
    lateinit var ballStartPos: Vector2
    lateinit var ballStartVel: Vector2

    var yourScore = 0
    var enemyScore = 0

    @RegisterFunction
    override fun _ready() {
        ball = KinematicBody2D from getNode(NodePath("Ball"))
        ballStartPos = ball.getPosition()
        ballStartVel = Vector2(ball.get("xVel").toDouble(), ball.get("yVel").toDouble())
        startGame()
    }

    @RegisterFunction
    fun startGame() {
        ball.position = ballStartPos
        ball.set("xVel", Variant(ballStartVel.x))
        ball.set("yVel", Variant(ballStartVel.y))
        val yourScoreLabel = Label from getNode(NodePath("YourScore"))
        val enemyScoreLabel = Label from getNode(NodePath("EnemyScore"))
        yourScoreLabel.setText("YOU:\n$yourScore")
        enemyScoreLabel.setText("ENEMY:\n$enemyScore")
    }

    @RegisterFunction
    fun _on_VisibilityNotifier2D_screen_exited() {
        if (ball.position.y < 0)
            yourScore += 1
        else
            enemyScore += 1
        startGame()
    }

    @RegisterFunction
    override fun _unhandled_input(event: InputEvent) {
        if (event.isActionPressed("ui_cancel")) {
            getTree().changeScene("res://Games/Main/Scenes/ChooseGameScreen.tscn")
        }
    }
}