// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.BakedLightmap
import godot.core.Godot.shouldInitPtr
import godot.core.Vector3
import godot.icalls._icall_BakedLightmapData
import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_Long_nObject_Boolean
import godot.icalls._icall_String
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_String
import godot.icalls._icall_Unit_Vector3
import godot.icalls._icall_Vector3
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Unit

open class BakedLightmap internal constructor(
  _ignore: Any?
) : VisualInstance(_ignore) {
  open var bakeCellSize: Double
    get() {
      val mb = getMethodBind("BakedLightmap","get_bake_cell_size")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("BakedLightmap","set_bake_cell_size")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var bakeDefaultTexelsPerUnit: Double
    get() {
      val mb = getMethodBind("BakedLightmap","get_bake_default_texels_per_unit")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("BakedLightmap","set_bake_default_texels_per_unit")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var bakeEnergy: Double
    get() {
      val mb = getMethodBind("BakedLightmap","get_energy")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("BakedLightmap","set_energy")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var bakeExtents: Vector3
    get() {
      val mb = getMethodBind("BakedLightmap","get_extents")
      return _icall_Vector3(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("BakedLightmap","set_extents")
      _icall_Unit_Vector3(mb, this.ptr, value)
    }

  open var bakeHdr: Boolean
    get() {
      val mb = getMethodBind("BakedLightmap","is_hdr")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("BakedLightmap","set_hdr")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var bakeMode: Long
    get() {
      val mb = getMethodBind("BakedLightmap","get_bake_mode")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("BakedLightmap","set_bake_mode")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var bakePropagation: Double
    get() {
      val mb = getMethodBind("BakedLightmap","get_propagation")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("BakedLightmap","set_propagation")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var bakeQuality: Long
    get() {
      val mb = getMethodBind("BakedLightmap","get_bake_quality")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("BakedLightmap","set_bake_quality")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var captureCellSize: Double
    get() {
      val mb = getMethodBind("BakedLightmap","get_capture_cell_size")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("BakedLightmap","set_capture_cell_size")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var imagePath: String
    get() {
      val mb = getMethodBind("BakedLightmap","get_image_path")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("BakedLightmap","set_image_path")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var lightData: BakedLightmapData
    get() {
      val mb = getMethodBind("BakedLightmap","get_light_data")
      return _icall_BakedLightmapData(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("BakedLightmap","set_light_data")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("BakedLightmap", "BakedLightmap")
        }

  }

  open fun bakeExtents(schedule: Vector3.() -> Unit): Vector3 = bakeExtents.apply{
      schedule(this)
      bakeExtents = this
  }


  open fun bake(fromNode: Node? = null, createVisualDebug: Boolean = false):
      BakedLightmap.BakeError {
    val mb = getMethodBind("BakedLightmap","bake")
    return BakedLightmap.BakeError.from( _icall_Long_nObject_Boolean( mb, this.ptr, fromNode,
        createVisualDebug))
  }

  open fun debugBake() {
    val mb = getMethodBind("BakedLightmap","debug_bake")
    _icall_Unit( mb, this.ptr)
  }

  open fun getBakeCellSize(): Double {
    val mb = getMethodBind("BakedLightmap","get_bake_cell_size")
    return _icall_Double( mb, this.ptr)
  }

  open fun getBakeDefaultTexelsPerUnit(): Double {
    val mb = getMethodBind("BakedLightmap","get_bake_default_texels_per_unit")
    return _icall_Double( mb, this.ptr)
  }

  open fun getBakeMode(): BakedLightmap.BakeMode {
    val mb = getMethodBind("BakedLightmap","get_bake_mode")
    return BakedLightmap.BakeMode.from( _icall_Long( mb, this.ptr))
  }

  open fun getBakeQuality(): BakedLightmap.BakeQuality {
    val mb = getMethodBind("BakedLightmap","get_bake_quality")
    return BakedLightmap.BakeQuality.from( _icall_Long( mb, this.ptr))
  }

  open fun getCaptureCellSize(): Double {
    val mb = getMethodBind("BakedLightmap","get_capture_cell_size")
    return _icall_Double( mb, this.ptr)
  }

  open fun getEnergy(): Double {
    val mb = getMethodBind("BakedLightmap","get_energy")
    return _icall_Double( mb, this.ptr)
  }

  open fun getExtents(): Vector3 {
    val mb = getMethodBind("BakedLightmap","get_extents")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun getImagePath(): String {
    val mb = getMethodBind("BakedLightmap","get_image_path")
    return _icall_String( mb, this.ptr)
  }

  open fun getLightData(): BakedLightmapData {
    val mb = getMethodBind("BakedLightmap","get_light_data")
    return _icall_BakedLightmapData( mb, this.ptr)
  }

  open fun getPropagation(): Double {
    val mb = getMethodBind("BakedLightmap","get_propagation")
    return _icall_Double( mb, this.ptr)
  }

  open fun isHdr(): Boolean {
    val mb = getMethodBind("BakedLightmap","is_hdr")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setBakeCellSize(bakeCellSize: Double) {
    val mb = getMethodBind("BakedLightmap","set_bake_cell_size")
    _icall_Unit_Double( mb, this.ptr, bakeCellSize)
  }

  open fun setBakeDefaultTexelsPerUnit(texels: Double) {
    val mb = getMethodBind("BakedLightmap","set_bake_default_texels_per_unit")
    _icall_Unit_Double( mb, this.ptr, texels)
  }

  open fun setBakeMode(bakeMode: Long) {
    val mb = getMethodBind("BakedLightmap","set_bake_mode")
    _icall_Unit_Long( mb, this.ptr, bakeMode)
  }

  open fun setBakeQuality(bakeQuality: Long) {
    val mb = getMethodBind("BakedLightmap","set_bake_quality")
    _icall_Unit_Long( mb, this.ptr, bakeQuality)
  }

  open fun setCaptureCellSize(captureCellSize: Double) {
    val mb = getMethodBind("BakedLightmap","set_capture_cell_size")
    _icall_Unit_Double( mb, this.ptr, captureCellSize)
  }

  open fun setEnergy(energy: Double) {
    val mb = getMethodBind("BakedLightmap","set_energy")
    _icall_Unit_Double( mb, this.ptr, energy)
  }

  open fun setExtents(extents: Vector3) {
    val mb = getMethodBind("BakedLightmap","set_extents")
    _icall_Unit_Vector3( mb, this.ptr, extents)
  }

  open fun setHdr(hdr: Boolean) {
    val mb = getMethodBind("BakedLightmap","set_hdr")
    _icall_Unit_Boolean( mb, this.ptr, hdr)
  }

  open fun setImagePath(imagePath: String) {
    val mb = getMethodBind("BakedLightmap","set_image_path")
    _icall_Unit_String( mb, this.ptr, imagePath)
  }

  open fun setLightData(data: BakedLightmapData) {
    val mb = getMethodBind("BakedLightmap","set_light_data")
    _icall_Unit_Object( mb, this.ptr, data)
  }

  open fun setPropagation(propagation: Double) {
    val mb = getMethodBind("BakedLightmap","set_propagation")
    _icall_Unit_Double( mb, this.ptr, propagation)
  }

  enum class BakeQuality(
    id: Long
  ) {
    BAKE_QUALITY_LOW(0),

    BAKE_QUALITY_MEDIUM(1),

    BAKE_QUALITY_HIGH(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class BakeError(
    id: Long
  ) {
    BAKE_ERROR_OK(0),

    BAKE_ERROR_NO_SAVE_PATH(1),

    BAKE_ERROR_NO_MESHES(2),

    BAKE_ERROR_CANT_CREATE_IMAGE(3),

    BAKE_ERROR_USER_ABORTED(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class BakeMode(
    id: Long
  ) {
    BAKE_MODE_CONE_TRACE(0),

    BAKE_MODE_RAY_TRACE(1);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object
}
