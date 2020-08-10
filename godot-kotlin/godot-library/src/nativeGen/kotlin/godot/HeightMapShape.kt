package godot

import godot.core.Godot.shouldInitPtr
import godot.core.PoolRealArray
import godot.icalls._icall_Long
import godot.icalls._icall_PoolRealArray
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_PoolRealArray
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Long

open class HeightMapShape internal constructor(
  _ignore: Any?
) : Shape(_ignore) {
  open var mapData: PoolRealArray
    get() {
      val mb = getMethodBind("HeightMapShape","get_map_data")
      return _icall_PoolRealArray(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("HeightMapShape","set_map_data")
      _icall_Unit_PoolRealArray(mb, this.ptr, value)
    }

  open var mapDepth: Long
    get() {
      val mb = getMethodBind("HeightMapShape","get_map_depth")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("HeightMapShape","set_map_depth")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var mapWidth: Long
    get() {
      val mb = getMethodBind("HeightMapShape","get_map_width")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("HeightMapShape","set_map_width")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("HeightMapShape", "HeightMapShape")
        }

  }

  open fun getMapData(): PoolRealArray {
    val mb = getMethodBind("HeightMapShape","get_map_data")
    return _icall_PoolRealArray( mb, this.ptr)
  }

  open fun getMapDepth(): Long {
    val mb = getMethodBind("HeightMapShape","get_map_depth")
    return _icall_Long( mb, this.ptr)
  }

  open fun getMapWidth(): Long {
    val mb = getMethodBind("HeightMapShape","get_map_width")
    return _icall_Long( mb, this.ptr)
  }

  open fun setMapData(data: PoolRealArray) {
    val mb = getMethodBind("HeightMapShape","set_map_data")
    _icall_Unit_PoolRealArray( mb, this.ptr, data)
  }

  open fun setMapDepth(height: Long) {
    val mb = getMethodBind("HeightMapShape","set_map_depth")
    _icall_Unit_Long( mb, this.ptr, height)
  }

  open fun setMapWidth(width: Long) {
    val mb = getMethodBind("HeightMapShape","set_map_width")
    _icall_Unit_Long( mb, this.ptr, width)
  }
}
