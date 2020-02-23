package godot.samples.games.shmup

import godot.Area2D
import godot.core.Vector2
import org.godotengine.kotlin.annotation.RegisterClass
import org.godotengine.kotlin.annotation.RegisterFunction

@RegisterClass("Games/Shmup/Scripts")
class Bullet: Area2D() {
    var speed = 1000

    @RegisterFunction
    override fun _process(delta: Double) {
        position -= Vector2(0, speed * delta)
    }
}