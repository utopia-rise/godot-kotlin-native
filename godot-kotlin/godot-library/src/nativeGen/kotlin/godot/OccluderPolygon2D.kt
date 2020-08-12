// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.OccluderPolygon2D
import godot.core.Godot.shouldInitPtr
import godot.core.PoolVector2Array
import godot.icalls._icall_Boolean
import godot.icalls._icall_Long
import godot.icalls._icall_PoolVector2Array
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_PoolVector2Array
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Boolean
import kotlin.Long

open class OccluderPolygon2D internal constructor(
  _ignore: Any?
) : Resource(_ignore) {
  open var closed: Boolean
    get() {
      val mb = getMethodBind("OccluderPolygon2D","is_closed")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("OccluderPolygon2D","set_closed")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var cullMode: Long
    get() {
      val mb = getMethodBind("OccluderPolygon2D","get_cull_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("OccluderPolygon2D","set_cull_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var polygon: PoolVector2Array
    get() {
      val mb = getMethodBind("OccluderPolygon2D","get_polygon")
      return _icall_PoolVector2Array(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("OccluderPolygon2D","set_polygon")
      _icall_Unit_PoolVector2Array(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("OccluderPolygon2D", "OccluderPolygon2D")
        }

  }

  open fun getCullMode(): OccluderPolygon2D.CullMode {
    val mb = getMethodBind("OccluderPolygon2D","get_cull_mode")
    return OccluderPolygon2D.CullMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getPolygon(): PoolVector2Array {
    val mb = getMethodBind("OccluderPolygon2D","get_polygon")
    return _icall_PoolVector2Array( mb, this.ptr)
  }

  open fun isClosed(): Boolean {
    val mb = getMethodBind("OccluderPolygon2D","is_closed")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setClosed(closed: Boolean) {
    val mb = getMethodBind("OccluderPolygon2D","set_closed")
    _icall_Unit_Boolean( mb, this.ptr, closed)
  }

  open fun setCullMode(cullMode: Long) {
    val mb = getMethodBind("OccluderPolygon2D","set_cull_mode")
    _icall_Unit_Long( mb, this.ptr, cullMode)
  }

  open fun setPolygon(polygon: PoolVector2Array) {
    val mb = getMethodBind("OccluderPolygon2D","set_polygon")
    _icall_Unit_PoolVector2Array( mb, this.ptr, polygon)
  }

  enum class CullMode(
    id: Long
  ) {
    CULL_DISABLED(0),

    CULL_CLOCKWISE(1),

    CULL_COUNTER_CLOCKWISE(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object
}
