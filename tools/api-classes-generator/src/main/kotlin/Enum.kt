import com.beust.klaxon.Json
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.TypeSpec


class Enum(
        @Json(name = "name")
        var name: String,
        @Json(name = "values")
        var values: Map<String, Int>) {

    fun generated(target: GeneratorTarget): TypeSpec {
        val enumBuilder = TypeSpec.enumBuilder(name.escapeUnderscore())

        if (target.implementation) {
            enumBuilder.primaryConstructor(
                    FunSpec.constructorBuilder()
                            .addParameter("id", Long::class)
                            .addStatement("this.%N = %N", "id", "id")
                            .build()
            )
        }
        val propertyModifiers = if (target.implementation) {
            arrayOf(KModifier.ACTUAL)
        } else {
            emptyArray()
        }
        enumBuilder.addProperty("id", Long::class, *propertyModifiers)
        values.forEach { (key, value) ->
            enumBuilder.addEnumConstant(
                     key, TypeSpec.anonymousClassBuilder()
                    .applyToImplementation(target) { addSuperclassConstructorParameter("%L", value) }
                    .build()
            )
        }
        val companion = TypeSpec.companionObjectBuilder()
                // Due to issue https://github.com/square/kotlinpoet/issues/878 in kotlinpoet (fixed but not released
                // at time of this comment), this method would generate with a body in the `expect` implementation,
                // so excluding it from the interface temporarily. When #878 is released, this can be included in
                // the common expect interface, and marked `actual` in the implementation
                .applyToImplementation(target) {
                    addFunction(FunSpec.builder("fromInt")
                        .addParameter("value", Long::class)
                        .returns(ClassName("", name))
                        .applyToImplementation(target) { addStatement("return values().single { it.%N == %N }", "id", "value") }
                            // .actualIfImplementation(target)
                        .build())
                }
                .actualIfImplementation(target)
                .build()
        enumBuilder.addType(companion)

        return enumBuilder
                .actualIfImplementation(target)
                .build()
    }
}
