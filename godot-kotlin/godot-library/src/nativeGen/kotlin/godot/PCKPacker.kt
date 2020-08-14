// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.GodotError
import godot.icalls._icall_Long_Boolean
import godot.icalls._icall_Long_String_Long
import godot.icalls._icall_Long_String_String
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlinx.cinterop.COpaquePointer

open class PCKPacker : Reference() {
  override fun __new(): COpaquePointer = invokeConstructor("PCKPacker", "PCKPacker")

  open fun addFile(pckPath: String, sourcePath: String): GodotError {
    val mb = getMethodBind("PCKPacker","add_file")
    return GodotError.byValue( _icall_Long_String_String( mb, this.ptr, pckPath,
        sourcePath).toUInt())
  }

  open fun flush(verbose: Boolean = false): GodotError {
    val mb = getMethodBind("PCKPacker","flush")
    return GodotError.byValue( _icall_Long_Boolean( mb, this.ptr, verbose).toUInt())
  }

  open fun pckStart(pckName: String, alignment: Long = 0): GodotError {
    val mb = getMethodBind("PCKPacker","pck_start")
    return GodotError.byValue( _icall_Long_String_Long( mb, this.ptr, pckName, alignment).toUInt())
  }
}
