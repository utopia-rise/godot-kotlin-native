package godot.registration

import godot.core.Variant
import godot.core.toGDString
import godot.gdnative.*
import kotlinx.cinterop.*
import platform.posix.memcpy
import platform.posix.memset


fun registerClass(className: String,
                  baseClass: String,
                  constructor: CPointer<CFunction<(COpaquePointer?) -> COpaquePointer?>>,
                  destructor: CPointer<CFunction<(COpaquePointer?) -> Unit>>)
{
    godot_wrapper_register_class(className, baseClass, constructor, destructor)
}


fun registerMethod(className: String,
                   methodName: String,
                   implementation: CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int, COpaquePointer?) -> Unit>>,
                   rpcMode: RPCMode = RPCMode.Disabled)
{
    godot_wrapper_register_method(className, methodName, implementation, rpcMode.value)
}


fun registerProperty(className: String,
                     propertyName: String,
                     visibleInEditor: Boolean,
                     getter: CPointer<CFunction<(COpaquePointer?, COpaquePointer?) -> Unit>>,
                     setter: CPointer<CFunction<(COpaquePointer?, COpaquePointer?) -> Unit>>,
                     defaultValue: Variant,
                     rpcMode: RPCMode = RPCMode.Disabled,
                     usageFlags: PropertyUsage = PropertyUsage.NoEditor,
                     propertyHint: PropertyHint = PropertyHint.None,
                     hintString: String = "")
{
    var flags = usageFlags or PropertyUsage.ScriptVariable
    var hint = propertyHint
    var hintStr = hintString

    if (visibleInEditor) {
        flags = flags or PropertyUsage.Editor

        if (defaultValue.getType() == Variant.Type.OBJECT) {
            if (propertyHint == PropertyHint.None) {
                val res = Variant("Resource")
                val result = defaultValue.call("is_class", arrayOf(res))
                if (result.toBoolean()) {
                    hint = PropertyHint.ResourceType
                }
                res.dispose()
                result.dispose()
            }
            if (hintString.isEmpty()) {
                val result = defaultValue.call("get_class")
                hintStr = result.toString()
                result.dispose()
            }
        }
    }

    godot_wrapper_register_property(
            className,
            propertyName,
            getter,
            setter,
            defaultValue.nativeValue,
            defaultValue.getType().id.toInt(),
            rpcMode.value,
            flags.value,
            hint.value,
            hintStr.toGDString()
    )
}



fun registerSignal(className: String,
                   name: String,
                   arguments: Array<Pair<String, Variant.Type>> = arrayOf(),
                   defaultArguments: Array<Variant> = arrayOf())
{
    memScoped {
        val args = allocArray<godot_signal_argument>(arguments.size)
        memset(args, 0, sizeOf<godot_signal_argument>().toULong() * arguments.size.toULong())
        val defaultArgs = allocArray<godot_variant>(defaultArguments.size)

        for ((i,arg) in arguments.withIndex()) {
            memcpy(args[i].name.ptr, arg.first.toGDString().getPointer(memScope), sizeOf<godot_string>().toULong())
            args[i].type = arg.second.id.toInt()
        }
        for ((i,arg) in defaultArguments.withIndex())
            memcpy(defaultArgs[i].ptr, arg.nativeValue.getPointer(memScope), sizeOf<godot_variant>().toULong())

        godot_wrapper_register_signal(className, name.toGDString(), arguments.size, args, defaultArguments.size, defaultArgs)
    }
}