package godot.icalls

import godot.ARVRInterface
import godot.ARVRPositionalTracker
import godot.Animation
import godot.AnimationNode
import godot.AnimationNodeStateMachineTransition
import godot.AnimationRootNode
import godot.ArrayMesh
import godot.AudioBusLayout
import godot.AudioEffect
import godot.AudioEffectInstance
import godot.AudioStream
import godot.AudioStreamPlayback
import godot.AudioStreamSample
import godot.BakedLightmapData
import godot.BaseButton
import godot.BitMap
import godot.BitmapFont
import godot.Bone2D
import godot.Button
import godot.ButtonGroup
import godot.Camera
import godot.CameraFeed
import godot.CanvasItem
import godot.ColorPicker
import godot.ConfigFile
import godot.Control
import godot.CryptoKey
import godot.CubeMap
import godot.Curve
import godot.Curve2D
import godot.Curve3D
import godot.CurveTexture
import godot.DynamicFontData
import godot.EditorFileSystem
import godot.EditorFileSystemDirectory
import godot.EditorInspector
import godot.EditorInterface
import godot.EditorResourcePreview
import godot.EditorSelection
import godot.EditorSettings
import godot.EditorSpatialGizmoPlugin
import godot.Environment
import godot.FileSystemDock
import godot.Font
import godot.GDNativeLibrary
import godot.GIProbeData
import godot.Gradient
import godot.GradientTexture
import godot.HBoxContainer
import godot.HScrollBar
import godot.Image
import godot.InputEvent
import godot.JSONParseResult
import godot.JavaClass
import godot.KinematicCollision
import godot.KinematicCollision2D
import godot.Label
import godot.LineEdit
import godot.MainLoop
import godot.Material
import godot.Mesh
import godot.MeshLibrary
import godot.MultiMesh
import godot.MultiplayerAPI
import godot.NavigationMesh
import godot.NavigationPolygon
import godot.NetworkedMultiplayerPeer
import godot.Node
import godot.Object
import godot.OccluderPolygon2D
import godot.OpenSimplexNoise
import godot.PackedScene
import godot.PacketPeerDTLS
import godot.PacketPeerUDP
import godot.Physics2DDirectBodyState
import godot.Physics2DDirectSpaceState
import godot.PhysicsDirectBodyState
import godot.PhysicsDirectSpaceState
import godot.PhysicsMaterial
import godot.Popup
import godot.PopupMenu
import godot.PopupPanel
import godot.Reference
import godot.RegExMatch
import godot.Resource
import godot.ResourceInteractiveLoader
import godot.SceneState
import godot.SceneTree
import godot.SceneTreeTimer
import godot.Script
import godot.ScriptCreateDialog
import godot.ScriptEditor
import godot.Shader
import godot.ShaderMaterial
import godot.Shape
import godot.Shape2D
import godot.ShortCut
import godot.Skeleton
import godot.Skin
import godot.SkinReference
import godot.Sky
import godot.Spatial
import godot.SpatialGizmo
import godot.SpatialMaterial
import godot.SpriteFrames
import godot.StreamPeer
import godot.StreamPeerBuffer
import godot.StreamPeerTCP
import godot.StyleBox
import godot.Texture
import godot.TextureButton
import godot.Theme
import godot.TileSet
import godot.ToolButton
import godot.TreeItem
import godot.TriangleMesh
import godot.UPNPDevice
import godot.UndoRedo
import godot.VBoxContainer
import godot.VScrollBar
import godot.VideoStream
import godot.Viewport
import godot.ViewportTexture
import godot.VisualScript
import godot.VisualScriptNode
import godot.VisualShaderNode
import godot.WebRTCDataChannel
import godot.WebSocketPeer
import godot.World
import godot.World2D
import godot.X509Certificate
import godot.core.AABB
import godot.core.Basis
import godot.core.Color
import godot.core.Dictionary
import godot.core.GdString
import godot.core.Godot
import godot.core.NodePath
import godot.core.Plane
import godot.core.PoolByteArray
import godot.core.PoolColorArray
import godot.core.PoolIntArray
import godot.core.PoolRealArray
import godot.core.PoolStringArray
import godot.core.PoolVector2Array
import godot.core.PoolVector3Array
import godot.core.Quat
import godot.core.RID
import godot.core.Rect2
import godot.core.Transform
import godot.core.Transform2D
import godot.core.TypeManager
import godot.core.TypeManager.wrap
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import godot.core.Vector3
import godot.core.toGDString
import godot.gdnative.godot_aabb
import godot.gdnative.godot_array
import godot.gdnative.godot_basis
import godot.gdnative.godot_color
import godot.gdnative.godot_dictionary
import godot.gdnative.godot_method_bind
import godot.gdnative.godot_node_path
import godot.gdnative.godot_plane
import godot.gdnative.godot_pool_byte_array
import godot.gdnative.godot_pool_color_array
import godot.gdnative.godot_pool_int_array
import godot.gdnative.godot_pool_real_array
import godot.gdnative.godot_pool_string_array
import godot.gdnative.godot_pool_vector2_array
import godot.gdnative.godot_pool_vector3_array
import godot.gdnative.godot_rect2
import godot.gdnative.godot_rid
import godot.gdnative.godot_string
import godot.gdnative.godot_transform
import godot.gdnative.godot_transform2d
import godot.gdnative.godot_variant
import godot.gdnative.godot_vector2
import godot.gdnative.godot_vector3
import godot.internal.type.getRawMemory
import kotlin.Array
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.CPointerVar
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.LongVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.allocArray
import kotlinx.cinterop.get
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.set
import kotlinx.cinterop.value

internal fun _icall_varargs(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arguments: Array<*>
): Variant = memScoped {
    val args = allocArray<CPointerVar<godot_variant>>(arguments.size)
    for ((i,arg) in arguments.withIndex()) args[i] = Variant.wrap(arg)._handle.ptr
    val result = Godot.gdnative.godot_method_bind_call!!.invoke(mb, inst, args, arguments.size,
    null)
    for (i in arguments.indices) Godot.gdnative.godot_variant_destroy!!.invoke(args[i])
    Variant(result)
}


internal fun _icall_Unit_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer): String {
  val ret = memScoped {
      val retVar = alloc<godot_string>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(retVar).toKString()
  }
  return ret
}

internal fun _icall_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Mesh(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Mesh {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Mesh
  }
  return ret
}

internal fun _icall_Plane(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Plane {
  val ret = memScoped {
      val retVar = alloc<godot_plane>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Plane(retVar)
  }
  return ret
}

internal fun _icall_Vector3(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Vector3 {
  val ret = memScoped {
      val retVar = alloc<godot_vector3>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Vector3(retVar)
  }
  return ret
}

internal fun _icall_Unit_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Double
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Double {
  var ret: Double = 0.0
  memScoped {
      val retVar = alloc<DoubleVar>()
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Double_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): Double {
  var ret: Double = 0.0
  memScoped {
      val retVar = alloc<DoubleVar>()
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Unit_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Vector2(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Vector2 {
  val ret = memScoped {
      val retVar = alloc<godot_vector2>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Vector2(retVar)
  }
  return ret
}

internal fun _icall_Unit(mb: CPointer<godot_method_bind>, inst: COpaquePointer) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Basis(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Basis {
  val ret = memScoped {
      val retVar = alloc<godot_basis>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Basis(retVar)
  }
  return ret
}

internal fun _icall_Transform_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Boolean
): Transform {
  val ret = memScoped {
      val retVar = alloc<godot_transform>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Transform(retVar)
  }
  return ret
}

internal fun _icall_Unit_Object(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.ptr
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_ARVRInterface(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    ARVRInterface {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as ARVRInterface
  }
  return ret
}

internal fun _icall_Unit_Long_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_ARVRInterface_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String
): ARVRInterface {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.toGDString().value.ptr
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      wrap(retVar.pointed.value!!) as ARVRInterface
  }
  return ret
}

internal fun _icall_Transform(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Transform {
  val ret = memScoped {
      val retVar = alloc<godot_transform>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Transform(retVar)
  }
  return ret
}

internal fun _icall_ARVRInterface_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): ARVRInterface {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as ARVRInterface
  }
  return ret
}

internal fun _icall_VariantArray(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    VariantArray {
  val ret = memScoped {
      val retVar = alloc<godot_array>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      VariantArray(retVar)
  }
  return ret
}

internal fun _icall_ARVRPositionalTracker_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): ARVRPositionalTracker {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as ARVRPositionalTracker
  }
  return ret
}

internal fun _icall_Unit_Long_Vector3_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Vector3,
  arg2: Double
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Boolean_Long_Long_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long,
  arg2: Boolean
): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Unit_Long_Long_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long,
  arg2: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Long_Vector3_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector3,
  arg1: Boolean
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Vector3_Vector3(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector3
): Vector3 {
  val ret = memScoped {
      val retVar = alloc<godot_vector3>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Vector3(retVar)
  }
  return ret
}

internal fun _icall_PoolIntArray_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long
): PoolIntArray {
  val ret = memScoped {
      val retVar = alloc<godot_pool_int_array>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      PoolIntArray(retVar)
  }
  return ret
}

internal fun _icall_PoolIntArray_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): PoolIntArray {
  val ret = memScoped {
      val retVar = alloc<godot_pool_int_array>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      PoolIntArray(retVar)
  }
  return ret
}

internal fun _icall_PoolVector3Array_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long
): PoolVector3Array {
  val ret = memScoped {
      val retVar = alloc<godot_pool_vector3_array>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      PoolVector3Array(retVar)
  }
  return ret
}

internal fun _icall_Vector3_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): Vector3 {
  val ret = memScoped {
      val retVar = alloc<godot_vector3>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Vector3(retVar)
  }
  return ret
}

internal fun _icall_Boolean_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Unit_Long_Vector3(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Vector3
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Long_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Double
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Long_Vector2_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Vector2,
  arg2: Double
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Boolean_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long
): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Unit_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Long_Vector2_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2,
  arg1: Boolean
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Vector2_Vector2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2
): Vector2 {
  val ret = memScoped {
      val retVar = alloc<godot_vector2>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Vector2(retVar)
  }
  return ret
}

internal fun _icall_PoolVector2Array_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long
): PoolVector2Array {
  val ret = memScoped {
      val retVar = alloc<godot_pool_vector2_array>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      PoolVector2Array(retVar)
  }
  return ret
}

internal fun _icall_Vector2_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): Vector2 {
  val ret = memScoped {
      val retVar = alloc<godot_vector2>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Vector2(retVar)
  }
  return ret
}

internal fun _icall_Unit_Long_Vector2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Vector2
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.toGDString().value.ptr
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
  }
}

internal fun _icall_Button_String_Boolean_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Boolean,
  arg2: String
): Button {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.toGDString().value.ptr
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      GdString(args[2]!!).destroy(this)
      wrap(retVar.pointed.value!!) as Button
  }
  return ret
}

internal fun _icall_Button_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String
): Button {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.toGDString().value.ptr
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      wrap(retVar.pointed.value!!) as Button
  }
  return ret
}

internal fun _icall_Label(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Label {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Label
  }
  return ret
}

internal fun _icall_Button(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Button {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Button
  }
  return ret
}

internal fun _icall_SpriteFrames(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    SpriteFrames {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as SpriteFrames
  }
  return ret
}

internal fun _icall_Unit_Vector2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_String_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
  }
}

internal fun _icall_Unit_Long_Object(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Object
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.ptr
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Texture_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): Texture {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Texture
  }
  return ret
}

internal fun _icall_Long_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_String_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long
): String {
  val ret = memScoped {
      val retVar = alloc<godot_string>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(retVar).toKString()
  }
  return ret
}

internal fun _icall_Long_Long_Double_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Double,
  arg2: String
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.toGDString().value.ptr
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[2]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Unit_Long_Long_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long,
  arg2: String
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.toGDString().value.ptr
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[2]!!).destroy(this)
  }
}

internal fun _icall_Double_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long
): Double {
  var ret: Double = 0.0
  memScoped {
      val retVar = alloc<DoubleVar>()
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Resource_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long
): Resource {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Resource
  }
  return ret
}

internal fun _icall_Long_Long_Double_Object_Double_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Double,
  arg2: Object,
  arg3: Double,
  arg4: Double
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(6)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.ptr
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Unit_Long_Long_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long,
  arg2: Double
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Long_Long_Object(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long,
  arg2: Object
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.ptr
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Vector2_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long
): Vector2 {
  val ret = memScoped {
      val retVar = alloc<godot_vector2>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Vector2(retVar)
  }
  return ret
}

internal fun _icall_Long_Long_Double_Double_Vector2_Vector2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Double,
  arg2: Double,
  arg3: Vector2,
  arg4: Vector2
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(6)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Double_Long_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Double
): Double {
  var ret: Double = 0.0
  memScoped {
      val retVar = alloc<DoubleVar>()
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Unit_Long_Long_Vector2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long,
  arg2: Vector2
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Long_NodePath(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: NodePath
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_PoolIntArray_Long_Double_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Double,
  arg2: Double
): PoolIntArray {
  val ret = memScoped {
      val retVar = alloc<godot_pool_int_array>().ptr
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      PoolIntArray(retVar)
  }
  return ret
}

internal fun _icall_VariantArray_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long
): VariantArray {
  val ret = memScoped {
      val retVar = alloc<godot_array>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      VariantArray(retVar)
  }
  return ret
}

internal fun _icall_Long_Long_Double_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Double,
  arg2: Boolean
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Variant_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long
): Variant {
  val ret = memScoped {
      val retVar = alloc<godot.gdnative.godot_variant>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Variant(retVar)
  }
  return ret
}

internal fun _icall_NodePath_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): NodePath {
  val ret = memScoped {
      val retVar = alloc<godot_node_path>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      NodePath(retVar)
  }
  return ret
}

internal fun _icall_Unit_Long_Double_Variant_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Double,
  arg2: Variant,
  arg3: Double
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2._handle.ptr
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Long_Long_Variant(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long,
  arg2: Variant
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2._handle.ptr
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Long_NodePath(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: NodePath
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Long_Long_Double_Vector3_Quat_Vector3(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Double,
  arg2: Vector3,
  arg3: Quat,
  arg4: Vector3
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(6)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_VariantArray_Long_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Double
): VariantArray {
  val ret = memScoped {
      val retVar = alloc<godot_array>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      VariantArray(retVar)
  }
  return ret
}

internal fun _icall_Unit_String_Double_Double_Boolean_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Double,
  arg2: Double,
  arg3: Boolean,
  arg4: Double
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(6)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
  }
}

internal fun _icall_Double_Long_Double_Boolean_Double_Long_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Double,
  arg2: Boolean,
  arg3: Double,
  arg4: Long,
  arg5: Boolean
): Double {
  var ret: Double = 0.0
  memScoped {
      val retVar = alloc<DoubleVar>()
      val args = allocArray<COpaquePointerVar>(7)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = arg5.getRawMemory(this)
      args[6] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Double_String_Object_Double_Boolean_Double_Long_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Object,
  arg2: Double,
  arg3: Boolean,
  arg4: Double,
  arg5: Long,
  arg6: Boolean
): Double {
  var ret: Double = 0.0
  memScoped {
      val retVar = alloc<DoubleVar>()
      val args = allocArray<COpaquePointerVar>(8)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = arg5.getRawMemory(this)
      args[6] = arg6.getRawMemory(this)
      args[7] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[0]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_String_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): String {
  val ret = memScoped {
      val retVar = alloc<godot_string>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(retVar).toKString()
  }
  return ret
}

internal fun _icall_Variant_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String
): Variant {
  val ret = memScoped {
      val retVar = alloc<godot.gdnative.godot_variant>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.toGDString().value.ptr
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      Variant(retVar)
  }
  return ret
}

internal fun _icall_Boolean_NodePath(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: NodePath
): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Unit_NodePath_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: NodePath,
  arg1: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_String_Variant(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Variant
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1._handle.ptr
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
  }
}

internal fun _icall_AnimationRootNode_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): AnimationRootNode {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as AnimationRootNode
  }
  return ret
}

internal fun _icall_Unit_Object_Double_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: Double,
  arg2: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Object_Vector2_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: Vector2,
  arg2: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Long_Long_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long,
  arg2: Long,
  arg3: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_String_Object_Vector2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Object,
  arg2: Vector2
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
  }
}

internal fun _icall_Unit_String_Long_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Long,
  arg2: String
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.toGDString().value.ptr
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
      GdString(args[2]!!).destroy(this)
  }
}

internal fun _icall_Unit_String_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
  }
}

internal fun _icall_AnimationNode_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String
): AnimationNode {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.toGDString().value.ptr
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      wrap(retVar.pointed.value!!) as AnimationNode
  }
  return ret
}

internal fun _icall_Vector2_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String
): Vector2 {
  val ret = memScoped {
      val retVar = alloc<godot_vector2>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.toGDString().value.ptr
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      Vector2(retVar)
  }
  return ret
}

