// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.Rect2
import godot.icalls._icall_Boolean
import godot.icalls._icall_Rect2
import godot.icalls._icall_Texture
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_Rect2
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Boolean
import kotlin.Unit

open class AtlasTexture internal constructor(
  _ignore: Any?
) : Texture(_ignore) {
  open var atlas: Texture
    get() {
      val mb = getMethodBind("AtlasTexture","get_atlas")
      return _icall_Texture(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AtlasTexture","set_atlas")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var filterClip: Boolean
    get() {
      val mb = getMethodBind("AtlasTexture","has_filter_clip")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AtlasTexture","set_filter_clip")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var margin: Rect2
    get() {
      val mb = getMethodBind("AtlasTexture","get_margin")
      return _icall_Rect2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AtlasTexture","set_margin")
      _icall_Unit_Rect2(mb, this.ptr, value)
    }

  open var region: Rect2
    get() {
      val mb = getMethodBind("AtlasTexture","get_region")
      return _icall_Rect2(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AtlasTexture","set_region")
      _icall_Unit_Rect2(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("AtlasTexture", "AtlasTexture")
        }

  }

  open fun margin(schedule: Rect2.() -> Unit): Rect2 = margin.apply{
      schedule(this)
      margin = this
  }


  open fun region(schedule: Rect2.() -> Unit): Rect2 = region.apply{
      schedule(this)
      region = this
  }


  open fun getAtlas(): Texture {
    val mb = getMethodBind("AtlasTexture","get_atlas")
    return _icall_Texture( mb, this.ptr)
  }

  open fun getMargin(): Rect2 {
    val mb = getMethodBind("AtlasTexture","get_margin")
    return _icall_Rect2( mb, this.ptr)
  }

  open fun getRegion(): Rect2 {
    val mb = getMethodBind("AtlasTexture","get_region")
    return _icall_Rect2( mb, this.ptr)
  }

  open fun hasFilterClip(): Boolean {
    val mb = getMethodBind("AtlasTexture","has_filter_clip")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setAtlas(atlas: Texture) {
    val mb = getMethodBind("AtlasTexture","set_atlas")
    _icall_Unit_Object( mb, this.ptr, atlas)
  }

  open fun setFilterClip(enable: Boolean) {
    val mb = getMethodBind("AtlasTexture","set_filter_clip")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setMargin(margin: Rect2) {
    val mb = getMethodBind("AtlasTexture","set_margin")
    _icall_Unit_Rect2( mb, this.ptr, margin)
  }

  open fun setRegion(region: Rect2) {
    val mb = getMethodBind("AtlasTexture","set_region")
    _icall_Unit_Rect2( mb, this.ptr, region)
  }
}
