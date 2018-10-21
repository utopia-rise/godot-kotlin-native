@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class EditorResourcePreview : Node {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
            const val PREVIEW_INVALIDATED: String = "preview_invalidated"
        }
    }


    companion object {
        infix fun from(other: Node): EditorResourcePreview = EditorResourcePreview("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): EditorResourcePreview = EditorResourcePreview("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): EditorResourcePreview = fromVariant(EditorResourcePreview(""), other)


        // Constants


    }


    // Properties


    // Methods
    open fun _preview_ready(arg0: String, arg1: Texture, arg2: Long, arg3: String, arg4: Variant) {
    }


    private val queueResourcePreviewMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorResourcePreview", "queue_resource_preview") }
    open fun queueResourcePreview(path: String, receiver: Object, receiverFunc: String, userdata: Variant) {
        _icall_Unit_String_Object_String_Variant(queueResourcePreviewMethodBind, this.rawMemory, path, receiver, receiverFunc, userdata)
    }


    private val queueEditedResourcePreviewMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorResourcePreview", "queue_edited_resource_preview") }
    open fun queueEditedResourcePreview(resource: Resource, receiver: Object, receiverFunc: String, userdata: Variant) {
        _icall_Unit_Object_Object_String_Variant(queueEditedResourcePreviewMethodBind, this.rawMemory, resource, receiver, receiverFunc, userdata)
    }


    private val addPreviewGeneratorMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorResourcePreview", "add_preview_generator") }
    open fun addPreviewGenerator(generator: EditorResourcePreviewGenerator) {
        _icall_Unit_Object(addPreviewGeneratorMethodBind, this.rawMemory, generator)
    }


    private val removePreviewGeneratorMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorResourcePreview", "remove_preview_generator") }
    open fun removePreviewGenerator(generator: EditorResourcePreviewGenerator) {
        _icall_Unit_Object(removePreviewGeneratorMethodBind, this.rawMemory, generator)
    }


    private val checkForInvalidationMethodBind: CPointer<godot_method_bind> by lazy { getMB("EditorResourcePreview", "check_for_invalidation") }
    open fun checkForInvalidation(path: String) {
        _icall_Unit_String(checkForInvalidationMethodBind, this.rawMemory, path)
    }


}
