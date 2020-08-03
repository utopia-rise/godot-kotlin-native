import godot.AnimationPlayer
import godot.Area
import godot.Node
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.core.NodePath

@RegisterClass
class Coin : Area() {
    private var taken = false

    @RegisterFunction
    fun onCoinBodyEntered(node: Node) {
        if (!taken && node is Player) {
            (getNode(NodePath("anim")) as AnimationPlayer).play("take")
            taken = true
        }
    }
}
