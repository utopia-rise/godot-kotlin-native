package org.godotengine.kotlin.entrygenerator.parser

import org.godotengine.kotlin.entrygenerator.model.Classes


interface Parser {
    fun parseConfig(content: String): Classes
}