package godot.samples.games.shmup

import godot.*
import godot.core.NodePath
import org.godotengine.kotlin.annotation.RegisterClass
import org.godotengine.kotlin.annotation.RegisterFunction

@RegisterClass("Games/Shmup/Scripts")
class Stage: Node() {

    lateinit var Enemy: PackedScene
    lateinit var EnemyPath: PackedScene
    lateinit var Player: PackedScene
    lateinit var player: Area2D
    var respawnTime = 0

    @RegisterFunction
    override fun _ready() {
        Enemy = PackedScene from ResourceLoader.load("res://Games/Shmup/Scenes/Enemy.tscn")
        EnemyPath = PackedScene from ResourceLoader.load("res://Games/Shmup/Scenes/EnemyPath.tscn")
        Player = PackedScene from ResourceLoader.load("res://Games/Shmup/Scenes/Player.tscn")
        player = Area2D from Player.instance()
        addChild(player)
    }

    @RegisterFunction
    override fun _process(delta: Double) {
        respawnTime++
        val count = getTree().getNodesInGroup("enemies").size()
        if(respawnTime > 30 && count < 4) {
            loadEnemy()
            respawnTime = 0
        }
    }

    fun loadEnemy() {
        val newEnemy = Enemy.instance()
        val newPath = EnemyPath.instance().apply {
            getNode(NodePath("PathFollow2D")).addChild(newEnemy)
        }
        addChild(newPath)
    }

    @RegisterFunction
    override fun _unhandled_input(event: InputEvent) {
        if (event.isActionPressed("ui_cancel")) {
            getTree().changeScene("res://Games/Main/Scenes/ChooseGameScreen.tscn")
        }
    }
}