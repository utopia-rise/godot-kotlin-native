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
        mobScene = PackedScene from ResourceLoader.load("res://Games/dodge/Scenes/Mob.tscn")

        mobTimer = Timer from getNode(NodePath("MobTimer"))
        scoreTimer = Timer from getNode(NodePath("ScoreTimer"))
        startTimer = Timer from getNode(NodePath("StartTimer"))
        startPosition = Position2D from getNode(NodePath("StartPosition"))
        mobPath = Path2D from getNode(NodePath("MobPath"))
        mobSpawnLocation = PathFollow2D from getNode(NodePath("MobPath/MobSpawnLocation"))


        startTimer.connect("timeout", this, "_onStartTimerTimeout")
        scoreTimer.connect("timeout", this, "_onScoreTimerTimeout")
        mobTimer.connect("timeout", this, "_onMobTimerTimeout")

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

        val arr = GDArray()
        arr.pushBack(Variant(startPosition.position))
        getNode(NodePath("Player")).callv("start", arr)
        startTimer.start()
        arr.popBack()

        arr.pushBack(Variant(score))
        getNode(NodePath("HUD")).callv("updateScore", arr)
        arr.popBack()

        arr.pushBack(Variant("Get ready!"))
        getNode(NodePath("HUD")).callv("showMessage", arr)
    }

    fun _onStartTimerTimeout() {
        mobTimer.start()
        scoreTimer.start()
    }

    fun _onScoreTimerTimeout() {
        score += 1
        val arr = GDArray()
        arr.pushBack(Variant(score))
        getNode(NodePath("HUD")).callv("updateScore", arr)
    }

    fun _onMobTimerTimeout() {
        mobSpawnLocation.setOffset(Random.nextInt().toDouble())
        val mob = RigidBody2D from mobScene.instance()
        addChild(mob)
        var direction = (mobSpawnLocation.rotation.toDouble() + PI/2).toDouble()
        mob.position = mobSpawnLocation.position

        fun ClosedRange<Int>.random() =
                Random.nextInt(endInclusive - start) + start
        direction += ((-PI/4 * 100000).toInt()..(PI/4  * 100000).toInt()).random().toDouble() / 100000
        mob.rotation = direction
        mob.setLinearVelocity(Vector2((mob.get("minSpeed").toInt()..mob.get("maxSpeed").toInt()).random(), 0).rotated(direction))
    }
}