package godot.core

internal class IndexedIterator<T>(
    private val length: Int,
    private val getter: (Int) -> T
) : Iterator<T> {
    private var index = 0
    override fun hasNext(): Boolean {
        return index < length
    }

    override fun next(): T {
        return getter(index++)
    }
}

data class Entry<out K, out V>(val key: K, val value: V)

internal class MapIterator<K, V>(
    private val keyIterator: Iterator<K>,
    private val getter: (K) -> V
) : Iterator<Entry<K, V>> {
    override fun hasNext(): Boolean {
        return keyIterator.hasNext()
    }

    override fun next(): Entry<K, V> {
        val key = keyIterator.next()
        val value = getter(key)
        return Entry(key, value)
    }
}
