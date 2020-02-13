package godot.samples.games.catchBall

import godot.*
import godot.core.*

class End: Area() {

    override fun _process(delta: Double) {
        if(getOverlappingBodies().size() == 1)
            GD.print("END")
            setProcess(false)
    }
}