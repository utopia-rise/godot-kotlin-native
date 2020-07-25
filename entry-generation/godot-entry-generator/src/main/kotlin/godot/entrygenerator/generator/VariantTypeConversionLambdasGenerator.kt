package godot.entrygenerator.generator

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy

object VariantTypeConversionLambdasGenerator {
    private val variantTypesToPackagePaths = mapOf(
        "Boolean" to "kotlin",
        "Int" to "kotlin",
        "Float" to "kotlin",
        "String" to "kotlin",
        "Vector2" to "godot.core",
        "Rect2" to "godot.core",
        "Vector3" to "godot.core",
        "Transform2D" to "godot.core",
        "Plane" to "godot.core",
        "Quat" to "godot.core",
        "AABB" to "godot.core",
        "Basis" to "godot.core",
        "Transform" to "godot.core",
        "Color" to "godot.core",
        "NodePath" to "godot.core",
        "RID" to "godot.core",
        "Object" to "godot",
        "Dictionary" to "godot.core",
        "VariantArray" to "godot.core",
        "PoolByteArray" to "godot.core",
        "PoolIntArray" to "godot.core",
        "PoolRealArray" to "godot.core",
        "PoolStringArray" to "godot.core",
        "PoolVector2Array" to "godot.core",
        "PoolVector3Array" to "godot.core",
        "PoolColorArray" to "godot.core"
    )

    private fun generateTypeConversionFunction(typeAsString: String): FunSpec {
        return FunSpec
            .builder("as${typeAsString}TypeConverter")
            .addModifiers(KModifier.PRIVATE)
            .addParameter("variantToConvert", ClassName("godot.core", "Variant"))
            .addStatement("return variantToConvert.as${typeAsString}()")
            .build()
    }

    fun generateTypeConversionLambdasCache(entryFileSpec: FileSpec.Builder) {
        entryFileSpec.addProperty(
            PropertySpec
                .builder("typeConversionLambdas", getLambdasCacheType())
                .addModifiers(KModifier.PRIVATE)
                .initializer(getLambdasCacheInitializer())
                .build()
        )
    }

    private fun getLambdasCacheInitializer(): CodeBlock {
        val builder = CodeBlock.builder()
        builder.add("mapOf(\n")
        variantTypesToPackagePaths.keys.forEach { variantTypeAsString ->
            builder.add("%S to %L", variantTypeAsString.toLowerCase(), MemberName("", "as${variantTypeAsString}TypeConverter").reference())
            if (variantTypeAsString != variantTypesToPackagePaths.keys.last()) {
                builder.add(",\n")
            }
        }
        builder.add("\n)")
        return builder.build()
    }

    private fun getLambdasCacheType() =
        Map::class.asTypeName().parameterizedBy(
            listOf(
                String::class.asTypeName(),
                LambdaTypeName.get(
                    returnType = Any::class.asTypeName().copy(nullable = true),
                    parameters = *arrayOf(ClassName("godot.core", "Variant"))
                )
            )
        )

    private fun generateVariantTypeConversionLambdaGetter(entryFileSpec: FileSpec.Builder) {
        val funcSpecBuilder =  FunSpec
            .builder("getTypeConversionLambda")
            .addAnnotation(
                AnnotationSpec
                    .builder(ClassName("kotlin", "Suppress"))
                    .addMember("%S", "UNCHECKED_CAST")
                    .build()
            )
            .addModifiers(KModifier.PRIVATE)
            .addModifiers(KModifier.INLINE)
            .addTypeVariable(TypeVariableName("T").copy(reified = true))
            .returns(
                LambdaTypeName
                    .get(
                        returnType = TypeVariableName("T").copy(nullable = true),
                        parameters = *arrayOf(ClassName("godot.core", "Variant"))
                    )
            )
            .beginControlFlow("return when (%T::class)", TypeVariableName("T"))

        variantTypesToPackagePaths.forEach { variantTypeAsString ->
            funcSpecBuilder.addStatement(
                "%T::class -> %L[%S] as (%L) -> %T",
                ClassName(variantTypeAsString.value, variantTypeAsString.key),
                MemberName("", "typeConversionLambdas"),
                variantTypeAsString.value.toLowerCase(),
                ClassName("godot.core", "Variant"),
                TypeVariableName("T").copy(nullable = true)
            )
        }

        entryFileSpec.addFunction(
            funcSpecBuilder
                .addStatement("else -> {{ null }}")
                .endControlFlow()
                .build()
        )
    }

    fun generateVariantConversionLambdas(entryFileSpec: FileSpec.Builder) {
        variantTypesToPackagePaths.keys.forEach { variantTypeAsString ->
            entryFileSpec.addFunction(generateTypeConversionFunction(variantTypeAsString))
        }
        generateTypeConversionLambdasCache(entryFileSpec)
        generateVariantTypeConversionLambdaGetter(entryFileSpec)
    }

}
