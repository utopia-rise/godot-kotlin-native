package godot.entrygenerator.extension

fun String.isString() = this == "kotlin.String"

fun String.isGodotPrimitive() =
    when (this) {
        "kotlin.Int" -> true
        "kotlin.Long" -> true
        "kotlin.Float" -> true
        "kotlin.Double" -> true
        "kotlin.Boolean" -> true
        "kotlin.Byte" -> true
        "kotlin.Short" -> true
        else -> false
    }

fun String.getAsGodotPrimitive() =
    when (this) {
        "kotlin.Int" -> "int"
        "kotlin.Long" -> "int"
        "kotlin.Float" -> "float"
        "kotlin.Double" -> "float"
        "kotlin.Boolean" -> "bool"
        "kotlin.Byte" -> "byte" //TODO: don't know the correct type
        "kotlin.Short" -> "int"
        else -> null
    }
