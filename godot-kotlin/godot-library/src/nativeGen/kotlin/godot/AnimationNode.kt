// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Dictionary
import godot.core.Godot.shouldInitPtr
import godot.core.NodePath
import godot.core.Signal0
import godot.core.Variant
import godot.core.VariantArray
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_NodePath
import godot.icalls._icall_Double_Long_Double_Boolean_Double_Long_Boolean
import godot.icalls._icall_Double_String_Object_Double_Boolean_Double_Long_Boolean
import godot.icalls._icall_Long
import godot.icalls._icall_String_Long
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_NodePath_Boolean
import godot.icalls._icall_Unit_String
import godot.icalls._icall_Unit_String_Double_Double_Boolean_Double
import godot.icalls._icall_Unit_String_Variant
import godot.icalls._icall_Variant_String
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String

open class AnimationNode internal constructor(
  _ignore: Any?
) : Resource(_ignore) {
  val removedFromGraph: Signal0 by signal()

  val treeChanged: Signal0 by signal()

  open var filterEnabled: Boolean
    get() {
      val mb = getMethodBind("AnimationNode","is_filter_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimationNode","set_filter_enabled")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("AnimationNode", "AnimationNode")
        }

  }

  open fun _getFilters(): VariantArray {
    throw NotImplementedError("_get_filters is not implemented for AnimationNode")
  }

  open fun _setFilters(filters: VariantArray) {
  }

  open fun addInput(name: String) {
    val mb = getMethodBind("AnimationNode","add_input")
    _icall_Unit_String( mb, this.ptr, name)
  }

  open fun blendAnimation(
    animation: String,
    time: Double,
    delta: Double,
    seeked: Boolean,
    blend: Double
  ) {
    val mb = getMethodBind("AnimationNode","blend_animation")
    _icall_Unit_String_Double_Double_Boolean_Double( mb, this.ptr, animation, time, delta, seeked,
        blend)
  }

  open fun blendInput(
    inputIndex: Long,
    time: Double,
    seek: Boolean,
    blend: Double,
    filter: Long = 0,
    optimize: Boolean = true
  ): Double {
    val mb = getMethodBind("AnimationNode","blend_input")
    return _icall_Double_Long_Double_Boolean_Double_Long_Boolean( mb, this.ptr, inputIndex, time,
        seek, blend, filter, optimize)
  }

  open fun blendNode(
    name: String,
    node: AnimationNode,
    time: Double,
    seek: Boolean,
    blend: Double,
    filter: Long = 0,
    optimize: Boolean = true
  ): Double {
    val mb = getMethodBind("AnimationNode","blend_node")
    return _icall_Double_String_Object_Double_Boolean_Double_Long_Boolean( mb, this.ptr, name, node,
        time, seek, blend, filter, optimize)
  }

  open fun getCaption(): String {
    throw NotImplementedError("get_caption is not implemented for AnimationNode")
  }

  open fun getChildByName(name: String): Object {
    throw NotImplementedError("get_child_by_name is not implemented for AnimationNode")
  }

  open fun getChildNodes(): Dictionary {
    throw NotImplementedError("get_child_nodes is not implemented for AnimationNode")
  }

  open fun getInputCount(): Long {
    val mb = getMethodBind("AnimationNode","get_input_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getInputName(input: Long): String {
    val mb = getMethodBind("AnimationNode","get_input_name")
    return _icall_String_Long( mb, this.ptr, input)
  }

  open fun getParameter(name: String): Variant {
    val mb = getMethodBind("AnimationNode","get_parameter")
    return _icall_Variant_String( mb, this.ptr, name)
  }

  open fun getParameterDefaultValue(name: String): Variant {
    throw NotImplementedError("get_parameter_default_value is not implemented for AnimationNode")
  }

  open fun getParameterList(): VariantArray {
    throw NotImplementedError("get_parameter_list is not implemented for AnimationNode")
  }

  open fun hasFilter(): String {
    throw NotImplementedError("has_filter is not implemented for AnimationNode")
  }

  open fun isFilterEnabled(): Boolean {
    val mb = getMethodBind("AnimationNode","is_filter_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isPathFiltered(path: NodePath): Boolean {
    val mb = getMethodBind("AnimationNode","is_path_filtered")
    return _icall_Boolean_NodePath( mb, this.ptr, path)
  }

  open fun process(time: Double, seek: Boolean) {
  }

  open fun removeInput(index: Long) {
    val mb = getMethodBind("AnimationNode","remove_input")
    _icall_Unit_Long( mb, this.ptr, index)
  }

  open fun setFilterEnabled(enable: Boolean) {
    val mb = getMethodBind("AnimationNode","set_filter_enabled")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setFilterPath(path: NodePath, enable: Boolean) {
    val mb = getMethodBind("AnimationNode","set_filter_path")
    _icall_Unit_NodePath_Boolean( mb, this.ptr, path, enable)
  }

  open fun setParameter(name: String, value: Variant) {
    val mb = getMethodBind("AnimationNode","set_parameter")
    _icall_Unit_String_Variant( mb, this.ptr, name, value)
  }

  enum class FilterAction(
    id: Long
  ) {
    FILTER_IGNORE(0),

    FILTER_PASS(1),

    FILTER_STOP(2),

    FILTER_BLEND(3);

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
