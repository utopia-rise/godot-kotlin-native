@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ResourceSaver : Object {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class SaverFlags(val id: Long) {
        FLAG_RELATIVE_PATHS(1),
        FLAG_BUNDLE_RESOURCES(2),
        FLAG_CHANGE_PATH(4),
        FLAG_OMIT_EDITOR_PROPERTIES(8),
        FLAG_SAVE_BIG_ENDIAN(16),
        FLAG_COMPRESS(32),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
        }
    }


    @ThreadLocal    companion object {
        infix fun from(other: Object): ResourceSaver = ResourceSaver("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ResourceSaver = fromVariant(ResourceSaver(""), other)


        // Constants
        const val FLAG_RELATIVE_PATHS: Long = 1
        const val FLAG_BUNDLE_RESOURCES: Long = 2
        const val FLAG_CHANGE_PATH: Long = 4
        const val FLAG_OMIT_EDITOR_PROPERTIES: Long = 8
        const val FLAG_SAVE_BIG_ENDIAN: Long = 16
        const val FLAG_COMPRESS: Long = 32


        private val rawMemory: COpaquePointer by lazy { getSingleton("ResourceSaver", "_ResourceSaver") }


        // Properties


        // Methods
        private val saveMethodBind: CPointer<godot_method_bind> by lazy { getMB("_ResourceSaver", "save") }
        fun save(path: String, resource: Resource, flags: Long = 0): GodotError {
            return GodotError.fromInt(_icall_Long_String_Object_Long(saveMethodBind, this.rawMemory, path, resource, flags))
        }


        private val getRecognizedExtensionsMethodBind: CPointer<godot_method_bind> by lazy { getMB("_ResourceSaver", "get_recognized_extensions") }
        fun getRecognizedExtensions(type: Resource): PoolStringArray {
            return _icall_PoolStringArray_Object(getRecognizedExtensionsMethodBind, this.rawMemory, type)
        }


    }
}
