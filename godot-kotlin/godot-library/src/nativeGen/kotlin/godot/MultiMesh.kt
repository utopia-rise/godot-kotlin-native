// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.MultiMesh
import godot.core.AABB
import godot.core.Color
import godot.core.Godot.shouldInitPtr
import godot.core.PoolColorArray
import godot.core.PoolRealArray
import godot.core.PoolVector2Array
import godot.core.PoolVector3Array
import godot.core.Transform
import godot.core.Transform2D
import godot.icalls._icall_AABB
import godot.icalls._icall_Color_Long
import godot.icalls._icall_Long
import godot.icalls._icall_Mesh
import godot.icalls._icall_Transform2D_Long
import godot.icalls._icall_Transform_Long
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Color
import godot.icalls._icall_Unit_Long_Transform
import godot.icalls._icall_Unit_Long_Transform2D
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_PoolRealArray
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Long
import kotlin.NotImplementedError

open class MultiMesh internal constructor(
  _ignore: Any?
) : Resource(_ignore) {
  open var colorFormat: Long
    get() {
      val mb = getMethodBind("MultiMesh","get_color_format")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("MultiMesh","set_color_format")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var customDataFormat: Long
    get() {
      val mb = getMethodBind("MultiMesh","get_custom_data_format")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("MultiMesh","set_custom_data_format")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var instanceCount: Long
    get() {
      val mb = getMethodBind("MultiMesh","get_instance_count")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("MultiMesh","set_instance_count")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var mesh: Mesh
    get() {
      val mb = getMethodBind("MultiMesh","get_mesh")
      return _icall_Mesh(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("MultiMesh","set_mesh")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var transformFormat: Long
    get() {
      val mb = getMethodBind("MultiMesh","get_transform_format")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("MultiMesh","set_transform_format")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var visibleInstanceCount: Long
    get() {
      val mb = getMethodBind("MultiMesh","get_visible_instance_count")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("MultiMesh","set_visible_instance_count")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("MultiMesh", "MultiMesh")
        }

  }

  open fun _get_color_array(): PoolColorArray {
    throw NotImplementedError("_get_color_array is not implemented for MultiMesh")
  }

  open fun _get_custom_data_array(): PoolColorArray {
    throw NotImplementedError("_get_custom_data_array is not implemented for MultiMesh")
  }

  open fun _get_transform_2d_array(): PoolVector2Array {
    throw NotImplementedError("_get_transform_2d_array is not implemented for MultiMesh")
  }

  open fun _get_transform_array(): PoolVector3Array {
    throw NotImplementedError("_get_transform_array is not implemented for MultiMesh")
  }

  open fun _set_color_array(arg0: PoolColorArray) {
  }

  open fun _set_custom_data_array(arg0: PoolColorArray) {
  }

  open fun _set_transform_2d_array(arg0: PoolVector2Array) {
  }

  open fun _set_transform_array(arg0: PoolVector3Array) {
  }

  open fun getAabb(): AABB {
    val mb = getMethodBind("MultiMesh","get_aabb")
    return _icall_AABB( mb, this.ptr)
  }

  open fun getColorFormat(): MultiMesh.ColorFormat {
    val mb = getMethodBind("MultiMesh","get_color_format")
    return MultiMesh.ColorFormat.from( _icall_Long( mb, this.ptr))
  }

  open fun getCustomDataFormat(): MultiMesh.CustomDataFormat {
    val mb = getMethodBind("MultiMesh","get_custom_data_format")
    return MultiMesh.CustomDataFormat.from( _icall_Long( mb, this.ptr))
  }

  open fun getInstanceColor(instance: Long): Color {
    val mb = getMethodBind("MultiMesh","get_instance_color")
    return _icall_Color_Long( mb, this.ptr, instance)
  }

  open fun getInstanceCount(): Long {
    val mb = getMethodBind("MultiMesh","get_instance_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getInstanceCustomData(instance: Long): Color {
    val mb = getMethodBind("MultiMesh","get_instance_custom_data")
    return _icall_Color_Long( mb, this.ptr, instance)
  }

  open fun getInstanceTransform(instance: Long): Transform {
    val mb = getMethodBind("MultiMesh","get_instance_transform")
    return _icall_Transform_Long( mb, this.ptr, instance)
  }

  open fun getInstanceTransform2d(instance: Long): Transform2D {
    val mb = getMethodBind("MultiMesh","get_instance_transform_2d")
    return _icall_Transform2D_Long( mb, this.ptr, instance)
  }

  open fun getMesh(): Mesh {
    val mb = getMethodBind("MultiMesh","get_mesh")
    return _icall_Mesh( mb, this.ptr)
  }

  open fun getTransformFormat(): MultiMesh.TransformFormat {
    val mb = getMethodBind("MultiMesh","get_transform_format")
    return MultiMesh.TransformFormat.from( _icall_Long( mb, this.ptr))
  }

  open fun getVisibleInstanceCount(): Long {
    val mb = getMethodBind("MultiMesh","get_visible_instance_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun setAsBulkArray(array: PoolRealArray) {
    val mb = getMethodBind("MultiMesh","set_as_bulk_array")
    _icall_Unit_PoolRealArray( mb, this.ptr, array)
  }

  open fun setColorFormat(format: Long) {
    val mb = getMethodBind("MultiMesh","set_color_format")
    _icall_Unit_Long( mb, this.ptr, format)
  }

  open fun setCustomDataFormat(format: Long) {
    val mb = getMethodBind("MultiMesh","set_custom_data_format")
    _icall_Unit_Long( mb, this.ptr, format)
  }

  open fun setInstanceColor(instance: Long, color: Color) {
    val mb = getMethodBind("MultiMesh","set_instance_color")
    _icall_Unit_Long_Color( mb, this.ptr, instance, color)
  }

  open fun setInstanceCount(count: Long) {
    val mb = getMethodBind("MultiMesh","set_instance_count")
    _icall_Unit_Long( mb, this.ptr, count)
  }

  open fun setInstanceCustomData(instance: Long, customData: Color) {
    val mb = getMethodBind("MultiMesh","set_instance_custom_data")
    _icall_Unit_Long_Color( mb, this.ptr, instance, customData)
  }

  open fun setInstanceTransform(instance: Long, transform: Transform) {
    val mb = getMethodBind("MultiMesh","set_instance_transform")
    _icall_Unit_Long_Transform( mb, this.ptr, instance, transform)
  }

  open fun setInstanceTransform2d(instance: Long, transform: Transform2D) {
    val mb = getMethodBind("MultiMesh","set_instance_transform_2d")
    _icall_Unit_Long_Transform2D( mb, this.ptr, instance, transform)
  }

  open fun setMesh(mesh: Mesh) {
    val mb = getMethodBind("MultiMesh","set_mesh")
    _icall_Unit_Object( mb, this.ptr, mesh)
  }

  open fun setTransformFormat(format: Long) {
    val mb = getMethodBind("MultiMesh","set_transform_format")
    _icall_Unit_Long( mb, this.ptr, format)
  }

  open fun setVisibleInstanceCount(count: Long) {
    val mb = getMethodBind("MultiMesh","set_visible_instance_count")
    _icall_Unit_Long( mb, this.ptr, count)
  }

  enum class TransformFormat(
    id: Long
  ) {
    TRANSFORM_2D(0),

    TRANSFORM_3D(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class CustomDataFormat(
    id: Long
  ) {
    CUSTOM_DATA_NONE(0),

    CUSTOM_DATA_8BIT(1),

    CUSTOM_DATA_FLOAT(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ColorFormat(
    id: Long
  ) {
    COLOR_NONE(0),

    COLOR_8BIT(1),

    COLOR_FLOAT(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val COLOR_8BIT: Long = 1

    final const val COLOR_FLOAT: Long = 2

    final const val COLOR_NONE: Long = 0

    final const val CUSTOM_DATA_8BIT: Long = 1

    final const val CUSTOM_DATA_FLOAT: Long = 2

    final const val CUSTOM_DATA_NONE: Long = 0

    final const val TRANSFORM_2D: Long = 0

    final const val TRANSFORM_3D: Long = 1
  }
}
