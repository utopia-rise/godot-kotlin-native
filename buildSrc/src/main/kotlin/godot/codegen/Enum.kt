package godot.codegen

import com.beust.klaxon.Json
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.TypeSpec


class Enum(
        @Json(name = "name")
        var name: String,
        @Json(name = "values")
        var values: Map<String, Int>) {

    val generated by lazy {
        val enumBuilder = TypeSpec.enumBuilder(name.escapeUnderscore())
        enumBuilder.primaryConstructor(
                FunSpec.constructorBuilder()
                        .addParameter("id", Long::class)
                        .addStatement("this.%N = %N", "id", "id")
                        .build()
        )
        enumBuilder.addProperty("id", Long::class)
        values.forEach { (key, value) ->
            enumBuilder.addEnumConstant(
                     key, TypeSpec.anonymousClassBuilder()
                    .addSuperclassConstructorParameter("%L", value)
                    .build()
            )
        }
        val companion = TypeSpec.companionObjectBuilder()
                .addFunction(FunSpec.builder("fromInt")
                        .addParameter("value", Long::class)
                        .addStatement("return values().single { it.%N == %N }", "id", "value")
                        .build())
                .build()
        enumBuilder.addType(companion)
        enumBuilder.build()
    }
}