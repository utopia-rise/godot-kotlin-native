package stages.shmup

import godot.*
import godot.core.NodePath

class Stage: Node() {

    lateinit var Enemy: PackedScene
    lateinit var EnemyPath: PackedScene
    lateinit var Player: PackedScene
    lateinit var player: Area2D
    var respawnTime = 0

    override fun _ready() {
        Enemy = PackedScene from ResourceLoader.load("res://games/Shmup/Scenes/Enemy.tscn")
        EnemyPath = PackedScene from ResourceLoader.load("res://games/Shmup/Scenes/EnemyPath.tscn")
        Player = PackedScene from ResourceLoader.load("res://games/Shmup/Scenes/Player.tscn")
        player = Area2D from Player.instance()
        addChild(player)
    }

    override fun _process(delta: Float) {
        respawnTime++
        val count = getTree().getNodesInGroup("enemies").size()
        if(respawnTime > 30 && count < 4) {
            loadEnemy()
            respawnTime = 0
        }
    }

    fun loadEnemy() {
        val newPath = EnemyPath.instance()
        val newEnemy = Enemy.instance()
        newPath.getNode(NodePath("PathFollow2D")).addChild(newEnemy)
        addChild(newPath)
    }

}