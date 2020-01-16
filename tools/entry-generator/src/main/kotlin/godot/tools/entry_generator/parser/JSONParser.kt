package godot.tools.entry_generator.parser

import com.beust.klaxon.Klaxon
import godot.tools.entry_generator.model.Classes


class JSONParser : Parser {
    override fun parseConfig(content: String): Classes {
        return Klaxon().parse<Classes>(content)!! // LUL
    }
}