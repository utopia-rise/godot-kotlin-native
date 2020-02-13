package godot.samples.games.catchBall

import godot.*
import godot.core.*

class Player: KinematicBody() {
    var speed = 6.0

    override fun _process(delta: Double){
        var velocity = Vector3()

        if (Input.isActionPressed("ui_right"))
            velocity.z -= 1.0
        if (Input.isActionPressed("ui_left"))
            velocity.z += 1.0

        if (Input.isActionPressed("ui_down"))
            velocity.x += 1.0
        if (Input.isActionPressed("ui_up"))
            velocity.x -= 1.0

        if (velocity.length() > 0) {
            velocity = velocity.normalized() * speed

            if(translation.x + velocity.x * delta < 4.0 &&
                    translation.x + velocity.x * delta > -4.0)
                translation { x += velocity.x * delta }

            if (translation.z + velocity.z * delta < 4.0 &&
                    translation.z + velocity.z * delta > -4.0)
                translation { z += velocity.z * delta }
        }
    }
}