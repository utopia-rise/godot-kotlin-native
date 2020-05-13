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
