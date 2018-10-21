@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AnimationNodeBlendSpace1D : AnimationRootNode {
    constructor() : super("AnimationNodeBlendSpace1D")
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
        infix fun from(other: AnimationRootNode): AnimationNodeBlendSpace1D = AnimationNodeBlendSpace1D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: AnimationNode): AnimationNodeBlendSpace1D = AnimationNodeBlendSpace1D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): AnimationNodeBlendSpace1D = AnimationNodeBlendSpace1D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): AnimationNodeBlendSpace1D = AnimationNodeBlendSpace1D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AnimationNodeBlendSpace1D = AnimationNodeBlendSpace1D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AnimationNodeBlendSpace1D = fromVariant(AnimationNodeBlendSpace1D(""), other)


        // Constants


    }


    // Properties
    open val blendPoint0_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 0)


    open var blendPoint0_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 0, value)


    open val blendPoint1_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 1)


    open var blendPoint1_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 1, value)


    open val blendPoint2_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 2)


    open var blendPoint2_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 2, value)


    open val blendPoint3_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 3)


    open var blendPoint3_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 3, value)


    open val blendPoint4_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 4)


    open var blendPoint4_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 4)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 4, value)


    open val blendPoint5_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 5)


    open var blendPoint5_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 5)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 5, value)


    open val blendPoint6_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 6)


    open var blendPoint6_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 6)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 6, value)


    open val blendPoint7_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 7)


    open var blendPoint7_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 7)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 7, value)


    open val blendPoint8_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 8)


    open var blendPoint8_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 8)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 8, value)


    open val blendPoint9_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 9)


    open var blendPoint9_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 9)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 9, value)


    open val blendPoint10_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 10)


    open var blendPoint10_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 10)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 10, value)


    open val blendPoint11_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 11)


    open var blendPoint11_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 11)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 11, value)


    open val blendPoint12_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 12)


    open var blendPoint12_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 12)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 12, value)


    open val blendPoint13_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 13)


    open var blendPoint13_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 13)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 13, value)


    open val blendPoint14_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 14)


    open var blendPoint14_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 14)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 14, value)


    open val blendPoint15_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 15)


    open var blendPoint15_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 15)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 15, value)


    open val blendPoint16_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 16)


    open var blendPoint16_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 16)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 16, value)


    open val blendPoint17_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 17)


    open var blendPoint17_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 17)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 17, value)


    open val blendPoint18_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 18)


    open var blendPoint18_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 18)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 18, value)


    open val blendPoint19_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 19)


    open var blendPoint19_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 19)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 19, value)


    open val blendPoint20_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 20)


    open var blendPoint20_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 20)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 20, value)


    open val blendPoint21_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 21)


    open var blendPoint21_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 21)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 21, value)


    open val blendPoint22_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 22)


    open var blendPoint22_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 22)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 22, value)


    open val blendPoint23_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 23)


    open var blendPoint23_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 23)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 23, value)


    open val blendPoint24_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 24)


    open var blendPoint24_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 24)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 24, value)


    open val blendPoint25_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 25)


    open var blendPoint25_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 25)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 25, value)


    open val blendPoint26_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 26)


    open var blendPoint26_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 26)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 26, value)


    open val blendPoint27_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 27)


    open var blendPoint27_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 27)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 27, value)


    open val blendPoint28_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 28)


    open var blendPoint28_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 28)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 28, value)


    open val blendPoint29_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 29)


    open var blendPoint29_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 29)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 29, value)


    open val blendPoint30_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 30)


    open var blendPoint30_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 30)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 30, value)


    open val blendPoint31_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 31)


    open var blendPoint31_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 31)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 31, value)


    open val blendPoint32_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 32)


    open var blendPoint32_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 32)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 32, value)


    open val blendPoint33_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 33)


    open var blendPoint33_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 33)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 33, value)


    open val blendPoint34_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 34)


    open var blendPoint34_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 34)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 34, value)


    open val blendPoint35_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 35)


    open var blendPoint35_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 35)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 35, value)


    open val blendPoint36_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 36)


    open var blendPoint36_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 36)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 36, value)


    open val blendPoint37_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 37)


    open var blendPoint37_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 37)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 37, value)


    open val blendPoint38_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 38)


    open var blendPoint38_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 38)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 38, value)


    open val blendPoint39_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 39)


    open var blendPoint39_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 39)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 39, value)


    open val blendPoint40_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 40)


    open var blendPoint40_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 40)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 40, value)


    open val blendPoint41_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 41)


    open var blendPoint41_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 41)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 41, value)


    open val blendPoint42_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 42)


    open var blendPoint42_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 42)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 42, value)


    open val blendPoint43_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 43)


    open var blendPoint43_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 43)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 43, value)


    open val blendPoint44_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 44)


    open var blendPoint44_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 44)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 44, value)


    open val blendPoint45_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 45)


    open var blendPoint45_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 45)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 45, value)


    open val blendPoint46_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 46)


    open var blendPoint46_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 46)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 46, value)


    open val blendPoint47_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 47)


    open var blendPoint47_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 47)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 47, value)


    open val blendPoint48_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 48)


    open var blendPoint48_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 48)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 48, value)


    open val blendPoint49_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 49)


    open var blendPoint49_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 49)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 49, value)


    open val blendPoint50_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 50)


    open var blendPoint50_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 50)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 50, value)


    open val blendPoint51_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 51)


    open var blendPoint51_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 51)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 51, value)


    open val blendPoint52_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 52)


    open var blendPoint52_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 52)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 52, value)


    open val blendPoint53_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 53)


    open var blendPoint53_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 53)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 53, value)


    open val blendPoint54_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 54)


    open var blendPoint54_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 54)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 54, value)


    open val blendPoint55_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 55)


    open var blendPoint55_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 55)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 55, value)


    open val blendPoint56_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 56)


    open var blendPoint56_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 56)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 56, value)


    open val blendPoint57_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 57)


    open var blendPoint57_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 57)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 57, value)


    open val blendPoint58_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 58)


    open var blendPoint58_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 58)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 58, value)


    open val blendPoint59_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 59)


    open var blendPoint59_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 59)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 59, value)


    open val blendPoint60_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 60)


    open var blendPoint60_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 60)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 60, value)


    open val blendPoint61_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 61)


    open var blendPoint61_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 61)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 61, value)


    open val blendPoint62_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 62)


    open var blendPoint62_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 62)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 62, value)


    open val blendPoint63_node: AnimationRootNode
        get() = _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, 63)


    open var blendPoint63_pos: Double
        get() = _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, 63)
        set(value) = _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, 63, value)


    open var minSpace: Double
        get() = _icall_Double(getMinSpaceMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setMinSpaceMethodBind, this.rawMemory, value)


    open var maxSpace: Double
        get() = _icall_Double(getMaxSpaceMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setMaxSpaceMethodBind, this.rawMemory, value)


    open var snap: Double
        get() = _icall_Double(getSnapMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setSnapMethodBind, this.rawMemory, value)


    open var blendPos: Double
        get() = _icall_Double(getBlendPosMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setBlendPosMethodBind, this.rawMemory, value)


    open var valueLabel: String
        get() = _icall_String(getValueLabelMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setValueLabelMethodBind, this.rawMemory, value)




    // Methods
    private val addBlendPointMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendSpace1D", "add_blend_point") }
    open fun addBlendPoint(node: AnimationRootNode, pos: Double, atIndex: Long = -1) {
        _icall_Unit_Object_Double_Long(addBlendPointMethodBind, this.rawMemory, node, pos, atIndex)
    }


    private val setBlendPointPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendSpace1D", "set_blend_point_position") }
    open fun setBlendPointPosition(point: Long, pos: Double) {
        _icall_Unit_Long_Double(setBlendPointPositionMethodBind, this.rawMemory, point, pos)
    }


    private val getBlendPointPositionMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendSpace1D", "get_blend_point_position") }
    open fun getBlendPointPosition(point: Long): Double {
        return _icall_Double_Long(getBlendPointPositionMethodBind, this.rawMemory, point)
    }


    private val setBlendPointNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendSpace1D", "set_blend_point_node") }
    open fun setBlendPointNode(point: Long, node: AnimationRootNode) {
        _icall_Unit_Long_Object(setBlendPointNodeMethodBind, this.rawMemory, point, node)
    }


    private val getBlendPointNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendSpace1D", "get_blend_point_node") }
    open fun getBlendPointNode(point: Long): AnimationRootNode {
        return _icall_AnimationRootNode_Long(getBlendPointNodeMethodBind, this.rawMemory, point)
    }


    private val removeBlendPointMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendSpace1D", "remove_blend_point") }
    open fun removeBlendPoint(point: Long) {
        _icall_Unit_Long(removeBlendPointMethodBind, this.rawMemory, point)
    }


    private val getBlendPointCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendSpace1D", "get_blend_point_count") }
    open fun getBlendPointCount(): Long {
        return _icall_Long(getBlendPointCountMethodBind, this.rawMemory)
    }


    private val setMinSpaceMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendSpace1D", "set_min_space") }
    open fun setMinSpace(minSpace: Double) {
        _icall_Unit_Double(setMinSpaceMethodBind, this.rawMemory, minSpace)
    }


    private val getMinSpaceMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendSpace1D", "get_min_space") }
    open fun getMinSpace(): Double {
        return _icall_Double(getMinSpaceMethodBind, this.rawMemory)
    }


    private val setMaxSpaceMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendSpace1D", "set_max_space") }
    open fun setMaxSpace(maxSpace: Double) {
        _icall_Unit_Double(setMaxSpaceMethodBind, this.rawMemory, maxSpace)
    }


    private val getMaxSpaceMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendSpace1D", "get_max_space") }
    open fun getMaxSpace(): Double {
        return _icall_Double(getMaxSpaceMethodBind, this.rawMemory)
    }


    private val setSnapMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendSpace1D", "set_snap") }
    open fun setSnap(snap: Double) {
        _icall_Unit_Double(setSnapMethodBind, this.rawMemory, snap)
    }


    private val getSnapMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendSpace1D", "get_snap") }
    open fun getSnap(): Double {
        return _icall_Double(getSnapMethodBind, this.rawMemory)
    }


    private val setBlendPosMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendSpace1D", "set_blend_pos") }
    open fun setBlendPos(pos: Double) {
        _icall_Unit_Double(setBlendPosMethodBind, this.rawMemory, pos)
    }


    private val getBlendPosMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendSpace1D", "get_blend_pos") }
    open fun getBlendPos(): Double {
        return _icall_Double(getBlendPosMethodBind, this.rawMemory)
    }


    private val setValueLabelMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendSpace1D", "set_value_label") }
    open fun setValueLabel(text: String) {
        _icall_Unit_String(setValueLabelMethodBind, this.rawMemory, text)
    }


    private val getValueLabelMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeBlendSpace1D", "get_value_label") }
    open fun getValueLabel(): String {
        return _icall_String(getValueLabelMethodBind, this.rawMemory)
    }


    open fun _add_blend_point(index: Long, node: AnimationRootNode) {
    }


}
