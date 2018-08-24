package godot.tests

import konan.internal.CName
import kotlinx.cinterop.*
import godot.gdnative.*
import godot.*
import godot.registration.*


class Tests : Node() {
    override fun _ready() {
        DictionaryTest().test()
        PoolByteArrayTest().test()
        PoolIntArrayTest().test()
        PoolRealArrayTest().test()
        PoolVector2ArrayTest().test()
        PoolVector3ArrayTest().test()
        PoolColorArrayTest().test()
        GodotArrayTest().test()
        AABBTest().test()
    }
}


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

    registerClass("godot.tests.Tests", "Node",
            staticCFunction { mem -> constructFromRawMem(mem, TestsConstructorBind) },
            staticCFunction { mem -> deconstructFromRawMem<Tests>(mem) })

    registerMethod("godot.tests.Tests", "_ready",
            staticCFunction { r, o, n, a -> invoke<Tests>("_ready", r, o, n, a) { obj, numArgs, args -> run {
                when (numArgs) {
                    0 -> obj._ready()
                    else -> noMethodToInvoke("_ready", "godot.tests.Tests", numArgs)
                }
                return@run null }}})
}

private fun TestsConstructor(): Tests = Tests()
private val TestsConstructorBind = ::TestsConstructor