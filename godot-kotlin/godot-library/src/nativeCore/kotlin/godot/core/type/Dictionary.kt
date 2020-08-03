package godot.core

import godot.Object
import godot.gdnative.godot_dictionary_layout
import godot.internal.type.*
import kotlinx.cinterop.*


@ExperimentalUnsignedTypes
class Dictionary :
    NativeCoreType<godot_dictionary_layout>,
    MutableMap<Any, Any>
{
    override var _handle = cValue<godot_dictionary_layout>{}

    //PROPERTIES
    override val size: Int
        get() = this.size()

    override val keys: MutableSet<Any>
        get() = this.keys().toMutableSet()

    override val values: MutableCollection<Any>
        get() = this.values().toMutableList()

    //CONSTRUCTOR
    constructor() {
        callNative {
            nullSafe(Godot.gdnative.godot_dictionary_new)(it)
        }
    }

    internal constructor(native: CValue<godot_dictionary_layout>) {
        memScoped {
            this@Dictionary.setRawMemory(native.ptr)
        }
    }

    internal constructor(mem: COpaquePointer) {
        this.setRawMemory(mem)
    }

    //INTEROP
    override fun getRawMemory(memScope: MemScope): COpaquePointer {
        return _handle.getPointer(memScope)
    }

    override fun setRawMemory(mem: COpaquePointer) {
        _handle = mem.reinterpret<godot_dictionary_layout>().pointed.readValue()
    }


    //API
    /**
     * Clear the dictionary, removing all key/value pairs.
     */
    override fun clear() {
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
    fun erase(key: Any) {
        callNative {
            nullSafe(Godot.gdnative.godot_dictionary_erase)(it, Variant(key)._handle.ptr)
        }
    }

    fun erase(key: Int) = erase(Variant(key))
    fun erase(key: Float) = erase(Variant(key))
    fun erase(key: String) = erase(Variant(key))
    fun erase(key: Boolean) = erase(Variant(key))
    fun erase(key: Object) = erase(key.toVariant())
    fun erase(key: CoreType) = erase(key.toVariant())

    /**
     * Returns the current value for the specified key in the Dictionary.
     * If the key does not exist, the method returns the value of the optional default argument, or null if it is omitted.
     */
    fun get(key: Any, default: Any): Any {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative11.godot_dictionary_get_with_default)(
                    it,
                    Variant(key)._handle.ptr,
                    Variant(default)._handle.ptr
                )
            }
        )
    }


    /**
     * Returns true if the dictionary has a given key.
     * Note: This is equivalent to using the in operator as follows:
     */
    fun has(key: Any): Boolean {
        return callNative {
            nullSafe(Godot.gdnative.godot_dictionary_has)(it, Variant(key)._handle.ptr)
        }
    }


    /**
     * Returns true if the dictionary has all of the keys in the given array.
     */
    fun hasAll(keys: Set<Any>): Boolean {
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
    fun keys(): GodotArray<Any> {
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
    fun values(): GodotArray<Any> {
        return VariantArray(
            callNative {
                nullSafe(Godot.gdnative.godot_dictionary_values)(it)
            }
        )
    }


    //UTILITIES
    override operator fun get(key: Any): Any {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative.godot_dictionary_get)(it, key._handle.ptr)
            }
        )
    }


    operator fun set(key: Any, value: Any) {
        callNative {
            nullSafe(Godot.gdnative.godot_dictionary_set)(it, Variant(key)._handle.ptr, value._handle.ptr)
        }
    }

    operator fun contains(key: Any): Boolean = has(key)

    override fun toVariant(): Variant = Variant(this)

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
}

/**
 * Create a shallow copy of the Dictionary
 */
fun Dictionary(other: Dictionary) = other.duplicate(false)
