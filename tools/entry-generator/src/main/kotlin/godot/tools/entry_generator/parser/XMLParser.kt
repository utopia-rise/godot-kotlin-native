package godot.tools.entry_generator.parser

import godot.tools.entry_generator.model.*
import org.w3c.dom.Element
import org.w3c.dom.Node
import org.xml.sax.InputSource
import java.io.StringReader
import javax.xml.parsers.DocumentBuilderFactory


class XMLParser : Parser {
    override fun parseConfig(content: String): Classes {
        val reader = InputSource(StringReader(content))
        val builder = DocumentBuilderFactory.newInstance().newDocumentBuilder()
        val doc = builder.parse(reader)

        doc.documentElement.normalize()

        return Classes(doc.documentElement.parseNodes("class") {
            parseClass(it)
        })
    }


    private fun parseClass(elem: Element): Class {
        val name = elem.criticalValue("name")
        val parent = elem.value("extends", "Object")
        val classPath = elem.value("class", name)
        val tool = elem.value("tool").toBoolean() // no NPE here (should be)

        val methods = elem.parseNodes("method") { parseMethod(it) }
        val properties = elem.parseNodes("property") { parseProperty(it) }
        val signals = elem.parseNodes("signal") { parseSignal(it) }

        return Class(name, parent, classPath, tool, methods, properties, signals)
    }


    private fun parseMethod(elem: Element): Method {
        val name = elem.criticalValue("name")
        val returnType = elem.value("returnType", "Unit")
        val isVararg = elem.value("vararg", "false").toBoolean()
        val arguments = elem.parseNodes("argument") { it.criticalValue("type") }

        return Method(name, returnType, isVararg, arguments)
    }


    private fun parseProperty(elem: Element): Property {
        val name = elem.criticalValue("name")
        val type = elem.criticalValue("type")
        val defaultValue = elem.criticalValue("defaultValue")
        val export = elem.value("export", "true").toBoolean()

        return Property(name, type, defaultValue, export)
    }


    private fun parseSignal(elem: Element): Signal {
        val name = elem.criticalValue("name")
        val arguments = elem.parseNodes("argument") {
            SignalArgument(it.criticalValue("name"), it.criticalValue("type"))
        }
        val defaultValues = elem.parseNodes("defaultValue") { it.criticalValue("value") }

        return Signal(name, arguments, defaultValues)
    }




    // Utils

    private fun <T> Element.parseNodes(nodeName: String, constructor: (Element) -> T): List<T> {
        val result = mutableListOf<T>()

        val content = this.getElementsByTagName(nodeName)
        for (i in 0 until content.length) {
            val it = content.item(i)
            if (it.nodeType == Node.ELEMENT_NODE)
                result.add(constructor(it as Element))
        }
        return result
    }

    private fun Element.criticalValue(name: String): String {
        val value = this.getAttribute(name)
        if (value == "")
            error("Value $name should have be specified!")
        return value
    }

    private fun Element.value(name: String, defaultValue: String = ""): String {
        val value = this.getAttribute(name)
        return if (value == "") defaultValue else value
    }
}