package godot.core

import godot.gdnative.godot_dictionary
import godot.internal.type.NativeCoreType
import godot.internal.type.callNative
import godot.internal.type.isNullable
import godot.internal.type.nullSafe
import godot.internal.utils.GodotScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.CValue
import kotlinx.cinterop.cValue
import kotlinx.cinterop.invoke


@ExperimentalUnsignedTypes
class Dictionary<K, V> : NativeCoreType<godot_dictionary>, MutableMap<K, V> {

    //########################INTERNAL#############################
    override var _handle = cValue<godot_dictionary> {}
    private val keyMapper: VariantMapper<K>
    private val valueMapper: VariantMapper<V>
    private val isKeyNullable: Boolean
    private val isValueNullable: Boolean

    private fun typedKeyWrap(value: K): Variant {
        return keyMapper.toGodot(value)
    }

    private fun typedValueWrap(value: V?): Variant {
        if (value == null) {
            return Variant()
        }
        return valueMapper.toGodot(value)
    }

    private fun Variant.typedKeyUnwrap(): K {
        val type = this.type
        if (type != keyMapper.type) {
            throw TypeCastException(
                """Expected a Variant of type ${keyMapper.type} but received $type instead.
                Value received: ${this.unwrap().toString()}"""
            )
        }
        if (type == VariantType.NIL) {
            if (!isKeyNullable) throw TypeCastException("Expected a non nullable $type but received a null.")
            else return null as K
        }
        return keyMapper.toKotlin(this)
    }

    private fun Variant.typedValueUnwrap(): V {
        val type = this.type
        if (type != valueMapper.type) {
            throw TypeCastException(
                """Expected a Variant of type ${valueMapper.type} but received $type instead.
                Value received: ${this.unwrap().toString()}"""
            )
        }
        if (type == VariantType.NIL) {
            if (!isValueNullable) throw TypeCastException("Expected a non nullable $type but received a null.")
            else return null as V
        }
        return valueMapper.toKotlin(this)
    }

    //CONSTRUCTOR
    @PublishedApi
    internal constructor(p_keyMapper: VariantMapper<K>, p_valueMapper: VariantMapper<V>, p_isKeyNullable: Boolean,
                         p_isValueNullable: Boolean) {
        keyMapper = p_keyMapper
        valueMapper = p_valueMapper
        isKeyNullable = p_isKeyNullable
        isValueNullable = p_isValueNullable
        callNative {
            nullSafe(Godot.gdnative.godot_dictionary_new)(it)
        }
    }

    @PublishedApi
    internal constructor(
        p_keyMapper: VariantMapper<K>,
        p_valueMapper: VariantMapper<V>,
        p_isKeyNullable: Boolean,
        p_isValueNullable: Boolean,
        native: CValue<godot_dictionary>
    ) {
        keyMapper = p_keyMapper
        valueMapper = p_valueMapper
        isKeyNullable = p_isKeyNullable
        isValueNullable = p_isValueNullable
        setRawMemory(native)
    }

    //########################PUBLIC###############################
    //PROPERTIES
    override val size: Int
        get() = this.size()

    override val keys: MutableSet<K>
        get() = object : AbstractMutableSet<K>() {
            override fun add(element: K): Boolean = throw UnsupportedOperationException("Add is not supported on keys")
            override fun clear() {
                this@Dictionary.clear()
            }

            override operator fun contains(element: K): Boolean = containsKey(element)

            override operator fun iterator(): MutableIterator<K> {
                val entryIterator = keys().iterator()
                return object : MutableIterator<K> {
                    override fun hasNext(): Boolean = entryIterator.hasNext()
                    override fun next(): K = entryIterator.next()
                    override fun remove() = throw UnsupportedOperationException("Remove is not supported on keys")
                }
            }

            override fun remove(element: K): Boolean {
                if (containsKey(element)) {
                    this@Dictionary.remove(element)
                    return true
                }
                return false
            }

            override val size: Int get() = this@Dictionary.size
        }

