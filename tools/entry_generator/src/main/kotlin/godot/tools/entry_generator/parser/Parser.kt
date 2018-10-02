package godot.tools.entry_generator.parser

import godot.tools.entry_generator.model.Classes


interface Parser {
    fun parseConfig(content: String): Classes
}