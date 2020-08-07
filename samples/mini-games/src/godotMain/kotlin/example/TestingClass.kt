package example

import godot.Curve
import godot.Node
import godot.Texture
import godot.annotation.*
import godot.core.*
import godot.registration.RPCMode
import godot.registration.Range

const val FLAG_1 = 1
const val FLAG_2 = 2
internal const val FLAG_3 = 4

class OtherClass {
    companion object {
        val blubb = 2
        fun blubbablubb() = AnotherClass.blubb
    }
}

class AnotherClass {
    companion object {
        val blubb = 2
    }
}

@RegisterClass
class TestingClass : Node() {

    @RegisterSignal
    val signalSomeTestSignal by signal()

    @RegisterSignal
    val signal0 by signal()

    @RegisterSignal
    val signal1 by signal<Boolean>("param1")

    @RegisterSignal
    val signal2 by signal<Boolean, String>("param1", "param2")

    @RegisterFunction
    fun signal0Receiver() {

    }

    @RegisterFunction
    fun signal1Receiver(arg: Boolean) {

    }

    @RegisterFunction
    fun signal2Receiver(arg0: Boolean, arg1: String) {

    }

    @RegisterFunction(RPCMode.PUPPET_SYNC)
    fun foo() = 1

    @RegisterProperty
    var vector2Test = Vector2.UP

    @RegisterProperty
    var companionTest = OtherClass.blubb

    @RegisterProperty
    var companionTestAnother = OtherClass.blubbablubb()

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

//    @RegisterProperty
//    lateinit var resourceVisibleInEditor: Texture //should be registered as Texture as Custom resource derives from texture
//
//    @RegisterProperty(false)
//    var resourceNotVisibleInEditor: Resource =
//        Curve() //this should still be registered as Resource and not as Curve

    @RegisterProperty
    lateinit var curve: Curve

//    @RegisterProperty // <- when visible in editor...
//    var resourceVisibleInEditorButInitialized: Resource = Resource() // <- ...should fail!

    @RegisterProperty
    var pureVariantArray = VariantArray()

    @RegisterProperty
    var intVariantArray = intVariantArrayOf(1, 2)

    @RegisterProperty
    var realVariantArray = realVariantArrayOf(1.0, 2.0)

    @RegisterProperty
    var booleanVariantArray = booleanVariantArrayOf(true, false)

    @RegisterProperty
    var aabbVariantArray = AABBArray(listOf(AABB(Vector3(), Vector3())))

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
    var variantArrayDifferentTypes =
        variantArrayOf(variantArrayOf(1, "a")) //should not generate typed array hint string

    @RegisterProperty
    var variantArrayAnyDifferentTypes = variantArrayOf(1, 2, "a", "b") //should not generate typed array hint string

    @RegisterProperty
    var twoDimensionalArrayVariantArray = variantArrayOf(
        variantArrayOf(1, 2), variantArrayOf(3, 4)
    )

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
    var enumArray2 = EnumArray(
        listOf(TestEnum.ENUM1, TestEnum.ENUM2),
        { enumAsInt ->
            TestEnum.values().first { it.ordinal == enumAsInt }
        }) //not moved out of parenthesis on purpose! To test the behaviour this way as well!


    @RegisterProperty
    var enumArray3 = EnumArray(EnumArray(listOf(TestEnum.ENUM1, TestEnum.ENUM2)) { enumAsInt ->
        TestEnum.values().first { it.ordinal == enumAsInt }
    })

    @RegisterProperty
    var enumArray4 = EnumArray { enumAsInt ->
        TestEnum.values().first { it.ordinal == enumAsInt }
    }

    @RegisterProperty
    var enumArray5 = enumVariantArrayOf(
        { enumAsInt -> TestEnum.values().first { it.ordinal == enumAsInt } },
        TestEnum.ENUM1,
        TestEnum.ENUM2
    )

    @RegisterProperty
    @EnumFlag
    var enumFlag = setOf(TestEnum.ENUM2)


    companion object {
        val blubb = 16
    }

    @RegisterProperty
    @IntFlag("Flag1", "Flag2", "Flag3", "Flag4", "Flag5")
    var intFlag = FLAG_1 or FLAG_2 or FLAG_3 or 8 or blubb

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

    // TODO(ranie): un-comment once icall string parameter bug is fixed.
//    override fun _onInit() {
//        signal0.connect(this, this::signal0Receiver)
//        signal1.connect(this, this::signal1Receiver)
//        signal2.connect(this, this::signal2Receiver)
//    }

    @RegisterFunction
    override fun _ready() {
        GD.print("Property: ${this::rangeInt.name} -> $rangeInt")
        GD.print("Property: ${this::rangeFloat.name} -> $rangeFloat")
        GD.print("Property: ${this::rangeDouble.name} -> $rangeDouble")
        GD.print("Property: ${this::expEasingFloat.name} -> $expEasingFloat")
        GD.print("Property: ${this::expEasingDouble.name} -> $expEasingDouble")
        GD.print("Property: ${this::fileExt.name} -> $fileExt")
        GD.print("Property: ${this::fileExtGlobal.name} -> $fileExtGlobal")
        GD.print("Property: ${this::dirExt.name} -> $dirExt")
//        GD.print("Property: ${this::dirExtGlobal.name} -> $dirExtGlobal")
        GD.print("Property: ${this::enumTest.name} -> $enumTest")
        GD.print("Property: ${this::flag.name} -> $flag")

        GD.print("\nPrinting ${this::twoDimensionalArrayVariantArray.name} content:")
        twoDimensionalArrayVariantArray.forEach {
            GD.print("    Variant type: ${it.type}")
        }

        GD.print("\nPrinting ${this::intVariantArray.name} content:")
        intVariantArray.forEach {
            GD.print("    $it")
        }

        GD.print("\nPrinting which enum flags from ${this::enumFlag.name} are set:")
        enumFlag.forEach {
            GD.print("    $it is set")
        }
    }

    @RegisterFunction
    override fun _process(delta: Double) {
        GD.print("process delta: $delta")
    }

    @RegisterFunction
    fun testFunctionWithManyParams(
        p0: Float,
        p1: Int,
        p2: Boolean,
        p3: Vector3,
        p4: Plane,
        p5: Transform,
        p6: Curve,
        p7: Texture,
        p8: String,
        p9: VariantArray
    ) {
        GD.print("testFunctionWithManyParams called with:")
        GD.print("p0: $p0")
        GD.print("p1: $p1")
        GD.print("p2: $p2")
        GD.print("p3: $p3")
        GD.print("p4: $p4")
        GD.print("p5: $p5")
        GD.print("p6: $p6")
        GD.print("p7: $p7")
        GD.print("p8: $p8")
        GD.print("p9: $p9")
    }
}
