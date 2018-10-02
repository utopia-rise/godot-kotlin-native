@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Engine : Object {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
        }
    }


    @ThreadLocal    companion object {
        infix fun from(other: Object): Engine = Engine("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Engine = fromVariant(Engine(""), other)


        // Constants


        private val rawMemory: COpaquePointer by lazy { getSingleton("Engine", "_Engine") }


        // Properties
        var editorHint: Boolean
            get() = _icall_Boolean(isEditorHintMethodBind, this.rawMemory)
            set(value) = _icall_Unit_Boolean(setEditorHintMethodBind, this.rawMemory, value)


        var iterationsPerSecond: Int
            get() = _icall_Int(getIterationsPerSecondMethodBind, this.rawMemory)
            set(value) = _icall_Unit_Int(setIterationsPerSecondMethodBind, this.rawMemory, value)


        var targetFps: Int
            get() = _icall_Int(getTargetFpsMethodBind, this.rawMemory)
            set(value) = _icall_Unit_Int(setTargetFpsMethodBind, this.rawMemory, value)


        var timeScale: Float
            get() = _icall_Float(getTimeScaleMethodBind, this.rawMemory)
            set(value) = _icall_Unit_Float(setTimeScaleMethodBind, this.rawMemory, value)


        var physicsJitterFix: Float
            get() = _icall_Float(getPhysicsJitterFixMethodBind, this.rawMemory)
            set(value) = _icall_Unit_Float(setPhysicsJitterFixMethodBind, this.rawMemory, value)




        // Methods
        private val setIterationsPerSecondMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Engine", "set_iterations_per_second") }
        fun setIterationsPerSecond(iterationsPerSecond: Int) {
            _icall_Unit_Int(setIterationsPerSecondMethodBind, this.rawMemory, iterationsPerSecond)
        }


        private val getIterationsPerSecondMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Engine", "get_iterations_per_second") }
        fun getIterationsPerSecond(): Int {
            return _icall_Int(getIterationsPerSecondMethodBind, this.rawMemory)
        }


        private val setPhysicsJitterFixMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Engine", "set_physics_jitter_fix") }
        fun setPhysicsJitterFix(physicsJitterFix: Float) {
            _icall_Unit_Float(setPhysicsJitterFixMethodBind, this.rawMemory, physicsJitterFix)
        }


        private val getPhysicsJitterFixMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Engine", "get_physics_jitter_fix") }
        fun getPhysicsJitterFix(): Float {
            return _icall_Float(getPhysicsJitterFixMethodBind, this.rawMemory)
        }


        private val setTargetFpsMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Engine", "set_target_fps") }
        fun setTargetFps(targetFps: Int) {
            _icall_Unit_Int(setTargetFpsMethodBind, this.rawMemory, targetFps)
        }


        private val getTargetFpsMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Engine", "get_target_fps") }
        fun getTargetFps(): Int {
            return _icall_Int(getTargetFpsMethodBind, this.rawMemory)
        }


        private val setTimeScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Engine", "set_time_scale") }
        fun setTimeScale(timeScale: Float) {
            _icall_Unit_Float(setTimeScaleMethodBind, this.rawMemory, timeScale)
        }


        private val getTimeScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Engine", "get_time_scale") }
        fun getTimeScale(): Float {
            return _icall_Float(getTimeScaleMethodBind, this.rawMemory)
        }


        private val getFramesDrawnMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Engine", "get_frames_drawn") }
        fun getFramesDrawn(): Int {
            return _icall_Int(getFramesDrawnMethodBind, this.rawMemory)
        }


        private val getFramesPerSecondMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Engine", "get_frames_per_second") }
        fun getFramesPerSecond(): Float {
            return _icall_Float(getFramesPerSecondMethodBind, this.rawMemory)
        }


        private val getMainLoopMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Engine", "get_main_loop") }
        fun getMainLoop(): MainLoop {
            return _icall_MainLoop(getMainLoopMethodBind, this.rawMemory)
        }


        private val getVersionInfoMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Engine", "get_version_info") }
        fun getVersionInfo(): Dictionary {
            return _icall_Dictionary(getVersionInfoMethodBind, this.rawMemory)
        }


        private val getAuthorInfoMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Engine", "get_author_info") }
        fun getAuthorInfo(): Dictionary {
            return _icall_Dictionary(getAuthorInfoMethodBind, this.rawMemory)
        }


        private val getCopyrightInfoMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Engine", "get_copyright_info") }
        fun getCopyrightInfo(): GDArray {
            return _icall_GDArray(getCopyrightInfoMethodBind, this.rawMemory)
        }


        private val getDonorInfoMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Engine", "get_donor_info") }
        fun getDonorInfo(): Dictionary {
            return _icall_Dictionary(getDonorInfoMethodBind, this.rawMemory)
        }


        private val getLicenseInfoMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Engine", "get_license_info") }
        fun getLicenseInfo(): Dictionary {
            return _icall_Dictionary(getLicenseInfoMethodBind, this.rawMemory)
        }


        private val getLicenseTextMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Engine", "get_license_text") }
        fun getLicenseText(): String {
            return _icall_String(getLicenseTextMethodBind, this.rawMemory)
        }


        private val isInPhysicsFrameMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Engine", "is_in_physics_frame") }
        fun isInPhysicsFrame(): Boolean {
            return _icall_Boolean(isInPhysicsFrameMethodBind, this.rawMemory)
        }


        private val hasSingletonMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Engine", "has_singleton") }
        fun hasSingleton(name: String): Boolean {
            return _icall_Boolean_String(hasSingletonMethodBind, this.rawMemory, name)
        }


        private val getSingletonMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Engine", "get_singleton") }
        fun getSingleton(name: String): Object {
            return _icall_Object_String(getSingletonMethodBind, this.rawMemory, name)
        }


        private val setEditorHintMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Engine", "set_editor_hint") }
        fun setEditorHint(enabled: Boolean) {
            _icall_Unit_Boolean(setEditorHintMethodBind, this.rawMemory, enabled)
        }


        private val isEditorHintMethodBind: CPointer<godot_method_bind> by lazy { getMB("_Engine", "is_editor_hint") }
        fun isEditorHint(): Boolean {
            return _icall_Boolean(isEditorHintMethodBind, this.rawMemory)
        }


    }
}
