package godot

import godot.core.Color
import godot.core.Godot.shouldInitPtr
import godot.core.Plane
import godot.core.Vector2
import godot.core.Vector3
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Color
import godot.icalls._icall_Unit_Long_Long_Double_Boolean
import godot.icalls._icall_Unit_Long_nObject
import godot.icalls._icall_Unit_Plane
import godot.icalls._icall_Unit_Vector2
import godot.icalls._icall_Unit_Vector3
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long

open class ImmediateGeometry internal constructor(
  _ignore: Any?
) : GeometryInstance(_ignore) {
  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("ImmediateGeometry", "ImmediateGeometry")
        }

  }

  open fun addSphere(
    lats: Long,
    lons: Long,
    radius: Double,
    addUv: Boolean = true
  ) {
    val mb = getMethodBind("ImmediateGeometry","add_sphere")
    _icall_Unit_Long_Long_Double_Boolean( mb, this.ptr, lats, lons, radius, addUv)
  }

  open fun addVertex(position: Vector3) {
    val mb = getMethodBind("ImmediateGeometry","add_vertex")
    _icall_Unit_Vector3( mb, this.ptr, position)
  }

  open fun begin(primitive: Long, texture: Texture? = null) {
    val mb = getMethodBind("ImmediateGeometry","begin")
    _icall_Unit_Long_nObject( mb, this.ptr, primitive, texture)
  }

  open fun clear() {
    val mb = getMethodBind("ImmediateGeometry","clear")
    _icall_Unit( mb, this.ptr)
  }

  open fun end() {
    val mb = getMethodBind("ImmediateGeometry","end")
    _icall_Unit( mb, this.ptr)
  }

  open fun setColor(color: Color) {
    val mb = getMethodBind("ImmediateGeometry","set_color")
    _icall_Unit_Color( mb, this.ptr, color)
  }

  open fun setNormal(normal: Vector3) {
    val mb = getMethodBind("ImmediateGeometry","set_normal")
    _icall_Unit_Vector3( mb, this.ptr, normal)
  }

  open fun setTangent(tangent: Plane) {
    val mb = getMethodBind("ImmediateGeometry","set_tangent")
    _icall_Unit_Plane( mb, this.ptr, tangent)
  }

  open fun setUv(uv: Vector2) {
    val mb = getMethodBind("ImmediateGeometry","set_uv")
    _icall_Unit_Vector2( mb, this.ptr, uv)
  }

  open fun setUv2(uv: Vector2) {
    val mb = getMethodBind("ImmediateGeometry","set_uv2")
    _icall_Unit_Vector2( mb, this.ptr, uv)
  }
}
