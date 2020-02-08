enum class GeneratorTarget(val sourceSetName: String, val implementation: Boolean) {
    Common("common", false),
    Native("native", true)
}
