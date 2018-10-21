@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class UndoRedo : Object {
    constructor() : super("UndoRedo")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class MergeMode(val id: Long) {
        MERGE_DISABLE(0),
        MERGE_ENDS(1),
        MERGE_ALL(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: Object): UndoRedo = UndoRedo("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): UndoRedo = fromVariant(UndoRedo(""), other)


        // Constants
        const val MERGE_DISABLE: Long = 0
        const val MERGE_ENDS: Long = 1
        const val MERGE_ALL: Long = 2


    }


    // Properties


    // Methods
    private val createActionMethodBind: CPointer<godot_method_bind> by lazy { getMB("UndoRedo", "create_action") }
    open fun createAction(name: String, mergeMode: Long = 0) {
        _icall_Unit_String_Long(createActionMethodBind, this.rawMemory, name, mergeMode)
    }


    private val commitActionMethodBind: CPointer<godot_method_bind> by lazy { getMB("UndoRedo", "commit_action") }
    open fun commitAction() {
        _icall_Unit(commitActionMethodBind, this.rawMemory)
    }


    private val addDoMethodMethodBind: CPointer<godot_method_bind> by lazy { getMB("UndoRedo", "add_do_method") }
    open fun addDoMethod(_object: Object, method: String, vararg __var_args: Any?): Variant {
        return _icall_varargs(addDoMethodMethodBind, this.rawMemory, arrayOf(_object, method, *__var_args))
    }


    private val addUndoMethodMethodBind: CPointer<godot_method_bind> by lazy { getMB("UndoRedo", "add_undo_method") }
    open fun addUndoMethod(_object: Object, method: String, vararg __var_args: Any?): Variant {
        return _icall_varargs(addUndoMethodMethodBind, this.rawMemory, arrayOf(_object, method, *__var_args))
    }


    private val addDoPropertyMethodBind: CPointer<godot_method_bind> by lazy { getMB("UndoRedo", "add_do_property") }
    open fun addDoProperty(_object: Object, property: String, value: Variant) {
        _icall_Unit_Object_String_Variant(addDoPropertyMethodBind, this.rawMemory, _object, property, value)
    }


    private val addUndoPropertyMethodBind: CPointer<godot_method_bind> by lazy { getMB("UndoRedo", "add_undo_property") }
    open fun addUndoProperty(_object: Object, property: String, value: Variant) {
        _icall_Unit_Object_String_Variant(addUndoPropertyMethodBind, this.rawMemory, _object, property, value)
    }


    private val addDoReferenceMethodBind: CPointer<godot_method_bind> by lazy { getMB("UndoRedo", "add_do_reference") }
    open fun addDoReference(_object: Object) {
        _icall_Unit_Object(addDoReferenceMethodBind, this.rawMemory, _object)
    }


    private val addUndoReferenceMethodBind: CPointer<godot_method_bind> by lazy { getMB("UndoRedo", "add_undo_reference") }
    open fun addUndoReference(_object: Object) {
        _icall_Unit_Object(addUndoReferenceMethodBind, this.rawMemory, _object)
    }


    private val clearHistoryMethodBind: CPointer<godot_method_bind> by lazy { getMB("UndoRedo", "clear_history") }
    open fun clearHistory() {
        _icall_Unit(clearHistoryMethodBind, this.rawMemory)
    }


    private val getCurrentActionNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("UndoRedo", "get_current_action_name") }
    open fun getCurrentActionName(): String {
        return _icall_String(getCurrentActionNameMethodBind, this.rawMemory)
    }


    private val getVersionMethodBind: CPointer<godot_method_bind> by lazy { getMB("UndoRedo", "get_version") }
    open fun getVersion(): Long {
        return _icall_Long(getVersionMethodBind, this.rawMemory)
    }


    private val redoMethodBind: CPointer<godot_method_bind> by lazy { getMB("UndoRedo", "redo") }
    open fun redo(): Boolean {
        return _icall_Boolean(redoMethodBind, this.rawMemory)
    }


    private val undoMethodBind: CPointer<godot_method_bind> by lazy { getMB("UndoRedo", "undo") }
    open fun undo(): Boolean {
        return _icall_Boolean(undoMethodBind, this.rawMemory)
    }


}
