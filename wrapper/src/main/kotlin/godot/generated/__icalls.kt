@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PackageDirectoryMismatch", "RedundantExplicitType")
package godot.icalls

import godot.gdnative.*
import godot.core.*
import godot.*
import kotlinx.cinterop.*


internal fun _icall_varargs(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arguments: Array<*>): Variant {
    memScoped {
        val args = allocArray<CPointerVar<godot_variant>>(arguments.size)
        for ((i,arg) in arguments.withIndex())
            args[i] = Variant.from(arg).nativeValue.ptr
        val result = godot_method_bind_call(mb, inst, args, arguments.size, null)
        for (i in arguments.indices)
            godot_variant_destroy(args[i])
        return Variant(result)
    }
}

internal fun _icall_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Unit_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Boolean {
    var ret: Boolean = false
    memScoped {
        val retVar = alloc<BooleanVar>()
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Unit_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer): String {
    lateinit var ret: String
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = String(retVar)
    }
    return ret
}

internal fun _icall_Unit_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Node(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Node {
    lateinit var ret: Node
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Node(retVar)
    }
    return ret
}

internal fun _icall_Unit_Object(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_MultiplayerAPI(mb: CPointer<godot_method_bind>, inst: COpaquePointer): MultiplayerAPI {
    lateinit var ret: MultiplayerAPI
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = MultiplayerAPI(retVar)
    }
    return ret
}

internal fun _icall_Unit_Object_Object_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: Object, arg2: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Object_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_GDArray(mb: CPointer<godot_method_bind>, inst: COpaquePointer): GDArray {
    lateinit var ret: GDArray
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = GDArray(retVar)
    }
    return ret
}

internal fun _icall_Node_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): Node {
    lateinit var ret: Node
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Node(retVar)
    }
    return ret
}

internal fun _icall_Boolean_NodePath(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: NodePath): Boolean {
    var ret: Boolean = false
    memScoped {
        val retVar = alloc<BooleanVar>()
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Node_NodePath(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: NodePath): Node {
    lateinit var ret: Node
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Node(retVar)
    }
    return ret
}

internal fun _icall_Node_String_Boolean_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Boolean, arg2: Boolean): Node {
    lateinit var ret: Node
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Node(retVar)
    }
    return ret
}

internal fun _icall_GDArray_NodePath(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: NodePath): GDArray {
    lateinit var ret: GDArray
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = GDArray(retVar)
    }
    return ret
}

internal fun _icall_Boolean_Object(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object): Boolean {
    var ret: Boolean = false
    memScoped {
        val retVar = alloc<BooleanVar>()
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_NodePath(mb: CPointer<godot_method_bind>, inst: COpaquePointer): NodePath {
    lateinit var ret: NodePath
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = NodePath(retVar)
    }
    return ret
}

internal fun _icall_NodePath_Object(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object): NodePath {
    lateinit var ret: NodePath
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = NodePath(retVar)
    }
    return ret
}

internal fun _icall_Unit_String_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Boolean_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String): Boolean {
    var ret: Boolean = false
    memScoped {
        val retVar = alloc<BooleanVar>()
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Unit_Object_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: Long) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit(mb: CPointer<godot_method_bind>, inst: COpaquePointer) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_String_GDArray_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: GDArray, arg2: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Double {
    var ret: Double = 0.0
    memScoped {
        val retVar = alloc<DoubleVar>()
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_SceneTree(mb: CPointer<godot_method_bind>, inst: COpaquePointer): SceneTree {
    lateinit var ret: SceneTree
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = SceneTree(retVar)
    }
    return ret
}

internal fun _icall_Viewport(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Viewport {
    lateinit var ret: Viewport
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Viewport(retVar)
    }
    return ret
}

internal fun _icall_Unit_Long_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_String_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Long) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_String_Variant(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Variant) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Long_String_Variant(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: String, arg2: Variant) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_PoolVector2Array(mb: CPointer<godot_method_bind>, inst: COpaquePointer): PoolVector2Array {
    lateinit var ret: PoolVector2Array
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = PoolVector2Array(retVar)
    }
    return ret
}

internal fun _icall_Unit_PoolVector2Array(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: PoolVector2Array) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Double) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Vector2_Vector2_Vector2_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector2, arg1: Vector2, arg2: Vector2, arg3: Long) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Long_Vector2(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Vector2) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Vector2_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): Vector2 {
    lateinit var ret: Vector2
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Vector2(retVar)
    }
    return ret
}

internal fun _icall_Vector2_Long_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Double): Vector2 {
    lateinit var ret: Vector2
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Vector2(retVar)
    }
    return ret
}

internal fun _icall_Vector2_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Double): Vector2 {
    lateinit var ret: Vector2
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Vector2(retVar)
    }
    return ret
}

internal fun _icall_Vector2_Double_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Double, arg1: Boolean): Vector2 {
    lateinit var ret: Vector2
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Vector2(retVar)
    }
    return ret
}

internal fun _icall_Vector2_Vector2(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector2): Vector2 {
    lateinit var ret: Vector2
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Vector2(retVar)
    }
    return ret
}

internal fun _icall_Double_Vector2(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector2): Double {
    var ret: Double = 0.0
    memScoped {
        val retVar = alloc<DoubleVar>()
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_PoolVector2Array_Long_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Double): PoolVector2Array {
    lateinit var ret: PoolVector2Array
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = PoolVector2Array(retVar)
    }
    return ret
}

internal fun _icall_Curve2D(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Curve2D {
    lateinit var ret: Curve2D
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Curve2D(retVar)
    }
    return ret
}

internal fun _icall_Long_Object_Transform2D_Object(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: Transform2D, arg2: Object): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Unit_Long_Transform2D(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Transform2D) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_PoolVector2Array_Vector2_Vector2_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector2, arg1: Vector2, arg2: Boolean): PoolVector2Array {
    lateinit var ret: PoolVector2Array
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = PoolVector2Array(retVar)
    }
    return ret
}

internal fun _icall_Object_Vector2(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector2): Object {
    lateinit var ret: Object
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Object(retVar)
    }
    return ret
}

internal fun _icall_PoolVector3Array(mb: CPointer<godot_method_bind>, inst: COpaquePointer): PoolVector3Array {
    lateinit var ret: PoolVector3Array
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = PoolVector3Array(retVar)
    }
    return ret
}

internal fun _icall_Unit_PoolVector3Array(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: PoolVector3Array) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_PoolIntArray(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: PoolIntArray) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_PoolIntArray_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): PoolIntArray {
    lateinit var ret: PoolIntArray
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = PoolIntArray(retVar)
    }
    return ret
}

internal fun _icall_Unit_PoolVector2Array_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: PoolVector2Array, arg1: Long) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Long_PoolVector2Array(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: PoolVector2Array) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_PoolVector2Array_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): PoolVector2Array {
    lateinit var ret: PoolVector2Array
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = PoolVector2Array(retVar)
    }
    return ret
}

internal fun _icall_NavigationPolygon(mb: CPointer<godot_method_bind>, inst: COpaquePointer): NavigationPolygon {
    lateinit var ret: NavigationPolygon
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = NavigationPolygon(retVar)
    }
    return ret
}

internal fun _icall_String_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): String {
    lateinit var ret: String
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = String(retVar)
    }
    return ret
}

internal fun _icall_NodePath_Long_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Boolean): NodePath {
    lateinit var ret: NodePath
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = NodePath(retVar)
    }
    return ret
}

internal fun _icall_NodePath_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): NodePath {
    lateinit var ret: NodePath
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = NodePath(retVar)
    }
    return ret
}

internal fun _icall_Boolean_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): Boolean {
    var ret: Boolean = false
    memScoped {
        val retVar = alloc<BooleanVar>()
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_PackedScene_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): PackedScene {
    lateinit var ret: PackedScene
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = PackedScene(retVar)
    }
    return ret
}

internal fun _icall_PoolStringArray_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): PoolStringArray {
    lateinit var ret: PoolStringArray
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = PoolStringArray(retVar)
    }
    return ret
}

internal fun _icall_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_String_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long): String {
    lateinit var ret: String
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = String(retVar)
    }
    return ret
}

internal fun _icall_Variant_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long): Variant {
    lateinit var ret: Variant
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Variant(retVar)
    }
    return ret
}

internal fun _icall_GDArray_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): GDArray {
    lateinit var ret: GDArray
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = GDArray(retVar)
    }
    return ret
}

internal fun _icall_Long_Object(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_SceneState(mb: CPointer<godot_method_bind>, inst: COpaquePointer): SceneState {
    lateinit var ret: SceneState
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = SceneState(retVar)
    }
    return ret
}

internal fun _icall_NetworkedMultiplayerPeer(mb: CPointer<godot_method_bind>, inst: COpaquePointer): NetworkedMultiplayerPeer {
    lateinit var ret: NetworkedMultiplayerPeer
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = NetworkedMultiplayerPeer(retVar)
    }
    return ret
}

internal fun _icall_SceneTreeTimer_Double_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Double, arg1: Boolean): SceneTreeTimer {
    lateinit var ret: SceneTreeTimer
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = SceneTreeTimer(retVar)
    }
    return ret
}

internal fun _icall_Unit_Long_Long_Vector2_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long, arg2: Vector2, arg3: Double) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Long_String_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: String, arg2: Long) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Long_String_String_Variant(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: String, arg2: String, arg3: Variant) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_String_String_Variant(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: String, arg2: Variant) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_GDArray_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String): GDArray {
    lateinit var ret: GDArray
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = GDArray(retVar)
    }
    return ret
}

internal fun _icall_Long_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_PoolIntArray(mb: CPointer<godot_method_bind>, inst: COpaquePointer): PoolIntArray {
    lateinit var ret: PoolIntArray
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = PoolIntArray(retVar)
    }
    return ret
}

internal fun _icall_Unit_Long_Object(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Object) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_ToolButton_Object_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: String): ToolButton {
    lateinit var ret: ToolButton
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = ToolButton(retVar)
    }
    return ret
}

internal fun _icall_Unit_String_Object_String_Variant(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Object, arg2: String, arg3: Variant) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_String_Object(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Object) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_String_String_Object_Object(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: String, arg2: Object, arg3: Object) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_String_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: String) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_UndoRedo(mb: CPointer<godot_method_bind>, inst: COpaquePointer): UndoRedo {
    lateinit var ret: UndoRedo
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = UndoRedo(retVar)
    }
    return ret
}

internal fun _icall_EditorInterface(mb: CPointer<godot_method_bind>, inst: COpaquePointer): EditorInterface {
    lateinit var ret: EditorInterface
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = EditorInterface(retVar)
    }
    return ret
}

internal fun _icall_ScriptCreateDialog(mb: CPointer<godot_method_bind>, inst: COpaquePointer): ScriptCreateDialog {
    lateinit var ret: ScriptCreateDialog
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = ScriptCreateDialog(retVar)
    }
    return ret
}

internal fun _icall_VBoxContainer(mb: CPointer<godot_method_bind>, inst: COpaquePointer): VBoxContainer {
    lateinit var ret: VBoxContainer
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = VBoxContainer(retVar)
    }
    return ret
}

internal fun _icall_Variant_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String): Variant {
    lateinit var ret: Variant
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Variant(retVar)
    }
    return ret
}

internal fun _icall_Unit_String_Variant_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Variant, arg2: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Dictionary(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Dictionary) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Variant_String_String_Variant(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: String, arg2: Variant): Variant {
    lateinit var ret: Variant
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Variant(retVar)
    }
    return ret
}

internal fun _icall_Unit_PoolStringArray(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: PoolStringArray) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_PoolStringArray(mb: CPointer<godot_method_bind>, inst: COpaquePointer): PoolStringArray {
    lateinit var ret: PoolStringArray
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = PoolStringArray(retVar)
    }
    return ret
}

internal fun _icall_Unit_PoolVector3Array_Object_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: PoolVector3Array, arg1: Object, arg2: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Object_Boolean_RID(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: Boolean, arg2: RID) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Object_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: Double) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_PoolVector3Array_Boolean_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: PoolVector3Array, arg1: Boolean, arg2: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Object_Object_String_Variant(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: Object, arg2: String, arg3: Variant) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_EditorFileSystemDirectory(mb: CPointer<godot_method_bind>, inst: COpaquePointer): EditorFileSystemDirectory {
    lateinit var ret: EditorFileSystemDirectory
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = EditorFileSystemDirectory(retVar)
    }
    return ret
}

internal fun _icall_EditorFileSystemDirectory_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String): EditorFileSystemDirectory {
    lateinit var ret: EditorFileSystemDirectory
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = EditorFileSystemDirectory(retVar)
    }
    return ret
}

internal fun _icall_String_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String): String {
    lateinit var ret: String
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = String(retVar)
    }
    return ret
}

