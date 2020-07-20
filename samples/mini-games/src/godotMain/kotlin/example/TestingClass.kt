package example

import godot.Curve
import godot.Object
import godot.Resource
import godot.Texture
import godot.annotation.*
import godot.core.*
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
    lateinit var resourceVisibleInEditor: Texture //should be registered as Texture as Custom resource derives from texture

    @RegisterProperty(false)
    var resourceNotVisibleInEditor: Resource =
        Curve() //this should still be registered as Resource and not as Curve

//    @RegisterProperty // <- when visible in editor...
//    var resourceVisibleInEditorButInitialized: Resource = Resource() // <- ...should fail!

    @RegisterProperty
    var pureVariantArray = VariantArray()

    @RegisterProperty
    var intVariantArray = intVariantArrayOf(1, 2)

    @RegisterProperty
    var realVariantArray = realVariantArrayOf(1f, 2f)

    @RegisterProperty
    var booleanVariantArray = booleanVariantArrayOf(true, false)

    @RegisterProperty
    var aabbVariantArray = AABBArray(listOf(AABB(Vector3(), Vector3())))

    @RegisterProperty
    var aabbVariantArrayOfOther = AABBArray(AABBArray(listOf(AABB(Vector3(), Vector3()))))

    @RegisterProperty
    var basisVariantArray = BasisArray(listOf(Basis()))

    @RegisterProperty
    var colorVariantArray = ColorArray(listOf(Color(0, 0, 0)))

    @RegisterProperty
    var nodePathVariantArray = NodePathArray(listOf(NodePath("some/Node/Path")))

    @RegisterProperty
    var planeVariantArray = PlaneArray(listOf(Plane()))

    @RegisterProperty
    var quatVariantArray = QuatArray(listOf(Quat()))

    @RegisterProperty
    var rect2VariantArray = Rect2Array(listOf(Rect2()))

    @RegisterProperty
    var ridVariantArray = RIDArray(listOf(RID()))

    @RegisterProperty
    var transform2DVariantArray = Transform2DArray(listOf(Transform2D()))

    @RegisterProperty
    var transformVariantArray = TransformArray(listOf(Transform()))

    @RegisterProperty
    var vector2VariantArray = Vector2Array(listOf(Vector2()))

    @RegisterProperty
    var vector3VariantArray = Vector3Array(listOf(Vector3()))


    @RegisterProperty
    var variantArrayDifferentTypes = variantArrayOf(variantArrayOf(1, "a")) //should not generate typed array hint string

    @RegisterProperty
    var variantArrayAnyDifferentTypes = variantArrayOf(1, 2, "a", "b") //should not generate typed array hint string

    @RegisterProperty
    var twoDimensionalArrayVariantArray = variantArrayOf(variantArrayOf(1, 2), variantArrayOf(3, 4)) //can not generate typed array hint string

    @RegisterProperty
    var threeDimensionalArrayVariantArray = variantArrayOf( //can not generate typed array hint string
        variantArrayOf(variantArrayOf(1, 2), variantArrayOf(3, 4)),
        variantArrayOf(variantArrayOf(5, 6), variantArrayOf(7, 8))
    )

    @RegisterProperty
    var enumArray = EnumArray(listOf(TestEnum.ENUM1, TestEnum.ENUM2)) { enumAsInt ->
        TestEnum.values().first { it.ordinal == enumAsInt }
    }

    @RegisterProperty
    var enumArray2 = EnumArray(listOf(TestEnum.ENUM1, TestEnum.ENUM2), { enumAsInt -> TestEnum.values().first { it.ordinal == enumAsInt }}) //not moved out of parenthesis on purpose! To test the behaviour this way as well!


    @RegisterProperty
    var enumArray3 = EnumArray(EnumArray(listOf(TestEnum.ENUM1, TestEnum.ENUM2)) { enumAsInt ->
        TestEnum.values().first { it.ordinal == enumAsInt }
    })

    @RegisterProperty
    var enumArray4 = EnumArray { enumAsInt ->
        TestEnum.values().first { it.ordinal == enumAsInt }
    }

    @RegisterProperty
    var enumArray5 = enumVariantArrayOf({ enumAsInt -> TestEnum.values().first { it.ordinal == enumAsInt }}, TestEnum.ENUM1, TestEnum.ENUM2)

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
