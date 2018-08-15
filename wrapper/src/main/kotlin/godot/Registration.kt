@file:Suppress("UNCHECKED_CAST", "NestedLambdaShadowedImplicitParameter")
package kotlin.godot.registration

import godot.*
import kotlinx.cinterop.*
import platform.posix.memcpy
import kotlin.godot.*
import kotlin.godot.core.*
import kotlin.reflect.*



private val ObjectPoolAdd = ObjectPool::add
private val ObjectPoolRemove = ObjectPool::remove
private val ObjectPoolGet = ObjectPool::get


fun <T: GodotObject> constructFromRawMem(mem: COpaquePointer?, cons: KFunction0<T>, setRawMem: KFunction2<T,COpaquePointer,Unit>) {
    mem?.let {
        ___godot_wrapper_nativeConstructorInvocation = false
        val obj = cons()
        ___godot_wrapper_nativeConstructorInvocation = true
        setRawMem(obj, it)
        ObjectPoolAdd(globalObjectPool, it.toLong(), obj)
    }
}
fun deconstructFromRawMem(mem: COpaquePointer?) {
    mem?.let {
        ObjectPoolRemove(globalObjectPool, mem.toLong())
    }
}
fun <T: GodotObject> prepareInvocation(ret: COpaquePointer?, objRaw: COpaquePointer?, numArgs: Int, args: COpaquePointer?, shedule: (T,Int,CPointer<COpaquePointerVar>?) -> Variant?) {
    objRaw?.let {
        val obj = ObjectPoolGet(globalObjectPool, it.toLong()) as? T
        if (obj != null) {
            val arguments = args?.reinterpret<COpaquePointerVar>()
            shedule(obj, numArgs, arguments)?.let {
                val dest = ret!!.reinterpret<godot_variant>()
                memcpy(dest, it.nativeValue, sizeOf<godot_variant>())
            }
        }
    }
}
fun noMethodToInvoke(name: String, className: String, numArgs: Int) {
    Godot.printError("No such method \"$name\" in $className with $numArgs arguments!", name, "", 0) // TODO: ???
}