@file:Suppress("UNCHECKED_CAST", "NestedLambdaShadowedImplicitParameter")
package kotlin.godot.registration

import godot.*
import kotlinx.cinterop.*
import platform.posix.EXIT_FAILURE
import platform.posix.memcpy
import kotlin.godot.*
import kotlin.godot.core.*
import kotlin.reflect.*
import kotlin.system.exitProcess



inline fun <reified T: GodotObject> constructFromRawMem(mem: COpaquePointer?, cons: KFunction0<T>, setRawMem: KFunction2<T,COpaquePointer,Unit>): COpaquePointer? {
    if (mem == null) {
        Godot.printError("Invoked object constructor with null as argument", "kotlin constructor", "Registration.kt", 0)
        exitProcess(EXIT_FAILURE)
    }
    try {
        val obj = cons()
        destroyGodotObject(obj)
        setRawMem(obj, mem)
        return StableRef.create(obj).asCPointer()
    } catch (e: Throwable) {
        Godot.printError(e.message.toString(), "kotlin constructor", "Registration.kt", 0)
        e.printStackTrace()
        exitProcess(EXIT_FAILURE)
    }
}
inline fun <reified T: GodotObject> deconstructFromRawMem(mem: COpaquePointer?) {
    if (mem == null) {
        Godot.printError("Invoked object destructor with null as argument", "kotlin destructor", "Registration.kt", 0)
        exitProcess(EXIT_FAILURE)
    }
    mem.asStableRef<T>().dispose()
}
inline fun <reified T: GodotObject> invoke(name: String, ret: COpaquePointer?, objRaw: COpaquePointer?, numArgs: Int, args: COpaquePointer?, shedule: (T, Int, CPointer<COpaquePointerVar>?) -> Variant?) {
    if (objRaw == null) {
        Godot.printError("Invoked method $name for null object", "$name invocation", "Registration.kt", 0)
        exitProcess(EXIT_FAILURE)
    }
    val obj = objRaw.asStableRef<T>().get()
    val arguments = args?.reinterpret<COpaquePointerVar>()
    try {
        shedule(obj, numArgs, arguments)?.let {
            memScoped {
                val dest = ret!!.reinterpret<godot_variant>() // assert 'cause ret is always not null
                memcpy(dest, it.getRawMemory(memScope), sizeOf<godot_variant>())
            }
        }
    }
    catch (e: Throwable) {
        Godot.printError(e.message.toString(), name, obj.toString(), 0)
        e.printStackTrace()
        exitProcess(EXIT_FAILURE)
    }
}
fun noMethodToInvoke(name: String, className: String, numArgs: Int) {
    Godot.printError("No such method \"$name\" in $className with $numArgs arguments!", name, "", 0) // TODO: ???
    exitProcess(EXIT_FAILURE)
}


fun destroyGodotObject(obj: GodotObject) {
    memScoped {
        godot_object_destroy(obj.getRawMemory(memScope))
    }
}


internal fun getMB(cl: String, m: String): CPointer<godot_method_bind> {
    return godot_method_bind_get_method(cl, m) ?: throw NotImplementedError("Cannot get method bind for $m in $cl")
}
internal fun getSingleton(cl: String, clOld: String): COpaquePointer {
    return godot_global_get_singleton(cl.cstr) ?: throw NullPointerException("Cannot get singleton instance for class $clOld")
}
internal fun <T: GodotObject> fromVariant(obj: T, other: Variant): T {
    obj.setRawMemory(godot_variant_as_object(other.nativeValue)
            ?: throw NullPointerException("godot_variant_as_object return null for $other"))
    return obj
}