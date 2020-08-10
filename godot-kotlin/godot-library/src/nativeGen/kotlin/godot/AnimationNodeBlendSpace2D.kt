// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.AnimationNodeBlendSpace2D
import godot.core.Godot.shouldInitPtr
import godot.core.PoolIntArray
import godot.core.Signal0
import godot.core.Vector2
import godot.core.signal
import godot.icalls._icall_AnimationRootNode_Long
import godot.icalls._icall_Boolean
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Long_Long
import godot.icalls._icall_String
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Long_Long_Long
import godot.icalls._icall_Unit_Long_Object
import godot.icalls._icall_Unit_Long_Vector2
import godot.icalls._icall_Unit_Object_Vector2_Long
import godot.icalls._icall_Unit_String
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Vector2
import godot.icalls._icall_Vector2_Long
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Unit

open class AnimationNodeBlendSpace2D internal constructor(
  _ignore: Any?
) : AnimationRootNode(_ignore) {
  val trianglesUpdated: Signal0 by signal()

  open var autoTriangles: Boolean
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_auto_triangles")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_auto_triangles")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var blendMode: Long
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open val blendPoint0_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 0)
    }

  open var blendPoint0_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 0, value)
    }

  open val blendPoint1_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 1)
    }

  open var blendPoint1_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 1, value)
    }

  open val blendPoint10_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 10)
    }

  open var blendPoint10_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 10)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 10, value)
    }

  open val blendPoint11_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 11)
    }

  open var blendPoint11_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 11)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 11, value)
    }

  open val blendPoint12_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 12)
    }

  open var blendPoint12_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 12)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 12, value)
    }

  open val blendPoint13_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 13)
    }

  open var blendPoint13_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 13)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 13, value)
    }

  open val blendPoint14_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 14)
    }

  open var blendPoint14_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 14)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 14, value)
    }

  open val blendPoint15_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 15)
    }

  open var blendPoint15_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 15)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 15, value)
    }

  open val blendPoint16_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 16)
    }

  open var blendPoint16_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 16)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 16, value)
    }

  open val blendPoint17_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 17)
    }

  open var blendPoint17_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 17)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 17, value)
    }

  open val blendPoint18_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 18)
    }

  open var blendPoint18_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 18)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 18, value)
    }

  open val blendPoint19_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 19)
    }

  open var blendPoint19_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 19)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 19, value)
    }

  open val blendPoint2_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 2)
    }

  open var blendPoint2_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 2, value)
    }

  open val blendPoint20_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 20)
    }

  open var blendPoint20_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 20)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 20, value)
    }

  open val blendPoint21_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 21)
    }

  open var blendPoint21_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 21)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 21, value)
    }

  open val blendPoint22_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 22)
    }

  open var blendPoint22_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 22)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 22, value)
    }

  open val blendPoint23_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 23)
    }

  open var blendPoint23_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 23)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 23, value)
    }

  open val blendPoint24_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 24)
    }

  open var blendPoint24_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 24)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 24, value)
    }

  open val blendPoint25_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 25)
    }

  open var blendPoint25_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 25)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 25, value)
    }

  open val blendPoint26_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 26)
    }

  open var blendPoint26_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 26)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 26, value)
    }

  open val blendPoint27_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 27)
    }

  open var blendPoint27_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 27)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 27, value)
    }

  open val blendPoint28_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 28)
    }

  open var blendPoint28_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 28)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 28, value)
    }

  open val blendPoint29_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 29)
    }

  open var blendPoint29_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 29)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 29, value)
    }

  open val blendPoint3_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 3)
    }

  open var blendPoint3_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 3, value)
    }

  open val blendPoint30_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 30)
    }

  open var blendPoint30_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 30)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 30, value)
    }

  open val blendPoint31_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 31)
    }

  open var blendPoint31_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 31)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 31, value)
    }

  open val blendPoint32_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 32)
    }

  open var blendPoint32_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 32)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 32, value)
    }

  open val blendPoint33_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 33)
    }

  open var blendPoint33_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 33)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 33, value)
    }

  open val blendPoint34_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 34)
    }

  open var blendPoint34_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 34)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 34, value)
    }

  open val blendPoint35_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 35)
    }

  open var blendPoint35_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 35)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 35, value)
    }

  open val blendPoint36_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 36)
    }

  open var blendPoint36_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 36)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 36, value)
    }

  open val blendPoint37_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 37)
    }

  open var blendPoint37_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 37)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 37, value)
    }

  open val blendPoint38_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 38)
    }

  open var blendPoint38_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 38)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 38, value)
    }

  open val blendPoint39_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 39)
    }

  open var blendPoint39_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 39)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 39, value)
    }

  open val blendPoint4_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 4)
    }

  open var blendPoint4_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 4)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 4, value)
    }

  open val blendPoint40_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 40)
    }

  open var blendPoint40_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 40)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 40, value)
    }

  open val blendPoint41_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 41)
    }

  open var blendPoint41_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 41)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 41, value)
    }

  open val blendPoint42_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 42)
    }

  open var blendPoint42_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 42)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 42, value)
    }

  open val blendPoint43_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 43)
    }

  open var blendPoint43_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 43)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 43, value)
    }

  open val blendPoint44_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 44)
    }

  open var blendPoint44_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 44)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 44, value)
    }

  open val blendPoint45_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 45)
    }

  open var blendPoint45_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 45)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 45, value)
    }

  open val blendPoint46_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 46)
    }

  open var blendPoint46_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 46)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 46, value)
    }

  open val blendPoint47_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 47)
    }

  open var blendPoint47_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 47)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 47, value)
    }

  open val blendPoint48_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 48)
    }

  open var blendPoint48_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 48)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 48, value)
    }

  open val blendPoint49_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 49)
    }

  open var blendPoint49_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 49)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 49, value)
    }

  open val blendPoint5_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 5)
    }

  open var blendPoint5_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 5)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 5, value)
    }

  open val blendPoint50_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 50)
    }

  open var blendPoint50_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 50)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 50, value)
    }

  open val blendPoint51_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 51)
    }

  open var blendPoint51_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 51)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 51, value)
    }

  open val blendPoint52_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 52)
    }

  open var blendPoint52_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 52)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 52, value)
    }

  open val blendPoint53_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 53)
    }

  open var blendPoint53_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 53)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 53, value)
    }

  open val blendPoint54_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 54)
    }

  open var blendPoint54_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 54)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 54, value)
    }

  open val blendPoint55_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 55)
    }

  open var blendPoint55_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 55)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 55, value)
    }

  open val blendPoint56_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 56)
    }

  open var blendPoint56_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 56)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 56, value)
    }

  open val blendPoint57_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 57)
    }

  open var blendPoint57_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 57)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 57, value)
    }

  open val blendPoint58_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 58)
    }

  open var blendPoint58_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 58)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 58, value)
    }

  open val blendPoint59_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 59)
    }

  open var blendPoint59_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 59)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 59, value)
    }

  open val blendPoint6_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 6)
    }

  open var blendPoint6_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 6)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 6, value)
    }

  open val blendPoint60_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 60)
    }

  open var blendPoint60_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 60)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 60, value)
    }

  open val blendPoint61_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 61)
    }

  open var blendPoint61_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 61)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 61, value)
    }

  open val blendPoint62_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 62)
    }

  open var blendPoint62_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 62)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 62, value)
    }

  open val blendPoint63_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 63)
    }

  open var blendPoint63_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 63)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 63, value)
    }

  open val blendPoint7_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 7)
    }

  open var blendPoint7_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 7)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 7, value)
    }

  open val blendPoint8_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 8)
    }

  open var blendPoint8_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 8)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 8, value)
    }

  open val blendPoint9_node: AnimationRootNode
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
      return _icall_AnimationRootNode_Long(mb, this.ptr, 9)
    }

  open var blendPoint9_pos: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
      return _icall_Vector2_Long(mb, this.ptr, 9)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
      _icall_Unit_Long_Vector2(mb, this.ptr, 9, value)
    }

  open var maxSpace: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_max_space")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_max_space")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var minSpace: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_min_space")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_min_space")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var snap: Vector2
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_snap")
      return _icall_Vector2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_snap")
      _icall_Unit_Vector2(mb, this.ptr, value)
    }

  open var xLabel: String
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_x_label")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_x_label")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var yLabel: String
    get() {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","get_y_label")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationNodeBlendSpace2D","set_y_label")
      _icall_Unit_String(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("AnimationNodeBlendSpace2D", "AnimationNodeBlendSpace2D")
        }

  }

  open fun blendPoint0_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint0_pos.apply{
      schedule(this)
      blendPoint0_pos = this
  }


  open fun blendPoint1_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint1_pos.apply{
      schedule(this)
      blendPoint1_pos = this
  }


  open fun blendPoint10_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint10_pos.apply{
      schedule(this)
      blendPoint10_pos = this
  }


  open fun blendPoint11_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint11_pos.apply{
      schedule(this)
      blendPoint11_pos = this
  }


  open fun blendPoint12_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint12_pos.apply{
      schedule(this)
      blendPoint12_pos = this
  }


  open fun blendPoint13_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint13_pos.apply{
      schedule(this)
      blendPoint13_pos = this
  }


  open fun blendPoint14_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint14_pos.apply{
      schedule(this)
      blendPoint14_pos = this
  }


  open fun blendPoint15_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint15_pos.apply{
      schedule(this)
      blendPoint15_pos = this
  }


  open fun blendPoint16_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint16_pos.apply{
      schedule(this)
      blendPoint16_pos = this
  }


  open fun blendPoint17_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint17_pos.apply{
      schedule(this)
      blendPoint17_pos = this
  }


  open fun blendPoint18_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint18_pos.apply{
      schedule(this)
      blendPoint18_pos = this
  }


  open fun blendPoint19_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint19_pos.apply{
      schedule(this)
      blendPoint19_pos = this
  }


  open fun blendPoint2_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint2_pos.apply{
      schedule(this)
      blendPoint2_pos = this
  }


  open fun blendPoint20_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint20_pos.apply{
      schedule(this)
      blendPoint20_pos = this
  }


  open fun blendPoint21_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint21_pos.apply{
      schedule(this)
      blendPoint21_pos = this
  }


  open fun blendPoint22_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint22_pos.apply{
      schedule(this)
      blendPoint22_pos = this
  }


  open fun blendPoint23_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint23_pos.apply{
      schedule(this)
      blendPoint23_pos = this
  }


  open fun blendPoint24_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint24_pos.apply{
      schedule(this)
      blendPoint24_pos = this
  }


  open fun blendPoint25_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint25_pos.apply{
      schedule(this)
      blendPoint25_pos = this
  }


  open fun blendPoint26_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint26_pos.apply{
      schedule(this)
      blendPoint26_pos = this
  }


  open fun blendPoint27_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint27_pos.apply{
      schedule(this)
      blendPoint27_pos = this
  }


  open fun blendPoint28_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint28_pos.apply{
      schedule(this)
      blendPoint28_pos = this
  }


  open fun blendPoint29_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint29_pos.apply{
      schedule(this)
      blendPoint29_pos = this
  }


  open fun blendPoint3_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint3_pos.apply{
      schedule(this)
      blendPoint3_pos = this
  }


  open fun blendPoint30_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint30_pos.apply{
      schedule(this)
      blendPoint30_pos = this
  }


  open fun blendPoint31_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint31_pos.apply{
      schedule(this)
      blendPoint31_pos = this
  }


  open fun blendPoint32_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint32_pos.apply{
      schedule(this)
      blendPoint32_pos = this
  }


  open fun blendPoint33_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint33_pos.apply{
      schedule(this)
      blendPoint33_pos = this
  }


  open fun blendPoint34_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint34_pos.apply{
      schedule(this)
      blendPoint34_pos = this
  }


  open fun blendPoint35_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint35_pos.apply{
      schedule(this)
      blendPoint35_pos = this
  }


  open fun blendPoint36_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint36_pos.apply{
      schedule(this)
      blendPoint36_pos = this
  }


  open fun blendPoint37_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint37_pos.apply{
      schedule(this)
      blendPoint37_pos = this
  }


  open fun blendPoint38_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint38_pos.apply{
      schedule(this)
      blendPoint38_pos = this
  }


  open fun blendPoint39_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint39_pos.apply{
      schedule(this)
      blendPoint39_pos = this
  }


  open fun blendPoint4_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint4_pos.apply{
      schedule(this)
      blendPoint4_pos = this
  }


  open fun blendPoint40_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint40_pos.apply{
      schedule(this)
      blendPoint40_pos = this
  }


  open fun blendPoint41_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint41_pos.apply{
      schedule(this)
      blendPoint41_pos = this
  }


  open fun blendPoint42_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint42_pos.apply{
      schedule(this)
      blendPoint42_pos = this
  }


  open fun blendPoint43_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint43_pos.apply{
      schedule(this)
      blendPoint43_pos = this
  }


  open fun blendPoint44_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint44_pos.apply{
      schedule(this)
      blendPoint44_pos = this
  }


  open fun blendPoint45_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint45_pos.apply{
      schedule(this)
      blendPoint45_pos = this
  }


  open fun blendPoint46_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint46_pos.apply{
      schedule(this)
      blendPoint46_pos = this
  }


  open fun blendPoint47_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint47_pos.apply{
      schedule(this)
      blendPoint47_pos = this
  }


  open fun blendPoint48_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint48_pos.apply{
      schedule(this)
      blendPoint48_pos = this
  }


  open fun blendPoint49_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint49_pos.apply{
      schedule(this)
      blendPoint49_pos = this
  }


  open fun blendPoint5_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint5_pos.apply{
      schedule(this)
      blendPoint5_pos = this
  }


  open fun blendPoint50_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint50_pos.apply{
      schedule(this)
      blendPoint50_pos = this
  }


  open fun blendPoint51_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint51_pos.apply{
      schedule(this)
      blendPoint51_pos = this
  }


  open fun blendPoint52_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint52_pos.apply{
      schedule(this)
      blendPoint52_pos = this
  }


  open fun blendPoint53_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint53_pos.apply{
      schedule(this)
      blendPoint53_pos = this
  }


  open fun blendPoint54_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint54_pos.apply{
      schedule(this)
      blendPoint54_pos = this
  }


  open fun blendPoint55_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint55_pos.apply{
      schedule(this)
      blendPoint55_pos = this
  }


  open fun blendPoint56_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint56_pos.apply{
      schedule(this)
      blendPoint56_pos = this
  }


  open fun blendPoint57_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint57_pos.apply{
      schedule(this)
      blendPoint57_pos = this
  }


  open fun blendPoint58_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint58_pos.apply{
      schedule(this)
      blendPoint58_pos = this
  }


  open fun blendPoint59_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint59_pos.apply{
      schedule(this)
      blendPoint59_pos = this
  }


  open fun blendPoint6_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint6_pos.apply{
      schedule(this)
      blendPoint6_pos = this
  }


  open fun blendPoint60_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint60_pos.apply{
      schedule(this)
      blendPoint60_pos = this
  }


  open fun blendPoint61_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint61_pos.apply{
      schedule(this)
      blendPoint61_pos = this
  }


  open fun blendPoint62_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint62_pos.apply{
      schedule(this)
      blendPoint62_pos = this
  }


  open fun blendPoint63_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint63_pos.apply{
      schedule(this)
      blendPoint63_pos = this
  }


  open fun blendPoint7_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint7_pos.apply{
      schedule(this)
      blendPoint7_pos = this
  }


  open fun blendPoint8_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint8_pos.apply{
      schedule(this)
      blendPoint8_pos = this
  }


  open fun blendPoint9_pos(schedule: Vector2.() -> Unit): Vector2 = blendPoint9_pos.apply{
      schedule(this)
      blendPoint9_pos = this
  }


  open fun maxSpace(schedule: Vector2.() -> Unit): Vector2 = maxSpace.apply{
      schedule(this)
      maxSpace = this
  }


  open fun minSpace(schedule: Vector2.() -> Unit): Vector2 = minSpace.apply{
      schedule(this)
      minSpace = this
  }


  open fun snap(schedule: Vector2.() -> Unit): Vector2 = snap.apply{
      schedule(this)
      snap = this
  }


  open fun _add_blend_point(index: Long, node: AnimationRootNode) {
  }

  open fun _get_triangles(): PoolIntArray {
    throw NotImplementedError("_get_triangles is not implemented for AnimationNodeBlendSpace2D")
  }

  open fun _set_triangles(triangles: PoolIntArray) {
  }

  open fun _tree_changed() {
  }

  open fun _update_triangles() {
  }

  open fun addBlendPoint(
    node: AnimationRootNode,
    pos: Vector2,
    atIndex: Long = -1
  ) {
    val mb = getMethodBind("AnimationNodeBlendSpace2D","add_blend_point")
    _icall_Unit_Object_Vector2_Long( mb, this.ptr, node, pos, atIndex)
  }

  open fun addTriangle(
    x: Long,
    y: Long,
    z: Long,
    atIndex: Long = -1
  ) {
    val mb = getMethodBind("AnimationNodeBlendSpace2D","add_triangle")
    _icall_Unit_Long_Long_Long_Long( mb, this.ptr, x, y, z, atIndex)
  }

  open fun getAutoTriangles(): Boolean {
    val mb = getMethodBind("AnimationNodeBlendSpace2D","get_auto_triangles")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getBlendMode(): AnimationNodeBlendSpace2D.BlendMode {
    val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_mode")
    return AnimationNodeBlendSpace2D.BlendMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getBlendPointCount(): Long {
    val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getBlendPointNode(point: Long): AnimationRootNode {
    val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_node")
    return _icall_AnimationRootNode_Long( mb, this.ptr, point)
  }

  open fun getBlendPointPosition(point: Long): Vector2 {
    val mb = getMethodBind("AnimationNodeBlendSpace2D","get_blend_point_position")
    return _icall_Vector2_Long( mb, this.ptr, point)
  }

  open fun getMaxSpace(): Vector2 {
    val mb = getMethodBind("AnimationNodeBlendSpace2D","get_max_space")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getMinSpace(): Vector2 {
    val mb = getMethodBind("AnimationNodeBlendSpace2D","get_min_space")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getSnap(): Vector2 {
    val mb = getMethodBind("AnimationNodeBlendSpace2D","get_snap")
    return _icall_Vector2( mb, this.ptr)
  }

  open fun getTriangleCount(): Long {
    val mb = getMethodBind("AnimationNodeBlendSpace2D","get_triangle_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getTrianglePoint(triangle: Long, point: Long): Long {
    val mb = getMethodBind("AnimationNodeBlendSpace2D","get_triangle_point")
    return _icall_Long_Long_Long( mb, this.ptr, triangle, point)
  }

  open fun getXLabel(): String {
    val mb = getMethodBind("AnimationNodeBlendSpace2D","get_x_label")
    return _icall_String( mb, this.ptr)
  }

  open fun getYLabel(): String {
    val mb = getMethodBind("AnimationNodeBlendSpace2D","get_y_label")
    return _icall_String( mb, this.ptr)
  }

  open fun removeBlendPoint(point: Long) {
    val mb = getMethodBind("AnimationNodeBlendSpace2D","remove_blend_point")
    _icall_Unit_Long( mb, this.ptr, point)
  }

  open fun removeTriangle(triangle: Long) {
    val mb = getMethodBind("AnimationNodeBlendSpace2D","remove_triangle")
    _icall_Unit_Long( mb, this.ptr, triangle)
  }

  open fun setAutoTriangles(enable: Boolean) {
    val mb = getMethodBind("AnimationNodeBlendSpace2D","set_auto_triangles")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setBlendMode(mode: Long) {
    val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_mode")
    _icall_Unit_Long( mb, this.ptr, mode)
  }

  open fun setBlendPointNode(point: Long, node: AnimationRootNode) {
    val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_node")
    _icall_Unit_Long_Object( mb, this.ptr, point, node)
  }

  open fun setBlendPointPosition(point: Long, pos: Vector2) {
    val mb = getMethodBind("AnimationNodeBlendSpace2D","set_blend_point_position")
    _icall_Unit_Long_Vector2( mb, this.ptr, point, pos)
  }

  open fun setMaxSpace(maxSpace: Vector2) {
    val mb = getMethodBind("AnimationNodeBlendSpace2D","set_max_space")
    _icall_Unit_Vector2( mb, this.ptr, maxSpace)
  }

  open fun setMinSpace(minSpace: Vector2) {
    val mb = getMethodBind("AnimationNodeBlendSpace2D","set_min_space")
    _icall_Unit_Vector2( mb, this.ptr, minSpace)
  }

  open fun setSnap(snap: Vector2) {
    val mb = getMethodBind("AnimationNodeBlendSpace2D","set_snap")
    _icall_Unit_Vector2( mb, this.ptr, snap)
  }

  open fun setXLabel(text: String) {
    val mb = getMethodBind("AnimationNodeBlendSpace2D","set_x_label")
    _icall_Unit_String( mb, this.ptr, text)
  }

  open fun setYLabel(text: String) {
    val mb = getMethodBind("AnimationNodeBlendSpace2D","set_y_label")
    _icall_Unit_String( mb, this.ptr, text)
  }

  enum class BlendMode(
    id: Long
  ) {
    BLEND_MODE_INTERPOLATED(0),

    BLEND_MODE_DISCRETE(1),

    BLEND_MODE_DISCRETE_CARRY(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val BLEND_MODE_DISCRETE: Long = 1

    final const val BLEND_MODE_DISCRETE_CARRY: Long = 2

    final const val BLEND_MODE_INTERPOLATED: Long = 0
  }
}
