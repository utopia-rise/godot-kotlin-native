package kotlin

import kotlin.godot.core.*

class PoolIntArrayTest {
    fun test() {
        Godot.print("Testing PoolIntArray")
        Godot.print("--------------------------------------")
        val arr = GodotArray()
        arr.pushBack(Variant(32443))
        arr.pushBack(Variant(65555))
        val poolFromArray = PoolIntArray(arr)
        Godot.print("Testing constructor with GodotArray arg: " +
                if (poolFromArray[0] == 32443 && poolFromArray[1] == 65555 && poolFromArray.size() == 2)
                    "OK"
                else
                    "ERROR")
        val copy = PoolIntArray(poolFromArray)
        Godot.print("Testing copy constructor: " +
                if (copy[0] == 32443 && copy[1] == 65555 && copy.size() == 2)
                    "OK"
                else
                    "ERROR")
        val pool = PoolIntArray()
        Godot.print("Testing size: " +
                if (pool.size() == 0)
                    "OK"
                else
                    "ERROR")
        pool.pushBack(128000)
        Godot.print("Testing pushBack: " +
                if (pool.size() == 1)
                    "OK"
                else
                    "ERROR")
        Godot.print("Testing get: " +
                if (pool[0] == 128000)
                    "OK"
                else
                    "ERROR")
        pool.pushBack(127456)
        pool.invert()
        Godot.print("Testing invert: " +
                if (pool[0] == 127456 && pool.size() == 2)
                    "OK"
                else
                    "ERROR")
        pool.append(234245676)
        Godot.print("Testing append: " +
                if (pool[2] == 234245676 && pool.size() == 3)
                    "OK"
                else
                    "ERROR")
        pool.insert(2, 84457)
        Godot.print("Testing insert: " +
                if (pool[2] == 84457 && pool[3] == 234245676 && pool.size() == 4)
                    "OK"
                else
                    "ERROR")
        val otherPool = PoolIntArray()
        otherPool.pushBack(99)
        otherPool.pushBack(5675754)
        pool.appendArray(otherPool)
        Godot.print("Testing appendArray: " +
                if (pool[4] == 99 && pool[5] == 5675754 && pool.size() == 6)
                    "OK"
                else
                    "ERROR")
        pool.remove(0)
        Godot.print("Testing remove: " +
                if (pool[0] == 128000 && pool.size() == 5)
                    "OK"
                else
                    "ERROR")

        pool.resize(2)
        Godot.print("Testing resize: " +
                if (pool[0] == 128000 && pool.size() == 2)
                    "OK"
                else
                    "ERROR")
        Godot.print("--------------------------------------")
        Godot.print("")
    }
}