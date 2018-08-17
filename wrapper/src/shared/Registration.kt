@file:Suppress("PackageDirectoryMismatch", "FunctionName")
package kotlin.godot.registration

import godot.godot_wrapper_register_class
import godot.godot_wrapper_register_method
import kotlinx.cinterop.staticCFunction
import simple.user.pack.TestClass
import simple.user.pack.TestClass2


class UserDefinedClasses {
    companion object {
        private fun registerTestClass() {
            godot_wrapper_register_class("TestClass", "Node",
                    staticCFunction { mem -> constructFromRawMem(mem, TestClassConstructor, TestClassSetRawMem) },
                    staticCFunction { mem -> deconstructFromRawMem<TestClass>(mem) })
            godot_wrapper_register_method("TestClass", "_ready",
                    staticCFunction { r, o, n, a -> invoke<TestClass>(r, o, n, a) { obj, numArgs, args -> run {
                        when (numArgs) {
                            0 -> {
                                TestClass_readyMethod0(obj)
                            }
                            else -> noMethodToInvoke("_ready", "TestClass", numArgs)
                        }
                        return@run null }}})

            godot_wrapper_register_class("TestClass2", "Node",
                    staticCFunction { mem -> constructFromRawMem(mem, TestClass2Constructor, TestClass2SetRawMem) },
                    staticCFunction { mem -> deconstructFromRawMem<TestClass2>(mem) })
            godot_wrapper_register_method("TestClass2", "_ready",
                    staticCFunction { r, o, n, a -> invoke<TestClass2>(r, o, n, a) { obj, numArgs, args -> run {
                        when (numArgs) {
                            0 -> {
                                TestClass2_readyMethod0(obj)
                            }
                            else -> noMethodToInvoke("_ready", "TestClass2", numArgs)
                        }
                        return@run null }}})
            /*godot_wrapper_register_method("TestClass", "_process",
                    staticCFunction { r, o, n, a -> invoke<TestClass>(r, o, n, a) { obj, numArgs, args -> run {
                        when (numArgs) {
                            1 -> {
                                val arg0 = Variant(args!![0]!!).toFloat()
                                TestClass_processMethod1(obj, arg0)
                            }
                            else -> noMethodToInvoke("_process", "TestClass", numArgs)
                        }
                        return@run null }}})*/
            /*godot_wrapper_register_method("TestClass", "method",
                    staticCFunction { r, o, n, a -> invoke<TestClass>(r, o, n, a) { obj, numArgs, args -> run {
                        when (numArgs) {
                            0 -> {
                                return@run Variant(TestClassMethodMethod0(obj))
                            }
                            1 -> {
                                val arg0 = Variant(args[0]!!).toInt()
                                //val arg1 = globalObjectPool.get(args[1]!!.toLong()) as? TestClass ?: Variant(args[1]!!).toObject(TestClass(""))
                                TestClassMethodMethod1(obj, arg0)
                            }
                            else -> noMethodToInvoke("method", "TestClass", numArgs)
                        }
                        return@run null }}})*/
        }


        fun registerAll() {
            registerTestClass()
        }
    }
}


private fun TestClassRawConstructor(): TestClass = TestClass()
private val TestClassConstructor = ::TestClassRawConstructor
private val TestClassSetRawMem = TestClass::setRawMemory


private fun TestClass_ready0(obj: TestClass) = obj._ready()
private val TestClass_readyMethod0 = ::TestClass_ready0




private fun TestClass2RawConstructor(): TestClass2 = TestClass2()
private val TestClass2Constructor = ::TestClass2RawConstructor
private val TestClass2SetRawMem = TestClass2::setRawMemory


private fun TestClass2_ready0(obj: TestClass2) = obj._ready()
private val TestClass2_readyMethod0 = ::TestClass2_ready0
/*
private fun TestClass_process1(obj: TestClass, arg0: Float) = obj._process(arg0)
private val TestClass_processMethod1 = ::TestClass_process1
*/
/*
private fun TestClassMethod0(obj: TestClass): String = obj.method()
private val TestClassMethodMethod0 = ::TestClassMethod0
private fun TestClassMethod1(obj: TestClass, arg0: Int) = obj.method(arg0)
private val TestClassMethodMethod1 = ::TestClassMethod1
*/

