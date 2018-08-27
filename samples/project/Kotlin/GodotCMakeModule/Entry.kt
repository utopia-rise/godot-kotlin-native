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
    registerClass("stages.shmup.Player", "KinematicBody2D", udcBridge0(), udcBridge1())
    registerMethod("stages.shmup.Player", "_ready", udcBridge2())
    registerMethod("stages.shmup.Player", "_process", udcBridge3())
    registerClass("stages.shmup.Bullet", "Area2D", udcBridge4(), udcBridge5())
    registerMethod("stages.shmup.Bullet", "_process", udcBridge6())
    registerClass("stages.shmup.Enemy", "Area2D", udcBridge7(), udcBridge8())
    registerMethod("stages.shmup.Enemy", "_ready", udcBridge9())
    registerMethod("stages.shmup.Enemy", "_process", udcBridge10())
    registerProperty("stages.shmup.Enemy", "health", true, udcBridge11(), udcBridge12(), udcBridge13())
    registerClass("stages.shmup.EnemyPath", "Path2D", udcBridge14(), udcBridge15())
    registerMethod("stages.shmup.EnemyPath", "_ready", udcBridge16())
    registerClass("stages.shmup.Stage", "Node", udcBridge17(), udcBridge18())
    registerMethod("stages.shmup.Stage", "_ready", udcBridge19())
    registerMethod("stages.shmup.Stage", "_process", udcBridge20())
    registerClass("stages.shmup.Camera", "Camera2D", udcBridge21(), udcBridge22())
    registerMethod("stages.shmup.Camera", "_process", udcBridge23())
    registerMethod("stages.shmup.Camera", "shake", udcBridge24())
}



// Bindings
private fun udcBinding0Constructor(): stages.shmup.Player = stages.shmup.Player()
private val udcBinding0 = ::udcBinding0Constructor
private fun udcBinding1Constructor(): stages.shmup.Bullet = stages.shmup.Bullet()
private val udcBinding1 = ::udcBinding1Constructor
private fun udcBinding2Constructor(): stages.shmup.Enemy = stages.shmup.Enemy()
private val udcBinding2 = ::udcBinding2Constructor
private fun udcBinding3Constructor(): stages.shmup.EnemyPath = stages.shmup.EnemyPath()
private val udcBinding3 = ::udcBinding3Constructor
private fun udcBinding4Constructor(): stages.shmup.Stage = stages.shmup.Stage()
private val udcBinding4 = ::udcBinding4Constructor
private fun udcBinding5Constructor(): stages.shmup.Camera = stages.shmup.Camera()
private val udcBinding5 = ::udcBinding5Constructor