internal fun _icall_Boolean_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String
): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.toGDString().value.ptr
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[0]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Unit_String_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: String
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.toGDString().value.ptr
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
      GdString(args[1]!!).destroy(this)
  }
}

internal fun _icall_Unit_String_Vector2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Vector2
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
  }
}

internal fun _icall_Unit_String_String_Object(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: String,
  arg2: Object
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.toGDString().value.ptr
      args[2] = arg2.ptr
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
      GdString(args[1]!!).destroy(this)
  }
}

internal fun _icall_String_Object(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object
): String {
  val ret = memScoped {
      val retVar = alloc<godot_string>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.ptr
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(retVar).toKString()
  }
  return ret
}

internal fun _icall_AnimationNodeStateMachineTransition_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): AnimationNodeStateMachineTransition {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as AnimationNodeStateMachineTransition
  }
  return ret
}

internal fun _icall_Boolean_String_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: String
): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.toGDString().value.ptr
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[0]!!).destroy(this)
      GdString(args[1]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Unit_String_Object(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Object
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.ptr
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
  }
}

internal fun _icall_PoolStringArray(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    PoolStringArray {
  val ret = memScoped {
      val retVar = alloc<godot_pool_string_array>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      PoolStringArray(retVar)
  }
  return ret
}

internal fun _icall_Unit_Long_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: String
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.toGDString().value.ptr
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[1]!!).destroy(this)
  }
}

internal fun _icall_Unit_NodePath(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: NodePath
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_NodePath(mb: CPointer<godot_method_bind>, inst: COpaquePointer): NodePath {
  val ret = memScoped {
      val retVar = alloc<godot_node_path>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      NodePath(retVar)
  }
  return ret
}

internal fun _icall_Long_String_Object(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Object
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.ptr
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[0]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_String_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String
): String {
  val ret = memScoped {
      val retVar = alloc<godot_string>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.toGDString().value.ptr
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      GdString(retVar).toKString()
  }
  return ret
}

internal fun _icall_Animation_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String
): Animation {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.toGDString().value.ptr
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      wrap(retVar.pointed.value!!) as Animation
  }
  return ret
}

internal fun _icall_Double_String_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: String
): Double {
  var ret: Double = 0.0
  memScoped {
      val retVar = alloc<DoubleVar>()
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.toGDString().value.ptr
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[0]!!).destroy(this)
      GdString(args[1]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Unit_String_Double_Double_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Double,
  arg2: Double,
  arg3: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
  }
}

internal fun _icall_Unit_String_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Double
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
  }
}

internal fun _icall_Unit_Double_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Double,
  arg1: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_String_String_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: String,
  arg2: Double
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.toGDString().value.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
      GdString(args[1]!!).destroy(this)
  }
}

internal fun _icall_AnimationNode(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    AnimationNode {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as AnimationNode
  }
  return ret
}

internal fun _icall_Double_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String
): Double {
  var ret: Double = 0.0
  memScoped {
      val retVar = alloc<DoubleVar>()
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.toGDString().value.ptr
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[0]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Unit_String_NodePath_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: NodePath,
  arg2: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
  }
}

internal fun _icall_Boolean_String_String_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: String,
  arg2: Long
): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.toGDString().value.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[0]!!).destroy(this)
      GdString(args[1]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Long_String_String_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: String,
  arg2: Long
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.toGDString().value.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[0]!!).destroy(this)
      GdString(args[1]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Long_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.toGDString().value.ptr
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[0]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_String_String_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Long
): String {
  val ret = memScoped {
      val retVar = alloc<godot_string>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      GdString(retVar).toKString()
  }
  return ret
}

internal fun _icall_Long_String_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: String
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.toGDString().value.ptr
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[0]!!).destroy(this)
      GdString(args[1]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Boolean_String_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Long
): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[0]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Unit_String_Long_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Long,
  arg2: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
  }
}

internal fun _icall_Unit_Vector3(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector3
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Boolean_Object(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object
): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.ptr
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Unit_AABB(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: AABB
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_AABB(mb: CPointer<godot_method_bind>, inst: COpaquePointer): AABB {
  val ret = memScoped {
      val retVar = alloc<godot_aabb>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      AABB(retVar)
  }
  return ret
}

internal fun _icall_Unit_Long_VariantArray_VariantArray_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: VariantArray,
  arg2: VariantArray,
  arg3: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1._handle.ptr
      args[2] = arg2._handle.ptr
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Long_Transform_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Transform,
  arg1: Double
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Unit_Long_Long_PoolByteArray(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long,
  arg2: PoolByteArray
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Texture(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Texture {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Texture
  }
  return ret
}

internal fun _icall_Unit_Rect2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Rect2
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Rect2(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Rect2 {
  val ret = memScoped {
      val retVar = alloc<godot_rect2>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Rect2(retVar)
  }
  return ret
}

internal fun _icall_AudioStreamSample(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    AudioStreamSample {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as AudioStreamSample
  }
  return ret
}

internal fun _icall_Vector2_Double_Double_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Double,
  arg1: Double,
  arg2: Long
): Vector2 {
  val ret = memScoped {
      val retVar = alloc<godot_vector2>().ptr
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Vector2(retVar)
  }
  return ret
}

internal fun _icall_Unit_Long_Object_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Object,
  arg2: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_AudioBusLayout(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    AudioBusLayout {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as AudioBusLayout
  }
  return ret
}

internal fun _icall_AudioEffect_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long
): AudioEffect {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as AudioEffect
  }
  return ret
}

internal fun _icall_AudioEffectInstance_Long_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long,
  arg2: Long
): AudioEffectInstance {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as AudioEffectInstance
  }
  return ret
}

internal fun _icall_Unit_Long_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long,
  arg2: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Boolean_PoolVector2Array(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: PoolVector2Array
): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Boolean_Vector2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2
): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Unit_PoolByteArray(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: PoolByteArray
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_PoolByteArray(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    PoolByteArray {
  val ret = memScoped {
      val retVar = alloc<godot_pool_byte_array>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      PoolByteArray(retVar)
  }
  return ret
}

internal fun _icall_AudioStream(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    AudioStream {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as AudioStream
  }
  return ret
}

internal fun _icall_AudioStreamPlayback(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    AudioStreamPlayback {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as AudioStreamPlayback
  }
  return ret
}

internal fun _icall_BakedLightmapData(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    BakedLightmapData {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as BakedLightmapData
  }
  return ret
}

internal fun _icall_Long_nObject_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object?,
  arg1: Boolean
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0?.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Unit_Transform(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Transform
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_NodePath_Object_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: NodePath,
  arg1: Object,
  arg2: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_ButtonGroup(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    ButtonGroup {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as ButtonGroup
  }
  return ret
}

internal fun _icall_ShortCut(mb: CPointer<godot_method_bind>, inst: COpaquePointer): ShortCut {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as ShortCut
  }
  return ret
}

internal fun _icall_Unit_Object_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: Double
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Long_Rect2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Rect2
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_VariantArray_Rect2_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Rect2,
  arg1: Double
): VariantArray {
  val ret = memScoped {
      val retVar = alloc<godot_array>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      VariantArray(retVar)
  }
  return ret
}

internal fun _icall_Unit_Vector2_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2,
  arg1: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Rect2_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Rect2,
  arg1: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_BitmapFont(mb: CPointer<godot_method_bind>, inst: COpaquePointer): BitmapFont {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as BitmapFont
  }
  return ret
}

internal fun _icall_Unit_Long_Long_Rect2_Vector2_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long,
  arg2: Rect2,
  arg3: Vector2,
  arg4: Double
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(6)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Transform2D(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Transform2D
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Transform2D(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    Transform2D {
  val ret = memScoped {
      val retVar = alloc<godot_transform2d>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Transform2D(retVar)
  }
  return ret
}

internal fun _icall_BaseButton(mb: CPointer<godot_method_bind>, inst: COpaquePointer): BaseButton {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as BaseButton
  }
  return ret
}

internal fun _icall_Curve_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): Curve {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Curve
  }
  return ret
}

internal fun _icall_Unit_Color(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Color
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Color(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Color {
  val ret = memScoped {
      val retVar = alloc<godot_color>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Color(retVar)
  }
  return ret
}

internal fun _icall_Gradient(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Gradient {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Gradient
  }
  return ret
}

internal fun _icall_Unit_PoolColorArray(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: PoolColorArray
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_PoolColorArray(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    PoolColorArray {
  val ret = memScoped {
      val retVar = alloc<godot_pool_color_array>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      PoolColorArray(retVar)
  }
  return ret
}

internal fun _icall_Unit_PoolVector3Array(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: PoolVector3Array
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_PoolVector3Array(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    PoolVector3Array {
  val ret = memScoped {
      val retVar = alloc<godot_pool_vector3_array>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      PoolVector3Array(retVar)
  }
  return ret
}

internal fun _icall_Unit_PoolVector2Array(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: PoolVector2Array
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_PoolVector2Array(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    PoolVector2Array {
  val ret = memScoped {
      val retVar = alloc<godot_pool_vector2_array>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      PoolVector2Array(retVar)
  }
  return ret
}

internal fun _icall_Material(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Material {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Material
  }
  return ret
}

internal fun _icall_Environment(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    Environment {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Environment
  }
  return ret
}

internal fun _icall_RID(mb: CPointer<godot_method_bind>, inst: COpaquePointer): RID {
  val ret = memScoped {
      val retVar = alloc<godot_rid>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      RID(retVar)
  }
  return ret
}

internal fun _icall_Boolean_Vector3(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector3
): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Vector3_Vector2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2
): Vector3 {
  val ret = memScoped {
      val retVar = alloc<godot_vector3>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Vector3(retVar)
  }
  return ret
}

internal fun _icall_Vector3_Vector2_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2,
  arg1: Double
): Vector3 {
  val ret = memScoped {
      val retVar = alloc<godot_vector3>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Vector3(retVar)
  }
  return ret
}

internal fun _icall_Unit_Double_Vector2_Double_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Double,
  arg1: Vector2,
  arg2: Double,
  arg3: Double
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Double_Double_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Double,
  arg1: Double,
  arg2: Double
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Vector2_Vector3(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector3
): Vector2 {
  val ret = memScoped {
      val retVar = alloc<godot_vector2>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Vector2(retVar)
  }
  return ret
}

internal fun _icall_Node(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Node {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Node
  }
  return ret
}

internal fun _icall_CameraFeed_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): CameraFeed {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as CameraFeed
  }
  return ret
}

internal fun _icall_Unit_Vector2_Double_Double_Double_Long_Color_Double_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2,
  arg1: Double,
  arg2: Double,
  arg3: Double,
  arg4: Long,
  arg5: Color,
  arg6: Double,
  arg7: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(9)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = arg5.getRawMemory(this)
      args[6] = arg6.getRawMemory(this)
      args[7] = arg7.getRawMemory(this)
      args[8] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Double_Object_Vector2_String_String_Color(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: Vector2,
  arg2: String,
  arg3: String,
  arg4: Color
): Double {
  var ret: Double = 0.0
  memScoped {
      val retVar = alloc<DoubleVar>()
      val args = allocArray<COpaquePointerVar>(6)
      args[0] = arg0.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.toGDString().value.ptr
      args[3] = arg3.toGDString().value.ptr
      args[4] = arg4.getRawMemory(this)
      args[5] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[2]!!).destroy(this)
      GdString(args[3]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Unit_Vector2_Double_Color(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2,
  arg1: Double,
  arg2: Color
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_PoolVector2Array_Color_PoolVector2Array_nObject_nObject_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: PoolVector2Array,
  arg1: Color,
  arg2: PoolVector2Array,
  arg3: Object?,
  arg4: Object?,
  arg5: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(7)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3?.ptr
      args[4] = arg4?.ptr
      args[5] = arg5.getRawMemory(this)
      args[6] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Vector2_Vector2_Color_Double_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2,
  arg1: Vector2,
  arg2: Color,
  arg3: Double,
  arg4: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(6)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Object_Object_nObject_Transform2D_Color(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: Object,
  arg2: Object?,
  arg3: Transform2D,
  arg4: Color
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(6)
      args[0] = arg0.ptr
      args[1] = arg1.ptr
      args[2] = arg2?.ptr
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_PoolVector2Array_Color_Double_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: PoolVector2Array,
  arg1: Color,
  arg2: Double,
  arg3: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_PoolVector2Array_PoolColorArray_Double_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: PoolVector2Array,
  arg1: PoolColorArray,
  arg2: Double,
  arg3: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Object_Object_nObject(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: Object,
  arg2: Object?
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.ptr
      args[1] = arg1.ptr
      args[2] = arg2?.ptr
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_PoolVector2Array_PoolColorArray_PoolVector2Array_nObject_nObject_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: PoolVector2Array,
  arg1: PoolColorArray,
  arg2: PoolVector2Array,
  arg3: Object?,
  arg4: Object?,
  arg5: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(7)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3?.ptr
      args[4] = arg4?.ptr
      args[5] = arg5.getRawMemory(this)
      args[6] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_PoolVector2Array_PoolColorArray_PoolVector2Array_nObject_Double_nObject(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: PoolVector2Array,
  arg1: PoolColorArray,
  arg2: PoolVector2Array,
  arg3: Object?,
  arg4: Double,
  arg5: Object?
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(7)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3?.ptr
      args[4] = arg4.getRawMemory(this)
      args[5] = arg5?.ptr
      args[6] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Rect2_Color_Boolean_Double_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Rect2,
  arg1: Color,
  arg2: Boolean,
  arg3: Double,
  arg4: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(6)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Vector2_Double_Vector2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2,
  arg1: Double,
  arg2: Vector2
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Object_Vector2_String_Color_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: Vector2,
  arg2: String,
  arg3: Color,
  arg4: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(6)
      args[0] = arg0.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.toGDString().value.ptr
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[2]!!).destroy(this)
  }
}

internal fun _icall_Unit_Object_Rect2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: Rect2
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Object_Vector2_Color_nObject(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: Vector2,
  arg2: Color,
  arg3: Object?
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3?.ptr
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Object_Rect2_Boolean_Color_Boolean_nObject(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: Rect2,
  arg2: Boolean,
  arg3: Color,
  arg4: Boolean,
  arg5: Object?
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(7)
      args[0] = arg0.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = arg5?.ptr
      args[6] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Object_Rect2_Rect2_Color_Boolean_nObject_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: Rect2,
  arg2: Rect2,
  arg3: Color,
  arg4: Boolean,
  arg5: Object?,
  arg6: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(8)
      args[0] = arg0.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = arg5?.ptr
      args[6] = arg6.getRawMemory(this)
      args[7] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_World2D(mb: CPointer<godot_method_bind>, inst: COpaquePointer): World2D {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as World2D
  }
  return ret
}

internal fun _icall_InputEvent_Object(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object
): InputEvent {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.ptr
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as InputEvent
  }
  return ret
}

internal fun _icall_Unit_Dictionary(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Dictionary
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Dictionary(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Dictionary {
  val ret = memScoped {
      val retVar = alloc<godot_dictionary>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Dictionary(retVar)
  }
  return ret
}

internal fun _icall_Unit_RID(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Long_Object(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.ptr
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Object_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): Object {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!)
  }
  return ret
}

internal fun _icall_Shape_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long
): Shape {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Shape
  }
  return ret
}

internal fun _icall_Transform_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): Transform {
  val ret = memScoped {
      val retVar = alloc<godot_transform>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Transform(retVar)
  }
  return ret
}

internal fun _icall_Unit_Long_Transform(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Transform
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Shape2D_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long
): Shape2D {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Shape2D
  }
  return ret
}

internal fun _icall_Transform2D_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): Transform2D {
  val ret = memScoped {
      val retVar = alloc<godot_transform2d>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Transform2D(retVar)
  }
  return ret
}

internal fun _icall_Unit_Long_Transform2D(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Transform2D
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Shape(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Shape {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Shape
  }
  return ret
}

internal fun _icall_Shape2D(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Shape2D {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Shape2D
  }
  return ret
}

internal fun _icall_ColorPicker(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    ColorPicker {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as ColorPicker
  }
  return ret
}

internal fun _icall_PopupPanel(mb: CPointer<godot_method_bind>, inst: COpaquePointer): PopupPanel {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as PopupPanel
  }
  return ret
}

internal fun _icall_PoolStringArray_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String
): PoolStringArray {
  val ret = memScoped {
      val retVar = alloc<godot_pool_string_array>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.toGDString().value.ptr
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      PoolStringArray(retVar)
  }
  return ret
}

internal fun _icall_Variant_String_String_nVariant(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: String,
  arg2: Variant?
): Variant {
  val ret = memScoped {
      val retVar = alloc<godot.gdnative.godot_variant>().ptr
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.toGDString().value.ptr
      args[2] = arg2?._handle?.ptr
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      GdString(args[1]!!).destroy(this)
      Variant(retVar)
  }
  return ret
}

internal fun _icall_Long_String_PoolByteArray(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: PoolByteArray
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[0]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Unit_String_String_Variant(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: String,
  arg2: Variant
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.toGDString().value.ptr
      args[2] = arg2._handle.ptr
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
      GdString(args[1]!!).destroy(this)
  }
}

internal fun _icall_Theme(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Theme {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Theme
  }
  return ret
}

internal fun _icall_Unit_String_Color(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Color
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
  }
}

internal fun _icall_Unit_Variant_Object(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Variant,
  arg1: Object
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0._handle.ptr
      args[1] = arg1.ptr
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Color_String_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: String
): Color {
  val ret = memScoped {
      val retVar = alloc<godot_color>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.toGDString().value.ptr
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      GdString(args[1]!!).destroy(this)
      Color(retVar)
  }
  return ret
}

internal fun _icall_Long_Vector2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Control(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Control {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Control
  }
  return ret
}

internal fun _icall_Font_String_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: String
): Font {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.toGDString().value.ptr
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      GdString(args[1]!!).destroy(this)
      wrap(retVar.pointed.value!!) as Font
  }
  return ret
}

