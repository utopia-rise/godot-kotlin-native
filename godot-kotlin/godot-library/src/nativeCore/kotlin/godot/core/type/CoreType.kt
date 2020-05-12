package godot.core

import godot.core.type.Variant
import kotlinx.cinterop.*


internal interface CoreType {
    fun getRawMemory(memScope: MemScope): COpaquePointer
    fun setRawMemory(mem: COpaquePointer)

    fun toVariant(): Variant
}

/**
 * WARNING: Do not inherit from this class, it is only there for the coretypes not entirely reimplemented in Kotlin.
 */
abstract class NativeCoreType<C : CStructVar>: CoreType {
    internal lateinit var _handle: CValue<C>
}

internal inline fun <T, reified C : CStructVar> callNative(
    nativeCore: NativeCoreType<C>,
    block: MemScope.(CPointer<C>) -> T
): T {
    return memScoped {
        val ptr = nativeCore._handle.ptr
        val ret: T = block(ptr)
        nativeCore._handle = ptr.pointed.readValue()
        ret
    }
}


internal fun Long.getRawMemory(memScope: MemScope): COpaquePointer {
    return memScope.alloc<LongVar>().apply {
        this.value = this@getRawMemory
    }.ptr
}

internal fun Double.getRawMemory(memScope: MemScope): COpaquePointer {
    return memScope.alloc<DoubleVar>().apply {
        this.value = this@getRawMemory
    }.ptr
}

internal fun Boolean.getRawMemory(memScope: MemScope): COpaquePointer {
    return memScope.alloc<BooleanVar>().apply {
        this.value = this@getRawMemory
    }.ptr
}
