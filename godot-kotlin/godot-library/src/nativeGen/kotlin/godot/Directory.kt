// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.GodotError
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_String
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Boolean_Boolean
import godot.icalls._icall_Long_String
import godot.icalls._icall_Long_String_String
import godot.icalls._icall_String
import godot.icalls._icall_String_Long
import godot.icalls._icall_Unit
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlinx.cinterop.COpaquePointer

open class Directory : Reference() {
  override fun __new(): COpaquePointer = invokeConstructor("Directory", "_Directory")

  open fun changeDir(todir: String): GodotError {
    val mb = getMethodBind("_Directory","change_dir")
    return GodotError.byValue( _icall_Long_String( mb, this.ptr, todir).toUInt())
  }

  open fun copy(from: String, to: String): GodotError {
    val mb = getMethodBind("_Directory","copy")
    return GodotError.byValue( _icall_Long_String_String( mb, this.ptr, from, to).toUInt())
  }

  open fun currentIsDir(): Boolean {
    val mb = getMethodBind("_Directory","current_is_dir")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun dirExists(path: String): Boolean {
    val mb = getMethodBind("_Directory","dir_exists")
    return _icall_Boolean_String( mb, this.ptr, path)
  }

  open fun fileExists(path: String): Boolean {
    val mb = getMethodBind("_Directory","file_exists")
    return _icall_Boolean_String( mb, this.ptr, path)
  }

  open fun getCurrentDir(): String {
    val mb = getMethodBind("_Directory","get_current_dir")
    return _icall_String( mb, this.ptr)
  }

  open fun getCurrentDrive(): Long {
    val mb = getMethodBind("_Directory","get_current_drive")
    return _icall_Long( mb, this.ptr)
  }

  open fun getDrive(idx: Long): String {
    val mb = getMethodBind("_Directory","get_drive")
    return _icall_String_Long( mb, this.ptr, idx)
  }

  open fun getDriveCount(): Long {
    val mb = getMethodBind("_Directory","get_drive_count")
    return _icall_Long( mb, this.ptr)
  }

  open fun getNext(): String {
    val mb = getMethodBind("_Directory","get_next")
    return _icall_String( mb, this.ptr)
  }

  open fun getSpaceLeft(): Long {
    val mb = getMethodBind("_Directory","get_space_left")
    return _icall_Long( mb, this.ptr)
  }

  open fun listDirBegin(skipNavigational: Boolean = false, skipHidden: Boolean = false):
      GodotError {
    val mb = getMethodBind("_Directory","list_dir_begin")
    return GodotError.byValue( _icall_Long_Boolean_Boolean( mb, this.ptr, skipNavigational,
        skipHidden).toUInt())
  }

  open fun listDirEnd() {
    val mb = getMethodBind("_Directory","list_dir_end")
    _icall_Unit( mb, this.ptr)
  }

  open fun makeDir(path: String): GodotError {
    val mb = getMethodBind("_Directory","make_dir")
    return GodotError.byValue( _icall_Long_String( mb, this.ptr, path).toUInt())
  }

  open fun makeDirRecursive(path: String): GodotError {
    val mb = getMethodBind("_Directory","make_dir_recursive")
    return GodotError.byValue( _icall_Long_String( mb, this.ptr, path).toUInt())
  }

  open fun open(path: String): GodotError {
    val mb = getMethodBind("_Directory","open")
    return GodotError.byValue( _icall_Long_String( mb, this.ptr, path).toUInt())
  }

  open fun remove(path: String): GodotError {
    val mb = getMethodBind("_Directory","remove")
    return GodotError.byValue( _icall_Long_String( mb, this.ptr, path).toUInt())
  }

  open fun rename(from: String, to: String): GodotError {
    val mb = getMethodBind("_Directory","rename")
    return GodotError.byValue( _icall_Long_String_String( mb, this.ptr, from, to).toUInt())
  }
}
