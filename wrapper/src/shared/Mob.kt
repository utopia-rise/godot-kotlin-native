package dodge

import godot.*
import platform.posix.rand
import godot.core.NodePath

class Mob: RigidBody2D() {
    var minSpeed = 150f
    var maxSpeed = 250f

    val animatedSprite = AnimatedSprite()
    val visibilityNotifier2D = VisibilityNotifier2D()
    val collisionShape2D = CollisionShape2D()
    val spriteFrames = SpriteFrames()

    override fun _ready() {
        this.addChild(animatedSprite)
        this.addChild(visibilityNotifier2D)
        this.addChild(collisionShape2D)

        this.gravityScale = 0f
        this.setCollisionMaskBit(0, false)
        visibilityNotifier2D.connect("screen_exited", this, "queue_free")

        spriteFrames.addAnimation("fly")
        spriteFrames.addFrame("fly", Texture from ResourceLoader.load("res://art/enemyFlyingAlt_1.png"))
        spriteFrames.addFrame("fly", Texture from ResourceLoader.load("res://art/enemyFlyingAlt_2.png"))
        spriteFrames.addAnimation("walk")
        spriteFrames.addFrame("walk", Texture from ResourceLoader.load("res://art/enemySwimming_1.png"))
        spriteFrames.addFrame("walk", Texture from ResourceLoader.load("res://art/enemySwimming_2.png"))
        spriteFrames.addAnimation("swim")
        spriteFrames.addFrame("swim", Texture from ResourceLoader.load("res://art/enemyWalking_1.png"))
        spriteFrames.addFrame("swim", Texture from ResourceLoader.load("res://art/enemyWalking_2.png"))

        val animationList = arrayOf("fly", "walk", "swim")

        animatedSprite.setSpriteFrames(spriteFrames)
        animatedSprite.setAnimation(animationList[rand() % animationList.size])
        //animatedSprite.setAnimation("fly")
        animatedSprite.play()

    }
}