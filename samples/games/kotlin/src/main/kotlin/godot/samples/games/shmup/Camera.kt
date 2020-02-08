package godot.samples.games.shmup

import platform.posix.rand
import godot.Camera2D
import godot.core.*

class Camera: Camera2D() {
    var duration = 0.0
    var periodInMs = 0.0
    var amplitude = 0.0
    var timer = 0.0
    var lastShookTimer = 0.0
    var previousX = 0.0
    var previousY = 0.0
    var lastOffset = Vector2(0, 0)

    override fun _process(delta: Double) {
        if (timer == 0.0){
            if(offset.length() > 1.0)
                offset /= 4.0
            else
                offset = Vector2()
            return
        }

        lastShookTimer += delta

        while (lastShookTimer >= periodInMs ){
            lastShookTimer -= periodInMs
            val intensity = amplitude * (1 - ((duration - timer) / duration))

            val newX = ((rand().toDouble() / 10000) % 2) - 1
            val xComponent = intensity * (previousX + (delta * (newX - previousX)))

            val newY = ((rand().toDouble() / 10000) % 2) - 1
            val yComponent = intensity * (previousY + (delta * (newY - previousY)))

            previousX = newX
            previousY = newY

            val newOffset = Vector2(xComponent, yComponent)

            offset -= lastOffset + newOffset
            lastOffset = newOffset
        }

        timer -= delta

        if (timer <= 0.0) {
            timer = 0.0
            offset -= lastOffset
        }
    }

    fun shake(duration: Double, frequency: Double, amplitude: Double){
        this.duration = duration
        timer = duration

        periodInMs = 1.0 / frequency

        this.amplitude = amplitude

        previousX = ((rand().toDouble() / 10000) % 2) - 1
        previousY = ((rand().toDouble() / 10000) % 2) - 1

        offset -= lastOffset
        lastOffset = Vector2()
    }
}
