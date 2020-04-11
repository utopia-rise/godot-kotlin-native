package example

import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.core.Object
import godot.registration.RPCMode


@RegisterClass(true)
class DummyClass : Object() {

    @RegisterFunction(RPCMode.PUPPET_SYNC)
    fun foo() = 1
}
