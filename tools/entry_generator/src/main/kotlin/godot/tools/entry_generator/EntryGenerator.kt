package godot.tools.entry_generator

import godot.tools.entry_generator.model.Class
import godot.tools.entry_generator.model.Classes
import godot.tools.entry_generator.model.unite
import godot.tools.entry_generator.parser.JSONParser
import godot.tools.entry_generator.parser.Parser
import godot.tools.entry_generator.parser.XMLParser
import java.io.File


class EntryGenerator {
    companion object {
        fun generate(configs: List<String>, entryOut: (String) -> Unit, gdnsOut: Class.(String) -> Unit, libPath: String) {
            val configsContent = mutableListOf<Classes>()

            for (config in configs) {
                val content = File(config).readText()

                lateinit var parser: Parser
                if (config.endsWith(".json"))
                    parser = JSONParser()
                if (config.endsWith(".xml"))
                    parser = XMLParser()

                configsContent.add(parser.parseConfig(content))
            }



            val classes = configsContent.unite()
            entryOut(classes.generate())


            for (cl in classes.classes) {
                cl.gdnsOut("""
[gd_resource type="NativeScript" load_steps=2 format=2]

[ext_resource path="$libPath" type="GDNativeLibrary" id=1]

[resource]

resource_name = "${cl.name}"
class_name = "${cl.classPath}"
library = ExtResource( 1 )
            """.trimIndent())
            }
        }
    }
}