package godot.core

import godot.gdnative.godot_variant
import kotlinx.cinterop.CValue

class Variant (val handle: CValue<godot_variant>) {
    constructor() : this(new()) {}
    constructor(value: String) : this(new()) {
        // TODO
    }

    constructor(value: Int) : this(new()) {
        // TODO
    }

    constructor(value: Float) : this(new()) {
        // TODO
    }

    constructor(value: Double) : this(new()) {
        // TODO
    }

    constructor(value: Any) : this(new()) //TODO: replace

    enum class Type(val value: Int) {
        BOOL(1), //TODO: replace with correct value
        STRING(1), //TODO: replace with correct value
        INT(1), //TODO: replace with correct value
        REAL(1), //TODO: replace with correct value
        OBJECT(1) //TODO: replace with correct value
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
        private fun new(): CValue<godot_variant> {
            TODO()
        }

        fun wrap(obj: Any?): Variant {
            TODO()
        }
    }
}
