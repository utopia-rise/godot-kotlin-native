import godot.Object
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction

@RegisterClass
class Simple : Object() {
    @RegisterFunction
    fun benchmarkSimpleAdd(): Int {
        val a = 1
        val b = 2
        return a + b
    }

    @RegisterFunction
    fun benchmarkAvg(): Int {
        val size = 10000
        var total = 0
        for (i in 0 until size) {
            total += i
        }
        return total / size
    }
}
