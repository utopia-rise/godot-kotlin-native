package godot.demo.platformer.enemy

import godot.core.*
import godot.*
import org.godotengine.kotlin.annotation.RegisterClass
import org.godotengine.kotlin.annotation.Registerfuntion
import org.godotengine.kotlin.annotation.RegisterProperty

const val WALK_SPEED = 50

@RegisterClass("enemy")
class Enemy: RigidBody2D() {
    
    enum class State {
        WALKING,
        DYING
    }

    var state = State.WALKING

    var direction = -1
    var anim = ""

    var Bullet = ResourceLoader.load("res://player/bullet.gdns")

    lateinit var rc_left: RayCast2D
    lateinit var rc_right: RayCast2D

    override fun _ready() {
        rc_left = RayCast2D from getNode(NodePath("RaycastLeft"))
        rc_right = RayCast2D from getNode(NodePath("RaycastRight"))
    }


    override fun _integrate_forces(s: Physics2DDirectBodyState) {
        var lv = s.getLinearVelocity()
        var new_anim = anim

        if state == State.DYING:
        new_anim = "explode"
        elif state == State.WALKING:
        new_anim = "walk"

        var wall_side = 0.0

        for i in range(s.get_contact_count()):
        var cc = s.get_contact_collider_object(i)
        var dp = s.get_contact_local_normal(i)

        if cc:
        if cc is Bullet and not cc.disabled:
        # enqueue call
                call_deferred("_bullet_collider", cc, s, dp)
        break

        if dp.x > 0.9:
        wall_side = 1.0
        elif dp.x < -0.9:
        wall_side = -1.0

        if wall_side != 0 and wall_side != direction:
        direction = -direction
        ($Sprite as Sprite).scale.x = -direction
        if direction < 0 and not rc_left.is_colliding() and rc_right.is_colliding():
        direction = -direction
        ($Sprite as Sprite).scale.x = -direction
        elif direction > 0 and not rc_right.is_colliding() and rc_left.is_colliding():
        direction = -direction
        ($Sprite as Sprite).scale.x = -direction

        lv.x = direction * WALK_SPEED

        if anim != new_anim:
        anim = new_anim
        ($AnimationPlayer as AnimationPlayer).play(anim)

        s.set_linear_velocity(lv)}



    fun _die():
    queue_free()


    fun _pre_explode():
    #make sure nothing collides against this
    $Shape1.queue_free()
    $Shape2.queue_free()
    $Shape3.queue_free()

    # Stay there
    mode = MODE_STATIC
    ($SoundExplode as AudioStreamPlayer2D).play()


    fun _bullet_collider(cc, s, dp):
    mode = MODE_RIGID
    state = State.DYING

    s.set_angular_velocity(sign(dp.x) * 33.0)
    set_friction(1)
    cc.disable()
    ($SoundHit as AudioStreamPlayer2D).play()


}