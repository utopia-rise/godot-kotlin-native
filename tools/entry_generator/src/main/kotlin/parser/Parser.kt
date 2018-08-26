package parser

import model.Classes


interface Parser {
    fun parseConfig(content: String): Classes
}