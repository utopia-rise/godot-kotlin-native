package stages.shmup

import godot.Path2D
import godot.Tween
import godot.core.NodePath
import godot.core.Variant

class EnemyPath: Path2D() {
    val tween = Tween()

    override fun _ready() {
        val follow = getNode(NodePath("PathFollow2D"))
        addChild(tween)
        tween.interpolateProperty(follow, NodePath("unit_offset"), Variant(0), Variant(1), 6.0f, Tween.TRANS_LINEAR, Tween.EASE_IN_OUT)
        tween.setRepeat(true)
        tween.start()
    }
}