package godot.internal.type

import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.LongVar
import kotlin.math.abs

//Real are float in Godot, but Double is the default one in Kotlin.
//Those type alias and extensions are there to simplify the process when we wish to switch between either Float or Double
internal typealias RealT = Double
internal typealias RealTVar = DoubleVar

internal inline fun Number.toRealT(): RealT = this.toDouble()
internal inline fun Double.toRealT(): RealT = this

internal inline fun Number.toGodotReal(): Float = this.toFloat()
internal inline fun Float.toGodotReal(): Float = this

//Natural are 32bits Int in Godot, so is the default one in Kotlin
//Those type alias and extensions are there to simplify the process when we wish to switch between either Int or Long
internal typealias NaturalT = Long
internal typealias NaturalTVar = LongVar

internal inline fun Number.toNaturalT(): NaturalT = this.toLong()
internal inline fun Long.toNaturalTT(): NaturalT = this

internal inline fun Number.toGodotNatural(): Int = this.toInt()
internal inline fun Int.toGodotNatural(): Int = this

//Because of float precision, it's hard to obtain two perfectly equal real numbers.
// They are considered equal if the difference is smaller than CMD_EPSILON
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
