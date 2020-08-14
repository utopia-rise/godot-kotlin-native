// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Color
import godot.core.RID
import godot.core.Vector2
import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_Double_RID_Vector2_Long_Long_Color_Boolean
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_RID_Vector2_String_Color_Long_Color
import godot.icalls._icall_Vector2_String
import godot.icalls._icall_Vector2_String_Double
import godot.internal.utils.getMethodBind
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String

open class Font internal constructor() : Resource() {
  open fun draw(
    canvasItem: RID,
    position: Vector2,
    string: String,
    modulate: Color = Color(1,1,1,1),
    clipW: Long = -1,
    outlineModulate: Color = Color(1,1,1,1)
  ) {
    val mb = getMethodBind("Font","draw")
    _icall_Unit_RID_Vector2_String_Color_Long_Color( mb, this.ptr, canvasItem, position, string,
        modulate, clipW, outlineModulate)
  }

  open fun drawChar(
    canvasItem: RID,
    position: Vector2,
    char: Long,
    next: Long = -1,
    modulate: Color = Color(1,1,1,1),
    outline: Boolean = false
  ): Double {
    val mb = getMethodBind("Font","draw_char")
    return _icall_Double_RID_Vector2_Long_Long_Color_Boolean( mb, this.ptr, canvasItem, position,
        char, next, modulate, outline)
  }

  open fun getAscent(): Double {
    val mb = getMethodBind("Font","get_ascent")
    return _icall_Double( mb, this.ptr)
  }

  open fun getDescent(): Double {
    val mb = getMethodBind("Font","get_descent")
    return _icall_Double( mb, this.ptr)
  }

  open fun getHeight(): Double {
    val mb = getMethodBind("Font","get_height")
    return _icall_Double( mb, this.ptr)
  }

  open fun getStringSize(string: String): Vector2 {
    val mb = getMethodBind("Font","get_string_size")
    return _icall_Vector2_String( mb, this.ptr, string)
  }

  open fun getWordwrapStringSize(string: String, width: Double): Vector2 {
    val mb = getMethodBind("Font","get_wordwrap_string_size")
    return _icall_Vector2_String_Double( mb, this.ptr, string, width)
  }

  open fun hasOutline(): Boolean {
    val mb = getMethodBind("Font","has_outline")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isDistanceFieldHint(): Boolean {
    val mb = getMethodBind("Font","is_distance_field_hint")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun updateChanges() {
    val mb = getMethodBind("Font","update_changes")
    _icall_Unit( mb, this.ptr)
  }
}
