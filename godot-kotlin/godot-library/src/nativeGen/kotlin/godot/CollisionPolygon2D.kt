// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.CollisionPolygon2D
import godot.core.Godot.shouldInitPtr
import godot.core.PoolVector2Array
import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_PoolVector2Array
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_PoolVector2Array
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long

open class CollisionPolygon2D internal constructor(
  _ignore: Any?
) : Node2D(_ignore) {
  open var buildMode: Long
    get() {
      val mb = getMethodBind("CollisionPolygon2D","get_build_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CollisionPolygon2D","set_build_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var disabled: Boolean
    get() {
      val mb = getMethodBind("CollisionPolygon2D","is_disabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CollisionPolygon2D","set_disabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var oneWayCollision: Boolean
    get() {
      val mb = getMethodBind("CollisionPolygon2D","is_one_way_collision_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CollisionPolygon2D","set_one_way_collision")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var oneWayCollisionMargin: Double
    get() {
      val mb = getMethodBind("CollisionPolygon2D","get_one_way_collision_margin")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CollisionPolygon2D","set_one_way_collision_margin")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var polygon: PoolVector2Array
    get() {
      val mb = getMethodBind("CollisionPolygon2D","get_polygon")
      return _icall_PoolVector2Array(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("CollisionPolygon2D","set_polygon")
      _icall_Unit_PoolVector2Array(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("CollisionPolygon2D", "CollisionPolygon2D")
        }

  }

  open fun getBuildMode(): CollisionPolygon2D.BuildMode {
    val mb = getMethodBind("CollisionPolygon2D","get_build_mode")
    return CollisionPolygon2D.BuildMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getOneWayCollisionMargin(): Double {
    val mb = getMethodBind("CollisionPolygon2D","get_one_way_collision_margin")
    return _icall_Double( mb, this.ptr)
  }

  open fun getPolygon(): PoolVector2Array {
    val mb = getMethodBind("CollisionPolygon2D","get_polygon")
    return _icall_PoolVector2Array( mb, this.ptr)
  }

  open fun isDisabled(): Boolean {
    val mb = getMethodBind("CollisionPolygon2D","is_disabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isOneWayCollisionEnabled(): Boolean {
    val mb = getMethodBind("CollisionPolygon2D","is_one_way_collision_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setBuildMode(buildMode: Long) {
    val mb = getMethodBind("CollisionPolygon2D","set_build_mode")
    _icall_Unit_Long( mb, this.ptr, buildMode)
  }

  open fun setDisabled(disabled: Boolean) {
    val mb = getMethodBind("CollisionPolygon2D","set_disabled")
    _icall_Unit_Boolean( mb, this.ptr, disabled)
  }

  open fun setOneWayCollision(enabled: Boolean) {
    val mb = getMethodBind("CollisionPolygon2D","set_one_way_collision")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setOneWayCollisionMargin(margin: Double) {
    val mb = getMethodBind("CollisionPolygon2D","set_one_way_collision_margin")
    _icall_Unit_Double( mb, this.ptr, margin)
  }

  open fun setPolygon(polygon: PoolVector2Array) {
    val mb = getMethodBind("CollisionPolygon2D","set_polygon")
    _icall_Unit_PoolVector2Array( mb, this.ptr, polygon)
  }

  enum class BuildMode(
    id: Long
  ) {
    BUILD_SOLIDS(0),

    BUILD_SEGMENTS(1);

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
