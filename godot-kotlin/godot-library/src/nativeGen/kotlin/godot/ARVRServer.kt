// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot
import godot.core.Signal1
import godot.core.Signal3
import godot.core.Transform
import godot.core.VariantArray
import godot.core.signal
import godot.icalls._icall_ARVRInterface
import godot.icalls._icall_ARVRInterface_Long
import godot.icalls._icall_ARVRInterface_String
import godot.icalls._icall_ARVRPositionalTracker_Long
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Transform
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long_Boolean
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_VariantArray
import godot.internal.type.nullSafe
import godot.internal.utils.getMethodBind
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.requireNotNull
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

object ARVRServer : Object() {
  init {
    memScoped {
        val ptr = nullSafe(Godot.gdnative.godot_global_get_singleton).invoke("ARVRServer".cstr.ptr)
        requireNotNull(ptr) { "No instance found for singleton ARVRServer" }
        this@ARVRServer.ptr = ptr
    }
  }

  final const val DONT_RESET_ROTATION: Long = 2

  final const val RESET_BUT_KEEP_TILT: Long = 1

  final const val RESET_FULL_ROTATION: Long = 0

  final const val TRACKER_ANCHOR: Long = 4

  final const val TRACKER_ANY: Long = 255

  final const val TRACKER_ANY_KNOWN: Long = 127

  final const val TRACKER_BASESTATION: Long = 2

  final const val TRACKER_CONTROLLER: Long = 1

  final const val TRACKER_UNKNOWN: Long = 128

  val interfaceAdded: Signal1<String> by signal("interface_name")

  val interfaceRemoved: Signal1<String> by signal("interface_name")

  val trackerAdded: Signal3<String, Long, Long> by signal("tracker_name", "type", "id")

  val trackerRemoved: Signal3<String, Long, Long> by signal("tracker_name", "type", "id")

  var primaryInterface: ARVRInterface
    get() {
      val mb = getMethodBind("ARVRServer","get_primary_interface")
      return _icall_ARVRInterface(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ARVRServer","set_primary_interface")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  var worldScale: Double
    get() {
      val mb = getMethodBind("ARVRServer","get_world_scale")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("ARVRServer","set_world_scale")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  fun centerOnHmd(rotationMode: Long, keepHeight: Boolean) {
    val mb = getMethodBind("ARVRServer","center_on_hmd")
    _icall_Unit_Long_Boolean( mb, this.ptr, rotationMode, keepHeight)
  }

  fun findInterface(name: String): ARVRInterface {
    val mb = getMethodBind("ARVRServer","find_interface")
    return _icall_ARVRInterface_String( mb, this.ptr, name)
  }

  fun getHmdTransform(): Transform {
    val mb = getMethodBind("ARVRServer","get_hmd_transform")
    return _icall_Transform( mb, this.ptr)
  }

  fun getInterface(idx: Long): ARVRInterface {
    val mb = getMethodBind("ARVRServer","get_interface")
    return _icall_ARVRInterface_Long( mb, this.ptr, idx)
  }

  fun getInterfaceCount(): Long {
    val mb = getMethodBind("ARVRServer","get_interface_count")
    return _icall_Long( mb, this.ptr)
  }

  fun getInterfaces(): VariantArray {
    val mb = getMethodBind("ARVRServer","get_interfaces")
    return _icall_VariantArray( mb, this.ptr)
  }

  fun getLastCommitUsec(): Long {
    val mb = getMethodBind("ARVRServer","get_last_commit_usec")
    return _icall_Long( mb, this.ptr)
  }

  fun getLastFrameUsec(): Long {
    val mb = getMethodBind("ARVRServer","get_last_frame_usec")
    return _icall_Long( mb, this.ptr)
  }

  fun getLastProcessUsec(): Long {
    val mb = getMethodBind("ARVRServer","get_last_process_usec")
    return _icall_Long( mb, this.ptr)
  }

  fun getPrimaryInterface(): ARVRInterface {
    val mb = getMethodBind("ARVRServer","get_primary_interface")
    return _icall_ARVRInterface( mb, this.ptr)
  }

  fun getReferenceFrame(): Transform {
    val mb = getMethodBind("ARVRServer","get_reference_frame")
    return _icall_Transform( mb, this.ptr)
  }

  fun getTracker(idx: Long): ARVRPositionalTracker {
    val mb = getMethodBind("ARVRServer","get_tracker")
    return _icall_ARVRPositionalTracker_Long( mb, this.ptr, idx)
  }

  fun getTrackerCount(): Long {
    val mb = getMethodBind("ARVRServer","get_tracker_count")
    return _icall_Long( mb, this.ptr)
  }

  fun getWorldScale(): Double {
    val mb = getMethodBind("ARVRServer","get_world_scale")
    return _icall_Double( mb, this.ptr)
  }

  fun setPrimaryInterface(_interface: ARVRInterface) {
    val mb = getMethodBind("ARVRServer","set_primary_interface")
    _icall_Unit_Object( mb, this.ptr, _interface)
  }

  fun setWorldScale(arg0: Double) {
    val mb = getMethodBind("ARVRServer","set_world_scale")
    _icall_Unit_Double( mb, this.ptr, arg0)
  }

  enum class RotationMode(
    id: Long
  ) {
    RESET_FULL_ROTATION(0),

    RESET_BUT_KEEP_TILT(1),

    DONT_RESET_ROTATION(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class TrackerType(
    id: Long
  ) {
    TRACKER_CONTROLLER(1),

    TRACKER_BASESTATION(2),

    TRACKER_ANCHOR(4),

    TRACKER_ANY_KNOWN(127),

    TRACKER_UNKNOWN(128),

    TRACKER_ANY(255);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }
}
