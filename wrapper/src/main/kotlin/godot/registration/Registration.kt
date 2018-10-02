package godot.registration

import godot.core.Variant
import godot.core.toGDString
import godot.gdnative.*
import kotlinx.cinterop.*
import platform.posix.memcpy
import platform.posix.memset


fun registerClass(cl: String, base: String,
                  cons: CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>>,
                  dest: CPointer<CFunction<(COpaquePointer?) -> Unit>>)
{
    godot_wrapper_register_class(cl, base, cons, dest)
}


fun registerMethod(cl: String, m: String,
                   impl: CPointer<CFunction<(COpaquePointer?,COpaquePointer?,Int,COpaquePointer?) -> Unit>>,
                   rpc: godot_method_rpc_mode = godot_method_rpc_mode.GODOT_METHOD_RPC_MODE_DISABLED)
{
    godot_wrapper_register_method(cl, m, impl, rpc)
}


fun registerProperty(cl: String,
                      n: String,
                      e: Boolean,
                      g: CPointer<CFunction<(COpaquePointer?,COpaquePointer?) -> Unit>>,
                      s: CPointer<CFunction<(COpaquePointer?,COpaquePointer?) -> Unit>>,
                      dv: Variant,
                      r: godot_method_rpc_mode = godot_method_rpc_mode.GODOT_METHOD_RPC_MODE_DISABLED,
                      uu: godot_property_usage_flags = GODOT_PROPERTY_USAGE_NOEDITOR,
                      hh: godot_property_hint = godot_property_hint.GODOT_PROPERTY_HINT_NONE,
                      hss: String = "")
{
    var u = uu or GODOT_PROPERTY_USAGE_SCRIPT_VARIABLE
    var h = hh
    var hs = hss

    if (e) {
        u = u or GODOT_PROPERTY_USAGE_EDITOR

        if (dv.getType() == Variant.Type.OBJECT) {
            val res = Variant("Resource")
            val result = dv.call("is_class", arrayOf(res))
            if (result.toBoolean()) {
                h = godot_property_hint.byValue(hh.value or godot_property_hint.GODOT_PROPERTY_HINT_RESOURCE_TYPE.value)
                hs = dv.call("get_class", arrayOf()).toString()
            }
            res.dispose()
            result.dispose()
        }
    }
    godot_wrapper_register_property(cl, n, g, s, dv.nativeValue, dv.getType().id.toInt(), r, u, h, hs.toGDString())
}



fun registerSignal(cl: String,
                     n: String,
                     a: Array<Pair<String, Variant.Type>> = arrayOf(),
                     da: Array<Variant> = arrayOf())
{
    memScoped {
        val args = allocArray<godot_signal_argument>(a.size)
        memset(args, 0, sizeOf<godot_signal_argument>().toULong() * a.size.toULong())
        val defaultArgs = allocArray<godot_variant>(da.size)

        for ((i,arg) in a.withIndex()) {
            memcpy(args[i].name.ptr, arg.first.toGDString().getPointer(memScope), sizeOf<godot_string>().toULong())
            args[i].type = arg.second.id.toInt()
        }
        for ((i,arg) in da.withIndex())
            memcpy(defaultArgs[i].ptr, arg.nativeValue.getPointer(memScope), sizeOf<godot_variant>().toULong())

        godot_wrapper_register_signal(cl, n.toGDString(), a.size, args, da.size, defaultArgs)
    }
}