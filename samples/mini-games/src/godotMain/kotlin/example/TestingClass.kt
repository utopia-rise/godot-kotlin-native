package example

import godot.Resource
import godot.annotation.*
import godot.core.Object
import godot.core.Variant
import godot.core.signal
import godot.registration.RPCMode
import godot.registration.Range

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

    @IntRange(0, 20, 2, Range.OR_GREATER)
    @RegisterProperty
    var rangeInt = 1

    @FloatRange(0f, 20f, 2f, Range.OR_GREATER)
    @RegisterProperty
    var rangeFloat = 1f

    @DoubleRange(0.0, 20.0, 2.0, Range.OR_GREATER)
    @RegisterProperty
    var rangeDouble = 1.0

    @ExpEasing(true, true)
    @RegisterProperty
    var expEasingFloat = 2f

    @ExpEasing
    @RegisterProperty
    var expEasingDouble = 2.0

    @File("*.txt", "*.kt")
    @RegisterProperty
    var fileExt = "*.dummy"

    @File("*.txt", "*.kt", global = true)
    @RegisterProperty
    var fileExtGlobal = "*.dummy"

    @Dir
    @RegisterProperty
    var dirExt = "*.dummy"

    @Dir(true)
    @RegisterProperty
    lateinit var dirExtGlobal: String

    @RegisterProperty
    var enumTest: TestEnum = TestEnum.ENUM1

    @RegisterProperty
    var flag: Boolean = false

    @RegisterProperty
    var variantTest = Variant("test")

    @RegisterProperty
    lateinit var resourceVisibleInEditor: Resource

    @RegisterProperty(false)
    var resourceNotVisibleInEditor: Resource = Resource()

//    @RegisterProperty // <- when visible in editor...
//    var resourceVisibleInEditorButInitialized: Resource = Resource() // <- ...should fail!
}
