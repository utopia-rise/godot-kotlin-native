@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Font : Resource {
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


    companion object {
        infix fun from(other: Resource): Font = Font("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): Font = Font("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Font = Font("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Font = fromVariant(Font(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val drawMethodBind: CPointer<godot_method_bind> by lazy { getMB("Font", "draw") }
    open fun draw(canvasItem: RID, position: Vector2, string: String, modulate: Color = Color(1,1,1,1), clipW: Int = -1, outlineModulate: Color = Color(1,1,1,1)) {
        _icall_Unit_RID_Vector2_String_Color_Int_Color(drawMethodBind, this.rawMemory, canvasItem, position, string, modulate, clipW, outlineModulate)
    }


    private val getAscentMethodBind: CPointer<godot_method_bind> by lazy { getMB("Font", "get_ascent") }
    open fun getAscent(): Float {
        return _icall_Float(getAscentMethodBind, this.rawMemory)
    }


    private val getDescentMethodBind: CPointer<godot_method_bind> by lazy { getMB("Font", "get_descent") }
    open fun getDescent(): Float {
        return _icall_Float(getDescentMethodBind, this.rawMemory)
    }


    private val getHeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("Font", "get_height") }
    open fun getHeight(): Float {
        return _icall_Float(getHeightMethodBind, this.rawMemory)
    }


    private val isDistanceFieldHintMethodBind: CPointer<godot_method_bind> by lazy { getMB("Font", "is_distance_field_hint") }
    open fun isDistanceFieldHint(): Boolean {
        return _icall_Boolean(isDistanceFieldHintMethodBind, this.rawMemory)
    }


    private val getStringSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Font", "get_string_size") }
    open fun getStringSize(string: String): Vector2 {
        return _icall_Vector2_String(getStringSizeMethodBind, this.rawMemory, string)
    }


    private val hasOutlineMethodBind: CPointer<godot_method_bind> by lazy { getMB("Font", "has_outline") }
    open fun hasOutline(): Boolean {
        return _icall_Boolean(hasOutlineMethodBind, this.rawMemory)
    }


    private val drawCharMethodBind: CPointer<godot_method_bind> by lazy { getMB("Font", "draw_char") }
    open fun drawChar(canvasItem: RID, position: Vector2, char: Int, next: Int = -1, modulate: Color = Color(1,1,1,1), outline: Boolean = false): Float {
        return _icall_Float_RID_Vector2_Int_Int_Color_Boolean(drawCharMethodBind, this.rawMemory, canvasItem, position, char, next, modulate, outline)
    }


    private val updateChangesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Font", "update_changes") }
    open fun updateChanges() {
        _icall_Unit(updateChangesMethodBind, this.rawMemory)
    }


}
