package example

import godot.Resource
import godot.annotation.*
import godot.core.Object
import godot.core.Variant
import godot.core.signal
import godot.core.variantArrayOf
import godot.registration.RPCMode
import godot.registration.Range

const val FLAG_1 = 0
const val FLAG_2 = 1
internal const val FLAG_3 = 1

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

//    @RegisterProperty
//    val flagImmutable: Boolean = false // <- this should fail as it's immutable

    @RegisterProperty
    var variantTest = Variant("test")

    @RegisterProperty
    lateinit var resourceVisibleInEditor: Resource

    @RegisterProperty(false)
    var resourceNotVisibleInEditor: Resource = Resource()

//    @RegisterProperty // <- when visible in editor...
//    var resourceVisibleInEditorButInitialized: Resource = Resource() // <- ...should fail!

    @RegisterProperty
    var variantArray = variantArrayOf(variantArrayOf(1, 2))

    @RegisterProperty
    var variantArrayDifferentTypes = variantArrayOf(variantArrayOf(1, "a")) //should not generate hint string

    @RegisterProperty
    var variantArrayAny = variantArrayOf(1, 2)

    @RegisterProperty
    var variantArrayAnyDifferentTypes = variantArrayOf(1, 2, "a", "b") //should not generate hint string

    @RegisterProperty
    var variantArrayVariant = variantArrayOf(1, 2)

    @RegisterProperty
    var twoDimensionalArrayVariantArray = variantArrayOf(variantArrayOf(1, 2), variantArrayOf(3, 4))

    @RegisterProperty
    var threeDimensionalArrayVariantArray = variantArrayOf(
        variantArrayOf(variantArrayOf(1, 2), variantArrayOf(3, 4)),
        variantArrayOf(variantArrayOf(5, 6), variantArrayOf(7, 8))
    )

    @RegisterProperty
    var enumArray = variantArrayOf(TestEnum.ENUM1, TestEnum.ENUM2)

    @RegisterProperty
    @EnumFlag
    var enumFlag = setOf(TestEnum.ENUM1)


    companion object {
        val blubb = 0
    }

    @RegisterProperty
    @IntFlag("Flag1", "Flag2", "Flag3", "Flag4", "Flag5")
    var intFlag = FLAG_1 or FLAG_2 or FLAG_3 or 0 or blubb

    @RegisterProperty
    @MultilineText
    var multiLineText = """
        asdfökjasfdölkjasdflkjaf
        asdöflkjnasölfkdj
        asädfkjasödlfkjn
        asdäfpkjasödflkjm
    """.trimIndent()

    @RegisterProperty
    @PlaceHolderText
    var placeholderText = "somePlaceHolderText"
}
