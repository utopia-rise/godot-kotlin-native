package godot.core

import godot.Object
import godot.RandomNumberGenerator
import godot.Resource
import godot.ResourceLoader
import godot.global.GDPrint
import godot.internal.type.nullSafe
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlin.test.assertTrue


object GD : GDMath, GDCore, GDRandom, GDPrint {
    override val rng = RandomNumberGenerator()

    /** Asserts that the condition is true.
    If the condition is false, an error is generated and the program is halted until you resume it.
    Only executes in debug builds. Use it for debugging purposes, to make sure a statement is true during development. */
    fun assert(condition: Boolean, message: String = "") = assertTrue(condition, message)

    /** Converts from a type to another in the best way possible. The type parameter uses the Variant.Type values. */
    inline fun <reified T> convert(what: Any?): T {
        val type = Variant.typeForClass<T>()
        val variant = Variant.wrap(what)
        return when (type) {
            Variant.Type.NIL -> null
            Variant.Type.BOOL -> variant.asBoolean()
            Variant.Type.INT -> variant.asInt()
            Variant.Type.REAL -> variant.asFloat()
            Variant.Type.STRING -> variant.asString()
            Variant.Type.VECTOR2 -> variant.asVector2()
            Variant.Type.RECT2 -> variant.asRect2()
            Variant.Type.VECTOR3 -> variant.asVector3()
            Variant.Type.TRANSFORM2D -> variant.asTransform2D()
            Variant.Type.PLANE -> variant.asPlane()
            Variant.Type.QUAT -> variant.asQuat()
            Variant.Type.AABB -> variant.asAABB()
            Variant.Type.BASIS -> variant.asBasis()
            Variant.Type.TRANSFORM -> variant.asTransform()
            Variant.Type.COLOR -> variant.asColor()
            Variant.Type.NODE_PATH -> variant.asNodePath()
            Variant.Type.RID -> variant.asRID()
            Variant.Type.OBJECT -> variant.asObject()
            Variant.Type.DICTIONARY -> variant.asDictionary()
            Variant.Type.ARRAY -> variant.asVariantArray()
            Variant.Type.POOL_BYTE_ARRAY -> variant.asPoolByteArray()
            Variant.Type.POOL_INT_ARRAY -> variant.asPoolIntArray()
            Variant.Type.POOL_REAL_ARRAY -> variant.asPoolRealArray()
            Variant.Type.POOL_STRING_ARRAY -> variant.asPoolStringArray()
            Variant.Type.POOL_VECTOR2_ARRAY -> variant.asPoolVector2Array()
            Variant.Type.POOL_VECTOR3_ARRAY -> variant.asPoolVector3Array()
            Variant.Type.POOL_COLOR_ARRAY -> variant.asPoolColorArray()
        } as T
    }

    /** Returns whether instance is a valid object (e.g. has not been deleted from memory).*/
    fun isInstanceValid(instance: Object): Boolean {
        return memScoped {
            nullSafe(Godot.gdnative11.godot_is_instance_valid)(instance.ptr)
        }
    }

    /** Returns length of Variant var
     * Note: Generates a fatal error if Variant can not provide a length.
     * */
    inline fun <reified T> len(what: Any?): Int {
        if (what is Collection<*>) {
            return what.size
        } else if (what is Map<*, *>) {
            return what.size
        }

        val type = Variant.typeForClass<T>()
        val variant = Variant.wrap(what)
        return when (type) {
            Variant.Type.STRING -> len(variant.asString())
            Variant.Type.NODE_PATH -> len(variant.asNodePath())
            Variant.Type.DICTIONARY -> len(variant.asDictionary())
            Variant.Type.ARRAY -> len(variant.asVariantArray())
            Variant.Type.POOL_BYTE_ARRAY -> len(variant.asPoolByteArray())
            Variant.Type.POOL_INT_ARRAY -> len(variant.asPoolIntArray())
            Variant.Type.POOL_REAL_ARRAY -> len(variant.asPoolRealArray())
            Variant.Type.POOL_STRING_ARRAY -> len(variant.asPoolStringArray())
            Variant.Type.POOL_VECTOR2_ARRAY -> len(variant.asPoolVector2Array())
            Variant.Type.POOL_VECTOR3_ARRAY -> len(variant.asPoolVector3Array())
            Variant.Type.POOL_COLOR_ARRAY -> len(variant.asPoolColorArray())
            else -> throw IllegalArgumentException("This type doesn't have a length. It must be a compatible Variant, Collection or Map")
        }
    }

    /**
     * Loads a resource from the filesystem located at path.
     * The resource is loaded on the method call (unless it's referenced already elsewhere, e.g. in another script or in the scene), which might cause slight delay, especially when loading scenes.
     * Important: The path must be absolute, a local path will just return null.
     * */
    @Suppress("NOTHING_TO_INLINE", "UNCHECKED_CAST")
    inline fun <T : Resource> load(path: String, typeHint: String = "", noCache: Boolean = false): T {
        return ResourceLoader.load(path, typeHint, noCache) as T
    }
}
