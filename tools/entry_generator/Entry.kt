@file:Suppress("PackageDirectoryMismatch", "FunctionName", "UNUSED_ANONYMOUS_PARAMETER")
package kotlin.godot.entry

import konan.internal.CName
import kotlinx.cinterop.*
import godot.gdnative.*
import godot.core.*
import godot.*
import godot.registration.*


// NOTE THIS FILE IS AUTO-GENERATED


@CName("godot_gdnative_init")
fun GDNativeInit(options: godot_gdnative_init_options) {
    godot_wrapper_gdnative_init(options.ptr)
}


@CName("godot_gdnative_terminate")
fun GDNativeTerminate(options: godot_gdnative_terminate_options) {
    godot_wrapper_gdnative_terminate(options.ptr)
}


@CName("godot_nativescript_init")
fun NativeScriptInit(handle: COpaquePointer) {
    godot_wrapper_nativescript_init(handle)

    // Let's do some registration magic.
    registerClass("TestClass2", "Node", udcBridge0(), udcBridge1())
    registerMethod("TestClass2", "_process", udcBridge2())
    registerClass("TestClass", "Node", udcBridge3(), udcBridge4())
    registerMethod("TestClass", "_ready", udcBridge5())
    registerMethod("TestClass", "_process", udcBridge6())
    registerProperty("TestClass", "test", true, udcBridge7(), udcBridge8(), udcBridge9())
    registerSignal("TestClass", "Sanya")
    registerSignal("TestClass", "Sanya2",
             arrayOf("arg" to Variant.Type.OBJECT))
    registerClass("TestClass3", "TestClass", udcBridge10(), udcBridge11())
}



// Bindings
private fun udcBinding0Constructor(): TestClass2 = TestClass2()
private val udcBinding0 = ::udcBinding0Constructor
private fun udcBinding1Constructor(): TestClass = TestClass()
private val udcBinding1 = ::udcBinding1Constructor
private fun udcBinding2Constructor(): TestClass3 = TestClass3()
private val udcBinding2 = ::udcBinding2Constructor



// Bridges
private fun udcBridge0(): CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>> {
    return staticCFunction { mem -> constructFromRawMem(mem, udcBinding0) }
}
private fun udcBridge1(): CPointer<CFunction<(COpaquePointer?) -> Unit>> {
    return staticCFunction { mem -> deconstructFromRawMem<TestClass2>(mem) }
}
private fun udcBridge2(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<TestClass2>("_process", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            1 -> {
                args!!
                val arg0 = Variant(args[0]!!).toFloat()
                obj._process(arg0)
            }
            else -> noMethodToInvoke("_process", "TestClass2", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge3(): CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>> {
    return staticCFunction { mem -> constructFromRawMem(mem, udcBinding1) }
}
private fun udcBridge4(): CPointer<CFunction<(COpaquePointer?) -> Unit>> {
    return staticCFunction { mem -> deconstructFromRawMem<TestClass>(mem) }
}
private fun udcBridge5(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<TestClass>("_ready", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj._ready()
            }
            else -> noMethodToInvoke("_ready", "TestClass", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge6(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<TestClass>("_process", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            1 -> {
                args!!
                val arg0 = Variant(args[0]!!).toFloat()
                obj._process(arg0)
            }
            else -> noMethodToInvoke("_process", "TestClass", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge7(): CPointer<CFunction<(COpaquePointer?,COpaquePointer?) -> Unit>> {
    return staticCFunction { o, r -> get<TestClass>("test", "TestClass", o, r) {
        obj -> Variant(obj.test)
    }}
}
private fun udcBridge8(): CPointer<CFunction<(COpaquePointer?,COpaquePointer?) -> Unit>> {
    return staticCFunction { o, v -> set<TestClass>("test", "TestClass", o, v) {
        obj, value -> obj.test = value.toInt()
    }}
}
private fun udcBridge9(): Variant {
    return Variant(42)
}
private fun udcBridge10(): CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>> {
    return staticCFunction { mem -> constructFromRawMem(mem, udcBinding2) }
}
private fun udcBridge11(): CPointer<CFunction<(COpaquePointer?) -> Unit>> {
    return staticCFunction { mem -> deconstructFromRawMem<TestClass3>(mem) }
}
