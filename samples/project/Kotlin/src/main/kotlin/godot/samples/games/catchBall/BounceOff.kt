package godot.samples.games.catchBall

import godot.*
import godot.core.*

class BounceOff: Area() {

    override fun _process(delta: Double) {
        val arr = getOverlappingBodies()
        if(arr.size() > 0)
            (RigidBody from (arr[0] ?: throw ArrayIndexOutOfBoundsException())).bounce = 0.0
    }
}