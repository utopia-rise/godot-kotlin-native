// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.AABB
import godot.core.RID
import godot.icalls._icall_AABB
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Long
import godot.icalls._icall_RID
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Boolean
import godot.icalls._icall_Unit_RID
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError

open class VisualInstance internal constructor(
  _ignore: Any?
) : Spatial(_ignore) {
  open var layers: Long
    get() {
      val mb = getMethodBind("VisualInstance","get_layer_mask")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("VisualInstance","set_layer_mask")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  internal constructor() : this(null)

  open fun _getVisualInstanceRid(): RID {
    throw NotImplementedError("_get_visual_instance_rid is not implemented for VisualInstance")
  }

  open fun getAabb(): AABB {
    val mb = getMethodBind("VisualInstance","get_aabb")
    return _icall_AABB( mb, this.ptr)
  }

  open fun getBase(): RID {
    val mb = getMethodBind("VisualInstance","get_base")
    return _icall_RID( mb, this.ptr)
  }

  open fun getInstance(): RID {
    val mb = getMethodBind("VisualInstance","get_instance")
    return _icall_RID( mb, this.ptr)
  }

  open fun getLayerMask(): Long {
    val mb = getMethodBind("VisualInstance","get_layer_mask")
    return _icall_Long( mb, this.ptr)
  }

  open fun getLayerMaskBit(layer: Long): Boolean {
    val mb = getMethodBind("VisualInstance","get_layer_mask_bit")
    return _icall_Boolean_Long( mb, this.ptr, layer)
  }

  open fun getTransformedAabb(): AABB {
    val mb = getMethodBind("VisualInstance","get_transformed_aabb")
    return _icall_AABB( mb, this.ptr)
  }

  open fun setBase(base: RID) {
    val mb = getMethodBind("VisualInstance","set_base")
    _icall_Unit_RID( mb, this.ptr, base)
  }

  open fun setLayerMask(mask: Long) {
    val mb = getMethodBind("VisualInstance","set_layer_mask")
    _icall_Unit_Long( mb, this.ptr, mask)
  }

  open fun setLayerMaskBit(layer: Long, enabled: Boolean) {
    val mb = getMethodBind("VisualInstance","set_layer_mask_bit")
    _icall_Unit_Long_Boolean( mb, this.ptr, layer, enabled)
  }
}