    override val values: MutableCollection<V>
        get() = object : AbstractMutableCollection<V>() {
            override fun add(element: V): Boolean =
                throw UnsupportedOperationException("Add is not supported on values")

            override fun clear() = this@Dictionary.clear()

            override operator fun contains(element: V): Boolean = containsValue(element)

            override operator fun iterator(): MutableIterator<V> {
                val entryIterator = values().iterator()
                return object : MutableIterator<V> {
                    override fun hasNext(): Boolean = entryIterator.hasNext()
                    override fun next(): V = entryIterator.next()
                    override fun remove() = throw UnsupportedOperationException("Remove is not supported on values")
                }
            }

            override val size: Int get() = this@Dictionary.size
        }

    override val entries: MutableSet<MutableMap.MutableEntry<K, V>>
        get() = object : AbstractMutableSet<MutableMap.MutableEntry<K, V>>() {

            override fun add(element: MutableMap.MutableEntry<K, V>): Boolean {
                val ret = has(element.key)
                this@Dictionary[element.key] = element.value
                return ret
            }

            override fun clear() {
                this@Dictionary.clear()
            }

            override operator fun contains(element: MutableMap.MutableEntry<K, V>): Boolean {
                val value = get(element.key, null)
                if (value == element.value) {
                    return true
                }
                return false
            }

            override operator fun iterator(): MapIterator<K, V> {
                return MapIterator(
                    this@Dictionary.keys.iterator(),
                    this@Dictionary::get,
                    this@Dictionary::set,
                    this@Dictionary::erase
                )
            }

            override fun remove(element: MutableMap.MutableEntry<K, V>): Boolean {
                val value = get(element.key, null)
                if (value == element.value) {
                    this@Dictionary.remove(element.key)
                    return true
                }
                return false
            }

            override val size: Int get() = this@Dictionary.size
        }

//CONSTRUCTOR
    /**
     * Create a shallow copy of the Dictionary
     */
    constructor(other: Dictionary<K, V>) {
        keyMapper = other.keyMapper
        valueMapper = other.valueMapper
        isKeyNullable = other.isKeyNullable
        isValueNullable = other.isValueNullable
        _handle = other._duplicate(false)
    }


    //INTEROP
    override fun getRawMemory(): CValue<godot_dictionary> {
        return _handle
    }

