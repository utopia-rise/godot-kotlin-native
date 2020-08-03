package godot.internal.type

import godot.core.Variant
import kotlinx.cinterop.*


abstract class CoreType {
    internal abstract fun getRawMemory(memScope: MemScope): COpaquePointer
    internal abstract fun setRawMemory(mem: COpaquePointer)
    internal abstract fun toVariant(): Variant
}

abstract class NativeCoreType<C : CStructVar> : CoreType() {
    internal abstract var _handle: CValue<C>
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
