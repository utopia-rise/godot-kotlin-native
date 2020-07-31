package godot.core

import godot.Object
import godot.gdnative.godot_dictionary_layout
import godot.internal.type.*
import kotlinx.cinterop.*


@ExperimentalUnsignedTypes
class Dictionary : NativeCoreType<godot_dictionary_layout>, Iterable<Entry<Variant, Variant>> {
    override var _handle = cValue<godot_dictionary_layout>{}

    //PROPERTIES
    val size: Int
        get() = this.size()

    val keys: VariantArray
        get() = this.keys()

    val values: VariantArray
        get() = this.values()

    //CONSTRUCTOR
    constructor() {
        callNative {
            nullSafe(Godot.gdnative.godot_dictionary_new)(it)
        }
    }

    internal constructor(native: CValue<godot_dictionary_layout>) {
        memScoped {
            this@Dictionary._setRawMemory(native.ptr)
        }
    }

    internal constructor(mem: COpaquePointer) {
        this._setRawMemory(mem)
    }

    //INTEROP
    override fun _getRawMemory(memScope: MemScope): COpaquePointer {
        return _handle.getPointer(memScope)
    }

    override fun _setRawMemory(mem: COpaquePointer) {
        _handle = mem.reinterpret<godot_dictionary_layout>().pointed.readValue()
    }


    //API
    /**
     * Clear the dictionary, removing all key/value pairs.
     */
    fun clear() {
        callNative {
            nullSafe(Godot.gdnative.godot_dictionary_clear)(it)
        }
    }

    /**
     * Creates a copy of the dictionary, and returns it.
     * The deep parameter causes inner dictionaries and arrays to be copied recursively, but does not apply to objects.
     */
    fun duplicate(deep: Boolean = false) {
        callNative {
            nullSafe(Godot.gdnative12.godot_dictionary_duplicate)(it, deep)
        }
    }

    /**
     * Returns true if the dictionary is empty.
     */
    fun empty(): Boolean {
        return callNative {
            nullSafe(Godot.gdnative.godot_dictionary_empty)(it)
        }
    }

    /**
     * Erase a dictionary key/value pair by key. Doesn't return a Boolean like the GDScript version because the GDNative function doesn't return anything
     */
    fun erase(key: Variant) {
        callNative {
            nullSafe(Godot.gdnative.godot_dictionary_erase)(it, key._handle.ptr)
        }
    }

    fun erase(key: Int) = erase(Variant(key))
    fun erase(key: Float) = erase(Variant(key))
    fun erase(key: String) = erase(Variant(key))
    fun erase(key: Boolean) = erase(Variant(key))
    fun erase(key: Object) = erase(key.toVariant())
    fun erase(key: CoreType) = erase(key._toVariant())