internal fun _icall_Texture_String_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: String
): Texture {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.toGDString().value.ptr
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      GdString(args[1]!!).destroy(this)
      wrap(retVar.pointed.value!!) as Texture
  }
  return ret
}

internal fun _icall_StyleBox_String_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: String
): StyleBox {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.toGDString().value.ptr
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      GdString(args[1]!!).destroy(this)
      wrap(retVar.pointed.value!!) as StyleBox
  }
  return ret
}

internal fun _icall_String_Vector2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2
): String {
  val ret = memScoped {
      val retVar = alloc<godot_string>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(retVar).toKString()
  }
  return ret
}

internal fun _icall_Unit_Long_Double_Boolean_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Double,
  arg2: Boolean,
  arg3: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Long_Double_Double_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Double,
  arg2: Double,
  arg3: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_PoolByteArray_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): PoolByteArray {
  val ret = memScoped {
      val retVar = alloc<godot_pool_byte_array>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      PoolByteArray(retVar)
  }
  return ret
}

internal fun _icall_CryptoKey_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): CryptoKey {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as CryptoKey
  }
  return ret
}

internal fun _icall_X509Certificate_Object_String_String_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: String,
  arg2: String,
  arg3: String
): X509Certificate {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.ptr
      args[1] = arg1.toGDString().value.ptr
      args[2] = arg2.toGDString().value.ptr
      args[3] = arg3.toGDString().value.ptr
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[1]!!).destroy(this)
      GdString(args[2]!!).destroy(this)
      GdString(args[3]!!).destroy(this)
      wrap(retVar.pointed.value!!) as X509Certificate
  }
  return ret
}

internal fun _icall_Image_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): Image {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Image
  }
  return ret
}

internal fun _icall_Long_Vector2_Double_Double_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2,
  arg1: Double,
  arg2: Double,
  arg3: Long,
  arg4: Long
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(6)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Double_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Double
): Double {
  var ret: Double = 0.0
  memScoped {
      val retVar = alloc<DoubleVar>()
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Long_Long_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Double
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Unit_Vector2_Vector2_Vector2_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2,
  arg1: Vector2,
  arg2: Vector2,
  arg3: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Double_Vector2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2
): Double {
  var ret: Double = 0.0
  memScoped {
      val retVar = alloc<DoubleVar>()
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Vector2_Long_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Double
): Vector2 {
  val ret = memScoped {
      val retVar = alloc<godot_vector2>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Vector2(retVar)
  }
  return ret
}

internal fun _icall_Vector2_Double_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Double,
  arg1: Boolean
): Vector2 {
  val ret = memScoped {
      val retVar = alloc<godot_vector2>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Vector2(retVar)
  }
  return ret
}

internal fun _icall_Vector2_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Double
): Vector2 {
  val ret = memScoped {
      val retVar = alloc<godot_vector2>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Vector2(retVar)
  }
  return ret
}

internal fun _icall_PoolVector2Array_Long_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Double
): PoolVector2Array {
  val ret = memScoped {
      val retVar = alloc<godot_pool_vector2_array>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      PoolVector2Array(retVar)
  }
  return ret
}

internal fun _icall_Unit_Vector3_Vector3_Vector3_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector3,
  arg1: Vector3,
  arg2: Vector3,
  arg3: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_PoolRealArray(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    PoolRealArray {
  val ret = memScoped {
      val retVar = alloc<godot_pool_real_array>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      PoolRealArray(retVar)
  }
  return ret
}

internal fun _icall_Double_Vector3(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector3
): Double {
  var ret: Double = 0.0
  memScoped {
      val retVar = alloc<DoubleVar>()
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Vector3_Long_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Double
): Vector3 {
  val ret = memScoped {
      val retVar = alloc<godot_vector3>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Vector3(retVar)
  }
  return ret
}

internal fun _icall_Vector3_Double_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Double,
  arg1: Boolean
): Vector3 {
  val ret = memScoped {
      val retVar = alloc<godot_vector3>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Vector3(retVar)
  }
  return ret
}

internal fun _icall_Vector3_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Double
): Vector3 {
  val ret = memScoped {
      val retVar = alloc<godot_vector3>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Vector3(retVar)
  }
  return ret
}

internal fun _icall_PoolVector3Array_Long_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Double
): PoolVector3Array {
  val ret = memScoped {
      val retVar = alloc<godot_pool_vector3_array>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      PoolVector3Array(retVar)
  }
  return ret
}

internal fun _icall_Curve(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Curve {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Curve
  }
  return ret
}

internal fun _icall_Long_Object_Object_nObject(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: Object,
  arg2: Object?
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.ptr
      args[1] = arg1.ptr
      args[2] = arg2?.ptr
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_PacketPeerDTLS_Object(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object
): PacketPeerDTLS {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.ptr
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as PacketPeerDTLS
  }
  return ret
}

internal fun _icall_DynamicFontData(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    DynamicFontData {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as DynamicFontData
  }
  return ret
}

internal fun _icall_DynamicFontData_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): DynamicFontData {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as DynamicFontData
  }
  return ret
}

internal fun _icall_Unit_String_PoolByteArray_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: PoolByteArray,
  arg2: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
  }
}

internal fun _icall_Unit_String_PoolStringArray(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: PoolStringArray
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
  }
}

internal fun _icall_Unit_String_String_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: String,
  arg2: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.toGDString().value.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
      GdString(args[1]!!).destroy(this)
  }
}

internal fun _icall_VBoxContainer(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    VBoxContainer {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as VBoxContainer
  }
  return ret
}

internal fun _icall_EditorFileSystemDirectory(mb: CPointer<godot_method_bind>,
    inst: COpaquePointer): EditorFileSystemDirectory {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as EditorFileSystemDirectory
  }
  return ret
}

internal fun _icall_EditorFileSystemDirectory_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String
): EditorFileSystemDirectory {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.toGDString().value.ptr
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      wrap(retVar.pointed.value!!) as EditorFileSystemDirectory
  }
  return ret
}

internal fun _icall_EditorFileSystemDirectory_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): EditorFileSystemDirectory {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as EditorFileSystemDirectory
  }
  return ret
}

internal fun _icall_Unit_String_PoolStringArray_Object(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: PoolStringArray,
  arg2: Object
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.ptr
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
  }
}

internal fun _icall_EditorSettings(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    EditorSettings {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as EditorSettings
  }
  return ret
}

internal fun _icall_FileSystemDock(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    FileSystemDock {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as FileSystemDock
  }
  return ret
}

internal fun _icall_EditorInspector(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    EditorInspector {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as EditorInspector
  }
  return ret
}

internal fun _icall_EditorFileSystem(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    EditorFileSystem {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as EditorFileSystem
  }
  return ret
}

internal fun _icall_EditorResourcePreview(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    EditorResourcePreview {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as EditorResourcePreview
  }
  return ret
}

internal fun _icall_ScriptEditor(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    ScriptEditor {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as ScriptEditor
  }
  return ret
}

internal fun _icall_EditorSelection(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    EditorSelection {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as EditorSelection
  }
  return ret
}

internal fun _icall_Unit_Object_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: String
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.ptr
      args[1] = arg1.toGDString().value.ptr
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[1]!!).destroy(this)
  }
}

internal fun _icall_VariantArray_VariantArray_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: VariantArray,
  arg1: Long
): VariantArray {
  val ret = memScoped {
      val retVar = alloc<godot_array>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0._handle.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      VariantArray(retVar)
  }
  return ret
}

internal fun _icall_Unit_Object_Object(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: Object
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.ptr
      args[1] = arg1.ptr
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_ToolButton_Object_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: String
): ToolButton {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.ptr
      args[1] = arg1.toGDString().value.ptr
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[1]!!).destroy(this)
      wrap(retVar.pointed.value!!) as ToolButton
  }
  return ret
}

internal fun _icall_Unit_String_String_Object_Object(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: String,
  arg2: Object,
  arg3: Object
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.toGDString().value.ptr
      args[2] = arg2.ptr
      args[3] = arg3.ptr
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
      GdString(args[1]!!).destroy(this)
  }
}

internal fun _icall_Unit_String_Object_String_nVariant(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Object,
  arg2: String,
  arg3: Variant?
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.ptr
      args[2] = arg2.toGDString().value.ptr
      args[3] = arg3?._handle?.ptr
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
      GdString(args[2]!!).destroy(this)
  }
}

internal fun _icall_EditorInterface(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    EditorInterface {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as EditorInterface
  }
  return ret
}

internal fun _icall_ScriptCreateDialog(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    ScriptCreateDialog {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as ScriptCreateDialog
  }
  return ret
}

internal fun _icall_UndoRedo(mb: CPointer<godot_method_bind>, inst: COpaquePointer): UndoRedo {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as UndoRedo
  }
  return ret
}

internal fun _icall_Unit_String_Variant_String_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Variant,
  arg2: String,
  arg3: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1._handle.ptr
      args[2] = arg2.toGDString().value.ptr
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
      GdString(args[2]!!).destroy(this)
  }
}

internal fun _icall_Object(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Object {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!)
  }
  return ret
}

internal fun _icall_Unit_Object_Object_String_Variant(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: Object,
  arg2: String,
  arg3: Variant
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.ptr
      args[1] = arg1.ptr
      args[2] = arg2.toGDString().value.ptr
      args[3] = arg3._handle.ptr
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[2]!!).destroy(this)
  }
}

internal fun _icall_Unit_String_Object_String_Variant(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Object,
  arg2: String,
  arg3: Variant
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.ptr
      args[2] = arg2.toGDString().value.ptr
      args[3] = arg3._handle.ptr
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
      GdString(args[2]!!).destroy(this)
  }
}

internal fun _icall_Animation_String_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Long,
  arg2: Long
): Animation {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      wrap(retVar.pointed.value!!) as Animation
  }
  return ret
}

internal fun _icall_Node_String_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Long,
  arg2: Long
): Node {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      wrap(retVar.pointed.value!!) as Node
  }
  return ret
}

internal fun _icall_Unit_PoolStringArray(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: PoolStringArray
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_String_Variant_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Variant,
  arg2: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1._handle.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
  }
}

internal fun _icall_Unit_PoolVector3Array_Object_Boolean_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: PoolVector3Array,
  arg1: Object,
  arg2: Boolean,
  arg3: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_PoolVector3Array_Object_Boolean_Color(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: PoolVector3Array,
  arg1: Object,
  arg2: Boolean,
  arg3: Color
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Object_Boolean_nObject_nObject(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: Boolean,
  arg2: Object?,
  arg3: Object?
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2?.ptr
      args[3] = arg3?.ptr
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Object_Double_Color(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: Double,
  arg2: Color
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_EditorSpatialGizmoPlugin(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    EditorSpatialGizmoPlugin {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as EditorSpatialGizmoPlugin
  }
  return ret
}

internal fun _icall_Spatial(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Spatial {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Spatial
  }
  return ret
}

internal fun _icall_Unit_String_Object_Boolean_Color(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Object,
  arg2: Boolean,
  arg3: Color
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
  }
}

internal fun _icall_Unit_String_Color_Boolean_Boolean_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Color,
  arg2: Boolean,
  arg3: Boolean,
  arg4: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(6)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
  }
}

internal fun _icall_SpatialMaterial_String_Object(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Object
): SpatialMaterial {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.ptr
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      wrap(retVar.pointed.value!!) as SpatialMaterial
  }
  return ret
}

internal fun _icall_VariantArray_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String
): VariantArray {
  val ret = memScoped {
      val retVar = alloc<godot_array>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.toGDString().value.ptr
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      VariantArray(retVar)
  }
  return ret
}

internal fun _icall_Sky(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Sky {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Sky
  }
  return ret
}

internal fun _icall_Unit_Basis(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Basis
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Variant_VariantArray_nObject_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: VariantArray,
  arg1: Object?,
  arg2: Boolean
): Variant {
  val ret = memScoped {
      val retVar = alloc<godot.gdnative.godot_variant>().ptr
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0._handle.ptr
      args[1] = arg1?.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Variant(retVar)
  }
  return ret
}

internal fun _icall_Long_String_PoolStringArray(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: PoolStringArray
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[0]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_LineEdit(mb: CPointer<godot_method_bind>, inst: COpaquePointer): LineEdit {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as LineEdit
  }
  return ret
}

internal fun _icall_Boolean_Vector2_Variant_Object(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2,
  arg1: Variant,
  arg2: Object
): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1._handle.ptr
      args[2] = arg2.ptr
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Unit_Vector2_Variant_Object(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2,
  arg1: Variant,
  arg2: Object
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1._handle.ptr
      args[2] = arg2.ptr
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Variant_Vector2_Object(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2,
  arg1: Object
): Variant {
  val ret = memScoped {
      val retVar = alloc<godot.gdnative.godot_variant>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.ptr
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Variant(retVar)
  }
  return ret
}

internal fun _icall_Unit_RID_Vector2_String_Color_Long_Color(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Vector2,
  arg2: String,
  arg3: Color,
  arg4: Long,
  arg5: Color
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(7)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.toGDString().value.ptr
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = arg5.getRawMemory(this)
      args[6] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[2]!!).destroy(this)
  }
}

internal fun _icall_Double_RID_Vector2_Long_Long_Color_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Vector2,
  arg2: Long,
  arg3: Long,
  arg4: Color,
  arg5: Boolean
): Double {
  var ret: Double = 0.0
  memScoped {
      val retVar = alloc<DoubleVar>()
      val args = allocArray<COpaquePointerVar>(7)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = arg5.getRawMemory(this)
      args[6] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Vector2_String_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Double
): Vector2 {
  val ret = memScoped {
      val retVar = alloc<godot_vector2>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      Vector2(retVar)
  }
  return ret
}

internal fun _icall_Variant_VariantArray(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: VariantArray
): Variant {
  val ret = memScoped {
      val retVar = alloc<godot.gdnative.godot_variant>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0._handle.ptr
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Variant(retVar)
  }
  return ret
}

internal fun _icall_GDNativeLibrary(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    GDNativeLibrary {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as GDNativeLibrary
  }
  return ret
}

internal fun _icall_Variant_String_String_VariantArray(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: String,
  arg2: VariantArray
): Variant {
  val ret = memScoped {
      val retVar = alloc<godot.gdnative.godot_variant>().ptr
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.toGDString().value.ptr
      args[2] = arg2._handle.ptr
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      GdString(args[1]!!).destroy(this)
      Variant(retVar)
  }
  return ret
}

internal fun _icall_ConfigFile(mb: CPointer<godot_method_bind>, inst: COpaquePointer): ConfigFile {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as ConfigFile
  }
  return ret
}

internal fun _icall_Boolean_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Boolean
): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Variant_nVariant(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Variant?
): Variant {
  val ret = memScoped {
      val retVar = alloc<godot.gdnative.godot_variant>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0?._handle?.ptr
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Variant(retVar)
  }
  return ret
}

internal fun _icall_GIProbeData(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    GIProbeData {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as GIProbeData
  }
  return ret
}

