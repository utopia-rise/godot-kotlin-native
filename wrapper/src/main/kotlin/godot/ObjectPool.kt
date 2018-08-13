package kotlin.godot


class ObjectPool {
    private val objects = HashMap<Long, Object>()


    fun add(id: Long, obj: Object) {
        objects[id] = obj
    }

    fun remove(id: Long): Object? {
        return objects.remove(id)
    }

    fun get(id: Long): Object? {
        return objects[id]
    }
}


val globalObjectPool = ObjectPool()