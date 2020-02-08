package godot.samples.games.shmup

import godot.Area2D
import godot.core.Vector2
import godot.core.minus

class Bullet: Area2D() {
    var speed = 1000

    override fun _process(delta: Double) {
        position -= Vector2(0, speed * delta)
    }
}
