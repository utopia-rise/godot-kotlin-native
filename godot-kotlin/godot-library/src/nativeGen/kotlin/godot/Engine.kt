// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Dictionary
import godot.core.Godot
import godot.core.VariantArray
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_String
import godot.icalls._icall_Dictionary
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_MainLoop
import godot.icalls._icall_Object_String
import godot.icalls._icall_String
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_VariantArray
import godot.internal.type.nullSafe
import godot.internal.utils.getMethodBind
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.requireNotNull
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

object Engine : Object() {
  var editorHint: Boolean
    get() {
      val mb = getMethodBind("_Engine","is_editor_hint")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("_Engine","set_editor_hint")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  var iterationsPerSecond: Long
    get() {
      val mb = getMethodBind("_Engine","get_iterations_per_second")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("_Engine","set_iterations_per_second")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  var physicsJitterFix: Double
    get() {
      val mb = getMethodBind("_Engine","get_physics_jitter_fix")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("_Engine","set_physics_jitter_fix")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  var targetFps: Long
    get() {
      val mb = getMethodBind("_Engine","get_target_fps")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("_Engine","set_target_fps")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  var timeScale: Double
    get() {
      val mb = getMethodBind("_Engine","get_time_scale")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("_Engine","set_time_scale")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = memScoped {
      val ptr = nullSafe(Godot.gdnative.godot_global_get_singleton).invoke("Engine".cstr.ptr)
      requireNotNull(ptr) { "No instance found for singleton Engine" }
      ptr
  }

  fun getAuthorInfo(): Dictionary {
    val mb = getMethodBind("_Engine","get_author_info")
    return _icall_Dictionary( mb, this.ptr)
  }

  fun getCopyrightInfo(): VariantArray {
    val mb = getMethodBind("_Engine","get_copyright_info")
    return _icall_VariantArray( mb, this.ptr)
  }

  fun getDonorInfo(): Dictionary {
    val mb = getMethodBind("_Engine","get_donor_info")
    return _icall_Dictionary( mb, this.ptr)
  }

  fun getFramesDrawn(): Long {
    val mb = getMethodBind("_Engine","get_frames_drawn")
    return _icall_Long( mb, this.ptr)
  }

  fun getFramesPerSecond(): Double {
    val mb = getMethodBind("_Engine","get_frames_per_second")
    return _icall_Double( mb, this.ptr)
  }

  fun getIdleFrames(): Long {
    val mb = getMethodBind("_Engine","get_idle_frames")
    return _icall_Long( mb, this.ptr)
  }

  fun getIterationsPerSecond(): Long {
    val mb = getMethodBind("_Engine","get_iterations_per_second")
    return _icall_Long( mb, this.ptr)
  }

  fun getLicenseInfo(): Dictionary {
    val mb = getMethodBind("_Engine","get_license_info")
    return _icall_Dictionary( mb, this.ptr)
  }

  fun getLicenseText(): String {
    val mb = getMethodBind("_Engine","get_license_text")
    return _icall_String( mb, this.ptr)
  }

  fun getMainLoop(): MainLoop {
    val mb = getMethodBind("_Engine","get_main_loop")
    return _icall_MainLoop( mb, this.ptr)
  }

  fun getPhysicsFrames(): Long {
    val mb = getMethodBind("_Engine","get_physics_frames")
    return _icall_Long( mb, this.ptr)
  }

  fun getPhysicsInterpolationFraction(): Double {
    val mb = getMethodBind("_Engine","get_physics_interpolation_fraction")
    return _icall_Double( mb, this.ptr)
  }

  fun getPhysicsJitterFix(): Double {
    val mb = getMethodBind("_Engine","get_physics_jitter_fix")
    return _icall_Double( mb, this.ptr)
  }

  fun getSingleton(name: String): Object {
    val mb = getMethodBind("_Engine","get_singleton")
    return _icall_Object_String( mb, this.ptr, name)
  }

  fun getTargetFps(): Long {
    val mb = getMethodBind("_Engine","get_target_fps")
    return _icall_Long( mb, this.ptr)
  }

  fun getTimeScale(): Double {
    val mb = getMethodBind("_Engine","get_time_scale")
    return _icall_Double( mb, this.ptr)
  }

  fun getVersionInfo(): Dictionary {
    val mb = getMethodBind("_Engine","get_version_info")
    return _icall_Dictionary( mb, this.ptr)
  }

  fun hasSingleton(name: String): Boolean {
    val mb = getMethodBind("_Engine","has_singleton")
    return _icall_Boolean_String( mb, this.ptr, name)
  }

  fun isEditorHint(): Boolean {
    val mb = getMethodBind("_Engine","is_editor_hint")
    return _icall_Boolean( mb, this.ptr)
  }

  fun isInPhysicsFrame(): Boolean {
    val mb = getMethodBind("_Engine","is_in_physics_frame")
    return _icall_Boolean( mb, this.ptr)
  }

  fun setEditorHint(enabled: Boolean) {
    val mb = getMethodBind("_Engine","set_editor_hint")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  fun setIterationsPerSecond(iterationsPerSecond: Long) {
    val mb = getMethodBind("_Engine","set_iterations_per_second")
    _icall_Unit_Long( mb, this.ptr, iterationsPerSecond)
  }

  fun setPhysicsJitterFix(physicsJitterFix: Double) {
    val mb = getMethodBind("_Engine","set_physics_jitter_fix")
    _icall_Unit_Double( mb, this.ptr, physicsJitterFix)
  }

  fun setTargetFps(targetFps: Long) {
    val mb = getMethodBind("_Engine","set_target_fps")
    _icall_Unit_Long( mb, this.ptr, targetFps)
  }

  fun setTimeScale(timeScale: Double) {
    val mb = getMethodBind("_Engine","set_time_scale")
    _icall_Unit_Double( mb, this.ptr, timeScale)
  }
}
