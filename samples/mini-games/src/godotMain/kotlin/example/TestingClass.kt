package example

import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterSignal
import godot.core.Object
import godot.core.signal
import godot.registration.RPCMode


@RegisterClass(true)
class TestingClass : Object() {

    @RegisterSignal
    val signal0 by signal()

    @RegisterSignal
    val signal1 by signal<Boolean>("param1")

    @RegisterSignal
    val signal2 by signal<Boolean, String>("param1", "param2")

    @RegisterFunction(RPCMode.PUPPET_SYNC)
    fun foo() = 1
}
