package godot

import godot.GIProbe
import godot.core.Godot.shouldInitPtr
import godot.core.Vector3
import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_GIProbeData
import godot.icalls._icall_Long
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_Vector3
import godot.icalls._icall_Unit_nObject_Boolean
import godot.icalls._icall_Vector3
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Unit

open class GIProbe internal constructor(
  _ignore: Any?
) : VisualInstance(_ignore) {
  open var bias: Double
    get() {
      val mb = getMethodBind("GIProbe","get_bias")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GIProbe","set_bias")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var compress: Boolean
    get() {
      val mb = getMethodBind("GIProbe","is_compressed")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GIProbe","set_compress")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var data: GIProbeData
    get() {
      val mb = getMethodBind("GIProbe","get_probe_data")
      return _icall_GIProbeData(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GIProbe","set_probe_data")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var dynamicRange: Long
    get() {
      val mb = getMethodBind("GIProbe","get_dynamic_range")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GIProbe","set_dynamic_range")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var energy: Double
    get() {
      val mb = getMethodBind("GIProbe","get_energy")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GIProbe","set_energy")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var extents: Vector3
    get() {
      val mb = getMethodBind("GIProbe","get_extents")
      return _icall_Vector3(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GIProbe","set_extents")
      _icall_Unit_Vector3(mb, this.ptr, value)
    }

  open var interior: Boolean
    get() {
      val mb = getMethodBind("GIProbe","is_interior")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GIProbe","set_interior")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var normalBias: Double
    get() {
      val mb = getMethodBind("GIProbe","get_normal_bias")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GIProbe","set_normal_bias")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var propagation: Double
    get() {
      val mb = getMethodBind("GIProbe","get_propagation")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GIProbe","set_propagation")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var subdiv: Long
    get() {
      val mb = getMethodBind("GIProbe","get_subdiv")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GIProbe","set_subdiv")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("GIProbe", "GIProbe")
        }

  }

  open fun extents(schedule: Vector3.() -> Unit): Vector3 = extents.apply{
      schedule(this)
      extents = this
  }


  open fun bake(fromNode: Node? = null, createVisualDebug: Boolean = false) {
    val mb = getMethodBind("GIProbe","bake")
    _icall_Unit_nObject_Boolean( mb, this.ptr, fromNode, createVisualDebug)
  }

  open fun debugBake() {
    val mb = getMethodBind("GIProbe","debug_bake")
    _icall_Unit( mb, this.ptr)
  }

  open fun getBias(): Double {
    val mb = getMethodBind("GIProbe","get_bias")
    return _icall_Double( mb, this.ptr)
  }

  open fun getDynamicRange(): Long {
    val mb = getMethodBind("GIProbe","get_dynamic_range")
    return _icall_Long( mb, this.ptr)
  }

  open fun getEnergy(): Double {
    val mb = getMethodBind("GIProbe","get_energy")
    return _icall_Double( mb, this.ptr)
  }

  open fun getExtents(): Vector3 {
    val mb = getMethodBind("GIProbe","get_extents")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun getNormalBias(): Double {
    val mb = getMethodBind("GIProbe","get_normal_bias")
    return _icall_Double( mb, this.ptr)
  }

  open fun getProbeData(): GIProbeData {
    val mb = getMethodBind("GIProbe","get_probe_data")
    return _icall_GIProbeData( mb, this.ptr)
  }

  open fun getPropagation(): Double {
    val mb = getMethodBind("GIProbe","get_propagation")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSubdiv(): GIProbe.Subdiv {
    val mb = getMethodBind("GIProbe","get_subdiv")
    return GIProbe.Subdiv.from( _icall_Long( mb, this.ptr))
  }

  open fun isCompressed(): Boolean {
    val mb = getMethodBind("GIProbe","is_compressed")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isInterior(): Boolean {
    val mb = getMethodBind("GIProbe","is_interior")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setBias(max: Double) {
    val mb = getMethodBind("GIProbe","set_bias")
    _icall_Unit_Double( mb, this.ptr, max)
  }

  open fun setCompress(enable: Boolean) {
    val mb = getMethodBind("GIProbe","set_compress")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setDynamicRange(max: Long) {
    val mb = getMethodBind("GIProbe","set_dynamic_range")
    _icall_Unit_Long( mb, this.ptr, max)
  }

  open fun setEnergy(max: Double) {
    val mb = getMethodBind("GIProbe","set_energy")
    _icall_Unit_Double( mb, this.ptr, max)
  }

  open fun setExtents(extents: Vector3) {
    val mb = getMethodBind("GIProbe","set_extents")
    _icall_Unit_Vector3( mb, this.ptr, extents)
  }

  open fun setInterior(enable: Boolean) {
    val mb = getMethodBind("GIProbe","set_interior")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setNormalBias(max: Double) {
    val mb = getMethodBind("GIProbe","set_normal_bias")
    _icall_Unit_Double( mb, this.ptr, max)
  }

  open fun setProbeData(data: GIProbeData) {
    val mb = getMethodBind("GIProbe","set_probe_data")
    _icall_Unit_Object( mb, this.ptr, data)
  }

  open fun setPropagation(max: Double) {
    val mb = getMethodBind("GIProbe","set_propagation")
    _icall_Unit_Double( mb, this.ptr, max)
  }

  open fun setSubdiv(subdiv: Long) {
    val mb = getMethodBind("GIProbe","set_subdiv")
    _icall_Unit_Long( mb, this.ptr, subdiv)
  }

  enum class Subdiv(
    id: Long
  ) {
    SUBDIV_64(0),

    SUBDIV_128(1),

    SUBDIV_256(2),

    SUBDIV_512(3),

    SUBDIV_MAX(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val SUBDIV_128: Long = 1

    final const val SUBDIV_256: Long = 2

    final const val SUBDIV_512: Long = 3

    final const val SUBDIV_64: Long = 0

    final const val SUBDIV_MAX: Long = 4
  }
}
