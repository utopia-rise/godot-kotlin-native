import godot.*
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.core.Basis
import godot.core.GD
import godot.core.Transform
import godot.core.Vector3
import kotlin.math.*

@RegisterClass
class Player : KinematicBody() {
    private var facingDir = Vector3(1f, 0f, 0f)
    private var movementDir = Vector3()
    private var jumping = false
    private var turnSpeed = 40
    private var keepJumpInertia = true
    private var airIdleDeaccel = false
    private var accel = 19.0
    private var deaccel = 14.0
    private var sharpTurnThreshold = 140
    private var maxSpeed = 3.1
    private var prevShoot = false
    private var linearVelocity = Vector3()
    private var shootBlend = 0.0

    @RegisterFunction
    override fun _physicsProcess(delta: Double) {
        var lv = linearVelocity
        val g = Vector3(0f, -9.8f, 0f)
        // apply gravity
        lv += g * delta

        var anim = ANIM_FLOOR

        // up is against gravity
        val up = -g.normalized()
        // vertical velocity
        var vv = up.dot(lv)
        // horizontal velocity
        var hv = lv - up * vv

        // horizontal direction
        var hdir = hv.normalized()
        // horizontal speed
        var hspeed = hv.length()

        // direction where the player intends to walk
        var dir = Vector3()
        val camXform = getNode<Spatial>("target/camera").globalTransform

        if (Input.isActionPressed("move_forward")) {
            dir += -camXform.basis[2]
        }
        if (Input.isActionPressed("move_backwards")) {
            dir += camXform.basis[2]
        }
        if (Input.isActionPressed("move_left")) {
            dir += -camXform.basis[0]
        }
        if (Input.isActionPressed("move_right")) {
            dir += camXform.basis[0]
        }

        val jumpAttempt = Input.isActionPressed("jump")
        val shootAttempt = Input.isActionPressed("shoot")

        val targetDir = (dir - up * dir.dot(up)).normalized()

        if (isOnFloor()) {
            val sharpTurn = hspeed > 0.1 && GD.rad2deg(acos(targetDir.dot(hdir))) > sharpTurnThreshold
            if (dir.length() > 0.1 && !sharpTurn) {
                if (hspeed > 0.001) {
                    hdir = adjustFacing(hdir, targetDir, delta, 1.0 / hspeed * turnSpeed, up)
                    facingDir = hdir
                } else {
                    hdir = targetDir
                }

                if (hspeed < maxSpeed) {
                    hspeed += accel * delta
                }
            } else {
                hspeed -= deaccel * delta
                if (hspeed < 0.0) {
                    hspeed = 0.0
                }
            }

            hv = hdir * hspeed

            val meshXform = getNode<Spatial>("Armature").transform
            var facingMesh = -meshXform.basis[0].normalized()
            facingMesh = (facingMesh - up * facingMesh.dot(up)).normalized()
            if (hspeed > 0f) {
                facingMesh = adjustFacing(facingMesh, targetDir, delta, 1.0f / hspeed * turnSpeed, up)
            }
            val m3 = Basis(-facingMesh, up, -facingMesh.cross(up).normalized()).scaled(CHAR_SCALE)

            getNode<Spatial>("Armature").setTransform(Transform(m3, meshXform.origin))

            if (!jumping and jumpAttempt) {
                vv = 7.0
                jumping = true
                getNode<AudioStreamPlayer3D>("sound_jump").play()
            }
        } else {
            if (vv > 0f) {
                anim = ANIM_AIR_UP
            } else {
                anim = ANIM_AIR_DOWN
            }

            if (dir.length() > 0.1f) {
                hv += targetDir * (accel * 0.2f) * delta
                if (hv.length() > maxSpeed) {
                    hv = hv.normalized() * maxSpeed
                }
            } else {
                if (airIdleDeaccel) {
                    hspeed -= (deaccel * 0.2) * delta
                    if (hspeed < 0.0) {
                        hspeed = 0.0
                    }
                    hv = hdir * hspeed
                }
            }
        }

        if (jumping && vv < 0f) {
            jumping = false
        }

        lv = hv + up * vv

        if (isOnFloor()) {
            movementDir = lv
        }

        linearVelocity = moveAndSlide(lv, -g.normalized())

        if (shootBlend > 0.0) {
            shootBlend -= delta * SHOOT_SCALE
            if (shootBlend < 0.0)
                shootBlend = 0.0
        }

        if (shootAttempt && !prevShoot) {
            shootBlend = SHOOT_TIME
            val bullet = (GD.load<PackedScene>("res://bullet.scn") as PackedScene)
                .instance() as Bullet
            val bulletGlobalTransform = getNode<Spatial>("Armature/bullet").globalTransform
            bullet.transform = bulletGlobalTransform.orthonormalized()
            getParent().addChild(bullet)
            bullet.linearVelocity = bulletGlobalTransform.basis[2].normalized() * 20f
            bullet.addCollisionExceptionWith(this)
            getNode<AudioStreamPlayer3D>("sound_shoot").play()
        }

        prevShoot = shootAttempt

        val animationTreePlayer = getNode<AnimationTreePlayer>("AnimationTreePlayer")
        if (isOnFloor()) {
            animationTreePlayer.blend2NodeSetAmount("walk", hspeed / maxSpeed)
        }

        animationTreePlayer.transitionNodeSetCurrent("state", anim.toLong())
        animationTreePlayer.blend2NodeSetAmount("gun", min(shootBlend, 1.0))
    }

    @RegisterFunction
    override fun _ready() {
        getNode<AnimationTreePlayer>("AnimationTreePlayer").setActive(true)
    }

    private fun adjustFacing(
        facing: Vector3,
        target: Vector3,
        step: Double,
        adjustRate: Double,
        currentGn: Vector3
    ): Vector3 {
        val n = target
        val t = n.cross(currentGn).normalized()

        val x = n.dot(facing)
        val y = t.dot(facing)
        var ang = atan2(y, x)

        if (abs(ang) < 0.001f)
            return facing

        val s = sign(ang)
        ang *= s
        val turn = ang * adjustRate * step
        val a = if (ang < turn) {
            ang
        } else {
            turn
        }
        ang = (ang - a) * s
        return (n * cos(ang) + t * sin(ang)) * facing.length()
    }

    companion object {
        const val ANIM_FLOOR = 0.0
        const val ANIM_AIR_UP = 1.0
        const val ANIM_AIR_DOWN = 2.0
        const val SHOOT_TIME = 1.5
        const val SHOOT_SCALE = 2
        val CHAR_SCALE: Vector3
            get() = Vector3(0.3f, 0.3f, 0.3f)
    }
}
