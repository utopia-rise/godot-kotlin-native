package kotlin.godot.registration

import godot.godot_wrapper_register_class
import godot.godot_wrapper_register_method
import kotlinx.cinterop.get
import kotlinx.cinterop.staticCFunction
import simple.user.pack.TestClass
import kotlin.godot.core.Variant


class UserDefinedClasses {
    companion object {
        private fun registerTestClass() {
            godot_wrapper_register_class("TestClass", "Node",
                    staticCFunction { mem -> constructFromRawMem(mem, TestClassConstructor, TestClassSetRawMem) },
                    staticCFunction { mem -> deconstructFromRawMem(mem) })
            godot_wrapper_register_method("TestClass", "method",
                    staticCFunction { r, o, n, a -> prepareInvocation<TestClass>(r, o, n, a) { obj, numArgs, args -> run {
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
                        return@run null }}})
        }


        fun registerAll() {
            registerTestClass()
        }
    }
}


private fun TestClassRawConstructor(): TestClass = TestClass("")
private val TestClassConstructor = ::TestClassRawConstructor
private val TestClassSetRawMem = TestClass::setRawMemory

private fun TestClassMethod1(obj: TestClass, arg0: Int) = obj.method(arg0)
private val TestClassMethodMethod1 = ::TestClassMethod1
private fun TestClassMethod0(obj: TestClass): String = obj.method()
private val TestClassMethodMethod0 = ::TestClassMethod0


