import godot.Object
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.core.Basis
import godot.core.GD
import godot.core.Transform
import godot.core.Vector3

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

    @RegisterFunction
    fun benchmarkVectors(): Vector3 {
        var b = Transform()
        b = b.rotated(Vector3.UP, GD.deg2rad(60.0))
        b = b.scaled(Vector3(0.5, 0.5, 0.5))

        var s = Vector3()
        for (i in 0 until 1000) {
            var v = Vector3(i, i, i)
            v = b.xform(v)
            s += v
        }

        return s
    }
}
