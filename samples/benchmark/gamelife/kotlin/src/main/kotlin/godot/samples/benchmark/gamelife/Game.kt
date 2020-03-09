package godot.samples.benchmark.gamelife

import godot.*
import godot.core.*
import org.godotengine.kotlin.annotation.RegisterClass
import org.godotengine.kotlin.annotation.RegisterFunction
import org.godotengine.kotlin.annotation.RegisterProperty
import kotlin.math.sqrt

@RegisterClass("scripts/gamelife")
class Game : MultiMeshInstance() {

    private lateinit var map: Map
    private var started: Long = 0
    private var counter: Int = 0
    private var frame: Int = 0
    private val randomNumberGenerator = RandomNumberGenerator()

    @RegisterProperty(false, "50")
    var size = 50
    @RegisterProperty(false, "1000")
    var limit = 1000

    @RegisterFunction
    override fun _ready() {
        started = OS.getSystemTimeMsecs()
        map = Map(size, size)
        multimesh.instanceCount = (size * size).toLong()

        var index = 0L

        val offset = (size - 50) * 0.5
        for (y in 0 until size) {
            for (x in 0 until size) {
                multimesh.setInstanceTransform(index, Transform(Basis(), Vector3(x - offset, randomNumberGenerator.randi() % 10 * 0.1, y - offset)))
                multimesh.setInstanceColor(index, Color(255, x, y))
                index += 1
            }
        }
    }

    @RegisterFunction
    override fun _process(delta: Double) {
        frame += 1
        if (frame == limit) {
            val elapsed = OS.getSystemTimeMsecs() - started
            GD.print("Result: $elapsed")
            getTree().quit()
            return
        }

        counter += 1
        if (counter == 10) {
            val center = size / 2
            map.put(center, center, true)
            map.put(center - 1, center, true)
            map.put(center + 1, center, true)
            map.put(center, center - 1, true)
            counter = 0
        }

        map.process()

        for (i in 0 until multimesh.instanceCount) {
            val tile = map.tileData[i.toInt()]
            if (tile.isAlive)
                multimesh.setInstanceColor(i, Color(1.0, 0, 0))
            else
                multimesh.setInstanceColor(i, Color(0, tile.life / 50.0, 0))
        }
    }
}

