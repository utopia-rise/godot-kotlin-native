package godot.core

import godot.gdnative.godot_array
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CValue
import kotlinx.cinterop.invoke

@ExperimentalUnsignedTypes
class ColorArray : CoreArray<Color> {
    constructor() : super()
    constructor(other: ColorArray) : super(other)
    constructor(other: PoolColorArray) {
        callNative {
            checkNotNull(Godot.gdnative.godot_array_new_pool_color_array)(it, other._handle.ptr)
        }
    }

    internal constructor(native: CValue<godot_array>) : super(native)
    internal constructor(mem: COpaquePointer) : super(mem)

    override fun getCore(value: Variant): Color = value.asColor()
    override fun getCoreArray(value: CValue<godot_array>) =
        ColorArray(value)
}

@ExperimentalUnsignedTypes
fun ColorArrayOf(vararg elements: Color) = ColorArray().also {
    for (arg in elements) {
        it.append(arg)
    }
}

@ExperimentalUnsignedTypes
fun Iterable<Color>.toVariantArray() = ColorArray().also{
    for (arg in this) {
        it.append(arg)
    }
}

@ExperimentalUnsignedTypes
fun ColorArray(iter: Iterable<Color>) = iter.toVariantArray()
