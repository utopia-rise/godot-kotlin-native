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
    registerClass("godot.samples.games.shmup.Player", "KinematicBody2D", udcBridge0(), udcBridge1())
    registerMethod("godot.samples.games.shmup.Player", "_ready", udcBridge2())
    registerMethod("godot.samples.games.shmup.Player", "_process", udcBridge3())
    registerProperty("godot.samples.games.shmup.Player", "speed", true, udcBridge4(), udcBridge5(), udcBridge6())
    registerClass("godot.samples.games.shmup.Bullet", "Area2D", udcBridge7(), udcBridge8())
    registerMethod("godot.samples.games.shmup.Bullet", "_process", udcBridge9())
    registerClass("godot.samples.games.shmup.Enemy", "Area2D", udcBridge10(), udcBridge11())
    registerMethod("godot.samples.games.shmup.Enemy", "_ready", udcBridge12())
    registerMethod("godot.samples.games.shmup.Enemy", "_process", udcBridge13())
    registerProperty("godot.samples.games.shmup.Enemy", "health", true, udcBridge14(), udcBridge15(), udcBridge16())
    registerClass("godot.samples.games.shmup.EnemyPath", "Path2D", udcBridge17(), udcBridge18())
    registerMethod("godot.samples.games.shmup.EnemyPath", "_ready", udcBridge19())
    registerClass("godot.samples.games.shmup.Stage", "Node", udcBridge20(), udcBridge21())
    registerMethod("godot.samples.games.shmup.Stage", "_ready", udcBridge22())
    registerMethod("godot.samples.games.shmup.Stage", "_process", udcBridge23())
    registerClass("godot.samples.games.shmup.Camera", "Camera2D", udcBridge24(), udcBridge25())
    registerMethod("godot.samples.games.shmup.Camera", "_process", udcBridge26())
    registerMethod("godot.samples.games.shmup.Camera", "shake", udcBridge27())
    registerClass("godot.samples.games.dodge.Player", "Area2D", udcBridge28(), udcBridge29())
    registerMethod("godot.samples.games.dodge.Player", "_ready", udcBridge30())
    registerMethod("godot.samples.games.dodge.Player", "_process", udcBridge31())
    registerMethod("godot.samples.games.dodge.Player", "_on_Player_body_entered", udcBridge32())
    registerMethod("godot.samples.games.dodge.Player", "start", udcBridge33())
    registerProperty("godot.samples.games.dodge.Player", "speed", true, udcBridge34(), udcBridge35(), udcBridge36())
    registerSignal("godot.samples.games.dodge.Player", "hit")
    registerClass("godot.samples.games.dodge.Main", "Node", udcBridge37(), udcBridge38())
    registerMethod("godot.samples.games.dodge.Main", "_ready", udcBridge39())
    registerMethod("godot.samples.games.dodge.Main", "gameOver", udcBridge40())
    registerMethod("godot.samples.games.dodge.Main", "newGame", udcBridge41())
    registerMethod("godot.samples.games.dodge.Main", "_onStartTimerTimeout", udcBridge42())
    registerMethod("godot.samples.games.dodge.Main", "_onScoreTimerTimeout", udcBridge43())
    registerMethod("godot.samples.games.dodge.Main", "_onMobTimerTimeout", udcBridge44())
    registerClass("godot.samples.games.dodge.HUD", "CanvasLayer", udcBridge45(), udcBridge46())
    registerMethod("godot.samples.games.dodge.HUD", "_ready", udcBridge47())
    registerMethod("godot.samples.games.dodge.HUD", "showMessage", udcBridge48())
    registerMethod("godot.samples.games.dodge.HUD", "showMenu", udcBridge49())
    registerMethod("godot.samples.games.dodge.HUD", "showGameOver", udcBridge50())
    registerMethod("godot.samples.games.dodge.HUD", "updateScore", udcBridge51())
    registerMethod("godot.samples.games.dodge.HUD", "_onMessageTimerTimeout", udcBridge52())
    registerMethod("godot.samples.games.dodge.HUD", "_onGameOverTimerTimeout", udcBridge53())
    registerMethod("godot.samples.games.dodge.HUD", "_onStartButtonPressed", udcBridge54())
    registerSignal("godot.samples.games.dodge.HUD", "startGame")
    registerClass("godot.samples.games.dodge.Mob", "RigidBody2D", udcBridge55(), udcBridge56())
    registerMethod("godot.samples.games.dodge.Mob", "_ready", udcBridge57())
    registerMethod("godot.samples.games.dodge.Mob", "_on_VisibilityNotifier2D_screen_exited", udcBridge58())
    registerProperty("godot.samples.games.dodge.Mob", "minSpeed", true, udcBridge59(), udcBridge60(), udcBridge61())
    registerProperty("godot.samples.games.dodge.Mob", "maxSpeed", true, udcBridge62(), udcBridge63(), udcBridge64())
    registerClass("godot.samples.games.catchBall.Player", "KinematicBody", udcBridge65(), udcBridge66())
    registerMethod("godot.samples.games.catchBall.Player", "_process", udcBridge67())
    registerProperty("godot.samples.games.catchBall.Player", "speed", true, udcBridge68(), udcBridge69(), udcBridge70())
    registerClass("godot.samples.games.catchBall.Ball", "RigidBody", udcBridge71(), udcBridge72())
    registerMethod("godot.samples.games.catchBall.Ball", "_ready", udcBridge73())
    registerClass("godot.samples.games.catchBall.BounceOff", "Area", udcBridge74(), udcBridge75())
    registerMethod("godot.samples.games.catchBall.BounceOff", "_process", udcBridge76())
    registerClass("godot.samples.games.catchBall.End", "Area", udcBridge77(), udcBridge78())
    registerMethod("godot.samples.games.catchBall.End", "_process", udcBridge79())
    registerClass("godot.samples.games.main.MainScreen", "Node", udcBridge80(), udcBridge81())
    registerMethod("godot.samples.games.main.MainScreen", "_ready", udcBridge82())
    registerMethod("godot.samples.games.main.MainScreen", "_onChooseGameButtonPressed", udcBridge83())
    registerMethod("godot.samples.games.main.MainScreen", "_onQuitButtonPressed", udcBridge84())
    registerClass("godot.samples.games.main.ChooseGameScreen", "Node", udcBridge85(), udcBridge86())
    registerMethod("godot.samples.games.main.ChooseGameScreen", "_ready", udcBridge87())
    registerMethod("godot.samples.games.main.ChooseGameScreen", "_onPlayDodgeButtonPressed", udcBridge88())
    registerMethod("godot.samples.games.main.ChooseGameScreen", "_onPlayShmupButtonPressed", udcBridge89())
    registerMethod("godot.samples.games.main.ChooseGameScreen", "_onBackButtonPressed", udcBridge90())
    registerMethod("godot.samples.games.main.ChooseGameScreen", "_onPlayCatchBallButtonPressed", udcBridge91())
    registerMethod("godot.samples.games.main.ChooseGameScreen", "_onPlayFastFinishButtonPressed", udcBridge92())
    registerClass("godot.samples.games.fastFinish.Player", "Area2D", udcBridge93(), udcBridge94())
    registerMethod("godot.samples.games.fastFinish.Player", "_ready", udcBridge95())
    registerMethod("godot.samples.games.fastFinish.Player", "_process", udcBridge96())
    registerProperty("godot.samples.games.fastFinish.Player", "speed", true, udcBridge97(), udcBridge98(), udcBridge99())
    registerClass("godot.samples.games.fastFinish.Stage", "Node", udcBridge100(), udcBridge101())
    registerMethod("godot.samples.games.fastFinish.Stage", "_ready", udcBridge102())
}



