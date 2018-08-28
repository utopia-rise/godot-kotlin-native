@file:Suppress("PackageDirectoryMismatch", "FunctionName", "UNUSED_ANONYMOUS_PARAMETER")
package kotlin.godot.entry

import godot.Object
import konan.internal.CName
import kotlinx.cinterop.*
import godot.gdnative.*
import godot.core.*
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

    registerClass("dodge.Mob", "RigidBody2D", mobBridge0(), mobBridge1())
    registerMethod("dodge.Mob", "_ready", mobBridge2())
    registerProperty("dodge.Mob", "minSpeed", true, mobBridge3(), mobBridge4(), mobBridge5())
    registerProperty("dodge.Mob", "maxSpeed", true, mobBridge6(), mobBridge7(), mobBridge8())

    registerClass("dodge.Player", "Area2D", playerBridge0(), playerBridge1())
    registerMethod("dodge.Player", "_ready", playerBridge2())
    registerMethod("dodge.Player", "_process", playerBridge3())
    registerMethod("dodge.Player", "_on_Player_body_entered", playerBridge4())
    registerMethod("dodge.Player", "start", playerBridge5())
    registerProperty("dodge.Player", "speed", true, playerBridge6(), playerBridge7(), playerBridge8())
    registerSignal("dodge.Player", "hit")


}



// Bindings
private fun MobRawConstructor(): dodge.Mob = dodge.Mob()
private val MobConstructor = ::MobRawConstructor
private fun PlayerRawConstructor(): dodge.Player = dodge.Player()
private val PlayerConstructor = ::PlayerRawConstructor



// Bridges
private fun mobBridge0(): CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>> {
    return staticCFunction { mem -> constructFromRawMem(mem, MobConstructor) }
}
private fun mobBridge1(): CPointer<CFunction<(COpaquePointer?) -> Unit>> {
    return staticCFunction { mem -> deconstructFromRawMem<dodge.Mob>(mem) }
}
private fun mobBridge2(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<dodge.Mob>("_ready", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj._ready()
            }
            else -> noMethodToInvoke("_ready", "dodge.Mob", numArgs)
        }
        return@run null }}}
}

private fun mobBridge3(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?) -> Unit>> {
    return staticCFunction { o, r -> get<dodge.Mob>("minSpeed", "dodge.Mob", o, r) {
        obj -> Variant(obj.minSpeed)
    }}
}
private fun mobBridge4(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?) -> Unit>> {
    return staticCFunction { o, v -> set<dodge.Mob>("minSpeed", "dodge.Mob", o, v) {
        obj, value -> obj.minSpeed = value.toFloat()
    }}
}

private fun mobBridge5(): Variant {
    return Variant(150)
}

private fun mobBridge6(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?) -> Unit>> {
    return staticCFunction { o, r -> get<dodge.Mob>("maxSpeed", "dodge.Mob", o, r) {
        obj -> Variant(obj.maxSpeed)
    }}
}
private fun mobBridge7(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?) -> Unit>> {
    return staticCFunction { o, v -> set<dodge.Mob>("maxSpeed", "dodge.Mob", o, v) {
        obj, value -> obj.maxSpeed = value.toFloat()
    }}
}

private fun mobBridge8(): Variant {
    return Variant(250)
}

//private fun udcBridge3(): CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>> {
//    return staticCFunction { mem -> constructFromRawMem(mem, TestClass2Constructor) }
//}
//private fun udcBridge4(): CPointer<CFunction<(COpaquePointer?) -> Unit>> {
//    return staticCFunction { mem -> deconstructFromRawMem<simple.user.pack.TestClass2>(mem) }
//}
//private fun udcBridge5(): CPointer<CFunction<(COpaquePointer?,COpaquePointer?,Int,COpaquePointer?) -> Unit>> {
//    return staticCFunction { r, o, n, a -> invoke<simple.user.pack.TestClass2>("_ready", r, o, n, a) { obj, numArgs, args -> run {
//        when (numArgs) {
//            0 -> {
//                obj._ready()
//            }
//            else -> noMethodToInvoke("_ready", "simple.user.pack.TestClass2", numArgs)
//        }
//        return@run null }}}
//}
private fun playerBridge0(): CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>> {
    return staticCFunction { mem -> constructFromRawMem(mem, PlayerConstructor) }
}
private fun playerBridge1(): CPointer<CFunction<(COpaquePointer?) -> Unit>> {
    return staticCFunction { mem -> deconstructFromRawMem<dodge.Player>(mem) }
}
private fun playerBridge2(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<dodge.Player>("_ready", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj._ready()
            }
            else -> noMethodToInvoke("_ready", "dodge.Player", numArgs)
        }
        return@run null }}}
}
private fun playerBridge3(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<dodge.Player>("_process", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            1 -> {
                val arg0 = Variant(args!![0]!!).toFloat()
                obj._process(arg0)
            }
            else -> noMethodToInvoke("_process", "dodge.Player", numArgs)
        }
        return@run null }}}
}
private fun playerBridge4(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<dodge.Player>("_on_Player_body_entered", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            1 -> {
                val arg0 = Object from Variant(args!![0]!!)
                obj._on_Player_body_entered(arg0)
            }
            else -> noMethodToInvoke("_on_Player_body_entered", "dodge.Player", numArgs)
        }
        return@run null }}}
}
private fun playerBridge5(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<dodge.Player>("start", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            1 -> {
                val arg0 = Variant(args!![0]!!).toVector2()
                obj.start(arg0)
            }
            else -> noMethodToInvoke("start", "dodge.Player", numArgs)
        }
        return@run null }}}
}

private fun playerBridge6(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?) -> Unit>> {
    return staticCFunction { o, r -> get<dodge.Player>("speed", "dodge.Player", o, r) {
        obj -> Variant(obj.speed)
    }}
}
private fun playerBridge7(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?) -> Unit>> {
    return staticCFunction { o, v -> set<dodge.Player>("speed", "dodge.Player", o, v) {
        obj, value -> obj.speed = value.toFloat()
    }}
}

private fun playerBridge8(): Variant {
    return Variant(400)
}