// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.Label
import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_String
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_String
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String

open class Label internal constructor(
  _ignore: Any?
) : Control(_ignore) {
  open var align: Long
    get() {
      val mb = getMethodBind("Label","get_align")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Label","set_align")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var autowrap: Boolean
    get() {
      val mb = getMethodBind("Label","has_autowrap")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Label","set_autowrap")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var clipText: Boolean
    get() {
      val mb = getMethodBind("Label","is_clipping_text")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Label","set_clip_text")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var linesSkipped: Long
    get() {
      val mb = getMethodBind("Label","get_lines_skipped")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Label","set_lines_skipped")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var maxLinesVisible: Long
    get() {
      val mb = getMethodBind("Label","get_max_lines_visible")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Label","set_max_lines_visible")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var percentVisible: Double
    get() {
      val mb = getMethodBind("Label","get_percent_visible")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Label","set_percent_visible")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var text: String
    get() {
      val mb = getMethodBind("Label","get_text")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Label","set_text")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var uppercase: Boolean
    get() {
      val mb = getMethodBind("Label","is_uppercase")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Label","set_uppercase")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var valign: Long
    get() {
      val mb = getMethodBind("Label","get_valign")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Label","set_valign")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var visibleCharacters: Long
    get() {
      val mb = getMethodBind("Label","get_visible_characters")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Label","set_visible_characters")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("Label", "Label")
        }

  }

  open fun getAlign(): Label.Align {
    val mb = getMethodBind("Label","get_align")
    return Label.Align.from( _icall_Long( mb, this.ptr))
  }

  open fun getLineCount(): Long {
    val mb = getMethodBind("Label","get_line_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getLineHeight(): Long {
    val mb = getMethodBind("Label","get_line_height")
    return _icall_Long( mb, this.ptr)
  }

  open fun getLinesSkipped(): Long {
    val mb = getMethodBind("Label","get_lines_skipped")
    return _icall_Long( mb, this.ptr)
  }

  open fun getMaxLinesVisible(): Long {
    val mb = getMethodBind("Label","get_max_lines_visible")
    return _icall_Long( mb, this.ptr)
  }

  open fun getPercentVisible(): Double {
    val mb = getMethodBind("Label","get_percent_visible")
    return _icall_Double( mb, this.ptr)
  }

  open fun getText(): String {
    val mb = getMethodBind("Label","get_text")
    return _icall_String( mb, this.ptr)
  }

  open fun getTotalCharacterCount(): Long {
    val mb = getMethodBind("Label","get_total_character_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getValign(): Label.VAlign {
    val mb = getMethodBind("Label","get_valign")
    return Label.VAlign.from( _icall_Long( mb, this.ptr))
  }

  open fun getVisibleCharacters(): Long {
    val mb = getMethodBind("Label","get_visible_characters")
    return _icall_Long( mb, this.ptr)
  }

  open fun getVisibleLineCount(): Long {
    val mb = getMethodBind("Label","get_visible_line_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun hasAutowrap(): Boolean {
    val mb = getMethodBind("Label","has_autowrap")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isClippingText(): Boolean {
    val mb = getMethodBind("Label","is_clipping_text")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isUppercase(): Boolean {
    val mb = getMethodBind("Label","is_uppercase")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setAlign(align: Long) {
    val mb = getMethodBind("Label","set_align")
    _icall_Unit_Long( mb, this.ptr, align)
  }

  open fun setAutowrap(enable: Boolean) {
    val mb = getMethodBind("Label","set_autowrap")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setClipText(enable: Boolean) {
    val mb = getMethodBind("Label","set_clip_text")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setLinesSkipped(linesSkipped: Long) {
    val mb = getMethodBind("Label","set_lines_skipped")
    _icall_Unit_Long( mb, this.ptr, linesSkipped)
  }

  open fun setMaxLinesVisible(linesVisible: Long) {
    val mb = getMethodBind("Label","set_max_lines_visible")
    _icall_Unit_Long( mb, this.ptr, linesVisible)
  }

  open fun setPercentVisible(percentVisible: Double) {
    val mb = getMethodBind("Label","set_percent_visible")
    _icall_Unit_Double( mb, this.ptr, percentVisible)
  }

  open fun setText(text: String) {
    val mb = getMethodBind("Label","set_text")
    _icall_Unit_String( mb, this.ptr, text)
  }

  open fun setUppercase(enable: Boolean) {
    val mb = getMethodBind("Label","set_uppercase")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setValign(valign: Long) {
    val mb = getMethodBind("Label","set_valign")
    _icall_Unit_Long( mb, this.ptr, valign)
  }

  open fun setVisibleCharacters(amount: Long) {
    val mb = getMethodBind("Label","set_visible_characters")
    _icall_Unit_Long( mb, this.ptr, amount)
  }

  enum class Align(
    id: Long
  ) {
    ALIGN_LEFT(0),

    ALIGN_CENTER(1),

    ALIGN_RIGHT(2),

    ALIGN_FILL(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class VAlign(
    id: Long
  ) {
    VALIGN_TOP(0),

    VALIGN_CENTER(1),

    VALIGN_BOTTOM(2),

    VALIGN_FILL(3);

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
