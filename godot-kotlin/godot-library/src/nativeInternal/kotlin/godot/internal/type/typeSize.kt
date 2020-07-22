package godot.internal.type

import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.LongVar
import kotlin.math.abs

//Reals are Float in Godot, but Doubles are the default ones in Kotlin.
//Those typealias and extensions are there to simplify the process when we wish to switch to either Float or Double
internal typealias RealT = Double
internal typealias RealTVar = DoubleVar
internal const val RealTName = "Double"

@PublishedApi
internal inline fun Number.toRealT(): RealT = this.toDouble()
@PublishedApi
internal inline fun Double.toRealT(): RealT = this

@PublishedApi
internal inline fun Number.toGodotReal(): Float = this.toFloat()
@PublishedApi
internal inline fun Float.toGodotReal(): Float = this

//Naturals are 32bits Int in Godot, so are the default ones in Kotlin
//Those typealias and extensions are there to simplify the process when we wish to switch to either Int or Long
internal typealias NaturalT = Long
internal typealias NaturalTVar = LongVar
internal const val NaturalTName = "Long"

@PublishedApi
internal inline fun Number.toNaturalT(): NaturalT = this.toLong()
@PublishedApi
internal inline fun Long.toNaturalT(): NaturalT = this
@PublishedApi
internal inline fun UInt.toNaturalT(): NaturalT = this.toLong()

@PublishedApi
internal inline fun Number.toGodotNatural(): Int = this.toInt()
@PublishedApi
internal inline fun Int.toGodotNatural(): Int = this

//Because of float precision, it's hard to obtain two perfectly equal real numbers.
// They are considered equal if the difference is smaller than CMP_EPSILON
const val CMP_EPSILON: RealT = 0.00001
fun isEqualApprox(a: RealT, b: RealT, epsilon: RealT = CMP_EPSILON): Boolean {
    //taken from https://github.com/godotengine/godot/blob/d8066aa6a4afb12ffddcec71bd7e051dcd04f3e1/core/math/math_funcs.h#L315

    // Check for exact equality first, required to handle "infinity" values.
    if (a == b) {
        return true
    }
    // Then check for approximate equality.
    var tolerance: RealT = epsilon * abs(a)
    if (tolerance < epsilon) {
        tolerance = epsilon
    }
    return abs(a - b) < tolerance
}
