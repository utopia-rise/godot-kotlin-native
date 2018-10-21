@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class CollisionPolygon2D : Node2D {
    constructor() : super("CollisionPolygon2D")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class BuildMode(val id: Long) {
        BUILD_SOLIDS(0),
        BUILD_SEGMENTS(1),
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


    companion object {
        infix fun from(other: Node2D): CollisionPolygon2D = CollisionPolygon2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): CollisionPolygon2D = CollisionPolygon2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): CollisionPolygon2D = CollisionPolygon2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): CollisionPolygon2D = CollisionPolygon2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): CollisionPolygon2D = fromVariant(CollisionPolygon2D(""), other)


        // Constants
        const val BUILD_SOLIDS: Long = 0
        const val BUILD_SEGMENTS: Long = 1


    }


    // Properties
    open var buildMode: Long
        get() = _icall_Long(getBuildModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setBuildModeMethodBind, this.rawMemory, value)


    open var polygon: PoolVector2Array
        get() = _icall_PoolVector2Array(getPolygonMethodBind, this.rawMemory)
        set(value) = _icall_Unit_PoolVector2Array(setPolygonMethodBind, this.rawMemory, value)


    open var disabled: Boolean
        get() = _icall_Boolean(isDisabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setDisabledMethodBind, this.rawMemory, value)


    open var oneWayCollision: Boolean
        get() = _icall_Boolean(isOneWayCollisionEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setOneWayCollisionMethodBind, this.rawMemory, value)




    // Methods
    private val setPolygonMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionPolygon2D", "set_polygon") }
    open fun setPolygon(polygon: PoolVector2Array) {
        _icall_Unit_PoolVector2Array(setPolygonMethodBind, this.rawMemory, polygon)
    }


    private val getPolygonMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionPolygon2D", "get_polygon") }
    open fun getPolygon(): PoolVector2Array {
        return _icall_PoolVector2Array(getPolygonMethodBind, this.rawMemory)
    }


    private val setBuildModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionPolygon2D", "set_build_mode") }
    open fun setBuildMode(buildMode: Long) {
        _icall_Unit_Long(setBuildModeMethodBind, this.rawMemory, buildMode)
    }


    private val getBuildModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionPolygon2D", "get_build_mode") }
    open fun getBuildMode(): CollisionPolygon2D.BuildMode {
        return CollisionPolygon2D.BuildMode.fromInt(_icall_Long(getBuildModeMethodBind, this.rawMemory))
    }


    private val setDisabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionPolygon2D", "set_disabled") }
    open fun setDisabled(disabled: Boolean) {
        _icall_Unit_Boolean(setDisabledMethodBind, this.rawMemory, disabled)
    }


    private val isDisabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionPolygon2D", "is_disabled") }
    open fun isDisabled(): Boolean {
        return _icall_Boolean(isDisabledMethodBind, this.rawMemory)
    }


    private val setOneWayCollisionMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionPolygon2D", "set_one_way_collision") }
    open fun setOneWayCollision(enabled: Boolean) {
        _icall_Unit_Boolean(setOneWayCollisionMethodBind, this.rawMemory, enabled)
    }


    private val isOneWayCollisionEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("CollisionPolygon2D", "is_one_way_collision_enabled") }
    open fun isOneWayCollisionEnabled(): Boolean {
        return _icall_Boolean(isOneWayCollisionEnabledMethodBind, this.rawMemory)
    }


}
