import godot.RigidBody
import godot.annotation.RegisterClass

@RegisterClass
class Bullet : RigidBody() {
    var disabled = false
}
