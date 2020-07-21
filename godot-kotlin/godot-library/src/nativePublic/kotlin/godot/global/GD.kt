package godot.core

import godot.Object
import godot.RandomNumberGenerator
import godot.global.GDPrint
import godot.global.GDResource
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlin.test.assertTrue


object GD : GDMath, GDCore, GDRandom, GDPrint, GDResource {
    override val rng = RandomNumberGenerator()
    override val builder: StringBuilder = StringBuilder()

    /** Asserts that the condition is true.
    If the condition is false, an error is generated and the program is halted until you resume it.
    Only executes in debug builds. Use it for debugging purposes, to make sure a statement is true during development. */
    fun assert(condition: Boolean, message: String = "") = assertTrue(condition, message)

    /**
     *  Converts one or more arguments to string in the best way possible.
     */
    inline fun <reified T> convert(what: Variant): T {
        val type = Variant.typeForClass<T>()

        return when (type) {
            Variant.Type.NIL -> null
            Variant.Type.BOOL -> what.asBoolean()
            Variant.Type.INT -> what.asInt()
            Variant.Type.REAL -> what.asFloat()
            Variant.Type.STRING -> what.asString()
            Variant.Type.VECTOR2 -> what.asVector2()
            Variant.Type.RECT2 -> what.asRect2()
            Variant.Type.VECTOR3 -> what.asVector3()
            Variant.Type.TRANSFORM2D -> what.asTransform2D()
            Variant.Type.PLANE -> what.asPlane()
            Variant.Type.QUAT -> what.asQuat()
            Variant.Type.AABB -> what.asAABB()
            Variant.Type.BASIS -> what.asBasis()
            Variant.Type.TRANSFORM -> what.asTransform()
            Variant.Type.COLOR -> what.asColor()
            Variant.Type.NODE_PATH -> what.asNodePath()
            Variant.Type.RID -> what.asRID()
            Variant.Type.OBJECT -> what.asObject()
            Variant.Type.DICTIONARY -> what.asDictionary()
            Variant.Type.ARRAY -> what.asVariantArray()
            Variant.Type.POOL_BYTE_ARRAY -> what.asPoolByteArray()
            Variant.Type.POOL_INT_ARRAY -> what.asPoolIntArray()
            Variant.Type.POOL_REAL_ARRAY -> what.asPoolRealArray()
            Variant.Type.POOL_STRING_ARRAY -> what.asPoolStringArray()
            Variant.Type.POOL_VECTOR2_ARRAY -> what.asPoolVector2Array()
            Variant.Type.POOL_VECTOR3_ARRAY -> what.asPoolVector3Array()
            Variant.Type.POOL_COLOR_ARRAY -> what.asPoolColorArray()
        } as T
    }

    /** Returns whether instance is a valid object (e.g. has not been deleted from memory).*/
    fun isInstanceValid(instance: Object): Boolean {
        return memScoped {
            checkNotNull(Godot.gdnative11.godot_is_instance_valid)(instance.ptr)
        }
    }

    /** Returns length of Variant var
     * Note: Generates a fatal error if Variant can not provide a length.
     */
    inline fun <reified T> len(what: Variant): Int {
        val type = Variant.typeForClass<T>()

        return when (type) {
            Variant.Type.STRING -> len(what.asString())
            Variant.Type.NODE_PATH -> len(what.asNodePath())
            Variant.Type.DICTIONARY -> len(what.asDictionary())
            Variant.Type.ARRAY -> len(what.asVariantArray())
            Variant.Type.POOL_BYTE_ARRAY -> len(what.asPoolByteArray())
            Variant.Type.POOL_INT_ARRAY -> len(what.asPoolIntArray())
            Variant.Type.POOL_REAL_ARRAY -> len(what.asPoolRealArray())
            Variant.Type.POOL_STRING_ARRAY -> len(what.asPoolStringArray())
            Variant.Type.POOL_VECTOR2_ARRAY -> len(what.asPoolVector2Array())
            Variant.Type.POOL_VECTOR3_ARRAY -> len(what.asPoolVector3Array())
            Variant.Type.POOL_COLOR_ARRAY -> len(what.asPoolColorArray())
            else -> throw IllegalArgumentException("Variant can not provide a length.")
        }
    }
}
