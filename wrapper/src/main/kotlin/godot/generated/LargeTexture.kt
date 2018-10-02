@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class LargeTexture : Texture {
    constructor() : super("LargeTexture")
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
        infix fun from(other: Texture): LargeTexture = LargeTexture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): LargeTexture = LargeTexture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): LargeTexture = LargeTexture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): LargeTexture = LargeTexture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): LargeTexture = fromVariant(LargeTexture(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val addPieceMethodBind: CPointer<godot_method_bind> by lazy { getMB("LargeTexture", "add_piece") }
    open fun addPiece(ofs: Vector2, texture: Texture): Long {
        return _icall_Long_Vector2_Object(addPieceMethodBind, this.rawMemory, ofs, texture)
    }


    private val setPieceOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("LargeTexture", "set_piece_offset") }
    open fun setPieceOffset(idx: Long, ofs: Vector2) {
        _icall_Unit_Long_Vector2(setPieceOffsetMethodBind, this.rawMemory, idx, ofs)
    }


    private val setPieceTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("LargeTexture", "set_piece_texture") }
    open fun setPieceTexture(idx: Long, texture: Texture) {
        _icall_Unit_Long_Object(setPieceTextureMethodBind, this.rawMemory, idx, texture)
    }


    private val setSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("LargeTexture", "set_size") }
    open fun setSize(size: Vector2) {
        _icall_Unit_Vector2(setSizeMethodBind, this.rawMemory, size)
    }


    private val clearMethodBind: CPointer<godot_method_bind> by lazy { getMB("LargeTexture", "clear") }
    open fun clear() {
        _icall_Unit(clearMethodBind, this.rawMemory)
    }


    private val getPieceCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("LargeTexture", "get_piece_count") }
    open fun getPieceCount(): Long {
        return _icall_Long(getPieceCountMethodBind, this.rawMemory)
    }


    private val getPieceOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("LargeTexture", "get_piece_offset") }
    open fun getPieceOffset(idx: Long): Vector2 {
        return _icall_Vector2_Long(getPieceOffsetMethodBind, this.rawMemory, idx)
    }


    private val getPieceTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("LargeTexture", "get_piece_texture") }
    open fun getPieceTexture(idx: Long): Texture {
        return _icall_Texture_Long(getPieceTextureMethodBind, this.rawMemory, idx)
    }


    open fun _set_data(data: GDArray) {
    }


    open fun _get_data(): GDArray {
        throw NotImplementedError("_get_data is not implemented for LargeTexture")
    }


}
