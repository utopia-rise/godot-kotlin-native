package godot.registration

import godot.gdnative.godot_variant
import kotlinx.cinterop.*
import platform.posix.EXIT_FAILURE
import platform.posix.memcpy
import godot.core.GD
import godot.core.Variant
import kotlin.reflect.KFunction0
import kotlin.system.exitProcess


@ThreadLocal internal var nativeConstructorInvocationFlag: Boolean = true
@ThreadLocal internal var nonNativeConstructorRawMemory: COpaquePointer? = null


fun <T: godot.GodotObject> constructFromRawMem(mem: COpaquePointer?, cons: KFunction0<T>): COpaquePointer? {
    if (mem == null) {
        GD.printError("Invoked object constructor with null as argument", "kotlin constructor", "Entry.kt", 0)
        exitProcess(EXIT_FAILURE)
    }
    try {
        nativeConstructorInvocationFlag = false
        nonNativeConstructorRawMemory = mem
        val obj = cons()
        return StableRef.create(obj).asCPointer()
    } catch (e: Throwable) {
        GD.printError(e.message.toString(), "kotlin constructor", "Entry.kt", 0)
        e.printStackTrace()
        exitProcess(EXIT_FAILURE)
    }
}


inline fun <reified T: godot.GodotObject> deconstructFromRawMem(mem: COpaquePointer?) {
    if (mem == null) {
        GD.printError("Invoked object destructor with null as argument", "kotlin destructor", "Entry.kt", 0)
        exitProcess(EXIT_FAILURE)
    }
    mem.asStableRef<T>().dispose()
}




inline fun <reified T: godot.GodotObject> invoke(name: String, ret: COpaquePointer?, objRaw: COpaquePointer?, numArgs: Int, args: COpaquePointer?, shedule: (T, Int, CPointer<COpaquePointerVar>?) -> Variant?) {
    if (objRaw == null) {
        GD.printError("Invoked method $name for null object", "$name invocation", "Entry.kt", 0)
        exitProcess(EXIT_FAILURE)
    }
    val obj = objRaw.asStableRef<T>().get()
    val arguments = args?.reinterpret<COpaquePointerVar>()
    try {
        shedule(obj, numArgs, arguments)?.let {
            memScoped {
                val dest = ret!!.reinterpret<godot_variant>() // assert 'cause ret is always not null
                memcpy(dest, it.getRawMemory(memScope), sizeOf<godot_variant>().toULong())
            }
        }
    }
    catch (e: Throwable) {
        GD.printError(e.message.toString(), name, obj.toString(), 0)
        e.printStackTrace()
        exitProcess(EXIT_FAILURE)
    }
}
fun noMethodToInvoke(name: String, className: String, numArgs: Int) {
    GD.printError("No such method \"$name\" in $className with $numArgs arguments!", name, "", 0) // TODO: ???
    exitProcess(EXIT_FAILURE)
}




inline fun <reified T: godot.GodotObject> set(name: String, cl: String, objRaw: COpaquePointer?, v: COpaquePointer?, shedule: (T, Variant) -> Unit) {
    if (objRaw == null) {
        GD.printError("Invoked $name setter for null of $cl", "$name setter", "Entry.kt", 0)
        exitProcess(EXIT_FAILURE)
    }
    if (v == null) {
        GD.printWarning("Invoked setter for $name in $cl with null as param", "$name setter", "Entry.kt", 0)
        return
    }
    val obj = objRaw.asStableRef<T>().get()
    val value = Variant(v)
    try {
        shedule(obj, value)
    }
    catch (e: Throwable) {
        GD.printError(e.message.toString(), "$name setter", obj.toString(), 0)
        e.printStackTrace()
        exitProcess(EXIT_FAILURE)
    }
}


inline fun <reified T: godot.GodotObject> get(name: String, cl: String, objRaw: COpaquePointer?, ret: COpaquePointer?, shedule: (T) -> Variant?) {
    if (objRaw == null) {
        GD.printError("Invoked $name getter for null of $cl", "$name getter", "Entry.kt", 0)
        exitProcess(EXIT_FAILURE)
    }
    val obj = objRaw.asStableRef<T>().get()
    try {
        shedule(obj)?.let {
            memScoped {
                val dest = ret!!.reinterpret<godot_variant>() // assert 'cause ret is always not null
                memcpy(dest, it.getRawMemory(memScope), sizeOf<godot_variant>().toULong())
            }
        }
    }
    catch (e: Throwable) {
        GD.printError(e.message.toString(), "$name getter", obj.toString(), 0)
        e.printStackTrace()
        exitProcess(EXIT_FAILURE)
    }
}