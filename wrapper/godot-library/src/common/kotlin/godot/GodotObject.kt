package godot

import godot.core.Variant
import kotlin.reflect.KFunction1


expect abstract class GodotObject {
    var __yieldSignalFunction: KFunction1<Array<out Variant>, Unit>?
    fun __yieldSignalListener(vararg args: Variant)
}
