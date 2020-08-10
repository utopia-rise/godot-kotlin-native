// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.AABB
import godot.core.Godot.shouldInitPtr
import godot.core.PoolIntArray
import godot.core.Transform
import godot.icalls._icall_AABB
import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_PoolIntArray
import godot.icalls._icall_Transform
import godot.icalls._icall_Unit_AABB
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_PoolIntArray
import godot.icalls._icall_Unit_Transform
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Unit

open class GIProbeData internal constructor(
  _ignore: Any?
) : Resource(_ignore) {
  open var bias: Double
    get() {
      val mb = getMethodBind("GIProbeData","get_bias")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GIProbeData","set_bias")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var bounds: AABB
    get() {
      val mb = getMethodBind("GIProbeData","get_bounds")
      return _icall_AABB(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GIProbeData","set_bounds")
      _icall_Unit_AABB(mb, this.ptr, value)
    }

  open var cellSize: Double
    get() {
      val mb = getMethodBind("GIProbeData","get_cell_size")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GIProbeData","set_cell_size")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var compress: Boolean
    get() {
      val mb = getMethodBind("GIProbeData","is_compressed")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GIProbeData","set_compress")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var dynamicData: PoolIntArray
    get() {
      val mb = getMethodBind("GIProbeData","get_dynamic_data")
      return _icall_PoolIntArray(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GIProbeData","set_dynamic_data")
      _icall_Unit_PoolIntArray(mb, this.ptr, value)
    }

  open var dynamicRange: Long
    get() {
      val mb = getMethodBind("GIProbeData","get_dynamic_range")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GIProbeData","set_dynamic_range")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var energy: Double
    get() {
      val mb = getMethodBind("GIProbeData","get_energy")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GIProbeData","set_energy")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var interior: Boolean
    get() {
      val mb = getMethodBind("GIProbeData","is_interior")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GIProbeData","set_interior")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var normalBias: Double
    get() {
      val mb = getMethodBind("GIProbeData","get_normal_bias")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GIProbeData","set_normal_bias")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var propagation: Double
    get() {
      val mb = getMethodBind("GIProbeData","get_propagation")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GIProbeData","set_propagation")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var toCellXform: Transform
    get() {
      val mb = getMethodBind("GIProbeData","get_to_cell_xform")
      return _icall_Transform(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("GIProbeData","set_to_cell_xform")
      _icall_Unit_Transform(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("GIProbeData", "GIProbeData")
        }

  }

  open fun bounds(schedule: AABB.() -> Unit): AABB = bounds.apply{
      schedule(this)
      bounds = this
  }


  open fun toCellXform(schedule: Transform.() -> Unit): Transform = toCellXform.apply{
      schedule(this)
      toCellXform = this
  }


  open fun getBias(): Double {
    val mb = getMethodBind("GIProbeData","get_bias")
    return _icall_Double( mb, this.ptr)
  }

  open fun getBounds(): AABB {
    val mb = getMethodBind("GIProbeData","get_bounds")
    return _icall_AABB( mb, this.ptr)
  }

  open fun getCellSize(): Double {
    val mb = getMethodBind("GIProbeData","get_cell_size")
    return _icall_Double( mb, this.ptr)
  }

  open fun getDynamicData(): PoolIntArray {
    val mb = getMethodBind("GIProbeData","get_dynamic_data")
    return _icall_PoolIntArray( mb, this.ptr)
  }

  open fun getDynamicRange(): Long {
    val mb = getMethodBind("GIProbeData","get_dynamic_range")
    return _icall_Long( mb, this.ptr)
  }

  open fun getEnergy(): Double {
    val mb = getMethodBind("GIProbeData","get_energy")
    return _icall_Double( mb, this.ptr)
  }

  open fun getNormalBias(): Double {
    val mb = getMethodBind("GIProbeData","get_normal_bias")
    return _icall_Double( mb, this.ptr)
  }

  open fun getPropagation(): Double {
    val mb = getMethodBind("GIProbeData","get_propagation")
    return _icall_Double( mb, this.ptr)
  }

  open fun getToCellXform(): Transform {
    val mb = getMethodBind("GIProbeData","get_to_cell_xform")
    return _icall_Transform( mb, this.ptr)
  }

  open fun isCompressed(): Boolean {
    val mb = getMethodBind("GIProbeData","is_compressed")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isInterior(): Boolean {
    val mb = getMethodBind("GIProbeData","is_interior")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setBias(bias: Double) {
    val mb = getMethodBind("GIProbeData","set_bias")
    _icall_Unit_Double( mb, this.ptr, bias)
  }

  open fun setBounds(bounds: AABB) {
    val mb = getMethodBind("GIProbeData","set_bounds")
    _icall_Unit_AABB( mb, this.ptr, bounds)
  }

  open fun setCellSize(cellSize: Double) {
    val mb = getMethodBind("GIProbeData","set_cell_size")
    _icall_Unit_Double( mb, this.ptr, cellSize)
  }

  open fun setCompress(compress: Boolean) {
    val mb = getMethodBind("GIProbeData","set_compress")
    _icall_Unit_Boolean( mb, this.ptr, compress)
  }

  open fun setDynamicData(dynamicData: PoolIntArray) {
    val mb = getMethodBind("GIProbeData","set_dynamic_data")
    _icall_Unit_PoolIntArray( mb, this.ptr, dynamicData)
  }

  open fun setDynamicRange(dynamicRange: Long) {
    val mb = getMethodBind("GIProbeData","set_dynamic_range")
    _icall_Unit_Long( mb, this.ptr, dynamicRange)
  }

  open fun setEnergy(energy: Double) {
    val mb = getMethodBind("GIProbeData","set_energy")
    _icall_Unit_Double( mb, this.ptr, energy)
  }

  open fun setInterior(interior: Boolean) {
    val mb = getMethodBind("GIProbeData","set_interior")
    _icall_Unit_Boolean( mb, this.ptr, interior)
  }

  open fun setNormalBias(bias: Double) {
    val mb = getMethodBind("GIProbeData","set_normal_bias")
    _icall_Unit_Double( mb, this.ptr, bias)
  }

  open fun setPropagation(propagation: Double) {
    val mb = getMethodBind("GIProbeData","set_propagation")
    _icall_Unit_Double( mb, this.ptr, propagation)
  }

  open fun setToCellXform(toCellXform: Transform) {
    val mb = getMethodBind("GIProbeData","set_to_cell_xform")
    _icall_Unit_Transform( mb, this.ptr, toCellXform)
  }
}
