@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AnimationNodeBlendSpace2D : AnimationRootNode {
    constructor() : super("AnimationNodeBlendSpace2D")
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
        infix fun from(other: AnimationRootNode): AnimationNodeBlendSpace2D = AnimationNodeBlendSpace2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: AnimationNode): AnimationNodeBlendSpace2D = AnimationNodeBlendSpace2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): AnimationNodeBlendSpace2D = AnimationNodeBlendSpace2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): AnimationNodeBlendSpace2D = AnimationNodeBlendSpace2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AnimationNodeBlendSpace2D = AnimationNodeBlendSpace2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AnimationNodeBlendSpace2D = fromVariant(AnimationNodeBlendSpace2D(""), other)


        // Constants


    }


    // Properties
    open var autoTriangles: Boolean
        get() = _icall_Boolean(getAutoTrianglesMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setAutoTrianglesMethodBind, this.rawMemory, value)


    open val blendPoint0_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 0)


    open var blendPoint0_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 0, value)
    open fun blendPoint0_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint0_pos.apply {
        shedule(this)
        blendPoint0_pos = this
    }


    open val blendPoint1_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 1)


    open var blendPoint1_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 1, value)
    open fun blendPoint1_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint1_pos.apply {
        shedule(this)
        blendPoint1_pos = this
    }


    open val blendPoint2_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 2)


    open var blendPoint2_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 2, value)
    open fun blendPoint2_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint2_pos.apply {
        shedule(this)
        blendPoint2_pos = this
    }


    open val blendPoint3_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 3)


    open var blendPoint3_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 3, value)
    open fun blendPoint3_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint3_pos.apply {
        shedule(this)
        blendPoint3_pos = this
    }


    open val blendPoint4_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 4)


    open var blendPoint4_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 4)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 4, value)
    open fun blendPoint4_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint4_pos.apply {
        shedule(this)
        blendPoint4_pos = this
    }


    open val blendPoint5_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 5)


    open var blendPoint5_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 5)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 5, value)
    open fun blendPoint5_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint5_pos.apply {
        shedule(this)
        blendPoint5_pos = this
    }


    open val blendPoint6_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 6)


    open var blendPoint6_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 6)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 6, value)
    open fun blendPoint6_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint6_pos.apply {
        shedule(this)
        blendPoint6_pos = this
    }


    open val blendPoint7_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 7)


    open var blendPoint7_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 7)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 7, value)
    open fun blendPoint7_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint7_pos.apply {
        shedule(this)
        blendPoint7_pos = this
    }


    open val blendPoint8_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 8)


    open var blendPoint8_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 8)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 8, value)
    open fun blendPoint8_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint8_pos.apply {
        shedule(this)
        blendPoint8_pos = this
    }


    open val blendPoint9_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 9)


    open var blendPoint9_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 9)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 9, value)
    open fun blendPoint9_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint9_pos.apply {
        shedule(this)
        blendPoint9_pos = this
    }


    open val blendPoint10_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 10)


    open var blendPoint10_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 10)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 10, value)
    open fun blendPoint10_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint10_pos.apply {
        shedule(this)
        blendPoint10_pos = this
    }


    open val blendPoint11_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 11)


    open var blendPoint11_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 11)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 11, value)
    open fun blendPoint11_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint11_pos.apply {
        shedule(this)
        blendPoint11_pos = this
    }


    open val blendPoint12_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 12)


    open var blendPoint12_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 12)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 12, value)
    open fun blendPoint12_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint12_pos.apply {
        shedule(this)
        blendPoint12_pos = this
    }


    open val blendPoint13_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 13)


    open var blendPoint13_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 13)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 13, value)
    open fun blendPoint13_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint13_pos.apply {
        shedule(this)
        blendPoint13_pos = this
    }


    open val blendPoint14_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 14)


    open var blendPoint14_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 14)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 14, value)
    open fun blendPoint14_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint14_pos.apply {
        shedule(this)
        blendPoint14_pos = this
    }


    open val blendPoint15_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 15)


    open var blendPoint15_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 15)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 15, value)
    open fun blendPoint15_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint15_pos.apply {
        shedule(this)
        blendPoint15_pos = this
    }


    open val blendPoint16_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 16)


    open var blendPoint16_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 16)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 16, value)
    open fun blendPoint16_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint16_pos.apply {
        shedule(this)
        blendPoint16_pos = this
    }


    open val blendPoint17_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 17)


    open var blendPoint17_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 17)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 17, value)
    open fun blendPoint17_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint17_pos.apply {
        shedule(this)
        blendPoint17_pos = this
    }


    open val blendPoint18_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 18)


    open var blendPoint18_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 18)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 18, value)
    open fun blendPoint18_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint18_pos.apply {
        shedule(this)
        blendPoint18_pos = this
    }


    open val blendPoint19_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 19)


    open var blendPoint19_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 19)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 19, value)
    open fun blendPoint19_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint19_pos.apply {
        shedule(this)
        blendPoint19_pos = this
    }


    open val blendPoint20_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 20)


    open var blendPoint20_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 20)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 20, value)
    open fun blendPoint20_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint20_pos.apply {
        shedule(this)
        blendPoint20_pos = this
    }


    open val blendPoint21_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 21)


    open var blendPoint21_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 21)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 21, value)
    open fun blendPoint21_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint21_pos.apply {
        shedule(this)
        blendPoint21_pos = this
    }


    open val blendPoint22_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 22)


    open var blendPoint22_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 22)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 22, value)
    open fun blendPoint22_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint22_pos.apply {
        shedule(this)
        blendPoint22_pos = this
    }


    open val blendPoint23_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 23)


    open var blendPoint23_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 23)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 23, value)
    open fun blendPoint23_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint23_pos.apply {
        shedule(this)
        blendPoint23_pos = this
    }


    open val blendPoint24_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 24)


    open var blendPoint24_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 24)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 24, value)
    open fun blendPoint24_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint24_pos.apply {
        shedule(this)
        blendPoint24_pos = this
    }


    open val blendPoint25_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 25)


    open var blendPoint25_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 25)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 25, value)
    open fun blendPoint25_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint25_pos.apply {
        shedule(this)
        blendPoint25_pos = this
    }


    open val blendPoint26_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 26)


    open var blendPoint26_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 26)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 26, value)
    open fun blendPoint26_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint26_pos.apply {
        shedule(this)
        blendPoint26_pos = this
    }


    open val blendPoint27_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 27)


    open var blendPoint27_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 27)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 27, value)
    open fun blendPoint27_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint27_pos.apply {
        shedule(this)
        blendPoint27_pos = this
    }


    open val blendPoint28_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 28)


    open var blendPoint28_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 28)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 28, value)
    open fun blendPoint28_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint28_pos.apply {
        shedule(this)
        blendPoint28_pos = this
    }


    open val blendPoint29_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 29)


    open var blendPoint29_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 29)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 29, value)
    open fun blendPoint29_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint29_pos.apply {
        shedule(this)
        blendPoint29_pos = this
    }


    open val blendPoint30_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 30)


    open var blendPoint30_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 30)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 30, value)
    open fun blendPoint30_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint30_pos.apply {
        shedule(this)
        blendPoint30_pos = this
    }


    open val blendPoint31_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 31)


    open var blendPoint31_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 31)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 31, value)
    open fun blendPoint31_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint31_pos.apply {
        shedule(this)
        blendPoint31_pos = this
    }


    open val blendPoint32_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 32)


    open var blendPoint32_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 32)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 32, value)
    open fun blendPoint32_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint32_pos.apply {
        shedule(this)
        blendPoint32_pos = this
    }


    open val blendPoint33_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 33)


    open var blendPoint33_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 33)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 33, value)
    open fun blendPoint33_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint33_pos.apply {
        shedule(this)
        blendPoint33_pos = this
    }


    open val blendPoint34_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 34)


    open var blendPoint34_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 34)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 34, value)
    open fun blendPoint34_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint34_pos.apply {
        shedule(this)
        blendPoint34_pos = this
    }


    open val blendPoint35_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 35)


    open var blendPoint35_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 35)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 35, value)
    open fun blendPoint35_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint35_pos.apply {
        shedule(this)
        blendPoint35_pos = this
    }


    open val blendPoint36_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 36)


    open var blendPoint36_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 36)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 36, value)
    open fun blendPoint36_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint36_pos.apply {
        shedule(this)
        blendPoint36_pos = this
    }


    open val blendPoint37_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 37)


    open var blendPoint37_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 37)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 37, value)
    open fun blendPoint37_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint37_pos.apply {
        shedule(this)
        blendPoint37_pos = this
    }


    open val blendPoint38_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 38)


    open var blendPoint38_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 38)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 38, value)
    open fun blendPoint38_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint38_pos.apply {
        shedule(this)
        blendPoint38_pos = this
    }


    open val blendPoint39_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 39)


    open var blendPoint39_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 39)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 39, value)
    open fun blendPoint39_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint39_pos.apply {
        shedule(this)
        blendPoint39_pos = this
    }


    open val blendPoint40_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 40)


    open var blendPoint40_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 40)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 40, value)
    open fun blendPoint40_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint40_pos.apply {
        shedule(this)
        blendPoint40_pos = this
    }


    open val blendPoint41_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 41)


    open var blendPoint41_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 41)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 41, value)
    open fun blendPoint41_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint41_pos.apply {
        shedule(this)
        blendPoint41_pos = this
    }


    open val blendPoint42_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 42)


    open var blendPoint42_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 42)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 42, value)
    open fun blendPoint42_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint42_pos.apply {
        shedule(this)
        blendPoint42_pos = this
    }


    open val blendPoint43_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 43)


    open var blendPoint43_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 43)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 43, value)
    open fun blendPoint43_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint43_pos.apply {
        shedule(this)
        blendPoint43_pos = this
    }


    open val blendPoint44_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 44)


    open var blendPoint44_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 44)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 44, value)
    open fun blendPoint44_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint44_pos.apply {
        shedule(this)
        blendPoint44_pos = this
    }


    open val blendPoint45_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 45)


    open var blendPoint45_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 45)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 45, value)
    open fun blendPoint45_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint45_pos.apply {
        shedule(this)
        blendPoint45_pos = this
    }


    open val blendPoint46_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 46)


    open var blendPoint46_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 46)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 46, value)
    open fun blendPoint46_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint46_pos.apply {
        shedule(this)
        blendPoint46_pos = this
    }


    open val blendPoint47_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 47)


    open var blendPoint47_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 47)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 47, value)
    open fun blendPoint47_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint47_pos.apply {
        shedule(this)
        blendPoint47_pos = this
    }


    open val blendPoint48_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 48)


    open var blendPoint48_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 48)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 48, value)
    open fun blendPoint48_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint48_pos.apply {
        shedule(this)
        blendPoint48_pos = this
    }


    open val blendPoint49_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 49)


    open var blendPoint49_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 49)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 49, value)
    open fun blendPoint49_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint49_pos.apply {
        shedule(this)
        blendPoint49_pos = this
    }


    open val blendPoint50_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 50)


    open var blendPoint50_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 50)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 50, value)
    open fun blendPoint50_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint50_pos.apply {
        shedule(this)
        blendPoint50_pos = this
    }


    open val blendPoint51_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 51)


    open var blendPoint51_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 51)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 51, value)
    open fun blendPoint51_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint51_pos.apply {
        shedule(this)
        blendPoint51_pos = this
    }


    open val blendPoint52_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 52)


    open var blendPoint52_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 52)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 52, value)
    open fun blendPoint52_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint52_pos.apply {
        shedule(this)
        blendPoint52_pos = this
    }


    open val blendPoint53_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 53)


    open var blendPoint53_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 53)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 53, value)
    open fun blendPoint53_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint53_pos.apply {
        shedule(this)
        blendPoint53_pos = this
    }


    open val blendPoint54_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 54)


    open var blendPoint54_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 54)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 54, value)
    open fun blendPoint54_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint54_pos.apply {
        shedule(this)
        blendPoint54_pos = this
    }


    open val blendPoint55_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 55)


    open var blendPoint55_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 55)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 55, value)
    open fun blendPoint55_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint55_pos.apply {
        shedule(this)
        blendPoint55_pos = this
    }


    open val blendPoint56_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 56)


    open var blendPoint56_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 56)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 56, value)
    open fun blendPoint56_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint56_pos.apply {
        shedule(this)
        blendPoint56_pos = this
    }


    open val blendPoint57_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 57)


    open var blendPoint57_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 57)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 57, value)
    open fun blendPoint57_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint57_pos.apply {
        shedule(this)
        blendPoint57_pos = this
    }


    open val blendPoint58_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 58)


    open var blendPoint58_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 58)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 58, value)
    open fun blendPoint58_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint58_pos.apply {
        shedule(this)
        blendPoint58_pos = this
    }


    open val blendPoint59_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 59)


    open var blendPoint59_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 59)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 59, value)
    open fun blendPoint59_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint59_pos.apply {
        shedule(this)
        blendPoint59_pos = this
    }


    open val blendPoint60_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 60)


    open var blendPoint60_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 60)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 60, value)
    open fun blendPoint60_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint60_pos.apply {
        shedule(this)
        blendPoint60_pos = this
    }


    open val blendPoint61_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 61)


    open var blendPoint61_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 61)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 61, value)
    open fun blendPoint61_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint61_pos.apply {
        shedule(this)
        blendPoint61_pos = this
    }


    open val blendPoint62_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 62)


    open var blendPoint62_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 62)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 62, value)
    open fun blendPoint62_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint62_pos.apply {
        shedule(this)
        blendPoint62_pos = this
    }


    open val blendPoint63_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 63)


    open var blendPoint63_pos: Vector2
        get() = _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, 63)
        set(value) = _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, 63, value)
    open fun blendPoint63_pos(shedule: (Vector2) -> Unit): Vector2 = blendPoint63_pos.apply {
        shedule(this)
        blendPoint63_pos = this
    }


    open var minSpace: Vector2
        get() = _icall_Vector2(getMinSpaceMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setMinSpaceMethodBind, this.rawMemory, value)
    open fun minSpace(shedule: (Vector2) -> Unit): Vector2 = minSpace.apply {
        shedule(this)
        minSpace = this
    }


    open var maxSpace: Vector2
        get() = _icall_Vector2(getMaxSpaceMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setMaxSpaceMethodBind, this.rawMemory, value)
    open fun maxSpace(shedule: (Vector2) -> Unit): Vector2 = maxSpace.apply {
        shedule(this)
        maxSpace = this
    }


    open var snap: Vector2
        get() = _icall_Vector2(getSnapMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setSnapMethodBind, this.rawMemory, value)
    open fun snap(shedule: (Vector2) -> Unit): Vector2 = snap.apply {
        shedule(this)
        snap = this
    }


    open var blendPosition: Vector2
        get() = _icall_Vector2(getBlendPositionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setBlendPositionMethodBind, this.rawMemory, value)
    open fun blendPosition(shedule: (Vector2) -> Unit): Vector2 = blendPosition.apply {
        shedule(this)
        blendPosition = this
    }


    open var xLabel: String
        get() = _icall_String(getXLabelMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setXLabelMethodBind, this.rawMemory, value)


    open var yLabel: String
        get() = _icall_String(getYLabelMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setYLabelMethodBind, this.rawMemory, value)




    // Methods
    private val addBlendPointMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendSpace2D", "add_blend_point") }
    open fun addBlendPoint(node: AnimationRootNode, pos: Vector2, atIndex: Long = -1) {
        _icall_Unit_Object_Vector2_Long(addBlendPointMethodBind, this.rawMemory, node, pos, atIndex)
    }


    private val setBlendPointPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendSpace2D", "set_blend_point_position") }
    open fun setBlendPointPosition(point: Long, pos: Vector2) {
        _icall_Unit_Long_Vector2(setBlendPointPositionMethodBind, this.rawMemory, point, pos)
    }


    private val getBlendPointPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendSpace2D", "get_blend_point_position") }
    open fun getBlendPointPosition(point: Long): Vector2 {
        return _icall_Vector2_Long(getBlendPointPositionMethodBind, this.rawMemory, point)
    }


    private val setBlendPointNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendSpace2D", "set_blend_point_node") }
    open fun setBlendPointNode(point: Long, node: AnimationRootNode) {
        _icall_Unit_Long_Object(setBlendPointNodeMethodBind, this.rawMemory, point, node)
    }


    private val getBlendPointNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendSpace2D", "get_blend_point_node") }
    open fun getBlendPointNode(point: Long): AnimationRootNode {
        return _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, point)
    }


    private val removeBlendPointMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendSpace2D", "remove_blend_point") }
    open fun removeBlendPoint(point: Long) {
        _icall_Unit_Long(removeBlendPointMethodBind, this.rawMemory, point)
    }


    private val getBlendPointCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendSpace2D", "get_blend_point_count") }
    open fun getBlendPointCount(): Long {
        return _icall_Long(getBlendPointCountMethodBind, this.rawMemory)
    }


    private val addTriangleMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendSpace2D", "add_triangle") }
    open fun addTriangle(x: Long, y: Long, z: Long, atIndex: Long = -1) {
        _icall_Unit_Long_Long_Long_Long(addTriangleMethodBind, this.rawMemory, x, y, z, atIndex)
    }


    private val getTrianglePointMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendSpace2D", "get_triangle_point") }
    open fun getTrianglePoint(triangle: Long, point: Long): Long {
        return _icall_Long_Long_Long(getTrianglePointMethodBind, this.rawMemory, triangle, point)
    }


    private val removeTriangleMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendSpace2D", "remove_triangle") }
    open fun removeTriangle(triangle: Long) {
        _icall_Unit_Long(removeTriangleMethodBind, this.rawMemory, triangle)
    }


    private val getTriangleCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendSpace2D", "get_triangle_count") }
    open fun getTriangleCount(): Long {
        return _icall_Long(getTriangleCountMethodBind, this.rawMemory)
    }


    private val setMinSpaceMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendSpace2D", "set_min_space") }
    open fun setMinSpace(minSpace: Vector2) {
        _icall_Unit_Vector2(setMinSpaceMethodBind, this.rawMemory, minSpace)
    }


    private val getMinSpaceMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendSpace2D", "get_min_space") }
    open fun getMinSpace(): Vector2 {
        return _icall_Vector2(getMinSpaceMethodBind, this.rawMemory)
    }


    private val setMaxSpaceMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendSpace2D", "set_max_space") }
    open fun setMaxSpace(maxSpace: Vector2) {
        _icall_Unit_Vector2(setMaxSpaceMethodBind, this.rawMemory, maxSpace)
    }


    private val getMaxSpaceMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendSpace2D", "get_max_space") }
    open fun getMaxSpace(): Vector2 {
        return _icall_Vector2(getMaxSpaceMethodBind, this.rawMemory)
    }


    private val setSnapMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendSpace2D", "set_snap") }
    open fun setSnap(snap: Vector2) {
        _icall_Unit_Vector2(setSnapMethodBind, this.rawMemory, snap)
    }


    private val getSnapMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendSpace2D", "get_snap") }
    open fun getSnap(): Vector2 {
        return _icall_Vector2(getSnapMethodBind, this.rawMemory)
    }


    private val setBlendPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendSpace2D", "set_blend_position") }
    open fun setBlendPosition(pos: Vector2) {
        _icall_Unit_Vector2(setBlendPositionMethodBind, this.rawMemory, pos)
    }


    private val getBlendPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendSpace2D", "get_blend_position") }
    open fun getBlendPosition(): Vector2 {
        return _icall_Vector2(getBlendPositionMethodBind, this.rawMemory)
    }


    private val setXLabelMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendSpace2D", "set_x_label") }
    open fun setXLabel(text: String) {
        _icall_Unit_String(setXLabelMethodBind, this.rawMemory, text)
    }


    private val getXLabelMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendSpace2D", "get_x_label") }
    open fun getXLabel(): String {
        return _icall_String(getXLabelMethodBind, this.rawMemory)
    }


    private val setYLabelMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendSpace2D", "set_y_label") }
    open fun setYLabel(text: String) {
        _icall_Unit_String(setYLabelMethodBind, this.rawMemory, text)
    }


    private val getYLabelMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendSpace2D", "get_y_label") }
    open fun getYLabel(): String {
        return _icall_String(getYLabelMethodBind, this.rawMemory)
    }


    open fun _add_blend_point(index: Long, node: AnimationRootNode) {
    }


    open fun _set_triangles(triangles: PoolIntArray) {
    }


    open fun _get_triangles(): PoolIntArray {
        throw NotImplementedError("_get_triangles is not implemented for AnimationNodeBlendSpace2D")
    }


    private val setAutoTrianglesMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendSpace2D", "set_auto_triangles") }
    open fun setAutoTriangles(enable: Boolean) {
        _icall_Unit_Boolean(setAutoTrianglesMethodBind, this.rawMemory, enable)
    }


    private val getAutoTrianglesMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendSpace2D", "get_auto_triangles") }
    open fun getAutoTriangles(): Boolean {
        return _icall_Boolean(getAutoTrianglesMethodBind, this.rawMemory)
    }


}
