@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package godot.core

import godot.gdnative.godot_string
import godot.gdnative.godot_string_layout
import godot.internal.type.nullSafe
import godot.internal.utils.GodotScope
import godot.internal.utils.godotScoped
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.CValue
import kotlinx.cinterop.MemScope
import kotlinx.cinterop.invoke

typealias GDString = CValue<godot_string>

@PublishedApi
@ThreadLocal
internal object GDStringDB {
    private val list = ArrayList<GDString>()
    private var counter = 0

    fun startScope() {
        counter++
    }

    fun endScope(scope: MemScope) {
        counter--
        if (counter != 0 || list.isEmpty()) {
            return
        }

        list.forEach {
            nullSafe(Godot.gdnative.godot_string_destroy)(it.getPointer(scope))
        }

        list.clear()
    }

    fun add(str: GDString) {
        list.add(str)
    }
}

internal fun <T> String.asGDString(block: GodotScope.(CPointer<godot_string>) -> T): T {
    return godotScoped {
        val gdString = this@asGDString.ptr
        val ret: T = block(this, gdString)
        ret
    }
}