// Bindings
private fun udcBinding0Constructor(): godot.samples.games.shmup.Player = godot.samples.games.shmup.Player()
private val udcBinding0 = ::udcBinding0Constructor
private fun udcBinding1Constructor(): godot.samples.games.shmup.Bullet = godot.samples.games.shmup.Bullet()
private val udcBinding1 = ::udcBinding1Constructor
private fun udcBinding2Constructor(): godot.samples.games.shmup.Enemy = godot.samples.games.shmup.Enemy()
private val udcBinding2 = ::udcBinding2Constructor
private fun udcBinding3Constructor(): godot.samples.games.shmup.EnemyPath = godot.samples.games.shmup.EnemyPath()
private val udcBinding3 = ::udcBinding3Constructor
private fun udcBinding4Constructor(): godot.samples.games.shmup.Stage = godot.samples.games.shmup.Stage()
private val udcBinding4 = ::udcBinding4Constructor
private fun udcBinding5Constructor(): godot.samples.games.shmup.Camera = godot.samples.games.shmup.Camera()
private val udcBinding5 = ::udcBinding5Constructor
private fun udcBinding6Constructor(): godot.samples.games.dodge.Player = godot.samples.games.dodge.Player()
private val udcBinding6 = ::udcBinding6Constructor
private fun udcBinding7Constructor(): godot.samples.games.dodge.Main = godot.samples.games.dodge.Main()
private val udcBinding7 = ::udcBinding7Constructor
private fun udcBinding8Constructor(): godot.samples.games.dodge.HUD = godot.samples.games.dodge.HUD()
private val udcBinding8 = ::udcBinding8Constructor
private fun udcBinding9Constructor(): godot.samples.games.dodge.Mob = godot.samples.games.dodge.Mob()
private val udcBinding9 = ::udcBinding9Constructor
private fun udcBinding10Constructor(): godot.samples.games.catchBall.Player = godot.samples.games.catchBall.Player()
private val udcBinding10 = ::udcBinding10Constructor
private fun udcBinding11Constructor(): godot.samples.games.catchBall.Ball = godot.samples.games.catchBall.Ball()
private val udcBinding11 = ::udcBinding11Constructor
private fun udcBinding12Constructor(): godot.samples.games.catchBall.BounceOff = godot.samples.games.catchBall.BounceOff()
private val udcBinding12 = ::udcBinding12Constructor
private fun udcBinding13Constructor(): godot.samples.games.catchBall.End = godot.samples.games.catchBall.End()
private val udcBinding13 = ::udcBinding13Constructor
private fun udcBinding14Constructor(): godot.samples.games.main.MainScreen = godot.samples.games.main.MainScreen()
private val udcBinding14 = ::udcBinding14Constructor
private fun udcBinding15Constructor(): godot.samples.games.main.ChooseGameScreen = godot.samples.games.main.ChooseGameScreen()
private val udcBinding15 = ::udcBinding15Constructor
private fun udcBinding16Constructor(): godot.samples.games.fastFinish.Player = godot.samples.games.fastFinish.Player()
private val udcBinding16 = ::udcBinding16Constructor
private fun udcBinding17Constructor(): godot.samples.games.fastFinish.Stage = godot.samples.games.fastFinish.Stage()
private val udcBinding17 = ::udcBinding17Constructor



