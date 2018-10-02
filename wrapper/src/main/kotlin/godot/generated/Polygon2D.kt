@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Polygon2D : Node2D {
    constructor() : super("Polygon2D")
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
        infix fun from(other: Node2D): Polygon2D = Polygon2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): Polygon2D = Polygon2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): Polygon2D = Polygon2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Polygon2D = Polygon2D("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Polygon2D = fromVariant(Polygon2D(""), other)


        // Constants


    }


    // Properties
    open var polygon: PoolVector2Array
        get() = _icall_PoolVector2Array(getPolygonMethodBind, this.rawMemory)
        set(value) = _icall_Unit_PoolVector2Array(setPolygonMethodBind, this.rawMemory, value)


    open var uv: PoolVector2Array
        get() = _icall_PoolVector2Array(getUvMethodBind, this.rawMemory)
        set(value) = _icall_Unit_PoolVector2Array(setUvMethodBind, this.rawMemory, value)


    open var splits: PoolIntArray
        get() = _icall_PoolIntArray(getSplitsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_PoolIntArray(setSplitsMethodBind, this.rawMemory, value)


    open var color: Color
        get() = _icall_Color(getColorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Color(setColorMethodBind, this.rawMemory, value)
    open fun color(shedule: (Color) -> Unit): Color = color.apply {
        shedule(this)
        color = this
    }


    open var vertexColors: PoolColorArray
        get() = _icall_PoolColorArray(getVertexColorsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_PoolColorArray(setVertexColorsMethodBind, this.rawMemory, value)


    open var offset: Vector2
        get() = _icall_Vector2(getOffsetMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setOffsetMethodBind, this.rawMemory, value)
    open fun offset(shedule: (Vector2) -> Unit): Vector2 = offset.apply {
        shedule(this)
        offset = this
    }


    open var antialiased: Boolean
        get() = _icall_Boolean(getAntialiasedMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setAntialiasedMethodBind, this.rawMemory, value)


    open var texture: Texture
        get() = _icall_Texture(getTextureMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setTextureMethodBind, this.rawMemory, value)


    open var textureOffset: Vector2
        get() = _icall_Vector2(getTextureOffsetMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setTextureOffsetMethodBind, this.rawMemory, value)
    open fun textureOffset(shedule: (Vector2) -> Unit): Vector2 = textureOffset.apply {
        shedule(this)
        textureOffset = this
    }


    open var textureScale: Vector2
        get() = _icall_Vector2(getTextureScaleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector2(setTextureScaleMethodBind, this.rawMemory, value)
    open fun textureScale(shedule: (Vector2) -> Unit): Vector2 = textureScale.apply {
        shedule(this)
        textureScale = this
    }


    open var textureRotationDegrees: Double
        get() = _icall_Double(getTextureRotationDegreesMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setTextureRotationDegreesMethodBind, this.rawMemory, value)


    open var textureRotation: Double
        get() = _icall_Double(getTextureRotationMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setTextureRotationMethodBind, this.rawMemory, value)


    open var skeleton: NodePath
        get() = _icall_NodePath(getSkeletonMethodBind, this.rawMemory)
        set(value) = _icall_Unit_NodePath(setSkeletonMethodBind, this.rawMemory, value)


    open var invertEnable: Boolean
        get() = _icall_Boolean(getInvertMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setInvertMethodBind, this.rawMemory, value)


    open var invertBorder: Double
        get() = _icall_Double(getInvertBorderMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setInvertBorderMethodBind, this.rawMemory, value)




    // Methods
    private val setPolygonMethodBind: CPointer<godot_method_bind> by lazy { getMB("Polygon2D", "set_polygon") }
    open fun setPolygon(polygon: PoolVector2Array) {
        _icall_Unit_PoolVector2Array(setPolygonMethodBind, this.rawMemory, polygon)
    }


    private val getPolygonMethodBind: CPointer<godot_method_bind> by lazy { getMB("Polygon2D", "get_polygon") }
    open fun getPolygon(): PoolVector2Array {
        return _icall_PoolVector2Array(getPolygonMethodBind, this.rawMemory)
    }


    private val setUvMethodBind: CPointer<godot_method_bind> by lazy { getMB("Polygon2D", "set_uv") }
    open fun setUv(uv: PoolVector2Array) {
        _icall_Unit_PoolVector2Array(setUvMethodBind, this.rawMemory, uv)
    }


    private val getUvMethodBind: CPointer<godot_method_bind> by lazy { getMB("Polygon2D", "get_uv") }
    open fun getUv(): PoolVector2Array {
        return _icall_PoolVector2Array(getUvMethodBind, this.rawMemory)
    }


    private val setColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("Polygon2D", "set_color") }
    open fun setColor(color: Color) {
        _icall_Unit_Color(setColorMethodBind, this.rawMemory, color)
    }


    private val getColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("Polygon2D", "get_color") }
    open fun getColor(): Color {
        return _icall_Color(getColorMethodBind, this.rawMemory)
    }


    private val setSplitsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Polygon2D", "set_splits") }
    open fun setSplits(splits: PoolIntArray) {
        _icall_Unit_PoolIntArray(setSplitsMethodBind, this.rawMemory, splits)
    }


    private val getSplitsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Polygon2D", "get_splits") }
    open fun getSplits(): PoolIntArray {
        return _icall_PoolIntArray(getSplitsMethodBind, this.rawMemory)
    }


    private val setVertexColorsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Polygon2D", "set_vertex_colors") }
    open fun setVertexColors(vertexColors: PoolColorArray) {
        _icall_Unit_PoolColorArray(setVertexColorsMethodBind, this.rawMemory, vertexColors)
    }


    private val getVertexColorsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Polygon2D", "get_vertex_colors") }
    open fun getVertexColors(): PoolColorArray {
        return _icall_PoolColorArray(getVertexColorsMethodBind, this.rawMemory)
    }


    private val setTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("Polygon2D", "set_texture") }
    open fun setTexture(texture: Texture) {
        _icall_Unit_Object(setTextureMethodBind, this.rawMemory, texture)
    }


    private val getTextureMethodBind: CPointer<godot_method_bind> by lazy { getMB("Polygon2D", "get_texture") }
    open fun getTexture(): Texture {
        return _icall_Texture(getTextureMethodBind, this.rawMemory)
    }


    private val setTextureOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("Polygon2D", "set_texture_offset") }
    open fun setTextureOffset(textureOffset: Vector2) {
        _icall_Unit_Vector2(setTextureOffsetMethodBind, this.rawMemory, textureOffset)
    }


    private val getTextureOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("Polygon2D", "get_texture_offset") }
    open fun getTextureOffset(): Vector2 {
        return _icall_Vector2(getTextureOffsetMethodBind, this.rawMemory)
    }


    private val setTextureRotationMethodBind: CPointer<godot_method_bind> by lazy { getMB("Polygon2D", "set_texture_rotation") }
    open fun setTextureRotation(textureRotation: Double) {
        _icall_Unit_Double(setTextureRotationMethodBind, this.rawMemory, textureRotation)
    }


    private val getTextureRotationMethodBind: CPointer<godot_method_bind> by lazy { getMB("Polygon2D", "get_texture_rotation") }
    open fun getTextureRotation(): Double {
        return _icall_Double(getTextureRotationMethodBind, this.rawMemory)
    }


    private val setTextureRotationDegreesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Polygon2D", "set_texture_rotation_degrees") }
    open fun setTextureRotationDegrees(textureRotation: Double) {
        _icall_Unit_Double(setTextureRotationDegreesMethodBind, this.rawMemory, textureRotation)
    }


    private val getTextureRotationDegreesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Polygon2D", "get_texture_rotation_degrees") }
    open fun getTextureRotationDegrees(): Double {
        return _icall_Double(getTextureRotationDegreesMethodBind, this.rawMemory)
    }


    private val setTextureScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Polygon2D", "set_texture_scale") }
    open fun setTextureScale(textureScale: Vector2) {
        _icall_Unit_Vector2(setTextureScaleMethodBind, this.rawMemory, textureScale)
    }


    private val getTextureScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Polygon2D", "get_texture_scale") }
    open fun getTextureScale(): Vector2 {
        return _icall_Vector2(getTextureScaleMethodBind, this.rawMemory)
    }


    private val setInvertMethodBind: CPointer<godot_method_bind> by lazy { getMB("Polygon2D", "set_invert") }
    open fun setInvert(invert: Boolean) {
        _icall_Unit_Boolean(setInvertMethodBind, this.rawMemory, invert)
    }


    private val getInvertMethodBind: CPointer<godot_method_bind> by lazy { getMB("Polygon2D", "get_invert") }
    open fun getInvert(): Boolean {
        return _icall_Boolean(getInvertMethodBind, this.rawMemory)
    }


    private val setAntialiasedMethodBind: CPointer<godot_method_bind> by lazy { getMB("Polygon2D", "set_antialiased") }
    open fun setAntialiased(antialiased: Boolean) {
        _icall_Unit_Boolean(setAntialiasedMethodBind, this.rawMemory, antialiased)
    }


    private val getAntialiasedMethodBind: CPointer<godot_method_bind> by lazy { getMB("Polygon2D", "get_antialiased") }
    open fun getAntialiased(): Boolean {
        return _icall_Boolean(getAntialiasedMethodBind, this.rawMemory)
    }


    private val setInvertBorderMethodBind: CPointer<godot_method_bind> by lazy { getMB("Polygon2D", "set_invert_border") }
    open fun setInvertBorder(invertBorder: Double) {
        _icall_Unit_Double(setInvertBorderMethodBind, this.rawMemory, invertBorder)
    }


    private val getInvertBorderMethodBind: CPointer<godot_method_bind> by lazy { getMB("Polygon2D", "get_invert_border") }
    open fun getInvertBorder(): Double {
        return _icall_Double(getInvertBorderMethodBind, this.rawMemory)
    }


    private val setOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("Polygon2D", "set_offset") }
    open fun setOffset(offset: Vector2) {
        _icall_Unit_Vector2(setOffsetMethodBind, this.rawMemory, offset)
    }


    private val getOffsetMethodBind: CPointer<godot_method_bind> by lazy { getMB("Polygon2D", "get_offset") }
    open fun getOffset(): Vector2 {
        return _icall_Vector2(getOffsetMethodBind, this.rawMemory)
    }


    private val addBoneMethodBind: CPointer<godot_method_bind> by lazy { getMB("Polygon2D", "add_bone") }
    open fun addBone(path: NodePath, weights: PoolRealArray) {
        _icall_Unit_NodePath_PoolRealArray(addBoneMethodBind, this.rawMemory, path, weights)
    }


    private val getBoneCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("Polygon2D", "get_bone_count") }
    open fun getBoneCount(): Long {
        return _icall_Long(getBoneCountMethodBind, this.rawMemory)
    }


    private val getBonePathMethodBind: CPointer<godot_method_bind> by lazy { getMB("Polygon2D", "get_bone_path") }
    open fun getBonePath(index: Long): NodePath {
        return _icall_NodePath_Long(getBonePathMethodBind, this.rawMemory, index)
    }


    private val getBoneWeightsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Polygon2D", "get_bone_weights") }
    open fun getBoneWeights(index: Long): PoolRealArray {
        return _icall_PoolRealArray_Long(getBoneWeightsMethodBind, this.rawMemory, index)
    }


    private val eraseBoneMethodBind: CPointer<godot_method_bind> by lazy { getMB("Polygon2D", "erase_bone") }
    open fun eraseBone(index: Long) {
        _icall_Unit_Long(eraseBoneMethodBind, this.rawMemory, index)
    }


    private val clearBonesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Polygon2D", "clear_bones") }
    open fun clearBones() {
        _icall_Unit(clearBonesMethodBind, this.rawMemory)
    }


    private val setBonePathMethodBind: CPointer<godot_method_bind> by lazy { getMB("Polygon2D", "set_bone_path") }
    open fun setBonePath(index: Long, path: NodePath) {
        _icall_Unit_Long_NodePath(setBonePathMethodBind, this.rawMemory, index, path)
    }


    private val setBoneWeightsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Polygon2D", "set_bone_weights") }
    open fun setBoneWeights(index: Long, weights: PoolRealArray) {
        _icall_Unit_Long_PoolRealArray(setBoneWeightsMethodBind, this.rawMemory, index, weights)
    }


    private val setSkeletonMethodBind: CPointer<godot_method_bind> by lazy { getMB("Polygon2D", "set_skeleton") }
    open fun setSkeleton(skeleton: NodePath) {
        _icall_Unit_NodePath(setSkeletonMethodBind, this.rawMemory, skeleton)
    }


    private val getSkeletonMethodBind: CPointer<godot_method_bind> by lazy { getMB("Polygon2D", "get_skeleton") }
    open fun getSkeleton(): NodePath {
        return _icall_NodePath(getSkeletonMethodBind, this.rawMemory)
    }


    open fun _set_bones(bones: GDArray) {
    }


    open fun _get_bones(): GDArray {
        throw NotImplementedError("_get_bones is not implemented for Polygon2D")
    }


}
