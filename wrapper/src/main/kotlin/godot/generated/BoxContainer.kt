@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class BoxContainer : Container {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class AlignMode(val id: Int) {
        ALIGN_BEGIN(0),
        ALIGN_CENTER(1),
        ALIGN_END(2),
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
        infix fun from(other: Container): BoxContainer = BoxContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Control): BoxContainer = BoxContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): BoxContainer = BoxContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): BoxContainer = BoxContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): BoxContainer = BoxContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): BoxContainer = fromVariant(BoxContainer(""), other)


        // Constants
        const val ALIGN_BEGIN: Int = 0
        const val ALIGN_CENTER: Int = 1
        const val ALIGN_END: Int = 2


    }


    // Properties
    open var alignment: Int
        get() = _icall_Int(getAlignmentMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setAlignmentMethodBind, this.rawMemory, value)




    // Methods
    private val addSpacerMethodBind: CPointer<godot_method_bind> by lazy { getMB("BoxContainer", "add_spacer") }
    open fun addSpacer(begin: Boolean) {
        _icall_Unit_Boolean(addSpacerMethodBind, this.rawMemory, begin)
    }


    private val getAlignmentMethodBind: CPointer<godot_method_bind> by lazy { getMB("BoxContainer", "get_alignment") }
    open fun getAlignment(): BoxContainer.AlignMode {
        return BoxContainer.AlignMode.fromInt(_icall_Int(getAlignmentMethodBind, this.rawMemory))
    }


    private val setAlignmentMethodBind: CPointer<godot_method_bind> by lazy { getMB("BoxContainer", "set_alignment") }
    open fun setAlignment(alignment: Int) {
        _icall_Unit_Int(setAlignmentMethodBind, this.rawMemory, alignment)
    }


}
