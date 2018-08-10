package kotlin.godot.core

import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.MemScope


enum class ClockDirection(val id: Int) {
    ;

    companion object {
        fun fromInt(value: Int) = values().single { it.id == value }
    }
}

class Plane: CoreType {

    class Normal {
        var x: Float = 0f
        var y: Float = 0f
        var z: Float = 0f

        fun abs(): Float {
            TODO()
        }
    }

    val normal = Normal()


    fun distance_to(v: Vector3): Float {
        TODO()
    }
    fun is_point_over(v: Vector3): Boolean {
        TODO()
    }


    override fun setRawMemory(mem: COpaquePointer) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    operator fun get(idx: Int): Plane {
        TODO()
    }
}


fun Float.dot(v: Vector3): Float {
    TODO()
}