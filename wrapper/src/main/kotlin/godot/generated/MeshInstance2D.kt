@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class MeshInstance2D : Node2D {
    constructor() : super("MeshInstance2D")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: Node2D): MeshInstance2D = MeshInstance2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): MeshInstance2D = MeshInstance2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): MeshInstance2D = MeshInstance2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): MeshInstance2D = MeshInstance2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): MeshInstance2D = fromVariant(MeshInstance2D(""), other)


        // Constants


    }


    // Properties
    open var mesh: Mesh
        get() = _icall_Mesh(getMeshMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setMeshMethodBind, this.rawMemory, value)


    open var texture: Texture
        get() = _icall_Texture(getTextureMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setTextureMethodBind, this.rawMemory, value)


    open var normalMap: Texture
        get() = _icall_Texture(getNormalMapMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setNormalMapMethodBind, this.rawMemory, value)




    // Methods
    private val setMeshMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshInstance2D", "set_mesh") }
    open fun setMesh(mesh: Mesh) {
        _icall_Unit_Object(setMeshMethodBind, this.rawMemory, mesh)
    }


    private val getMeshMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshInstance2D", "get_mesh") }
    open fun getMesh(): Mesh {
        return _icall_Mesh(getMeshMethodBind, this.rawMemory)
    }


    private val setTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshInstance2D", "set_texture") }
    open fun setTexture(texture: Texture) {
        _icall_Unit_Object(setTextureMethodBind, this.rawMemory, texture)
    }


    private val getTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshInstance2D", "get_texture") }
    open fun getTexture(): Texture {
        return _icall_Texture(getTextureMethodBind, this.rawMemory)
    }


    private val setNormalMapMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshInstance2D", "set_normal_map") }
    open fun setNormalMap(normalMap: Texture) {
        _icall_Unit_Object(setNormalMapMethodBind, this.rawMemory, normalMap)
    }


    private val getNormalMapMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshInstance2D", "get_normal_map") }
    open fun getNormalMap(): Texture {
        return _icall_Texture(getNormalMapMethodBind, this.rawMemory)
    }


}
