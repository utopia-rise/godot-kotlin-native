package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Texture
import godot.icalls._icall_Unit_Object
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any

open class PanoramaSky internal constructor(
  _ignore: Any?
) : Sky(_ignore) {
  open var panorama: Texture
    get() {
      val mb = getMethodBind("PanoramaSky","get_panorama")
      return _icall_Texture(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("PanoramaSky","set_panorama")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("PanoramaSky", "PanoramaSky")
        }

  }

  open fun getPanorama(): Texture {
    val mb = getMethodBind("PanoramaSky","get_panorama")
    return _icall_Texture( mb, this.ptr)
  }

  open fun setPanorama(texture: Texture) {
    val mb = getMethodBind("PanoramaSky","set_panorama")
    _icall_Unit_Object( mb, this.ptr, texture)
  }

  companion object
}
