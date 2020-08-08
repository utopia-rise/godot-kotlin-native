package godot.internal.type

import godot.core.Variant
import godot.internal.utils.GodotScope
import godot.internal.utils.godotScoped
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.CStructVar
import kotlinx.cinterop.CValue


abstract class CoreType<C : CStructVar> {

    @PublishedApi
    internal abstract fun getRawMemory(): CValue<C>

    @PublishedApi
    internal abstract fun setRawMemory(native: CValue<C>)

    @PublishedApi
    internal abstract fun toVariant(): Variant
}

abstract class NativeCoreType<C : CStructVar> : CoreType<C>() {
    @PublishedApi
    internal abstract var _handle: CValue<C>

    @PublishedApi
    override fun  getRawMemory(): CValue<C>{
        return _handle
    }

    @PublishedApi
    override fun setRawMemory(native: CValue<C>){
        _handle = native
    }
}

internal inline fun <T, reified C : CStructVar> callNative(
    nativeCore: NativeCoreType<C>,
    block: GodotScope.(CPointer<C>) -> T
): T {
    return godotScoped {
        val ptr = nativeCore.ptr
        val ret: T = block(ptr)
        ret
    }
}
