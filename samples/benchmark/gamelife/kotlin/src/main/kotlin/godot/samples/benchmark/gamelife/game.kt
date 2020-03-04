package godot.samples.benchmark.gamelife

import godot.*
import godot.core.*
import org.godotengine.kotlin.annotation.RegisterClass
import org.godotengine.kotlin.annotation.RegisterFunction
import org.godotengine.kotlin.annotation.RegisterProperty
import kotlin.math.max
import kotlin.math.sqrt

@RegisterClass("scripts/gamelife")
class Game: MultiMeshInstance(){

    private lateinit var map : Map
    private var started: Long = 0

    private var counter : Int = 0
    private var frame : Int = 0
    private val rng = RandomNumberGenerator()

    @RegisterProperty(false, "50")
    var size = 50
    @RegisterProperty(false, "1000")
    var limit = 1000

    @RegisterFunction
    override fun _ready(){
        started = OS.getSystemTimeMsecs()
        map = Map(size, size)
        multimesh.instanceCount = (map.w * map.h).toLong()

        val l = sqrt(multimesh.instanceCount.toDouble()).toLong()

        var index = 0L

        val offset = (size - 50) * 0.5
        for (y in 0 until l){
            for (x in 0 until l){
                multimesh.setInstanceTransform(index, Transform(Basis(), Vector3(x - offset, rng.randi() % 10 * 0.1, y - offset)))
                multimesh.setInstanceColor(index, Color(255, x, y))
                index += 1
            }
        }

    }

    @RegisterFunction
    override fun _process(delta: Double){
        frame += 1
        if (frame == limit){
            val elapsed = OS.getSystemTimeMsecs() - started
            GD.print("Result: $elapsed")
            getTree().quit()
            return
        }

        counter += 1
        if (counter == 10){
            val center = size/2
            map.put(center, center, true)
            map.put(center-1, center, true)
            map.put(center+1, center, true)
            map.put(center, center-1, true)
            counter = 0
        }

        map.process()

        for (i in 0 until multimesh.instanceCount){
            val tile = map.data[i.toInt()]
            if (tile.v)
                multimesh.setInstanceColor(i, Color(1.0, 0, 0))
            else
                multimesh.setInstanceColor(i, Color(0, tile.life / 50.0, 0))
        }

    }
}

data class Tile(var v: Boolean = false,
                var life : Int = 0,
                var others: MutableList<Tile> = ArrayList(8)){

    fun getTotal(): Int{
        var result  = 0

        for (other in others){
            result += other.getValue()
        }

        return result
    }

    fun getValue(): Int{
        if (v)
            return 1
        return 0
    }
}

class Map(    var w : Int,
              var h : Int,
              var data : MutableList<Tile> = ArrayList(),
              var next : MutableList<Boolean> = ArrayList(),
              var empty : Tile = Tile()){

    init{
        for(i in 0 until w*h) {
            data.add(Tile())
            next.add(false)
        }

        var i = 0
        for(y in 0 until h){
            for (x in 0 until w){
                val t = data[i]
                t.others.addAll(listOf(
                    at(x - 1, y - 1), at(x, y - 1), at(x + 1, y - 1),
                    at(x - 1, y), at(x + 1, y),
                    at(x - 1, y + 1), at(x, y + 1), at(x + 1, y + 1)))
                i += 1
            }
        }

    }

    fun getIndex(x: Int, y: Int): Int{
        if (x < 0 || x >= w || y < 0 || y >= h)
            return -1

        return x + y * w
    }


    fun put(x: Int, y: Int, v: Boolean){
        var index = getIndex(x, y)
        if (index == -1)
            return

        data[index].v = v
    }


    fun at(x: Int, y: Int): Tile{
        val index = getIndex(x, y)
        if (index == -1)
            return empty

        return data[index]
    }


    fun process(){
        for (i in 0 until w * h){
            val t = data[i]
            val v = t.getTotal()

            if (data[i].v){
                next[i] = v == 2 || v == 3
            }
            else{
                next[i] = v == 3
            }
        }

        for (i in 0 until w * h) {
            data[i].v = next[i]

            if (data[i].v)
                data[i].life = 20

            data[i].life = max(0, data[i].life - 1)
        }
    }
    
}
