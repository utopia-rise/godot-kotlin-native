@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualScriptComment : VisualScriptNode {
    constructor() : super("VisualScriptComment")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: VisualScriptNode): VisualScriptComment = VisualScriptComment("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualScriptComment = VisualScriptComment("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualScriptComment = VisualScriptComment("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualScriptComment = VisualScriptComment("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualScriptComment = fromVariant(VisualScriptComment(""), other)


        // Constants


    }


    // Properties
    open var title: String
        get() = _icall_String(getTitleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setTitleMethodBind, this.rawMemory, value)


    open var description: String
        get() = _icall_String(getDescriptionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setDescriptionMethodBind, this.rawMemory, value)


    open var size: Vector2
        get() = _icall_Vector2(getSizeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setSizeMethodBind, this.rawMemory, value)
    open fun size(shedule: (Vector2) -> Unit): Vector2 = size.apply {
        shedule(this)
        size = this
    }




    // Methods
    private val setTitleMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptComment", "set_title") }
    open fun setTitle(title: String) {
        _icall_Unit_String(setTitleMethodBind, this.rawMemory, title)
    }


    private val getTitleMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptComment", "get_title") }
    open fun getTitle(): String {
        return _icall_String(getTitleMethodBind, this.rawMemory)
    }


    private val setDescriptionMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptComment", "set_description") }
    open fun setDescription(description: String) {
        _icall_Unit_String(setDescriptionMethodBind, this.rawMemory, description)
    }


    private val getDescriptionMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptComment", "get_description") }
    open fun getDescription(): String {
        return _icall_String(getDescriptionMethodBind, this.rawMemory)
    }


    private val setSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptComment", "set_size") }
    open fun setSize(size: Vector2) {
        _icall_Unit_Vector2(setSizeMethodBind, this.rawMemory, size)
    }


    private val getSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualScriptComment", "get_size") }
    open fun getSize(): Vector2 {
        return _icall_Vector2(getSizeMethodBind, this.rawMemory)
    }


}
