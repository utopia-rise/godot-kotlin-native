package kotlin

import kotlin.godot.core.*

class GodotArrayTest {
    fun test() {
        Godot.print("Testing GDArray")
        Godot.print("--------------------------------------")
        val pool = PoolByteArray()
        pool.pushBack(10.toByte())
        pool.pushBack(20.toByte())
        val byteArr = GDArray(pool)
        Godot.print("Testing constructor with PoolByteArray arg: " +
                if (byteArr[0] == Variant(10.toByte()) && byteArr[1] == Variant(20.toByte())
                        && byteArr.size() == 2)
                    "OK"
                else
                    "ERROR")

        val intPool = PoolIntArray()
        intPool.pushBack(10)
        intPool.pushBack(20)
        val intArr = GDArray(intPool)
        Godot.print("Testing constructor with PoolIntArray arg: " +
                if (intArr[0] == Variant(10) && intArr[1] == Variant(20)
                        && intArr.size() == 2)
                    "OK"
                else
                    "ERROR")

        val realPool = PoolRealArray()
        realPool.pushBack(10.45f)
        realPool.pushBack(20.86f)
        val realArr = GDArray(realPool)
        Godot.print("Testing constructor with PoolRealArray arg: " +
                if (realArr[0] == Variant(10.45f) && realArr[1] == Variant(20.86f)
                        && realArr.size() == 2)
                    "OK"
                else
                    "ERROR")

        val colorPool = PoolColorArray()
        colorPool.pushBack(Color(10, 10, 10))
        colorPool.pushBack(Color(10.45, 56.4, 10.23))
        val colorArr = GDArray(colorPool)
        Godot.print("Testing constructor with PoolColorArray arg: " +
                if (colorArr[0] == Variant(Color(10, 10, 10)) && colorArr[1] == Variant(Color(10.45, 56.4, 10.23))
                        && colorArr.size() == 2)
                    "OK"
                else
                    "ERROR")

        val vec2Pool = PoolVector2Array()
        vec2Pool.pushBack(Vector2(10, 10))
        vec2Pool.pushBack(Vector2(10.45, 56.4))
        val vec2Arr = GDArray(vec2Pool)
        Godot.print("Testing constructor with PoolVector2Array arg: " +
                if (vec2Arr[0] == Variant(Vector2(10, 10)) && vec2Arr[1] == Variant(Vector2(10.45, 56.4))
                        && vec2Arr.size() == 2)
                    "OK"
                else
                    "ERROR")

        val vec3Pool = PoolVector3Array()
        vec3Pool.pushBack(Vector3(10, 10, 10))
        vec3Pool.pushBack(Vector3(10.45, 56.4, 10.23))
        val vec3Arr = GDArray(vec3Pool)
        Godot.print("Testing constructor with PoolVector3Array arg: " +
                if (vec3Arr[0] == Variant(Vector3(10, 10, 10)) && vec3Arr[1] == Variant(Vector3(10.45, 56.4, 10.23))
                        && vec3Arr.size() == 2)
                    "OK"
                else
                    "ERROR")

        val arr = GDArray()
        Godot.print("Testing empty & size: " +
                if (arr.isEmpty() && arr.size() == 0)
                    "OK"
                else
                    "ERROR")
        arr.pushBack(Variant(10))
        Godot.print("Testing pushBack: " +
                if (arr[0] == Variant(10) && arr.size() == 1)
                    "OK"
                else
                    "ERROR")
        arr.pushFront(Variant(100))
        Godot.print("Testing pushFront: " +
                if (arr[0] == Variant(100) && arr.size() == 2)
                    "OK"
                else
                    "ERROR")
        arr.pushBack(Variant(2))
        Godot.print("Testing back: " +
                if (arr.back() == Variant(2) && arr.size() == 3)
                    "OK"
                else
                    "ERROR")
        Godot.print("Testing front: " +
                if (arr.front() == Variant(100))
                    "OK"
                else
                    "ERROR")
        arr.sort()
        Godot.print("Testing sort: " +
                if (arr[0] == Variant(2) && arr[1] == Variant(10)
                        && arr[2] == Variant(100))
                    "OK"
                else
                    "ERROR")
        arr.popFront()
        Godot.print("Testing popFront: " +
                if (arr[0] == Variant(10) && arr[1] == Variant(100))
                    "OK"
                else
                    "ERROR")

        arr.popBack()
        Godot.print("Testing popBack: " +
                if (arr[0] == Variant(10) && arr.size() == 1)
                    "OK"
                else
                    "ERROR")

        Godot.print("Testing has: " +
                if (arr.has(Variant(10)) && !arr.has(Variant(100)))
                    "OK"
                else
                    "ERROR")

        arr.clear()
        Godot.print("Testing clear: " +
                if (arr.size() == 0)
                    "OK"
                else
                    "ERROR")

        arr.pushBack(Variant(100))
        arr.pushBack(Variant(34))
        arr.pushBack(Variant(45))
        arr.pushBack(Variant(67))
        arr.pushBack(Variant(34))

        Godot.print("Testing count: " +
                if (arr.count(Variant(34)) == 2 && arr.count(Variant(100)) == 1
                        && arr.count(Variant(1)) == 0)
                    "OK"
                else
                    "ERROR")

        Godot.print("Testing find: " +
                if (arr.find(Variant(100), 0) == 0 && arr.find(Variant(34), 3) == 4
                        && arr.find(Variant(100), 2) == -1)
                    "OK"
                else
                    "ERROR")

        Godot.print("Testing rfind: " +
                if (arr.rfind(Variant(100), 0) == 0 && arr.rfind(Variant(34), arr.size()) == 4)
                    "OK"
                else
                    "ERROR")

        Godot.print("Testing findLast: " +
                if (arr.findLast(Variant(100)) == 0 && arr.findLast(Variant(34)) == 4
                        && arr.findLast(Variant(0)) == -1)
                    "OK"
                else
                    "ERROR")

        arr.erase(Variant(34))
        Godot.print("Testing erase 1: " +
                if (arr.findLast(Variant(34)) == 3 && arr.size() == 4)
                    "OK"
                else
                    "ERROR")
        arr.erase(Variant(34))
        Godot.print("Testing erase 2: " +
                if (arr.findLast(Variant(34)) == -1 && arr.size() == 3)
                    "OK"
                else
                    "ERROR")

        arr.insert(1, Variant(34))
        Godot.print("Testing insert: " +
                if (arr[1] == Variant(34) && arr.size() == 4)
                    "OK"
                else
                    "ERROR")

        arr.append(Variant(34))
        Godot.print("Testing append: " +
                if (arr[4] == Variant(34) && arr.size() == 5)
                    "OK"
                else
                    "ERROR")

        Godot.print("--------------------------------------")
        Godot.print("")
    }
}