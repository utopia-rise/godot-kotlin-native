package godot.codegen.utils

import com.squareup.kotlinpoet.ANY
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy

fun ClassName.convertIfTypeParameter() = when(this.simpleName) {
    "GodotArray" -> this.parameterizedBy(ANY.copy(nullable = true))
    "Dictionary" -> this.parameterizedBy(ANY.copy(nullable = true), ANY.copy(nullable = true))
    else -> this
}
