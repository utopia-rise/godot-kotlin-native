@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Performance : Object {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class Monitor(val id: Long) {
        TIME_FPS(0),
        TIME_PROCESS(1),
        TIME_PHYSICS_PROCESS(2),
        MEMORY_STATIC(3),
        MEMORY_DYNAMIC(4),
        MEMORY_STATIC_MAX(5),
        MEMORY_DYNAMIC_MAX(6),
        MEMORY_MESSAGE_BUFFER_MAX(7),
        OBJECT_COUNT(8),
        OBJECT_RESOURCE_COUNT(9),
        OBJECT_NODE_COUNT(10),
        RENDER_OBJECTS_IN_FRAME(11),
        RENDER_VERTICES_IN_FRAME(12),
        RENDER_MATERIAL_CHANGES_IN_FRAME(13),
        RENDER_SHADER_CHANGES_IN_FRAME(14),
        RENDER_SURFACE_CHANGES_IN_FRAME(15),
        RENDER_DRAW_CALLS_IN_FRAME(16),
        RENDER_VIDEO_MEM_USED(17),
        RENDER_TEXTURE_MEM_USED(18),
        RENDER_VERTEX_MEM_USED(19),
        RENDER_USAGE_VIDEO_MEM_TOTAL(20),
        PHYSICS_2D_ACTIVE_OBJECTS(21),
        PHYSICS_2D_COLLISION_PAIRS(22),
        PHYSICS_2D_ISLAND_COUNT(23),
        PHYSICS_3D_ACTIVE_OBJECTS(24),
        PHYSICS_3D_COLLISION_PAIRS(25),
        PHYSICS_3D_ISLAND_COUNT(26),
        AUDIO_OUTPUT_LATENCY(27),
        MONITOR_MAX(28),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
        }
    }


    @ThreadLocal    companion object {
        infix fun from(other: Object): Performance = Performance("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Performance = fromVariant(Performance(""), other)


        // Constants
        const val TIME_FPS: Long = 0
        const val TIME_PROCESS: Long = 1
        const val TIME_PHYSICS_PROCESS: Long = 2
        const val MEMORY_STATIC: Long = 3
        const val MEMORY_DYNAMIC: Long = 4
        const val MEMORY_STATIC_MAX: Long = 5
        const val MEMORY_DYNAMIC_MAX: Long = 6
        const val MEMORY_MESSAGE_BUFFER_MAX: Long = 7
        const val OBJECT_COUNT: Long = 8
        const val OBJECT_RESOURCE_COUNT: Long = 9
        const val OBJECT_NODE_COUNT: Long = 10
        const val RENDER_OBJECTS_IN_FRAME: Long = 11
        const val RENDER_VERTICES_IN_FRAME: Long = 12
        const val RENDER_MATERIAL_CHANGES_IN_FRAME: Long = 13
        const val RENDER_SHADER_CHANGES_IN_FRAME: Long = 14
        const val RENDER_SURFACE_CHANGES_IN_FRAME: Long = 15
        const val RENDER_DRAW_CALLS_IN_FRAME: Long = 16
        const val RENDER_VIDEO_MEM_USED: Long = 17
        const val RENDER_TEXTURE_MEM_USED: Long = 18
        const val RENDER_VERTEX_MEM_USED: Long = 19
        const val RENDER_USAGE_VIDEO_MEM_TOTAL: Long = 20
        const val PHYSICS_2D_ACTIVE_OBJECTS: Long = 21
        const val PHYSICS_2D_COLLISION_PAIRS: Long = 22
        const val PHYSICS_2D_ISLAND_COUNT: Long = 23
        const val PHYSICS_3D_ACTIVE_OBJECTS: Long = 24
        const val PHYSICS_3D_COLLISION_PAIRS: Long = 25
        const val PHYSICS_3D_ISLAND_COUNT: Long = 26
        const val AUDIO_OUTPUT_LATENCY: Long = 27
        const val MONITOR_MAX: Long = 28


        private val rawMemory: COpaquePointer by lazy { getSingleton("Performance", "Performance") }


        // Properties


        // Methods
        private val getMonitorMethodBind: CPointer<godot_method_bind> by lazy { getMB("Performance", "get_monitor") }
        fun getMonitor(monitor: Long): Double {
            return _icall_Double_Long(getMonitorMethodBind, this.rawMemory, monitor)
        }


    }
}
