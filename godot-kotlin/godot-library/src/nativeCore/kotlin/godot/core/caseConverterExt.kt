package godot.core

fun String.camelToSnakeCase(): String {
    return "(?<=[a-zA-Z])[A-Z]".toRegex().replace(this) {
        "_${it.value}"
    }.toLowerCase()
}
