package godot.samples.games.shmup

import godot.*
import godot.core.*


class Enemy: Area2D() {
    var health = 2
    lateinit var bullet: NativeScript
    lateinit var camera: Node

    override fun _ready() {
        addToGroup("enemies")
        bullet = NativeScript from ResourceLoader.load("res://Games/Shmup/Scripts/Bullet.gdns")
        camera = getTree().getRoot().getNode(NodePath("Stage/Camera2D"))
    }

    override fun _process(delta: Double) {
        checkCollisions()
    }

    fun checkCollisions() {
        val arr = getOverlappingAreas()
        for (i in 0 until arr.size()){
            val obj = Area2D from (arr[i] ?: throw ArrayIndexOutOfBoundsException("arr.size is ${arr.size()} but iterator val is $i"))
            if (bullet.instanceHas(obj)){
                health--
                if (health == 0){
                    (AudioStreamPlayer2D from getTree().getRoot().getNode(NodePath("Stage/Explosion"))).play()
                    val args = godotArrayOf(0.2, 30, 3)
                    camera.callv("shake", args)
                    getParent().getParent().queueFree()
                } else {
                    val args = godotArrayOf(0.15, 5, 2)
                    camera.callv("shake", args)
                }
                obj.queueFree()
            }
        }
    }

}