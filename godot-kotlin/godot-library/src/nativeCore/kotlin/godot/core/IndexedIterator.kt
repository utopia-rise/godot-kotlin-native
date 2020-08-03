package godot.core

internal class IndexedIterator<T>(
    private var size: () -> Int,
    private val getter: (Int) -> T,
    private val eraser: (Int) -> Unit
) : MutableIterator<T> {
    private var index = 0
    private var length = size()

    override fun hasNext(): Boolean {
        return index < length
    }

    override fun next(): T {
        return getter(index++)
    }

    override fun remove() {
        eraser(--index)
        length = size()
    }
}

data class Entry<out K, out V>(override val key: K, override val value: V): Map.Entry<K, V>

internal class MapIterator<K, V>(
    private val keyIterator: MutableIterator<K>,
    private val getter: (K) -> V,
    private val eraser: (K) -> Unit
) : MutableIterator<Map.Entry<K, V>> {
    lateinit var key: K

    override fun hasNext(): Boolean {
        return keyIterator.hasNext()
    }

    override fun next(): Map.Entry<K, V> {
        key = keyIterator.next()
        val value = getter(key)
        return Entry(key, value)
    }

    override fun remove() {
        keyIterator.remove()
        eraser(key)
    }
}
