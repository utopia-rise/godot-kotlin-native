package org.godotengine.kotlin.entrygenerator.parser

import com.beust.klaxon.Klaxon
import org.godotengine.kotlin.entrygenerator.model.Classes


class JSONParser : Parser {
    override fun parseConfig(content: String): Classes {
        return Klaxon().parse<Classes>(content)!! // LUL
    }
}