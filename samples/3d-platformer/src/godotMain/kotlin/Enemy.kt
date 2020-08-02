import godot.*
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.core.Basis
import godot.core.Transform
import godot.core.Vector3

@RegisterClass
class Enemy : RigidBody() {
    private var prevAdvance = false
    private val deaccel = 20.0
    private val accel = 5.0
    private val maxSpeed = 2.0
    private var rotDir = 4.0
    private val rotSpeed = 1.0

    private var dying = false

    private val floorRayCast by lazy {
        getNode<RayCast>("Armature/ray_floor")
    }

    private val wallRayCast by lazy {
        getNode<RayCast>("Armature/ray_wall")
    }

    private val armature by lazy {
        getNode<Spatial>("Armature")
    }

    private val animationPlayer by lazy {
        getNode<AnimationPlayer>("AnimationPlayer")
    }

    private val soundHitPlayer by lazy {
        getNode<AudioStreamPlayer3D>("sound_hit")
    }

    @RegisterFunction
    override fun _integrate_forces(state: PhysicsDirectBodyState) {
        val delta = state.step
        var lv = state.linearVelocity
        var g = state.totalGravity
        // totalGravity returns zero for the first few frames, leading to errors
        if (g == Vector3.ZERO) {
            g = Vector3(0.0, -9.8, 0.0)
        }

        // apply gravity
        lv += g * delta
        val up = -g.normalized()

        if (dying) {
            state.linearVelocity = lv
            return
        }

        for (i in 0 until state.getContactCount()) {
            val cc = state.getContactColliderObject(i)
            val dp = state.getContactLocalNormal(i)

            if (cc != null) {
                if (cc is Bullet && !cc.disabled) {
                    setMode(Mode.MODE_RIGID.id)
                    dying = true
                    state.angularVelocity = -dp.cross(up).normalized() * 33.0
                    animationPlayer.play("impact")
                    animationPlayer.queue("explode")
                    friction = 1.0
                    cc.disabled = true
                    soundHitPlayer.play()
                    return
                }
            }
        }
        val colFloor = floorRayCast.isColliding()
        val colWall = wallRayCast.isColliding()

        val advance = !colWall and colFloor

        var dir = armature.transform.basis[2].normalized()
        var deaccelDir = dir

        if (advance) {
            if (dir.dot(lv) < maxSpeed) {
                lv += dir * accel * delta
            }
            deaccelDir = dir.cross(g).normalized()
        } else {
            if (prevAdvance) {
                rotDir = 1.0
            }

            dir = Basis(up, rotDir * rotSpeed * delta).xform(dir)
            armature.transform = Transform().lookingAt(-dir, up)
        }

        var dspeed = deaccelDir.dot(lv)
        dspeed -= deaccel * delta
        if (dspeed < 0.0) {
            dspeed = 0.0
        }

        lv -= deaccelDir * deaccelDir.dot(lv) + deaccelDir * dspeed

        state.linearVelocity = lv
        prevAdvance = advance
    }

    @RegisterFunction
    fun _die() {
        queueFree()
    }

    companion object {
        const val STATE_WALING = 0
        const val STATE_DYING = 1
    }
}
