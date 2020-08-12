// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Dictionary
import godot.core.Godot.shouldInitPtr
import godot.core.Rect2
import godot.core.VariantArray
import godot.core.Vector2
import godot.icalls._icall_Boolean_Vector2
import godot.icalls._icall_Long
import godot.icalls._icall_Unit_Long_Rect2
import godot.icalls._icall_Unit_Object_Double
import godot.icalls._icall_Unit_Rect2_Boolean
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Unit_Vector2_Boolean
import godot.icalls._icall_VariantArray_Rect2_Double
import godot.icalls._icall_Vector2
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError

open class BitMap internal constructor(
  _ignore: Any?
) : Resource(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("BitMap", "BitMap")
        }

  }

  open fun _getData(): Dictionary {
    throw NotImplementedError("_get_data is not implemented for BitMap")
  }

  open fun _setData(arg0: Dictionary) {
  }

  open fun create(size: Vector2) {
    val mb = getMethodBind("BitMap","create")
    _icall_Unit_Vector2( mb, this.ptr, size)
  }

  open fun createFromImageAlpha(image: Image, threshold: Double = 0.1) {
    val mb = getMethodBind("BitMap","create_from_image_alpha")
    _icall_Unit_Object_Double( mb, this.ptr, image, threshold)
  }

  open fun getBit(position: Vector2): Boolean {
    val mb = getMethodBind("BitMap","get_bit")
    return _icall_Boolean_Vector2( mb, this.ptr, position)
  }

  open fun getSize(): Vector2 {
    val mb = getMethodBind("BitMap","get_size")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getTrueBitCount(): Long {
    val mb = getMethodBind("BitMap","get_true_bit_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun growMask(pixels: Long, rect: Rect2) {
    val mb = getMethodBind("BitMap","grow_mask")
    _icall_Unit_Long_Rect2( mb, this.ptr, pixels, rect)
  }

  open fun opaqueToPolygons(rect: Rect2, epsilon: Double = 2.0): VariantArray {
    val mb = getMethodBind("BitMap","opaque_to_polygons")
    return _icall_VariantArray_Rect2_Double( mb, this.ptr, rect, epsilon)
  }

  open fun setBit(position: Vector2, bit: Boolean) {
    val mb = getMethodBind("BitMap","set_bit")
    _icall_Unit_Vector2_Boolean( mb, this.ptr, position, bit)
  }

  open fun setBitRect(rect: Rect2, bit: Boolean) {
    val mb = getMethodBind("BitMap","set_bit_rect")
    _icall_Unit_Rect2_Boolean( mb, this.ptr, rect, bit)
  }
}
