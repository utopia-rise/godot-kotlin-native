// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.GodotError
import godot.icalls._icall_Long_String
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.String
import kotlinx.cinterop.COpaquePointer

open class X509Certificate : Resource() {
  override fun __new(): COpaquePointer = invokeConstructor("X509Certificate", "X509Certificate")

  open fun load(path: String): GodotError {
    val mb = getMethodBind("X509Certificate","load")
    return GodotError.byValue( _icall_Long_String( mb, this.ptr, path).toUInt())
  }

  open fun save(path: String): GodotError {
    val mb = getMethodBind("X509Certificate","save")
    return GodotError.byValue( _icall_Long_String( mb, this.ptr, path).toUInt())
  }
}