internal fun _icall_Unit_nObject_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object?,
  arg1: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0?.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_PoolIntArray(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: PoolIntArray
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_PoolIntArray(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    PoolIntArray {
  val ret = memScoped {
      val retVar = alloc<godot_pool_int_array>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      PoolIntArray(retVar)
  }
  return ret
}

internal fun _icall_Unit_PoolRealArray(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: PoolRealArray
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Double_Color(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Double,
  arg1: Color
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Color_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): Color {
  val ret = memScoped {
      val retVar = alloc<godot_color>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Color(retVar)
  }
  return ret
}

internal fun _icall_Color_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Double
): Color {
  val ret = memScoped {
      val retVar = alloc<godot_color>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Color(retVar)
  }
  return ret
}

internal fun _icall_Unit_Long_Color(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Color
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Long_String_Long_String_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Long,
  arg2: String,
  arg3: Long
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.toGDString().value.ptr
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[0]!!).destroy(this)
      GdString(args[2]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Unit_String_Long_String_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Long,
  arg2: String,
  arg3: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.toGDString().value.ptr
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
      GdString(args[2]!!).destroy(this)
  }
}

internal fun _icall_HBoxContainer(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    HBoxContainer {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as HBoxContainer
  }
  return ret
}

internal fun _icall_Boolean_String_Long_String_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Long,
  arg2: String,
  arg3: Long
): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.toGDString().value.ptr
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[0]!!).destroy(this)
      GdString(args[2]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Unit_String_Long_String_Long_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Long,
  arg2: String,
  arg3: Long,
  arg4: Double
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(6)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.toGDString().value.ptr
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
      GdString(args[2]!!).destroy(this)
  }
}

internal fun _icall_Unit_Long_Boolean_Long_Color_Boolean_Long_Color_nObject_nObject(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Boolean,
  arg2: Long,
  arg3: Color,
  arg4: Boolean,
  arg5: Long,
  arg6: Color,
  arg7: Object?,
  arg8: Object?
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(10)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = arg5.getRawMemory(this)
      args[6] = arg6.getRawMemory(this)
      args[7] = arg7?.ptr
      args[8] = arg8?.ptr
      args[9] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_MeshLibrary(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    MeshLibrary {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as MeshLibrary
  }
  return ret
}

internal fun _icall_RID_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): RID {
  val ret = memScoped {
      val retVar = alloc<godot_rid>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      RID(retVar)
  }
  return ret
}

internal fun _icall_Long_Long_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long,
  arg2: Long
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Unit_Boolean_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Boolean,
  arg1: Double
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Vector3_Long_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long,
  arg2: Long
): Vector3 {
  val ret = memScoped {
      val retVar = alloc<godot_vector3>().ptr
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Vector3(retVar)
  }
  return ret
}

internal fun _icall_Unit_Long_Long_Long_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long,
  arg2: Long,
  arg3: Long,
  arg4: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(6)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Boolean_Boolean_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Boolean,
  arg1: Boolean,
  arg2: Long,
  arg3: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_StreamPeer(mb: CPointer<godot_method_bind>, inst: COpaquePointer): StreamPeer {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as StreamPeer
  }
  return ret
}

internal fun _icall_Long_String_Long_Boolean_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Long,
  arg2: Boolean,
  arg3: Boolean
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[0]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_String_Dictionary(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Dictionary
): String {
  val ret = memScoped {
      val retVar = alloc<godot_string>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(retVar).toKString()
  }
  return ret
}

internal fun _icall_Long_Long_String_PoolStringArray_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: String,
  arg2: PoolStringArray,
  arg3: String
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.toGDString().value.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.toGDString().value.ptr
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[1]!!).destroy(this)
      GdString(args[3]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Long_Long_String_PoolStringArray_PoolByteArray(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: String,
  arg2: PoolStringArray,
  arg3: PoolByteArray
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.toGDString().value.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[1]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Long_String_PoolStringArray_Boolean_Long_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: PoolStringArray,
  arg2: Boolean,
  arg3: Long,
  arg4: String
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(6)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.toGDString().value.ptr
      args[5] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[0]!!).destroy(this)
      GdString(args[4]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Long_PoolByteArray(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: PoolByteArray
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Long_String_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Long
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[0]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Unit_Object_Rect2_Vector2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: Rect2,
  arg2: Vector2
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Object_Object_Rect2_Vector2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: Object,
  arg2: Rect2,
  arg3: Vector2
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.ptr
      args[1] = arg1.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Long_Long_Long_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long,
  arg2: Double
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Unit_Long_Long_Boolean_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long,
  arg2: Boolean,
  arg3: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Long_Long_Boolean_Long_PoolByteArray(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long,
  arg2: Boolean,
  arg3: Long,
  arg4: PoolByteArray
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(6)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Long_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Boolean
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Color_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long
): Color {
  val ret = memScoped {
      val retVar = alloc<godot_color>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Color(retVar)
  }
  return ret
}

internal fun _icall_Color_Vector2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2
): Color {
  val ret = memScoped {
      val retVar = alloc<godot_color>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Color(retVar)
  }
  return ret
}

internal fun _icall_Image_Rect2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Rect2
): Image {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Image
  }
  return ret
}

internal fun _icall_Image(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Image {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Image
  }
  return ret
}

internal fun _icall_Long_String_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Boolean
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[0]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Unit_Long_Long_Color(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long,
  arg2: Color
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Vector2_Color(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2,
  arg1: Color
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Object_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Long_Long_Double_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long,
  arg2: Double,
  arg3: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Long_nObject(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Object?
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1?.ptr
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Plane(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Plane
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Long_Boolean_String_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Boolean,
  arg2: String,
  arg3: String
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.toGDString().value.ptr
      args[3] = arg3.toGDString().value.ptr
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[2]!!).destroy(this)
      GdString(args[3]!!).destroy(this)
  }
}

internal fun _icall_Unit_Object_Long_Vector2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: Long,
  arg2: Vector2
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Long_Double_Double_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Double,
  arg2: Double,
  arg3: Double
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Boolean_String_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Boolean
): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[0]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_InputEvent_Transform2D_Vector2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Transform2D,
  arg1: Vector2
): InputEvent {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as InputEvent
  }
  return ret
}

internal fun _icall_Boolean_String_Object(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Object
): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.ptr
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[0]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Boolean_Object_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: String
): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.ptr
      args[1] = arg1.toGDString().value.ptr
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[1]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Node_Boolean_nObject(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Boolean,
  arg1: Object?
): Node {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1?.ptr
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Node
  }
  return ret
}

internal fun _icall_Dictionary_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Boolean
): Dictionary {
  val ret = memScoped {
      val retVar = alloc<godot_dictionary>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Dictionary(retVar)
  }
  return ret
}

internal fun _icall_Unit_nObject(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object?
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0?.ptr
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Object_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_String_nObject_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Object?,
  arg2: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1?.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
  }
}

internal fun _icall_Rect2_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): Rect2 {
  val ret = memScoped {
      val retVar = alloc<godot_rect2>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Rect2(retVar)
  }
  return ret
}

internal fun _icall_Variant_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): Variant {
  val ret = memScoped {
      val retVar = alloc<godot.gdnative.godot_variant>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Variant(retVar)
  }
  return ret
}

internal fun _icall_VScrollBar(mb: CPointer<godot_method_bind>, inst: COpaquePointer): VScrollBar {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as VScrollBar
  }
  return ret
}

internal fun _icall_Unit_Long_Variant(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Variant
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1._handle.ptr
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Variant(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Variant
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0._handle.ptr
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Variant(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Variant {
  val ret = memScoped {
      val retVar = alloc<godot.gdnative.godot_variant>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Variant(retVar)
  }
  return ret
}

internal fun _icall_Dictionary_String_Variant(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Variant
): Dictionary {
  val ret = memScoped {
      val retVar = alloc<godot_dictionary>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1._handle.ptr
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      Dictionary(retVar)
  }
  return ret
}

internal fun _icall_Dictionary_String_Variant_Variant(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Variant,
  arg2: Variant
): Dictionary {
  val ret = memScoped {
      val retVar = alloc<godot_dictionary>().ptr
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1._handle.ptr
      args[2] = arg2._handle.ptr
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      Dictionary(retVar)
  }
  return ret
}

internal fun _icall_Dictionary_Variant_Variant(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Variant,
  arg1: Variant
): Dictionary {
  val ret = memScoped {
      val retVar = alloc<godot_dictionary>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0._handle.ptr
      args[1] = arg1._handle.ptr
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Dictionary(retVar)
  }
  return ret
}

internal fun _icall_Dictionary_Long_String_nVariant(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: String,
  arg2: Variant?
): Dictionary {
  val ret = memScoped {
      val retVar = alloc<godot_dictionary>().ptr
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.toGDString().value.ptr
      args[2] = arg2?._handle?.ptr
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[1]!!).destroy(this)
      Dictionary(retVar)
  }
  return ret
}

internal fun _icall_Variant_Variant_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Variant,
  arg1: Boolean
): Variant {
  val ret = memScoped {
      val retVar = alloc<godot.gdnative.godot_variant>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0._handle.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Variant(retVar)
  }
  return ret
}

internal fun _icall_JavaClass_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String
): JavaClass {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.toGDString().value.ptr
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      wrap(retVar.pointed.value!!) as JavaClass
  }
  return ret
}

internal fun _icall_Variant_String_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Boolean
): Variant {
  val ret = memScoped {
      val retVar = alloc<godot.gdnative.godot_variant>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      Variant(retVar)
  }
  return ret
}

internal fun _icall_KinematicCollision_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): KinematicCollision {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as KinematicCollision
  }
  return ret
}

internal fun _icall_KinematicCollision_Vector3_Boolean_Boolean_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector3,
  arg1: Boolean,
  arg2: Boolean,
  arg3: Boolean
): KinematicCollision {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as KinematicCollision
  }
  return ret
}

internal fun _icall_Vector3_Vector3_Vector3_Boolean_Long_Double_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector3,
  arg1: Vector3,
  arg2: Boolean,
  arg3: Long,
  arg4: Double,
  arg5: Boolean
): Vector3 {
  val ret = memScoped {
      val retVar = alloc<godot_vector3>().ptr
      val args = allocArray<COpaquePointerVar>(7)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = arg5.getRawMemory(this)
      args[6] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Vector3(retVar)
  }
  return ret
}

internal fun _icall_Vector3_Vector3_Vector3_Vector3_Boolean_Long_Double_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector3,
  arg1: Vector3,
  arg2: Vector3,
  arg3: Boolean,
  arg4: Long,
  arg5: Double,
  arg6: Boolean
): Vector3 {
  val ret = memScoped {
      val retVar = alloc<godot_vector3>().ptr
      val args = allocArray<COpaquePointerVar>(8)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = arg5.getRawMemory(this)
      args[6] = arg6.getRawMemory(this)
      args[7] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Vector3(retVar)
  }
  return ret
}

internal fun _icall_Boolean_Transform_Vector3_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Transform,
  arg1: Vector3,
  arg2: Boolean
): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_KinematicCollision2D_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): KinematicCollision2D {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as KinematicCollision2D
  }
  return ret
}

internal fun _icall_KinematicCollision2D_Vector2_Boolean_Boolean_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2,
  arg1: Boolean,
  arg2: Boolean,
  arg3: Boolean
): KinematicCollision2D {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as KinematicCollision2D
  }
  return ret
}

internal fun _icall_Vector2_Vector2_Vector2_Boolean_Long_Double_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2,
  arg1: Vector2,
  arg2: Boolean,
  arg3: Long,
  arg4: Double,
  arg5: Boolean
): Vector2 {
  val ret = memScoped {
      val retVar = alloc<godot_vector2>().ptr
      val args = allocArray<COpaquePointerVar>(7)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = arg5.getRawMemory(this)
      args[6] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Vector2(retVar)
  }
  return ret
}

internal fun _icall_Vector2_Vector2_Vector2_Vector2_Boolean_Long_Double_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2,
  arg1: Vector2,
  arg2: Vector2,
  arg3: Boolean,
  arg4: Long,
  arg5: Double,
  arg6: Boolean
): Vector2 {
  val ret = memScoped {
      val retVar = alloc<godot_vector2>().ptr
      val args = allocArray<COpaquePointerVar>(8)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = arg5.getRawMemory(this)
      args[6] = arg6.getRawMemory(this)
      args[7] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Vector2(retVar)
  }
  return ret
}

internal fun _icall_Boolean_Transform2D_Vector2_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Transform2D,
  arg1: Vector2,
  arg2: Boolean
): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Long_Vector2_Object(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2,
  arg1: Object
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.ptr
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_OccluderPolygon2D(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    OccluderPolygon2D {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as OccluderPolygon2D
  }
  return ret
}

internal fun _icall_Unit_Vector2_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2,
  arg1: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_PopupMenu(mb: CPointer<godot_method_bind>, inst: COpaquePointer): PopupMenu {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as PopupMenu
  }
  return ret
}

internal fun _icall_Boolean_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Double
): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Mesh_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Double
): Mesh {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Mesh
  }
  return ret
}

internal fun _icall_TriangleMesh(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    TriangleMesh {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as TriangleMesh
  }
  return ret
}

internal fun _icall_VariantArray_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): VariantArray {
  val ret = memScoped {
      val retVar = alloc<godot_array>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      VariantArray(retVar)
  }
  return ret
}

internal fun _icall_Material_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): Material {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Material
  }
  return ret
}

internal fun _icall_Long_Object_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: Long
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Plane_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): Plane {
  val ret = memScoped {
      val retVar = alloc<godot_plane>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Plane(retVar)
  }
  return ret
}

internal fun _icall_PoolRealArray_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): PoolRealArray {
  val ret = memScoped {
      val retVar = alloc<godot_pool_real_array>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      PoolRealArray(retVar)
  }
  return ret
}

internal fun _icall_Unit_Long_PoolIntArray(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: PoolIntArray
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Long_Plane(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Plane
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Long_PoolRealArray(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: PoolRealArray
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Skin(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Skin {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Skin
  }
  return ret
}

internal fun _icall_Mesh_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): Mesh {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Mesh
  }
  return ret
}

internal fun _icall_NavigationMesh_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): NavigationMesh {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as NavigationMesh
  }
  return ret
}

internal fun _icall_Unit_Long_VariantArray(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: VariantArray
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1._handle.ptr
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_MultiMesh(mb: CPointer<godot_method_bind>, inst: COpaquePointer): MultiMesh {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as MultiMesh
  }
  return ret
}

internal fun _icall_NetworkedMultiplayerPeer(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    NetworkedMultiplayerPeer {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as NetworkedMultiplayerPeer
  }
  return ret
}

internal fun _icall_Long_PoolByteArray_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: PoolByteArray,
  arg1: Long,
  arg2: Long
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Object_Vector3(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector3
): Object {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!)
  }
  return ret
}

internal fun _icall_Vector3_Vector3_Vector3_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector3,
  arg1: Vector3,
  arg2: Boolean
): Vector3 {
  val ret = memScoped {
      val retVar = alloc<godot_vector3>().ptr
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Vector3(retVar)
  }
  return ret
}

internal fun _icall_PoolVector3Array_Vector3_Vector3_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector3,
  arg1: Vector3,
  arg2: Boolean
): PoolVector3Array {
  val ret = memScoped {
      val retVar = alloc<godot_pool_vector3_array>().ptr
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      PoolVector3Array(retVar)
  }
  return ret
}

internal fun _icall_Long_Object_Transform_nObject(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: Transform,
  arg2: Object?
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2?.ptr
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Object_Vector2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2
): Object {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!)
  }
  return ret
}

internal fun _icall_PoolVector2Array_Vector2_Vector2_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2,
  arg1: Vector2,
  arg2: Boolean
): PoolVector2Array {
  val ret = memScoped {
      val retVar = alloc<godot_pool_vector2_array>().ptr
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      PoolVector2Array(retVar)
  }
  return ret
}

internal fun _icall_Long_Object_Transform2D_nObject(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: Transform2D,
  arg2: Object?
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2?.ptr
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_NavigationMesh(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    NavigationMesh {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as NavigationMesh
  }
  return ret
}

internal fun _icall_Unit_PoolVector2Array_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: PoolVector2Array,
  arg1: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_PoolVector2Array_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): PoolVector2Array {
  val ret = memScoped {
      val retVar = alloc<godot_pool_vector2_array>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      PoolVector2Array(retVar)
  }
  return ret
}

internal fun _icall_Unit_Long_PoolVector2Array(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: PoolVector2Array
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_NavigationPolygon(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    NavigationPolygon {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as NavigationPolygon
  }
  return ret
}

internal fun _icall_Long_String_Long_Long_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Long,
  arg2: Long,
  arg3: Long,
  arg4: Long
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(6)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[0]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Long_Long_Long_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long,
  arg2: Long,
  arg3: Long
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_MultiplayerAPI(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    MultiplayerAPI {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as MultiplayerAPI
  }
  return ret
}

internal fun _icall_Unit_Object_Object_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: Object,
  arg2: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.ptr
      args[1] = arg1.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Node_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): Node {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Node
  }
  return ret
}

internal fun _icall_Node_String_Boolean_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Boolean,
  arg2: Boolean
): Node {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      wrap(retVar.pointed.value!!) as Node
  }
  return ret
}

internal fun _icall_Node_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String
): Node {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.toGDString().value.ptr
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      wrap(retVar.pointed.value!!) as Node
  }
  return ret
}

