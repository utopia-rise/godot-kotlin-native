package godot.core

class VariantArray {

    constructor()
    constructor(elements: Array<out Any>)
    constructor(elements: Array<out Variant>)

    fun append(value: Variant) {}
}

fun variantArrayOf(vararg elements: Variant): VariantArray =
    if (elements.isEmpty()) VariantArray() else VariantArray(elements)

fun variantArrayOf(vararg elements: Any): VariantArray =
    if (elements.isEmpty()) VariantArray() else VariantArray(elements)

fun variantArrayOf(array1: VariantArray, array2: VariantArray) = VariantArray()
fun <T> variantArrayOf(array1: Array<T>, array2: Array<T>) = VariantArray()
fun <T> Array<T>.toVariantArray() = VariantArray()
