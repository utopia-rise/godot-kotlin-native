@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class TouchScreenButton : Node2D {
    constructor() : super("TouchScreenButton")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class VisibilityMode(val id: Int) {
        VISIBILITY_ALWAYS(0),
        VISIBILITY_TOUCHSCREEN_ONLY(1),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
            const val RELEASED: String = "released"
            const val PRESSED: String = "pressed"
        }
    }


    companion object {
        infix fun from(other: Node2D): TouchScreenButton = TouchScreenButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): TouchScreenButton = TouchScreenButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): TouchScreenButton = TouchScreenButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): TouchScreenButton = TouchScreenButton("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): TouchScreenButton = fromVariant(TouchScreenButton(""), other)


        // Constants
        const val VISIBILITY_ALWAYS: Int = 0
        const val VISIBILITY_TOUCHSCREEN_ONLY: Int = 1


    }


    // Properties
    open var normal: Texture
        get() = _icall_Texture(getTextureMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setTextureMethodBind, this.rawMemory, value)


    open var pressed: Texture
        get() = _icall_Texture(getTexturePressedMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setTexturePressedMethodBind, this.rawMemory, value)


    open var bitmask: BitMap
        get() = _icall_BitMap(getBitmaskMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setBitmaskMethodBind, this.rawMemory, value)


    open var shape: Shape2D
        get() = _icall_Shape2D(getShapeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setShapeMethodBind, this.rawMemory, value)


    open var shapeCentered: Boolean
        get() = _icall_Boolean(isShapeCenteredMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setShapeCenteredMethodBind, this.rawMemory, value)


    open var shapeVisible: Boolean
        get() = _icall_Boolean(isShapeVisibleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setShapeVisibleMethodBind, this.rawMemory, value)


    open var passbyPress: Boolean
        get() = _icall_Boolean(isPassbyPressEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setPassbyPressMethodBind, this.rawMemory, value)


    open var action: String
        get() = _icall_String(getActionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setActionMethodBind, this.rawMemory, value)


    open var visibilityMode: Int
        get() = _icall_Int(getVisibilityModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setVisibilityModeMethodBind, this.rawMemory, value)




    // Methods
    private val setTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("TouchScreenButton", "set_texture") }
    open fun setTexture(texture: Texture) {
        _icall_Unit_Object(setTextureMethodBind, this.rawMemory, texture)
    }


    private val getTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("TouchScreenButton", "get_texture") }
    open fun getTexture(): Texture {
        return _icall_Texture(getTextureMethodBind, this.rawMemory)
    }


    private val setTexturePressedMethodBind: CPointer<godot_method_bind> by lazy { getMB("TouchScreenButton", "set_texture_pressed") }
    open fun setTexturePressed(texturePressed: Texture) {
        _icall_Unit_Object(setTexturePressedMethodBind, this.rawMemory, texturePressed)
    }


    private val getTexturePressedMethodBind: CPointer<godot_method_bind> by lazy { getMB("TouchScreenButton", "get_texture_pressed") }
    open fun getTexturePressed(): Texture {
        return _icall_Texture(getTexturePressedMethodBind, this.rawMemory)
    }


    private val setBitmaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("TouchScreenButton", "set_bitmask") }
    open fun setBitmask(bitmask: BitMap) {
        _icall_Unit_Object(setBitmaskMethodBind, this.rawMemory, bitmask)
    }


    private val getBitmaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("TouchScreenButton", "get_bitmask") }
    open fun getBitmask(): BitMap {
        return _icall_BitMap(getBitmaskMethodBind, this.rawMemory)
    }


    private val setShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("TouchScreenButton", "set_shape") }
    open fun setShape(shape: Shape2D) {
        _icall_Unit_Object(setShapeMethodBind, this.rawMemory, shape)
    }


    private val getShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("TouchScreenButton", "get_shape") }
    open fun getShape(): Shape2D {
        return _icall_Shape2D(getShapeMethodBind, this.rawMemory)
    }


    private val setShapeCenteredMethodBind: CPointer<godot_method_bind> by lazy { getMB("TouchScreenButton", "set_shape_centered") }
    open fun setShapeCentered(bool: Boolean) {
        _icall_Unit_Boolean(setShapeCenteredMethodBind, this.rawMemory, bool)
    }


    private val isShapeCenteredMethodBind: CPointer<godot_method_bind> by lazy { getMB("TouchScreenButton", "is_shape_centered") }
    open fun isShapeCentered(): Boolean {
        return _icall_Boolean(isShapeCenteredMethodBind, this.rawMemory)
    }


    private val setShapeVisibleMethodBind: CPointer<godot_method_bind> by lazy { getMB("TouchScreenButton", "set_shape_visible") }
    open fun setShapeVisible(bool: Boolean) {
        _icall_Unit_Boolean(setShapeVisibleMethodBind, this.rawMemory, bool)
    }


    private val isShapeVisibleMethodBind: CPointer<godot_method_bind> by lazy { getMB("TouchScreenButton", "is_shape_visible") }
    open fun isShapeVisible(): Boolean {
        return _icall_Boolean(isShapeVisibleMethodBind, this.rawMemory)
    }


    private val setActionMethodBind: CPointer<godot_method_bind> by lazy { getMB("TouchScreenButton", "set_action") }
    open fun setAction(action: String) {
        _icall_Unit_String(setActionMethodBind, this.rawMemory, action)
    }


    private val getActionMethodBind: CPointer<godot_method_bind> by lazy { getMB("TouchScreenButton", "get_action") }
    open fun getAction(): String {
        return _icall_String(getActionMethodBind, this.rawMemory)
    }


    private val setVisibilityModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("TouchScreenButton", "set_visibility_mode") }
    open fun setVisibilityMode(mode: Int) {
        _icall_Unit_Int(setVisibilityModeMethodBind, this.rawMemory, mode)
    }


    private val getVisibilityModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("TouchScreenButton", "get_visibility_mode") }
    open fun getVisibilityMode(): TouchScreenButton.VisibilityMode {
        return TouchScreenButton.VisibilityMode.fromInt(_icall_Int(getVisibilityModeMethodBind, this.rawMemory))
    }


    private val setPassbyPressMethodBind: CPointer<godot_method_bind> by lazy { getMB("TouchScreenButton", "set_passby_press") }
    open fun setPassbyPress(enabled: Boolean) {
        _icall_Unit_Boolean(setPassbyPressMethodBind, this.rawMemory, enabled)
    }


    private val isPassbyPressEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("TouchScreenButton", "is_passby_press_enabled") }
    open fun isPassbyPressEnabled(): Boolean {
        return _icall_Boolean(isPassbyPressEnabledMethodBind, this.rawMemory)
    }


    private val isPressedMethodBind: CPointer<godot_method_bind> by lazy { getMB("TouchScreenButton", "is_pressed") }
    open fun isPressed(): Boolean {
        return _icall_Boolean(isPressedMethodBind, this.rawMemory)
    }


    override fun _input(arg0: InputEvent) {
    }


}
