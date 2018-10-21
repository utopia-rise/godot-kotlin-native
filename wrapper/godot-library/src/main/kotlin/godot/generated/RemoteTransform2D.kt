@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class RemoteTransform2D : Node2D {
    constructor() : super("RemoteTransform2D")
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
        infix fun from(other: Node2D): RemoteTransform2D = RemoteTransform2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): RemoteTransform2D = RemoteTransform2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): RemoteTransform2D = RemoteTransform2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): RemoteTransform2D = RemoteTransform2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): RemoteTransform2D = fromVariant(RemoteTransform2D(""), other)


        // Constants


    }


    // Properties
    open var remotePath: NodePath
        get() = _icall_NodePath(getRemoteNodeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_NodePath(setRemoteNodeMethodBind, this.rawMemory, value)


    open var useGlobalCoordinates: Boolean
        get() = _icall_Boolean(getUseGlobalCoordinatesMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setUseGlobalCoordinatesMethodBind, this.rawMemory, value)


    open var updatePosition: Boolean
        get() = _icall_Boolean(getUpdatePositionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setUpdatePositionMethodBind, this.rawMemory, value)


    open var updateRotation: Boolean
        get() = _icall_Boolean(getUpdateRotationMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setUpdateRotationMethodBind, this.rawMemory, value)


    open var updateScale: Boolean
        get() = _icall_Boolean(getUpdateScaleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setUpdateScaleMethodBind, this.rawMemory, value)




    // Methods
    private val setRemoteNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("RemoteTransform2D", "set_remote_node") }
    open fun setRemoteNode(path: NodePath) {
        _icall_Unit_NodePath(setRemoteNodeMethodBind, this.rawMemory, path)
    }


    private val getRemoteNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("RemoteTransform2D", "get_remote_node") }
    open fun getRemoteNode(): NodePath {
        return _icall_NodePath(getRemoteNodeMethodBind, this.rawMemory)
    }


    private val setUseGlobalCoordinatesMethodBind: CPointer<godot_method_bind> by lazy { getMB("RemoteTransform2D", "set_use_global_coordinates") }
    open fun setUseGlobalCoordinates(useGlobalCoordinates: Boolean) {
        _icall_Unit_Boolean(setUseGlobalCoordinatesMethodBind, this.rawMemory, useGlobalCoordinates)
    }


    private val getUseGlobalCoordinatesMethodBind: CPointer<godot_method_bind> by lazy { getMB("RemoteTransform2D", "get_use_global_coordinates") }
    open fun getUseGlobalCoordinates(): Boolean {
        return _icall_Boolean(getUseGlobalCoordinatesMethodBind, this.rawMemory)
    }


    private val setUpdatePositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("RemoteTransform2D", "set_update_position") }
    open fun setUpdatePosition(updateRemotePosition: Boolean) {
        _icall_Unit_Boolean(setUpdatePositionMethodBind, this.rawMemory, updateRemotePosition)
    }


    private val getUpdatePositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("RemoteTransform2D", "get_update_position") }
    open fun getUpdatePosition(): Boolean {
        return _icall_Boolean(getUpdatePositionMethodBind, this.rawMemory)
    }


    private val setUpdateRotationMethodBind: CPointer<godot_method_bind> by lazy { getMB("RemoteTransform2D", "set_update_rotation") }
    open fun setUpdateRotation(updateRemoteRotation: Boolean) {
        _icall_Unit_Boolean(setUpdateRotationMethodBind, this.rawMemory, updateRemoteRotation)
    }


    private val getUpdateRotationMethodBind: CPointer<godot_method_bind> by lazy { getMB("RemoteTransform2D", "get_update_rotation") }
    open fun getUpdateRotation(): Boolean {
        return _icall_Boolean(getUpdateRotationMethodBind, this.rawMemory)
    }


    private val setUpdateScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("RemoteTransform2D", "set_update_scale") }
    open fun setUpdateScale(updateRemoteScale: Boolean) {
        _icall_Unit_Boolean(setUpdateScaleMethodBind, this.rawMemory, updateRemoteScale)
    }


    private val getUpdateScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("RemoteTransform2D", "get_update_scale") }
    open fun getUpdateScale(): Boolean {
        return _icall_Boolean(getUpdateScaleMethodBind, this.rawMemory)
    }


}
