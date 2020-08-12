// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_Double_Long
import godot.icalls._icall_Long
import godot.icalls._icall_Texture_Long
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Double
import godot.icalls._icall_Unit_Long_Object
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long

open class AnimatedTexture internal constructor(
  _ignore: Any?
) : Texture(_ignore) {
  open var currentFrame: Long
    get() {
      val mb = getMethodBind("AnimatedTexture","get_current_frame")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_current_frame")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var fps: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_fps")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_fps")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var frame0_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 0, value)
    }

  open var frame0_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 0)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 0, value)
    }

  open var frame1_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 1, value)
    }

  open var frame1_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 1)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 1, value)
    }

  open var frame10_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 10)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 10, value)
    }

  open var frame10_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 10)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 10, value)
    }

  open var frame100_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 100)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 100, value)
    }

  open var frame100_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 100)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 100, value)
    }

  open var frame101_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 101)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 101, value)
    }

  open var frame101_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 101)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 101, value)
    }

  open var frame102_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 102)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 102, value)
    }

  open var frame102_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 102)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 102, value)
    }

  open var frame103_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 103)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 103, value)
    }

  open var frame103_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 103)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 103, value)
    }

  open var frame104_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 104)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 104, value)
    }

  open var frame104_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 104)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 104, value)
    }

  open var frame105_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 105)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 105, value)
    }

  open var frame105_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 105)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 105, value)
    }

  open var frame106_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 106)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 106, value)
    }

  open var frame106_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 106)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 106, value)
    }

  open var frame107_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 107)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 107, value)
    }

  open var frame107_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 107)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 107, value)
    }

  open var frame108_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 108)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 108, value)
    }

  open var frame108_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 108)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 108, value)
    }

  open var frame109_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 109)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 109, value)
    }

  open var frame109_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 109)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 109, value)
    }

  open var frame11_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 11)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 11, value)
    }

  open var frame11_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 11)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 11, value)
    }

  open var frame110_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 110)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 110, value)
    }

  open var frame110_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 110)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 110, value)
    }

  open var frame111_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 111)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 111, value)
    }

  open var frame111_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 111)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 111, value)
    }

  open var frame112_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 112)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 112, value)
    }

  open var frame112_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 112)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 112, value)
    }

  open var frame113_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 113)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 113, value)
    }

  open var frame113_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 113)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 113, value)
    }

  open var frame114_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 114)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 114, value)
    }

  open var frame114_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 114)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 114, value)
    }

  open var frame115_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 115)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 115, value)
    }

  open var frame115_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 115)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 115, value)
    }

  open var frame116_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 116)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 116, value)
    }

  open var frame116_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 116)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 116, value)
    }

  open var frame117_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 117)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 117, value)
    }

  open var frame117_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 117)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 117, value)
    }

  open var frame118_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 118)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 118, value)
    }

  open var frame118_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 118)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 118, value)
    }

  open var frame119_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 119)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 119, value)
    }

  open var frame119_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 119)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 119, value)
    }

  open var frame12_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 12)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 12, value)
    }

  open var frame12_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 12)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 12, value)
    }

  open var frame120_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 120)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 120, value)
    }

  open var frame120_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 120)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 120, value)
    }

  open var frame121_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 121)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 121, value)
    }

  open var frame121_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 121)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 121, value)
    }

  open var frame122_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 122)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 122, value)
    }

  open var frame122_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 122)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 122, value)
    }

  open var frame123_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 123)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 123, value)
    }

  open var frame123_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 123)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 123, value)
    }

  open var frame124_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 124)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 124, value)
    }

  open var frame124_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 124)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 124, value)
    }

  open var frame125_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 125)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 125, value)
    }

  open var frame125_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 125)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 125, value)
    }

  open var frame126_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 126)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 126, value)
    }

  open var frame126_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 126)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 126, value)
    }

  open var frame127_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 127)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 127, value)
    }

  open var frame127_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 127)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 127, value)
    }

  open var frame128_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 128)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 128, value)
    }

  open var frame128_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 128)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 128, value)
    }

  open var frame129_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 129)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 129, value)
    }

  open var frame129_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 129)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 129, value)
    }

  open var frame13_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 13)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 13, value)
    }

  open var frame13_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 13)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 13, value)
    }

  open var frame130_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 130)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 130, value)
    }

  open var frame130_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 130)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 130, value)
    }

  open var frame131_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 131)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 131, value)
    }

  open var frame131_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 131)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 131, value)
    }

  open var frame132_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 132)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 132, value)
    }

  open var frame132_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 132)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 132, value)
    }

  open var frame133_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 133)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 133, value)
    }

  open var frame133_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 133)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 133, value)
    }

  open var frame134_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 134)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 134, value)
    }

  open var frame134_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 134)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 134, value)
    }

  open var frame135_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 135)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 135, value)
    }

  open var frame135_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 135)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 135, value)
    }

  open var frame136_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 136)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 136, value)
    }

  open var frame136_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 136)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 136, value)
    }

  open var frame137_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 137)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 137, value)
    }

  open var frame137_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 137)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 137, value)
    }

  open var frame138_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 138)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 138, value)
    }

  open var frame138_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 138)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 138, value)
    }

  open var frame139_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 139)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 139, value)
    }

  open var frame139_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 139)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 139, value)
    }

  open var frame14_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 14)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 14, value)
    }

  open var frame14_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 14)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 14, value)
    }

  open var frame140_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 140)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 140, value)
    }

  open var frame140_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 140)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 140, value)
    }

  open var frame141_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 141)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 141, value)
    }

  open var frame141_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 141)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 141, value)
    }

  open var frame142_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 142)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 142, value)
    }

  open var frame142_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 142)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 142, value)
    }

  open var frame143_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 143)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 143, value)
    }

  open var frame143_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 143)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 143, value)
    }

  open var frame144_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 144)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 144, value)
    }

  open var frame144_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 144)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 144, value)
    }

  open var frame145_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 145)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 145, value)
    }

  open var frame145_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 145)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 145, value)
    }

  open var frame146_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 146)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 146, value)
    }

  open var frame146_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 146)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 146, value)
    }

  open var frame147_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 147)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 147, value)
    }

  open var frame147_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 147)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 147, value)
    }

  open var frame148_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 148)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 148, value)
    }

  open var frame148_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 148)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 148, value)
    }

  open var frame149_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 149)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 149, value)
    }

  open var frame149_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 149)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 149, value)
    }

  open var frame15_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 15)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 15, value)
    }

  open var frame15_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 15)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 15, value)
    }

  open var frame150_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 150)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 150, value)
    }

  open var frame150_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 150)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 150, value)
    }

  open var frame151_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 151)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 151, value)
    }

  open var frame151_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 151)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 151, value)
    }

  open var frame152_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 152)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 152, value)
    }

  open var frame152_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 152)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 152, value)
    }

  open var frame153_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 153)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 153, value)
    }

  open var frame153_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 153)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 153, value)
    }

  open var frame154_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 154)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 154, value)
    }

  open var frame154_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 154)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 154, value)
    }

  open var frame155_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 155)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 155, value)
    }

  open var frame155_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 155)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 155, value)
    }

  open var frame156_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 156)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 156, value)
    }

  open var frame156_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 156)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 156, value)
    }

  open var frame157_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 157)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 157, value)
    }

  open var frame157_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 157)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 157, value)
    }

  open var frame158_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 158)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 158, value)
    }

  open var frame158_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 158)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 158, value)
    }

  open var frame159_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 159)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 159, value)
    }

  open var frame159_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 159)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 159, value)
    }

  open var frame16_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 16)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 16, value)
    }

  open var frame16_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 16)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 16, value)
    }

  open var frame160_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 160)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 160, value)
    }

  open var frame160_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 160)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 160, value)
    }

  open var frame161_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 161)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 161, value)
    }

  open var frame161_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 161)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 161, value)
    }

  open var frame162_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 162)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 162, value)
    }

  open var frame162_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 162)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 162, value)
    }

  open var frame163_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 163)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 163, value)
    }

  open var frame163_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 163)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 163, value)
    }

  open var frame164_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 164)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 164, value)
    }

  open var frame164_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 164)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 164, value)
    }

  open var frame165_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 165)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 165, value)
    }

  open var frame165_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 165)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 165, value)
    }

  open var frame166_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 166)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 166, value)
    }

  open var frame166_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 166)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 166, value)
    }

  open var frame167_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 167)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 167, value)
    }

  open var frame167_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 167)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 167, value)
    }

  open var frame168_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 168)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 168, value)
    }

  open var frame168_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 168)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 168, value)
    }

  open var frame169_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 169)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 169, value)
    }

  open var frame169_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 169)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 169, value)
    }

  open var frame17_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 17)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 17, value)
    }

  open var frame17_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 17)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 17, value)
    }

  open var frame170_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 170)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 170, value)
    }

  open var frame170_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 170)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 170, value)
    }

  open var frame171_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 171)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 171, value)
    }

  open var frame171_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 171)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 171, value)
    }

  open var frame172_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 172)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 172, value)
    }

  open var frame172_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 172)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 172, value)
    }

  open var frame173_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 173)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 173, value)
    }

  open var frame173_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 173)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 173, value)
    }

  open var frame174_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 174)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 174, value)
    }

  open var frame174_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 174)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 174, value)
    }

  open var frame175_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 175)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 175, value)
    }

  open var frame175_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 175)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 175, value)
    }

  open var frame176_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 176)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 176, value)
    }

  open var frame176_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 176)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 176, value)
    }

  open var frame177_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 177)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 177, value)
    }

  open var frame177_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 177)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 177, value)
    }

  open var frame178_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 178)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 178, value)
    }

  open var frame178_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 178)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 178, value)
    }

  open var frame179_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 179)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 179, value)
    }

  open var frame179_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 179)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 179, value)
    }

  open var frame18_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 18)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 18, value)
    }

  open var frame18_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 18)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 18, value)
    }

  open var frame180_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 180)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 180, value)
    }

  open var frame180_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 180)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 180, value)
    }

  open var frame181_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 181)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 181, value)
    }

  open var frame181_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 181)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 181, value)
    }

  open var frame182_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 182)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 182, value)
    }

  open var frame182_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 182)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 182, value)
    }

  open var frame183_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 183)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 183, value)
    }

  open var frame183_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 183)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 183, value)
    }

  open var frame184_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 184)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 184, value)
    }

  open var frame184_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 184)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 184, value)
    }

  open var frame185_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 185)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 185, value)
    }

  open var frame185_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 185)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 185, value)
    }

  open var frame186_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 186)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 186, value)
    }

  open var frame186_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 186)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 186, value)
    }

  open var frame187_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 187)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 187, value)
    }

  open var frame187_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 187)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 187, value)
    }

  open var frame188_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 188)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 188, value)
    }

  open var frame188_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 188)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 188, value)
    }

  open var frame189_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 189)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 189, value)
    }

  open var frame189_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 189)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 189, value)
    }

  open var frame19_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 19)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 19, value)
    }

  open var frame19_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 19)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 19, value)
    }

  open var frame190_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 190)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 190, value)
    }

  open var frame190_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 190)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 190, value)
    }

  open var frame191_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 191)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 191, value)
    }

  open var frame191_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 191)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 191, value)
    }

  open var frame192_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 192)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 192, value)
    }

  open var frame192_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 192)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 192, value)
    }

  open var frame193_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 193)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 193, value)
    }

  open var frame193_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 193)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 193, value)
    }

  open var frame194_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 194)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 194, value)
    }

  open var frame194_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 194)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 194, value)
    }

  open var frame195_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 195)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 195, value)
    }

  open var frame195_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 195)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 195, value)
    }

  open var frame196_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 196)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 196, value)
    }

  open var frame196_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 196)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 196, value)
    }

  open var frame197_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 197)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 197, value)
    }

  open var frame197_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 197)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 197, value)
    }

  open var frame198_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 198)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 198, value)
    }

  open var frame198_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 198)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 198, value)
    }

  open var frame199_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 199)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 199, value)
    }

  open var frame199_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 199)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 199, value)
    }

  open var frame2_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 2, value)
    }

  open var frame2_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 2)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 2, value)
    }

  open var frame20_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 20)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 20, value)
    }

  open var frame20_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 20)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 20, value)
    }

  open var frame200_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 200)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 200, value)
    }

  open var frame200_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 200)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 200, value)
    }

  open var frame201_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 201)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 201, value)
    }

  open var frame201_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 201)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 201, value)
    }

  open var frame202_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 202)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 202, value)
    }

  open var frame202_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 202)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 202, value)
    }

  open var frame203_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 203)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 203, value)
    }

  open var frame203_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 203)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 203, value)
    }

  open var frame204_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 204)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 204, value)
    }

  open var frame204_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 204)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 204, value)
    }

  open var frame205_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 205)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 205, value)
    }

  open var frame205_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 205)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 205, value)
    }

  open var frame206_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 206)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 206, value)
    }

  open var frame206_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 206)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 206, value)
    }

  open var frame207_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 207)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 207, value)
    }

  open var frame207_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 207)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 207, value)
    }

  open var frame208_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 208)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 208, value)
    }

  open var frame208_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 208)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 208, value)
    }

  open var frame209_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 209)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 209, value)
    }

  open var frame209_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 209)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 209, value)
    }

  open var frame21_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 21)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 21, value)
    }

  open var frame21_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 21)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 21, value)
    }

  open var frame210_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 210)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 210, value)
    }

  open var frame210_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 210)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 210, value)
    }

  open var frame211_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 211)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 211, value)
    }

  open var frame211_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 211)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 211, value)
    }

  open var frame212_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 212)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 212, value)
    }

  open var frame212_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 212)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 212, value)
    }

  open var frame213_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 213)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 213, value)
    }

  open var frame213_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 213)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 213, value)
    }

  open var frame214_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 214)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 214, value)
    }

  open var frame214_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 214)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 214, value)
    }

  open var frame215_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 215)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 215, value)
    }

  open var frame215_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 215)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 215, value)
    }

  open var frame216_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 216)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 216, value)
    }

  open var frame216_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 216)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 216, value)
    }

  open var frame217_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 217)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 217, value)
    }

  open var frame217_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 217)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 217, value)
    }

  open var frame218_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 218)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 218, value)
    }

  open var frame218_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 218)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 218, value)
    }

  open var frame219_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 219)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 219, value)
    }

  open var frame219_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 219)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 219, value)
    }

  open var frame22_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 22)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 22, value)
    }

  open var frame22_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 22)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 22, value)
    }

  open var frame220_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 220)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 220, value)
    }

  open var frame220_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 220)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 220, value)
    }

  open var frame221_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 221)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 221, value)
    }

  open var frame221_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 221)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 221, value)
    }

  open var frame222_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 222)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 222, value)
    }

  open var frame222_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 222)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 222, value)
    }

  open var frame223_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 223)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 223, value)
    }

  open var frame223_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 223)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 223, value)
    }

  open var frame224_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 224)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 224, value)
    }

  open var frame224_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 224)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 224, value)
    }

  open var frame225_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 225)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 225, value)
    }

  open var frame225_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 225)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 225, value)
    }

  open var frame226_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 226)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 226, value)
    }

  open var frame226_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 226)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 226, value)
    }

  open var frame227_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 227)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 227, value)
    }

  open var frame227_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 227)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 227, value)
    }

  open var frame228_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 228)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 228, value)
    }

  open var frame228_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 228)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 228, value)
    }

  open var frame229_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 229)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 229, value)
    }

  open var frame229_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 229)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 229, value)
    }

  open var frame23_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 23)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 23, value)
    }

  open var frame23_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 23)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 23, value)
    }

  open var frame230_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 230)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 230, value)
    }

  open var frame230_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 230)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 230, value)
    }

  open var frame231_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 231)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 231, value)
    }

  open var frame231_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 231)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 231, value)
    }

  open var frame232_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 232)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 232, value)
    }

  open var frame232_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 232)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 232, value)
    }

  open var frame233_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 233)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 233, value)
    }

  open var frame233_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 233)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 233, value)
    }

  open var frame234_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 234)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 234, value)
    }

  open var frame234_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 234)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 234, value)
    }

  open var frame235_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 235)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 235, value)
    }

  open var frame235_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 235)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 235, value)
    }

  open var frame236_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 236)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 236, value)
    }

  open var frame236_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 236)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 236, value)
    }

  open var frame237_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 237)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 237, value)
    }

  open var frame237_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 237)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 237, value)
    }

  open var frame238_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 238)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 238, value)
    }

  open var frame238_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 238)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 238, value)
    }

  open var frame239_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 239)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 239, value)
    }

  open var frame239_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 239)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 239, value)
    }

  open var frame24_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 24)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 24, value)
    }

  open var frame24_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 24)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 24, value)
    }

  open var frame240_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 240)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 240, value)
    }

  open var frame240_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 240)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 240, value)
    }

  open var frame241_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 241)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 241, value)
    }

  open var frame241_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 241)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 241, value)
    }

  open var frame242_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 242)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 242, value)
    }

  open var frame242_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 242)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 242, value)
    }

  open var frame243_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 243)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 243, value)
    }

  open var frame243_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 243)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 243, value)
    }

  open var frame244_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 244)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 244, value)
    }

  open var frame244_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 244)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 244, value)
    }

  open var frame245_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 245)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 245, value)
    }

  open var frame245_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 245)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 245, value)
    }

  open var frame246_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 246)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 246, value)
    }

  open var frame246_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 246)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 246, value)
    }

  open var frame247_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 247)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 247, value)
    }

  open var frame247_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 247)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 247, value)
    }

  open var frame248_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 248)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 248, value)
    }

  open var frame248_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 248)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 248, value)
    }

  open var frame249_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 249)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 249, value)
    }

  open var frame249_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 249)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 249, value)
    }

  open var frame25_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 25)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 25, value)
    }

  open var frame25_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 25)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 25, value)
    }

  open var frame250_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 250)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 250, value)
    }

  open var frame250_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 250)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 250, value)
    }

  open var frame251_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 251)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 251, value)
    }

  open var frame251_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 251)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 251, value)
    }

  open var frame252_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 252)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 252, value)
    }

  open var frame252_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 252)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 252, value)
    }

  open var frame253_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 253)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 253, value)
    }

  open var frame253_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 253)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 253, value)
    }

  open var frame254_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 254)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 254, value)
    }

  open var frame254_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 254)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 254, value)
    }

  open var frame255_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 255)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 255, value)
    }

  open var frame255_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 255)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 255, value)
    }

  open var frame26_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 26)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 26, value)
    }

  open var frame26_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 26)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 26, value)
    }

  open var frame27_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 27)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 27, value)
    }

  open var frame27_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 27)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 27, value)
    }

  open var frame28_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 28)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 28, value)
    }

  open var frame28_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 28)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 28, value)
    }

  open var frame29_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 29)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 29, value)
    }

  open var frame29_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 29)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 29, value)
    }

  open var frame3_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 3, value)
    }

  open var frame3_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 3)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 3, value)
    }

  open var frame30_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 30)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 30, value)
    }

  open var frame30_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 30)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 30, value)
    }

  open var frame31_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 31)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 31, value)
    }

  open var frame31_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 31)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 31, value)
    }

  open var frame32_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 32)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 32, value)
    }

  open var frame32_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 32)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 32, value)
    }

  open var frame33_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 33)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 33, value)
    }

  open var frame33_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 33)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 33, value)
    }

  open var frame34_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 34)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 34, value)
    }

  open var frame34_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 34)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 34, value)
    }

  open var frame35_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 35)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 35, value)
    }

  open var frame35_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 35)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 35, value)
    }

  open var frame36_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 36)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 36, value)
    }

  open var frame36_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 36)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 36, value)
    }

  open var frame37_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 37)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 37, value)
    }

  open var frame37_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 37)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 37, value)
    }

  open var frame38_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 38)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 38, value)
    }

  open var frame38_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 38)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 38, value)
    }

  open var frame39_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 39)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 39, value)
    }

  open var frame39_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 39)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 39, value)
    }

  open var frame4_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 4)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 4, value)
    }

  open var frame4_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 4)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 4, value)
    }

  open var frame40_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 40)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 40, value)
    }

  open var frame40_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 40)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 40, value)
    }

  open var frame41_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 41)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 41, value)
    }

  open var frame41_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 41)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 41, value)
    }

  open var frame42_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 42)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 42, value)
    }

  open var frame42_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 42)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 42, value)
    }

  open var frame43_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 43)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 43, value)
    }

  open var frame43_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 43)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 43, value)
    }

  open var frame44_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 44)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 44, value)
    }

  open var frame44_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 44)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 44, value)
    }

  open var frame45_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 45)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 45, value)
    }

  open var frame45_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 45)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 45, value)
    }

  open var frame46_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 46)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 46, value)
    }

  open var frame46_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 46)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 46, value)
    }

  open var frame47_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 47)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 47, value)
    }

  open var frame47_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 47)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 47, value)
    }

  open var frame48_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 48)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 48, value)
    }

  open var frame48_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 48)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 48, value)
    }

  open var frame49_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 49)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 49, value)
    }

  open var frame49_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 49)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 49, value)
    }

  open var frame5_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 5)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 5, value)
    }

  open var frame5_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 5)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 5, value)
    }

  open var frame50_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 50)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 50, value)
    }

  open var frame50_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 50)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 50, value)
    }

  open var frame51_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 51)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 51, value)
    }

  open var frame51_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 51)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 51, value)
    }

  open var frame52_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 52)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 52, value)
    }

  open var frame52_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 52)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 52, value)
    }

  open var frame53_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 53)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 53, value)
    }

  open var frame53_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 53)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 53, value)
    }

  open var frame54_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 54)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 54, value)
    }

  open var frame54_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 54)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 54, value)
    }

  open var frame55_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 55)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 55, value)
    }

  open var frame55_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 55)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 55, value)
    }

  open var frame56_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 56)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 56, value)
    }

  open var frame56_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 56)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 56, value)
    }

  open var frame57_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 57)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 57, value)
    }

  open var frame57_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 57)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 57, value)
    }

  open var frame58_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 58)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 58, value)
    }

  open var frame58_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 58)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 58, value)
    }

  open var frame59_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 59)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 59, value)
    }

  open var frame59_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 59)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 59, value)
    }

  open var frame6_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 6)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 6, value)
    }

  open var frame6_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 6)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 6, value)
    }

  open var frame60_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 60)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 60, value)
    }

  open var frame60_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 60)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 60, value)
    }

  open var frame61_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 61)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 61, value)
    }

  open var frame61_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 61)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 61, value)
    }

  open var frame62_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 62)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 62, value)
    }

  open var frame62_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 62)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 62, value)
    }

  open var frame63_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 63)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 63, value)
    }

  open var frame63_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 63)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 63, value)
    }

  open var frame64_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 64)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 64, value)
    }

  open var frame64_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 64)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 64, value)
    }

  open var frame65_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 65)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 65, value)
    }

  open var frame65_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 65)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 65, value)
    }

  open var frame66_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 66)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 66, value)
    }

  open var frame66_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 66)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 66, value)
    }

  open var frame67_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 67)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 67, value)
    }

  open var frame67_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 67)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 67, value)
    }

  open var frame68_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 68)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 68, value)
    }

  open var frame68_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 68)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 68, value)
    }

  open var frame69_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 69)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 69, value)
    }

  open var frame69_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 69)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 69, value)
    }

  open var frame7_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 7)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 7, value)
    }

  open var frame7_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 7)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 7, value)
    }

  open var frame70_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 70)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 70, value)
    }

  open var frame70_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 70)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 70, value)
    }

  open var frame71_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 71)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 71, value)
    }

  open var frame71_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 71)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 71, value)
    }

  open var frame72_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 72)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 72, value)
    }

  open var frame72_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 72)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 72, value)
    }

  open var frame73_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 73)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 73, value)
    }

  open var frame73_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 73)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 73, value)
    }

  open var frame74_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 74)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 74, value)
    }

  open var frame74_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 74)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 74, value)
    }

  open var frame75_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 75)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 75, value)
    }

  open var frame75_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 75)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 75, value)
    }

  open var frame76_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 76)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 76, value)
    }

  open var frame76_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 76)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 76, value)
    }

  open var frame77_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 77)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 77, value)
    }

  open var frame77_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 77)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 77, value)
    }

  open var frame78_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 78)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 78, value)
    }

  open var frame78_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 78)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 78, value)
    }

  open var frame79_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 79)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 79, value)
    }

  open var frame79_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 79)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 79, value)
    }

  open var frame8_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 8)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 8, value)
    }

  open var frame8_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 8)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 8, value)
    }

  open var frame80_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 80)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 80, value)
    }

  open var frame80_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 80)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 80, value)
    }

  open var frame81_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 81)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 81, value)
    }

  open var frame81_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 81)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 81, value)
    }

  open var frame82_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 82)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 82, value)
    }

  open var frame82_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 82)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 82, value)
    }

  open var frame83_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 83)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 83, value)
    }

  open var frame83_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 83)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 83, value)
    }

  open var frame84_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 84)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 84, value)
    }

  open var frame84_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 84)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 84, value)
    }

  open var frame85_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 85)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 85, value)
    }

  open var frame85_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 85)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 85, value)
    }

  open var frame86_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 86)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 86, value)
    }

  open var frame86_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 86)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 86, value)
    }

  open var frame87_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 87)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 87, value)
    }

  open var frame87_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 87)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 87, value)
    }

  open var frame88_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 88)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 88, value)
    }

  open var frame88_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 88)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 88, value)
    }

  open var frame89_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 89)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 89, value)
    }

  open var frame89_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 89)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 89, value)
    }

  open var frame9_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 9)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 9, value)
    }

  open var frame9_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 9)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 9, value)
    }

  open var frame90_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 90)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 90, value)
    }

  open var frame90_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 90)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 90, value)
    }

  open var frame91_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 91)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 91, value)
    }

  open var frame91_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 91)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 91, value)
    }

  open var frame92_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 92)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 92, value)
    }

  open var frame92_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 92)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 92, value)
    }

  open var frame93_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 93)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 93, value)
    }

  open var frame93_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 93)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 93, value)
    }

  open var frame94_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 94)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 94, value)
    }

  open var frame94_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 94)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 94, value)
    }

  open var frame95_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 95)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 95, value)
    }

  open var frame95_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 95)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 95, value)
    }

  open var frame96_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 96)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 96, value)
    }

  open var frame96_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 96)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 96, value)
    }

  open var frame97_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 97)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 97, value)
    }

  open var frame97_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 97)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 97, value)
    }

  open var frame98_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 98)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 98, value)
    }

  open var frame98_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 98)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 98, value)
    }

  open var frame99_delaySec: Double
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_delay")
      return _icall_Double_Long(mb, this.ptr, 99)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_delay")
      _icall_Unit_Long_Double(mb, this.ptr, 99, value)
    }

  open var frame99_texture: Texture
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frame_texture")
      return _icall_Texture_Long(mb, this.ptr, 99)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frame_texture")
      _icall_Unit_Long_Object(mb, this.ptr, 99, value)
    }

  open var frames: Long
    get() {
      val mb = getMethodBind("AnimatedTexture","get_frames")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_frames")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var oneshot: Boolean
    get() {
      val mb = getMethodBind("AnimatedTexture","get_oneshot")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_oneshot")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var pause: Boolean
    get() {
      val mb = getMethodBind("AnimatedTexture","get_pause")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("AnimatedTexture","set_pause")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("AnimatedTexture", "AnimatedTexture")
        }

  }

  open fun _updateProxy() {
  }

  open fun getCurrentFrame(): Long {
    val mb = getMethodBind("AnimatedTexture","get_current_frame")
    return _icall_Long( mb, this.ptr)
  }

  open fun getFps(): Double {
    val mb = getMethodBind("AnimatedTexture","get_fps")
    return _icall_Double( mb, this.ptr)
  }

  open fun getFrameDelay(frame: Long): Double {
    val mb = getMethodBind("AnimatedTexture","get_frame_delay")
    return _icall_Double_Long( mb, this.ptr, frame)
  }

  open fun getFrameTexture(frame: Long): Texture {
    val mb = getMethodBind("AnimatedTexture","get_frame_texture")
    return _icall_Texture_Long( mb, this.ptr, frame)
  }

  open fun getFrames(): Long {
    val mb = getMethodBind("AnimatedTexture","get_frames")
    return _icall_Long( mb, this.ptr)
  }

  open fun getOneshot(): Boolean {
    val mb = getMethodBind("AnimatedTexture","get_oneshot")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getPause(): Boolean {
    val mb = getMethodBind("AnimatedTexture","get_pause")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setCurrentFrame(frame: Long) {
    val mb = getMethodBind("AnimatedTexture","set_current_frame")
    _icall_Unit_Long( mb, this.ptr, frame)
  }

  open fun setFps(fps: Double) {
    val mb = getMethodBind("AnimatedTexture","set_fps")
    _icall_Unit_Double( mb, this.ptr, fps)
  }

  open fun setFrameDelay(frame: Long, delay: Double) {
    val mb = getMethodBind("AnimatedTexture","set_frame_delay")
    _icall_Unit_Long_Double( mb, this.ptr, frame, delay)
  }

  open fun setFrameTexture(frame: Long, texture: Texture) {
    val mb = getMethodBind("AnimatedTexture","set_frame_texture")
    _icall_Unit_Long_Object( mb, this.ptr, frame, texture)
  }

  open fun setFrames(frames: Long) {
    val mb = getMethodBind("AnimatedTexture","set_frames")
    _icall_Unit_Long( mb, this.ptr, frames)
  }

  open fun setOneshot(oneshot: Boolean) {
    val mb = getMethodBind("AnimatedTexture","set_oneshot")
    _icall_Unit_Boolean( mb, this.ptr, oneshot)
  }

  open fun setPause(pause: Boolean) {
    val mb = getMethodBind("AnimatedTexture","set_pause")
    _icall_Unit_Boolean( mb, this.ptr, pause)
  }

  companion object {
    final const val MAX_FRAMES: Long = 256
  }
}
