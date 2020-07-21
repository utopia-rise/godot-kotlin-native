package godot.internal.type

import kotlinx.cinterop.DoubleVar
import kotlin.math.abs

internal typealias RealT = Double
internal typealias RealTVar = DoubleVar
internal inline fun Number.toRealT(): RealT = this.toDouble()
internal inline fun Double.toRealT(): RealT = this

const val CMP_EPSILON = 0.00001
fun isEqualApprox(a: RealT, b: RealT, epsilon: Double = CMP_EPSILON): Boolean {
    //taken from https://github.com/godotengine/godot/blob/d8066aa6a4afb12ffddcec71bd7e051dcd04f3e1/core/math/math_funcs.h#L315

    // Check for exact equality first, required to handle "infinity" values.
    if (a == b) {
        return true
    }
    // Then check for approximate equality.
    var tolerance: RealT = epsilon * kotlin.math.abs(a)
    if (tolerance < epsilon) {
        tolerance = epsilon
    }
    return abs(a - b) < tolerance
}