internal fun _icall_EditorFileSystemDirectory_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): EditorFileSystemDirectory {
    lateinit var ret: EditorFileSystemDirectory
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = EditorFileSystemDirectory(retVar)
    }
    return ret
}

internal fun _icall_Variant_Vector2_Object(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector2, arg1: Object): Variant {
    lateinit var ret: Variant
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Variant(retVar)
    }
    return ret
}

internal fun _icall_Boolean_Vector2_Variant_Object(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector2, arg1: Variant, arg2: Object): Boolean {
    var ret: Boolean = false
    memScoped {
        val retVar = alloc<BooleanVar>()
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Unit_Vector2_Variant_Object(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector2, arg1: Variant, arg2: Object) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Script(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Script {
    lateinit var ret: Script
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Script(retVar)
    }
    return ret
}

internal fun _icall_Unit_Object_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: String) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_EditorSelection(mb: CPointer<godot_method_bind>, inst: COpaquePointer): EditorSelection {
    lateinit var ret: EditorSelection
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = EditorSelection(retVar)
    }
    return ret
}

internal fun _icall_EditorSettings(mb: CPointer<godot_method_bind>, inst: COpaquePointer): EditorSettings {
    lateinit var ret: EditorSettings
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = EditorSettings(retVar)
    }
    return ret
}

internal fun _icall_ScriptEditor(mb: CPointer<godot_method_bind>, inst: COpaquePointer): ScriptEditor {
    lateinit var ret: ScriptEditor
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = ScriptEditor(retVar)
    }
    return ret
}

internal fun _icall_Control(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Control {
    lateinit var ret: Control
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Control(retVar)
    }
    return ret
}

internal fun _icall_EditorResourcePreview(mb: CPointer<godot_method_bind>, inst: COpaquePointer): EditorResourcePreview {
    lateinit var ret: EditorResourcePreview
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = EditorResourcePreview(retVar)
    }
    return ret
}

internal fun _icall_EditorFileSystem(mb: CPointer<godot_method_bind>, inst: COpaquePointer): EditorFileSystem {
    lateinit var ret: EditorFileSystem
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = EditorFileSystem(retVar)
    }
    return ret
}

internal fun _icall_GDArray_GDArray_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: GDArray, arg1: Long): GDArray {
    lateinit var ret: GDArray
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = GDArray(retVar)
    }
    return ret
}

internal fun _icall_Unit_String_PoolStringArray(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: PoolStringArray) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_String_PoolByteArray_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: PoolByteArray, arg2: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Node_String_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Long, arg2: Long): Node {
    lateinit var ret: Node
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Node(retVar)
    }
    return ret
}

internal fun _icall_Animation_String_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Long, arg2: Long): Animation {
    lateinit var ret: Animation
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Animation(retVar)
    }
    return ret
}

internal fun _icall_Unit_String_PoolStringArray_Object(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: PoolStringArray, arg2: Object) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Object(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Object {
    lateinit var ret: Object
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Object(retVar)
    }
    return ret
}

internal fun _icall_Variant_String_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Boolean): Variant {
    lateinit var ret: Variant
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Variant(retVar)
    }
    return ret
}

internal fun _icall_RID(mb: CPointer<godot_method_bind>, inst: COpaquePointer): RID {
    lateinit var ret: RID
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = RID(retVar)
    }
    return ret
}

internal fun _icall_RID_Object_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: Long): RID {
    lateinit var ret: RID
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = RID(retVar)
    }
    return ret
}

internal fun _icall_Unit_RID_Long_Long_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Long, arg2: Long, arg3: Long, arg4: Long) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(5)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_Object_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Object, arg2: Long) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_Object_Long_Long_Long_Long_Long_Long_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Object, arg2: Long, arg3: Long, arg4: Long, arg5: Long, arg6: Long, arg7: Long, arg8: Long, arg9: Long) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(10)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        args[5] = arg5.getRawMemory(memScope)
        args[6] = arg6.getRawMemory(memScope)
        args[7] = arg7.getRawMemory(memScope)
        args[8] = arg8.getRawMemory(memScope)
        args[9] = arg9.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Image_RID_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Long): Image {
    lateinit var ret: Image
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Image(retVar)
    }
    return ret
}

internal fun _icall_Unit_RID_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Long) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Long_RID(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Unit_RID_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Long, arg2: Long) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: String) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_String_RID(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID): String {
    lateinit var ret: String
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = String(retVar)
    }
    return ret
}

internal fun _icall_Unit_RID_RID_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: RID, arg2: Long) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_GDArray_RID(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID): GDArray {
    lateinit var ret: GDArray
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = GDArray(retVar)
    }
    return ret
}

internal fun _icall_Unit_RID_String_RID(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: String, arg2: RID) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_RID_RID_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: String): RID {
    lateinit var ret: RID
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = RID(retVar)
    }
    return ret
}

internal fun _icall_Unit_RID_RID(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: RID) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_RID_RID(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID): RID {
    lateinit var ret: RID
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = RID(retVar)
    }
    return ret
}

internal fun _icall_Unit_RID_String_Variant(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: String, arg2: Variant) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Variant_RID_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: String): Variant {
    lateinit var ret: Variant
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Variant(retVar)
    }
    return ret
}

internal fun _icall_Unit_RID_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Double) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_Long_GDArray_GDArray_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Long, arg2: GDArray, arg3: GDArray, arg4: Long) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(5)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_Long_RID(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Long, arg2: RID) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_RID_RID_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Long): RID {
    lateinit var ret: RID
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = RID(retVar)
    }
    return ret
}

internal fun _icall_Long_RID_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Long): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_PoolByteArray_RID_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Long): PoolByteArray {
    lateinit var ret: PoolByteArray
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = PoolByteArray(retVar)
    }
    return ret
}

internal fun _icall_GDArray_RID_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Long): GDArray {
    lateinit var ret: GDArray
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = GDArray(retVar)
    }
    return ret
}

internal fun _icall_AABB_RID_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Long): AABB {
    lateinit var ret: AABB
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = AABB(retVar)
    }
    return ret
}

internal fun _icall_Unit_RID_AABB(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: AABB) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_AABB_RID(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID): AABB {
    lateinit var ret: AABB
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = AABB(retVar)
    }
    return ret
}

internal fun _icall_Unit_RID(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_Long_Transform(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Long, arg2: Transform) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_Long_Transform2D(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Long, arg2: Transform2D) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_Long_Color(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Long, arg2: Color) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Transform_RID_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Long): Transform {
    lateinit var ret: Transform
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Transform(retVar)
    }
    return ret
}

internal fun _icall_Transform2D_RID_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Long): Transform2D {
    lateinit var ret: Transform2D
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Transform2D(retVar)
    }
    return ret
}

internal fun _icall_Color_RID_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Long): Color {
    lateinit var ret: Color
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Color(retVar)
    }
    return ret
}

internal fun _icall_Unit_RID_PoolRealArray(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: PoolRealArray) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_Vector3(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Vector3) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_Vector2(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Vector2) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_Plane(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Plane) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_Color(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Color) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_Long_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Long, arg2: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_Long_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Long, arg2: Double) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Double_RID(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID): Double {
    var ret: Double = 0.0
    memScoped {
        val retVar = alloc<DoubleVar>()
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Unit_RID_Transform(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Transform) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Transform_RID(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID): Transform {
    lateinit var ret: Transform
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Transform(retVar)
    }
    return ret
}

internal fun _icall_Unit_RID_PoolIntArray(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: PoolIntArray) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_PoolIntArray_RID(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID): PoolIntArray {
    lateinit var ret: PoolIntArray
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = PoolIntArray(retVar)
    }
    return ret
}

internal fun _icall_Boolean_RID(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID): Boolean {
    var ret: Boolean = false
    memScoped {
        val retVar = alloc<BooleanVar>()
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Unit_RID_PoolByteArray(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: PoolByteArray) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_PoolByteArray_RID(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID): PoolByteArray {
    lateinit var ret: PoolByteArray
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = PoolByteArray(retVar)
    }
    return ret
}

internal fun _icall_Unit_RID_Double_Double_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Double, arg2: Double, arg3: Double) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_Rect2_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Rect2, arg2: Long) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_RID_Transform2D(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: RID, arg2: Transform2D) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_Transform2D(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Transform2D) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_Color_Double_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Color, arg2: Double, arg3: Double) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_Boolean_Double_Double_Double_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Boolean, arg2: Double, arg3: Double, arg4: Double, arg5: Long) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(6)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        args[5] = arg5.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_Boolean_Long_Double_Double_Double_Long_Double_Double_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Boolean, arg2: Long, arg3: Double, arg4: Double, arg5: Double, arg6: Long, arg7: Double, arg8: Double, arg9: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(10)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        args[5] = arg5.getRawMemory(memScope)
        args[6] = arg6.getRawMemory(memScope)
        args[7] = arg7.getRawMemory(memScope)
        args[8] = arg8.getRawMemory(memScope)
        args[9] = arg9.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_Long_Double_Double_Boolean_Double_Double_Double_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Long, arg2: Double, arg3: Double, arg4: Boolean, arg5: Double, arg6: Double, arg7: Double, arg8: Double) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(9)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        args[5] = arg5.getRawMemory(memScope)
        args[6] = arg6.getRawMemory(memScope)
        args[7] = arg7.getRawMemory(memScope)
        args[8] = arg8.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_Boolean_Double_Double_Double_RID(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Boolean, arg2: Double, arg3: Double, arg4: Double, arg5: RID) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(6)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        args[5] = arg5.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_Boolean_Long_Double_Double_Double_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Boolean, arg2: Long, arg3: Double, arg4: Double, arg5: Double, arg6: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(7)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        args[5] = arg5.getRawMemory(memScope)
        args[6] = arg6.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_Boolean_Double_Double_Double_Double_Double_Double_Double_Color_Long_Long_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Boolean, arg2: Double, arg3: Double, arg4: Double, arg5: Double, arg6: Double, arg7: Double, arg8: Double, arg9: Color, arg10: Long, arg11: Long, arg12: Double) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(13)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        args[5] = arg5.getRawMemory(memScope)
        args[6] = arg6.getRawMemory(memScope)
        args[7] = arg7.getRawMemory(memScope)
        args[8] = arg8.getRawMemory(memScope)
        args[9] = arg9.getRawMemory(memScope)
        args[10] = arg10.getRawMemory(memScope)
        args[11] = arg11.getRawMemory(memScope)
        args[12] = arg12.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_Boolean_Color_Color_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Boolean, arg2: Color, arg3: Color, arg4: Double) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(5)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_Boolean_Double_Double_Boolean_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Boolean, arg2: Double, arg3: Double, arg4: Boolean, arg5: Double) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(6)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        args[5] = arg5.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_Boolean_Double_Double_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Boolean, arg2: Double, arg3: Double, arg4: Double) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(5)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_RID_RID_RID(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: RID): RID {
    lateinit var ret: RID
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = RID(retVar)
    }
    return ret
}

internal fun _icall_Unit_RID_RID_RID(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: RID, arg2: RID) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_Double_Double_Double_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Double, arg2: Double, arg3: Double, arg4: Double) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(5)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_GDArray_AABB_RID(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: AABB, arg1: RID): GDArray {
    lateinit var ret: GDArray
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = GDArray(retVar)
    }
    return ret
}

internal fun _icall_GDArray_Vector3_Vector3_RID(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector3, arg1: Vector3, arg2: RID): GDArray {
    lateinit var ret: GDArray
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = GDArray(retVar)
    }
    return ret
}

internal fun _icall_GDArray_GDArray_RID(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: GDArray, arg1: RID): GDArray {
    lateinit var ret: GDArray
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = GDArray(retVar)
    }
    return ret
}

