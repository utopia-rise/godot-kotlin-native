@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class MeshLibrary : Resource {
    constructor() : super("MeshLibrary")
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
        infix fun from(other: Resource): MeshLibrary = MeshLibrary("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): MeshLibrary = MeshLibrary("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): MeshLibrary = MeshLibrary("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): MeshLibrary = fromVariant(MeshLibrary(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val createItemMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshLibrary", "create_item") }
    open fun createItem(id: Int) {
        _icall_Unit_Int(createItemMethodBind, this.rawMemory, id)
    }


    private val setItemNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshLibrary", "set_item_name") }
    open fun setItemName(id: Int, name: String) {
        _icall_Unit_Int_String(setItemNameMethodBind, this.rawMemory, id, name)
    }


    private val setItemMeshMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshLibrary", "set_item_mesh") }
    open fun setItemMesh(id: Int, mesh: Mesh) {
        _icall_Unit_Int_Object(setItemMeshMethodBind, this.rawMemory, id, mesh)
    }


    private val setItemNavmeshMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshLibrary", "set_item_navmesh") }
    open fun setItemNavmesh(id: Int, navmesh: NavigationMesh) {
        _icall_Unit_Int_Object(setItemNavmeshMethodBind, this.rawMemory, id, navmesh)
    }


    private val setItemShapesMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshLibrary", "set_item_shapes") }
    open fun setItemShapes(id: Int, shapes: GDArray) {
        _icall_Unit_Int_GDArray(setItemShapesMethodBind, this.rawMemory, id, shapes)
    }


    private val setItemPreviewMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshLibrary", "set_item_preview") }
    open fun setItemPreview(id: Int, texture: Texture) {
        _icall_Unit_Int_Object(setItemPreviewMethodBind, this.rawMemory, id, texture)
    }


    private val getItemNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshLibrary", "get_item_name") }
    open fun getItemName(id: Int): String {
        return _icall_String_Int(getItemNameMethodBind, this.rawMemory, id)
    }


    private val getItemMeshMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshLibrary", "get_item_mesh") }
    open fun getItemMesh(id: Int): Mesh {
        return _icall_Mesh_Int(getItemMeshMethodBind, this.rawMemory, id)
    }


    private val getItemNavmeshMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshLibrary", "get_item_navmesh") }
    open fun getItemNavmesh(id: Int): NavigationMesh {
        return _icall_NavigationMesh_Int(getItemNavmeshMethodBind, this.rawMemory, id)
    }


    private val getItemShapesMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshLibrary", "get_item_shapes") }
    open fun getItemShapes(id: Int): GDArray {
        return _icall_GDArray_Int(getItemShapesMethodBind, this.rawMemory, id)
    }


    private val getItemPreviewMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshLibrary", "get_item_preview") }
    open fun getItemPreview(id: Int): Texture {
        return _icall_Texture_Int(getItemPreviewMethodBind, this.rawMemory, id)
    }


    private val removeItemMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshLibrary", "remove_item") }
    open fun removeItem(id: Int) {
        _icall_Unit_Int(removeItemMethodBind, this.rawMemory, id)
    }


    private val findItemByNameMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshLibrary", "find_item_by_name") }
    open fun findItemByName(name: String): Int {
        return _icall_Int_String(findItemByNameMethodBind, this.rawMemory, name)
    }


    private val clearMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshLibrary", "clear") }
    open fun clear() {
        _icall_Unit(clearMethodBind, this.rawMemory)
    }


    private val getItemListMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshLibrary", "get_item_list") }
    open fun getItemList(): PoolIntArray {
        return _icall_PoolIntArray(getItemListMethodBind, this.rawMemory)
    }


    private val getLastUnusedItemIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("MeshLibrary", "get_last_unused_item_id") }
    open fun getLastUnusedItemId(): Int {
        return _icall_Int(getLastUnusedItemIdMethodBind, this.rawMemory)
    }


}
