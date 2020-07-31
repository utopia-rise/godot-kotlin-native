package godot.internal.type

import godot.core.Variant
import kotlinx.cinterop.*


interface CoreType {
    fun _getRawMemory(memScope: MemScope): COpaquePointer
    fun _setRawMemory(mem: COpaquePointer)

    /** Cast the coretype to a Variant */
    fun _toVariant(): Variant
}

interface NativeCoreType<C : CStructVar> : CoreType {
    var _handle: CValue<C>
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


internal fun Long._getRawMemory(memScope: MemScope): COpaquePointer {
    return memScope.alloc<LongVar>().apply {
        this.value = this@_getRawMemory
    }.ptr
}

internal fun Double._getRawMemory(memScope: MemScope): COpaquePointer {
    return memScope.alloc<DoubleVar>().apply {
        this.value = this@_getRawMemory
    }.ptr
}

internal fun Boolean._getRawMemory(memScope: MemScope): COpaquePointer {
    return memScope.alloc<BooleanVar>().apply {
        this.value = this@_getRawMemory
    }.ptr
}
