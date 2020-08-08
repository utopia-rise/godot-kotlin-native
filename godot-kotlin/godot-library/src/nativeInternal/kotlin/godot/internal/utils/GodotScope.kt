package godot.internal.utils

import godot.core.GDString
import godot.core.GDStringDB
import godot.core.Godot
import godot.core.Variant
import godot.gdnative.godot_string
import godot.gdnative.godot_string_layout
import godot.gdnative.godot_variant
import godot.internal.type.*
import kotlinx.cinterop.*

@PublishedApi
internal inline class GodotScope(@PublishedApi internal inline val scope: MemScope) {

    //MEMSCOPE WRAPPERS
    val memScope: MemScope
        get() = scope.memScope

    inline fun <reified T : CVariable> alloc(): T = scope.alloc()

    inline fun alloc(size: Long, align: Int) = scope.alloc(size, align)

    inline val <T : CVariable> CValues<T>.ptr: CPointer<T>
        get() = this@ptr.getPointer(this@GodotScope.scope)

    //CORES
    inline val <C : CStructVar> CoreType<C>.ptr: CPointer<C>
        get() {
            return this@ptr.getRawMemory().ptr
        }

    //PRIMITIVES
    inline val Boolean.ptr: CPointer<BooleanVar>
        get() {
            return alloc<BooleanVar>().apply {
                this.value = this@ptr
            }.ptr
        }

    inline val VariantInt.ptr: CPointer<NaturalVar>
        get() {
            return alloc<LongVar>().apply {
                this.value = this@ptr
            }.ptr
        }

    inline val VariantReal.ptr: CPointer<RealVar>
        get() {
            return alloc<DoubleVar>().apply {
                this.value = this@ptr
            }.ptr
        }

    //STRING
    inline val String.ptr: CPointer<godot_string>
        get() {
            val value: GDString = memScoped {
                cValue {
                    val ptr = this.ptr
                    nullSafe(Godot.gdnative.godot_string_new)(ptr)
                    nullSafe(Godot.gdnative.godot_string_parse_utf8)(ptr, this@ptr.cstr.ptr)
                }
            }
            GDStringDB.add(value)
            return value.ptr
        }

    inline val GDString.string: String
        get() {
            val charString = nullSafe(Godot.gdnative.godot_string_utf8)(this.ptr)
            val charPtr = charString.ptr
            val ret = nullSafe(Godot.gdnative.godot_char_string_get_data)(charPtr)?.toKString()
                ?: throw NullPointerException("Failed to convert Godot-string to Kotlin-string")
            nullSafe(Godot.gdnative.godot_char_string_destroy)(charPtr)
            GDStringDB.add(this)
            return ret
        }

    //VARIANT
    inline val Variant.ptr: CPointer<godot_variant>
        get() = this@ptr.getRawMemory().ptr
}


/**
 * Runs given [block] providing allocation of memory
 * which will be automatically disposed at the end of this scope.
 * This is basically extending memScoped, adding helpers for strings and Godot types.
 */
@PublishedApi
internal inline fun <R> godotScoped(block: GodotScope.() -> R): R {
    return memScoped {
        val gdScope = GodotScope(this)
        GDStringDB.startScope()
        val ret = gdScope.block()
        GDStringDB.endScope(this)
        ret
    }
}