internal fun _icall_Node_NodePath(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: NodePath
): Node {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Node
  }
  return ret
}

internal fun _icall_VariantArray_NodePath(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: NodePath
): VariantArray {
  val ret = memScoped {
      val retVar = alloc<godot_array>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      VariantArray(retVar)
  }
  return ret
}

internal fun _icall_NodePath_Object(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object
): NodePath {
  val ret = memScoped {
      val retVar = alloc<godot_node_path>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.ptr
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      NodePath(retVar)
  }
  return ret
}

internal fun _icall_SceneTree(mb: CPointer<godot_method_bind>, inst: COpaquePointer): SceneTree {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as SceneTree
  }
  return ret
}

internal fun _icall_Viewport(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Viewport {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Viewport
  }
  return ret
}

internal fun _icall_Unit_String_VariantArray_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: VariantArray,
  arg2: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1._handle.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
  }
}

internal fun _icall_Unit_Long_String_Variant(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: String,
  arg2: Variant
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.toGDString().value.ptr
      args[2] = arg2._handle.ptr
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[1]!!).destroy(this)
  }
}

internal fun _icall_Transform2D_Object(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object
): Transform2D {
  val ret = memScoped {
      val retVar = alloc<godot_transform2d>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.ptr
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Transform2D(retVar)
  }
  return ret
}

internal fun _icall_OpenSimplexNoise(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    OpenSimplexNoise {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as OpenSimplexNoise
  }
  return ret
}

internal fun _icall_Unit_String_VariantArray(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: VariantArray
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1._handle.ptr
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
  }
}

internal fun _icall_Variant_String_VariantArray(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: VariantArray
): Variant {
  val ret = memScoped {
      val retVar = alloc<godot.gdnative.godot_variant>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1._handle.ptr
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      Variant(retVar)
  }
  return ret
}

internal fun _icall_Long_String_Object_String_VariantArray_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Object,
  arg2: String,
  arg3: VariantArray,
  arg4: Long
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(6)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.ptr
      args[2] = arg2.toGDString().value.ptr
      args[3] = arg3._handle.ptr
      args[4] = arg4.getRawMemory(this)
      args[5] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[0]!!).destroy(this)
      GdString(args[2]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Unit_String_Object_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Object,
  arg2: String
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.ptr
      args[2] = arg2.toGDString().value.ptr
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
      GdString(args[2]!!).destroy(this)
  }
}

internal fun _icall_Variant_NodePath(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: NodePath
): Variant {
  val ret = memScoped {
      val retVar = alloc<godot.gdnative.godot_variant>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Variant(retVar)
  }
  return ret
}

internal fun _icall_Reference(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Reference {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Reference
  }
  return ret
}

internal fun _icall_Boolean_String_Object_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Object,
  arg2: String
): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.ptr
      args[2] = arg2.toGDString().value.ptr
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[0]!!).destroy(this)
      GdString(args[2]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Unit_NodePath_Variant(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: NodePath,
  arg1: Variant
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1._handle.ptr
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Image_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long
): Image {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Image
  }
  return ret
}

internal fun _icall_Double_Double_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Double,
  arg1: Double
): Double {
  var ret: Double = 0.0
  memScoped {
      val retVar = alloc<DoubleVar>()
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Double_Double_Double_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Double,
  arg1: Double,
  arg2: Double
): Double {
  var ret: Double = 0.0
  memScoped {
      val retVar = alloc<DoubleVar>()
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Double_Double_Double_Double_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Double,
  arg1: Double,
  arg2: Double,
  arg3: Double
): Double {
  var ret: Double = 0.0
  memScoped {
      val retVar = alloc<DoubleVar>()
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Unit_Object_String_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: String,
  arg2: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.ptr
      args[1] = arg1.toGDString().value.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[1]!!).destroy(this)
  }
}

internal fun _icall_Long_Variant(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Variant
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0._handle.ptr
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_SceneState(mb: CPointer<godot_method_bind>, inst: COpaquePointer): SceneState {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as SceneState
  }
  return ret
}

internal fun _icall_Variant_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Boolean
): Variant {
  val ret = memScoped {
      val retVar = alloc<godot.gdnative.godot_variant>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Variant(retVar)
  }
  return ret
}

internal fun _icall_Long_Variant_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Variant,
  arg1: Boolean
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0._handle.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Long_Object_Boolean_String_nObject(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: Boolean,
  arg2: String,
  arg3: Object?
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.toGDString().value.ptr
      args[3] = arg3?.ptr
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[2]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Long_Long_String_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: String,
  arg2: Long
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.toGDString().value.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[1]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_GradientTexture(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    GradientTexture {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as GradientTexture
  }
  return ret
}

internal fun _icall_CurveTexture(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    CurveTexture {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as CurveTexture
  }
  return ret
}

internal fun _icall_Curve3D(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Curve3D {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Curve3D
  }
  return ret
}

internal fun _icall_Curve2D(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Curve2D {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Curve2D
  }
  return ret
}

internal fun _icall_Unit_Vector3_Vector3(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector3,
  arg1: Vector3
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Vector2_Vector2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2,
  arg1: Vector2
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Physics2DDirectSpaceState(mb: CPointer<godot_method_bind>,
    inst: COpaquePointer): Physics2DDirectSpaceState {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Physics2DDirectSpaceState
  }
  return ret
}

internal fun _icall_VariantArray_Object(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object
): VariantArray {
  val ret = memScoped {
      val retVar = alloc<godot_array>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.ptr
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      VariantArray(retVar)
  }
  return ret
}

internal fun _icall_VariantArray_Object_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: Long
): VariantArray {
  val ret = memScoped {
      val retVar = alloc<godot_array>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      VariantArray(retVar)
  }
  return ret
}

internal fun _icall_Dictionary_Object(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object
): Dictionary {
  val ret = memScoped {
      val retVar = alloc<godot_dictionary>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.ptr
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Dictionary(retVar)
  }
  return ret
}

internal fun _icall_VariantArray_Vector2_Long_VariantArray_Long_Boolean_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2,
  arg1: Long,
  arg2: VariantArray,
  arg3: Long,
  arg4: Boolean,
  arg5: Boolean
): VariantArray {
  val ret = memScoped {
      val retVar = alloc<godot_array>().ptr
      val args = allocArray<COpaquePointerVar>(7)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2._handle.ptr
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = arg5.getRawMemory(this)
      args[6] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      VariantArray(retVar)
  }
  return ret
}

internal fun _icall_VariantArray_Vector2_Long_Long_VariantArray_Long_Boolean_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2,
  arg1: Long,
  arg2: Long,
  arg3: VariantArray,
  arg4: Long,
  arg5: Boolean,
  arg6: Boolean
): VariantArray {
  val ret = memScoped {
      val retVar = alloc<godot_array>().ptr
      val args = allocArray<COpaquePointerVar>(8)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3._handle.ptr
      args[4] = arg4.getRawMemory(this)
      args[5] = arg5.getRawMemory(this)
      args[6] = arg6.getRawMemory(this)
      args[7] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      VariantArray(retVar)
  }
  return ret
}

internal fun _icall_Dictionary_Vector2_Vector2_VariantArray_Long_Boolean_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2,
  arg1: Vector2,
  arg2: VariantArray,
  arg3: Long,
  arg4: Boolean,
  arg5: Boolean
): Dictionary {
  val ret = memScoped {
      val retVar = alloc<godot_dictionary>().ptr
      val args = allocArray<COpaquePointerVar>(7)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2._handle.ptr
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = arg5.getRawMemory(this)
      args[6] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Dictionary(retVar)
  }
  return ret
}

internal fun _icall_Unit_RID_RID_Transform2D_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: RID,
  arg2: Transform2D,
  arg3: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Long_RID(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Variant_RID_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Long
): Variant {
  val ret = memScoped {
      val retVar = alloc<godot.gdnative.godot_variant>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Variant(retVar)
  }
  return ret
}

internal fun _icall_RID_RID_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Long
): RID {
  val ret = memScoped {
      val retVar = alloc<godot_rid>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      RID(retVar)
  }
  return ret
}

internal fun _icall_Transform2D_RID_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Long
): Transform2D {
  val ret = memScoped {
      val retVar = alloc<godot_transform2d>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Transform2D(retVar)
  }
  return ret
}

internal fun _icall_RID_RID(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID
): RID {
  val ret = memScoped {
      val retVar = alloc<godot_rid>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      RID(retVar)
  }
  return ret
}

internal fun _icall_Transform2D_RID(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID
): Transform2D {
  val ret = memScoped {
      val retVar = alloc<godot_transform2d>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Transform2D(retVar)
  }
  return ret
}

internal fun _icall_Unit_RID_Object_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Object,
  arg2: String
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.ptr
      args[2] = arg2.toGDString().value.ptr
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[2]!!).destroy(this)
  }
}

internal fun _icall_Unit_RID_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_Long_Variant(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Long,
  arg2: Variant
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2._handle.ptr
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_Long_RID(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Long,
  arg2: RID
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_Long_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Long,
  arg2: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_Long_Transform2D(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Long,
  arg2: Transform2D
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_RID(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: RID
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_Transform2D(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Transform2D
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_Vector2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Vector2
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_Vector2_Vector2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Vector2,
  arg2: Vector2
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Double
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Physics2DDirectBodyState_RID(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID
): Physics2DDirectBodyState {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Physics2DDirectBodyState
  }
  return ret
}

internal fun _icall_Double_RID_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Long
): Double {
  var ret: Double = 0.0
  memScoped {
      val retVar = alloc<DoubleVar>()
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Boolean_RID(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID
): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Unit_RID_Object_String_nVariant(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Object,
  arg2: String,
  arg3: Variant?
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.ptr
      args[2] = arg2.toGDString().value.ptr
      args[3] = arg3?._handle?.ptr
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[2]!!).destroy(this)
  }
}

internal fun _icall_Unit_RID_Long_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Long,
  arg2: Double
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_Long_Boolean_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Long,
  arg2: Boolean,
  arg3: Double
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Boolean_RID_Transform2D_Vector2_Boolean_Double_nObject(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Transform2D,
  arg2: Vector2,
  arg3: Boolean,
  arg4: Double,
  arg5: Object?
): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(7)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = arg5?.ptr
      args[6] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_RID_Vector2_Vector2_RID_RID(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2,
  arg1: Vector2,
  arg2: RID,
  arg3: RID
): RID {
  val ret = memScoped {
      val retVar = alloc<godot_rid>().ptr
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      RID(retVar)
  }
  return ret
}

internal fun _icall_RID_Vector2_Vector2_Vector2_RID_RID(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2,
  arg1: Vector2,
  arg2: Vector2,
  arg3: RID,
  arg4: RID
): RID {
  val ret = memScoped {
      val retVar = alloc<godot_rid>().ptr
      val args = allocArray<COpaquePointerVar>(6)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      RID(retVar)
  }
  return ret
}

internal fun _icall_RID_Vector2_RID_RID(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2,
  arg1: RID,
  arg2: RID
): RID {
  val ret = memScoped {
      val retVar = alloc<godot_rid>().ptr
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      RID(retVar)
  }
  return ret
}

internal fun _icall_Variant_RID(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID
): Variant {
  val ret = memScoped {
      val retVar = alloc<godot.gdnative.godot_variant>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Variant(retVar)
  }
  return ret
}

internal fun _icall_Unit_RID_Variant(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Variant
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1._handle.ptr
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Physics2DDirectSpaceState_RID(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID
): Physics2DDirectSpaceState {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Physics2DDirectSpaceState
  }
  return ret
}

internal fun _icall_Unit_VariantArray(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: VariantArray
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0._handle.ptr
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_PhysicsDirectSpaceState(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    PhysicsDirectSpaceState {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as PhysicsDirectSpaceState
  }
  return ret
}

internal fun _icall_VariantArray_Object_Vector3(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: Vector3
): VariantArray {
  val ret = memScoped {
      val retVar = alloc<godot_array>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      VariantArray(retVar)
  }
  return ret
}

internal fun _icall_Dictionary_Vector3_Vector3_VariantArray_Long_Boolean_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector3,
  arg1: Vector3,
  arg2: VariantArray,
  arg3: Long,
  arg4: Boolean,
  arg5: Boolean
): Dictionary {
  val ret = memScoped {
      val retVar = alloc<godot_dictionary>().ptr
      val args = allocArray<COpaquePointerVar>(7)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2._handle.ptr
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = arg5.getRawMemory(this)
      args[6] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Dictionary(retVar)
  }
  return ret
}

internal fun _icall_Unit_RID_RID_Transform_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: RID,
  arg2: Transform,
  arg3: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Transform_RID_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Long
): Transform {
  val ret = memScoped {
      val retVar = alloc<godot_transform>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Transform(retVar)
  }
  return ret
}

internal fun _icall_Transform_RID(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID
): Transform {
  val ret = memScoped {
      val retVar = alloc<godot_transform>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Transform(retVar)
  }
  return ret
}

internal fun _icall_Unit_RID_Long_Transform(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Long,
  arg2: Transform
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_Transform(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Transform
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_Vector3(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Vector3
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_Vector3_Vector3(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Vector3,
  arg2: Vector3
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_RID_Long_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Boolean
): RID {
  val ret = memScoped {
      val retVar = alloc<godot_rid>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      RID(retVar)
  }
  return ret
}

internal fun _icall_PhysicsDirectBodyState_RID(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID
): PhysicsDirectBodyState {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as PhysicsDirectBodyState
  }
  return ret
}

internal fun _icall_Double_RID(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID
): Double {
  var ret: Double = 0.0
  memScoped {
      val retVar = alloc<DoubleVar>()
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Boolean_RID_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Long
): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Boolean_RID_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Long,
  arg2: Long
): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Double_RID_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Long,
  arg2: Long
): Double {
  var ret: Double = 0.0
  memScoped {
      val retVar = alloc<DoubleVar>()
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Unit_RID_Long_Long_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Long,
  arg2: Long,
  arg3: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_Long_Long_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Long,
  arg2: Long,
  arg3: Double
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_RID_RID_Transform_RID_Transform(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Transform,
  arg2: RID,
  arg3: Transform
): RID {
  val ret = memScoped {
      val retVar = alloc<godot_rid>().ptr
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      RID(retVar)
  }
  return ret
}

internal fun _icall_RID_RID_Vector3_RID_Vector3(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Vector3,
  arg2: RID,
  arg3: Vector3
): RID {
  val ret = memScoped {
      val retVar = alloc<godot_rid>().ptr
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      RID(retVar)
  }
  return ret
}

internal fun _icall_Vector3_RID(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID
): Vector3 {
  val ret = memScoped {
      val retVar = alloc<godot_vector3>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Vector3(retVar)
  }
  return ret
}

internal fun _icall_PhysicsDirectSpaceState_RID(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID
): PhysicsDirectSpaceState {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as PhysicsDirectSpaceState
  }
  return ret
}

internal fun _icall_Unit_NodePath_PoolRealArray(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: NodePath,
  arg1: PoolRealArray
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_PoolVector2Array_Vector2_Vector2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2,
  arg1: Vector2
): PoolVector2Array {
  val ret = memScoped {
      val retVar = alloc<godot_pool_vector2_array>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      PoolVector2Array(retVar)
  }
  return ret
}

internal fun _icall_Unit_PoolVector2Array_PoolIntArray(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: PoolVector2Array,
  arg1: PoolIntArray
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Vector2_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2,
  arg1: Double
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_String_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Long,
  arg2: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
  }
}

internal fun _icall_Unit_Object_Long_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: Long,
  arg2: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Object_String_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: String,
  arg2: Long,
  arg3: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.ptr
      args[1] = arg1.toGDString().value.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[1]!!).destroy(this)
  }
}

internal fun _icall_Unit_Object_Object_Long_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: Object,
  arg2: Long,
  arg3: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.ptr
      args[1] = arg1.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_String_Long_Long_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Long,
  arg2: Long,
  arg3: Long,
  arg4: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(6)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
  }
}

internal fun _icall_Unit_String_String_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: String,
  arg2: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.toGDString().value.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
      GdString(args[1]!!).destroy(this)
  }
}

internal fun _icall_ShortCut_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): ShortCut {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as ShortCut
  }
  return ret
}

internal fun _icall_Unit_Long_Object_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Object,
  arg2: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_RegExMatch_String_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Long,
  arg2: Long
): RegExMatch {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      wrap(retVar.pointed.value!!) as RegExMatch
  }
  return ret
}

internal fun _icall_VariantArray_String_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Long,
  arg2: Long
): VariantArray {
  val ret = memScoped {
      val retVar = alloc<godot_array>().ptr
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      VariantArray(retVar)
  }
  return ret
}

