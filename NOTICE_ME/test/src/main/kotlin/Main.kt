import yield.GD


class Test {
    fun foo(i: Int) {
        println(i)
    }

    fun test() = GD.yielded<Int?> {
        foo(1)
        foo(yield<Int>())
        foo(yield<Int>())
        foo(yield<Int>())
        foo(5)

        42
    }
}


fun main(args: Array<String>) {
    val obj = Test()

    val monitor = obj.test()
    monitor.resume(2)
    monitor.resume(3)
    monitor.resume(4)
    println("Result: ${monitor.result}")
}