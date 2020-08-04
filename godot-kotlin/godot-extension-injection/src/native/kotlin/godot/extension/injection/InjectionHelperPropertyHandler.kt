package godot.extension.injection

import godot.core.NodePath
import godot.core.Variant
import kotlin.reflect.KMutableProperty0

class InjectionHelperPropertyHandler(private val nodePath: KMutableProperty0<NodePath>) {
    fun get(): Variant {
        return Variant.wrap(
            nodePath.get()
        )
    }

    fun set(value: Variant) {
        nodePath.set(value.unwrap())
    }
}
