package parser

import com.beust.klaxon.Klaxon
import model.Classes


class JSONParser : Parser {
    override fun parseConfig(content: String): Classes {
        return Klaxon().parse<Classes>(content)!! // LUL
    }
}