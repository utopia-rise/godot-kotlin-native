// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.RID
import godot.core.Signal0
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Node
import godot.icalls._icall_RID
import godot.icalls._icall_Resource_Boolean
import godot.icalls._icall_String
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_String
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.String

open class Resource internal constructor(
  _ignore: Any?
) : Reference(_ignore) {
  val changed: Signal0 by signal()

  open var resourceLocalToScene: Boolean
    get() {
      val mb = getMethodBind("Resource","is_local_to_scene")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Resource","set_local_to_scene")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var resourceName: String
    get() {
      val mb = getMethodBind("Resource","get_name")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Resource","set_name")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var resourcePath: String
    get() {
      val mb = getMethodBind("Resource","get_path")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("Resource","set_path")
      _icall_Unit_String(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("Resource", "Resource")
        }

  }

  open fun _setup_local_to_scene() {
  }

  open fun duplicate(subresources: Boolean = false): Resource {
    val mb = getMethodBind("Resource","duplicate")
    return _icall_Resource_Boolean( mb, this.ptr, subresources)
  }

  open fun getLocalScene(): Node {
    val mb = getMethodBind("Resource","get_local_scene")
    return _icall_Node( mb, this.ptr)
  }

  open fun getName(): String {
    val mb = getMethodBind("Resource","get_name")
    return _icall_String( mb, this.ptr)
  }

  open fun getPath(): String {
    val mb = getMethodBind("Resource","get_path")
    return _icall_String( mb, this.ptr)
  }

  open fun getRid(): RID {
    val mb = getMethodBind("Resource","get_rid")
    return _icall_RID( mb, this.ptr)
  }

  open fun isLocalToScene(): Boolean {
    val mb = getMethodBind("Resource","is_local_to_scene")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun setLocalToScene(enable: Boolean) {
    val mb = getMethodBind("Resource","set_local_to_scene")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setName(name: String) {
    val mb = getMethodBind("Resource","set_name")
    _icall_Unit_String( mb, this.ptr, name)
  }

  open fun setPath(path: String) {
    val mb = getMethodBind("Resource","set_path")
    _icall_Unit_String( mb, this.ptr, path)
  }

  open fun setupLocalToScene() {
    val mb = getMethodBind("Resource","setup_local_to_scene")
    _icall_Unit( mb, this.ptr)
  }

  open fun takeOverPath(path: String) {
    val mb = getMethodBind("Resource","take_over_path")
    _icall_Unit_String( mb, this.ptr, path)
  }
}
