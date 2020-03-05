package godot.samples.benchmark.gamelife

import kotlin.math.max

class Map(var width: Int,
          var height: Int) {

    private var nextState: MutableList<Boolean> = ArrayList()
    private var empty: Tile = Tile()

    var tileData: MutableList<Tile> = ArrayList()

    init {
        for (i in 0 until width * height) {
            tileData.add(Tile())
            nextState.add(false)
        }

        var i = 0
        for (y in 0 until height) {
            for (x in 0 until width) {
                val t = tileData[i]
                t.neighbors.addAll(listOf(
                        at(x - 1, y - 1), at(x, y - 1), at(x + 1, y - 1),
                        at(x - 1, y), at(x + 1, y),
                        at(x - 1, y + 1), at(x, y + 1), at(x + 1, y + 1)))
                i += 1
            }
        }
    }

    private fun at(x: Int, y: Int): Tile {
        val index = getIndex(x, y)
        if (index == -1)
            return empty

        return tileData[index]
    }

    private fun getIndex(x: Int, y: Int): Int {
        if (x < 0 || x >= width || y < 0 || y >= height)
            return -1

        return x + y * width
    }

    fun put(x: Int, y: Int, v: Boolean) {
        val index = getIndex(x, y)
        if (index == -1)
            return

        tileData[index].isAlive = v
    }

    fun process() {
        for (i in 0 until width * height) {
            val tile = tileData[i]
            val value = tile.getTotal()

            if (tileData[i].isAlive) {
                nextState[i] = value == 2 || value == 3
            } else {
                nextState[i] = value == 3
            }
        }

        for (i in 0 until width * height) {
            tileData[i].isAlive = nextState[i]

            if (tileData[i].isAlive)
                tileData[i].life = 20

            tileData[i].life = max(0, tileData[i].life - 1)
        }
    }
}