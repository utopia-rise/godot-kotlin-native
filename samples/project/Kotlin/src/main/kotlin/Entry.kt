@file:Suppress("PackageDirectoryMismatch", "FunctionName", "UNUSED_ANONYMOUS_PARAMETER")
package kotlin.godot.entry

import konan.internal.CName
import kotlinx.cinterop.*
import godot.gdnative.*
import godot.core.*
import godot.*
import godot.registration.*
import stages.shmup.*
import stages.shmup.Camera


@CName("godot_gdnative_init")
fun GDNativeInit(options: godot_gdnative_init_options) {
    println("DEBIL")
    godot_wrapper_gdnative_init(options.ptr)
    println("DEBIL")
}


@CName("godot_gdnative_terminate")
fun GDNativeTerminate(options: godot_gdnative_terminate_options) {
    godot_wrapper_gdnative_terminate(options.ptr)
}


@CName("godot_nativescript_init")
fun NativeScriptInit(handle: COpaquePointer) {
    godot_wrapper_nativescript_init(handle)


    //registerClass("", "", udcBridge(), udcBridge())
    //registerMethod("", "", udcBridge())
    registerClass("shmup.Player", "KinematicBody2D", udcBridge0(), udcBridge1())
    registerClass("shmup.Bullet", "Area2D", udcBridge2(), udcBridge3())
    registerClass("shmup.Enemy", "Area2D", udcBridge4(), udcBridge5())
    registerClass("shmup.EnemyPath", "Path2D", udcBridge6(), udcBridge7())
    registerClass("shmup.Stage", "Node", udcBridge8(), udcBridge9())
    registerClass("shmup.mCamera", "Camera2D", udcBridge10(), udcBridge11())

    registerMethod("shmup.Player", "_ready", udcBridge12())
    registerMethod("shmup.Player", "_process", udcBridge13())
    registerMethod("shmup.Bullet", "_process", udcBridge14())
    registerMethod("shmup.Enemy", "_ready", udcBridge15())
    registerMethod("shmup.Enemy", "_process", udcBridge16())
    registerMethod("shmup.EnemyPath", "_ready", udcBridge17())
    registerMethod("shmup.Stage", "_ready", udcBridge18())
    registerMethod("shmup.Stage", "_process", udcBridge19())
    registerMethod("shmup.mCamera", "_process", udcBridge20())
    registerMethod("shmup.mCamera", "shake", udcBridge21())

    registerProperty("shmup.Enemy", "health", true, udcBrigde22(), udcBrigde23(), udcBridge24())

    //registerProperty("simple.user.pack.TestClass", "childScript", true, udcBrigde6(), udcBrigde7(), udcBridge8())
}

// Bindings
private fun PlayerRawConstructor(): Player = Player()
private val PlayerConstructor = ::PlayerRawConstructor
private fun BulletRawConstructor(): Bullet = Bullet()
private val BulletConstructor = ::BulletRawConstructor
private fun EnemyRawConstructor(): Enemy = Enemy()
private val EnemyConstructor = ::EnemyRawConstructor
private fun EnemyPathRawConstructor(): EnemyPath = EnemyPath()
private val EnemyPathConstructor = ::EnemyPathRawConstructor
private fun StageRawConstructor(): Stage = Stage()
private val StageConstructor = ::StageRawConstructor
private fun CameraRawConstructor(): Camera = Camera()
private val CameraConstructor = ::CameraRawConstructor



// Bridges
private fun udcBridge0(): CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>> {
    return staticCFunction { mem -> constructFromRawMem(mem, PlayerConstructor) }
}
private fun udcBridge1(): CPointer<CFunction<(COpaquePointer?) -> Unit>> {
    return staticCFunction { mem -> deconstructFromRawMem<Player>(mem) }
}
private fun udcBridge2(): CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>> {
    return staticCFunction { mem -> constructFromRawMem(mem, BulletConstructor) }
}
private fun udcBridge3(): CPointer<CFunction<(COpaquePointer?) -> Unit>> {
    return staticCFunction { mem -> deconstructFromRawMem<Bullet>(mem) }
}
private fun udcBridge4(): CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>> {
    return staticCFunction { mem -> constructFromRawMem(mem, EnemyConstructor) }
}
private fun udcBridge5(): CPointer<CFunction<(COpaquePointer?) -> Unit>> {
    return staticCFunction { mem -> deconstructFromRawMem<Enemy>(mem) }
}
private fun udcBridge6(): CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>> {
    return staticCFunction { mem -> constructFromRawMem(mem, EnemyPathConstructor) }
}
private fun udcBridge7(): CPointer<CFunction<(COpaquePointer?) -> Unit>> {
    return staticCFunction { mem -> deconstructFromRawMem<EnemyPath>(mem) }
}
private fun udcBridge8(): CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>> {
    return staticCFunction { mem -> constructFromRawMem(mem, StageConstructor) }
}
private fun udcBridge9(): CPointer<CFunction<(COpaquePointer?) -> Unit>> {
    return staticCFunction { mem -> deconstructFromRawMem<Stage>(mem) }
}
private fun udcBridge10(): CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>> {
    return staticCFunction { mem -> constructFromRawMem(mem, CameraConstructor) }
}
private fun udcBridge11(): CPointer<CFunction<(COpaquePointer?) -> Unit>> {
    return staticCFunction { mem -> deconstructFromRawMem<Camera>(mem) }
}



