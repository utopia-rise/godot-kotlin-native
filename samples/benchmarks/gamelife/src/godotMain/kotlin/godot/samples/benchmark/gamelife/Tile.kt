package godot.samples.benchmark.gamelife

data class Tile(var isAlive: Boolean = false,
                var life: Int = 0,
                var neighbors: MutableList<Tile> = ArrayList(8)) {

    fun getTotal(): Int {
        var total = 0

        for (neighbor in neighbors) {
            total += neighbor.getValue()
        }

        return total
    }

    fun getValue(): Int {
        if (isAlive)
            return 1
        return 0
    }
}