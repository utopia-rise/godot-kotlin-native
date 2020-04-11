package example

import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.core.Object


@RegisterClass(true)
class DummyClass : Object() {

    @RegisterFunction
    fun foo() = 1
}
