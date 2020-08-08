package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_String_Long
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Boolean
import godot.icalls._icall_Unit_Long_String
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String

open class AnimationNodeTransition internal constructor(
  _ignore: Any?
) : AnimationNode(_ignore) {
  open var input0_autoAdvance: Boolean
    get() {
      val mb = getMethodBind("AnimationNodeTransition","is_input_set_as_auto_advance")
      return _icall_Boolean_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_as_auto_advance")
      _icall_Unit_Long_Boolean(mb, this.ptr, 0, value)
    }

  open var input0_name: String
    get() {
      val mb = getMethodBind("AnimationNodeTransition","get_input_caption")
      return _icall_String_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_caption")
      _icall_Unit_Long_String(mb, this.ptr, 0, value)
    }

  open var input1_autoAdvance: Boolean
    get() {
      val mb = getMethodBind("AnimationNodeTransition","is_input_set_as_auto_advance")
      return _icall_Boolean_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_as_auto_advance")
      _icall_Unit_Long_Boolean(mb, this.ptr, 1, value)
    }

  open var input1_name: String
    get() {
      val mb = getMethodBind("AnimationNodeTransition","get_input_caption")
      return _icall_String_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_caption")
      _icall_Unit_Long_String(mb, this.ptr, 1, value)
    }

  open var input10_autoAdvance: Boolean
    get() {
      val mb = getMethodBind("AnimationNodeTransition","is_input_set_as_auto_advance")
      return _icall_Boolean_Long(mb, this.ptr, 10)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_as_auto_advance")
      _icall_Unit_Long_Boolean(mb, this.ptr, 10, value)
    }

  open var input10_name: String
    get() {
      val mb = getMethodBind("AnimationNodeTransition","get_input_caption")
      return _icall_String_Long(mb, this.ptr, 10)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_caption")
      _icall_Unit_Long_String(mb, this.ptr, 10, value)
    }

  open var input11_autoAdvance: Boolean
    get() {
      val mb = getMethodBind("AnimationNodeTransition","is_input_set_as_auto_advance")
      return _icall_Boolean_Long(mb, this.ptr, 11)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_as_auto_advance")
      _icall_Unit_Long_Boolean(mb, this.ptr, 11, value)
    }

  open var input11_name: String
    get() {
      val mb = getMethodBind("AnimationNodeTransition","get_input_caption")
      return _icall_String_Long(mb, this.ptr, 11)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_caption")
      _icall_Unit_Long_String(mb, this.ptr, 11, value)
    }

  open var input12_autoAdvance: Boolean
    get() {
      val mb = getMethodBind("AnimationNodeTransition","is_input_set_as_auto_advance")
      return _icall_Boolean_Long(mb, this.ptr, 12)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_as_auto_advance")
      _icall_Unit_Long_Boolean(mb, this.ptr, 12, value)
    }

  open var input12_name: String
    get() {
      val mb = getMethodBind("AnimationNodeTransition","get_input_caption")
      return _icall_String_Long(mb, this.ptr, 12)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_caption")
      _icall_Unit_Long_String(mb, this.ptr, 12, value)
    }

  open var input13_autoAdvance: Boolean
    get() {
      val mb = getMethodBind("AnimationNodeTransition","is_input_set_as_auto_advance")
      return _icall_Boolean_Long(mb, this.ptr, 13)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_as_auto_advance")
      _icall_Unit_Long_Boolean(mb, this.ptr, 13, value)
    }

  open var input13_name: String
    get() {
      val mb = getMethodBind("AnimationNodeTransition","get_input_caption")
      return _icall_String_Long(mb, this.ptr, 13)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_caption")
      _icall_Unit_Long_String(mb, this.ptr, 13, value)
    }

  open var input14_autoAdvance: Boolean
    get() {
      val mb = getMethodBind("AnimationNodeTransition","is_input_set_as_auto_advance")
      return _icall_Boolean_Long(mb, this.ptr, 14)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_as_auto_advance")
      _icall_Unit_Long_Boolean(mb, this.ptr, 14, value)
    }

  open var input14_name: String
    get() {
      val mb = getMethodBind("AnimationNodeTransition","get_input_caption")
      return _icall_String_Long(mb, this.ptr, 14)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_caption")
      _icall_Unit_Long_String(mb, this.ptr, 14, value)
    }

  open var input15_autoAdvance: Boolean
    get() {
      val mb = getMethodBind("AnimationNodeTransition","is_input_set_as_auto_advance")
      return _icall_Boolean_Long(mb, this.ptr, 15)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_as_auto_advance")
      _icall_Unit_Long_Boolean(mb, this.ptr, 15, value)
    }

  open var input15_name: String
    get() {
      val mb = getMethodBind("AnimationNodeTransition","get_input_caption")
      return _icall_String_Long(mb, this.ptr, 15)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_caption")
      _icall_Unit_Long_String(mb, this.ptr, 15, value)
    }

  open var input16_autoAdvance: Boolean
    get() {
      val mb = getMethodBind("AnimationNodeTransition","is_input_set_as_auto_advance")
      return _icall_Boolean_Long(mb, this.ptr, 16)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_as_auto_advance")
      _icall_Unit_Long_Boolean(mb, this.ptr, 16, value)
    }

  open var input16_name: String
    get() {
      val mb = getMethodBind("AnimationNodeTransition","get_input_caption")
      return _icall_String_Long(mb, this.ptr, 16)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_caption")
      _icall_Unit_Long_String(mb, this.ptr, 16, value)
    }

  open var input17_autoAdvance: Boolean
    get() {
      val mb = getMethodBind("AnimationNodeTransition","is_input_set_as_auto_advance")
      return _icall_Boolean_Long(mb, this.ptr, 17)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_as_auto_advance")
      _icall_Unit_Long_Boolean(mb, this.ptr, 17, value)
    }

  open var input17_name: String
    get() {
      val mb = getMethodBind("AnimationNodeTransition","get_input_caption")
      return _icall_String_Long(mb, this.ptr, 17)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_caption")
      _icall_Unit_Long_String(mb, this.ptr, 17, value)
    }

  open var input18_autoAdvance: Boolean
    get() {
      val mb = getMethodBind("AnimationNodeTransition","is_input_set_as_auto_advance")
      return _icall_Boolean_Long(mb, this.ptr, 18)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_as_auto_advance")
      _icall_Unit_Long_Boolean(mb, this.ptr, 18, value)
    }

  open var input18_name: String
    get() {
      val mb = getMethodBind("AnimationNodeTransition","get_input_caption")
      return _icall_String_Long(mb, this.ptr, 18)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_caption")
      _icall_Unit_Long_String(mb, this.ptr, 18, value)
    }

  open var input19_autoAdvance: Boolean
    get() {
      val mb = getMethodBind("AnimationNodeTransition","is_input_set_as_auto_advance")
      return _icall_Boolean_Long(mb, this.ptr, 19)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_as_auto_advance")
      _icall_Unit_Long_Boolean(mb, this.ptr, 19, value)
    }

  open var input19_name: String
    get() {
      val mb = getMethodBind("AnimationNodeTransition","get_input_caption")
      return _icall_String_Long(mb, this.ptr, 19)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_caption")
      _icall_Unit_Long_String(mb, this.ptr, 19, value)
    }

  open var input2_autoAdvance: Boolean
    get() {
      val mb = getMethodBind("AnimationNodeTransition","is_input_set_as_auto_advance")
      return _icall_Boolean_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_as_auto_advance")
      _icall_Unit_Long_Boolean(mb, this.ptr, 2, value)
    }

  open var input2_name: String
    get() {
      val mb = getMethodBind("AnimationNodeTransition","get_input_caption")
      return _icall_String_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_caption")
      _icall_Unit_Long_String(mb, this.ptr, 2, value)
    }

  open var input20_autoAdvance: Boolean
    get() {
      val mb = getMethodBind("AnimationNodeTransition","is_input_set_as_auto_advance")
      return _icall_Boolean_Long(mb, this.ptr, 20)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_as_auto_advance")
      _icall_Unit_Long_Boolean(mb, this.ptr, 20, value)
    }

  open var input20_name: String
    get() {
      val mb = getMethodBind("AnimationNodeTransition","get_input_caption")
      return _icall_String_Long(mb, this.ptr, 20)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_caption")
      _icall_Unit_Long_String(mb, this.ptr, 20, value)
    }

  open var input21_autoAdvance: Boolean
    get() {
      val mb = getMethodBind("AnimationNodeTransition","is_input_set_as_auto_advance")
      return _icall_Boolean_Long(mb, this.ptr, 21)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_as_auto_advance")
      _icall_Unit_Long_Boolean(mb, this.ptr, 21, value)
    }

  open var input21_name: String
    get() {
      val mb = getMethodBind("AnimationNodeTransition","get_input_caption")
      return _icall_String_Long(mb, this.ptr, 21)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_caption")
      _icall_Unit_Long_String(mb, this.ptr, 21, value)
    }

  open var input22_autoAdvance: Boolean
    get() {
      val mb = getMethodBind("AnimationNodeTransition","is_input_set_as_auto_advance")
      return _icall_Boolean_Long(mb, this.ptr, 22)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_as_auto_advance")
      _icall_Unit_Long_Boolean(mb, this.ptr, 22, value)
    }

  open var input22_name: String
    get() {
      val mb = getMethodBind("AnimationNodeTransition","get_input_caption")
      return _icall_String_Long(mb, this.ptr, 22)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_caption")
      _icall_Unit_Long_String(mb, this.ptr, 22, value)
    }

  open var input23_autoAdvance: Boolean
    get() {
      val mb = getMethodBind("AnimationNodeTransition","is_input_set_as_auto_advance")
      return _icall_Boolean_Long(mb, this.ptr, 23)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_as_auto_advance")
      _icall_Unit_Long_Boolean(mb, this.ptr, 23, value)
    }

  open var input23_name: String
    get() {
      val mb = getMethodBind("AnimationNodeTransition","get_input_caption")
      return _icall_String_Long(mb, this.ptr, 23)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_caption")
      _icall_Unit_Long_String(mb, this.ptr, 23, value)
    }

  open var input24_autoAdvance: Boolean
    get() {
      val mb = getMethodBind("AnimationNodeTransition","is_input_set_as_auto_advance")
      return _icall_Boolean_Long(mb, this.ptr, 24)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_as_auto_advance")
      _icall_Unit_Long_Boolean(mb, this.ptr, 24, value)
    }

  open var input24_name: String
    get() {
      val mb = getMethodBind("AnimationNodeTransition","get_input_caption")
      return _icall_String_Long(mb, this.ptr, 24)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_caption")
      _icall_Unit_Long_String(mb, this.ptr, 24, value)
    }

  open var input25_autoAdvance: Boolean
    get() {
      val mb = getMethodBind("AnimationNodeTransition","is_input_set_as_auto_advance")
      return _icall_Boolean_Long(mb, this.ptr, 25)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_as_auto_advance")
      _icall_Unit_Long_Boolean(mb, this.ptr, 25, value)
    }

  open var input25_name: String
    get() {
      val mb = getMethodBind("AnimationNodeTransition","get_input_caption")
      return _icall_String_Long(mb, this.ptr, 25)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_caption")
      _icall_Unit_Long_String(mb, this.ptr, 25, value)
    }

  open var input26_autoAdvance: Boolean
    get() {
      val mb = getMethodBind("AnimationNodeTransition","is_input_set_as_auto_advance")
      return _icall_Boolean_Long(mb, this.ptr, 26)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_as_auto_advance")
      _icall_Unit_Long_Boolean(mb, this.ptr, 26, value)
    }

  open var input26_name: String
    get() {
      val mb = getMethodBind("AnimationNodeTransition","get_input_caption")
      return _icall_String_Long(mb, this.ptr, 26)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_caption")
      _icall_Unit_Long_String(mb, this.ptr, 26, value)
    }

  open var input27_autoAdvance: Boolean
    get() {
      val mb = getMethodBind("AnimationNodeTransition","is_input_set_as_auto_advance")
      return _icall_Boolean_Long(mb, this.ptr, 27)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_as_auto_advance")
      _icall_Unit_Long_Boolean(mb, this.ptr, 27, value)
    }

  open var input27_name: String
    get() {
      val mb = getMethodBind("AnimationNodeTransition","get_input_caption")
      return _icall_String_Long(mb, this.ptr, 27)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_caption")
      _icall_Unit_Long_String(mb, this.ptr, 27, value)
    }

  open var input28_autoAdvance: Boolean
    get() {
      val mb = getMethodBind("AnimationNodeTransition","is_input_set_as_auto_advance")
      return _icall_Boolean_Long(mb, this.ptr, 28)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_as_auto_advance")
      _icall_Unit_Long_Boolean(mb, this.ptr, 28, value)
    }

  open var input28_name: String
    get() {
      val mb = getMethodBind("AnimationNodeTransition","get_input_caption")
      return _icall_String_Long(mb, this.ptr, 28)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_caption")
      _icall_Unit_Long_String(mb, this.ptr, 28, value)
    }

  open var input29_autoAdvance: Boolean
    get() {
      val mb = getMethodBind("AnimationNodeTransition","is_input_set_as_auto_advance")
      return _icall_Boolean_Long(mb, this.ptr, 29)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_as_auto_advance")
      _icall_Unit_Long_Boolean(mb, this.ptr, 29, value)
    }

  open var input29_name: String
    get() {
      val mb = getMethodBind("AnimationNodeTransition","get_input_caption")
      return _icall_String_Long(mb, this.ptr, 29)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_caption")
      _icall_Unit_Long_String(mb, this.ptr, 29, value)
    }

  open var input3_autoAdvance: Boolean
    get() {
      val mb = getMethodBind("AnimationNodeTransition","is_input_set_as_auto_advance")
      return _icall_Boolean_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_as_auto_advance")
      _icall_Unit_Long_Boolean(mb, this.ptr, 3, value)
    }

  open var input3_name: String
    get() {
      val mb = getMethodBind("AnimationNodeTransition","get_input_caption")
      return _icall_String_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_caption")
      _icall_Unit_Long_String(mb, this.ptr, 3, value)
    }

  open var input30_autoAdvance: Boolean
    get() {
      val mb = getMethodBind("AnimationNodeTransition","is_input_set_as_auto_advance")
      return _icall_Boolean_Long(mb, this.ptr, 30)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_as_auto_advance")
      _icall_Unit_Long_Boolean(mb, this.ptr, 30, value)
    }

  open var input30_name: String
    get() {
      val mb = getMethodBind("AnimationNodeTransition","get_input_caption")
      return _icall_String_Long(mb, this.ptr, 30)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_caption")
      _icall_Unit_Long_String(mb, this.ptr, 30, value)
    }

  open var input31_autoAdvance: Boolean
    get() {
      val mb = getMethodBind("AnimationNodeTransition","is_input_set_as_auto_advance")
      return _icall_Boolean_Long(mb, this.ptr, 31)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_as_auto_advance")
      _icall_Unit_Long_Boolean(mb, this.ptr, 31, value)
    }

  open var input31_name: String
    get() {
      val mb = getMethodBind("AnimationNodeTransition","get_input_caption")
      return _icall_String_Long(mb, this.ptr, 31)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_caption")
      _icall_Unit_Long_String(mb, this.ptr, 31, value)
    }

  open var input4_autoAdvance: Boolean
    get() {
      val mb = getMethodBind("AnimationNodeTransition","is_input_set_as_auto_advance")
      return _icall_Boolean_Long(mb, this.ptr, 4)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_as_auto_advance")
      _icall_Unit_Long_Boolean(mb, this.ptr, 4, value)
    }

  open var input4_name: String
    get() {
      val mb = getMethodBind("AnimationNodeTransition","get_input_caption")
      return _icall_String_Long(mb, this.ptr, 4)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_caption")
      _icall_Unit_Long_String(mb, this.ptr, 4, value)
    }

  open var input5_autoAdvance: Boolean
    get() {
      val mb = getMethodBind("AnimationNodeTransition","is_input_set_as_auto_advance")
      return _icall_Boolean_Long(mb, this.ptr, 5)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_as_auto_advance")
      _icall_Unit_Long_Boolean(mb, this.ptr, 5, value)
    }

  open var input5_name: String
    get() {
      val mb = getMethodBind("AnimationNodeTransition","get_input_caption")
      return _icall_String_Long(mb, this.ptr, 5)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_caption")
      _icall_Unit_Long_String(mb, this.ptr, 5, value)
    }

  open var input6_autoAdvance: Boolean
    get() {
      val mb = getMethodBind("AnimationNodeTransition","is_input_set_as_auto_advance")
      return _icall_Boolean_Long(mb, this.ptr, 6)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_as_auto_advance")
      _icall_Unit_Long_Boolean(mb, this.ptr, 6, value)
    }

  open var input6_name: String
    get() {
      val mb = getMethodBind("AnimationNodeTransition","get_input_caption")
      return _icall_String_Long(mb, this.ptr, 6)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_caption")
      _icall_Unit_Long_String(mb, this.ptr, 6, value)
    }

  open var input7_autoAdvance: Boolean
    get() {
      val mb = getMethodBind("AnimationNodeTransition","is_input_set_as_auto_advance")
      return _icall_Boolean_Long(mb, this.ptr, 7)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_as_auto_advance")
      _icall_Unit_Long_Boolean(mb, this.ptr, 7, value)
    }

  open var input7_name: String
    get() {
      val mb = getMethodBind("AnimationNodeTransition","get_input_caption")
      return _icall_String_Long(mb, this.ptr, 7)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_caption")
      _icall_Unit_Long_String(mb, this.ptr, 7, value)
    }

  open var input8_autoAdvance: Boolean
    get() {
      val mb = getMethodBind("AnimationNodeTransition","is_input_set_as_auto_advance")
      return _icall_Boolean_Long(mb, this.ptr, 8)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_as_auto_advance")
      _icall_Unit_Long_Boolean(mb, this.ptr, 8, value)
    }

  open var input8_name: String
    get() {
      val mb = getMethodBind("AnimationNodeTransition","get_input_caption")
      return _icall_String_Long(mb, this.ptr, 8)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_caption")
      _icall_Unit_Long_String(mb, this.ptr, 8, value)
    }

  open var input9_autoAdvance: Boolean
    get() {
      val mb = getMethodBind("AnimationNodeTransition","is_input_set_as_auto_advance")
      return _icall_Boolean_Long(mb, this.ptr, 9)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_as_auto_advance")
      _icall_Unit_Long_Boolean(mb, this.ptr, 9, value)
    }

  open var input9_name: String
    get() {
      val mb = getMethodBind("AnimationNodeTransition","get_input_caption")
      return _icall_String_Long(mb, this.ptr, 9)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_input_caption")
      _icall_Unit_Long_String(mb, this.ptr, 9, value)
    }

  open var inputCount: Long
    get() {
      val mb = getMethodBind("AnimationNodeTransition","get_enabled_inputs")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_enabled_inputs")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var xfadeTime: Double
    get() {
      val mb = getMethodBind("AnimationNodeTransition","get_cross_fade_time")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeTransition","set_cross_fade_time")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("AnimationNodeTransition", "AnimationNodeTransition")
        }

  }

  open fun getCrossFadeTime(): Double {
    val mb = getMethodBind("AnimationNodeTransition","get_cross_fade_time")
    return _icall_Double( mb, this.ptr)
  }

  open fun getEnabledInputs(): Long {
    val mb = getMethodBind("AnimationNodeTransition","get_enabled_inputs")
    return _icall_Long( mb, this.ptr)
  }

  open fun getInputCaption(input: Long): String {
    val mb = getMethodBind("AnimationNodeTransition","get_input_caption")
    return _icall_String_Long( mb, this.ptr, input)
  }

  open fun isInputSetAsAutoAdvance(input: Long): Boolean {
    val mb = getMethodBind("AnimationNodeTransition","is_input_set_as_auto_advance")
    return _icall_Boolean_Long( mb, this.ptr, input)
  }

  open fun setCrossFadeTime(time: Double) {
    val mb = getMethodBind("AnimationNodeTransition","set_cross_fade_time")
    _icall_Unit_Double( mb, this.ptr, time)
  }

  open fun setEnabledInputs(amount: Long) {
    val mb = getMethodBind("AnimationNodeTransition","set_enabled_inputs")
    _icall_Unit_Long( mb, this.ptr, amount)
  }

  open fun setInputAsAutoAdvance(input: Long, enable: Boolean) {
    val mb = getMethodBind("AnimationNodeTransition","set_input_as_auto_advance")
    _icall_Unit_Long_Boolean( mb, this.ptr, input, enable)
  }

  open fun setInputCaption(input: Long, caption: String) {
    val mb = getMethodBind("AnimationNodeTransition","set_input_caption")
    _icall_Unit_Long_String( mb, this.ptr, input, caption)
  }

  companion object
}
