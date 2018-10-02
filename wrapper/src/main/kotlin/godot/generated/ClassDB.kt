@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ClassDB : Object {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
        }
    }


    @ThreadLocal    companion object {
        infix fun from(other: Object): ClassDB = ClassDB("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ClassDB = fromVariant(ClassDB(""), other)


        // Constants


        private val rawMemory: COpaquePointer by lazy { getSingleton("ClassDB", "_ClassDB") }


        // Properties


        // Methods
        private val getClassListMethodBind: CPointer<godot_method_bind> by lazy { getMB("_ClassDB", "get_class_list") }
        fun getClassList(): PoolStringArray {
            return _icall_PoolStringArray(getClassListMethodBind, this.rawMemory)
        }


        private val getInheritersFromClassMethodBind: CPointer<godot_method_bind> by lazy { getMB("_ClassDB", "get_inheriters_from_class") }
        fun getInheritersFromClass(_class: String): PoolStringArray {
            return _icall_PoolStringArray_String(getInheritersFromClassMethodBind, this.rawMemory, _class)
        }


        private val getParentClassMethodBind: CPointer<godot_method_bind> by lazy { getMB("_ClassDB", "get_parent_class") }
        fun getParentClass(_class: String): String {
            return _icall_String_String(getParentClassMethodBind, this.rawMemory, _class)
        }


        private val classExistsMethodBind: CPointer<godot_method_bind> by lazy { getMB("_ClassDB", "class_exists") }
        fun classExists(_class: String): Boolean {
            return _icall_Boolean_String(classExistsMethodBind, this.rawMemory, _class)
        }


        private val isParentClassMethodBind: CPointer<godot_method_bind> by lazy { getMB("_ClassDB", "is_parent_class") }
        fun isParentClass(_class: String, inherits: String): Boolean {
            return _icall_Boolean_String_String(isParentClassMethodBind, this.rawMemory, _class, inherits)
        }


        private val canInstanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("_ClassDB", "can_instance") }
        fun canInstance(_class: String): Boolean {
            return _icall_Boolean_String(canInstanceMethodBind, this.rawMemory, _class)
        }


        private val instanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("_ClassDB", "instance") }
        fun instance(_class: String): Variant {
            return _icall_Variant_String(instanceMethodBind, this.rawMemory, _class)
        }


        private val classHasSignalMethodBind: CPointer<godot_method_bind> by lazy { getMB("_ClassDB", "class_has_signal") }
        fun classHasSignal(_class: String, signal: String): Boolean {
            return _icall_Boolean_String_String(classHasSignalMethodBind, this.rawMemory, _class, signal)
        }


        private val classGetSignalMethodBind: CPointer<godot_method_bind> by lazy { getMB("_ClassDB", "class_get_signal") }
        fun classGetSignal(_class: String, signal: String): Dictionary {
            return _icall_Dictionary_String_String(classGetSignalMethodBind, this.rawMemory, _class, signal)
        }


        private val classGetSignalListMethodBind: CPointer<godot_method_bind> by lazy { getMB("_ClassDB", "class_get_signal_list") }
        fun classGetSignalList(_class: String, noInheritance: Boolean = false): GDArray {
            return _icall_GDArray_String_Boolean(classGetSignalListMethodBind, this.rawMemory, _class, noInheritance)
        }


        private val classGetPropertyListMethodBind: CPointer<godot_method_bind> by lazy { getMB("_ClassDB", "class_get_property_list") }
        fun classGetPropertyList(_class: String, noInheritance: Boolean = false): GDArray {
            return _icall_GDArray_String_Boolean(classGetPropertyListMethodBind, this.rawMemory, _class, noInheritance)
        }


        private val classGetPropertyMethodBind: CPointer<godot_method_bind> by lazy { getMB("_ClassDB", "class_get_property") }
        fun classGetProperty(_object: Object, property: String): Variant {
            return _icall_Variant_Object_String(classGetPropertyMethodBind, this.rawMemory, _object, property)
        }


        private val classSetPropertyMethodBind: CPointer<godot_method_bind> by lazy { getMB("_ClassDB", "class_set_property") }
        fun classSetProperty(_object: Object, property: String, value: Variant): GodotError {
            return GodotError.fromInt(_icall_Long_Object_String_Variant(classSetPropertyMethodBind, this.rawMemory, _object, property, value))
        }


        private val classHasMethodMethodBind: CPointer<godot_method_bind> by lazy { getMB("_ClassDB", "class_has_method") }
        fun classHasMethod(_class: String, method: String, noInheritance: Boolean = false): Boolean {
            return _icall_Boolean_String_String_Boolean(classHasMethodMethodBind, this.rawMemory, _class, method, noInheritance)
        }


        private val classGetMethodListMethodBind: CPointer<godot_method_bind> by lazy { getMB("_ClassDB", "class_get_method_list") }
        fun classGetMethodList(_class: String, noInheritance: Boolean = false): GDArray {
            return _icall_GDArray_String_Boolean(classGetMethodListMethodBind, this.rawMemory, _class, noInheritance)
        }


        private val classGetIntegerConstantListMethodBind: CPointer<godot_method_bind> by lazy { getMB("_ClassDB", "class_get_integer_constant_list") }
        fun classGetIntegerConstantList(_class: String, noInheritance: Boolean = false): PoolStringArray {
            return _icall_PoolStringArray_String_Boolean(classGetIntegerConstantListMethodBind, this.rawMemory, _class, noInheritance)
        }


        private val classHasIntegerConstantMethodBind: CPointer<godot_method_bind> by lazy { getMB("_ClassDB", "class_has_integer_constant") }
        fun classHasIntegerConstant(_class: String, name: String): Boolean {
            return _icall_Boolean_String_String(classHasIntegerConstantMethodBind, this.rawMemory, _class, name)
        }


        private val classGetIntegerConstantMethodBind: CPointer<godot_method_bind> by lazy { getMB("_ClassDB", "class_get_integer_constant") }
        fun classGetIntegerConstant(_class: String, name: String): Long {
            return _icall_Long_String_String(classGetIntegerConstantMethodBind, this.rawMemory, _class, name)
        }


        private val classGetCategoryMethodBind: CPointer<godot_method_bind> by lazy { getMB("_ClassDB", "class_get_category") }
        fun classGetCategory(_class: String): String {
            return _icall_String_String(classGetCategoryMethodBind, this.rawMemory, _class)
        }


        private val isClassEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("_ClassDB", "is_class_enabled") }
        fun isClassEnabled(_class: String): Boolean {
            return _icall_Boolean_String(isClassEnabledMethodBind, this.rawMemory, _class)
        }


    }
}
