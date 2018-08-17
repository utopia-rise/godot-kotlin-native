package kotlin

import kotlin.godot.core.Basis
import kotlin.godot.core.Godot
import kotlin.godot.core.Vector3

class BasisTest {
    fun test() {
        var basis = Basis(3,2,3,4,5,6,7,8,9)
        Godot.print("Testing determinant(): " +
                if (basis.determinant() == -6f)
                    "OK"
                else
                    "ERROR")
    }
}