package godot.samples.games.catchBall

import godot.*
import godot.core.*

class End: Area() {

    override fun _process(delta: Float) {
        val arr = getOverlappingBodies()
        if(arr.size() > 0)
            GD.print("END")
    }
}