internal fun _icall_Unit_RID_RID_Vector2(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: RID, arg2: Vector2) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_Boolean_Rect2(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Boolean, arg2: Rect2) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_Vector2_Vector2_Color_Double_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Vector2, arg2: Vector2, arg3: Color, arg4: Double, arg5: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(6)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        args[5] = arg5.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_PoolVector2Array_PoolColorArray_Double_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: PoolVector2Array, arg2: PoolColorArray, arg3: Double, arg4: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(5)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_Rect2_Color(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Rect2, arg2: Color) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_Vector2_Double_Color(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Vector2, arg2: Double, arg3: Color) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_Rect2_RID_Boolean_Color_Boolean_RID(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Rect2, arg2: RID, arg3: Boolean, arg4: Color, arg5: Boolean, arg6: RID) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(7)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        args[5] = arg5.getRawMemory(memScope)
        args[6] = arg6.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_Rect2_RID_Rect2_Color_Boolean_RID_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Rect2, arg2: RID, arg3: Rect2, arg4: Color, arg5: Boolean, arg6: RID, arg7: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(8)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        args[5] = arg5.getRawMemory(memScope)
        args[6] = arg6.getRawMemory(memScope)
        args[7] = arg7.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_Rect2_Rect2_RID_Vector2_Vector2_Long_Long_Boolean_Color_RID(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Rect2, arg2: Rect2, arg3: RID, arg4: Vector2, arg5: Vector2, arg6: Long, arg7: Long, arg8: Boolean, arg9: Color, arg10: RID) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(11)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        args[5] = arg5.getRawMemory(memScope)
        args[6] = arg6.getRawMemory(memScope)
        args[7] = arg7.getRawMemory(memScope)
        args[8] = arg8.getRawMemory(memScope)
        args[9] = arg9.getRawMemory(memScope)
        args[10] = arg10.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_PoolVector2Array_PoolColorArray_PoolVector2Array_RID_Double_RID(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: PoolVector2Array, arg2: PoolColorArray, arg3: PoolVector2Array, arg4: RID, arg5: Double, arg6: RID) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(7)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        args[5] = arg5.getRawMemory(memScope)
        args[6] = arg6.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_PoolVector2Array_PoolColorArray_PoolVector2Array_RID_RID_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: PoolVector2Array, arg2: PoolColorArray, arg3: PoolVector2Array, arg4: RID, arg5: RID, arg6: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(7)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        args[5] = arg5.getRawMemory(memScope)
        args[6] = arg6.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_PoolIntArray_PoolVector2Array_PoolColorArray_PoolVector2Array_PoolIntArray_PoolRealArray_RID_Long_RID(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: PoolIntArray, arg2: PoolVector2Array, arg3: PoolColorArray, arg4: PoolVector2Array, arg5: PoolIntArray, arg6: PoolRealArray, arg7: RID, arg8: Long, arg9: RID) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(10)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        args[5] = arg5.getRawMemory(memScope)
        args[6] = arg6.getRawMemory(memScope)
        args[7] = arg7.getRawMemory(memScope)
        args[8] = arg8.getRawMemory(memScope)
        args[9] = arg9.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_RID_RID_RID(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: RID, arg2: RID, arg3: RID) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_RID_RID_RID_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: RID, arg2: RID, arg3: RID, arg4: Long, arg5: Long) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(6)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        args[5] = arg5.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_PoolVector2Array_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: PoolVector2Array, arg2: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_PoolVector2Array(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: PoolVector2Array) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Long_Long_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long, arg2: Long, arg3: Long) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Object_String_Variant(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: String, arg2: Variant) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_RID_Long_Long_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long, arg2: Double): RID {
    lateinit var ret: RID
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = RID(retVar)
    }
    return ret
}

internal fun _icall_Unit_Object_Color_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: Color, arg2: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Color(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Color) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Object_String_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: String, arg2: Long) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Long_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: String) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Long_Variant(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Variant) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Texture_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): Texture {
    lateinit var ret: Texture
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Texture(retVar)
    }
    return ret
}

internal fun _icall_Variant_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): Variant {
    lateinit var ret: Variant
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Variant(retVar)
    }
    return ret
}

internal fun _icall_Variant(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Variant {
    lateinit var ret: Variant
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Variant(retVar)
    }
    return ret
}

internal fun _icall_PopupMenu(mb: CPointer<godot_method_bind>, inst: COpaquePointer): PopupMenu {
    lateinit var ret: PopupMenu
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = PopupMenu(retVar)
    }
    return ret
}

internal fun _icall_LineEdit(mb: CPointer<godot_method_bind>, inst: COpaquePointer): LineEdit {
    lateinit var ret: LineEdit
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = LineEdit(retVar)
    }
    return ret
}

internal fun _icall_Color(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Color {
    lateinit var ret: Color
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Color(retVar)
    }
    return ret
}

internal fun _icall_ColorPicker(mb: CPointer<godot_method_bind>, inst: COpaquePointer): ColorPicker {
    lateinit var ret: ColorPicker
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = ColorPicker(retVar)
    }
    return ret
}

internal fun _icall_PopupPanel(mb: CPointer<godot_method_bind>, inst: COpaquePointer): PopupPanel {
    lateinit var ret: PopupPanel
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = PopupPanel(retVar)
    }
    return ret
}

internal fun _icall_Unit_Variant(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Variant) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Long_Boolean_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Boolean, arg2: Long) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_VScrollBar(mb: CPointer<godot_method_bind>, inst: COpaquePointer): VScrollBar {
    lateinit var ret: VScrollBar
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = VScrollBar(retVar)
    }
    return ret
}

internal fun _icall_VideoStream(mb: CPointer<godot_method_bind>, inst: COpaquePointer): VideoStream {
    lateinit var ret: VideoStream
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = VideoStream(retVar)
    }
    return ret
}

internal fun _icall_Texture(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Texture {
    lateinit var ret: Texture
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Texture(retVar)
    }
    return ret
}

internal fun _icall_Transform(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Transform {
    lateinit var ret: Transform
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Transform(retVar)
    }
    return ret
}

internal fun _icall_Unit_Transform(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Transform) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Vector3(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Vector3 {
    lateinit var ret: Vector3
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Vector3(retVar)
    }
    return ret
}

internal fun _icall_Unit_Vector3(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector3) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_SpatialGizmo(mb: CPointer<godot_method_bind>, inst: COpaquePointer): SpatialGizmo {
    lateinit var ret: SpatialGizmo
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = SpatialGizmo(retVar)
    }
    return ret
}

internal fun _icall_Spatial(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Spatial {
    lateinit var ret: Spatial
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Spatial(retVar)
    }
    return ret
}

internal fun _icall_World(mb: CPointer<godot_method_bind>, inst: COpaquePointer): World {
    lateinit var ret: World
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = World(retVar)
    }
    return ret
}

internal fun _icall_Unit_Vector3_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector3, arg1: Double) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Vector3_Vector3(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector3, arg1: Vector3) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Vector3_Vector3_Vector3(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector3, arg1: Vector3, arg2: Vector3) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Vector3_Vector3(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector3): Vector3 {
    lateinit var ret: Vector3
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Vector3(retVar)
    }
    return ret
}

internal fun _icall_Transform_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): Transform {
    lateinit var ret: Transform
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Transform(retVar)
    }
    return ret
}

internal fun _icall_Unit_Long_Transform(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Transform) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_GDArray(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: GDArray) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_NodePath(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: NodePath) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Long_String_Object(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Object): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Animation_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String): Animation {
    lateinit var ret: Animation
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Animation(retVar)
    }
    return ret
}

internal fun _icall_Unit_String_String_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: String, arg2: Double) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Double_String_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: String): Double {
    var ret: Double = 0.0
    memScoped {
        val retVar = alloc<DoubleVar>()
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Unit_String_Double_Double_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Double, arg2: Double, arg3: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_String_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Double) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_String_Object(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object): String {
    lateinit var ret: String
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = String(retVar)
    }
    return ret
}

internal fun _icall_Unit_Double_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Double, arg1: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Boolean_Object_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: String): Boolean {
    var ret: Boolean = false
    memScoped {
        val retVar = alloc<BooleanVar>()
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Boolean_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Double): Boolean {
    var ret: Boolean = false
    memScoped {
        val retVar = alloc<BooleanVar>()
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Boolean_Object_NodePath_Variant_Variant_Double_Long_Long_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: NodePath, arg2: Variant, arg3: Variant, arg4: Double, arg5: Long, arg6: Long, arg7: Double): Boolean {
    var ret: Boolean = false
    memScoped {
        val retVar = alloc<BooleanVar>()
        val args = allocArray<COpaquePointerVar>(8)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        args[5] = arg5.getRawMemory(memScope)
        args[6] = arg6.getRawMemory(memScope)
        args[7] = arg7.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Boolean_Object_String_Variant_Variant_Double_Long_Long_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: String, arg2: Variant, arg3: Variant, arg4: Double, arg5: Long, arg6: Long, arg7: Double): Boolean {
    var ret: Boolean = false
    memScoped {
        val retVar = alloc<BooleanVar>()
        val args = allocArray<COpaquePointerVar>(8)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        args[5] = arg5.getRawMemory(memScope)
        args[6] = arg6.getRawMemory(memScope)
        args[7] = arg7.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Boolean_Object_Double_String_Variant_Variant_Variant_Variant_Variant(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: Double, arg2: String, arg3: Variant, arg4: Variant, arg5: Variant, arg6: Variant, arg7: Variant): Boolean {
    var ret: Boolean = false
    memScoped {
        val retVar = alloc<BooleanVar>()
        val args = allocArray<COpaquePointerVar>(8)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        args[5] = arg5.getRawMemory(memScope)
        args[6] = arg6.getRawMemory(memScope)
        args[7] = arg7.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Boolean_Object_NodePath_Variant_Object_NodePath_Double_Long_Long_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: NodePath, arg2: Variant, arg3: Object, arg4: NodePath, arg5: Double, arg6: Long, arg7: Long, arg8: Double): Boolean {
    var ret: Boolean = false
    memScoped {
        val retVar = alloc<BooleanVar>()
        val args = allocArray<COpaquePointerVar>(9)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        args[5] = arg5.getRawMemory(memScope)
        args[6] = arg6.getRawMemory(memScope)
        args[7] = arg7.getRawMemory(memScope)
        args[8] = arg8.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Boolean_Object_String_Variant_Object_String_Double_Long_Long_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: String, arg2: Variant, arg3: Object, arg4: String, arg5: Double, arg6: Long, arg7: Long, arg8: Double): Boolean {
    var ret: Boolean = false
    memScoped {
        val retVar = alloc<BooleanVar>()
        val args = allocArray<COpaquePointerVar>(9)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        args[5] = arg5.getRawMemory(memScope)
        args[6] = arg6.getRawMemory(memScope)
        args[7] = arg7.getRawMemory(memScope)
        args[8] = arg8.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Boolean_Object_NodePath_Object_NodePath_Variant_Double_Long_Long_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: NodePath, arg2: Object, arg3: NodePath, arg4: Variant, arg5: Double, arg6: Long, arg7: Long, arg8: Double): Boolean {
    var ret: Boolean = false
    memScoped {
        val retVar = alloc<BooleanVar>()
        val args = allocArray<COpaquePointerVar>(9)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        args[5] = arg5.getRawMemory(memScope)
        args[6] = arg6.getRawMemory(memScope)
        args[7] = arg7.getRawMemory(memScope)
        args[8] = arg8.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Boolean_Object_String_Object_String_Variant_Double_Long_Long_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: String, arg2: Object, arg3: String, arg4: Variant, arg5: Double, arg6: Long, arg7: Long, arg8: Double): Boolean {
    var ret: Boolean = false
    memScoped {
        val retVar = alloc<BooleanVar>()
        val args = allocArray<COpaquePointerVar>(9)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        args[5] = arg5.getRawMemory(memScope)
        args[6] = arg6.getRawMemory(memScope)
        args[7] = arg7.getRawMemory(memScope)
        args[8] = arg8.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_AABB(mb: CPointer<godot_method_bind>, inst: COpaquePointer): AABB {
    lateinit var ret: AABB
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = AABB(retVar)
    }
    return ret
}

internal fun _icall_Material(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Material {
    lateinit var ret: Material
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Material(retVar)
    }
    return ret
}

internal fun _icall_Environment(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Environment {
    lateinit var ret: Environment
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Environment(retVar)
    }
    return ret
}

internal fun _icall_Vector3_Vector2(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector2): Vector3 {
    lateinit var ret: Vector3
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Vector3(retVar)
    }
    return ret
}

internal fun _icall_Vector2_Vector3(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector3): Vector2 {
    lateinit var ret: Vector2
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Vector2(retVar)
    }
    return ret
}

internal fun _icall_Boolean_Vector3(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector3): Boolean {
    var ret: Boolean = false
    memScoped {
        val retVar = alloc<BooleanVar>()
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Unit_Double_Double_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Double, arg1: Double, arg2: Double) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Sky(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Sky {
    lateinit var ret: Sky
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Sky(retVar)
    }
    return ret
}

internal fun _icall_Double_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): Double {
    var ret: Double = 0.0
    memScoped {
        val retVar = alloc<DoubleVar>()
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Plane(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Plane {
    lateinit var ret: Plane
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Plane(retVar)
    }
    return ret
}

internal fun _icall_Mesh(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Mesh {
    lateinit var ret: Mesh
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Mesh(retVar)
    }
    return ret
}

internal fun _icall_Material_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): Material {
    lateinit var ret: Material
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Material(retVar)
    }
    return ret
}

internal fun _icall_Vector2(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Vector2 {
    lateinit var ret: Vector2
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Vector2(retVar)
    }
    return ret
}

internal fun _icall_Unit_Vector2(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector2) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Shape(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Shape {
    lateinit var ret: Shape
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Shape(retVar)
    }
    return ret
}

internal fun _icall_Mesh_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Double): Mesh {
    lateinit var ret: Mesh
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Mesh(retVar)
    }
    return ret
}

internal fun _icall_TriangleMesh(mb: CPointer<godot_method_bind>, inst: COpaquePointer): TriangleMesh {
    lateinit var ret: TriangleMesh
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = TriangleMesh(retVar)
    }
    return ret
}

internal fun _icall_Unit_Plane(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Plane) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Long_Long_Double_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long, arg2: Double, arg3: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Rect2(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Rect2 {
    lateinit var ret: Rect2
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Rect2(retVar)
    }
    return ret
}

internal fun _icall_Unit_Rect2(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Rect2) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_SpriteFrames(mb: CPointer<godot_method_bind>, inst: COpaquePointer): SpriteFrames {
    lateinit var ret: SpriteFrames
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = SpriteFrames(retVar)
    }
    return ret
}

internal fun _icall_Double_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String): Double {
    var ret: Double = 0.0
    memScoped {
        val retVar = alloc<DoubleVar>()
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Unit_String_Object_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Object, arg2: Long) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Texture_String_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Long): Texture {
    lateinit var ret: Texture
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Texture(retVar)
    }
    return ret
}

internal fun _icall_Unit_String_Long_Object(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Long, arg2: Object) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Long_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Double) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_GIProbeData(mb: CPointer<godot_method_bind>, inst: COpaquePointer): GIProbeData {
    lateinit var ret: GIProbeData
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = GIProbeData(retVar)
    }
    return ret
}

