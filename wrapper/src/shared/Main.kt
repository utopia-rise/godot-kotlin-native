import dodge.Player
import godot.*
import godot.core.GodotArray
import godot.core.NodePath
import godot.core.Variant
import godot.core.Vector2
import platform.posix.rand
import kotlin.math.PI
import kotlin.random.Random

class Main: Node() {

    var Player = PackedScene from ResourceLoader.load("res://Player.tscn")
    var player = Player.instance()
    var mobTimer = Timer()
    var scoreTimer = Timer()
    var startTimer = Timer()
    var startPosition = Position2D()
    var mobPath = MobPath()

    var Mob = PackedScene from ResourceLoader.load("res://Mob.tscn")
    var score = 0

    override fun _ready() {
        addChild(player)

        addChild(startTimer)
        startTimer.waitTime = 2f
        startTimer.oneShot = true
        startTimer.connect("timeout", this, "_onStartTimerTimeout")

        addChild(scoreTimer)
        scoreTimer.waitTime = 1f
        scoreTimer.connect("timeout", this, "_onScoreTimerTimeout")

        addChild(mobTimer)
        mobTimer.waitTime = 0.5f
        mobTimer.connect("timeout", this, "_onMobTimerTimeout")

        addChild(startPosition)
        startPosition.position = Vector2(240,450)

        addChild(mobPath)

        getNode(NodePath("HUD")).callv("showMenu", GodotArray())
    }

    fun gameOver() {
        scoreTimer.stop()
        mobTimer.stop()
        getNode(NodePath("HUD")).callv("showGameOver", GodotArray())
    }

    fun newGame() {
        score = 0
        val arr = GodotArray()
        arr.pushBack(Variant(startPosition.position))
        player.callv("start", arr)
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
        val arr = GodotArray()
        arr.pushBack(Variant(score))
//        getNode(NodePath("HUD")).callv("update_score", arr)
    }

    fun _onMobTimerTimeout() {
        mobPath.mobSpawnLocation.setOffset(rand().toFloat())
        val mob = RigidBody2D from Mob.instance()
        addChild(mob)
        var direction = (mobPath.mobSpawnLocation.rotation + PI/2).toFloat()
        mob.position = mobPath.mobSpawnLocation.position

        fun ClosedRange<Int>.random() =
                Random.nextInt(endInclusive - start) + start

        direction += ((-PI/4 * 1000).toInt()..(PI/4  * 1000).toInt()).random() / 1000
        mob.rotation = direction
        mob.setLinearVelocity(Vector2((150..250).random(), 0).rotated(direction))
    }



}