package godot.core

import kotlin.math.*

const val CMP_EPSILON = 0.00001
const val CMP_EPSILON2 = CMP_EPSILON * CMP_EPSILON
const val Math_PI = 3.14159265358979323846

const val PLANE_EQ_DOT_EPSILON = 0.999
const val PLANE_EQ_D_EPSILON = 0.0001

//taken from core/math/math_funcs.h in godot sources
internal fun isEqualApprox(a: RealT, b: RealT, epsilon: Double = CMP_EPSILON): Boolean {
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

internal typealias RealT = Double

fun Number.toRealT(): RealT {
    return this.toDouble()
}
