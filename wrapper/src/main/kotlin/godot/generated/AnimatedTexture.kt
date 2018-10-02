@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AnimatedTexture : Texture {
    constructor() : super("AnimatedTexture")
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
        infix fun from(other: Texture): AnimatedTexture = AnimatedTexture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): AnimatedTexture = AnimatedTexture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): AnimatedTexture = AnimatedTexture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AnimatedTexture = AnimatedTexture("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AnimatedTexture = fromVariant(AnimatedTexture(""), other)


        // Constants


    }


    // Properties
    open var frames: Int
        get() = _icall_Int(getFramesMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setFramesMethodBind, this.rawMemory, value)


    open var fps: Float
        get() = _icall_Float(getFpsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setFpsMethodBind, this.rawMemory, value)


    open var frame0_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 0, value)


    open var frame0_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 0)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 0, value)


    open var frame1_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 1, value)


    open var frame1_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 1)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 1, value)


    open var frame2_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 2, value)


    open var frame2_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 2)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 2, value)


    open var frame3_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 3, value)


    open var frame3_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 3)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 3, value)


    open var frame4_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 4)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 4, value)


    open var frame4_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 4)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 4, value)


    open var frame5_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 5)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 5, value)


    open var frame5_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 5)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 5, value)


    open var frame6_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 6)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 6, value)


    open var frame6_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 6)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 6, value)


    open var frame7_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 7)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 7, value)


    open var frame7_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 7)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 7, value)


    open var frame8_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 8)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 8, value)


    open var frame8_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 8)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 8, value)


    open var frame9_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 9)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 9, value)


    open var frame9_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 9)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 9, value)


    open var frame10_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 10)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 10, value)


    open var frame10_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 10)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 10, value)


    open var frame11_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 11)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 11, value)


    open var frame11_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 11)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 11, value)


    open var frame12_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 12)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 12, value)


    open var frame12_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 12)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 12, value)


    open var frame13_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 13)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 13, value)


    open var frame13_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 13)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 13, value)


    open var frame14_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 14)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 14, value)


    open var frame14_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 14)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 14, value)


    open var frame15_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 15)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 15, value)


    open var frame15_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 15)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 15, value)


    open var frame16_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 16)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 16, value)


    open var frame16_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 16)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 16, value)


    open var frame17_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 17)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 17, value)


    open var frame17_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 17)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 17, value)


    open var frame18_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 18)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 18, value)


    open var frame18_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 18)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 18, value)


    open var frame19_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 19)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 19, value)


    open var frame19_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 19)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 19, value)


    open var frame20_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 20)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 20, value)


    open var frame20_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 20)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 20, value)


    open var frame21_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 21)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 21, value)


    open var frame21_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 21)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 21, value)


    open var frame22_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 22)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 22, value)


    open var frame22_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 22)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 22, value)


    open var frame23_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 23)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 23, value)


    open var frame23_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 23)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 23, value)


    open var frame24_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 24)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 24, value)


    open var frame24_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 24)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 24, value)


    open var frame25_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 25)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 25, value)


    open var frame25_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 25)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 25, value)


    open var frame26_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 26)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 26, value)


    open var frame26_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 26)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 26, value)


    open var frame27_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 27)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 27, value)


    open var frame27_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 27)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 27, value)


    open var frame28_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 28)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 28, value)


    open var frame28_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 28)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 28, value)


    open var frame29_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 29)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 29, value)


    open var frame29_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 29)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 29, value)


    open var frame30_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 30)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 30, value)


    open var frame30_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 30)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 30, value)


    open var frame31_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 31)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 31, value)


    open var frame31_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 31)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 31, value)


    open var frame32_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 32)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 32, value)


    open var frame32_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 32)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 32, value)


    open var frame33_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 33)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 33, value)


    open var frame33_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 33)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 33, value)


    open var frame34_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 34)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 34, value)


    open var frame34_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 34)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 34, value)


    open var frame35_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 35)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 35, value)


    open var frame35_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 35)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 35, value)


    open var frame36_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 36)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 36, value)


    open var frame36_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 36)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 36, value)


    open var frame37_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 37)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 37, value)


    open var frame37_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 37)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 37, value)


    open var frame38_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 38)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 38, value)


    open var frame38_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 38)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 38, value)


    open var frame39_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 39)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 39, value)


    open var frame39_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 39)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 39, value)


    open var frame40_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 40)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 40, value)


    open var frame40_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 40)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 40, value)


    open var frame41_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 41)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 41, value)


    open var frame41_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 41)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 41, value)


    open var frame42_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 42)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 42, value)


    open var frame42_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 42)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 42, value)


    open var frame43_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 43)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 43, value)


    open var frame43_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 43)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 43, value)


    open var frame44_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 44)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 44, value)


    open var frame44_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 44)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 44, value)


    open var frame45_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 45)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 45, value)


    open var frame45_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 45)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 45, value)


    open var frame46_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 46)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 46, value)


    open var frame46_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 46)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 46, value)


    open var frame47_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 47)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 47, value)


    open var frame47_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 47)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 47, value)


    open var frame48_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 48)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 48, value)


    open var frame48_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 48)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 48, value)


    open var frame49_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 49)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 49, value)


    open var frame49_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 49)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 49, value)


    open var frame50_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 50)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 50, value)


    open var frame50_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 50)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 50, value)


    open var frame51_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 51)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 51, value)


    open var frame51_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 51)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 51, value)


    open var frame52_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 52)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 52, value)


    open var frame52_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 52)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 52, value)


    open var frame53_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 53)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 53, value)


    open var frame53_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 53)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 53, value)


    open var frame54_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 54)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 54, value)


    open var frame54_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 54)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 54, value)


    open var frame55_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 55)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 55, value)


    open var frame55_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 55)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 55, value)


    open var frame56_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 56)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 56, value)


    open var frame56_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 56)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 56, value)


    open var frame57_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 57)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 57, value)


    open var frame57_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 57)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 57, value)


    open var frame58_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 58)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 58, value)


    open var frame58_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 58)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 58, value)


    open var frame59_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 59)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 59, value)


    open var frame59_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 59)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 59, value)


    open var frame60_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 60)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 60, value)


    open var frame60_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 60)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 60, value)


    open var frame61_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 61)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 61, value)


    open var frame61_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 61)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 61, value)


    open var frame62_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 62)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 62, value)


    open var frame62_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 62)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 62, value)


    open var frame63_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 63)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 63, value)


    open var frame63_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 63)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 63, value)


    open var frame64_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 64)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 64, value)


    open var frame64_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 64)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 64, value)


    open var frame65_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 65)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 65, value)


    open var frame65_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 65)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 65, value)


    open var frame66_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 66)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 66, value)


    open var frame66_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 66)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 66, value)


    open var frame67_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 67)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 67, value)


    open var frame67_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 67)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 67, value)


    open var frame68_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 68)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 68, value)


    open var frame68_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 68)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 68, value)


    open var frame69_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 69)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 69, value)


    open var frame69_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 69)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 69, value)


    open var frame70_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 70)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 70, value)


    open var frame70_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 70)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 70, value)


    open var frame71_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 71)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 71, value)


    open var frame71_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 71)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 71, value)


    open var frame72_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 72)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 72, value)


    open var frame72_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 72)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 72, value)


    open var frame73_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 73)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 73, value)


    open var frame73_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 73)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 73, value)


    open var frame74_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 74)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 74, value)


    open var frame74_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 74)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 74, value)


    open var frame75_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 75)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 75, value)


    open var frame75_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 75)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 75, value)


    open var frame76_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 76)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 76, value)


    open var frame76_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 76)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 76, value)


    open var frame77_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 77)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 77, value)


    open var frame77_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 77)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 77, value)


    open var frame78_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 78)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 78, value)


    open var frame78_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 78)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 78, value)


    open var frame79_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 79)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 79, value)


    open var frame79_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 79)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 79, value)


    open var frame80_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 80)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 80, value)


    open var frame80_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 80)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 80, value)


    open var frame81_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 81)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 81, value)


    open var frame81_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 81)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 81, value)


    open var frame82_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 82)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 82, value)


    open var frame82_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 82)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 82, value)


    open var frame83_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 83)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 83, value)


    open var frame83_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 83)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 83, value)


    open var frame84_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 84)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 84, value)


    open var frame84_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 84)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 84, value)


    open var frame85_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 85)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 85, value)


    open var frame85_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 85)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 85, value)


    open var frame86_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 86)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 86, value)


    open var frame86_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 86)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 86, value)


    open var frame87_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 87)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 87, value)


    open var frame87_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 87)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 87, value)


    open var frame88_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 88)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 88, value)


    open var frame88_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 88)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 88, value)


    open var frame89_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 89)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 89, value)


    open var frame89_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 89)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 89, value)


    open var frame90_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 90)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 90, value)


    open var frame90_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 90)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 90, value)


    open var frame91_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 91)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 91, value)


    open var frame91_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 91)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 91, value)


    open var frame92_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 92)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 92, value)


    open var frame92_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 92)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 92, value)


    open var frame93_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 93)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 93, value)


    open var frame93_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 93)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 93, value)


    open var frame94_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 94)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 94, value)


    open var frame94_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 94)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 94, value)


    open var frame95_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 95)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 95, value)


    open var frame95_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 95)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 95, value)


    open var frame96_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 96)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 96, value)


    open var frame96_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 96)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 96, value)


    open var frame97_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 97)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 97, value)


    open var frame97_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 97)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 97, value)


    open var frame98_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 98)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 98, value)


    open var frame98_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 98)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 98, value)


    open var frame99_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 99)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 99, value)


    open var frame99_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 99)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 99, value)


    open var frame100_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 100)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 100, value)


    open var frame100_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 100)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 100, value)


    open var frame101_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 101)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 101, value)


    open var frame101_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 101)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 101, value)


    open var frame102_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 102)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 102, value)


    open var frame102_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 102)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 102, value)


    open var frame103_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 103)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 103, value)


    open var frame103_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 103)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 103, value)


    open var frame104_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 104)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 104, value)


    open var frame104_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 104)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 104, value)


    open var frame105_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 105)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 105, value)


    open var frame105_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 105)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 105, value)


    open var frame106_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 106)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 106, value)


    open var frame106_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 106)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 106, value)


    open var frame107_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 107)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 107, value)


    open var frame107_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 107)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 107, value)


    open var frame108_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 108)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 108, value)


    open var frame108_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 108)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 108, value)


    open var frame109_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 109)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 109, value)


    open var frame109_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 109)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 109, value)


    open var frame110_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 110)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 110, value)


    open var frame110_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 110)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 110, value)


    open var frame111_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 111)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 111, value)


    open var frame111_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 111)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 111, value)


    open var frame112_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 112)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 112, value)


    open var frame112_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 112)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 112, value)


    open var frame113_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 113)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 113, value)


    open var frame113_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 113)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 113, value)


    open var frame114_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 114)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 114, value)


    open var frame114_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 114)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 114, value)


    open var frame115_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 115)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 115, value)


    open var frame115_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 115)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 115, value)


    open var frame116_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 116)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 116, value)


    open var frame116_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 116)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 116, value)


    open var frame117_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 117)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 117, value)


    open var frame117_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 117)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 117, value)


    open var frame118_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 118)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 118, value)


    open var frame118_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 118)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 118, value)


    open var frame119_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 119)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 119, value)


    open var frame119_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 119)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 119, value)


    open var frame120_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 120)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 120, value)


    open var frame120_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 120)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 120, value)


    open var frame121_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 121)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 121, value)


    open var frame121_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 121)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 121, value)


    open var frame122_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 122)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 122, value)


    open var frame122_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 122)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 122, value)


    open var frame123_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 123)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 123, value)


    open var frame123_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 123)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 123, value)


    open var frame124_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 124)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 124, value)


    open var frame124_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 124)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 124, value)


    open var frame125_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 125)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 125, value)


    open var frame125_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 125)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 125, value)


    open var frame126_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 126)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 126, value)


    open var frame126_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 126)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 126, value)


    open var frame127_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 127)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 127, value)


    open var frame127_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 127)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 127, value)


    open var frame128_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 128)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 128, value)


    open var frame128_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 128)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 128, value)


    open var frame129_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 129)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 129, value)


    open var frame129_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 129)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 129, value)


    open var frame130_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 130)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 130, value)


    open var frame130_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 130)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 130, value)


    open var frame131_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 131)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 131, value)


    open var frame131_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 131)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 131, value)


    open var frame132_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 132)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 132, value)


    open var frame132_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 132)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 132, value)


    open var frame133_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 133)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 133, value)


    open var frame133_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 133)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 133, value)


    open var frame134_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 134)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 134, value)


    open var frame134_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 134)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 134, value)


    open var frame135_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 135)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 135, value)


    open var frame135_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 135)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 135, value)


    open var frame136_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 136)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 136, value)


    open var frame136_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 136)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 136, value)


    open var frame137_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 137)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 137, value)


    open var frame137_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 137)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 137, value)


    open var frame138_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 138)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 138, value)


    open var frame138_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 138)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 138, value)


    open var frame139_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 139)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 139, value)


    open var frame139_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 139)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 139, value)


    open var frame140_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 140)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 140, value)


    open var frame140_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 140)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 140, value)


    open var frame141_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 141)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 141, value)


    open var frame141_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 141)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 141, value)


    open var frame142_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 142)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 142, value)


    open var frame142_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 142)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 142, value)


    open var frame143_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 143)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 143, value)


    open var frame143_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 143)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 143, value)


    open var frame144_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 144)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 144, value)


    open var frame144_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 144)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 144, value)


    open var frame145_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 145)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 145, value)


    open var frame145_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 145)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 145, value)


    open var frame146_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 146)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 146, value)


    open var frame146_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 146)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 146, value)


    open var frame147_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 147)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 147, value)


    open var frame147_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 147)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 147, value)


    open var frame148_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 148)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 148, value)


    open var frame148_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 148)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 148, value)


    open var frame149_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 149)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 149, value)


    open var frame149_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 149)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 149, value)


    open var frame150_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 150)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 150, value)


    open var frame150_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 150)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 150, value)


    open var frame151_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 151)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 151, value)


    open var frame151_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 151)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 151, value)


    open var frame152_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 152)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 152, value)


    open var frame152_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 152)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 152, value)


    open var frame153_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 153)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 153, value)


    open var frame153_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 153)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 153, value)


    open var frame154_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 154)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 154, value)


    open var frame154_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 154)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 154, value)


    open var frame155_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 155)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 155, value)


    open var frame155_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 155)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 155, value)


    open var frame156_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 156)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 156, value)


    open var frame156_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 156)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 156, value)


    open var frame157_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 157)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 157, value)


    open var frame157_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 157)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 157, value)


    open var frame158_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 158)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 158, value)


    open var frame158_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 158)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 158, value)


    open var frame159_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 159)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 159, value)


    open var frame159_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 159)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 159, value)


    open var frame160_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 160)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 160, value)


    open var frame160_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 160)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 160, value)


    open var frame161_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 161)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 161, value)


    open var frame161_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 161)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 161, value)


    open var frame162_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 162)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 162, value)


    open var frame162_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 162)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 162, value)


    open var frame163_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 163)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 163, value)


    open var frame163_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 163)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 163, value)


    open var frame164_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 164)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 164, value)


    open var frame164_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 164)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 164, value)


    open var frame165_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 165)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 165, value)


    open var frame165_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 165)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 165, value)


    open var frame166_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 166)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 166, value)


    open var frame166_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 166)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 166, value)


    open var frame167_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 167)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 167, value)


    open var frame167_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 167)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 167, value)


    open var frame168_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 168)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 168, value)


    open var frame168_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 168)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 168, value)


    open var frame169_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 169)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 169, value)


    open var frame169_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 169)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 169, value)


    open var frame170_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 170)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 170, value)


    open var frame170_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 170)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 170, value)


    open var frame171_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 171)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 171, value)


    open var frame171_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 171)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 171, value)


    open var frame172_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 172)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 172, value)


    open var frame172_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 172)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 172, value)


    open var frame173_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 173)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 173, value)


    open var frame173_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 173)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 173, value)


    open var frame174_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 174)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 174, value)


    open var frame174_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 174)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 174, value)


    open var frame175_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 175)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 175, value)


    open var frame175_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 175)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 175, value)


    open var frame176_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 176)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 176, value)


    open var frame176_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 176)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 176, value)


    open var frame177_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 177)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 177, value)


    open var frame177_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 177)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 177, value)


    open var frame178_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 178)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 178, value)


    open var frame178_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 178)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 178, value)


    open var frame179_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 179)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 179, value)


    open var frame179_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 179)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 179, value)


    open var frame180_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 180)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 180, value)


    open var frame180_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 180)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 180, value)


    open var frame181_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 181)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 181, value)


    open var frame181_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 181)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 181, value)


    open var frame182_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 182)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 182, value)


    open var frame182_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 182)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 182, value)


    open var frame183_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 183)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 183, value)


    open var frame183_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 183)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 183, value)


    open var frame184_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 184)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 184, value)


    open var frame184_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 184)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 184, value)


    open var frame185_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 185)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 185, value)


    open var frame185_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 185)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 185, value)


    open var frame186_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 186)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 186, value)


    open var frame186_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 186)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 186, value)


    open var frame187_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 187)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 187, value)


    open var frame187_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 187)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 187, value)


    open var frame188_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 188)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 188, value)


    open var frame188_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 188)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 188, value)


    open var frame189_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 189)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 189, value)


    open var frame189_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 189)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 189, value)


    open var frame190_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 190)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 190, value)


    open var frame190_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 190)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 190, value)


    open var frame191_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 191)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 191, value)


    open var frame191_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 191)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 191, value)


    open var frame192_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 192)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 192, value)


    open var frame192_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 192)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 192, value)


    open var frame193_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 193)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 193, value)


    open var frame193_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 193)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 193, value)


    open var frame194_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 194)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 194, value)


    open var frame194_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 194)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 194, value)


    open var frame195_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 195)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 195, value)


    open var frame195_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 195)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 195, value)


    open var frame196_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 196)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 196, value)


    open var frame196_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 196)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 196, value)


    open var frame197_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 197)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 197, value)


    open var frame197_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 197)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 197, value)


    open var frame198_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 198)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 198, value)


    open var frame198_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 198)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 198, value)


    open var frame199_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 199)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 199, value)


    open var frame199_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 199)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 199, value)


    open var frame200_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 200)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 200, value)


    open var frame200_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 200)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 200, value)


    open var frame201_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 201)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 201, value)


    open var frame201_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 201)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 201, value)


    open var frame202_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 202)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 202, value)


    open var frame202_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 202)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 202, value)


    open var frame203_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 203)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 203, value)


    open var frame203_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 203)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 203, value)


    open var frame204_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 204)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 204, value)


    open var frame204_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 204)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 204, value)


    open var frame205_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 205)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 205, value)


    open var frame205_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 205)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 205, value)


    open var frame206_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 206)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 206, value)


    open var frame206_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 206)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 206, value)


    open var frame207_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 207)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 207, value)


    open var frame207_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 207)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 207, value)


    open var frame208_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 208)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 208, value)


    open var frame208_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 208)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 208, value)


    open var frame209_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 209)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 209, value)


    open var frame209_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 209)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 209, value)


    open var frame210_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 210)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 210, value)


    open var frame210_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 210)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 210, value)


    open var frame211_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 211)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 211, value)


    open var frame211_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 211)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 211, value)


    open var frame212_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 212)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 212, value)


    open var frame212_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 212)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 212, value)


    open var frame213_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 213)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 213, value)


    open var frame213_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 213)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 213, value)


    open var frame214_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 214)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 214, value)


    open var frame214_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 214)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 214, value)


    open var frame215_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 215)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 215, value)


    open var frame215_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 215)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 215, value)


    open var frame216_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 216)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 216, value)


    open var frame216_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 216)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 216, value)


    open var frame217_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 217)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 217, value)


    open var frame217_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 217)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 217, value)


    open var frame218_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 218)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 218, value)


    open var frame218_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 218)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 218, value)


    open var frame219_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 219)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 219, value)


    open var frame219_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 219)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 219, value)


    open var frame220_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 220)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 220, value)


    open var frame220_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 220)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 220, value)


    open var frame221_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 221)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 221, value)


    open var frame221_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 221)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 221, value)


    open var frame222_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 222)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 222, value)


    open var frame222_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 222)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 222, value)


    open var frame223_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 223)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 223, value)


    open var frame223_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 223)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 223, value)


    open var frame224_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 224)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 224, value)


    open var frame224_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 224)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 224, value)


    open var frame225_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 225)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 225, value)


    open var frame225_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 225)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 225, value)


    open var frame226_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 226)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 226, value)


    open var frame226_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 226)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 226, value)


    open var frame227_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 227)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 227, value)


    open var frame227_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 227)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 227, value)


    open var frame228_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 228)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 228, value)


    open var frame228_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 228)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 228, value)


    open var frame229_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 229)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 229, value)


    open var frame229_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 229)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 229, value)


    open var frame230_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 230)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 230, value)


    open var frame230_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 230)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 230, value)


    open var frame231_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 231)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 231, value)


    open var frame231_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 231)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 231, value)


    open var frame232_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 232)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 232, value)


    open var frame232_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 232)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 232, value)


    open var frame233_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 233)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 233, value)


    open var frame233_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 233)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 233, value)


    open var frame234_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 234)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 234, value)


    open var frame234_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 234)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 234, value)


    open var frame235_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 235)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 235, value)


    open var frame235_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 235)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 235, value)


    open var frame236_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 236)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 236, value)


    open var frame236_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 236)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 236, value)


    open var frame237_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 237)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 237, value)


    open var frame237_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 237)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 237, value)


    open var frame238_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 238)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 238, value)


    open var frame238_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 238)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 238, value)


    open var frame239_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 239)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 239, value)


    open var frame239_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 239)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 239, value)


    open var frame240_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 240)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 240, value)


    open var frame240_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 240)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 240, value)


    open var frame241_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 241)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 241, value)


    open var frame241_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 241)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 241, value)


    open var frame242_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 242)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 242, value)


    open var frame242_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 242)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 242, value)


    open var frame243_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 243)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 243, value)


    open var frame243_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 243)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 243, value)


    open var frame244_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 244)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 244, value)


    open var frame244_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 244)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 244, value)


    open var frame245_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 245)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 245, value)


    open var frame245_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 245)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 245, value)


    open var frame246_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 246)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 246, value)


    open var frame246_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 246)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 246, value)


    open var frame247_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 247)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 247, value)


    open var frame247_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 247)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 247, value)


    open var frame248_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 248)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 248, value)


    open var frame248_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 248)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 248, value)


    open var frame249_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 249)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 249, value)


    open var frame249_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 249)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 249, value)


    open var frame250_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 250)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 250, value)


    open var frame250_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 250)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 250, value)


    open var frame251_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 251)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 251, value)


    open var frame251_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 251)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 251, value)


    open var frame252_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 252)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 252, value)


    open var frame252_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 252)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 252, value)


    open var frame253_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 253)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 253, value)


    open var frame253_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 253)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 253, value)


    open var frame254_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 254)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 254, value)


    open var frame254_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 254)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 254, value)


    open var frame255_texture: Texture
        get() = _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, 255)
        set(value) = _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, 255, value)


    open var frame255_delaySec: Float
        get() = _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, 255)
        set(value) = _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, 255, value)




    // Methods
    private val setFramesMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimatedTexture", "set_frames") }
    open fun setFrames(frames: Int) {
        _icall_Unit_Int(setFramesMethodBind, this.rawMemory, frames)
    }


    private val getFramesMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimatedTexture", "get_frames") }
    open fun getFrames(): Int {
        return _icall_Int(getFramesMethodBind, this.rawMemory)
    }


    private val setFpsMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimatedTexture", "set_fps") }
    open fun setFps(fps: Float) {
        _icall_Unit_Float(setFpsMethodBind, this.rawMemory, fps)
    }


    private val getFpsMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimatedTexture", "get_fps") }
    open fun getFps(): Float {
        return _icall_Float(getFpsMethodBind, this.rawMemory)
    }


    private val setFrameTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimatedTexture", "set_frame_texture") }
    open fun setFrameTexture(frame: Int, texture: Texture) {
        _icall_Unit_Int_Object(setFrameTextureMethodBind, this.rawMemory, frame, texture)
    }


    private val getFrameTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimatedTexture", "get_frame_texture") }
    open fun getFrameTexture(frame: Int): Texture {
        return _icall_Texture_Int(getFrameTextureMethodBind, this.rawMemory, frame)
    }


    private val setFrameDelayMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimatedTexture", "set_frame_delay") }
    open fun setFrameDelay(frame: Int, delay: Float) {
        _icall_Unit_Int_Float(setFrameDelayMethodBind, this.rawMemory, frame, delay)
    }


    private val getFrameDelayMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimatedTexture", "get_frame_delay") }
    open fun getFrameDelay(frame: Int): Float {
        return _icall_Float_Int(getFrameDelayMethodBind, this.rawMemory, frame)
    }


    open fun _update_proxy() {
    }


}
