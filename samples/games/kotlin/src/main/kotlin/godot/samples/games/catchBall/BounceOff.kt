package godot.samples.games.catchBall

import godot.*
import godot.core.*
import org.godotengine.kotlin.annotation.RegisterClass
import org.godotengine.kotlin.annotation.RegisterFunction

@RegisterClass
class BounceOff: Area() {

    @RegisterFunction
    override fun _process(delta: Double) {
        if(getOverlappingBodies().size() > 0)
            (RigidBody from (getOverlappingBodies()[0] ?: throw ArrayIndexOutOfBoundsException())).bounce = 0.0
    }
}