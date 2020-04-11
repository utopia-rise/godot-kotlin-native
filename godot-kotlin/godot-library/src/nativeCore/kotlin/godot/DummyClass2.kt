package godot

import godot.annotation.RegisterSignal
import godot.core.Object
import godot.core.signal

//TODO: remove! just here to be able to build this module. Remove once some actual source code is in this module
class DummyClass2 : Object() {
    @RegisterSignal
    val reversedChanged by signal<Boolean>("reverse")
}