// Bridges
private fun udcBridge0(): CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>> {
    return staticCFunction { mem -> constructFromRawMem(mem, udcBinding0) }
}
private fun udcBridge1(): CPointer<CFunction<(COpaquePointer?) -> Unit>> {
    return staticCFunction { mem -> deconstructFromRawMem<godot.samples.games.shmup.Player>(mem) }
}
private fun udcBridge2(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.shmup.Player>("_ready", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj._ready()
            }
            else -> noMethodToInvoke("_ready", "godot.samples.games.shmup.Player", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge3(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.shmup.Player>("_process", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            1 -> {
                args!!
                val arg0 = Variant(args[0]!!).toDouble()
                obj._process(arg0)
            }
            else -> noMethodToInvoke("_process", "godot.samples.games.shmup.Player", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge4(): CPointer<CFunction<(COpaquePointer?,COpaquePointer?) -> Unit>> {
    return staticCFunction { o, r -> get<godot.samples.games.shmup.Player>("speed", "godot.samples.games.shmup.Player", o, r) {
        obj -> Variant(obj.speed)
    }}
}
private fun udcBridge5(): CPointer<CFunction<(COpaquePointer?,COpaquePointer?) -> Unit>> {
    return staticCFunction { o, v -> set<godot.samples.games.shmup.Player>("speed", "godot.samples.games.shmup.Player", o, v) {
        obj, value -> obj.speed = value.toDouble()
    }}
}
private fun udcBridge6(): Variant {
    return Variant(10)
}
private fun udcBridge7(): CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>> {
    return staticCFunction { mem -> constructFromRawMem(mem, udcBinding1) }
}
private fun udcBridge8(): CPointer<CFunction<(COpaquePointer?) -> Unit>> {
    return staticCFunction { mem -> deconstructFromRawMem<godot.samples.games.shmup.Bullet>(mem) }
}
private fun udcBridge9(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.shmup.Bullet>("_process", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            1 -> {
                args!!
                val arg0 = Variant(args[0]!!).toDouble()
                obj._process(arg0)
            }
            else -> noMethodToInvoke("_process", "godot.samples.games.shmup.Bullet", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge10(): CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>> {
    return staticCFunction { mem -> constructFromRawMem(mem, udcBinding2) }
}
private fun udcBridge11(): CPointer<CFunction<(COpaquePointer?) -> Unit>> {
    return staticCFunction { mem -> deconstructFromRawMem<godot.samples.games.shmup.Enemy>(mem) }
}
private fun udcBridge12(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.shmup.Enemy>("_ready", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj._ready()
            }
            else -> noMethodToInvoke("_ready", "godot.samples.games.shmup.Enemy", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge13(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.shmup.Enemy>("_process", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            1 -> {
                args!!
                val arg0 = Variant(args[0]!!).toDouble()
                obj._process(arg0)
            }
            else -> noMethodToInvoke("_process", "godot.samples.games.shmup.Enemy", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge14(): CPointer<CFunction<(COpaquePointer?,COpaquePointer?) -> Unit>> {
    return staticCFunction { o, r -> get<godot.samples.games.shmup.Enemy>("health", "godot.samples.games.shmup.Enemy", o, r) {
        obj -> Variant(obj.health)
    }}
}
private fun udcBridge15(): CPointer<CFunction<(COpaquePointer?,COpaquePointer?) -> Unit>> {
    return staticCFunction { o, v -> set<godot.samples.games.shmup.Enemy>("health", "godot.samples.games.shmup.Enemy", o, v) {
        obj, value -> obj.health = value.toInt()
    }}
}
private fun udcBridge16(): Variant {
    return Variant(2)
}
private fun udcBridge17(): CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>> {
    return staticCFunction { mem -> constructFromRawMem(mem, udcBinding3) }
}
private fun udcBridge18(): CPointer<CFunction<(COpaquePointer?) -> Unit>> {
    return staticCFunction { mem -> deconstructFromRawMem<godot.samples.games.shmup.EnemyPath>(mem) }
}
private fun udcBridge19(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.shmup.EnemyPath>("_ready", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj._ready()
            }
            else -> noMethodToInvoke("_ready", "godot.samples.games.shmup.EnemyPath", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge20(): CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>> {
    return staticCFunction { mem -> constructFromRawMem(mem, udcBinding4) }
}
private fun udcBridge21(): CPointer<CFunction<(COpaquePointer?) -> Unit>> {
    return staticCFunction { mem -> deconstructFromRawMem<godot.samples.games.shmup.Stage>(mem) }
}
private fun udcBridge22(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.shmup.Stage>("_ready", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj._ready()
            }
            else -> noMethodToInvoke("_ready", "godot.samples.games.shmup.Stage", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge23(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.shmup.Stage>("_process", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            1 -> {
                args!!
                val arg0 = Variant(args[0]!!).toDouble()
                obj._process(arg0)
            }
            else -> noMethodToInvoke("_process", "godot.samples.games.shmup.Stage", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge24(): CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>> {
    return staticCFunction { mem -> constructFromRawMem(mem, udcBinding5) }
}
private fun udcBridge25(): CPointer<CFunction<(COpaquePointer?) -> Unit>> {
    return staticCFunction { mem -> deconstructFromRawMem<godot.samples.games.shmup.Camera>(mem) }
}
private fun udcBridge26(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.shmup.Camera>("_process", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            1 -> {
                args!!
                val arg0 = Variant(args[0]!!).toDouble()
                obj._process(arg0)
            }
            else -> noMethodToInvoke("_process", "godot.samples.games.shmup.Camera", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge27(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.shmup.Camera>("shake", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            3 -> {
                args!!
                val arg0 = Variant(args[0]!!).toDouble()
                val arg1 = Variant(args[1]!!).toDouble()
                val arg2 = Variant(args[2]!!).toDouble()
                obj.shake(arg0, arg1, arg2)
            }
            else -> noMethodToInvoke("shake", "godot.samples.games.shmup.Camera", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge28(): CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>> {
    return staticCFunction { mem -> constructFromRawMem(mem, udcBinding6) }
}
private fun udcBridge29(): CPointer<CFunction<(COpaquePointer?) -> Unit>> {
    return staticCFunction { mem -> deconstructFromRawMem<godot.samples.games.dodge.Player>(mem) }
}
private fun udcBridge30(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.dodge.Player>("_ready", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj._ready()
            }
            else -> noMethodToInvoke("_ready", "godot.samples.games.dodge.Player", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge31(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.dodge.Player>("_process", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            1 -> {
                args!!
                val arg0 = Variant(args[0]!!).toDouble()
                obj._process(arg0)
            }
            else -> noMethodToInvoke("_process", "godot.samples.games.dodge.Player", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge32(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.dodge.Player>("_on_Player_body_entered", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            1 -> {
                args!!
                val arg0 = Object(Variant(args[0]!!))
                obj._on_Player_body_entered(arg0)
            }
            else -> noMethodToInvoke("_on_Player_body_entered", "godot.samples.games.dodge.Player", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge33(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.dodge.Player>("start", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            1 -> {
                args!!
                val arg0 = Variant(args[0]!!).toVector2()
                obj.start(arg0)
            }
            else -> noMethodToInvoke("start", "godot.samples.games.dodge.Player", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge34(): CPointer<CFunction<(COpaquePointer?,COpaquePointer?) -> Unit>> {
    return staticCFunction { o, r -> get<godot.samples.games.dodge.Player>("speed", "godot.samples.games.dodge.Player", o, r) {
        obj -> Variant(obj.speed)
    }}
}
private fun udcBridge35(): CPointer<CFunction<(COpaquePointer?,COpaquePointer?) -> Unit>> {
    return staticCFunction { o, v -> set<godot.samples.games.dodge.Player>("speed", "godot.samples.games.dodge.Player", o, v) {
        obj, value -> obj.speed = value.toInt()
    }}
}
private fun udcBridge36(): Variant {
    return Variant(400)
}
private fun udcBridge37(): CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>> {
    return staticCFunction { mem -> constructFromRawMem(mem, udcBinding7) }
}
private fun udcBridge38(): CPointer<CFunction<(COpaquePointer?) -> Unit>> {
    return staticCFunction { mem -> deconstructFromRawMem<godot.samples.games.dodge.Main>(mem) }
}
private fun udcBridge39(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.dodge.Main>("_ready", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj._ready()
            }
            else -> noMethodToInvoke("_ready", "godot.samples.games.dodge.Main", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge40(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.dodge.Main>("gameOver", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj.gameOver()
            }
            else -> noMethodToInvoke("gameOver", "godot.samples.games.dodge.Main", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge41(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.dodge.Main>("newGame", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj.newGame()
            }
            else -> noMethodToInvoke("newGame", "godot.samples.games.dodge.Main", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge42(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.dodge.Main>("_onStartTimerTimeout", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj._onStartTimerTimeout()
            }
            else -> noMethodToInvoke("_onStartTimerTimeout", "godot.samples.games.dodge.Main", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge43(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.dodge.Main>("_onScoreTimerTimeout", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj._onScoreTimerTimeout()
            }
            else -> noMethodToInvoke("_onScoreTimerTimeout", "godot.samples.games.dodge.Main", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge44(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.dodge.Main>("_onMobTimerTimeout", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj._onMobTimerTimeout()
            }
            else -> noMethodToInvoke("_onMobTimerTimeout", "godot.samples.games.dodge.Main", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge45(): CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>> {
    return staticCFunction { mem -> constructFromRawMem(mem, udcBinding8) }
}
private fun udcBridge46(): CPointer<CFunction<(COpaquePointer?) -> Unit>> {
    return staticCFunction { mem -> deconstructFromRawMem<godot.samples.games.dodge.HUD>(mem) }
}
private fun udcBridge47(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.dodge.HUD>("_ready", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj._ready()
            }
            else -> noMethodToInvoke("_ready", "godot.samples.games.dodge.HUD", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge48(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.dodge.HUD>("showMessage", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            1 -> {
                args!!
                val arg0 = Variant(args[0]!!).toString()
                obj.showMessage(arg0)
            }
            else -> noMethodToInvoke("showMessage", "godot.samples.games.dodge.HUD", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge49(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.dodge.HUD>("showMenu", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj.showMenu()
            }
            else -> noMethodToInvoke("showMenu", "godot.samples.games.dodge.HUD", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge50(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.dodge.HUD>("showGameOver", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj.showGameOver()
            }
            else -> noMethodToInvoke("showGameOver", "godot.samples.games.dodge.HUD", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge51(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.dodge.HUD>("updateScore", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            1 -> {
                args!!
                val arg0 = Variant(args[0]!!).toInt()
                obj.updateScore(arg0)
            }
            else -> noMethodToInvoke("updateScore", "godot.samples.games.dodge.HUD", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge52(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.dodge.HUD>("_onMessageTimerTimeout", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj._onMessageTimerTimeout()
            }
            else -> noMethodToInvoke("_onMessageTimerTimeout", "godot.samples.games.dodge.HUD", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge53(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.dodge.HUD>("_onGameOverTimerTimeout", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj._onGameOverTimerTimeout()
            }
            else -> noMethodToInvoke("_onGameOverTimerTimeout", "godot.samples.games.dodge.HUD", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge54(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.dodge.HUD>("_onStartButtonPressed", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj._onStartButtonPressed()
            }
            else -> noMethodToInvoke("_onStartButtonPressed", "godot.samples.games.dodge.HUD", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge55(): CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>> {
    return staticCFunction { mem -> constructFromRawMem(mem, udcBinding9) }
}
private fun udcBridge56(): CPointer<CFunction<(COpaquePointer?) -> Unit>> {
    return staticCFunction { mem -> deconstructFromRawMem<godot.samples.games.dodge.Mob>(mem) }
}
private fun udcBridge57(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.dodge.Mob>("_ready", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj._ready()
            }
            else -> noMethodToInvoke("_ready", "godot.samples.games.dodge.Mob", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge58(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.dodge.Mob>("_on_VisibilityNotifier2D_screen_exited", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj._on_VisibilityNotifier2D_screen_exited()
            }
            else -> noMethodToInvoke("_on_VisibilityNotifier2D_screen_exited", "godot.samples.games.dodge.Mob", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge59(): CPointer<CFunction<(COpaquePointer?,COpaquePointer?) -> Unit>> {
    return staticCFunction { o, r -> get<godot.samples.games.dodge.Mob>("minSpeed", "godot.samples.games.dodge.Mob", o, r) {
        obj -> Variant(obj.minSpeed)
    }}
}
private fun udcBridge60(): CPointer<CFunction<(COpaquePointer?,COpaquePointer?) -> Unit>> {
    return staticCFunction { o, v -> set<godot.samples.games.dodge.Mob>("minSpeed", "godot.samples.games.dodge.Mob", o, v) {
        obj, value -> obj.minSpeed = value.toInt()
    }}
}
private fun udcBridge61(): Variant {
    return Variant(150)
}
private fun udcBridge62(): CPointer<CFunction<(COpaquePointer?,COpaquePointer?) -> Unit>> {
    return staticCFunction { o, r -> get<godot.samples.games.dodge.Mob>("maxSpeed", "godot.samples.games.dodge.Mob", o, r) {
        obj -> Variant(obj.maxSpeed)
    }}
}
private fun udcBridge63(): CPointer<CFunction<(COpaquePointer?,COpaquePointer?) -> Unit>> {
    return staticCFunction { o, v -> set<godot.samples.games.dodge.Mob>("maxSpeed", "godot.samples.games.dodge.Mob", o, v) {
        obj, value -> obj.maxSpeed = value.toInt()
    }}
}
private fun udcBridge64(): Variant {
    return Variant(250)
}
private fun udcBridge65(): CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>> {
    return staticCFunction { mem -> constructFromRawMem(mem, udcBinding10) }
}
private fun udcBridge66(): CPointer<CFunction<(COpaquePointer?) -> Unit>> {
    return staticCFunction { mem -> deconstructFromRawMem<godot.samples.games.catchBall.Player>(mem) }
}
private fun udcBridge67(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.catchBall.Player>("_process", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            1 -> {
                args!!
                val arg0 = Variant(args[0]!!).toDouble()
                obj._process(arg0)
            }
            else -> noMethodToInvoke("_process", "godot.samples.games.catchBall.Player", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge68(): CPointer<CFunction<(COpaquePointer?,COpaquePointer?) -> Unit>> {
    return staticCFunction { o, r -> get<godot.samples.games.catchBall.Player>("speed", "godot.samples.games.catchBall.Player", o, r) {
        obj -> Variant(obj.speed)
    }}
}
private fun udcBridge69(): CPointer<CFunction<(COpaquePointer?,COpaquePointer?) -> Unit>> {
    return staticCFunction { o, v -> set<godot.samples.games.catchBall.Player>("speed", "godot.samples.games.catchBall.Player", o, v) {
        obj, value -> obj.speed = value.toDouble()
    }}
}
private fun udcBridge70(): Variant {
    return Variant(6)
}
private fun udcBridge71(): CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>> {
    return staticCFunction { mem -> constructFromRawMem(mem, udcBinding11) }
}
private fun udcBridge72(): CPointer<CFunction<(COpaquePointer?) -> Unit>> {
    return staticCFunction { mem -> deconstructFromRawMem<godot.samples.games.catchBall.Ball>(mem) }
}
private fun udcBridge73(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.catchBall.Ball>("_ready", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj._ready()
            }
            else -> noMethodToInvoke("_ready", "godot.samples.games.catchBall.Ball", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge74(): CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>> {
    return staticCFunction { mem -> constructFromRawMem(mem, udcBinding12) }
}
private fun udcBridge75(): CPointer<CFunction<(COpaquePointer?) -> Unit>> {
    return staticCFunction { mem -> deconstructFromRawMem<godot.samples.games.catchBall.BounceOff>(mem) }
}
private fun udcBridge76(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.catchBall.BounceOff>("_process", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            1 -> {
                args!!
                val arg0 = Variant(args[0]!!).toDouble()
                obj._process(arg0)
            }
            else -> noMethodToInvoke("_process", "godot.samples.games.catchBall.BounceOff", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge77(): CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>> {
    return staticCFunction { mem -> constructFromRawMem(mem, udcBinding13) }
}
private fun udcBridge78(): CPointer<CFunction<(COpaquePointer?) -> Unit>> {
    return staticCFunction { mem -> deconstructFromRawMem<godot.samples.games.catchBall.End>(mem) }
}
private fun udcBridge79(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.catchBall.End>("_process", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            1 -> {
                args!!
                val arg0 = Variant(args[0]!!).toDouble()
                obj._process(arg0)
            }
            else -> noMethodToInvoke("_process", "godot.samples.games.catchBall.End", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge80(): CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>> {
    return staticCFunction { mem -> constructFromRawMem(mem, udcBinding14) }
}
private fun udcBridge81(): CPointer<CFunction<(COpaquePointer?) -> Unit>> {
    return staticCFunction { mem -> deconstructFromRawMem<godot.samples.games.main.MainScreen>(mem) }
}
private fun udcBridge82(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.main.MainScreen>("_ready", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj._ready()
            }
            else -> noMethodToInvoke("_ready", "godot.samples.games.main.MainScreen", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge83(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.main.MainScreen>("_onChooseGameButtonPressed", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj._onChooseGameButtonPressed()
            }
            else -> noMethodToInvoke("_onChooseGameButtonPressed", "godot.samples.games.main.MainScreen", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge84(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.main.MainScreen>("_onQuitButtonPressed", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj._onQuitButtonPressed()
            }
            else -> noMethodToInvoke("_onQuitButtonPressed", "godot.samples.games.main.MainScreen", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge85(): CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>> {
    return staticCFunction { mem -> constructFromRawMem(mem, udcBinding15) }
}
private fun udcBridge86(): CPointer<CFunction<(COpaquePointer?) -> Unit>> {
    return staticCFunction { mem -> deconstructFromRawMem<godot.samples.games.main.ChooseGameScreen>(mem) }
}
private fun udcBridge87(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.main.ChooseGameScreen>("_ready", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj._ready()
            }
            else -> noMethodToInvoke("_ready", "godot.samples.games.main.ChooseGameScreen", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge88(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.main.ChooseGameScreen>("_onPlayDodgeButtonPressed", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj._onPlayDodgeButtonPressed()
            }
            else -> noMethodToInvoke("_onPlayDodgeButtonPressed", "godot.samples.games.main.ChooseGameScreen", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge89(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.main.ChooseGameScreen>("_onPlayShmupButtonPressed", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj._onPlayShmupButtonPressed()
            }
            else -> noMethodToInvoke("_onPlayShmupButtonPressed", "godot.samples.games.main.ChooseGameScreen", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge90(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.main.ChooseGameScreen>("_onBackButtonPressed", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj._onBackButtonPressed()
            }
            else -> noMethodToInvoke("_onBackButtonPressed", "godot.samples.games.main.ChooseGameScreen", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge91(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.main.ChooseGameScreen>("_onPlayCatchBallButtonPressed", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj._onPlayCatchBallButtonPressed()
            }
            else -> noMethodToInvoke("_onPlayCatchBallButtonPressed", "godot.samples.games.main.ChooseGameScreen", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge92(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.main.ChooseGameScreen>("_onPlayFastFinishButtonPressed", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj._onPlayFastFinishButtonPressed()
            }
            else -> noMethodToInvoke("_onPlayFastFinishButtonPressed", "godot.samples.games.main.ChooseGameScreen", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge93(): CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>> {
    return staticCFunction { mem -> constructFromRawMem(mem, udcBinding16) }
}
private fun udcBridge94(): CPointer<CFunction<(COpaquePointer?) -> Unit>> {
    return staticCFunction { mem -> deconstructFromRawMem<godot.samples.games.fastFinish.Player>(mem) }
}
private fun udcBridge95(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.fastFinish.Player>("_ready", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj._ready()
            }
            else -> noMethodToInvoke("_ready", "godot.samples.games.fastFinish.Player", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge96(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.fastFinish.Player>("_process", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            1 -> {
                args!!
                val arg0 = Variant(args[0]!!).toDouble()
                obj._process(arg0)
            }
            else -> noMethodToInvoke("_process", "godot.samples.games.fastFinish.Player", numArgs)
        }
        return@run null }}
    }
}
private fun udcBridge97(): CPointer<CFunction<(COpaquePointer?,COpaquePointer?) -> Unit>> {
    return staticCFunction { o, r -> get<godot.samples.games.fastFinish.Player>("speed", "godot.samples.games.fastFinish.Player", o, r) {
        obj -> Variant(obj.speed)
    }}
}
private fun udcBridge98(): CPointer<CFunction<(COpaquePointer?,COpaquePointer?) -> Unit>> {
    return staticCFunction { o, v -> set<godot.samples.games.fastFinish.Player>("speed", "godot.samples.games.fastFinish.Player", o, v) {
        obj, value -> obj.speed = value.toInt()
    }}
}
private fun udcBridge99(): Variant {
    return Variant(15)
}
private fun udcBridge100(): CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>> {
    return staticCFunction { mem -> constructFromRawMem(mem, udcBinding17) }
}
private fun udcBridge101(): CPointer<CFunction<(COpaquePointer?) -> Unit>> {
    return staticCFunction { mem -> deconstructFromRawMem<godot.samples.games.fastFinish.Stage>(mem) }
}
private fun udcBridge102(): CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>> {
    return staticCFunction { r, o, n, a -> invoke<godot.samples.games.fastFinish.Stage>("_ready", r, o, n, a) { obj, numArgs, args -> run {
        when (numArgs) {
            0 -> {
                obj._ready()
            }
            else -> noMethodToInvoke("_ready", "godot.samples.games.fastFinish.Stage", numArgs)
        }
        return@run null }}
    }
}