internal fun _icall_String_String_String_Boolean_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: String,
  arg2: Boolean,
  arg3: Long,
  arg4: Long
): String {
  val ret = memScoped {
      val retVar = alloc<godot_string>().ptr
      val args = allocArray<COpaquePointerVar>(6)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.toGDString().value.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      GdString(args[1]!!).destroy(this)
      GdString(retVar).toKString()
  }
  return ret
}

internal fun _icall_String_Variant(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Variant
): String {
  val ret = memScoped {
      val retVar = alloc<godot_string>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0._handle.ptr
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(retVar).toKString()
  }
  return ret
}

internal fun _icall_Resource_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Boolean
): Resource {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Resource
  }
  return ret
}

internal fun _icall_Resource(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Resource {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Resource
  }
  return ret
}

internal fun _icall_Resource_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String
): Resource {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.toGDString().value.ptr
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      wrap(retVar.pointed.value!!) as Resource
  }
  return ret
}

internal fun _icall_Unit_Object_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: Long,
  arg2: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Dictionary_PoolStringArray(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: PoolStringArray
): Dictionary {
  val ret = memScoped {
      val retVar = alloc<godot_dictionary>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Dictionary(retVar)
  }
  return ret
}

internal fun _icall_Unit_Long_Boolean_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Boolean,
  arg2: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_PhysicsMaterial(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    PhysicsMaterial {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as PhysicsMaterial
  }
  return ret
}

internal fun _icall_Boolean_Vector2_Boolean_Double_nObject(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2,
  arg1: Boolean,
  arg2: Double,
  arg3: Object?
): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3?.ptr
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_PoolStringArray_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): PoolStringArray {
  val ret = memScoped {
      val retVar = alloc<godot_pool_string_array>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      PoolStringArray(retVar)
  }
  return ret
}

internal fun _icall_PackedScene_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): PackedScene {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as PackedScene
  }
  return ret
}

internal fun _icall_NodePath_Long_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Boolean
): NodePath {
  val ret = memScoped {
      val retVar = alloc<godot_node_path>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      NodePath(retVar)
  }
  return ret
}

internal fun _icall_SceneTreeTimer_Double_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Double,
  arg1: Boolean
): SceneTreeTimer {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as SceneTreeTimer
  }
  return ret
}

internal fun _icall_Unit_Long_String_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: String,
  arg2: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.toGDString().value.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[1]!!).destroy(this)
  }
}

internal fun _icall_Unit_Long_String_String_Variant(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: String,
  arg2: String,
  arg3: Variant
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.toGDString().value.ptr
      args[2] = arg2.toGDString().value.ptr
      args[3] = arg3._handle.ptr
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[1]!!).destroy(this)
      GdString(args[2]!!).destroy(this)
  }
}

internal fun _icall_Unit_Long_Long_Vector2_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long,
  arg2: Vector2,
  arg3: Double
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Script(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Script {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Script
  }
  return ret
}

internal fun _icall_Unit_String_String_Boolean_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: String,
  arg2: Boolean,
  arg3: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.toGDString().value.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
      GdString(args[1]!!).destroy(this)
  }
}

internal fun _icall_HScrollBar(mb: CPointer<godot_method_bind>, inst: COpaquePointer): HScrollBar {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as HScrollBar
  }
  return ret
}

internal fun _icall_Texture_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String
): Texture {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.toGDString().value.ptr
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      wrap(retVar.pointed.value!!) as Texture
  }
  return ret
}

internal fun _icall_Shader(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Shader {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Shader
  }
  return ret
}

internal fun _icall_Boolean_Transform2D_Object_Transform2D(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Transform2D,
  arg1: Object,
  arg2: Transform2D
): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_VariantArray_Transform2D_Object_Transform2D(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Transform2D,
  arg1: Object,
  arg2: Transform2D
): VariantArray {
  val ret = memScoped {
      val retVar = alloc<godot_array>().ptr
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      VariantArray(retVar)
  }
  return ret
}

internal fun _icall_Boolean_Transform2D_Vector2_Object_Transform2D_Vector2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Transform2D,
  arg1: Vector2,
  arg2: Object,
  arg3: Transform2D,
  arg4: Vector2
): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(6)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.ptr
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_VariantArray_Transform2D_Vector2_Object_Transform2D_Vector2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Transform2D,
  arg1: Vector2,
  arg2: Object,
  arg3: Transform2D,
  arg4: Vector2
): VariantArray {
  val ret = memScoped {
      val retVar = alloc<godot_array>().ptr
      val args = allocArray<COpaquePointerVar>(6)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.ptr
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      VariantArray(retVar)
  }
  return ret
}

internal fun _icall_InputEvent(mb: CPointer<godot_method_bind>, inst: COpaquePointer): InputEvent {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as InputEvent
  }
  return ret
}

internal fun _icall_SkinReference_Object(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object
): SkinReference {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.ptr
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as SkinReference
  }
  return ret
}

internal fun _icall_Unit_Long_Transform_Double_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Transform,
  arg2: Double,
  arg3: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Bone2D_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): Bone2D {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Bone2D
  }
  return ret
}

internal fun _icall_Skeleton(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Skeleton {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Skeleton
  }
  return ret
}

internal fun _icall_SpatialGizmo(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    SpatialGizmo {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as SpatialGizmo
  }
  return ret
}

internal fun _icall_World(mb: CPointer<godot_method_bind>, inst: COpaquePointer): World {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as World
  }
  return ret
}

internal fun _icall_Unit_Vector3_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector3,
  arg1: Double
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Vector3_Vector3_Vector3(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector3,
  arg1: Vector3,
  arg2: Vector3
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_String_Object_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Object,
  arg2: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
  }
}

internal fun _icall_Texture_String_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Long
): Texture {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      wrap(retVar.pointed.value!!) as Texture
  }
  return ret
}

internal fun _icall_Unit_String_Long_Object(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Long,
  arg2: Object
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.ptr
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
  }
}

internal fun _icall_VariantArray_PoolByteArray(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: PoolByteArray
): VariantArray {
  val ret = memScoped {
      val retVar = alloc<godot_array>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      VariantArray(retVar)
  }
  return ret
}

internal fun _icall_Unit_Variant_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Variant,
  arg1: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0._handle.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_StreamPeerBuffer(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    StreamPeerBuffer {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as StreamPeerBuffer
  }
  return ret
}

internal fun _icall_Long_Object_Object_Object_nObject(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: Object,
  arg2: Object,
  arg3: Object?
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.ptr
      args[1] = arg1.ptr
      args[2] = arg2.ptr
      args[3] = arg3?.ptr
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Unit_RID_Rect2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Rect2
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_CanvasItem(mb: CPointer<godot_method_bind>, inst: COpaquePointer): CanvasItem {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as CanvasItem
  }
  return ret
}

internal fun _icall_Boolean_Vector2_Rect2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2,
  arg1: Rect2
): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Unit_Double_Double_Double_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Double,
  arg1: Double,
  arg2: Double,
  arg3: Double
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal
    fun _icall_Unit_PoolVector3Array_PoolVector2Array_PoolColorArray_PoolVector2Array_PoolVector3Array_VariantArray(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: PoolVector3Array,
  arg1: PoolVector2Array,
  arg2: PoolColorArray,
  arg3: PoolVector2Array,
  arg4: PoolVector3Array,
  arg5: VariantArray
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(7)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = arg5._handle.ptr
      args[6] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Object_Long_Transform(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: Long,
  arg2: Transform
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_ArrayMesh_nObject_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object?,
  arg1: Long
): ArrayMesh {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0?.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as ArrayMesh
  }
  return ret
}

internal fun _icall_Unit_Object_Long_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: Long,
  arg2: String
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.toGDString().value.ptr
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[2]!!).destroy(this)
  }
}

internal fun _icall_Long_Long_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: String
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.toGDString().value.ptr
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[1]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_StreamPeerTCP(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    StreamPeerTCP {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as StreamPeerTCP
  }
  return ret
}

internal fun _icall_Popup(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Popup {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Popup
  }
  return ret
}

internal fun _icall_Control_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): Control {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Control
  }
  return ret
}

internal fun _icall_Unit_String_nObject(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Object?
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1?.ptr
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
  }
}

internal fun _icall_Unit_String_String_Color_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: String,
  arg2: Color,
  arg3: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.toGDString().value.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
      GdString(args[1]!!).destroy(this)
  }
}

internal fun _icall_Unit_Long_Boolean_Boolean_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Boolean,
  arg2: Boolean,
  arg3: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Color_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String
): Color {
  val ret = memScoped {
      val retVar = alloc<godot_color>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.toGDString().value.ptr
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      Color(retVar)
  }
  return ret
}

internal fun _icall_PoolIntArray_String_Long_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Long,
  arg2: Long,
  arg3: Long
): PoolIntArray {
  val ret = memScoped {
      val retVar = alloc<godot_pool_int_array>().ptr
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      PoolIntArray(retVar)
  }
  return ret
}

internal fun _icall_Unit_RID_Vector2_Color_Boolean_nObject(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Vector2,
  arg2: Color,
  arg3: Boolean,
  arg4: Object?
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(6)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4?.ptr
      args[5] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_Rect2_Boolean_Color_Boolean_nObject(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Rect2,
  arg2: Boolean,
  arg3: Color,
  arg4: Boolean,
  arg5: Object?
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(7)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = arg5?.ptr
      args[6] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_Rect2_Rect2_Color_Boolean_nObject_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Rect2,
  arg2: Rect2,
  arg3: Color,
  arg4: Boolean,
  arg5: Object?,
  arg6: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(8)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = arg5?.ptr
      args[6] = arg6.getRawMemory(this)
      args[7] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_BitMap(mb: CPointer<godot_method_bind>, inst: COpaquePointer): BitMap {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as BitMap
  }
  return ret
}

internal fun _icall_Unit_Object_Long_Long_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: Long,
  arg2: Long,
  arg3: Long,
  arg4: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(6)
      args[0] = arg0.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Font(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Font {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Font
  }
  return ret
}

internal fun _icall_Unit_String_String_Color(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: String,
  arg2: Color
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.toGDString().value.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
      GdString(args[1]!!).destroy(this)
  }
}

internal fun _icall_TileSet(mb: CPointer<godot_method_bind>, inst: COpaquePointer): TileSet {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as TileSet
  }
  return ret
}

internal fun _icall_Vector2_Vector2_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2,
  arg1: Boolean
): Vector2 {
  val ret = memScoped {
      val retVar = alloc<godot_vector2>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Vector2(retVar)
  }
  return ret
}

internal fun _icall_Unit_Long_Long_Long_Boolean_Boolean_Boolean_Vector2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long,
  arg2: Long,
  arg3: Boolean,
  arg4: Boolean,
  arg5: Boolean,
  arg6: Vector2
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(8)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = arg5.getRawMemory(this)
      args[6] = arg6.getRawMemory(this)
      args[7] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Vector2_Long_Boolean_Boolean_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2,
  arg1: Long,
  arg2: Boolean,
  arg3: Boolean,
  arg4: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(6)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Long_Long_Vector2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Vector2
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_OccluderPolygon2D_Long_Vector2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Vector2
): OccluderPolygon2D {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as OccluderPolygon2D
  }
  return ret
}

internal fun _icall_NavigationPolygon_Long_Vector2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Vector2
): NavigationPolygon {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as NavigationPolygon
  }
  return ret
}

internal fun _icall_Unit_Long_Vector2_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Vector2,
  arg2: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Long_Object_Vector2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Object,
  arg2: Vector2
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Long_Object_Transform2D_Boolean_Vector2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Object,
  arg2: Transform2D,
  arg3: Boolean,
  arg4: Vector2
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(6)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_OccluderPolygon2D_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): OccluderPolygon2D {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as OccluderPolygon2D
  }
  return ret
}

internal fun _icall_ShaderMaterial_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): ShaderMaterial {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as ShaderMaterial
  }
  return ret
}

internal fun _icall_NavigationPolygon_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): NavigationPolygon {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as NavigationPolygon
  }
  return ret
}

internal fun _icall_Transform2D_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long
): Transform2D {
  val ret = memScoped {
      val retVar = alloc<godot_transform2d>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Transform2D(retVar)
  }
  return ret
}

internal fun _icall_Unit_Long_Long_Transform2D(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long,
  arg2: Transform2D
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_TreeItem_nObject_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object?,
  arg1: Long
): TreeItem {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0?.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as TreeItem
  }
  return ret
}

internal fun _icall_TreeItem(mb: CPointer<godot_method_bind>, inst: COpaquePointer): TreeItem {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as TreeItem
  }
  return ret
}

internal fun _icall_Rect2_Object_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: Long
): Rect2 {
  val ret = memScoped {
      val retVar = alloc<godot_rect2>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Rect2(retVar)
  }
  return ret
}

internal fun _icall_TreeItem_Vector2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2
): TreeItem {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as TreeItem
  }
  return ret
}

internal fun _icall_TreeItem_Object(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object
): TreeItem {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.ptr
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as TreeItem
  }
  return ret
}

internal fun _icall_Unit_Long_Object_Long_Boolean_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Object,
  arg2: Long,
  arg3: Boolean,
  arg4: String
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(6)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.toGDString().value.ptr
      args[5] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[4]!!).destroy(this)
  }
}

internal fun _icall_Texture_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long
): Texture {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Texture
  }
  return ret
}

internal fun _icall_TreeItem_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Boolean
): TreeItem {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as TreeItem
  }
  return ret
}

internal fun _icall_Dictionary_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): Dictionary {
  val ret = memScoped {
      val retVar = alloc<godot_dictionary>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Dictionary(retVar)
  }
  return ret
}

internal fun _icall_Unit_Long_Color_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Color,
  arg2: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Long_Object_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Object,
  arg2: String
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.ptr
      args[2] = arg2.toGDString().value.ptr
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[2]!!).destroy(this)
  }
}

internal fun _icall_Unit_Long_Double_Double_Double_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Double,
  arg2: Double,
  arg3: Double,
  arg4: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(6)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Boolean_Object_String_Variant_Object_String_Double_Long_Long_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: String,
  arg2: Variant,
  arg3: Object,
  arg4: String,
  arg5: Double,
  arg6: Long,
  arg7: Long,
  arg8: Double
): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(10)
      args[0] = arg0.ptr
      args[1] = arg1.toGDString().value.ptr
      args[2] = arg2._handle.ptr
      args[3] = arg3.ptr
      args[4] = arg4.toGDString().value.ptr
      args[5] = arg5.getRawMemory(this)
      args[6] = arg6.getRawMemory(this)
      args[7] = arg7.getRawMemory(this)
      args[8] = arg8.getRawMemory(this)
      args[9] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[1]!!).destroy(this)
      GdString(args[4]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Boolean_Object_NodePath_Variant_Object_NodePath_Double_Long_Long_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: NodePath,
  arg2: Variant,
  arg3: Object,
  arg4: NodePath,
  arg5: Double,
  arg6: Long,
  arg7: Long,
  arg8: Double
): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(10)
      args[0] = arg0.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2._handle.ptr
      args[3] = arg3.ptr
      args[4] = arg4.getRawMemory(this)
      args[5] = arg5.getRawMemory(this)
      args[6] = arg6.getRawMemory(this)
      args[7] = arg7.getRawMemory(this)
      args[8] = arg8.getRawMemory(this)
      args[9] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Boolean_Object_Double_String_nVariant_nVariant_nVariant_nVariant_nVariant(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: Double,
  arg2: String,
  arg3: Variant?,
  arg4: Variant?,
  arg5: Variant?,
  arg6: Variant?,
  arg7: Variant?
): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(9)
      args[0] = arg0.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.toGDString().value.ptr
      args[3] = arg3?._handle?.ptr
      args[4] = arg4?._handle?.ptr
      args[5] = arg5?._handle?.ptr
      args[6] = arg6?._handle?.ptr
      args[7] = arg7?._handle?.ptr
      args[8] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[2]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Boolean_Object_String_Variant_Variant_Double_Long_Long_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: String,
  arg2: Variant,
  arg3: Variant,
  arg4: Double,
  arg5: Long,
  arg6: Long,
  arg7: Double
): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(9)
      args[0] = arg0.ptr
      args[1] = arg1.toGDString().value.ptr
      args[2] = arg2._handle.ptr
      args[3] = arg3._handle.ptr
      args[4] = arg4.getRawMemory(this)
      args[5] = arg5.getRawMemory(this)
      args[6] = arg6.getRawMemory(this)
      args[7] = arg7.getRawMemory(this)
      args[8] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[1]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Boolean_Object_NodePath_Variant_Variant_Double_Long_Long_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: NodePath,
  arg2: Variant,
  arg3: Variant,
  arg4: Double,
  arg5: Long,
  arg6: Long,
  arg7: Double
): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(9)
      args[0] = arg0.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2._handle.ptr
      args[3] = arg3._handle.ptr
      args[4] = arg4.getRawMemory(this)
      args[5] = arg5.getRawMemory(this)
      args[6] = arg6.getRawMemory(this)
      args[7] = arg7.getRawMemory(this)
      args[8] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Boolean_Object_String_Object_String_Variant_Double_Long_Long_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: String,
  arg2: Object,
  arg3: String,
  arg4: Variant,
  arg5: Double,
  arg6: Long,
  arg7: Long,
  arg8: Double
): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(10)
      args[0] = arg0.ptr
      args[1] = arg1.toGDString().value.ptr
      args[2] = arg2.ptr
      args[3] = arg3.toGDString().value.ptr
      args[4] = arg4._handle.ptr
      args[5] = arg5.getRawMemory(this)
      args[6] = arg6.getRawMemory(this)
      args[7] = arg7.getRawMemory(this)
      args[8] = arg8.getRawMemory(this)
      args[9] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[1]!!).destroy(this)
      GdString(args[3]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Boolean_Object_NodePath_Object_NodePath_Variant_Double_Long_Long_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: NodePath,
  arg2: Object,
  arg3: NodePath,
  arg4: Variant,
  arg5: Double,
  arg6: Long,
  arg7: Long,
  arg8: Double
): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(10)
      args[0] = arg0.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.ptr
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4._handle.ptr
      args[5] = arg5.getRawMemory(this)
      args[6] = arg6.getRawMemory(this)
      args[7] = arg7.getRawMemory(this)
      args[8] = arg8.getRawMemory(this)
      args[9] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_PacketPeerUDP(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    PacketPeerUDP {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as PacketPeerUDP
  }
  return ret
}

