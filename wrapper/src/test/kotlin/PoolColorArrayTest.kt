package kotlin

import kotlin.godot.core.*

class PoolColorArrayTest {
    fun test() {
        Godot.print("Testing PoolColorArray")
        Godot.print("--------------------------------------")
        val arr = GDArray()
        arr.pushBack(Variant(Color(10, 10, 10, 10)))
        arr.pushBack(Variant(Color(0.5, 1.7, 1.7)))
        val poolFromArray = PoolColorArray(arr)
        Godot.print("Testing constructor with GDArray arg: " +
                if (poolFromArray[0] == Color(10, 10, 10, 10) && poolFromArray[1] == Color(0.5, 1.7, 1.7) && poolFromArray.size() == 2)
                    "OK"
                else
                    "ERROR")
        val copy = PoolColorArray(poolFromArray)
        Godot.print("Testing copy constructor: " +
                if (copy[0] == Color(10, 10, 10, 10) && copy[1] == Color(0.5, 1.7, 1.7) && copy.size() == 2)
                    "OK"
                else
                    "ERROR")
        val pool = PoolColorArray()
        Godot.print("Testing size: " +
                if (pool.size() == 0)
                    "OK"
                else
                    "ERROR")
        pool.pushBack(Color(22, 10, 10))
        Godot.print("Testing pushBack: " +
                if (pool.size() == 1)
                    "OK"
                else
                    "ERROR")
        Godot.print("Testing get: " +
                if (pool[0] == Color(22, 10, 10))
                    "OK"
                else
                    "ERROR")
        pool.pushBack(Color(0.003, 100, 100))
        pool.invert()
        Godot.print("Testing invert: " +
                if (pool[0] == Color(0.003, 100, 100) && pool.size() == 2)
                    "OK"
                else
                    "ERROR")
        pool.append(Color(3, 10.5, 10.5))
        Godot.print("Testing append: " +
                if (pool[2] == Color(3, 10.5, 10.5) && pool.size() == 3)
                    "OK"
                else
                    "ERROR")
        pool.insert(2, Color(9, 50.5, 50.5))
        Godot.print("Testing insert: " +
                if (pool[2] == Color(9, 50.5, 50.5) && pool[3] == Color(3, 10.5, 10.5) && pool.size() == 4)
                    "OK"
                else
                    "ERROR")
        val otherPool = PoolColorArray()
        otherPool.pushBack(Color(90, 500.5, 500.5))
        otherPool.pushBack(Color(59, 550.5, 550.5))
        pool.appendArray(otherPool)
        Godot.print("Testing appendArray: " +
                if (pool[4] == Color(90, 500.5, 500.5) && pool[5] == Color(59, 550.5, 550.5) && pool.size() == 6)
                    "OK"
                else
                    "ERROR")
        pool.remove(0)
        Godot.print("Testing remove: " +
                if (pool[0] == Color(22, 10, 10) && pool.size() == 5)
                    "OK"
                else
                    "ERROR")

        pool.resize(2)
        Godot.print("Testing resize: " +
                if (pool[0] == Color(22, 10, 10) && pool.size() == 2)
                    "OK"
                else
                    "ERROR")
        Godot.print("--------------------------------------")
        Godot.print("")
    }
}