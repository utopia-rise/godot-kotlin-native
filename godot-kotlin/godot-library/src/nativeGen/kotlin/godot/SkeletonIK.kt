package godot

import godot.core.Godot.shouldInitPtr
import godot.core.NodePath
import godot.core.Transform
import godot.core.Vector3
import godot.icalls._icall_Boolean
import godot.icalls._icall_Double
import godot.icalls._icall_Long
import godot.icalls._icall_NodePath
import godot.icalls._icall_Skeleton
import godot.icalls._icall_String
import godot.icalls._icall_Transform
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Double
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_NodePath
import godot.icalls._icall_Unit_String
import godot.icalls._icall_Unit_Transform
import godot.icalls._icall_Unit_Vector3
import godot.icalls._icall_Vector3
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Unit

open class SkeletonIK internal constructor(
  _ignore: Any?
) : Node(_ignore) {
  open var interpolation: Double
    get() {
      val mb = getMethodBind("SkeletonIK","get_interpolation")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SkeletonIK","set_interpolation")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var magnet: Vector3
    get() {
      val mb = getMethodBind("SkeletonIK","get_magnet_position")
      return _icall_Vector3(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SkeletonIK","set_magnet_position")
      _icall_Unit_Vector3(mb, this.ptr, value)
    }

  open var maxIterations: Long
    get() {
      val mb = getMethodBind("SkeletonIK","get_max_iterations")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SkeletonIK","set_max_iterations")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var minDistance: Double
    get() {
      val mb = getMethodBind("SkeletonIK","get_min_distance")
      return _icall_Double(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SkeletonIK","set_min_distance")
      _icall_Unit_Double(mb, this.ptr, value)
    }

  open var overrideTipBasis: Boolean
    get() {
      val mb = getMethodBind("SkeletonIK","is_override_tip_basis")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SkeletonIK","set_override_tip_basis")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var rootBone: String
    get() {
      val mb = getMethodBind("SkeletonIK","get_root_bone")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SkeletonIK","set_root_bone")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var target: Transform
    get() {
      val mb = getMethodBind("SkeletonIK","get_target_transform")
      return _icall_Transform(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SkeletonIK","set_target_transform")
      _icall_Unit_Transform(mb, this.ptr, value)
    }

  open var targetNode: NodePath
    get() {
      val mb = getMethodBind("SkeletonIK","get_target_node")
      return _icall_NodePath(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SkeletonIK","set_target_node")
      _icall_Unit_NodePath(mb, this.ptr, value)
    }

  open var tipBone: String
    get() {
      val mb = getMethodBind("SkeletonIK","get_tip_bone")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SkeletonIK","set_tip_bone")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var useMagnet: Boolean
    get() {
      val mb = getMethodBind("SkeletonIK","is_using_magnet")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("SkeletonIK","set_use_magnet")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("SkeletonIK", "SkeletonIK")
        }

  }

  open fun magnet(schedule: Vector3.() -> Unit): Vector3 = magnet.apply{
      schedule(this)
      magnet = this
  }


  open fun target(schedule: Transform.() -> Unit): Transform = target.apply{
      schedule(this)
      target = this
  }


  open fun getInterpolation(): Double {
    val mb = getMethodBind("SkeletonIK","get_interpolation")
    return _icall_Double( mb, this.ptr)
  }

  open fun getMagnetPosition(): Vector3 {
    val mb = getMethodBind("SkeletonIK","get_magnet_position")
    return _icall_Vector3( mb, this.ptr)
  }

  open fun getMaxIterations(): Long {
    val mb = getMethodBind("SkeletonIK","get_max_iterations")
    return _icall_Long( mb, this.ptr)
  }

  open fun getMinDistance(): Double {
    val mb = getMethodBind("SkeletonIK","get_min_distance")
    return _icall_Double( mb, this.ptr)
  }

  open fun getParentSkeleton(): Skeleton {
    val mb = getMethodBind("SkeletonIK","get_parent_skeleton")
    return _icall_Skeleton( mb, this.ptr)
  }

  open fun getRootBone(): String {
    val mb = getMethodBind("SkeletonIK","get_root_bone")
    return _icall_String( mb, this.ptr)
  }

  open fun getTargetNode(): NodePath {
    val mb = getMethodBind("SkeletonIK","get_target_node")
    return _icall_NodePath( mb, this.ptr)
  }

  open fun getTargetTransform(): Transform {
    val mb = getMethodBind("SkeletonIK","get_target_transform")
    return _icall_Transform( mb, this.ptr)
  }

  open fun getTipBone(): String {
    val mb = getMethodBind("SkeletonIK","get_tip_bone")
    return _icall_String( mb, this.ptr)
  }

  open fun isOverrideTipBasis(): Boolean {
    val mb = getMethodBind("SkeletonIK","is_override_tip_basis")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isRunning(): Boolean {
    val mb = getMethodBind("SkeletonIK","is_running")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isUsingMagnet(): Boolean {
    val mb = getMethodBind("SkeletonIK","is_using_magnet")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setInterpolation(interpolation: Double) {
    val mb = getMethodBind("SkeletonIK","set_interpolation")
    _icall_Unit_Double( mb, this.ptr, interpolation)
  }

  open fun setMagnetPosition(localPosition: Vector3) {
    val mb = getMethodBind("SkeletonIK","set_magnet_position")
    _icall_Unit_Vector3( mb, this.ptr, localPosition)
  }

  open fun setMaxIterations(iterations: Long) {
    val mb = getMethodBind("SkeletonIK","set_max_iterations")
    _icall_Unit_Long( mb, this.ptr, iterations)
  }

  open fun setMinDistance(minDistance: Double) {
    val mb = getMethodBind("SkeletonIK","set_min_distance")
    _icall_Unit_Double( mb, this.ptr, minDistance)
  }

  open fun setOverrideTipBasis(override: Boolean) {
    val mb = getMethodBind("SkeletonIK","set_override_tip_basis")
    _icall_Unit_Boolean( mb, this.ptr, override)
  }

  open fun setRootBone(rootBone: String) {
    val mb = getMethodBind("SkeletonIK","set_root_bone")
    _icall_Unit_String( mb, this.ptr, rootBone)
  }

  open fun setTargetNode(node: NodePath) {
    val mb = getMethodBind("SkeletonIK","set_target_node")
    _icall_Unit_NodePath( mb, this.ptr, node)
  }

  open fun setTargetTransform(target: Transform) {
    val mb = getMethodBind("SkeletonIK","set_target_transform")
    _icall_Unit_Transform( mb, this.ptr, target)
  }

  open fun setTipBone(tipBone: String) {
    val mb = getMethodBind("SkeletonIK","set_tip_bone")
    _icall_Unit_String( mb, this.ptr, tipBone)
  }

  open fun setUseMagnet(use: Boolean) {
    val mb = getMethodBind("SkeletonIK","set_use_magnet")
    _icall_Unit_Boolean( mb, this.ptr, use)
  }

  open fun start(oneTime: Boolean = false) {
    val mb = getMethodBind("SkeletonIK","start")
    _icall_Unit_Boolean( mb, this.ptr, oneTime)
  }

  open fun stop() {
    val mb = getMethodBind("SkeletonIK","stop")
    _icall_Unit( mb, this.ptr)
  }
}
