package godot.core

import godot.gdnative.godot_variant
import kotlinx.cinterop.CValue

class Variant (val handle: CValue<godot_variant>) {
    constructor() {}
    constructor(value: String) {
        // TODO
    }

    enum class Type(val value: Int) {
        BOOL(1), //TODO: replace with correct value
        STRING(1) //TODO: replace with correct value
        // TODO: add types
    }

    fun <T> unwrap(): T {
        TODO()
    }

    fun asString(): String {
        TODO()
    }

    fun asInt(): Int {
        TODO()
    }

    companion object {
        fun wrap(obj: Any?): Variant {
            TODO()
        }
    }
}
