package kotlin

import kotlin.godot.core.*

class PoolVector2ArrayTest {
    fun test() {
        Godot.print("Testing PoolVector2Array")
        Godot.print("--------------------------------------")
        val arr = GDArray()
        arr.pushBack(Variant(Vector2(10, 10)))
        arr.pushBack(Variant(Vector2(0.5, 1.7)))
        val poolFromArray = PoolVector2Array(arr)
        Godot.print("Testing constructor with GDArray arg: " +
                if (poolFromArray[0] == Vector2(10, 10) && poolFromArray[1] == Vector2(0.5, 1.7) && poolFromArray.size() == 2)
                    "OK"
                else
                    "ERROR")
        val copy = PoolVector2Array(poolFromArray)
        Godot.print("Testing copy constructor: " +
                if (copy[0] == Vector2(10, 10) && copy[1] == Vector2(0.5, 1.7) && copy.size() == 2)
                    "OK"
                else
                    "ERROR")
        val pool = PoolVector2Array()
        Godot.print("Testing size: " +
                if (pool.size() == 0)
                    "OK"
                else
                    "ERROR")
        pool.pushBack(Vector2(22, 10))
        Godot.print("Testing pushBack: " +
                if (pool.size() == 1)
                    "OK"
                else
                    "ERROR")
        Godot.print("Testing get: " +
                if (pool[0] == Vector2(22, 10))
                    "OK"
                else
                    "ERROR")
        pool.pushBack(Vector2(0.003, 100))
        pool.invert()
        Godot.print("Testing invert: " +
                if (pool[0] == Vector2(0.003, 100) && pool.size() == 2)
                    "OK"
                else
                    "ERROR")
        pool.append(Vector2(3, 10.5))
        Godot.print("Testing append: " +
                if (pool[2] == Vector2(3, 10.5) && pool.size() == 3)
                    "OK"
                else
                    "ERROR")
        pool.insert(2, Vector2(9, 50.5))
        Godot.print("Testing insert: " +
                if (pool[2] == Vector2(9, 50.5) && pool[3] == Vector2(3, 10.5) && pool.size() == 4)
                    "OK"
                else
                    "ERROR")
        val otherPool = PoolVector2Array()
        otherPool.pushBack(Vector2(90, 500.5))
        otherPool.pushBack(Vector2(59, 550.5))
        pool.appendArray(otherPool)
        Godot.print("Testing appendArray: " +
                if (pool[4] == Vector2(90, 500.5) && pool[5] == Vector2(59, 550.5) && pool.size() == 6)
                    "OK"
                else
                    "ERROR")
        pool.remove(0)
        Godot.print("Testing remove: " +
                if (pool[0] == Vector2(22, 10) && pool.size() == 5)
                    "OK"
                else
                    "ERROR")

        pool.resize(2)
        Godot.print("Testing resize: " +
                if (pool[0] == Vector2(22, 10) && pool.size() == 2)
                    "OK"
                else
                    "ERROR")
        Godot.print("--------------------------------------")
        Godot.print("")
    }
}