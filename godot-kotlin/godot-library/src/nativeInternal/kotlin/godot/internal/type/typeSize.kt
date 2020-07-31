package godot.internal.type

import godot.gdnative.real_t
import godot.gdnative.real_tVar
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.LongVar
import kotlin.math.abs

//Reals are Float in Godot, but Doubles are the default ones in Kotlin.
//Those typealias and extensions are there to simplify the process when we wish to switch to either Float or Double
internal typealias GodotReal = real_t
internal typealias GodotRealVar = real_tVar
internal typealias VariantReal = Double
internal typealias KotlinReal = Double

@PublishedApi internal inline fun Number.toGodotReal(): GodotReal = toFloat()
@PublishedApi internal inline fun Number.toVariantReal(): VariantReal = toDouble()
@PublishedApi internal inline fun Number.toKotlinReal(): KotlinReal = toDouble()

@PublishedApi internal inline fun Float.toGodotReal(): GodotReal = this
@PublishedApi internal inline fun Float.toVariantReal(): VariantReal = toDouble()
@PublishedApi internal inline fun Float.toKotlinReal(): KotlinReal = toDouble()

@PublishedApi internal inline fun Double.toGodotReal(): GodotReal = toFloat()
@PublishedApi internal inline fun Double.toVariantReal(): VariantReal = this
@PublishedApi internal inline fun Double.toKotlinReal(): KotlinReal = this


//Naturals are 32bits Int in Godot, so are the default ones in Kotlin
//Those typealias and extensions are there to simplify the process when we wish to switch to either Int or Long
internal typealias GodotInt = Int
internal typealias GodotIntVar = IntVar
internal typealias VariantInt = Long
internal typealias KotlinInt = Int

@PublishedApi internal inline fun Number.toGodotInt(): GodotInt = toInt()
@PublishedApi internal inline fun Number.toVariantInt(): VariantInt = toLong()
@PublishedApi internal inline fun Number.toKotlinInt(): KotlinInt = toInt()

@PublishedApi internal inline fun Int.toGodotInt(): GodotInt = this
@PublishedApi internal inline fun Int.toVariantInt(): VariantInt = toLong()
@PublishedApi internal inline fun UInt.toVariantInt(): VariantInt = toLong()
@PublishedApi internal inline fun Int.toKotlinInt(): KotlinInt = this

@PublishedApi internal inline fun Long.toGodotInt(): GodotInt = toInt()
@PublishedApi internal inline fun Long.toVariantInt(): VariantInt = this
@PublishedApi internal inline fun Long.toKotlinInt(): KotlinInt = toInt()

//Because of float precision, it's hard to obtain two perfectly equal real numbers.
// They are considered equal if the difference is smaller than CMP_EPSILON
const val CMP_EPSILON: GodotReal = 0.00001f
fun isEqualApprox(a: GodotReal, b: GodotReal, epsilon: GodotReal = CMP_EPSILON): Boolean {
    //taken from https://github.com/godotengine/godot/blob/d8066aa6a4afb12ffddcec71bd7e051dcd04f3e1/core/math/math_funcs.h#L315

    // Check for exact equality first, required to handle "infinity" values.
    if (a == b) {
        return true
    }
    // Then check for approximate equality.
    var tolerance: GodotReal = epsilon * abs(a)
    if (tolerance < epsilon) {
        tolerance = epsilon
    }
    return abs(a - b) < tolerance
}
