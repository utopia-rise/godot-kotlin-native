import godot.*
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.core.*

@RegisterClass
class FollowCamera : Camera() {
    private val collisionExceptions = GodotArray<Any?>()

    @RegisterProperty
    var minDistance = 0.5

    @RegisterProperty
    var maxDistance = 3.5

    @RegisterProperty
    var angleVAdjust = 0.0

    @RegisterProperty
    var autoturnRayAperture = 25

    @RegisterProperty
    var autoturnSpeed = 50

    private val maxHeight = 2.0
    private val minHeight = 0.0

    @RegisterFunction
    override fun _physics_process(dt: Double) {
        val target = (getParent() as Spatial).globalTransform.origin
        var pos = globalTransform.origin
        val up = Vector3(0f, 1f, 0f)

        var delta = pos - target

        // check ranges
        if (delta.length() < minDistance) {
            delta = delta.normalized() * minDistance
        } else if (delta.length() > maxDistance) {
            delta = delta.normalized() * maxDistance
        }

        // check upper and lower height
        if (delta.y > maxHeight) {
            delta.y = maxHeight
        }
        if (delta.y < minHeight) {
            delta.y = minHeight
        }

        // Check autoturn
        val ds = PhysicsServer.spaceGetDirectState(getWorld().space)

        val colLeft = ds.intersectRay(
            target,
            target + Basis(up, GD.deg2rad(autoturnRayAperture.toDouble())).xform(delta),
            collisionExceptions
        )
        val col = ds.intersectRay(target, target + delta, collisionExceptions)
        val colRight = ds.intersectRay(
            target,
            target + Basis(up, GD.deg2rad((-autoturnRayAperture).toDouble())).xform(delta),
            collisionExceptions
        )

        if (!col.empty()) {
            // If main ray was occluded, get camera closer, this is the worst case scenario
            delta = col["position"] as Vector3 - target
        } else if (!colLeft.empty() && colRight.empty()) {
            // If only left ray is occluded, turn the camera around to the right
            delta = Basis(up, GD.deg2rad(-dt * autoturnSpeed)).xform(delta)
        } else if (colLeft.empty() && !colRight.empty()) {
            // If only right ray is occluded, turn the camera around to the left
            delta = Basis(up, GD.deg2rad(dt * autoturnSpeed)).xform(delta)
        } else {
            // Do nothing otherwise, left and right are occluded but center is not, so do not autoturn
        }

        // Apply lookat
        if (delta == Vector3()) {
            delta = (pos - target).normalized() * 0.0001f
        }

        pos = target + delta

        lookAtFromPosition(pos, target, up)

        // Turn a little up or down
        val t = transform
        t.basis = Basis(t.basis[0], GD.deg2rad(angleVAdjust)) * t.basis
        transform = t

        // alternative
        // transform {
        //  basis = Basis(t.basis[0], angleVAdjust.toRadians()) * t.basis
        // }
    }

    @RegisterFunction
    override fun _ready() {
        // Find collision exceptions for ray
        var node: Node? = this
        while (node != null) {
            if (node is RigidBody) {
                collisionExceptions.append(node.getRid())
                break
            } else {
                node = try {
                    node.getParent()
                } catch (e: Throwable) {
                    null
                }
            }
        }

        setPhysicsProcess(true)
        // This detaches the camera transform from the parent spatial node
        setAsToplevel(true)
    }
}
