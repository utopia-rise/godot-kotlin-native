@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class PackedScene : Resource {
    constructor() : super("PackedScene")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class GenEditState(val id: Int) {
        GEN_EDIT_STATE_DISABLED(0),
        GEN_EDIT_STATE_INSTANCE(1),
        GEN_EDIT_STATE_MAIN(2),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: Resource): PackedScene = PackedScene("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): PackedScene = PackedScene("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): PackedScene = PackedScene("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): PackedScene = fromVariant(PackedScene(""), other)


        // Constants
        const val GEN_EDIT_STATE_DISABLED: Int = 0
        const val GEN_EDIT_STATE_INSTANCE: Int = 1
        const val GEN_EDIT_STATE_MAIN: Int = 2


    }


    // Properties


    // Methods
    private val packMethodBind: CPointer<godot_method_bind> by lazy { getMB("PackedScene", "pack") }
    open fun pack(path: Object): GodotError {
        return GodotError.fromInt(_icall_Int_Object(packMethodBind, this.rawMemory, path))
    }


    private val instanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("PackedScene", "instance") }
    open fun instance(editState: Int = 0): Node {
        return _icall_Node_Int(instanceMethodBind, this.rawMemory, editState)
    }


    private val canInstanceMethodBind: CPointer<godot_method_bind> by lazy { getMB("PackedScene", "can_instance") }
    open fun canInstance(): Boolean {
        return _icall_Boolean(canInstanceMethodBind, this.rawMemory)
    }


    open fun _set_bundled_scene(arg0: Dictionary) {
    }


    open fun _get_bundled_scene(): Dictionary {
        throw NotImplementedError("_get_bundled_scene is not implemented for PackedScene")
    }


    private val getStateMethodBind: CPointer<godot_method_bind> by lazy { getMB("PackedScene", "get_state") }
    open fun getState(): SceneState {
        return _icall_SceneState(getStateMethodBind, this.rawMemory)
    }


}