internal fun _icall_Unit_AABB(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: AABB) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_BakedLightmapData(mb: CPointer<godot_method_bind>, inst: COpaquePointer): BakedLightmapData {
    lateinit var ret: BakedLightmapData
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = BakedLightmapData(retVar)
    }
    return ret
}

internal fun _icall_Long_Object_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: Boolean): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_PoolByteArray(mb: CPointer<godot_method_bind>, inst: COpaquePointer): PoolByteArray {
    lateinit var ret: PoolByteArray
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = PoolByteArray(retVar)
    }
    return ret
}

internal fun _icall_Unit_PoolByteArray(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: PoolByteArray) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_NodePath_Object_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: NodePath, arg1: Object, arg2: Long) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Long_String_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: String): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_String_String_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Long): String {
    lateinit var ret: String
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = String(retVar)
    }
    return ret
}

internal fun _icall_Unit_String_NodePath_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: NodePath, arg2: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_String_Vector2(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Vector2) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Vector2_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String): Vector2 {
    lateinit var ret: Vector2
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Vector2(retVar)
    }
    return ret
}

internal fun _icall_Unit_String_Long_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Long, arg2: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Boolean_String_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Long): Boolean {
    var ret: Boolean = false
    memScoped {
        val retVar = alloc<BooleanVar>()
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Long_String_String_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: String, arg2: Long): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Boolean_String_String_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: String, arg2: Long): Boolean {
    var ret: Boolean = false
    memScoped {
        val retVar = alloc<BooleanVar>()
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Mesh_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): Mesh {
    lateinit var ret: Mesh
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Mesh(retVar)
    }
    return ret
}

internal fun _icall_PoolColorArray(mb: CPointer<godot_method_bind>, inst: COpaquePointer): PoolColorArray {
    lateinit var ret: PoolColorArray
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = PoolColorArray(retVar)
    }
    return ret
}

internal fun _icall_Unit_PoolColorArray(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: PoolColorArray) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Curve_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): Curve {
    lateinit var ret: Curve
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Curve(retVar)
    }
    return ret
}

internal fun _icall_GradientTexture(mb: CPointer<godot_method_bind>, inst: COpaquePointer): GradientTexture {
    lateinit var ret: GradientTexture
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = GradientTexture(retVar)
    }
    return ret
}

internal fun _icall_Gradient(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Gradient {
    lateinit var ret: Gradient
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Gradient(retVar)
    }
    return ret
}

internal fun _icall_Boolean_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long): Boolean {
    var ret: Boolean = false
    memScoped {
        val retVar = alloc<BooleanVar>()
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Unit_Long_Boolean_String_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Boolean, arg2: String, arg3: String) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Double_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long): Double {
    var ret: Double = 0.0
    memScoped {
        val retVar = alloc<DoubleVar>()
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Unit_Long_Double_Double_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Double, arg2: Double, arg3: Double) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Object_Long_Vector2(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: Long, arg2: Vector2) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Long_Object_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Object, arg2: Long) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_AudioEffect_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long): AudioEffect {
    lateinit var ret: AudioEffect
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = AudioEffect(retVar)
    }
    return ret
}

internal fun _icall_Unit_Long_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long, arg2: Long) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Long_Long_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long, arg2: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_AudioBusLayout(mb: CPointer<godot_method_bind>, inst: COpaquePointer): AudioBusLayout {
    lateinit var ret: AudioBusLayout
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = AudioBusLayout(retVar)
    }
    return ret
}

internal fun _icall_ARVRInterface_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): ARVRInterface {
    lateinit var ret: ARVRInterface
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = ARVRInterface(retVar)
    }
    return ret
}

internal fun _icall_ARVRInterface_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String): ARVRInterface {
    lateinit var ret: ARVRInterface
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = ARVRInterface(retVar)
    }
    return ret
}

internal fun _icall_ARVRPositionalTracker_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): ARVRPositionalTracker {
    lateinit var ret: ARVRPositionalTracker
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = ARVRPositionalTracker(retVar)
    }
    return ret
}

internal fun _icall_ARVRInterface(mb: CPointer<godot_method_bind>, inst: COpaquePointer): ARVRInterface {
    lateinit var ret: ARVRInterface
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = ARVRInterface(retVar)
    }
    return ret
}

internal fun _icall_RID_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): RID {
    lateinit var ret: RID
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = RID(retVar)
    }
    return ret
}

internal fun _icall_Unit_RID_Variant(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Variant) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Variant_RID(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID): Variant {
    lateinit var ret: Variant
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Variant(retVar)
    }
    return ret
}

internal fun _icall_Double_RID_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Long): Double {
    var ret: Double = 0.0
    memScoped {
        val retVar = alloc<DoubleVar>()
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_PhysicsDirectSpaceState_RID(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID): PhysicsDirectSpaceState {
    lateinit var ret: PhysicsDirectSpaceState
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = PhysicsDirectSpaceState(retVar)
    }
    return ret
}

internal fun _icall_Unit_RID_RID_Transform(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: RID, arg2: Transform) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_Long_Variant(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Long, arg2: Variant) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Variant_RID_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Long): Variant {
    lateinit var ret: Variant
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Variant(retVar)
    }
    return ret
}

internal fun _icall_Unit_RID_Object_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Object, arg2: String) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_RID_Long_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Boolean): RID {
    lateinit var ret: RID
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = RID(retVar)
    }
    return ret
}

internal fun _icall_Unit_RID_Vector3_Vector3(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Vector3, arg2: Vector3) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Boolean_RID_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Long): Boolean {
    var ret: Boolean = false
    memScoped {
        val retVar = alloc<BooleanVar>()
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Unit_RID_Object_String_Variant(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Object, arg2: String, arg3: Variant) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_PhysicsDirectBodyState_RID(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID): PhysicsDirectBodyState {
    lateinit var ret: PhysicsDirectBodyState
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = PhysicsDirectBodyState(retVar)
    }
    return ret
}

internal fun _icall_RID_RID_Vector3_RID_Vector3(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Vector3, arg2: RID, arg3: Vector3): RID {
    lateinit var ret: RID
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = RID(retVar)
    }
    return ret
}

internal fun _icall_Vector3_RID(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID): Vector3 {
    lateinit var ret: Vector3
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Vector3(retVar)
    }
    return ret
}

internal fun _icall_RID_RID_Transform_RID_Transform(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Transform, arg2: RID, arg3: Transform): RID {
    lateinit var ret: RID
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = RID(retVar)
    }
    return ret
}

internal fun _icall_Unit_RID_Long_Long_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Long, arg2: Long, arg3: Double) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Double_RID_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Long, arg2: Long): Double {
    var ret: Double = 0.0
    memScoped {
        val retVar = alloc<DoubleVar>()
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Unit_RID_Long_Long_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Long, arg2: Long, arg3: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Boolean_RID_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Long, arg2: Long): Boolean {
    var ret: Boolean = false
    memScoped {
        val retVar = alloc<BooleanVar>()
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Physics2DDirectSpaceState_RID(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID): Physics2DDirectSpaceState {
    lateinit var ret: Physics2DDirectSpaceState
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Physics2DDirectSpaceState(retVar)
    }
    return ret
}

internal fun _icall_Transform2D_RID(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID): Transform2D {
    lateinit var ret: Transform2D
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Transform2D(retVar)
    }
    return ret
}

internal fun _icall_Unit_RID_Vector2_Vector2(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Vector2, arg2: Vector2) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Boolean_RID_Transform2D_Vector2_Boolean_Double_Object(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Transform2D, arg2: Vector2, arg3: Boolean, arg4: Double, arg5: Object): Boolean {
    var ret: Boolean = false
    memScoped {
        val retVar = alloc<BooleanVar>()
        val args = allocArray<COpaquePointerVar>(6)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        args[5] = arg5.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Physics2DDirectBodyState_RID(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID): Physics2DDirectBodyState {
    lateinit var ret: Physics2DDirectBodyState
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Physics2DDirectBodyState(retVar)
    }
    return ret
}

internal fun _icall_RID_Vector2_RID_RID(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector2, arg1: RID, arg2: RID): RID {
    lateinit var ret: RID
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = RID(retVar)
    }
    return ret
}

internal fun _icall_RID_Vector2_Vector2_Vector2_RID_RID(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector2, arg1: Vector2, arg2: Vector2, arg3: RID, arg4: RID): RID {
    lateinit var ret: RID
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(5)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = RID(retVar)
    }
    return ret
}

internal fun _icall_RID_Vector2_Vector2_RID_RID(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector2, arg1: Vector2, arg2: RID, arg3: RID): RID {
    lateinit var ret: RID
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = RID(retVar)
    }
    return ret
}

internal fun _icall_Basis(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Basis {
    lateinit var ret: Basis
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Basis(retVar)
    }
    return ret
}

internal fun _icall_Transform_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Boolean): Transform {
    lateinit var ret: Transform
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Transform(retVar)
    }
    return ret
}

internal fun _icall_AudioStream(mb: CPointer<godot_method_bind>, inst: COpaquePointer): AudioStream {
    lateinit var ret: AudioStream
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = AudioStream(retVar)
    }
    return ret
}

internal fun _icall_Transform2D(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Transform2D {
    lateinit var ret: Transform2D
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Transform2D(retVar)
    }
    return ret
}

internal fun _icall_Unit_Transform2D(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Transform2D) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Object_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): Object {
    lateinit var ret: Object
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Object(retVar)
    }
    return ret
}

internal fun _icall_Physics2DDirectSpaceState(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Physics2DDirectSpaceState {
    lateinit var ret: Physics2DDirectSpaceState
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Physics2DDirectSpaceState(retVar)
    }
    return ret
}

internal fun _icall_GDArray_Vector2_Long_GDArray_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector2, arg1: Long, arg2: GDArray, arg3: Long): GDArray {
    lateinit var ret: GDArray
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = GDArray(retVar)
    }
    return ret
}

internal fun _icall_Dictionary_Vector2_Vector2_GDArray_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector2, arg1: Vector2, arg2: GDArray, arg3: Long): Dictionary {
    lateinit var ret: Dictionary
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Dictionary(retVar)
    }
    return ret
}

internal fun _icall_GDArray_Object_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: Long): GDArray {
    lateinit var ret: GDArray
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = GDArray(retVar)
    }
    return ret
}

internal fun _icall_GDArray_Object(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object): GDArray {
    lateinit var ret: GDArray
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = GDArray(retVar)
    }
    return ret
}

internal fun _icall_Dictionary_Object(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object): Dictionary {
    lateinit var ret: Dictionary
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Dictionary(retVar)
    }
    return ret
}

internal fun _icall_Vector3_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): Vector3 {
    lateinit var ret: Vector3
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Vector3(retVar)
    }
    return ret
}

internal fun _icall_PhysicsDirectSpaceState(mb: CPointer<godot_method_bind>, inst: COpaquePointer): PhysicsDirectSpaceState {
    lateinit var ret: PhysicsDirectSpaceState
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = PhysicsDirectSpaceState(retVar)
    }
    return ret
}

