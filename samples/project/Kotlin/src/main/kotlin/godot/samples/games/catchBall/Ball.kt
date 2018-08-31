package godot.samples.games.catchBall

import godot.*
import godot.core.*
import kotlin.random.Random
import kotlin.system.getTimeNanos

class Ball: RigidBody() {

    override fun _ready() {
        fun ClosedRange<Int>.random() =
                Random.nextInt(endInclusive - start) + start
        Random.seed = getTimeNanos()

        linearVelocity = Vector3((-70..70).random().toDouble() / 10 , 0, (-70..70).random().toDouble() / 10)
    }
}