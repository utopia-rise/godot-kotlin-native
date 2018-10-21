@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class GrooveJoint2D : Joint2D {
    constructor() : super("GrooveJoint2D")
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
        infix fun from(other: Joint2D): GrooveJoint2D = GrooveJoint2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node2D): GrooveJoint2D = GrooveJoint2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): GrooveJoint2D = GrooveJoint2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): GrooveJoint2D = GrooveJoint2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): GrooveJoint2D = GrooveJoint2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): GrooveJoint2D = fromVariant(GrooveJoint2D(""), other)


        // Constants


    }


    // Properties
    open var length: Double
        get() = _icall_Double(getLengthMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setLengthMethodBind, this.rawMemory, value)


    open var initialOffset: Double
        get() = _icall_Double(getInitialOffsetMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setInitialOffsetMethodBind, this.rawMemory, value)




    // Methods
    private val setLengthMethodBind: CPointer<godot_method_bind> by lazy { getMB("GrooveJoint2D", "set_length") }
    open fun setLength(length: Double) {
        _icall_Unit_Double(setLengthMethodBind, this.rawMemory, length)
    }


    private val getLengthMethodBind: CPointer<godot_method_bind> by lazy { getMB("GrooveJoint2D", "get_length") }
    open fun getLength(): Double {
        return _icall_Double(getLengthMethodBind, this.rawMemory)
    }


    private val setInitialOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("GrooveJoint2D", "set_initial_offset") }
    open fun setInitialOffset(offset: Double) {
        _icall_Unit_Double(setInitialOffsetMethodBind, this.rawMemory, offset)
    }


    private val getInitialOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("GrooveJoint2D", "get_initial_offset") }
    open fun getInitialOffset(): Double {
        return _icall_Double(getInitialOffsetMethodBind, this.rawMemory)
    }


}
