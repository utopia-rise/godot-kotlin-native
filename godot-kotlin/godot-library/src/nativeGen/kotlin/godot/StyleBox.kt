// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.RID
import godot.core.Rect2
import godot.core.Vector2
import godot.icalls._icall_Boolean_Vector2_Rect2
import godot.icalls._icall_CanvasItem
import godot.icalls._icall_Double_Long
import godot.icalls._icall_Unit_Long_Double
import godot.icalls._icall_Unit_RID_Rect2
import godot.icalls._icall_Vector2
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long

open class StyleBox internal constructor(
  _ignore: Any?
) : Resource(_ignore) {
  open var contentMarginBottom: Double
    get() {
      val mb = getMethodBind("StyleBox","get_default_margin")
      return _icall_Double_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("StyleBox","set_default_margin")
      _icall_Unit_Long_Double(mb, this.ptr, 3, value)
    }

  open var contentMarginLeft: Double
    get() {
      val mb = getMethodBind("StyleBox","get_default_margin")
      return _icall_Double_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("StyleBox","set_default_margin")
      _icall_Unit_Long_Double(mb, this.ptr, 0, value)
    }

  open var contentMarginRight: Double
    get() {
      val mb = getMethodBind("StyleBox","get_default_margin")
      return _icall_Double_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("StyleBox","set_default_margin")
      _icall_Unit_Long_Double(mb, this.ptr, 2, value)
    }

  open var contentMarginTop: Double
    get() {
      val mb = getMethodBind("StyleBox","get_default_margin")
      return _icall_Double_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("StyleBox","set_default_margin")
      _icall_Unit_Long_Double(mb, this.ptr, 1, value)
    }

  internal constructor() : this(null)

  open fun draw(canvasItem: RID, rect: Rect2) {
    val mb = getMethodBind("StyleBox","draw")
    _icall_Unit_RID_Rect2( mb, this.ptr, canvasItem, rect)
  }

  open fun getCenterSize(): Vector2 {
    val mb = getMethodBind("StyleBox","get_center_size")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getCurrentItemDrawn(): CanvasItem {
    val mb = getMethodBind("StyleBox","get_current_item_drawn")
    return _icall_CanvasItem( mb, this.ptr)
  }

  open fun getDefaultMargin(margin: Long): Double {
    val mb = getMethodBind("StyleBox","get_default_margin")
    return _icall_Double_Long( mb, this.ptr, margin)
  }

  open fun getMargin(margin: Long): Double {
    val mb = getMethodBind("StyleBox","get_margin")
    return _icall_Double_Long( mb, this.ptr, margin)
  }

  open fun getMinimumSize(): Vector2 {
    val mb = getMethodBind("StyleBox","get_minimum_size")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getOffset(): Vector2 {
    val mb = getMethodBind("StyleBox","get_offset")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun setDefaultMargin(margin: Long, offset: Double) {
    val mb = getMethodBind("StyleBox","set_default_margin")
    _icall_Unit_Long_Double( mb, this.ptr, margin, offset)
  }

  open fun testMask(point: Vector2, rect: Rect2): Boolean {
    val mb = getMethodBind("StyleBox","test_mask")
    return _icall_Boolean_Vector2_Rect2( mb, this.ptr, point, rect)
  }
}
