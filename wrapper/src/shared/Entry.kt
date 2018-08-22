@file:Suppress("PackageDirectoryMismatch", "FunctionName", "UNUSED_ANONYMOUS_PARAMETER")
package kotlin.godot.entry

import konan.internal.CName
import kotlinx.cinterop.*
import godot.gdnative.*
import godot.core.*
import godot.*
import godot.registration.*



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

    registerClass("simple.user.pack.TestClass", "Node", udcBridge0(), udcBridge1())
    registerProperty("simple.user.pack.TestClass", "childScript", true, udcBrigde6(), udcBrigde7(), udcBridge8())
    registerMethod("simple.user.pack.TestClass", "_ready", udcBridge2())
    registerClass("simple.user.pack.TestClass2", "Node", udcBridge3(), udcBridge4())
    registerMethod("simple.user.pack.TestClass2", "_ready", udcBridge5())
}



// Bindings
private fun TestClassRawConstructor(): simple.user.pack.TestClass = simple.user.pack.TestClass()
private val TestClassConstructor = ::TestClassRawConstructor
private fun TestClass2RawConstructor(): simple.user.pack.TestClass2 = simple.user.pack.TestClass2()
private val TestClass2Constructor = ::TestClass2RawConstructor



// Bridges
private fun udcBridge0(): CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>> {
    return staticCFunction { mem -> constructFromRawMem(mem, TestClassConstructor) }
}
private fun udcBridge1(): CPointer<CFunction<(COpaquePointer?) -> Unit>> {
    return staticCFunction { mem -> deconstructFromRawMem<simple.user.pack.TestClass>(mem) }
}
private fun udcBridge2(): CPointer<CFunction<(COpaquePointer?,COpaquePointer?,Int,COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<simple.user.pack.TestClass>("_ready", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj._ready()
            }
            else -> noMethodToInvoke("_ready", "simple.user.pack.TestClass", numArgs)
        }
        return@run null }}}
}
private fun udcBridge3(): CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>> {
    return staticCFunction { mem -> constructFromRawMem(mem, TestClass2Constructor) }
}
private fun udcBridge4(): CPointer<CFunction<(COpaquePointer?) -> Unit>> {
    return staticCFunction { mem -> deconstructFromRawMem<simple.user.pack.TestClass2>(mem) }
}
private fun udcBridge5(): CPointer<CFunction<(COpaquePointer?,COpaquePointer?,Int,COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<simple.user.pack.TestClass2>("_ready", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj._ready()
            }
            else -> noMethodToInvoke("_ready", "simple.user.pack.TestClass2", numArgs)
        }
        return@run null }}}
}
private fun udcBrigde6(): CPointer<CFunction<(COpaquePointer?,COpaquePointer?) -> Unit>> {
    return staticCFunction { o, r -> get<simple.user.pack.TestClass>("childScript", "simple.user.pack.TestClass", o, r) {
        obj -> Variant(obj.childScript)
    }}
}
private fun udcBrigde7(): CPointer<CFunction<(COpaquePointer?,COpaquePointer?) -> Unit>> {
    return staticCFunction { o, v -> set<simple.user.pack.TestClass>("childScript", "simple.user.pack.TestClass", o, v) {
        obj, value -> obj.childScript = Script from value
    }}
}
private fun udcBridge8(): Variant {
    return Variant(ResourceLoader.load("res://godot_wrapper/TestClass2.gdns"))
}