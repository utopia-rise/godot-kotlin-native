package godot.samples.games.catchBall

import godot.*
import godot.core.*
import org.godotengine.kotlin.annotation.RegisterClass
import org.godotengine.kotlin.annotation.RegisterFunction

@RegisterClass("Games/CatchBall/Scripts")
class End: Area() {

    @RegisterFunction
    override fun _process(delta: Double) {
        if(getOverlappingBodies().size() == 1)
            GD.print("END")
            setProcess(false)
    }
}