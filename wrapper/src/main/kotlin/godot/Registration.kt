@file:Suppress("UNCHECKED_CAST", "NestedLambdaShadowedImplicitParameter")
package kotlin.godot.registration

import godot.*
import kotlinx.cinterop.*
import platform.posix.memcpy
import kotlin.godot.*
import kotlin.godot.core.*
import kotlin.reflect.*


inline fun <reified T: GodotObject> constructFromRawMem(mem: COpaquePointer?, cons: KFunction0<T>, setRawMem: KFunction2<T,COpaquePointer,Unit>): COpaquePointer? {
    mem!!.let {
        val obj = rawConstructorInvoke(cons)
        memScoped {
            val pointer = alloc<COpaquePointerVar>()
            pointer.value = it
            setRawMem(obj, pointer.ptr)
        }
        return StableRef.create(obj).asCPointer()
    }
}
inline fun <reified T: GodotObject> deconstructFromRawMem(mem: COpaquePointer?) {
    mem!!.asStableRef<T>().dispose()
}
inline fun <reified T: GodotObject> invoke(ret: COpaquePointer?, objRaw: COpaquePointer?, numArgs: Int, args: COpaquePointer?, shedule: (T, Int, CPointer<COpaquePointerVar>?) -> Variant?) {
    val obj = objRaw!!.asStableRef<T>().get()
    val arguments = args?.reinterpret<COpaquePointerVar>()
    try {
        shedule(obj, numArgs, arguments)?.let {
            memScoped {
                val dest = ret!!.reinterpret<godot_variant>()
                memcpy(dest, it.getRawMemory(memScope), sizeOf<godot_variant>())
            }
        }
    }
    catch (e: Throwable) {
        Godot.printError(e.message.toString(), "KotlinWrapper", obj.toString(), 0)
        e.printStackTrace()
    }
}
fun noMethodToInvoke(name: String, className: String, numArgs: Int) {
    Godot.printError("No such method \"$name\" in $className with $numArgs arguments!", name, "", 0) // TODO: ???
}


fun <T: GodotObject> rawConstructorInvoke(cons: KFunction0<T>): T {
    ___godot_wrapper_nativeConstructorInvocation = false
    val obj = cons()
    ___godot_wrapper_nativeConstructorInvocation = true

    return obj
}