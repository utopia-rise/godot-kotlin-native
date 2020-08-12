// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.VariantArray
import godot.core.Vector2
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Vector2_Object
import godot.icalls._icall_Texture_Long
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Long_Object
import godot.icalls._icall_Unit_Long_Vector2
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Vector2_Long
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Long
import kotlin.NotImplementedError

open class LargeTexture internal constructor(
  _ignore: Any?
) : Texture(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("LargeTexture", "LargeTexture")
        }

  }

  open fun _getData(): VariantArray {
    throw NotImplementedError("_get_data is not implemented for LargeTexture")
  }

  open fun _setData(data: VariantArray) {
  }

  open fun addPiece(ofs: Vector2, texture: Texture): Long {
    val mb = getMethodBind("LargeTexture","add_piece")
    return _icall_Long_Vector2_Object( mb, this.ptr, ofs, texture)
  }

  open fun clear() {
    val mb = getMethodBind("LargeTexture","clear")
    _icall_Unit( mb, this.ptr)
  }

  open fun getPieceCount(): Long {
    val mb = getMethodBind("LargeTexture","get_piece_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getPieceOffset(idx: Long): Vector2 {
    val mb = getMethodBind("LargeTexture","get_piece_offset")
    return _icall_Vector2_Long( mb, this.ptr, idx)
  }

  open fun getPieceTexture(idx: Long): Texture {
    val mb = getMethodBind("LargeTexture","get_piece_texture")
    return _icall_Texture_Long( mb, this.ptr, idx)
  }

  open fun setPieceOffset(idx: Long, ofs: Vector2) {
    val mb = getMethodBind("LargeTexture","set_piece_offset")
    _icall_Unit_Long_Vector2( mb, this.ptr, idx, ofs)
  }

  open fun setPieceTexture(idx: Long, texture: Texture) {
    val mb = getMethodBind("LargeTexture","set_piece_texture")
    _icall_Unit_Long_Object( mb, this.ptr, idx, texture)
  }

  open fun setSize(size: Vector2) {
    val mb = getMethodBind("LargeTexture","set_size")
    _icall_Unit_Vector2( mb, this.ptr, size)
  }
}
