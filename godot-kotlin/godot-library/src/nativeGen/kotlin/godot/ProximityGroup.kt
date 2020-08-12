// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.ProximityGroup
import godot.core.Godot.shouldInitPtr
import godot.core.Signal2
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector3
import godot.core.signal
import godot.icalls._icall_Long
import godot.icalls._icall_String
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_String
import godot.icalls._icall_Unit_String_Variant
import godot.icalls._icall_Unit_Vector3
import godot.icalls._icall_Vector3
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Long
import kotlin.String
import kotlin.Unit

open class ProximityGroup internal constructor(
  _ignore: Any?
) : Spatial(_ignore) {
  val broadcast: Signal2<String, VariantArray> by signal("group_name", "parameters")

  open var dispatchMode: Long
    get() {
      val mb = getMethodBind("ProximityGroup","get_dispatch_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ProximityGroup","set_dispatch_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var gridRadius: Vector3
    get() {
      val mb = getMethodBind("ProximityGroup","get_grid_radius")
      return _icall_Vector3(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ProximityGroup","set_grid_radius")
      _icall_Unit_Vector3(mb, this.ptr, value)
    }

  open var groupName: String
    get() {
      val mb = getMethodBind("ProximityGroup","get_group_name")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ProximityGroup","set_group_name")
      _icall_Unit_String(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("ProximityGroup", "ProximityGroup")
        }

  }

  open fun gridRadius(schedule: Vector3.() -> Unit): Vector3 = gridRadius.apply{
      schedule(this)
      gridRadius = this
  }


  open fun _proximityGroupBroadcast(name: String, params: Variant) {
  }

  open fun broadcast(name: String, parameters: Variant) {
    val mb = getMethodBind("ProximityGroup","broadcast")
    _icall_Unit_String_Variant( mb, this.ptr, name, parameters)
  }

  open fun getDispatchMode(): ProximityGroup.DispatchMode {
    val mb = getMethodBind("ProximityGroup","get_dispatch_mode")
    return ProximityGroup.DispatchMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getGridRadius(): Vector3 {
    val mb = getMethodBind("ProximityGroup","get_grid_radius")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun getGroupName(): String {
    val mb = getMethodBind("ProximityGroup","get_group_name")
    return _icall_String( mb, this.ptr)
  }

  open fun setDispatchMode(mode: Long) {
    val mb = getMethodBind("ProximityGroup","set_dispatch_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setGridRadius(radius: Vector3) {
    val mb = getMethodBind("ProximityGroup","set_grid_radius")
    _icall_Unit_Vector3( mb, this.ptr, radius)
  }

  open fun setGroupName(name: String) {
    val mb = getMethodBind("ProximityGroup","set_group_name")
    _icall_Unit_String( mb, this.ptr, name)
  }

  enum class DispatchMode(
    id: Long
  ) {
    MODE_PROXY(0),

    MODE_SIGNAL(1);

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
