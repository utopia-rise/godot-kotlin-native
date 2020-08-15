package godot.codegen.utils

import com.squareup.kotlinpoet.ANY
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.TypeName
import godot.codegen.tree
import godot.codegen.isObjectOrItsChild

private val coreTypes = listOf(
    "GodotArray",
    "Basis",
    "Color",
    "Dictionary",
    "GodotError",
    "NodePath",
    "Plane",
    "PoolByteArray",
    "PoolIntArray",
    "PoolRealArray",
    "PoolStringArray",
    "PoolVector2Array",
    "PoolVector3Array",
    "PoolColorArray",
    "PoolIntArray",
    "PoolRealArray",
    "Quat",
    "Rect2",
    "AABB",
    "RID",
    "String",
    "Transform",
    "Transform2D",
    "Variant",
    "Vector2",
    "Vector3"
)

private val coreTypeAdaptedForKotlin =
    listOf("AABB", "Basis", "Color", "Plane", "Quat", "Rect2", "Transform", "Transform2D", "Vector2", "Vector3")

private val kotlinReservedNames = listOf(
    "class",
    "enum",
    "interface",
    "in",
    "var",
    "val",
    "Char",
    "Short",
    "Boolean",
    "Int",
    "Long",
    "Float",
    "Double",
    "operator",
    "object"
)

private val primitives = listOf("Long", "Double", "Boolean", "Unit")

fun String.escapeUnderscore(): String {
    if (this == "") return this

    var thisString = this

    while (thisString[0] == '_') thisString = thisString.drop(1)

    return thisString
}

fun String.removeEnumPrefix(): String {
    if (this == "") return this

    var thisString = this

    val ind = thisString.indexOf("enum.")
    if (ind != -1) thisString = thisString.drop(ind + 5)

    if (thisString == "Error") return "GodotError"

    val type = thisString.replace("::", ".").escapeUnderscore()
    return if (type.matches(Regex("Variant\\.\\w+"))) type.replace(".", "") else type
}

fun String.getPackage() =
    when {
        isEnum() -> {
            var thisString = this
            val index = thisString.indexOf("enum.")

            if (index != -1) thisString = thisString.drop(index + 5)

            if (thisString == "Error") {
                "godot.core"
            } else {
                thisString = thisString.replace("::", ".").split(".")[0]
                when {
                    thisString.isPrimitive() || thisString == "String" -> "kotlin"
                    thisString.isCoreType() -> "godot.core"
                    else -> "godot"
                }
            }
        }
        isPrimitive() || this == "String" -> "kotlin"
        isCoreType()  -> "godot.core"
        else -> "godot"
    }

fun String.isEnum(): Boolean {
    return this.indexOf("enum.") == 0
}

fun String.isPrimitive() = primitives.find { s -> s == this } != null

fun String.isCoreTypeAdaptedForKotlin() = coreTypeAdaptedForKotlin.find { s -> s == this } != null

fun String.isCoreType() = coreTypes.find { s -> s == this } != null

fun String.escapeKotlinReservedNames() = if (kotlinReservedNames.find { s -> s == this } != null) "_$this" else this

fun String.convertToCamelCase(): String {
    if (this == "") return this

    var thisString = this

    val prefix = buildString {
        while (thisString != "" && thisString[0] == '_') {
            this.append('_')
            thisString = thisString.drop(1)
        }
    }

    var split = thisString.split('_')
    val first = split[0]
    split = split.drop(1)

    return prefix + first + split.joinToString("") { it.capitalize() }
}

fun String.convertToSnakeCase(): String =
    if (this == "GodotArray") "array"
    else if (this == "AABB" || this == "RID" || this == "Transform2D") this.toLowerCase()
    else fold(StringBuilder()) { accumulator, character ->
        if (character in 'A'..'Z')
            (if (accumulator.isNotEmpty()) accumulator.append('_') else accumulator)
            .append(character + ('a' - 'A'))
        else accumulator.append(character)
    }.toString()

fun String.convertTypeToKotlin(): String {
    return when {
        this == "int" -> "Long"
        this == "float" -> "Double"
        this == "bool" -> "Boolean"
        this == "void" -> "Unit"
        this == "Array" -> "GodotArray"
        else -> this
    }
}

val String.typeNameForICalls: TypeName
    get() {
        val icallType = convertTypeForICalls()
        return ClassName(icallType.getPackage(), icallType).convertIfTypeParameter()
    }

fun String.convertTypeForICalls(): String {
    if (this == "enum.Error") return "UInt"

    if (this.isEnum()) return "Long"

    if (this.isPrimitive() || this.isCoreType()) return this

    return "Object"
}

fun String.defaultValue(): String = when (this) {
    "Long" -> "0"
    "Double" -> "0.0"
    "Boolean" -> "false"
    else -> throw Exception("$this is not a primitive type.")
}

private class TypeException(override val message: String) : Exception()
