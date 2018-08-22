package godot.core

import kotlinx.cinterop.CStructVar
import kotlinx.cinterop.CValue
import kotlinx.cinterop.useContents

object Utils {
    inline fun <reified T1: CStructVar, reified T2: CStructVar, R> useContents(
            a: CValue<T1>,
            b: CValue<T2>,
            action: (T1, T2) -> R
    ) : R {
        return a.useContents {
            val aThis = this
            b.useContents {
                action(aThis, this)
            }
        }
    }
}