internal fun _icall_Dictionary_Vector3_Vector3_GDArray_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector3, arg1: Vector3, arg2: GDArray, arg3: Long): Dictionary {
    lateinit var ret: Dictionary
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Dictionary(retVar)
    }
    return ret
}

internal fun _icall_GDArray_Object_Vector3(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: Vector3): GDArray {
    lateinit var ret: GDArray
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = GDArray(retVar)
    }
    return ret
}

internal fun _icall_Unit_NodePath_Variant(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: NodePath, arg1: Variant) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Variant_NodePath(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: NodePath): Variant {
    lateinit var ret: Variant
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Variant(retVar)
    }
    return ret
}

internal fun _icall_Reference(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Reference {
    lateinit var ret: Reference
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Reference(retVar)
    }
    return ret
}

internal fun _icall_Unit_String_GDArray(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: GDArray) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Variant_String_GDArray(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: GDArray): Variant {
    lateinit var ret: Variant
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Variant(retVar)
    }
    return ret
}

internal fun _icall_Long_String_Object_String_GDArray_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Object, arg2: String, arg3: GDArray, arg4: Long): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(5)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Unit_String_Object_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Object, arg2: String) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Boolean_String_Object_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Object, arg2: String): Boolean {
    var ret: Boolean = false
    memScoped {
        val retVar = alloc<BooleanVar>()
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Resource_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Boolean): Resource {
    lateinit var ret: Resource
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Resource(retVar)
    }
    return ret
}

internal fun _icall_Long_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Boolean): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Unit_Long_Long_Boolean_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long, arg2: Boolean, arg3: Long) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Long_Long_Boolean_Long_PoolByteArray(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long, arg2: Boolean, arg3: Long, arg4: PoolByteArray) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(5)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Long_Long_Long_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long, arg2: Double): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Image(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Image {
    lateinit var ret: Image
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Image(retVar)
    }
    return ret
}

internal fun _icall_Unit_Object_Rect2_Vector2(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: Rect2, arg2: Vector2) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Object_Object_Rect2_Vector2(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: Object, arg2: Rect2, arg3: Vector2) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Image_Rect2(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Rect2): Image {
    lateinit var ret: Image
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Image(retVar)
    }
    return ret
}

internal fun _icall_Color_Vector2(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector2): Color {
    lateinit var ret: Color
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Color(retVar)
    }
    return ret
}

internal fun _icall_Color_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long): Color {
    lateinit var ret: Color
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Color(retVar)
    }
    return ret
}

internal fun _icall_Unit_Vector2_Color(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector2, arg1: Color) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Long_Long_Color(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long, arg2: Color) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Long_PoolByteArray(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: PoolByteArray): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_InputEvent_Transform2D_Vector2(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Transform2D, arg1: Vector2): InputEvent {
    lateinit var ret: InputEvent
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = InputEvent(retVar)
    }
    return ret
}

internal fun _icall_GDArray_PoolByteArray(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: PoolByteArray): GDArray {
    lateinit var ret: GDArray
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = GDArray(retVar)
    }
    return ret
}

internal fun _icall_StreamPeerBuffer(mb: CPointer<godot_method_bind>, inst: COpaquePointer): StreamPeerBuffer {
    lateinit var ret: StreamPeerBuffer
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = StreamPeerBuffer(retVar)
    }
    return ret
}

internal fun _icall_Long_String_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Long): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Long_Long_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: String): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_StreamPeerTCP(mb: CPointer<godot_method_bind>, inst: COpaquePointer): StreamPeerTCP {
    lateinit var ret: StreamPeerTCP
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = StreamPeerTCP(retVar)
    }
    return ret
}

internal fun _icall_Long_Variant(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Variant): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Long_Long_String_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: String, arg2: Long): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Long_Object_Boolean_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: Boolean, arg2: String): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_StreamPeer(mb: CPointer<godot_method_bind>, inst: COpaquePointer): StreamPeer {
    lateinit var ret: StreamPeer
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = StreamPeer(retVar)
    }
    return ret
}

internal fun _icall_Long_PoolByteArray_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: PoolByteArray, arg1: Long, arg2: Long): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Long_String_Long_Boolean_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Long, arg2: Boolean, arg3: Boolean): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Long_Long_String_PoolStringArray_PoolByteArray(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: String, arg2: PoolStringArray, arg3: PoolByteArray): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Long_Long_String_PoolStringArray_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: String, arg2: PoolStringArray, arg3: String): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Dictionary(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Dictionary {
    lateinit var ret: Dictionary
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Dictionary(retVar)
    }
    return ret
}

internal fun _icall_String_Dictionary(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Dictionary): String {
    lateinit var ret: String
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = String(retVar)
    }
    return ret
}

internal fun _icall_Resource(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Resource {
    lateinit var ret: Resource
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Resource(retVar)
    }
    return ret
}

internal fun _icall_Long_String_Long_PoolByteArray(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Long, arg2: PoolByteArray): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Long_String_Long_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Long, arg2: String): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Long_String_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Long, arg2: Long): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_PoolByteArray_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): PoolByteArray {
    lateinit var ret: PoolByteArray
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = PoolByteArray(retVar)
    }
    return ret
}

internal fun _icall_PoolStringArray_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String): PoolStringArray {
    lateinit var ret: PoolStringArray
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = PoolStringArray(retVar)
    }
    return ret
}

internal fun _icall_Long_Boolean_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Boolean, arg1: Boolean): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Long_Object_String_Variant_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: String, arg2: Variant, arg3: Long): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Boolean_String_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: String): Boolean {
    var ret: Boolean = false
    memScoped {
        val retVar = alloc<BooleanVar>()
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Unit_Long_Vector3_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Vector3, arg2: Double) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Long_Vector3(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Vector3) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Long_Vector3(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector3): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_PoolVector3Array_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long): PoolVector3Array {
    lateinit var ret: PoolVector3Array
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = PoolVector3Array(retVar)
    }
    return ret
}

internal fun _icall_PoolIntArray_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long): PoolIntArray {
    lateinit var ret: PoolIntArray
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = PoolIntArray(retVar)
    }
    return ret
}

internal fun _icall_GDArray_Vector3(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector3): GDArray {
    lateinit var ret: GDArray
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = GDArray(retVar)
    }
    return ret
}

internal fun _icall_GDArray_Double_Double_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Double, arg1: Double, arg2: Long, arg3: Long): GDArray {
    lateinit var ret: GDArray
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = GDArray(retVar)
    }
    return ret
}

internal fun _icall_GDArray_Double_Double_Long_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Double, arg1: Double, arg2: Long, arg3: Long, arg4: Long): GDArray {
    lateinit var ret: GDArray
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(5)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = GDArray(retVar)
    }
    return ret
}

internal fun _icall_Double_Vector2_Vector2_Vector2_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector2, arg1: Vector2, arg2: Vector2, arg3: Double): Double {
    var ret: Double = 0.0
    memScoped {
        val retVar = alloc<DoubleVar>()
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Variant_Vector2_Vector2_Vector2_Vector2(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector2, arg1: Vector2, arg2: Vector2, arg3: Vector2): Variant {
    lateinit var ret: Variant
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Variant(retVar)
    }
    return ret
}

internal fun _icall_PoolVector2Array_Vector2_Vector2_Vector2_Vector2(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector2, arg1: Vector2, arg2: Vector2, arg3: Vector2): PoolVector2Array {
    lateinit var ret: PoolVector2Array
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = PoolVector2Array(retVar)
    }
    return ret
}

internal fun _icall_PoolVector3Array_Vector3_Vector3_Vector3_Vector3(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector3, arg1: Vector3, arg2: Vector3, arg3: Vector3): PoolVector3Array {
    lateinit var ret: PoolVector3Array
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = PoolVector3Array(retVar)
    }
    return ret
}

internal fun _icall_Vector2_Vector2_Vector2_Vector2(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector2, arg1: Vector2, arg2: Vector2): Vector2 {
    lateinit var ret: Vector2
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Vector2(retVar)
    }
    return ret
}

internal fun _icall_Vector3_Vector3_Vector3_Vector3(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector3, arg1: Vector3, arg2: Vector3): Vector3 {
    lateinit var ret: Vector3
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Vector3(retVar)
    }
    return ret
}

internal fun _icall_Variant_Vector3_Vector3_Vector3_Vector3_Vector3(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector3, arg1: Vector3, arg2: Vector3, arg3: Vector3, arg4: Vector3): Variant {
    lateinit var ret: Variant
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(5)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Variant(retVar)
    }
    return ret
}

internal fun _icall_PoolVector3Array_Vector3_Vector3_Vector3_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector3, arg1: Vector3, arg2: Vector3, arg3: Double): PoolVector3Array {
    lateinit var ret: PoolVector3Array
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = PoolVector3Array(retVar)
    }
    return ret
}

internal fun _icall_PoolVector3Array_Vector3_Vector3_Double_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector3, arg1: Vector3, arg2: Double, arg3: Double): PoolVector3Array {
    lateinit var ret: PoolVector3Array
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = PoolVector3Array(retVar)
    }
    return ret
}

internal fun _icall_PoolVector3Array_Vector3_Vector3_GDArray(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector3, arg1: Vector3, arg2: GDArray): PoolVector3Array {
    lateinit var ret: PoolVector3Array
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = PoolVector3Array(retVar)
    }
    return ret
}

internal fun _icall_Boolean_Vector2_Vector2_Vector2_Vector2(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector2, arg1: Vector2, arg2: Vector2, arg3: Vector2): Boolean {
    var ret: Boolean = false
    memScoped {
        val retVar = alloc<BooleanVar>()
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_PoolIntArray_PoolVector2Array(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: PoolVector2Array): PoolIntArray {
    lateinit var ret: PoolIntArray
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = PoolIntArray(retVar)
    }
    return ret
}

internal fun _icall_PoolVector2Array_PoolVector2Array(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: PoolVector2Array): PoolVector2Array {
    lateinit var ret: PoolVector2Array
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = PoolVector2Array(retVar)
    }
    return ret
}

internal fun _icall_PoolVector3Array_PoolVector3Array_Plane(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: PoolVector3Array, arg1: Plane): PoolVector3Array {
    lateinit var ret: PoolVector3Array
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = PoolVector3Array(retVar)
    }
    return ret
}

internal fun _icall_Dictionary_PoolVector2Array(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: PoolVector2Array): Dictionary {
    lateinit var ret: Dictionary
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Dictionary(retVar)
    }
    return ret
}

internal fun _icall_ResourceInteractiveLoader_String_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: String): ResourceInteractiveLoader {
    lateinit var ret: ResourceInteractiveLoader
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = ResourceInteractiveLoader(retVar)
    }
    return ret
}

internal fun _icall_Resource_String_String_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: String, arg2: Boolean): Resource {
    lateinit var ret: Resource
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Resource(retVar)
    }
    return ret
}

internal fun _icall_Long_String_Object_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Object, arg2: Long): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_PoolStringArray_Object(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object): PoolStringArray {
    lateinit var ret: PoolStringArray
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = PoolStringArray(retVar)
    }
    return ret
}

internal fun _icall_Long_String_PoolStringArray_Boolean_GDArray(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: PoolStringArray, arg2: Boolean, arg3: GDArray): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Dictionary_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Boolean): Dictionary {
    lateinit var ret: Dictionary
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Dictionary(retVar)
    }
    return ret
}

internal fun _icall_Dictionary_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): Dictionary {
    lateinit var ret: Dictionary
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Dictionary(retVar)
    }
    return ret
}

internal fun _icall_Long_Dictionary(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Dictionary): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Long_String_Double_String_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Double, arg2: String, arg3: String): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_MainLoop(mb: CPointer<godot_method_bind>, inst: COpaquePointer): MainLoop {
    lateinit var ret: MainLoop
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = MainLoop(retVar)
    }
    return ret
}

internal fun _icall_Object_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String): Object {
    lateinit var ret: Object
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Object(retVar)
    }
    return ret
}

internal fun _icall_Dictionary_String_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: String): Dictionary {
    lateinit var ret: Dictionary
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Dictionary(retVar)
    }
    return ret
}

internal fun _icall_GDArray_String_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Boolean): GDArray {
    lateinit var ret: GDArray
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = GDArray(retVar)
    }
    return ret
}

internal fun _icall_Variant_Object_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: String): Variant {
    lateinit var ret: Variant
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Variant(retVar)
    }
    return ret
}

internal fun _icall_Long_Object_String_Variant(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: String, arg2: Variant): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Boolean_String_String_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: String, arg2: Boolean): Boolean {
    var ret: Boolean = false
    memScoped {
        val retVar = alloc<BooleanVar>()
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_PoolStringArray_String_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Boolean): PoolStringArray {
    lateinit var ret: PoolStringArray
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = PoolStringArray(retVar)
    }
    return ret
}

