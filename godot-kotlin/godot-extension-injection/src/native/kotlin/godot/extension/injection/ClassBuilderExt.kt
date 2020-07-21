package godot.extension.injection

import godot.Object
import godot.core.ClassBuilder
import godot.core.NodePath
import godot.core.Variant
import godot.gdnative.godot_property_hint
import godot.registration.RPCMode
import kotlinx.cinterop.StableRef
import kotlin.reflect.KMutableProperty0

fun <T: Object> ClassBuilder<T>.injectionHelper(
    nodePathName: String,
    propertyHelper: KMutableProperty0<NodePath>,
    nodePath: String? = null
) {
    val injectionHelper = InjectionHelperPropertyHandler(propertyHelper)
    classHandle.registerProperty(
        nodePathName,
        StableRef.create(injectionHelper).asCPointer(),
        Variant.Type.NODE_PATH,
        nodePath?.let { Variant(NodePath(it)) },
        true,
        RPCMode.DISABLED,
        godot_property_hint.GODOT_PROPERTY_HINT_NONE,
        "NodePath"
    )
}
