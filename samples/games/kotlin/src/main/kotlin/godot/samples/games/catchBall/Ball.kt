package godot.samples.games.catchBall

import godot.*
import godot.core.*
import org.godotengine.kotlin.annotation.RegisterClass
import org.godotengine.kotlin.annotation.RegisterFunction
import kotlin.random.Random
import kotlin.system.getTimeNanos

@RegisterClass
class Ball: RigidBody() {

    @RegisterFunction
    override fun _ready() {
        val random = Random(getTimeNanos())
        fun ClosedRange<Int>.random() =
                random.nextInt(endInclusive - start) + start

        linearVelocity = Vector3((-70..70).random().toDouble() / 10 , 0, (-70..70).random().toDouble() / 10)
    }
}