// Bridges
private fun udcBridge0(): CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>> {
    return staticCFunction { mem -> constructFromRawMem(mem, udcBinding0) }
}
private fun udcBridge1(): CPointer<CFunction<(COpaquePointer?) -> Unit>> {
    return staticCFunction { mem -> deconstructFromRawMem<stages.shmup.Player>(mem) }
}
private fun udcBridge2(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<stages.shmup.Player>("_ready", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj._ready()
            }
            else -> noMethodToInvoke("_ready", "stages.shmup.Player", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge3(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<stages.shmup.Player>("_process", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            1 -> {
                args!!
                val arg0 = Variant(args[0]!!).toFloat()
                obj._process(arg0)
            }
            else -> noMethodToInvoke("_process", "stages.shmup.Player", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge4(): CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>> {
    return staticCFunction { mem -> constructFromRawMem(mem, udcBinding1) }
}
private fun udcBridge5(): CPointer<CFunction<(COpaquePointer?) -> Unit>> {
    return staticCFunction { mem -> deconstructFromRawMem<stages.shmup.Bullet>(mem) }
}
private fun udcBridge6(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<stages.shmup.Bullet>("_process", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            1 -> {
                args!!
                val arg0 = Variant(args[0]!!).toFloat()
                obj._process(arg0)
            }
            else -> noMethodToInvoke("_process", "stages.shmup.Bullet", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge7(): CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>> {
    return staticCFunction { mem -> constructFromRawMem(mem, udcBinding2) }
}
private fun udcBridge8(): CPointer<CFunction<(COpaquePointer?) -> Unit>> {
    return staticCFunction { mem -> deconstructFromRawMem<stages.shmup.Enemy>(mem) }
}
private fun udcBridge9(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<stages.shmup.Enemy>("_ready", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj._ready()
            }
            else -> noMethodToInvoke("_ready", "stages.shmup.Enemy", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge10(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<stages.shmup.Enemy>("_process", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            1 -> {
                args!!
                val arg0 = Variant(args[0]!!).toFloat()
                obj._process(arg0)
            }
            else -> noMethodToInvoke("_process", "stages.shmup.Enemy", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge11(): CPointer<CFunction<(COpaquePointer?,COpaquePointer?) -> Unit>> {
    return staticCFunction { o, r -> get<stages.shmup.Enemy>("health", "stages.shmup.Enemy", o, r) {
        obj -> Variant(obj.health)
    }}
}
private fun udcBridge12(): CPointer<CFunction<(COpaquePointer?,COpaquePointer?) -> Unit>> {
    return staticCFunction { o, v -> set<stages.shmup.Enemy>("health", "stages.shmup.Enemy", o, v) {
        obj, value -> obj.health = value.toInt()
    }}
}
private fun udcBridge13(): Variant {
    return Variant(2)
}
private fun udcBridge14(): CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>> {
    return staticCFunction { mem -> constructFromRawMem(mem, udcBinding3) }
}
private fun udcBridge15(): CPointer<CFunction<(COpaquePointer?) -> Unit>> {
    return staticCFunction { mem -> deconstructFromRawMem<stages.shmup.EnemyPath>(mem) }
}
private fun udcBridge16(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<stages.shmup.EnemyPath>("_ready", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj._ready()
            }
            else -> noMethodToInvoke("_ready", "stages.shmup.EnemyPath", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge17(): CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>> {
    return staticCFunction { mem -> constructFromRawMem(mem, udcBinding4) }
}
private fun udcBridge18(): CPointer<CFunction<(COpaquePointer?) -> Unit>> {
    return staticCFunction { mem -> deconstructFromRawMem<stages.shmup.Stage>(mem) }
}
private fun udcBridge19(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<stages.shmup.Stage>("_ready", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj._ready()
            }
            else -> noMethodToInvoke("_ready", "stages.shmup.Stage", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge20(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<stages.shmup.Stage>("_process", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            1 -> {
                args!!
                val arg0 = Variant(args[0]!!).toFloat()
                obj._process(arg0)
            }
            else -> noMethodToInvoke("_process", "stages.shmup.Stage", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge21(): CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>> {
    return staticCFunction { mem -> constructFromRawMem(mem, udcBinding5) }
}
private fun udcBridge22(): CPointer<CFunction<(COpaquePointer?) -> Unit>> {
    return staticCFunction { mem -> deconstructFromRawMem<stages.shmup.Camera>(mem) }
}
private fun udcBridge23(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<stages.shmup.Camera>("_process", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            1 -> {
                args!!
                val arg0 = Variant(args[0]!!).toFloat()
                obj._process(arg0)
            }
            else -> noMethodToInvoke("_process", "stages.shmup.Camera", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge24(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<stages.shmup.Camera>("shake", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            3 -> {
                args!!
                val arg0 = Variant(args[0]!!).toDouble()
                val arg1 = Variant(args[1]!!).toDouble()
                val arg2 = Variant(args[2]!!).toDouble()
                obj.shake(arg0, arg1, arg2)
            }
            else -> noMethodToInvoke("shake", "stages.shmup.Camera", numArgs)
        }
        return@run null }}
    }
}
