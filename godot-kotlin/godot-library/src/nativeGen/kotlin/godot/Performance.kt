// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot
import godot.icalls._icall_Double_Long
import godot.internal.type.nullSafe
import godot.internal.utils.getMethodBind
import kotlin.Double
import kotlin.Long
import kotlin.requireNotNull
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

object Performance : Object() {
  init {
    memScoped {
        val ptr = nullSafe(Godot.gdnative.godot_global_get_singleton).invoke("Performance".cstr.ptr)
        requireNotNull(ptr) { "No instance found for singleton Performance" }
        this@Performance.ptr = ptr
    }
  }

  fun getMonitor(monitor: Long): Double {
    val mb = getMethodBind("Performance","get_monitor")
    return _icall_Double_Long( mb, this.ptr, monitor)
  }

  enum class Monitor(
    id: Long
  ) {
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

    OBJECT_ORPHAN_NODE_COUNT(11),

    RENDER_OBJECTS_IN_FRAME(12),

    RENDER_VERTICES_IN_FRAME(13),

    RENDER_MATERIAL_CHANGES_IN_FRAME(14),

    RENDER_SHADER_CHANGES_IN_FRAME(15),

    RENDER_SURFACE_CHANGES_IN_FRAME(16),

    RENDER_DRAW_CALLS_IN_FRAME(17),

    RENDER_2D_ITEMS_IN_FRAME(18),

    RENDER_2D_DRAW_CALLS_IN_FRAME(19),

    RENDER_VIDEO_MEM_USED(20),

    RENDER_TEXTURE_MEM_USED(21),

    RENDER_VERTEX_MEM_USED(22),

    RENDER_USAGE_VIDEO_MEM_TOTAL(23),

    PHYSICS_2D_ACTIVE_OBJECTS(24),

    PHYSICS_2D_COLLISION_PAIRS(25),

    PHYSICS_2D_ISLAND_COUNT(26),

    PHYSICS_3D_ACTIVE_OBJECTS(27),

    PHYSICS_3D_COLLISION_PAIRS(28),

    PHYSICS_3D_ISLAND_COUNT(29),

    AUDIO_OUTPUT_LATENCY(30),

    MONITOR_MAX(31);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }
}
