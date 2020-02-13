package godot.samples.games.catchBall

import godot.*
import godot.core.*

class BounceOff: Area() {

    override fun _process(delta: Double) {
        if(getOverlappingBodies().size() > 0)
            (RigidBody from (getOverlappingBodies()[0] ?: throw ArrayIndexOutOfBoundsException())).bounce = 0.0
    }
}