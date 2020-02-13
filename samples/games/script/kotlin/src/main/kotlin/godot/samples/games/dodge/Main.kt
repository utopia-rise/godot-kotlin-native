package godot.samples.games.dodge

import godot.*
import godot.core.*
import kotlin.math.PI
import kotlin.random.Random

class Main: Node() {
    lateinit var mobTimer: Timer
    lateinit var scoreTimer: Timer
    lateinit var startTimer: Timer
    lateinit var startPosition: Position2D
    lateinit var mobPath: Path2D
    lateinit var mobSpawnLocation: PathFollow2D
    lateinit var mobScene: PackedScene
    var score = 0

    override fun _ready() {
        mobScene = PackedScene from ResourceLoader.load("res://Games/Dodge/Scenes/Mob.tscn")

        mobTimer = (Timer from getNode(NodePath("MobTimer"))).apply {
            connect("timeout", this@Main, "_onMobTimerTimeout")
        }
        scoreTimer = (Timer from getNode(NodePath("ScoreTimer"))).apply {
            connect("timeout", this@Main, "_onScoreTimerTimeout")
        }
        startTimer = (Timer from getNode(NodePath("StartTimer"))).apply {
            connect("timeout", this@Main, "_onStartTimerTimeout")
        }
        startPosition = Position2D from getNode(NodePath("StartPosition"))
        mobPath = Path2D from getNode(NodePath("MobPath"))
        mobSpawnLocation = PathFollow2D from getNode(NodePath("MobPath/MobSpawnLocation"))

        getNode(NodePath("HUD")).callv("showMenu", GDArray())
    }

    fun gameOver() {
        scoreTimer.stop()
        mobTimer.stop()
        getNode(NodePath("HUD")).callv("showGameOver", GDArray())
    }

    fun newGame() {
        getTree().callGroup("enemies", "free")
        score = 0

        getNode(NodePath("Player")).callv("start", godotArrayOf(startPosition.position))
        startTimer.start()

        getNode(NodePath("HUD")).callv("updateScore", godotArrayOf(score))

        getNode(NodePath("HUD")).callv("showMessage", godotArrayOf("Get ready!"))
    }

    fun _onStartTimerTimeout() {
        mobTimer.start()
        scoreTimer.start()
    }

    fun _onScoreTimerTimeout() {
        score += 1
        getNode(NodePath("HUD")).callv("updateScore", godotArrayOf(score))
    }

    fun _onMobTimerTimeout() {
        mobSpawnLocation.setOffset(Random.nextInt().toDouble())
        val mob = RigidBody2D from mobScene.instance()
        addChild(mob)
        var direction = (mobSpawnLocation.rotation + PI/2)
        mob.position = mobSpawnLocation.position

        fun ClosedRange<Int>.random() =
                Random.nextInt(endInclusive - start) + start
        direction += ((-PI/4 * 100000).toInt()..(PI/4  * 100000).toInt()).random().toDouble() / 100000
        mob.rotation = direction
        mob.setLinearVelocity(Vector2((mob.get("minSpeed").toInt()..mob.get("maxSpeed").toInt()).random(), 0).rotated(direction))
    }

    override fun _unhandled_input(event: InputEvent) {
        if (event.isActionPressed("ui_cancel")) {
            getTree().changeScene("res://Games/Main/Scenes/ChooseGameScreen.tscn")
        }
    }
}