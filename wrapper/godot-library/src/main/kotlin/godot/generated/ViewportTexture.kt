@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ViewportTexture : Texture {
    constructor() : super("ViewportTexture")
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
        infix fun from(other: Texture): ViewportTexture = ViewportTexture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): ViewportTexture = ViewportTexture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): ViewportTexture = ViewportTexture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): ViewportTexture = ViewportTexture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ViewportTexture = fromVariant(ViewportTexture(""), other)


        // Constants


    }


    // Properties
    open var viewportPath: NodePath
        get() = _icall_NodePath(getViewportPathInSceneMethodBind, this.rawMemory)
        set(value) = _icall_Unit_NodePath(setViewportPathInSceneMethodBind, this.rawMemory, value)




    // Methods
    private val setViewportPathInSceneMethodBind: CPointer<godot_method_bind> by lazy { getMB("ViewportTexture", "set_viewport_path_in_scene") }
    open fun setViewportPathInScene(path: NodePath) {
        _icall_Unit_NodePath(setViewportPathInSceneMethodBind, this.rawMemory, path)
    }


    private val getViewportPathInSceneMethodBind: CPointer<godot_method_bind> by lazy { getMB("ViewportTexture", "get_viewport_path_in_scene") }
    open fun getViewportPathInScene(): NodePath {
        return _icall_NodePath(getViewportPathInSceneMethodBind, this.rawMemory)
    }


}