internal fun _icall_String_Variant(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Variant): String {
    lateinit var ret: String
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = String(retVar)
    }
    return ret
}

internal fun _icall_String_PoolByteArray(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: PoolByteArray): String {
    lateinit var ret: String
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = String(retVar)
    }
    return ret
}

internal fun _icall_PoolByteArray_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String): PoolByteArray {
    lateinit var ret: PoolByteArray
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = PoolByteArray(retVar)
    }
    return ret
}

internal fun _icall_String_Variant_String_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Variant, arg1: String, arg2: Boolean): String {
    lateinit var ret: String
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = String(retVar)
    }
    return ret
}

internal fun _icall_JSONParseResult_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String): JSONParseResult {
    lateinit var ret: JSONParseResult
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = JSONParseResult(retVar)
    }
    return ret
}

internal fun _icall_Boolean_String_Object(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Object): Boolean {
    var ret: Boolean = false
    memScoped {
        val retVar = alloc<BooleanVar>()
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Node_Boolean_Object(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Boolean, arg1: Object): Node {
    lateinit var ret: Node
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Node(retVar)
    }
    return ret
}

internal fun _icall_World2D(mb: CPointer<godot_method_bind>, inst: COpaquePointer): World2D {
    lateinit var ret: World2D
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = World2D(retVar)
    }
    return ret
}

internal fun _icall_Unit_Boolean_Vector2_Vector2(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Boolean, arg1: Vector2, arg2: Vector2) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_ViewportTexture(mb: CPointer<godot_method_bind>, inst: COpaquePointer): ViewportTexture {
    lateinit var ret: ViewportTexture
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = ViewportTexture(retVar)
    }
    return ret
}

internal fun _icall_Camera(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Camera {
    lateinit var ret: Camera
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Camera(retVar)
    }
    return ret
}

internal fun _icall_Unit_RID_Vector2_Color_Boolean_Object(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Vector2, arg2: Color, arg3: Boolean, arg4: Object) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(5)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_Rect2_Boolean_Color_Boolean_Object(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Rect2, arg2: Boolean, arg3: Color, arg4: Boolean, arg5: Object) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(6)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        args[5] = arg5.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_Rect2_Rect2_Color_Boolean_Object_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Rect2, arg2: Rect2, arg3: Color, arg4: Boolean, arg5: Object, arg6: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(7)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        args[5] = arg5.getRawMemory(memScope)
        args[6] = arg6.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Long_String_PoolStringArray_Boolean_Long_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: PoolStringArray, arg2: Boolean, arg3: Long, arg4: String): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(5)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Unit_Vector2_Vector2_Color_Double_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector2, arg1: Vector2, arg2: Color, arg3: Double, arg4: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(5)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_PoolVector2Array_Color_Double_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: PoolVector2Array, arg1: Color, arg2: Double, arg3: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_PoolVector2Array_PoolColorArray_Double_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: PoolVector2Array, arg1: PoolColorArray, arg2: Double, arg3: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Rect2_Color_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Rect2, arg1: Color, arg2: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Vector2_Double_Color(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector2, arg1: Double, arg2: Color) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Object_Vector2_Color_Object(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: Vector2, arg2: Color, arg3: Object) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Object_Rect2_Boolean_Color_Boolean_Object(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: Rect2, arg2: Boolean, arg3: Color, arg4: Boolean, arg5: Object) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(6)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        args[5] = arg5.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Object_Rect2_Rect2_Color_Boolean_Object_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: Rect2, arg2: Rect2, arg3: Color, arg4: Boolean, arg5: Object, arg6: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(7)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        args[5] = arg5.getRawMemory(memScope)
        args[6] = arg6.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Object_Rect2(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: Rect2) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_PoolVector2Array_PoolColorArray_PoolVector2Array_Object_Double_Object(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: PoolVector2Array, arg1: PoolColorArray, arg2: PoolVector2Array, arg3: Object, arg4: Double, arg5: Object) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(6)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        args[5] = arg5.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_PoolVector2Array_PoolColorArray_PoolVector2Array_Object_Object_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: PoolVector2Array, arg1: PoolColorArray, arg2: PoolVector2Array, arg3: Object, arg4: Object, arg5: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(6)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        args[5] = arg5.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_PoolVector2Array_Color_PoolVector2Array_Object_Object_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: PoolVector2Array, arg1: Color, arg2: PoolVector2Array, arg3: Object, arg4: Object, arg5: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(6)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        args[5] = arg5.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Object_Vector2_String_Color_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: Vector2, arg2: String, arg3: Color, arg4: Long) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(5)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Double_Object_Vector2_String_String_Color(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: Vector2, arg2: String, arg3: String, arg4: Color): Double {
    var ret: Double = 0.0
    memScoped {
        val retVar = alloc<DoubleVar>()
        val args = allocArray<COpaquePointerVar>(5)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Unit_Object_Object_Object(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: Object, arg2: Object) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Vector2_Double_Vector2(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector2, arg1: Double, arg2: Vector2) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_InputEvent_Object(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object): InputEvent {
    lateinit var ret: InputEvent
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = InputEvent(retVar)
    }
    return ret
}

internal fun _icall_Transform2D_Object(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object): Transform2D {
    lateinit var ret: Transform2D
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Transform2D(retVar)
    }
    return ret
}

internal fun _icall_Resource_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String): Resource {
    lateinit var ret: Resource
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Resource(retVar)
    }
    return ret
}

internal fun _icall_BaseButton(mb: CPointer<godot_method_bind>, inst: COpaquePointer): BaseButton {
    lateinit var ret: BaseButton
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = BaseButton(retVar)
    }
    return ret
}

internal fun _icall_Unit_Long_NodePath(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: NodePath) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Theme(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Theme {
    lateinit var ret: Theme
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Theme(retVar)
    }
    return ret
}

internal fun _icall_Unit_Long_Double_Boolean_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Double, arg2: Boolean, arg3: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Long_Double_Double_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Double, arg2: Double, arg3: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_String_Color(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Color) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Texture_String_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: String): Texture {
    lateinit var ret: Texture
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Texture(retVar)
    }
    return ret
}

internal fun _icall_StyleBox_String_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: String): StyleBox {
    lateinit var ret: StyleBox
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = StyleBox(retVar)
    }
    return ret
}

internal fun _icall_Font_String_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: String): Font {
    lateinit var ret: Font
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Font(retVar)
    }
    return ret
}

internal fun _icall_Color_String_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: String): Color {
    lateinit var ret: Color
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Color(retVar)
    }
    return ret
}

internal fun _icall_String_Vector2(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector2): String {
    lateinit var ret: String
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = String(retVar)
    }
    return ret
}

internal fun _icall_Long_Vector2(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector2): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Unit_Variant_Object(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Variant, arg1: Object) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Font(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Font {
    lateinit var ret: Font
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Font(retVar)
    }
    return ret
}

internal fun _icall_Unit_String_String_Object(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: String, arg2: Object) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_String_String_Color(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: String, arg2: Color) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_String_String_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: String, arg2: Long) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_ShortCut(mb: CPointer<godot_method_bind>, inst: COpaquePointer): ShortCut {
    lateinit var ret: ShortCut
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = ShortCut(retVar)
    }
    return ret
}

internal fun _icall_ButtonGroup(mb: CPointer<godot_method_bind>, inst: COpaquePointer): ButtonGroup {
    lateinit var ret: ButtonGroup
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = ButtonGroup(retVar)
    }
    return ret
}

internal fun _icall_InputEvent(mb: CPointer<godot_method_bind>, inst: COpaquePointer): InputEvent {
    lateinit var ret: InputEvent
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = InputEvent(retVar)
    }
    return ret
}

internal fun _icall_Control_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): Control {
    lateinit var ret: Control
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Control(retVar)
    }
    return ret
}

internal fun _icall_Popup(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Popup {
    lateinit var ret: Popup
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Popup(retVar)
    }
    return ret
}

internal fun _icall_Rect2_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): Rect2 {
    lateinit var ret: Rect2
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Rect2(retVar)
    }
    return ret
}

internal fun _icall_BitMap(mb: CPointer<godot_method_bind>, inst: COpaquePointer): BitMap {
    lateinit var ret: BitMap
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = BitMap(retVar)
    }
    return ret
}

internal fun _icall_Unit_Vector2_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector2, arg1: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Boolean_Vector2(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector2): Boolean {
    var ret: Boolean = false
    memScoped {
        val retVar = alloc<BooleanVar>()
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Unit_Rect2_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Rect2, arg1: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Control_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long): Control {
    lateinit var ret: Control
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Control(retVar)
    }
    return ret
}

internal fun _icall_HScrollBar(mb: CPointer<godot_method_bind>, inst: COpaquePointer): HScrollBar {
    lateinit var ret: HScrollBar
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = HScrollBar(retVar)
    }
    return ret
}

internal fun _icall_Unit_Long_Boolean_Long_Color_Boolean_Long_Color_Object_Object(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Boolean, arg2: Long, arg3: Color, arg4: Boolean, arg5: Long, arg6: Color, arg7: Object, arg8: Object) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(9)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        args[5] = arg5.getRawMemory(memScope)
        args[6] = arg6.getRawMemory(memScope)
        args[7] = arg7.getRawMemory(memScope)
        args[8] = arg8.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Color_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): Color {
    lateinit var ret: Color
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Color(retVar)
    }
    return ret
}

internal fun _icall_Long_String_Long_String_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Long, arg2: String, arg3: Long): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Boolean_String_Long_String_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Long, arg2: String, arg3: Long): Boolean {
    var ret: Boolean = false
    memScoped {
        val retVar = alloc<BooleanVar>()
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Unit_String_Long_String_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Long, arg2: String, arg3: Long) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_String_Long_String_Long_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Long, arg2: String, arg3: Long, arg4: Double) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(5)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_HBoxContainer(mb: CPointer<godot_method_bind>, inst: COpaquePointer): HBoxContainer {
    lateinit var ret: HBoxContainer
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = HBoxContainer(retVar)
    }
    return ret
}

internal fun _icall_Unit_String_Object_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Object, arg2: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Long_Rect2(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Rect2) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Long_Color(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Color) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Long_Vector2_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector2, arg1: Boolean): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_TextureButton(mb: CPointer<godot_method_bind>, inst: COpaquePointer): TextureButton {
    lateinit var ret: TextureButton
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = TextureButton(retVar)
    }
    return ret
}

internal fun _icall_Button(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Button {
    lateinit var ret: Button
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Button(retVar)
    }
    return ret
}

internal fun _icall_Label(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Label {
    lateinit var ret: Label
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Label(retVar)
    }
    return ret
}

internal fun _icall_Button_String_Boolean_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Boolean, arg2: String): Button {
    lateinit var ret: Button
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Button(retVar)
    }
    return ret
}

internal fun _icall_Button_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String): Button {
    lateinit var ret: Button
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Button(retVar)
    }
    return ret
}

internal fun _icall_Unit_Object_String_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: String, arg2: Long, arg3: Long) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_String_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Long, arg2: Long) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Object_Object_Long_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: Object, arg2: Long, arg3: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Object_Long_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: Long, arg2: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Long_Object_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Object, arg2: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_ShortCut_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): ShortCut {
    lateinit var ret: ShortCut
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = ShortCut(retVar)
    }
    return ret
}

internal fun _icall_Object_Object_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: Long): Object {
    lateinit var ret: Object
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Object(retVar)
    }
    return ret
}

internal fun _icall_TreeItem(mb: CPointer<godot_method_bind>, inst: COpaquePointer): TreeItem {
    lateinit var ret: TreeItem
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = TreeItem(retVar)
    }
    return ret
}

internal fun _icall_TreeItem_Object(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object): TreeItem {
    lateinit var ret: TreeItem
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = TreeItem(retVar)
    }
    return ret
}

internal fun _icall_Rect2_Object_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: Long): Rect2 {
    lateinit var ret: Rect2
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Rect2(retVar)
    }
    return ret
}

internal fun _icall_TreeItem_Vector2(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector2): TreeItem {
    lateinit var ret: TreeItem
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = TreeItem(retVar)
    }
    return ret
}

internal fun _icall_Unit_Long_Boolean_Boolean_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Boolean, arg2: Boolean, arg3: Long) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_PoolIntArray_String_Long_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Long, arg2: Long, arg3: Long): PoolIntArray {
    lateinit var ret: PoolIntArray
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = PoolIntArray(retVar)
    }
    return ret
}

internal fun _icall_Color_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String): Color {
    lateinit var ret: Color
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Color(retVar)
    }
    return ret
}

