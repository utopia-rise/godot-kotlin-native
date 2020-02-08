package godot.samples.games.shmup

import godot.*
import godot.core.*

class Player: KinematicBody2D() {
    var shootTime = 0
    var shooting = false
    var speed = 600.0
    lateinit var Bullet: PackedScene

    override fun _ready() {
        Bullet = PackedScene from ResourceLoader.load("res://Games/Shmup/Scenes/Bullet.tscn")
    }

    override fun _process(delta: Double) {
        move(delta)
        shooting()
    }

    fun move(delta: Double) {
        var velocity = Vector2()

        if (Input.isActionPressed("ui_right"))
            velocity.x += 1
        if (Input.isActionPressed("ui_left"))
            velocity.x -= 1
        if (Input.isActionPressed("ui_down"))
            velocity.y += 1
        if (Input.isActionPressed("ui_up"))
            velocity.y -= 1

        if (velocity.length() > 0) {
            velocity = velocity.normalized() * speed
            moveAndCollide(velocity * delta)
        }
    }

    fun shooting() {
        if (Input.isActionPressed("ui_accept") && !shooting){
            shooting = true
            shootTime = 0
            val bul = (Area2D from Bullet.instance()).apply {
                position = this@Player.position
            }
            val notifier = VisibilityNotifier2D().apply {
                connect("screen_exited", bul, "queue_free")
            }
            (AudioStreamPlayer2D from getNode(NodePath("Shoot"))).play()
            bul.addChild(notifier)
            getParent().addChild(bul)
        }
        else
            shootTime++

        if (shootTime > 8)
            shooting = false
    }

}