    /**
     * Returns the current value for the specified key in the Dictionary.
     * If the key does not exist, the method returns the value of the optional default argument, or null if it is omitted.
     */
    fun get(key: Variant, default: Variant = Variant()): Variant {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative11.godot_dictionary_get_with_default)(
                    it,
                    key._handle.ptr,
                    default._handle.ptr
                )
            }
        )
    }

    fun get(key: KotlinInt, default: Variant = Variant()) = get(Variant(key), default)
    fun get(key: KotlinInt, default: KotlinInt) = get(Variant(key), Variant(default))
    fun get(key: KotlinInt, default: KotlinReal) = get(Variant(key), Variant(default))
    fun get(key: KotlinInt, default: String) = get(Variant(key), Variant(default))
    fun get(key: KotlinInt, default: Boolean) = get(Variant(key), Variant(default))
    fun get(key: KotlinInt, default: Object) = get(Variant(key), default.toVariant())
    fun get(key: KotlinInt, default: CoreType) = get(Variant(key), default._toVariant())

    fun get(key: KotlinReal, default: Variant = Variant()) = get(Variant(key), default)
    fun get(key: KotlinReal, default: KotlinInt) = get(Variant(key), Variant(default))
    fun get(key: KotlinReal, default: KotlinReal) = get(Variant(key), Variant(default))
    fun get(key: KotlinReal, default: String) = get(Variant(key), Variant(default))
    fun get(key: KotlinReal, default: Boolean) = get(Variant(key), Variant(default))
    fun get(key: KotlinReal, default: Object) = get(Variant(key), default.toVariant())
    fun get(key: KotlinReal, default: CoreType) = get(Variant(key), default._toVariant())

    fun get(key: String, default: Variant = Variant()) = get(Variant(key), default)
    fun get(key: String, default: KotlinInt) = get(Variant(key), Variant(default))
    fun get(key: String, default: KotlinReal) = get(Variant(key), Variant(default))
    fun get(key: String, default: String) = get(Variant(key), Variant(default))
    fun get(key: String, default: Boolean) = get(Variant(key), Variant(default))
    fun get(key: String, default: Object) = get(Variant(key), default.toVariant())
    fun get(key: String, default: CoreType) = get(Variant(key), default._toVariant())

    fun get(key: Boolean, default: Variant = Variant()) = get(Variant(key), default)
    fun get(key: Boolean, default: KotlinInt) = get(Variant(key), Variant(default))
    fun get(key: Boolean, default: KotlinReal) = get(Variant(key), Variant(default))
    fun get(key: Boolean, default: String) = get(Variant(key), Variant(default))
    fun get(key: Boolean, default: Boolean) = get(Variant(key), Variant(default))
    fun get(key: Boolean, default: Object) = get(Variant(key), default.toVariant())
    fun get(key: Boolean, default: CoreType) = get(Variant(key), default._toVariant())

    fun get(key: Object, default: Variant = Variant()) = get(key.toVariant(), default)
    fun get(key: Object, default: KotlinInt) = get(key.toVariant(), Variant(default))
    fun get(key: Object, default: KotlinReal) = get(key.toVariant(), Variant(default))
    fun get(key: Object, default: String) = get(key.toVariant(), Variant(default))
    fun get(key: Object, default: Boolean) = get(key.toVariant(), Variant(default))
    fun get(key: Object, default: Object) = get(key.toVariant(), default.toVariant())
    fun get(key: Object, default: CoreType) = get(key.toVariant(), default._toVariant())

    fun get(key: CoreType, default: Variant = Variant()) = get(key._toVariant(), default)
    fun get(key: CoreType, default: KotlinInt) = get(key._toVariant(), Variant(default))
    fun get(key: CoreType, default: KotlinReal) = get(key._toVariant(), Variant(default))
    fun get(key: CoreType, default: String) = get(key._toVariant(), Variant(default))
    fun get(key: CoreType, default: Boolean) = get(key._toVariant(), Variant(default))
    fun get(key: CoreType, default: Object) = get(key._toVariant(), default.toVariant())
    fun get(key: CoreType, default: CoreType) = get(key._toVariant(), default._toVariant())

    /**
     * Returns true if the dictionary has a given key.
     * Note: This is equivalent to using the in operator as follows:
     */
    fun has(key: Variant): Boolean {
        return callNative {
            nullSafe(Godot.gdnative.godot_dictionary_has)(it, key._handle.ptr)
        }
    }

    fun has(key: KotlinInt) = has(Variant(key))
    fun has(key: KotlinReal) = has(Variant(key))
    fun has(key: String) = has(Variant(key))
    fun has(key: Boolean) = has(Variant(key))
    fun has(key: Object) = has(key.toVariant())
    fun has(key: CoreType) = has(key._toVariant())

    /**
     * Returns true if the dictionary has all of the keys in the given array.
     */
    fun hasAll(keys: VariantArray): Boolean {
        return callNative {
            nullSafe(Godot.gdnative.godot_dictionary_has_all)(it, keys._handle.ptr)
        }
    }

    /**
     * Returns a hashed integer value representing the dictionary contents. This can be used to compare dictionaries by value
     */
    fun hash(): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_dictionary_hash)(it)
        }
    }

    /**
     * Returns the list of keys in the Dictionary.
     */
    fun keys(): VariantArray {
        return VariantArray(
            callNative {
                nullSafe(Godot.gdnative.godot_dictionary_keys)(it)
            }
        )
    }

    /**
     * Returns the size of the dictionary (in pairs).
     */
    fun size(): Int {
        return callNative {
            nullSafe(Godot.gdnative.godot_dictionary_size)(it)
        }
    }

    /**
     * Returns the list of values in the Dictionary.
     */
    fun values(): VariantArray {
        return VariantArray(
            callNative {
                nullSafe(Godot.gdnative.godot_dictionary_values)(it)
            }
        )
    }


    //UTILITIES
    operator fun get(key: Variant): Variant {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative.godot_dictionary_get)(it, key._handle.ptr)
            }
        )
    }

    operator fun get(key: KotlinInt) = get(Variant(key))
    operator fun get(key: KotlinReal) = get(Variant(key))
    operator fun get(key: String) = get(Variant(key))
    operator fun get(key: Boolean) = get(Variant(key))
    operator fun get(key: Object) = get(key.toVariant())
    operator fun get(key: CoreType) = get(key._toVariant())

    operator fun set(key: Variant, value: Variant) {
        callNative {
            nullSafe(Godot.gdnative.godot_dictionary_set)(it, key._handle.ptr, value._handle.ptr)
        }
    }

    operator fun set(key: KotlinInt, value: Variant) = set(Variant(key), value)
    operator fun set(key: KotlinInt, value: KotlinInt) = set(Variant(key), Variant(value))
    operator fun set(key: KotlinInt, value: KotlinReal) = set(Variant(key), Variant(value))
    operator fun set(key: KotlinInt, value: String) = set(Variant(key), Variant(value))
    operator fun set(key: KotlinInt, value: Boolean) = set(Variant(key), Variant(value))
    operator fun set(key: KotlinInt, value: Object) = set(Variant(key), value.toVariant())
    operator fun set(key: KotlinInt, value: CoreType) = set(Variant(key), value._toVariant())

    operator fun set(key: KotlinReal, value: Variant) = set(Variant(key), value)
    operator fun set(key: KotlinReal, value: KotlinInt) = set(Variant(key), Variant(value))
    operator fun set(key: KotlinReal, value: KotlinReal) = set(Variant(key), Variant(value))
    operator fun set(key: KotlinReal, value: String) = set(Variant(key), Variant(value))
    operator fun set(key: KotlinReal, value: Boolean) = set(Variant(key), Variant(value))
    operator fun set(key: KotlinReal, value: Object) = set(Variant(key), value.toVariant())
    operator fun set(key: KotlinReal, value: CoreType) = set(Variant(key), value._toVariant())

    operator fun set(key: String, value: Variant) = set(Variant(key), value)
    operator fun set(key: String, value: KotlinInt) = set(Variant(key), Variant(value))
    operator fun set(key: String, value: KotlinReal) = set(Variant(key), Variant(value))
    operator fun set(key: String, value: String) = set(Variant(key), Variant(value))
    operator fun set(key: String, value: Boolean) = set(Variant(key), Variant(value))
    operator fun set(key: String, value: Object) = set(Variant(key), value.toVariant())
    operator fun set(key: String, value: CoreType) = set(Variant(key), value._toVariant())

    operator fun set(key: Boolean, value: Variant) = set(Variant(key), value)
    operator fun set(key: Boolean, value: KotlinInt) = set(Variant(key), Variant(value))
    operator fun set(key: Boolean, value: KotlinReal) = set(Variant(key), Variant(value))
    operator fun set(key: Boolean, value: String) = set(Variant(key), Variant(value))
    operator fun set(key: Boolean, value: Boolean) = set(Variant(key), Variant(value))
    operator fun set(key: Boolean, value: Object) = set(Variant(key), value.toVariant())
    operator fun set(key: Boolean, value: CoreType) = set(Variant(key), value._toVariant())

    operator fun set(key: Object, value: Variant) = set(key.toVariant(), value)
    operator fun set(key: Object, value: KotlinInt) = set(Variant(key), Variant(value))
    operator fun set(key: Object, value: KotlinReal) = set(Variant(key), Variant(value))
    operator fun set(key: Object, value: String) = set(Variant(key), Variant(value))
    operator fun set(key: Object, value: Boolean) = set(Variant(key), Variant(value))
    operator fun set(key: Object, value: Object) = set(Variant(key), value.toVariant())
    operator fun set(key: Object, value: CoreType) = set(Variant(key), value._toVariant())

    operator fun set(key: CoreType, value: Variant) = set(key._toVariant(), value)
    operator fun set(key: CoreType, value: KotlinInt) = set(key._toVariant(), Variant(value))
    operator fun set(key: CoreType, value: KotlinReal) = set(key._toVariant(), Variant(value))
    operator fun set(key: CoreType, value: String) = set(key._toVariant(), Variant(value))
    operator fun set(key: CoreType, value: Boolean) = set(key._toVariant(), Variant(value))
    operator fun set(key: CoreType, value: Object) = set(key._toVariant(), value.toVariant())
    operator fun set(key: CoreType, value: CoreType) = set(key._toVariant(), value._toVariant())

    operator fun contains(key: Variant): Boolean = has(Variant(key))
    operator fun contains(key: KotlinInt): Boolean = has(Variant(key))
    operator fun contains(key: KotlinReal): Boolean = has(Variant(key))
    operator fun contains(key: String): Boolean = has(Variant(key))
    operator fun contains(key: Boolean): Boolean = has(Variant(key))
    operator fun contains(key: Object): Boolean = has(key.toVariant())
    operator fun contains(key: CoreType): Boolean = has(key._toVariant())

    override fun _toVariant(): Variant = Variant(this)

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Dictionary) {
            return false
        }
        return callNative {
            nullSafe(Godot.gdnative.godot_dictionary_operator_equal)(it, other._handle.ptr)
        }
    }

    override fun hashCode(): Int {
        return _handle.hashCode()
    }

    override fun toString(): String {
        return "Dictionary($size)"
    }

    internal inline fun <T> callNative(block: MemScope.(CPointer<godot_dictionary_layout>) -> T): T {
        return callNative(this, block)
    }

    override fun iterator(): Iterator<Entry<Variant, Variant>> {
        return MapIterator(keys().iterator(), this::get)
    }
}

/**
 * Create a shallow copy of the Dictionary
 */
fun Dictionary(other: Dictionary) = other.duplicate(false)