internal fun _icall_Unit_String_String_Color_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: String, arg2: Color, arg3: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Long_Double_Double_Double_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Double, arg2: Double, arg3: Double, arg4: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(5)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Long_Object_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Object, arg2: String) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Long_Color_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Color, arg2: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Long_Object_Long_Boolean_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Object, arg2: Long, arg3: Boolean, arg4: String) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(5)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Texture_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long): Texture {
    lateinit var ret: Texture
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Texture(retVar)
    }
    return ret
}

internal fun _icall_Unit_Long_Long_Object(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long, arg2: Object) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Long_Vector2_Double_Double_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector2, arg1: Double, arg2: Double, arg3: Long, arg4: Long): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(5)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Long_Long_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Double): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Double_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Double): Double {
    var ret: Double = 0.0
    memScoped {
        val retVar = alloc<DoubleVar>()
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_NavigationMesh(mb: CPointer<godot_method_bind>, inst: COpaquePointer): NavigationMesh {
    lateinit var ret: NavigationMesh
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = NavigationMesh(retVar)
    }
    return ret
}

internal fun _icall_Long_Object_Transform_Object(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: Transform, arg2: Object): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_PoolVector3Array_Vector3_Vector3_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector3, arg1: Vector3, arg2: Boolean): PoolVector3Array {
    lateinit var ret: PoolVector3Array
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = PoolVector3Array(retVar)
    }
    return ret
}

internal fun _icall_Vector3_Vector3_Vector3_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector3, arg1: Vector3, arg2: Boolean): Vector3 {
    lateinit var ret: Vector3
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Vector3(retVar)
    }
    return ret
}

internal fun _icall_Object_Vector3(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector3): Object {
    lateinit var ret: Object
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Object(retVar)
    }
    return ret
}

internal fun _icall_AnimationRootNode(mb: CPointer<godot_method_bind>, inst: COpaquePointer): AnimationRootNode {
    lateinit var ret: AnimationRootNode
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = AnimationRootNode(retVar)
    }
    return ret
}

internal fun _icall_AnimationNode(mb: CPointer<godot_method_bind>, inst: COpaquePointer): AnimationNode {
    lateinit var ret: AnimationNode
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = AnimationNode(retVar)
    }
    return ret
}

internal fun _icall_Unit_NodePath_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: NodePath, arg1: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_String_Double_Double_Boolean_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Double, arg2: Double, arg3: Boolean, arg4: Double) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(5)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Double_Object_Double_Boolean_Double_Long_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: Double, arg2: Boolean, arg3: Double, arg4: Long, arg5: Boolean): Double {
    var ret: Double = 0.0
    memScoped {
        val retVar = alloc<DoubleVar>()
        val args = allocArray<COpaquePointerVar>(6)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        args[5] = arg5.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Double_Long_Double_Boolean_Double_Long_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Double, arg2: Boolean, arg3: Double, arg4: Long, arg5: Boolean): Double {
    var ret: Double = 0.0
    memScoped {
        val retVar = alloc<DoubleVar>()
        val args = allocArray<COpaquePointerVar>(6)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        args[5] = arg5.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_AnimationTree(mb: CPointer<godot_method_bind>, inst: COpaquePointer): AnimationTree {
    lateinit var ret: AnimationTree
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = AnimationTree(retVar)
    }
    return ret
}

internal fun _icall_AnimationNode_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String): AnimationNode {
    lateinit var ret: AnimationNode
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = AnimationNode(retVar)
    }
    return ret
}

internal fun _icall_Unit_String_Long_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Long, arg2: String) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_AnimationRootNode_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): AnimationRootNode {
    lateinit var ret: AnimationRootNode
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = AnimationRootNode(retVar)
    }
    return ret
}

internal fun _icall_Unit_Object_Double_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: Double, arg2: Long) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Object_Vector2_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: Vector2, arg2: Long) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Long_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_AnimationNodeStateMachineTransition_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): AnimationNodeStateMachineTransition {
    lateinit var ret: AnimationNodeStateMachineTransition
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = AnimationNodeStateMachineTransition(retVar)
    }
    return ret
}

internal fun _icall_Shape_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long): Shape {
    lateinit var ret: Shape
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Shape(retVar)
    }
    return ret
}

internal fun _icall_KinematicCollision_Vector3_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector3, arg1: Boolean): KinematicCollision {
    lateinit var ret: KinematicCollision
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = KinematicCollision(retVar)
    }
    return ret
}

internal fun _icall_Vector3_Vector3_Vector3_Double_Long_Double_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector3, arg1: Vector3, arg2: Double, arg3: Long, arg4: Double, arg5: Boolean): Vector3 {
    lateinit var ret: Vector3
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(6)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        args[5] = arg5.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Vector3(retVar)
    }
    return ret
}

internal fun _icall_Boolean_Transform_Vector3_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Transform, arg1: Vector3, arg2: Boolean): Boolean {
    var ret: Boolean = false
    memScoped {
        val retVar = alloc<BooleanVar>()
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_KinematicCollision_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): KinematicCollision {
    lateinit var ret: KinematicCollision
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = KinematicCollision(retVar)
    }
    return ret
}

internal fun _icall_MultiMesh(mb: CPointer<godot_method_bind>, inst: COpaquePointer): MultiMesh {
    lateinit var ret: MultiMesh
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = MultiMesh(retVar)
    }
    return ret
}

internal fun _icall_Unit_Vector3_Vector3_Vector3_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector3, arg1: Vector3, arg2: Vector3, arg3: Long) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Vector3_Long_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Double): Vector3 {
    lateinit var ret: Vector3
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Vector3(retVar)
    }
    return ret
}

internal fun _icall_Vector3_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Double): Vector3 {
    lateinit var ret: Vector3
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Vector3(retVar)
    }
    return ret
}

internal fun _icall_Vector3_Double_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Double, arg1: Boolean): Vector3 {
    lateinit var ret: Vector3
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Vector3(retVar)
    }
    return ret
}

internal fun _icall_PoolRealArray(mb: CPointer<godot_method_bind>, inst: COpaquePointer): PoolRealArray {
    lateinit var ret: PoolRealArray
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = PoolRealArray(retVar)
    }
    return ret
}

internal fun _icall_Double_Vector3(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector3): Double {
    var ret: Double = 0.0
    memScoped {
        val retVar = alloc<DoubleVar>()
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_PoolVector3Array_Long_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Double): PoolVector3Array {
    lateinit var ret: PoolVector3Array
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = PoolVector3Array(retVar)
    }
    return ret
}

internal fun _icall_Curve3D(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Curve3D {
    lateinit var ret: Curve3D
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Curve3D(retVar)
    }
    return ret
}

internal fun _icall_Unit_Long_GDArray(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: GDArray) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_NavigationMesh_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): NavigationMesh {
    lateinit var ret: NavigationMesh
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = NavigationMesh(retVar)
    }
    return ret
}

internal fun _icall_Texture_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String): Texture {
    lateinit var ret: Texture
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Texture(retVar)
    }
    return ret
}

internal fun _icall_Unit_Long_Object_Vector2_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Object, arg2: Vector2, arg3: Long) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Long_Long_Vector2(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long, arg2: Vector2) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Vector2_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long): Vector2 {
    lateinit var ret: Vector2
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Vector2(retVar)
    }
    return ret
}

internal fun _icall_VisualShaderNode_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long): VisualShaderNode {
    lateinit var ret: VisualShaderNode
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = VisualShaderNode(retVar)
    }
    return ret
}

internal fun _icall_Boolean_Long_Long_Long_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long, arg2: Long, arg3: Long, arg4: Long): Boolean {
    var ret: Boolean = false
    memScoped {
        val retVar = alloc<BooleanVar>()
        val args = allocArray<COpaquePointerVar>(5)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Long_Long_Long_Long_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long, arg2: Long, arg3: Long, arg4: Long): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(5)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Unit_Long_Long_Long_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long, arg2: Long, arg3: Long, arg4: Long) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(5)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_CubeMap(mb: CPointer<godot_method_bind>, inst: COpaquePointer): CubeMap {
    lateinit var ret: CubeMap
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = CubeMap(retVar)
    }
    return ret
}

internal fun _icall_Image_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): Image {
    lateinit var ret: Image
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Image(retVar)
    }
    return ret
}

internal fun _icall_Shader(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Shader {
    lateinit var ret: Shader
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Shader(retVar)
    }
    return ret
}

internal fun _icall_Unit_PoolRealArray(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: PoolRealArray) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Double_Color(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Double, arg1: Color) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Color_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Double): Color {
    lateinit var ret: Color
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Color(retVar)
    }
    return ret
}

internal fun _icall_Transform2D_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): Transform2D {
    lateinit var ret: Transform2D
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Transform2D(retVar)
    }
    return ret
}

internal fun _icall_Shape2D_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long): Shape2D {
    lateinit var ret: Shape2D
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Shape2D(retVar)
    }
    return ret
}

internal fun _icall_Unit_Vector2_Vector2(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector2, arg1: Vector2) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Boolean_Vector2_Boolean_Double_Object(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector2, arg1: Boolean, arg2: Double, arg3: Object): Boolean {
    var ret: Boolean = false
    memScoped {
        val retVar = alloc<BooleanVar>()
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_KinematicCollision2D_Vector2_Boolean_Boolean_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector2, arg1: Boolean, arg2: Boolean, arg3: Boolean): KinematicCollision2D {
    lateinit var ret: KinematicCollision2D
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = KinematicCollision2D(retVar)
    }
    return ret
}

internal fun _icall_Vector2_Vector2_Vector2_Boolean_Double_Long_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector2, arg1: Vector2, arg2: Boolean, arg3: Double, arg4: Long, arg5: Double): Vector2 {
    lateinit var ret: Vector2
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(6)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        args[5] = arg5.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Vector2(retVar)
    }
    return ret
}

internal fun _icall_Vector2_Vector2_Vector2_Vector2_Boolean_Double_Long_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector2, arg1: Vector2, arg2: Vector2, arg3: Boolean, arg4: Double, arg5: Long, arg6: Double): Vector2 {
    lateinit var ret: Vector2
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(7)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        args[5] = arg5.getRawMemory(memScope)
        args[6] = arg6.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Vector2(retVar)
    }
    return ret
}

internal fun _icall_Boolean_Transform2D_Vector2_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Transform2D, arg1: Vector2, arg2: Boolean): Boolean {
    var ret: Boolean = false
    memScoped {
        val retVar = alloc<BooleanVar>()
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_KinematicCollision2D_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): KinematicCollision2D {
    lateinit var ret: KinematicCollision2D
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = KinematicCollision2D(retVar)
    }
    return ret
}

internal fun _icall_Shape2D(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Shape2D {
    lateinit var ret: Shape2D
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Shape2D(retVar)
    }
    return ret
}

internal fun _icall_Boolean_Transform2D_Object_Transform2D(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Transform2D, arg1: Object, arg2: Transform2D): Boolean {
    var ret: Boolean = false
    memScoped {
        val retVar = alloc<BooleanVar>()
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Boolean_Transform2D_Vector2_Object_Transform2D_Vector2(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Transform2D, arg1: Vector2, arg2: Object, arg3: Transform2D, arg4: Vector2): Boolean {
    var ret: Boolean = false
    memScoped {
        val retVar = alloc<BooleanVar>()
        val args = allocArray<COpaquePointerVar>(5)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Variant_Transform2D_Object_Transform2D(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Transform2D, arg1: Object, arg2: Transform2D): Variant {
    lateinit var ret: Variant
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Variant(retVar)
    }
    return ret
}

internal fun _icall_Variant_Transform2D_Vector2_Object_Transform2D_Vector2(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Transform2D, arg1: Vector2, arg2: Object, arg3: Transform2D, arg4: Vector2): Variant {
    lateinit var ret: Variant
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(5)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Variant(retVar)
    }
    return ret
}

internal fun _icall_Unit_NodePath_PoolRealArray(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: NodePath, arg1: PoolRealArray) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_PoolRealArray_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): PoolRealArray {
    lateinit var ret: PoolRealArray
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = PoolRealArray(retVar)
    }
    return ret
}

internal fun _icall_Unit_Long_PoolRealArray(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: PoolRealArray) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Bone2D_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): Bone2D {
    lateinit var ret: Bone2D
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Bone2D(retVar)
    }
    return ret
}

internal fun _icall_OccluderPolygon2D(mb: CPointer<godot_method_bind>, inst: COpaquePointer): OccluderPolygon2D {
    lateinit var ret: OccluderPolygon2D
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = OccluderPolygon2D(retVar)
    }
    return ret
}

internal fun _icall_ShaderMaterial_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): ShaderMaterial {
    lateinit var ret: ShaderMaterial
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = ShaderMaterial(retVar)
    }
    return ret
}

