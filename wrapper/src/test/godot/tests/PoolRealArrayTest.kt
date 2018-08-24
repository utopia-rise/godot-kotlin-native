package godot.tests

import godot.core.*


class PoolRealArrayTest {
    fun test() {
        Godot.print("Testing PoolRealArray")
        Godot.print("--------------------------------------")
        val arr = GodotArray()
        arr.pushBack(Variant(32443.34f))
        arr.pushBack(Variant(65555.65f))
        val poolFromArray = PoolRealArray(arr)
        Godot.print("Testing constructor with GodotArray arg: " +
                if (poolFromArray[0] == 32443.34f && poolFromArray[1] == 65555.65f && poolFromArray.size() == 2)
                    "OK"
                else
                    "ERROR")
        val copy = PoolRealArray(poolFromArray)
        Godot.print("Testing copy constructor: " +
                if (copy[0] == 32443.34f && copy[1] == 65555.65f && copy.size() == 2)
                    "OK"
                else
                    "ERROR")
        val pool = PoolRealArray()
        Godot.print("Testing size: " +
                if (pool.size() == 0)
                    "OK"
                else
                    "ERROR")
        pool.pushBack(128000f)
        Godot.print("Testing pushBack: " +
                if (pool.size() == 1)
                    "OK"
                else
                    "ERROR")
        Godot.print("Testing get: " +
                if (pool[0] == 128000f)
                    "OK"
                else
                    "ERROR")
        pool.pushBack(127456.3435f)
        pool.invert()
        Godot.print("Testing invert: " +
                if (pool[0] == 127456.3435f && pool.size() == 2)
                    "OK"
                else
                    "ERROR")
        pool.append(234245676.3f)
        Godot.print("Testing append: " +
                if (pool[2] == 234245676.3f && pool.size() == 3)
                    "OK"
                else
                    "ERROR")
        pool.insert(2, 84457.3f)
        Godot.print("Testing insert: " +
                if (pool[2] == 84457.3f && pool[3] == 234245676.3f && pool.size() == 4)
                    "OK"
                else
                    "ERROR")
        val otherPool = PoolRealArray()
        otherPool.pushBack(99f)
        otherPool.pushBack(5675754.67f)
        pool.appendArray(otherPool)
        Godot.print("Testing appendArray: " +
                if (pool[4] == 99f && pool[5] == 5675754.67f && pool.size() == 6)
                    "OK"
                else
                    "ERROR")
        pool.remove(0)
        Godot.print("Testing remove: " +
                if (pool[0] == 128000f && pool.size() == 5)
                    "OK"
                else
                    "ERROR")

        pool.resize(2)
        Godot.print("Testing resize: " +
                if (pool[0] == 128000f && pool.size() == 2)
                    "OK"
                else
                    "ERROR")
        Godot.print("--------------------------------------")
        Godot.print("")
    }
}