internal fun _icall_Long_Long_Long_String_String_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long,
  arg2: String,
  arg3: String,
  arg4: Long
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(6)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.toGDString().value.ptr
      args[3] = arg3.toGDString().value.ptr
      args[4] = arg4.getRawMemory(this)
      args[5] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[2]!!).destroy(this)
      GdString(args[3]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Long_Long_Long_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long,
  arg2: String
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.toGDString().value.ptr
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[2]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_UPNPDevice_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): UPNPDevice {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as UPNPDevice
  }
  return ret
}

internal fun _icall_UPNPDevice(mb: CPointer<godot_method_bind>, inst: COpaquePointer): UPNPDevice {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as UPNPDevice
  }
  return ret
}

internal fun _icall_Unit_Object_String_Variant(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: String,
  arg2: Variant
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.ptr
      args[1] = arg1.toGDString().value.ptr
      args[2] = arg2._handle.ptr
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[1]!!).destroy(this)
  }
}

internal fun _icall_VideoStream(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    VideoStream {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as VideoStream
  }
  return ret
}

internal fun _icall_Camera(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Camera {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Camera
  }
  return ret
}

internal fun _icall_ViewportTexture(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    ViewportTexture {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as ViewportTexture
  }
  return ret
}

internal fun _icall_Unit_Boolean_Vector2_Vector2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Boolean,
  arg1: Vector2,
  arg2: Vector2
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_String_Long_Object_Vector2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Long,
  arg2: Object,
  arg3: Vector2
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.ptr
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
  }
}

internal fun _icall_Unit_String_nVariant_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Variant?,
  arg2: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1?._handle?.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
  }
}

internal fun _icall_VisualScriptNode_String_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Long
): VisualScriptNode {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      wrap(retVar.pointed.value!!) as VisualScriptNode
  }
  return ret
}

internal fun _icall_Vector2_String_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Long
): Vector2 {
  val ret = memScoped {
      val retVar = alloc<godot_vector2>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      Vector2(retVar)
  }
  return ret
}

internal fun _icall_Dictionary_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String
): Dictionary {
  val ret = memScoped {
      val retVar = alloc<godot_dictionary>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.toGDString().value.ptr
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      Dictionary(retVar)
  }
  return ret
}

internal fun _icall_Boolean_String_Long_Long_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Long,
  arg2: Long,
  arg3: Long,
  arg4: Long
): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(6)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[0]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Boolean_String_Long_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Long,
  arg2: Long,
  arg3: Long
): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[0]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Unit_String_Long_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Long,
  arg2: Long,
  arg3: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
  }
}

internal fun _icall_Unit_String_Long_Vector2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Long,
  arg2: Vector2
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
  }
}

internal fun _icall_Unit_String_Dictionary(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Dictionary
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
  }
}

internal fun _icall_Unit_Object_String_VariantArray(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: String,
  arg2: VariantArray
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.ptr
      args[1] = arg1.toGDString().value.ptr
      args[2] = arg2._handle.ptr
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[1]!!).destroy(this)
  }
}

internal fun _icall_Variant_nVariantArray(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: VariantArray?
): Variant {
  val ret = memScoped {
      val retVar = alloc<godot.gdnative.godot_variant>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0?._handle?.ptr
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Variant(retVar)
  }
  return ret
}

internal fun _icall_VisualScript(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    VisualScript {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as VisualScript
  }
  return ret
}

internal fun _icall_Unit_RID_RID_RID_RID(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: RID,
  arg2: RID,
  arg3: RID
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_Double_Vector2_Double_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Double,
  arg2: Vector2,
  arg3: Double,
  arg4: Double
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(6)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_Double_Double_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Double,
  arg2: Double,
  arg3: Double
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_Vector2_Double_Color(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Vector2,
  arg2: Double,
  arg3: Color
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_Vector2_Vector2_Color_Double_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Vector2,
  arg2: Vector2,
  arg3: Color,
  arg4: Double,
  arg5: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(7)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = arg5.getRawMemory(this)
      args[6] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_RID_Transform2D_Color_RID_RID(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: RID,
  arg2: Transform2D,
  arg3: Color,
  arg4: RID,
  arg5: RID
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(7)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = arg5.getRawMemory(this)
      args[6] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_Rect2_Rect2_RID_Vector2_Vector2_Long_Long_Boolean_Color_RID(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Rect2,
  arg2: Rect2,
  arg3: RID,
  arg4: Vector2,
  arg5: Vector2,
  arg6: Long,
  arg7: Long,
  arg8: Boolean,
  arg9: Color,
  arg10: RID
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(12)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = arg5.getRawMemory(this)
      args[6] = arg6.getRawMemory(this)
      args[7] = arg7.getRawMemory(this)
      args[8] = arg8.getRawMemory(this)
      args[9] = arg9.getRawMemory(this)
      args[10] = arg10.getRawMemory(this)
      args[11] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_PoolVector2Array_PoolColorArray_PoolVector2Array_RID_RID_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: PoolVector2Array,
  arg2: PoolColorArray,
  arg3: PoolVector2Array,
  arg4: RID,
  arg5: RID,
  arg6: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(8)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = arg5.getRawMemory(this)
      args[6] = arg6.getRawMemory(this)
      args[7] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_PoolVector2Array_PoolColorArray_Double_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: PoolVector2Array,
  arg2: PoolColorArray,
  arg3: Double,
  arg4: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(6)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_PoolVector2Array_PoolColorArray_PoolVector2Array_RID_Double_RID(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: PoolVector2Array,
  arg2: PoolColorArray,
  arg3: PoolVector2Array,
  arg4: RID,
  arg5: Double,
  arg6: RID
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(8)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = arg5.getRawMemory(this)
      args[6] = arg6.getRawMemory(this)
      args[7] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_Rect2_Color(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Rect2,
  arg2: Color
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_Rect2_RID_Boolean_Color_Boolean_RID(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Rect2,
  arg2: RID,
  arg3: Boolean,
  arg4: Color,
  arg5: Boolean,
  arg6: RID
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(8)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = arg5.getRawMemory(this)
      args[6] = arg6.getRawMemory(this)
      args[7] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_Rect2_RID_Rect2_Color_Boolean_RID_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Rect2,
  arg2: RID,
  arg3: Rect2,
  arg4: Color,
  arg5: Boolean,
  arg6: RID,
  arg7: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(9)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = arg5.getRawMemory(this)
      args[6] = arg6.getRawMemory(this)
      args[7] = arg7.getRawMemory(this)
      args[8] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal
    fun _icall_Unit_RID_PoolIntArray_PoolVector2Array_PoolColorArray_PoolVector2Array_PoolIntArray_PoolRealArray_RID_Long_RID_Boolean_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: PoolIntArray,
  arg2: PoolVector2Array,
  arg3: PoolColorArray,
  arg4: PoolVector2Array,
  arg5: PoolIntArray,
  arg6: PoolRealArray,
  arg7: RID,
  arg8: Long,
  arg9: RID,
  arg10: Boolean,
  arg11: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(13)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = arg5.getRawMemory(this)
      args[6] = arg6.getRawMemory(this)
      args[7] = arg7.getRawMemory(this)
      args[8] = arg8.getRawMemory(this)
      args[9] = arg9.getRawMemory(this)
      args[10] = arg10.getRawMemory(this)
      args[11] = arg11.getRawMemory(this)
      args[12] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_Boolean_Rect2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Boolean,
  arg2: Rect2
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_Color(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Color
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Long,
  arg2: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_PoolVector2Array_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: PoolVector2Array,
  arg2: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_PoolVector2Array(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: PoolVector2Array
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_RID_Vector2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: RID,
  arg2: Vector2
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_Boolean_Double_Double_Double_RID(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Boolean,
  arg2: Double,
  arg3: Double,
  arg4: Double,
  arg5: RID
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(7)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = arg5.getRawMemory(this)
      args[6] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_Color_Double_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Color,
  arg2: Double,
  arg3: Double
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_Boolean_Double_Double_Double_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Boolean,
  arg2: Double,
  arg3: Double,
  arg4: Double,
  arg5: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(7)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = arg5.getRawMemory(this)
      args[6] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_Boolean_Color_Color_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Boolean,
  arg2: Color,
  arg3: Color,
  arg4: Double
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(6)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_Boolean_Double_Double_Double_Boolean_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Boolean,
  arg2: Double,
  arg3: Double,
  arg4: Double,
  arg5: Boolean,
  arg6: Double
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(8)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = arg5.getRawMemory(this)
      args[6] = arg6.getRawMemory(this)
      args[7] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_Boolean_Double_Double_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Boolean,
  arg2: Double,
  arg3: Double,
  arg4: Double
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(6)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_Boolean_Long_Double_Double_Double_Long_Double_Double_Double_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Boolean,
  arg2: Long,
  arg3: Double,
  arg4: Double,
  arg5: Double,
  arg6: Long,
  arg7: Double,
  arg8: Double,
  arg9: Double,
  arg10: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(12)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = arg5.getRawMemory(this)
      args[6] = arg6.getRawMemory(this)
      args[7] = arg7.getRawMemory(this)
      args[8] = arg8.getRawMemory(this)
      args[9] = arg9.getRawMemory(this)
      args[10] = arg10.getRawMemory(this)
      args[11] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_Basis(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Basis
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal
    fun _icall_Unit_RID_Boolean_Double_Double_Double_Double_Double_Double_Double_Color_Long_Long_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Boolean,
  arg2: Double,
  arg3: Double,
  arg4: Double,
  arg5: Double,
  arg6: Double,
  arg7: Double,
  arg8: Double,
  arg9: Color,
  arg10: Long,
  arg11: Long,
  arg12: Double
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(14)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = arg5.getRawMemory(this)
      args[6] = arg6.getRawMemory(this)
      args[7] = arg7.getRawMemory(this)
      args[8] = arg8.getRawMemory(this)
      args[9] = arg9.getRawMemory(this)
      args[10] = arg10.getRawMemory(this)
      args[11] = arg11.getRawMemory(this)
      args[12] = arg12.getRawMemory(this)
      args[13] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_Boolean_Long_Double_Double_Double_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Boolean,
  arg2: Long,
  arg3: Double,
  arg4: Double,
  arg5: Double,
  arg6: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(8)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = arg5.getRawMemory(this)
      args[6] = arg6.getRawMemory(this)
      args[7] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_Long_Double_Double_Boolean_Double_Double_Double_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Long,
  arg2: Double,
  arg3: Double,
  arg4: Boolean,
  arg5: Double,
  arg6: Double,
  arg7: Double,
  arg8: Double
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(10)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = arg5.getRawMemory(this)
      args[6] = arg6.getRawMemory(this)
      args[7] = arg7.getRawMemory(this)
      args[8] = arg8.getRawMemory(this)
      args[9] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_AABB_RID(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID
): AABB {
  val ret = memScoped {
      val retVar = alloc<godot_aabb>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      AABB(retVar)
  }
  return ret
}

internal fun _icall_PoolIntArray_RID(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID
): PoolIntArray {
  val ret = memScoped {
      val retVar = alloc<godot_pool_int_array>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      PoolIntArray(retVar)
  }
  return ret
}

internal fun _icall_Unit_RID_AABB(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: AABB
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_PoolIntArray(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: PoolIntArray
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_Plane(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Plane
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_RID_RID_RID(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: RID
): RID {
  val ret = memScoped {
      val retVar = alloc<godot_rid>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      RID(retVar)
  }
  return ret
}

internal fun _icall_Unit_RID_Double_Double_Double_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Double,
  arg2: Double,
  arg3: Double,
  arg4: Double
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(6)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_RID_RID(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: RID,
  arg2: RID
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_VariantArray_AABB_RID(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: AABB,
  arg1: RID
): VariantArray {
  val ret = memScoped {
      val retVar = alloc<godot_array>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      VariantArray(retVar)
  }
  return ret
}

internal fun _icall_VariantArray_VariantArray_RID(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: VariantArray,
  arg1: RID
): VariantArray {
  val ret = memScoped {
      val retVar = alloc<godot_array>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0._handle.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      VariantArray(retVar)
  }
  return ret
}

internal fun _icall_VariantArray_Vector3_Vector3_RID(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector3,
  arg1: Vector3,
  arg2: RID
): VariantArray {
  val ret = memScoped {
      val retVar = alloc<godot_array>().ptr
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      VariantArray(retVar)
  }
  return ret
}

internal fun _icall_PoolByteArray_RID(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID
): PoolByteArray {
  val ret = memScoped {
      val retVar = alloc<godot_pool_byte_array>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      PoolByteArray(retVar)
  }
  return ret
}

internal fun _icall_Unit_RID_PoolByteArray(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: PoolByteArray
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_RID_Long_Long_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long,
  arg2: Double
): RID {
  val ret = memScoped {
      val retVar = alloc<godot_rid>().ptr
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      RID(retVar)
  }
  return ret
}

internal fun _icall_Variant_RID_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: String
): Variant {
  val ret = memScoped {
      val retVar = alloc<godot.gdnative.godot_variant>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.toGDString().value.ptr
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[1]!!).destroy(this)
      Variant(retVar)
  }
  return ret
}

internal fun _icall_Unit_RID_String_Variant(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: String,
  arg2: Variant
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.toGDString().value.ptr
      args[2] = arg2._handle.ptr
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[1]!!).destroy(this)
  }
}

internal fun _icall_Unit_RID_Long_VariantArray_VariantArray_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Long,
  arg2: VariantArray,
  arg3: VariantArray,
  arg4: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(6)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2._handle.ptr
      args[3] = arg3._handle.ptr
      args[4] = arg4.getRawMemory(this)
      args[5] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_AABB_RID_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Long
): AABB {
  val ret = memScoped {
      val retVar = alloc<godot_aabb>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      AABB(retVar)
  }
  return ret
}

internal fun _icall_PoolByteArray_RID_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Long
): PoolByteArray {
  val ret = memScoped {
      val retVar = alloc<godot_pool_byte_array>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      PoolByteArray(retVar)
  }
  return ret
}

internal fun _icall_Long_RID_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Long
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_VariantArray_RID_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Long
): VariantArray {
  val ret = memScoped {
      val retVar = alloc<godot_array>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      VariantArray(retVar)
  }
  return ret
}

internal fun _icall_Unit_RID_Long_Long_PoolByteArray(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Long,
  arg2: Long,
  arg3: PoolByteArray
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_Long_Long_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Long,
  arg2: Long,
  arg3: Long,
  arg4: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(6)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Color_RID_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Long
): Color {
  val ret = memScoped {
      val retVar = alloc<godot_color>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Color(retVar)
  }
  return ret
}

internal fun _icall_Unit_RID_Long_Color(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Long,
  arg2: Color
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_PoolRealArray(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: PoolRealArray
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Object_Color_Boolean_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: Color,
  arg2: Boolean,
  arg3: Boolean
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_String_RID(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID
): String {
  val ret = memScoped {
      val retVar = alloc<godot_string>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(retVar).toKString()
  }
  return ret
}

internal fun _icall_RID_RID_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: String
): RID {
  val ret = memScoped {
      val retVar = alloc<godot_rid>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.toGDString().value.ptr
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[1]!!).destroy(this)
      RID(retVar)
  }
  return ret
}

internal fun _icall_VariantArray_RID(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID
): VariantArray {
  val ret = memScoped {
      val retVar = alloc<godot_array>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      VariantArray(retVar)
  }
  return ret
}

internal fun _icall_Unit_RID_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: String
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.toGDString().value.ptr
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[1]!!).destroy(this)
  }
}

internal fun _icall_Unit_RID_String_RID(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: String,
  arg2: RID
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.toGDString().value.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[1]!!).destroy(this)
  }
}

internal fun _icall_Unit_RID_RID_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: RID,
  arg2: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_Long_Long_Long_Long_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Long,
  arg2: Long,
  arg3: Long,
  arg4: Long,
  arg5: Long,
  arg6: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(8)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = arg5.getRawMemory(this)
      args[6] = arg6.getRawMemory(this)
      args[7] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_RID_Object_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: Long
): RID {
  val ret = memScoped {
      val retVar = alloc<godot_rid>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      RID(retVar)
  }
  return ret
}

internal fun _icall_Image_RID_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Long
): Image {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as Image
  }
  return ret
}