internal fun _icall_Unit_Long_Long_Transform2D(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long, arg2: Transform2D) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Transform2D_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long): Transform2D {
    lateinit var ret: Transform2D
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Transform2D(retVar)
    }
    return ret
}

internal fun _icall_Unit_Long_Object_Transform2D_Boolean_Vector2(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Object, arg2: Transform2D, arg3: Boolean, arg4: Vector2) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(5)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_NavigationPolygon_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): NavigationPolygon {
    lateinit var ret: NavigationPolygon
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = NavigationPolygon(retVar)
    }
    return ret
}

internal fun _icall_OccluderPolygon2D_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): OccluderPolygon2D {
    lateinit var ret: OccluderPolygon2D
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = OccluderPolygon2D(retVar)
    }
    return ret
}

internal fun _icall_TileSet(mb: CPointer<godot_method_bind>, inst: COpaquePointer): TileSet {
    lateinit var ret: TileSet
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = TileSet(retVar)
    }
    return ret
}

internal fun _icall_Unit_Long_Long_Long_Boolean_Boolean_Boolean_Vector2(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long, arg2: Long, arg3: Boolean, arg4: Boolean, arg5: Boolean, arg6: Vector2) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(7)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        args[5] = arg5.getRawMemory(memScope)
        args[6] = arg6.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Vector2_Long_Boolean_Boolean_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector2, arg1: Long, arg2: Boolean, arg3: Boolean, arg4: Boolean) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(5)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Vector2_Dictionary(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector2, arg1: Dictionary) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Vector2_Vector2_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector2, arg1: Boolean): Vector2 {
    lateinit var ret: Vector2
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Vector2(retVar)
    }
    return ret
}

internal fun _icall_Unit_Long_GDArray_GDArray_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: GDArray, arg2: GDArray, arg3: Long) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Long_Long_PoolByteArray(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long, arg2: PoolByteArray) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Long_Transform_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Transform, arg1: Double): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_CurveTexture(mb: CPointer<godot_method_bind>, inst: COpaquePointer): CurveTexture {
    lateinit var ret: CurveTexture
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = CurveTexture(retVar)
    }
    return ret
}

internal fun _icall_CurveTexture_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): CurveTexture {
    lateinit var ret: CurveTexture
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = CurveTexture(retVar)
    }
    return ret
}

internal fun _icall_Curve(mb: CPointer<godot_method_bind>, inst: COpaquePointer): Curve {
    lateinit var ret: Curve
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Curve(retVar)
    }
    return ret
}

internal fun _icall_Unit_PoolVector3Array_PoolVector2Array_PoolColorArray_PoolVector2Array_PoolVector3Array_GDArray(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: PoolVector3Array, arg1: PoolVector2Array, arg2: PoolColorArray, arg3: PoolVector2Array, arg4: PoolVector3Array, arg5: GDArray) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(6)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        args[5] = arg5.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Object_Long_Transform(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: Long, arg2: Transform) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_ArrayMesh_Object_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: Long): ArrayMesh {
    lateinit var ret: ArrayMesh
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = ArrayMesh(retVar)
    }
    return ret
}

internal fun _icall_Long_Object_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: Long): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Unit_Long_Plane(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Plane) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Plane_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): Plane {
    lateinit var ret: Plane
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Plane(retVar)
    }
    return ret
}

internal fun _icall_Unit_Long_PoolIntArray(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: PoolIntArray) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Long_Vector2_Object(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector2, arg1: Object): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Long_NodePath(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: NodePath): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Long_Long_Double_Vector3_Quat_Vector3(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Double, arg2: Vector3, arg3: Quat, arg4: Vector3): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(5)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Unit_Long_Double_Variant_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Double, arg2: Variant, arg3: Double) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Long_Long_Variant(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long, arg2: Variant) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Long_Long_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long, arg2: Double) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Long_Long_Double_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Double, arg2: Boolean): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_GDArray_Long_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Double): GDArray {
    lateinit var ret: GDArray
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = GDArray(retVar)
    }
    return ret
}

internal fun _icall_PoolIntArray_Long_Double_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Double, arg2: Double): PoolIntArray {
    lateinit var ret: PoolIntArray
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = PoolIntArray(retVar)
    }
    return ret
}

internal fun _icall_GDArray_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long): GDArray {
    lateinit var ret: GDArray
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = GDArray(retVar)
    }
    return ret
}

internal fun _icall_Long_Long_Double_Double_Vector2_Vector2(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Double, arg2: Double, arg3: Vector2, arg4: Vector2): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(5)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Double_Long_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Double): Double {
    var ret: Double = 0.0
    memScoped {
        val retVar = alloc<DoubleVar>()
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Long_Long_Double_Object_Double_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Double, arg2: Object, arg3: Double, arg4: Double): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(5)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Resource_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long): Resource {
    lateinit var ret: Resource
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Resource(retVar)
    }
    return ret
}

internal fun _icall_Long_Long_Double_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Double, arg2: String): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Unit_Long_Long_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long, arg2: String) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_RID_Vector2_String_Color_Long_Color(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Vector2, arg2: String, arg3: Color, arg4: Long, arg5: Color) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(6)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        args[5] = arg5.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Double_RID_Vector2_Long_Long_Color_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Vector2, arg2: Long, arg3: Long, arg4: Color, arg5: Boolean): Double {
    var ret: Double = 0.0
    memScoped {
        val retVar = alloc<DoubleVar>()
        val args = allocArray<COpaquePointerVar>(6)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        args[5] = arg5.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_BitmapFont(mb: CPointer<godot_method_bind>, inst: COpaquePointer): BitmapFont {
    lateinit var ret: BitmapFont
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = BitmapFont(retVar)
    }
    return ret
}

internal fun _icall_Unit_Long_Long_Rect2_Vector2_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long, arg2: Rect2, arg3: Vector2, arg4: Double) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(5)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_DynamicFontData(mb: CPointer<godot_method_bind>, inst: COpaquePointer): DynamicFontData {
    lateinit var ret: DynamicFontData
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = DynamicFontData(retVar)
    }
    return ret
}

internal fun _icall_DynamicFontData_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): DynamicFontData {
    lateinit var ret: DynamicFontData
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = DynamicFontData(retVar)
    }
    return ret
}

internal fun _icall_Boolean_Vector2_Rect2(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector2, arg1: Rect2): Boolean {
    var ret: Boolean = false
    memScoped {
        val retVar = alloc<BooleanVar>()
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Unit_RID_Rect2(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: RID, arg1: Rect2) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Double_Double_Double_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Double, arg1: Double, arg2: Double, arg3: Double) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_PoolVector2Array_PoolIntArray(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: PoolVector2Array, arg1: PoolIntArray) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_PoolVector2Array_Vector2_Vector2(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Vector2, arg1: Vector2): PoolVector2Array {
    lateinit var ret: PoolVector2Array
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = PoolVector2Array(retVar)
    }
    return ret
}

internal fun _icall_Long_Long_Long_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long, arg2: Long, arg3: Long): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Long_String_Long_Long_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Long, arg2: Long, arg3: Long, arg4: Long): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(5)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_ConfigFile(mb: CPointer<godot_method_bind>, inst: COpaquePointer): ConfigFile {
    lateinit var ret: ConfigFile
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = ConfigFile(retVar)
    }
    return ret
}

internal fun _icall_GDNativeLibrary(mb: CPointer<godot_method_bind>, inst: COpaquePointer): GDNativeLibrary {
    lateinit var ret: GDNativeLibrary
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = GDNativeLibrary(retVar)
    }
    return ret
}

internal fun _icall_Variant_String_String_GDArray(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: String, arg2: GDArray): Variant {
    lateinit var ret: Variant
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Variant(retVar)
    }
    return ret
}

internal fun _icall_Variant_Variant(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Variant): Variant {
    lateinit var ret: Variant
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Variant(retVar)
    }
    return ret
}

internal fun _icall_Boolean_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Boolean): Boolean {
    var ret: Boolean = false
    memScoped {
        val retVar = alloc<BooleanVar>()
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_MeshLibrary(mb: CPointer<godot_method_bind>, inst: COpaquePointer): MeshLibrary {
    lateinit var ret: MeshLibrary
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = MeshLibrary(retVar)
    }
    return ret
}

internal fun _icall_Long_Long_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long, arg2: Long): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Vector3_Long_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long, arg2: Long): Vector3 {
    lateinit var ret: Vector3
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Vector3(retVar)
    }
    return ret
}

internal fun _icall_Unit_Boolean_Boolean_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Boolean, arg1: Boolean, arg2: Long, arg3: Long) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Unit_Boolean_Double(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Boolean, arg1: Double) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_RegExMatch_String_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Long, arg2: Long): RegExMatch {
    lateinit var ret: RegExMatch
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = RegExMatch(retVar)
    }
    return ret
}

internal fun _icall_GDArray_String_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Long, arg2: Long): GDArray {
    lateinit var ret: GDArray
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = GDArray(retVar)
    }
    return ret
}

internal fun _icall_String_String_String_Boolean_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: String, arg2: Boolean, arg3: Long, arg4: Long): String {
    lateinit var ret: String
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(5)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = String(retVar)
    }
    return ret
}

internal fun _icall_UPNPDevice_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): UPNPDevice {
    lateinit var ret: UPNPDevice
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = UPNPDevice(retVar)
    }
    return ret
}

internal fun _icall_UPNPDevice(mb: CPointer<godot_method_bind>, inst: COpaquePointer): UPNPDevice {
    lateinit var ret: UPNPDevice
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = UPNPDevice(retVar)
    }
    return ret
}

internal fun _icall_Long_Long_Long_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long, arg2: String): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Long_Long_Long_String_String_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: Long, arg2: String, arg3: String, arg4: Long): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(5)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Unit_String_Long_Object_Vector2(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Long, arg2: Object, arg3: Vector2) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_VisualScriptNode_String_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Long): VisualScriptNode {
    lateinit var ret: VisualScriptNode
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = VisualScriptNode(retVar)
    }
    return ret
}

internal fun _icall_Unit_String_Long_Vector2(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Long, arg2: Vector2) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Vector2_String_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Long): Vector2 {
    lateinit var ret: Vector2
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Vector2(retVar)
    }
    return ret
}

internal fun _icall_Unit_String_Long_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Long, arg2: Long, arg3: Long) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Boolean_String_Long_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Long, arg2: Long, arg3: Long): Boolean {
    var ret: Boolean = false
    memScoped {
        val retVar = alloc<BooleanVar>()
        val args = allocArray<COpaquePointerVar>(4)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Unit_String_Long_Long_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Long, arg2: Long, arg3: Long, arg4: Long) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(5)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Boolean_String_Long_Long_Long_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Long, arg2: Long, arg3: Long, arg4: Long): Boolean {
    var ret: Boolean = false
    memScoped {
        val retVar = alloc<BooleanVar>()
        val args = allocArray<COpaquePointerVar>(5)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        args[3] = arg3.getRawMemory(memScope)
        args[4] = arg4.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Unit_String_Dictionary(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: Dictionary) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(2)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Dictionary_String(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String): Dictionary {
    lateinit var ret: Dictionary
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Dictionary(retVar)
    }
    return ret
}

internal fun _icall_VisualScript(mb: CPointer<godot_method_bind>, inst: COpaquePointer): VisualScript {
    lateinit var ret: VisualScript
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(0)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = VisualScript(retVar)
    }
    return ret
}

internal fun _icall_Unit_Object_String_GDArray(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Object, arg1: String, arg2: GDArray) {
    memScoped {
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, null)
    }
}

internal fun _icall_Variant_GDArray(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: GDArray): Variant {
    lateinit var ret: Variant
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = Variant(retVar)
    }
    return ret
}

internal fun _icall_WebSocketPeer_Long(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long): WebSocketPeer {
    lateinit var ret: WebSocketPeer
    memScoped {
        val retVar = allocArray<ByteVar>(1024)
        val args = allocArray<COpaquePointerVar>(1)
        args[0] = arg0.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar)
        ret = WebSocketPeer(retVar)
    }
    return ret
}

internal fun _icall_Long_Long_PoolStringArray_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: Long, arg1: PoolStringArray, arg2: Boolean): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

internal fun _icall_Long_String_PoolStringArray_Boolean(mb: CPointer<godot_method_bind>, inst: COpaquePointer, arg0: String, arg1: PoolStringArray, arg2: Boolean): Long {
    var ret: Long = 0
    memScoped {
        val retVar = alloc<LongVar>()
        val args = allocArray<COpaquePointerVar>(3)
        args[0] = arg0.getRawMemory(memScope)
        args[1] = arg1.getRawMemory(memScope)
        args[2] = arg2.getRawMemory(memScope)
        godot_method_bind_ptrcall(mb, inst, args, retVar.ptr)
        ret = retVar.value
    }
    return ret
}