    override fun setRawMemory(value: CValue<godot_dictionary>) {
        callNative {
            nullSafe(Godot.gdnative.godot_dictionary_new_copy)(it, value.ptr)
        }
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

    override fun containsKey(key: K) = contains(key)

    override fun containsValue(value: V): Boolean {
        values.forEach {
            if (it == value)
                return true
        }
        return false
    }

    /**
     * Creates a copy of the dictionary, and returns it.
     * The deep parameter causes inner dictionaries and arrays to be copied recursively, but does not apply to objects.
     */
    fun duplicate(deep: Boolean = false): Dictionary<K, V> {
        return Dictionary(keyMapper, valueMapper, isKeyNullable, isValueNullable).also {
            _handle = _duplicate(deep)
        }
    }

    private inline fun _duplicate(deep: Boolean): CValue<godot_dictionary> {
        return callNative {
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
    fun erase(key: K) {
        callNative {
            nullSafe(Godot.gdnative.godot_dictionary_erase)(it, typedKeyWrap(key).ptr)
        }
    }

    /**
     * Returns the current value for the specified key in the Dictionary.
     * If the key does not exist, the method returns the value of the optional default argument, or null if it is omitted.
     */
    fun get(key: K, default: V?): V? {
        return Variant(
            callNative {
                nullSafe(Godot.gdnative11.godot_dictionary_get_with_default)(
                    it,
                    typedKeyWrap(key).ptr,
                    typedValueWrap(default).ptr
                )
            }
        ).typedValueUnwrap()
    }

    /**
     * Returns true if the dictionary has a given key.
     * Note: This is equivalent to using the in operator as follows:
     */
    fun has(key: K): Boolean {
        return callNative {
            nullSafe(Godot.gdnative.godot_dictionary_has)(it, typedKeyWrap(key).ptr)
        }
    }


    /**
     * Returns true if the dictionary has all of the keys in the given array.
     */
    fun hasAll(keys: GodotArray<K>): Boolean {
        return callNative {
            nullSafe(Godot.gdnative.godot_dictionary_has_all)(it, keys.ptr)
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

    override fun isEmpty() = empty()

    /**
     * Returns the list of keys in the Dictionary.
     */
    fun keys(): GodotArray<K> {
        return GodotArray(
            callNative {
                nullSafe(Godot.gdnative.godot_dictionary_keys)(it)
            }
        ) as GodotArray<K>
    }

    override fun put(key: K, value: V): V? {
        val ret = get(key, null)
        set(key, value)
        return ret
    }

    override fun putAll(from: Map<out K, V>) {
        from.forEach {
            set(it.key, it.value)
        }
    }

    override fun remove(key: K): V? {
        val ret = get(key, null)
        erase(key)
        return ret
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
    fun values(): GodotArray<V> {
        return GodotArray(
            callNative {
                nullSafe(Godot.gdnative.godot_dictionary_values)(it)
            }
        ) as GodotArray<V>
    }


    //UTILITIES
    override operator fun get(key: K) = Variant(
        callNative {
            nullSafe(Godot.gdnative.godot_dictionary_get)(it, typedKeyWrap(key).ptr)
        }
    ).typedValueUnwrap()


    operator fun set(key: K, value: V) {
        callNative {
            nullSafe(Godot.gdnative.godot_dictionary_set)(it, typedKeyWrap(key).ptr, typedValueWrap(value).ptr)
        }
    }

    operator fun contains(key: K): Boolean = has(key)

    override fun toVariant(): Variant =
        Variant(this)

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Dictionary<*, *>) {
            return false
        }
        return callNative {
            nullSafe(Godot.gdnative.godot_dictionary_operator_equal)(it, other.ptr)
        }
    }

    override fun hashCode(): Int {
        return _handle.hashCode()
    }

    override fun toString(): String {
        return "Dictionary($size)"
    }

    internal inline fun <T> callNative(block: GodotScope.(CPointer<godot_dictionary>) -> T): T {
        return callNative(this, block)
    }
}

//CONSTRUCTOR
/**
 * Build a empty Dictionaru.
 * T may be Any or a Godot type.
 * An error will be thrown otherwise.
 */
inline fun <reified K : Any, reified V : Any> Dictionary(): Dictionary<K, V> {
    val keyType = (variantMappers[K::class]
        ?: throw TypeCastException("Dictionary generic key type can either be Any or a Godot type. Nullable are not accepted"))
        as VariantMapper<K>
    val valueType = (variantMappers[V::class]
        ?: throw TypeCastException("Dictionary generic value type can either be Any or a Godot type. Nullable are not accepted"))
        as VariantMapper<V>
    return Dictionary(keyType, valueType, isNullable<K>(), isNullable<V>())
}

/**
 * Build a empty Dictionaru.
 * T may be Any or a Godot type.
 * An error will be thrown otherwise.
 */
inline fun <reified K : Any, reified V : Any> Dictionary(native: CValue<godot_dictionary>): Dictionary<K, V> {
    val keyType = (variantMappers[K::class]
        ?: throw TypeCastException("Dictionary generic key type can either be Any or a Godot type. Nullable are not accepted"))
        as VariantMapper<K>
    val valueType = (variantMappers[V::class]
        ?: throw TypeCastException("Dictionary generic value type can either be Any or a Godot type. Nullable are not accepted"))
        as VariantMapper<V>
    return Dictionary(keyType, valueType, isNullable<K>(), isNullable<V>(), native)
}