private fun udcBridge12(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<Player>("_ready", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj._ready()
            }
            else -> noMethodToInvoke("_ready", "shmup.Player", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge13(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<Player>("_process", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            1 -> {
                args!!
                val arg0 = Variant(args[0]!!).toFloat()
                obj._process(arg0)
            }
            else -> noMethodToInvoke("_process", "shmup.Player", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge14(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<Bullet>("_process", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            1 -> {
                args!!
                val arg0 = Variant(args[0]!!).toFloat()
                obj._process(arg0)
            }
            else -> noMethodToInvoke("_process", "shmup.Bullet", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge15(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<Enemy>("_ready", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj._ready()
            }
            else -> noMethodToInvoke("_ready", "shmup.Enemy", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge16(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<Enemy>("_process", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            1 -> {
                args!!
                val arg0 = Variant(args[0]!!).toFloat()
                obj._process(arg0)
            }
            else -> noMethodToInvoke("_process", "shmup.Enemy", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge17(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<EnemyPath>("_ready", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj._ready()
            }
            else -> noMethodToInvoke("_ready", "shmup.EnemyPath", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge18(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<Stage>("_ready", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj._ready()
            }
            else -> noMethodToInvoke("_ready", "shmup.Stage", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge19(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<Stage>("_process", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            1 -> {
                args!!
                val arg0 = Variant(args[0]!!).toFloat()
                obj._process(arg0)
            }
            else -> noMethodToInvoke("_process", "shmup.Stage", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge20(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<Camera>("_process", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            1 -> {
                args!!
                val arg0 = Variant(args[0]!!).toFloat()
                obj._process(arg0)
            }
            else -> noMethodToInvoke("_process", "shmup.mCamera", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge21(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<Camera>("shake", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            3 -> {
                args!!
                val arg0 = Variant(args[0]!!).toDouble()
                val arg1 = Variant(args[1]!!).toDouble()
                val arg2 = Variant(args[2]!!).toDouble()
                obj.shake(arg0, arg1, arg2)
            }
            else -> noMethodToInvoke("shake", "shmup.mCamera", numArgs)
        }
        return@run null }}
    }
}

private fun udcBrigde22(): CPointer<CFunction<(COpaquePointer?,COpaquePointer?) -> Unit>> {
    return staticCFunction { o, r -> get<Enemy>("health", "shmup.Enemy", o, r) {
        obj -> Variant(obj.health)
    }}
}
private fun udcBrigde23(): CPointer<CFunction<(COpaquePointer?,COpaquePointer?) -> Unit>> {
    return staticCFunction { o, v -> set<Enemy>("health", "shmup.Enemy", o, v) {
        obj, value -> obj.health = value.toInt()
    }}
}
private fun udcBridge24(): Variant {
    return Variant(2)
}






// Bindings


// Bridges
/*private fun udcBridge(): CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>> {
    return staticCFunction { mem -> constructFromRawMem(mem, ) }
}
private fun udcBridge(): CPointer<CFunction<(COpaquePointer?) -> Unit>> {
    return staticCFunction { mem -> deconstructFromRawMem<>(mem) }
}

private fun udcBridge(): CPointer<CFunction<(COpaquePointer?,COpaquePointer?,Int,COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<>("_ready", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj._ready()
            }
            else -> noMethodToInvoke("_ready", "", numArgs)
        }
        return@run null }}}
}
private fun udcBridge(): CPointer<CFunction<(COpaquePointer?,COpaquePointer?,Int,COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<>("_process", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            1 -> {
                args!!
                val arg0 = Variant(args[0]!!).toFloat()
                obj._process(arg0)
            }
            else -> noMethodToInvoke("_process", "", numArgs)
        }
        return@run null }}}
}*/