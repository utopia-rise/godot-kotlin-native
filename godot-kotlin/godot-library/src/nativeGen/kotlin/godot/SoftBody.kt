// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.NodePath
import godot.core.VariantArray
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_Long
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_NodePath
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Long_Boolean
import godot.icalls._icall_Unit_NodePath
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_VariantArray
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlinx.cinterop.COpaquePointer

open class SoftBody : MeshInstance() {
  open var areaAngularStiffness: Double
    get() {
      val mb = getMethodBind("SoftBody","get_areaAngular_stiffness")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SoftBody","set_areaAngular_stiffness")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var collisionLayer: Long
    get() {
      val mb = getMethodBind("SoftBody","get_collision_layer")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SoftBody","set_collision_layer")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var collisionMask: Long
    get() {
      val mb = getMethodBind("SoftBody","get_collision_mask")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SoftBody","set_collision_mask")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var dampingCoefficient: Double
    get() {
      val mb = getMethodBind("SoftBody","get_damping_coefficient")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SoftBody","set_damping_coefficient")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var dragCoefficient: Double
    get() {
      val mb = getMethodBind("SoftBody","get_drag_coefficient")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SoftBody","set_drag_coefficient")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var linearStiffness: Double
    get() {
      val mb = getMethodBind("SoftBody","get_linear_stiffness")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SoftBody","set_linear_stiffness")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var parentCollisionIgnore: NodePath
    get() {
      val mb = getMethodBind("SoftBody","get_parent_collision_ignore")
      return _icall_NodePath(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SoftBody","set_parent_collision_ignore")
      _icall_Unit_NodePath(mb, this.ptr, value)
    }

  open var poseMatchingCoefficient: Double
    get() {
      val mb = getMethodBind("SoftBody","get_pose_matching_coefficient")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SoftBody","set_pose_matching_coefficient")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var pressureCoefficient: Double
    get() {
      val mb = getMethodBind("SoftBody","get_pressure_coefficient")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SoftBody","set_pressure_coefficient")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var rayPickable: Boolean
    get() {
      val mb = getMethodBind("SoftBody","is_ray_pickable")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SoftBody","set_ray_pickable")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var simulationPrecision: Long
    get() {
      val mb = getMethodBind("SoftBody","get_simulation_precision")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SoftBody","set_simulation_precision")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var totalMass: Double
    get() {
      val mb = getMethodBind("SoftBody","get_total_mass")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SoftBody","set_total_mass")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var volumeStiffness: Double
    get() {
      val mb = getMethodBind("SoftBody","get_volume_stiffness")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SoftBody","set_volume_stiffness")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("SoftBody", "SoftBody")

  open fun _drawSoftMesh() {
  }

  open fun addCollisionExceptionWith(body: Node) {
    val mb = getMethodBind("SoftBody","add_collision_exception_with")
    _icall_Unit_Object( mb, this.ptr, body)
  }

  open fun getAreaAngularStiffness(): Double {
    val mb = getMethodBind("SoftBody","get_areaAngular_stiffness")
    return _icall_Double( mb, this.ptr)
  }

  open fun getCollisionExceptions(): VariantArray {
    val mb = getMethodBind("SoftBody","get_collision_exceptions")
    return _icall_VariantArray( mb, this.ptr)
  }

  open fun getCollisionLayer(): Long {
    val mb = getMethodBind("SoftBody","get_collision_layer")
    return _icall_Long( mb, this.ptr)
  }

  open fun getCollisionLayerBit(bit: Long): Boolean {
    val mb = getMethodBind("SoftBody","get_collision_layer_bit")
    return _icall_Boolean_Long( mb, this.ptr, bit)
  }

  open fun getCollisionMask(): Long {
    val mb = getMethodBind("SoftBody","get_collision_mask")
    return _icall_Long( mb, this.ptr)
  }

  open fun getCollisionMaskBit(bit: Long): Boolean {
    val mb = getMethodBind("SoftBody","get_collision_mask_bit")
    return _icall_Boolean_Long( mb, this.ptr, bit)
  }

  open fun getDampingCoefficient(): Double {
    val mb = getMethodBind("SoftBody","get_damping_coefficient")
    return _icall_Double( mb, this.ptr)
  }

  open fun getDragCoefficient(): Double {
    val mb = getMethodBind("SoftBody","get_drag_coefficient")
    return _icall_Double( mb, this.ptr)
  }

  open fun getLinearStiffness(): Double {
    val mb = getMethodBind("SoftBody","get_linear_stiffness")
    return _icall_Double( mb, this.ptr)
  }

  open fun getParentCollisionIgnore(): NodePath {
    val mb = getMethodBind("SoftBody","get_parent_collision_ignore")
    return _icall_NodePath( mb, this.ptr)
  }

  open fun getPoseMatchingCoefficient(): Double {
    val mb = getMethodBind("SoftBody","get_pose_matching_coefficient")
    return _icall_Double( mb, this.ptr)
  }

  open fun getPressureCoefficient(): Double {
    val mb = getMethodBind("SoftBody","get_pressure_coefficient")
    return _icall_Double( mb, this.ptr)
  }

  open fun getSimulationPrecision(): Long {
    val mb = getMethodBind("SoftBody","get_simulation_precision")
    return _icall_Long( mb, this.ptr)
  }

  open fun getTotalMass(): Double {
    val mb = getMethodBind("SoftBody","get_total_mass")
    return _icall_Double( mb, this.ptr)
  }

  open fun getVolumeStiffness(): Double {
    val mb = getMethodBind("SoftBody","get_volume_stiffness")
    return _icall_Double( mb, this.ptr)
  }

  open fun isRayPickable(): Boolean {
    val mb = getMethodBind("SoftBody","is_ray_pickable")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun removeCollisionExceptionWith(body: Node) {
    val mb = getMethodBind("SoftBody","remove_collision_exception_with")
    _icall_Unit_Object( mb, this.ptr, body)
  }

  open fun setAreaAngularStiffness(areaAngularStiffness: Double) {
    val mb = getMethodBind("SoftBody","set_areaAngular_stiffness")
    _icall_Unit_Double( mb, this.ptr, areaAngularStiffness)
  }

  open fun setCollisionLayer(collisionLayer: Long) {
    val mb = getMethodBind("SoftBody","set_collision_layer")
    _icall_Unit_Long( mb, this.ptr, collisionLayer)
  }

  open fun setCollisionLayerBit(bit: Long, value: Boolean) {
    val mb = getMethodBind("SoftBody","set_collision_layer_bit")
    _icall_Unit_Long_Boolean( mb, this.ptr, bit, value)
  }

  open fun setCollisionMask(collisionMask: Long) {
    val mb = getMethodBind("SoftBody","set_collision_mask")
    _icall_Unit_Long( mb, this.ptr, collisionMask)
  }

  open fun setCollisionMaskBit(bit: Long, value: Boolean) {
    val mb = getMethodBind("SoftBody","set_collision_mask_bit")
    _icall_Unit_Long_Boolean( mb, this.ptr, bit, value)
  }

  open fun setDampingCoefficient(dampingCoefficient: Double) {
    val mb = getMethodBind("SoftBody","set_damping_coefficient")
    _icall_Unit_Double( mb, this.ptr, dampingCoefficient)
  }

  open fun setDragCoefficient(dragCoefficient: Double) {
    val mb = getMethodBind("SoftBody","set_drag_coefficient")
    _icall_Unit_Double( mb, this.ptr, dragCoefficient)
  }

  open fun setLinearStiffness(linearStiffness: Double) {
    val mb = getMethodBind("SoftBody","set_linear_stiffness")
    _icall_Unit_Double( mb, this.ptr, linearStiffness)
  }

  open fun setParentCollisionIgnore(parentCollisionIgnore: NodePath) {
    val mb = getMethodBind("SoftBody","set_parent_collision_ignore")
    _icall_Unit_NodePath( mb, this.ptr, parentCollisionIgnore)
  }

  open fun setPoseMatchingCoefficient(poseMatchingCoefficient: Double) {
    val mb = getMethodBind("SoftBody","set_pose_matching_coefficient")
    _icall_Unit_Double( mb, this.ptr, poseMatchingCoefficient)
  }

  open fun setPressureCoefficient(pressureCoefficient: Double) {
    val mb = getMethodBind("SoftBody","set_pressure_coefficient")
    _icall_Unit_Double( mb, this.ptr, pressureCoefficient)
  }

  open fun setRayPickable(rayPickable: Boolean) {
    val mb = getMethodBind("SoftBody","set_ray_pickable")
    _icall_Unit_Boolean( mb, this.ptr, rayPickable)
  }

  open fun setSimulationPrecision(simulationPrecision: Long) {
    val mb = getMethodBind("SoftBody","set_simulation_precision")
    _icall_Unit_Long( mb, this.ptr, simulationPrecision)
  }

  open fun setTotalMass(mass: Double) {
    val mb = getMethodBind("SoftBody","set_total_mass")
    _icall_Unit_Double( mb, this.ptr, mass)
  }

  open fun setVolumeStiffness(volumeStiffness: Double) {
    val mb = getMethodBind("SoftBody","set_volume_stiffness")
    _icall_Unit_Double( mb, this.ptr, volumeStiffness)
  }
}
