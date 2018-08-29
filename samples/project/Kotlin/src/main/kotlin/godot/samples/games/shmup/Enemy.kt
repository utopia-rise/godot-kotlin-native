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

    override fun _process(delta: Float) {
        checkCollisions()
    }

    fun checkCollisions() {
        val arr = getOverlappingAreas()
        for (i in 0 until arr.size()){
            val obj = Area2D from (arr[i] ?: throw ArrayIndexOutOfBoundsException("arr.size is ${arr.size()} but iterator val is $i"))
            if (bullet.instanceHas(obj)){
                health--
                if (health == 0){
                    val args = godotArrayOf(Variant(0.2), Variant(30), Variant(3))
                    camera.callv("shake", args)
                    getParent().getParent().queueFree()
                } else {
                    val args = godotArrayOf(Variant(0.15), Variant(5), Variant(2))
                    camera.callv("shake", args)
                }
                obj.queueFree()
            }
        }
    }

}