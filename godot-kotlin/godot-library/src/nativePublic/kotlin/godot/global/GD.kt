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

    /** Converts from a type to another in the best way possible. The type parameter uses the VariantType values. */
    inline fun <reified T> convert(what: Any?): T {
        val type = Variant.typeForClass<T>()
        val variant = Variant.wrap(what)
        return when (type) {
            VariantType.NIL                -> null
            VariantType.BOOL               -> variant.asBoolean()
            VariantType.INT                -> variant.asInt()
            VariantType.REAL               -> variant.asFloat()
            VariantType.STRING             -> variant.asString()
            VariantType.VECTOR2            -> variant.asVector2()
            VariantType.RECT2              -> variant.asRect2()
            VariantType.VECTOR3            -> variant.asVector3()
            VariantType.TRANSFORM2D        -> variant.asTransform2D()
            VariantType.PLANE              -> variant.asPlane()
            VariantType.QUAT               -> variant.asQuat()
            VariantType.AABB               -> variant.asAABB()
            VariantType.BASIS              -> variant.asBasis()
            VariantType.TRANSFORM          -> variant.asTransform()
            VariantType.COLOR              -> variant.asColor()
            VariantType.NODE_PATH          -> variant.asNodePath()
            VariantType.RID                -> variant.asRID()
            VariantType.OBJECT             -> variant.asObject()
            VariantType.DICTIONARY         -> variant.asDictionary()
            VariantType.ARRAY              -> variant.asArray()
            VariantType.POOL_BYTE_ARRAY    -> variant.asPoolByteArray()
            VariantType.POOL_INT_ARRAY     -> variant.asPoolIntArray()
            VariantType.POOL_REAL_ARRAY    -> variant.asPoolRealArray()
            VariantType.POOL_STRING_ARRAY  -> variant.asPoolStringArray()
            VariantType.POOL_VECTOR2_ARRAY -> variant.asPoolVector2Array()
            VariantType.POOL_VECTOR3_ARRAY -> variant.asPoolVector3Array()
            VariantType.POOL_COLOR_ARRAY   -> variant.asPoolColorArray()
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
            VariantType.STRING             -> len(variant.asString())
            VariantType.NODE_PATH          -> len(variant.asNodePath())
            VariantType.DICTIONARY         -> len(variant.asDictionary())
            VariantType.ARRAY              -> len(variant.asArray())
            VariantType.POOL_BYTE_ARRAY    -> len(variant.asPoolByteArray())
            VariantType.POOL_INT_ARRAY     -> len(variant.asPoolIntArray())
            VariantType.POOL_REAL_ARRAY    -> len(variant.asPoolRealArray())
            VariantType.POOL_STRING_ARRAY  -> len(variant.asPoolStringArray())
            VariantType.POOL_VECTOR2_ARRAY -> len(variant.asPoolVector2Array())
            VariantType.POOL_VECTOR3_ARRAY -> len(variant.asPoolVector3Array())
            VariantType.POOL_COLOR_ARRAY   -> len(variant.asPoolColorArray())
            else                            -> throw IllegalArgumentException("This type doesn't have a length. It must be a compatible Variant, Collection or Map")
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
