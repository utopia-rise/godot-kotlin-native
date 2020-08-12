// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.NodePath
import godot.icalls._icall_Boolean
import godot.icalls._icall_NodePath
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_NodePath
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Any
import kotlin.Boolean

open class RemoteTransform2D internal constructor(
  _ignore: Any?
) : Node2D(_ignore) {
  open var remotePath: NodePath
    get() {
      val mb = getMethodBind("RemoteTransform2D","get_remote_node")
      return _icall_NodePath(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RemoteTransform2D","set_remote_node")
      _icall_Unit_NodePath(mb, this.ptr, value)
    }

  open var updatePosition: Boolean
    get() {
      val mb = getMethodBind("RemoteTransform2D","get_update_position")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RemoteTransform2D","set_update_position")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var updateRotation: Boolean
    get() {
      val mb = getMethodBind("RemoteTransform2D","get_update_rotation")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RemoteTransform2D","set_update_rotation")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var updateScale: Boolean
    get() {
      val mb = getMethodBind("RemoteTransform2D","get_update_scale")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RemoteTransform2D","set_update_scale")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var useGlobalCoordinates: Boolean
    get() {
      val mb = getMethodBind("RemoteTransform2D","get_use_global_coordinates")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("RemoteTransform2D","set_use_global_coordinates")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = invokeConstructor("RemoteTransform2D", "RemoteTransform2D")
        }

  }

  open fun forceUpdateCache() {
    val mb = getMethodBind("RemoteTransform2D","force_update_cache")
    _icall_Unit( mb, this.ptr)
  }

  open fun getRemoteNode(): NodePath {
    val mb = getMethodBind("RemoteTransform2D","get_remote_node")
    return _icall_NodePath( mb, this.ptr)
  }

  open fun getUpdatePosition(): Boolean {
    val mb = getMethodBind("RemoteTransform2D","get_update_position")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getUpdateRotation(): Boolean {
    val mb = getMethodBind("RemoteTransform2D","get_update_rotation")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getUpdateScale(): Boolean {
    val mb = getMethodBind("RemoteTransform2D","get_update_scale")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun getUseGlobalCoordinates(): Boolean {
    val mb = getMethodBind("RemoteTransform2D","get_use_global_coordinates")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setRemoteNode(path: NodePath) {
    val mb = getMethodBind("RemoteTransform2D","set_remote_node")
    _icall_Unit_NodePath( mb, this.ptr, path)
  }

  open fun setUpdatePosition(updateRemotePosition: Boolean) {
    val mb = getMethodBind("RemoteTransform2D","set_update_position")
    _icall_Unit_Boolean( mb, this.ptr, updateRemotePosition)
  }

  open fun setUpdateRotation(updateRemoteRotation: Boolean) {
    val mb = getMethodBind("RemoteTransform2D","set_update_rotation")
    _icall_Unit_Boolean( mb, this.ptr, updateRemoteRotation)
  }

  open fun setUpdateScale(updateRemoteScale: Boolean) {
    val mb = getMethodBind("RemoteTransform2D","set_update_scale")
    _icall_Unit_Boolean( mb, this.ptr, updateRemoteScale)
  }

  open fun setUseGlobalCoordinates(useGlobalCoordinates: Boolean) {
    val mb = getMethodBind("RemoteTransform2D","set_use_global_coordinates")
    _icall_Unit_Boolean( mb, this.ptr, useGlobalCoordinates)
  }
}
