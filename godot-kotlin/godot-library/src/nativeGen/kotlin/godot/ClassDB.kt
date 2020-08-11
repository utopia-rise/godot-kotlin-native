// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Dictionary
import godot.core.Godot
import godot.core.GodotError
import godot.core.PoolStringArray
import godot.core.Variant
import godot.core.VariantArray
import godot.icalls._icall_Boolean_String
import godot.icalls._icall_Boolean_String_String
import godot.icalls._icall_Boolean_String_String_Boolean
import godot.icalls._icall_Dictionary_String_String
import godot.icalls._icall_Long_Object_String_Variant
import godot.icalls._icall_Long_String_String
import godot.icalls._icall_PoolStringArray
import godot.icalls._icall_PoolStringArray_String
import godot.icalls._icall_PoolStringArray_String_Boolean
import godot.icalls._icall_String_String
import godot.icalls._icall_VariantArray_String_Boolean
import godot.icalls._icall_Variant_Object_String
import godot.icalls._icall_Variant_String
import godot.internal.type.nullSafe
import godot.internal.utils.getMethodBind
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.requireNotNull
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

object ClassDB : Object() {
  init {
    memScoped {
        val ptr = nullSafe(Godot.gdnative.godot_global_get_singleton).invoke("ClassDB".cstr.ptr)
        requireNotNull(ptr) { "No instance found for singleton ClassDB" }
        this@ClassDB.ptr = ptr
    }
  }

  fun canInstance(_class: String): Boolean {
    val mb = getMethodBind("_ClassDB","can_instance")
    return _icall_Boolean_String( mb, this.ptr, _class)
  }

  fun classExists(_class: String): Boolean {
    val mb = getMethodBind("_ClassDB","class_exists")
    return _icall_Boolean_String( mb, this.ptr, _class)
  }

  fun classGetCategory(_class: String): String {
    val mb = getMethodBind("_ClassDB","class_get_category")
    return _icall_String_String( mb, this.ptr, _class)
  }

  fun classGetIntegerConstant(_class: String, name: String): Long {
    val mb = getMethodBind("_ClassDB","class_get_integer_constant")
    return _icall_Long_String_String( mb, this.ptr, _class, name)
  }

  fun classGetIntegerConstantList(_class: String, noInheritance: Boolean = false): PoolStringArray {
    val mb = getMethodBind("_ClassDB","class_get_integer_constant_list")
    return _icall_PoolStringArray_String_Boolean( mb, this.ptr, _class, noInheritance)
  }

  fun classGetMethodList(_class: String, noInheritance: Boolean = false): VariantArray {
    val mb = getMethodBind("_ClassDB","class_get_method_list")
    return _icall_VariantArray_String_Boolean( mb, this.ptr, _class, noInheritance)
  }

  fun classGetProperty(_object: Object, property: String): Variant {
    val mb = getMethodBind("_ClassDB","class_get_property")
    return _icall_Variant_Object_String( mb, this.ptr, _object, property)
  }

  fun classGetPropertyList(_class: String, noInheritance: Boolean = false): VariantArray {
    val mb = getMethodBind("_ClassDB","class_get_property_list")
    return _icall_VariantArray_String_Boolean( mb, this.ptr, _class, noInheritance)
  }

  fun classGetSignal(_class: String, signal: String): Dictionary {
    val mb = getMethodBind("_ClassDB","class_get_signal")
    return _icall_Dictionary_String_String( mb, this.ptr, _class, signal)
  }

  fun classGetSignalList(_class: String, noInheritance: Boolean = false): VariantArray {
    val mb = getMethodBind("_ClassDB","class_get_signal_list")
    return _icall_VariantArray_String_Boolean( mb, this.ptr, _class, noInheritance)
  }

  fun classHasIntegerConstant(_class: String, name: String): Boolean {
    val mb = getMethodBind("_ClassDB","class_has_integer_constant")
    return _icall_Boolean_String_String( mb, this.ptr, _class, name)
  }

  fun classHasMethod(
    _class: String,
    method: String,
    noInheritance: Boolean = false
  ): Boolean {
    val mb = getMethodBind("_ClassDB","class_has_method")
    return _icall_Boolean_String_String_Boolean( mb, this.ptr, _class, method, noInheritance)
  }

  fun classHasSignal(_class: String, signal: String): Boolean {
    val mb = getMethodBind("_ClassDB","class_has_signal")
    return _icall_Boolean_String_String( mb, this.ptr, _class, signal)
  }

  fun classSetProperty(
    _object: Object,
    property: String,
    value: Variant
  ): GodotError {
    val mb = getMethodBind("_ClassDB","class_set_property")
    return GodotError.byValue( _icall_Long_Object_String_Variant( mb, this.ptr, _object, property,
        value).toUInt())
  }

  fun getClassList(): PoolStringArray {
    val mb = getMethodBind("_ClassDB","get_class_list")
    return _icall_PoolStringArray( mb, this.ptr)
  }

  fun getInheritersFromClass(_class: String): PoolStringArray {
    val mb = getMethodBind("_ClassDB","get_inheriters_from_class")
    return _icall_PoolStringArray_String( mb, this.ptr, _class)
  }

  fun getParentClass(_class: String): String {
    val mb = getMethodBind("_ClassDB","get_parent_class")
    return _icall_String_String( mb, this.ptr, _class)
  }

  fun instance(_class: String): Variant {
    val mb = getMethodBind("_ClassDB","instance")
    return _icall_Variant_String( mb, this.ptr, _class)
  }

  fun isClassEnabled(_class: String): Boolean {
    val mb = getMethodBind("_ClassDB","is_class_enabled")
    return _icall_Boolean_String( mb, this.ptr, _class)
  }

  fun isParentClass(_class: String, inherits: String): Boolean {
    val mb = getMethodBind("_ClassDB","is_parent_class")
    return _icall_Boolean_String_String( mb, this.ptr, _class, inherits)
  }
}