internal fun _icall_Unit_RID_Object_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Object,
  arg2: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_Object_Long_Long_Long_Long_Long_Long_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Object,
  arg2: Long,
  arg3: Long,
  arg4: Long,
  arg5: Long,
  arg6: Long,
  arg7: Long,
  arg8: Long,
  arg9: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(11)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = arg5.getRawMemory(this)
      args[6] = arg6.getRawMemory(this)
      args[7] = arg7.getRawMemory(this)
      args[8] = arg8.getRawMemory(this)
      args[9] = arg9.getRawMemory(this)
      args[10] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_Long_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Long,
  arg2: Long,
  arg3: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_Rect2_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: Rect2,
  arg2: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_RID_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: RID,
  arg2: Long,
  arg3: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_RID_RID_Transform2D(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: RID,
  arg1: RID,
  arg2: Transform2D
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Unit_Long_Object_Vector2_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Object,
  arg2: Vector2,
  arg3: Long
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
  }
}

internal fun _icall_Boolean_Long_Long_Long_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long,
  arg2: Long,
  arg3: Long,
  arg4: Long
): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(6)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Long_Long_Long_Long_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long,
  arg2: Long,
  arg3: Long,
  arg4: Long
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(6)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_VisualShaderNode_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Long
): VisualShaderNode {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as VisualShaderNode
  }
  return ret
}

internal fun _icall_CubeMap(mb: CPointer<godot_method_bind>, inst: COpaquePointer): CubeMap {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as CubeMap
  }
  return ret
}

internal fun _icall_Long_Object_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: Long,
  arg2: Long
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Long_Long_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: Boolean
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Long_String_Long_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Long,
  arg2: String
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.toGDString().value.ptr
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[0]!!).destroy(this)
      GdString(args[2]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_WebRTCDataChannel_String_Dictionary(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Dictionary
): WebRTCDataChannel {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      wrap(retVar.pointed.value!!) as WebRTCDataChannel
  }
  return ret
}

internal fun _icall_Long_Dictionary(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Dictionary
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_X509Certificate(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    X509Certificate {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as X509Certificate
  }
  return ret
}

internal fun _icall_Long_String_PoolStringArray_Boolean_PoolStringArray(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: PoolStringArray,
  arg2: Boolean,
  arg3: PoolStringArray
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[0]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_WebSocketPeer_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long
): WebSocketPeer {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as WebSocketPeer
  }
  return ret
}

internal fun _icall_CryptoKey(mb: CPointer<godot_method_bind>, inst: COpaquePointer): CryptoKey {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as CryptoKey
  }
  return ret
}

internal fun _icall_Long_Long_PoolStringArray_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Long,
  arg1: PoolStringArray,
  arg2: Boolean
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_TextureButton(mb: CPointer<godot_method_bind>, inst: COpaquePointer):
    TextureButton {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as TextureButton
  }
  return ret
}

internal fun _icall_PoolStringArray_String_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Boolean
): PoolStringArray {
  val ret = memScoped {
      val retVar = alloc<godot_pool_string_array>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      PoolStringArray(retVar)
  }
  return ret
}

internal fun _icall_VariantArray_String_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Boolean
): VariantArray {
  val ret = memScoped {
      val retVar = alloc<godot_array>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      VariantArray(retVar)
  }
  return ret
}

internal fun _icall_Variant_Object_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: String
): Variant {
  val ret = memScoped {
      val retVar = alloc<godot.gdnative.godot_variant>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.ptr
      args[1] = arg1.toGDString().value.ptr
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[1]!!).destroy(this)
      Variant(retVar)
  }
  return ret
}

internal fun _icall_Dictionary_String_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: String
): Dictionary {
  val ret = memScoped {
      val retVar = alloc<godot_dictionary>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.toGDString().value.ptr
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      GdString(args[1]!!).destroy(this)
      Dictionary(retVar)
  }
  return ret
}

internal fun _icall_Boolean_String_String_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: String,
  arg2: Boolean
): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.toGDString().value.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[0]!!).destroy(this)
      GdString(args[1]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Long_Object_String_Variant(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: String,
  arg2: Variant
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.ptr
      args[1] = arg1.toGDString().value.ptr
      args[2] = arg2._handle.ptr
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[1]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Long_Boolean_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Boolean,
  arg1: Boolean
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_MainLoop(mb: CPointer<godot_method_bind>, inst: COpaquePointer): MainLoop {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(1)
      args[0] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      wrap(retVar.pointed.value!!) as MainLoop
  }
  return ret
}

internal fun _icall_Object_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String
): Object {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.toGDString().value.ptr
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      wrap(retVar.pointed.value!!)
  }
  return ret
}

internal fun _icall_Long_String_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Long,
  arg2: Long
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[0]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Long_String_Long_PoolByteArray(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Long,
  arg2: PoolByteArray
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[0]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Unit_PoolStringArray_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: PoolStringArray,
  arg1: String
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.toGDString().value.ptr
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[1]!!).destroy(this)
  }
}

internal fun _icall_VariantArray_Vector3(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector3
): VariantArray {
  val ret = memScoped {
      val retVar = alloc<godot_array>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      VariantArray(retVar)
  }
  return ret
}

internal fun _icall_VariantArray_Double_Double_Long_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Double,
  arg1: Double,
  arg2: Long,
  arg3: Long,
  arg4: Long
): VariantArray {
  val ret = memScoped {
      val retVar = alloc<godot_array>().ptr
      val args = allocArray<COpaquePointerVar>(6)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      VariantArray(retVar)
  }
  return ret
}

internal fun _icall_VariantArray_Double_Double_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Double,
  arg1: Double,
  arg2: Long,
  arg3: Long
): VariantArray {
  val ret = memScoped {
      val retVar = alloc<godot_array>().ptr
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      VariantArray(retVar)
  }
  return ret
}

internal fun _icall_PoolVector3Array_PoolVector3Array_Plane(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: PoolVector3Array,
  arg1: Plane
): PoolVector3Array {
  val ret = memScoped {
      val retVar = alloc<godot_pool_vector3_array>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      PoolVector3Array(retVar)
  }
  return ret
}

internal fun _icall_VariantArray_PoolVector2Array_PoolVector2Array(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: PoolVector2Array,
  arg1: PoolVector2Array
): VariantArray {
  val ret = memScoped {
      val retVar = alloc<godot_array>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      VariantArray(retVar)
  }
  return ret
}

internal fun _icall_PoolVector2Array_PoolVector2Array(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: PoolVector2Array
): PoolVector2Array {
  val ret = memScoped {
      val retVar = alloc<godot_pool_vector2_array>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      PoolVector2Array(retVar)
  }
  return ret
}

internal fun _icall_Vector3_Vector3_Vector3_Vector3(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector3,
  arg1: Vector3,
  arg2: Vector3
): Vector3 {
  val ret = memScoped {
      val retVar = alloc<godot_vector3>().ptr
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Vector3(retVar)
  }
  return ret
}

internal fun _icall_Vector2_Vector2_Vector2_Vector2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2,
  arg1: Vector2,
  arg2: Vector2
): Vector2 {
  val ret = memScoped {
      val retVar = alloc<godot_vector2>().ptr
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Vector2(retVar)
  }
  return ret
}

internal fun _icall_PoolVector3Array_Vector3_Vector3_Vector3_Vector3(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector3,
  arg1: Vector3,
  arg2: Vector3,
  arg3: Vector3
): PoolVector3Array {
  val ret = memScoped {
      val retVar = alloc<godot_pool_vector3_array>().ptr
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      PoolVector3Array(retVar)
  }
  return ret
}

internal fun _icall_PoolVector2Array_Vector2_Vector2_Vector2_Vector2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2,
  arg1: Vector2,
  arg2: Vector2,
  arg3: Vector2
): PoolVector2Array {
  val ret = memScoped {
      val retVar = alloc<godot_pool_vector2_array>().ptr
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      PoolVector2Array(retVar)
  }
  return ret
}

internal fun _icall_Long_Vector3(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector3
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Boolean_Vector2_Vector2_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2,
  arg1: Vector2,
  arg2: Double
): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Boolean_Vector2_PoolVector2Array(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2,
  arg1: PoolVector2Array
): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Variant_Vector2_Vector2_Vector2_Vector2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2,
  arg1: Vector2,
  arg2: Vector2,
  arg3: Vector2
): Variant {
  val ret = memScoped {
      val retVar = alloc<godot.gdnative.godot_variant>().ptr
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Variant(retVar)
  }
  return ret
}

internal fun _icall_Dictionary_PoolVector2Array(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: PoolVector2Array
): Dictionary {
  val ret = memScoped {
      val retVar = alloc<godot_dictionary>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Dictionary(retVar)
  }
  return ret
}

internal fun _icall_VariantArray_PoolVector2Array_Double_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: PoolVector2Array,
  arg1: Double,
  arg2: Long
): VariantArray {
  val ret = memScoped {
      val retVar = alloc<godot_array>().ptr
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      VariantArray(retVar)
  }
  return ret
}

internal fun _icall_VariantArray_PoolVector2Array_Double_Long_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: PoolVector2Array,
  arg1: Double,
  arg2: Long,
  arg3: Long
): VariantArray {
  val ret = memScoped {
      val retVar = alloc<godot_array>().ptr
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      VariantArray(retVar)
  }
  return ret
}

internal fun _icall_Boolean_Vector2_Vector2_Vector2_Vector2(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2,
  arg1: Vector2,
  arg2: Vector2,
  arg3: Vector2
): Boolean {
  var ret: Boolean = false
  memScoped {
      val retVar = alloc<BooleanVar>()
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Variant_Vector3_Vector3_Vector3_Vector3_Vector3(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector3,
  arg1: Vector3,
  arg2: Vector3,
  arg3: Vector3,
  arg4: Vector3
): Variant {
  val ret = memScoped {
      val retVar = alloc<godot.gdnative.godot_variant>().ptr
      val args = allocArray<COpaquePointerVar>(6)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = arg4.getRawMemory(this)
      args[5] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      Variant(retVar)
  }
  return ret
}

internal fun _icall_Double_Vector2_Vector2_Vector2_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector2,
  arg1: Vector2,
  arg2: Vector2,
  arg3: Double
): Double {
  var ret: Double = 0.0
  memScoped {
      val retVar = alloc<DoubleVar>()
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_PoolVector3Array_Vector3_Vector3_VariantArray(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector3,
  arg1: Vector3,
  arg2: VariantArray
): PoolVector3Array {
  val ret = memScoped {
      val retVar = alloc<godot_pool_vector3_array>().ptr
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2._handle.ptr
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      PoolVector3Array(retVar)
  }
  return ret
}

internal fun _icall_PoolVector3Array_Vector3_Vector3_Double_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector3,
  arg1: Vector3,
  arg2: Double,
  arg3: Double
): PoolVector3Array {
  val ret = memScoped {
      val retVar = alloc<godot_pool_vector3_array>().ptr
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      PoolVector3Array(retVar)
  }
  return ret
}

internal fun _icall_PoolVector3Array_Vector3_Vector3_Vector3_Double(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Vector3,
  arg1: Vector3,
  arg2: Vector3,
  arg3: Double
): PoolVector3Array {
  val ret = memScoped {
      val retVar = alloc<godot_pool_vector3_array>().ptr
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.getRawMemory(this)
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      PoolVector3Array(retVar)
  }
  return ret
}

internal fun _icall_PoolIntArray_PoolVector2Array(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: PoolVector2Array
): PoolIntArray {
  val ret = memScoped {
      val retVar = alloc<godot_pool_int_array>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      PoolIntArray(retVar)
  }
  return ret
}

internal fun _icall_JSONParseResult_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String
): JSONParseResult {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.toGDString().value.ptr
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      wrap(retVar.pointed.value!!) as JSONParseResult
  }
  return ret
}

internal fun _icall_String_Variant_String_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Variant,
  arg1: String,
  arg2: Boolean
): String {
  val ret = memScoped {
      val retVar = alloc<godot_string>().ptr
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0._handle.ptr
      args[1] = arg1.toGDString().value.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[1]!!).destroy(this)
      GdString(retVar).toKString()
  }
  return ret
}

internal fun _icall_PoolByteArray_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String
): PoolByteArray {
  val ret = memScoped {
      val retVar = alloc<godot_pool_byte_array>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.toGDString().value.ptr
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      PoolByteArray(retVar)
  }
  return ret
}

internal fun _icall_String_PoolByteArray(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: PoolByteArray
): String {
  val ret = memScoped {
      val retVar = alloc<godot_string>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.getRawMemory(this)
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(retVar).toKString()
  }
  return ret
}

internal fun _icall_String_Variant_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Variant,
  arg1: Boolean
): String {
  val ret = memScoped {
      val retVar = alloc<godot_string>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0._handle.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(retVar).toKString()
  }
  return ret
}

internal fun _icall_Long_String_PoolStringArray_Boolean_VariantArray_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: PoolStringArray,
  arg2: Boolean,
  arg3: VariantArray,
  arg4: Boolean
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(6)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.getRawMemory(this)
      args[3] = arg3._handle.ptr
      args[4] = arg4.getRawMemory(this)
      args[5] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[0]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Unit_String_String_Variant_Variant(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: String,
  arg2: Variant,
  arg3: Variant
) {
  memScoped {
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.toGDString().value.ptr
      args[2] = arg2._handle.ptr
      args[3] = arg3._handle.ptr
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, null)
      GdString(args[0]!!).destroy(this)
      GdString(args[1]!!).destroy(this)
  }
}

internal fun _icall_Long_String_Double_String_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Double,
  arg2: String,
  arg3: String
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.getRawMemory(this)
      args[2] = arg2.toGDString().value.ptr
      args[3] = arg3.toGDString().value.ptr
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[0]!!).destroy(this)
      GdString(args[2]!!).destroy(this)
      GdString(args[3]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Resource_String_String_Boolean(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: String,
  arg2: Boolean
): Resource {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.toGDString().value.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      GdString(args[1]!!).destroy(this)
      wrap(retVar.pointed.value!!) as Resource
  }
  return ret
}

internal fun _icall_ResourceInteractiveLoader_String_String(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: String
): ResourceInteractiveLoader {
  val ret = memScoped {
      val retVar = alloc<COpaquePointerVar>().ptr
      val args = allocArray<COpaquePointerVar>(3)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.toGDString().value.ptr
      args[2] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      GdString(args[0]!!).destroy(this)
      GdString(args[1]!!).destroy(this)
      wrap(retVar.pointed.value!!) as ResourceInteractiveLoader
  }
  return ret
}

internal fun _icall_PoolStringArray_Object(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object
): PoolStringArray {
  val ret = memScoped {
      val retVar = alloc<godot_pool_string_array>().ptr
      val args = allocArray<COpaquePointerVar>(2)
      args[0] = arg0.ptr
      args[1] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar)
      PoolStringArray(retVar)
  }
  return ret
}

internal fun _icall_Long_String_Object_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: String,
  arg1: Object,
  arg2: Long
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(4)
      args[0] = arg0.toGDString().value.ptr
      args[1] = arg1.ptr
      args[2] = arg2.getRawMemory(this)
      args[3] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[0]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}

internal fun _icall_Long_Object_String_nVariant_Long(
  mb: CPointer<godot_method_bind>,
  inst: COpaquePointer,
  arg0: Object,
  arg1: String,
  arg2: Variant?,
  arg3: Long
): Long {
  var ret: Long = 0
  memScoped {
      val retVar = alloc<LongVar>()
      val args = allocArray<COpaquePointerVar>(5)
      args[0] = arg0.ptr
      args[1] = arg1.toGDString().value.ptr
      args[2] = arg2?._handle?.ptr
      args[3] = arg3.getRawMemory(this)
      args[4] = null
      Godot.gdnative.godot_method_bind_ptrcall!!.invoke(mb, inst, args, retVar.ptr)
      GdString(args[1]!!).destroy(this)
      ret = retVar.value
  }
  return ret
}
