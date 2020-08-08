package godot

import godot.ClippedCamera
import godot.core.Godot.shouldInitPtr
import godot.core.RID
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Boolean
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_RID
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long

open class ClippedCamera internal constructor(
  _ignore: Any?
) : Camera(_ignore) {
  open var clipToAreas: Boolean
    get() {
      val mb = getMethodBind("ClippedCamera","is_clip_to_areas_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ClippedCamera","set_clip_to_areas")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var clipToBodies: Boolean
    get() {
      val mb = getMethodBind("ClippedCamera","is_clip_to_bodies_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ClippedCamera","set_clip_to_bodies")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var collisionMask: Long
    get() {
      val mb = getMethodBind("ClippedCamera","get_collision_mask")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ClippedCamera","set_collision_mask")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var margin: Double
    get() {
      val mb = getMethodBind("ClippedCamera","get_margin")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ClippedCamera","set_margin")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var processMode: Long
    get() {
      val mb = getMethodBind("ClippedCamera","get_process_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ClippedCamera","set_process_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("ClippedCamera", "ClippedCamera")
        }

  }

  open fun addException(node: Object) {
    val mb = getMethodBind("ClippedCamera","add_exception")
    _icall_Unit_Object( mb, this.ptr, node)
  }

  open fun addExceptionRid(rid: RID) {
    val mb = getMethodBind("ClippedCamera","add_exception_rid")
    _icall_Unit_RID( mb, this.ptr, rid)
  }

  open fun clearExceptions() {
    val mb = getMethodBind("ClippedCamera","clear_exceptions")
    _icall_Unit( mb, this.ptr)
  }

  open fun getClipOffset(): Double {
    val mb = getMethodBind("ClippedCamera","get_clip_offset")
    return _icall_Double( mb, this.ptr)
  }

  open fun getCollisionMask(): Long {
    val mb = getMethodBind("ClippedCamera","get_collision_mask")
    return _icall_Long( mb, this.ptr)
  }

  open fun getCollisionMaskBit(bit: Long): Boolean {
    val mb = getMethodBind("ClippedCamera","get_collision_mask_bit")
    return _icall_Boolean_Long( mb, this.ptr, bit)
  }

  open fun getMargin(): Double {
    val mb = getMethodBind("ClippedCamera","get_margin")
    return _icall_Double( mb, this.ptr)
  }

  open fun getProcessMode(): ClippedCamera.ProcessMode {
    val mb = getMethodBind("ClippedCamera","get_process_mode")
    return ClippedCamera.ProcessMode.from( _icall_Long( mb, this.ptr))
  }

  open fun isClipToAreasEnabled(): Boolean {
    val mb = getMethodBind("ClippedCamera","is_clip_to_areas_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isClipToBodiesEnabled(): Boolean {
    val mb = getMethodBind("ClippedCamera","is_clip_to_bodies_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun removeException(node: Object) {
    val mb = getMethodBind("ClippedCamera","remove_exception")
    _icall_Unit_Object( mb, this.ptr, node)
  }

  open fun removeExceptionRid(rid: RID) {
    val mb = getMethodBind("ClippedCamera","remove_exception_rid")
    _icall_Unit_RID( mb, this.ptr, rid)
  }

  open fun setClipToAreas(enable: Boolean) {
    val mb = getMethodBind("ClippedCamera","set_clip_to_areas")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setClipToBodies(enable: Boolean) {
    val mb = getMethodBind("ClippedCamera","set_clip_to_bodies")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setCollisionMask(mask: Long) {
    val mb = getMethodBind("ClippedCamera","set_collision_mask")
    _icall_Unit_Long( mb, this.ptr, mask)
  }

  open fun setCollisionMaskBit(bit: Long, value: Boolean) {
    val mb = getMethodBind("ClippedCamera","set_collision_mask_bit")
    _icall_Unit_Long_Boolean( mb, this.ptr, bit, value)
  }

  open fun setMargin(margin: Double) {
    val mb = getMethodBind("ClippedCamera","set_margin")
    _icall_Unit_Double( mb, this.ptr, margin)
  }

  open fun setProcessMode(processMode: Long) {
    val mb = getMethodBind("ClippedCamera","set_process_mode")
    _icall_Unit_Long( mb, this.ptr, processMode)
  }

  enum class ProcessMode(
    id: Long
  ) {
    CLIP_PROCESS_PHYSICS(0),

    CLIP_PROCESS_IDLE(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val CLIP_PROCESS_IDLE: Long = 1

    final const val CLIP_PROCESS_PHYSICS: Long = 0
  }
}
