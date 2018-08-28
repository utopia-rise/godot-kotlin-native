package stages.shmup

import godot.*
import godot.core.*

class Enemy: Area2D() {
    var health = 2
    lateinit var bullet: NativeScript
    lateinit var camera: Node

    override fun _ready() {
        addToGroup("enemies")
        bullet = NativeScript from ResourceLoader.load("res://games/Shmup/Scripts/Bullet.gdns")
        camera = getTree().getRoot().getNode(NodePath("Stage/Camera2D"))
    }

    override fun _process(delta: Float) {
        checkCollisions()
    }

    fun checkCollisions() {
        val arr = getOverlappingAreas()
        for(i in 0 until arr.size()){
            val t = arr[i] ?: throw ArrayIndexOutOfBoundsException("arr.size is ${arr.size()} but iterator val is $i")
            val obj = Area2D from t
            if (bullet.instanceHas(obj)){
                health--
                if (health == 0){
                    val args = GDArray()
                    args.pushBack(Variant(0.2))
                    args.pushBack(Variant(30))
                    args.pushBack(Variant(3))
                    camera.callv("shake", args)
                    getParent().getParent().queueFree()
                } else {
                    val args = GDArray()
                    args.pushBack(Variant(0.15))
                    args.pushBack(Variant(5))
                    args.pushBack(Variant(2))
                    camera.callv("shake", args)
                }
                obj.queueFree()
            }
        }
    }

}