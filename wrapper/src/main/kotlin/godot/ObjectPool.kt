package kotlin.godot


class ObjectPool {
    private val objects = HashMap<Long, GodotObject>()


    fun add(id: Long, obj: GodotObject) {
        objects[id] = obj
    }

    fun remove(id: Long): GodotObject? {
        return objects.remove(id)
    }

    fun get(id: Long): GodotObject? {
        return objects[id]
    }
}


val globalObjectPool = ObjectPool()