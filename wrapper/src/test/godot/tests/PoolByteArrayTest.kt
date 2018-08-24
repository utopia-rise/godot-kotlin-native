package godot.tests

import godot.core.*


class PoolByteArrayTest {
    fun test() {
        Godot.print("Testing PoolByteArray")
        Godot.print("--------------------------------------")
        val arr = GodotArray()
        arr.pushBack(Variant(1.toByte()))
        arr.pushBack(Variant(2.toByte()))
        val poolFromArray = PoolByteArray(arr)
        Godot.print("Testing constructor with GodotArray arg: " +
                if (poolFromArray[0] == 1.toByte() && poolFromArray[1] == 2.toByte() && poolFromArray.size() == 2)
                    "OK"
                else
                    "ERROR")
        val copy = PoolByteArray(poolFromArray)
        Godot.print("Testing copy constructor: " +
                if (copy[0] == 1.toByte() && copy[1] == 2.toByte() && copy.size() == 2)
                    "OK"
                else
                    "ERROR")
        val pool = PoolByteArray()
        Godot.print("Testing size: " +
                if (pool.size() == 0)
                    "OK"
                else
                    "ERROR")
        pool.pushBack(128.toByte())
        Godot.print("Testing pushBack: " +
                if (pool.size() == 1)
                    "OK"
                else
                    "ERROR")
        Godot.print("Testing get: " +
                if (pool[0] == 128.toByte())
                    "OK"
                else
                    "ERROR")
        pool.pushBack(127.toByte())
        pool.invert()
        Godot.print("Testing invert: " +
                if (pool[0] == 127.toByte() && pool.size() == 2)
                    "OK"
                else
                    "ERROR")
        pool.append(126.toByte())
        Godot.print("Testing append: " +
                if (pool[2] == 126.toByte() && pool.size() == 3)
                    "OK"
                else
                    "ERROR")
        pool.insert(2, 100.toByte())
        Godot.print("Testing insert: " +
                if (pool[2] == 100.toByte() && pool[3] == 126.toByte() && pool.size() == 4)
                    "OK"
                else
                    "ERROR")
        val otherPool = PoolByteArray()
        otherPool.pushBack(99.toByte())
        otherPool.pushBack(80.toByte())
        pool.appendArray(otherPool)
        Godot.print("Testing appendArray: " +
                if (pool[4] == 99.toByte() && pool[5] == 80.toByte() && pool.size() == 6)
                    "OK"
                else
                    "ERROR")
        pool.remove(0)
        Godot.print("Testing remove: " +
                if (pool[0] == 128.toByte() && pool.size() == 5)
                    "OK"
                else
                    "ERROR")

        pool.resize(2)
        Godot.print("Testing resize: " +
                if (pool[0] == 128.toByte() && pool.size() == 2)
                    "OK"
                else
                    "ERROR")
        Godot.print("--------------------------------------")
        Godot.print("")
    }
}