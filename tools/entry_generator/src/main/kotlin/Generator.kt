import model.*
import parser.*
import java.io.File


fun main(args: Array<String>) {
    if (args.isEmpty())
        println("Warning: list of configs to generate is not specified")


    var output = ""
    var outputFlag = false

    var outputDir = ""
    var outputDirFlag = false

    var libPath = ""
    var libPathFlag = false

    val configContent = mutableListOf<Classes>()
    for (arg in args) {
        if (outputFlag) {
            output = arg
            outputFlag = false
            continue
        }
        if (outputDirFlag) {
            outputDir = arg
            outputDirFlag = false
            continue
        }
        if (libPathFlag) {
            libPath = arg
            libPathFlag = false
            continue
        }
        if (arg == "-o") {
            outputFlag = true
            continue
        }
        if (arg == "--output-dir") {
            outputDirFlag = true
            continue
        }
        if (arg == "-lib") {
            libPathFlag = true
            continue
        }


        val content = File(arg).readText()

        lateinit var parser: Parser
        if (arg.endsWith(".json"))
            parser = JSONParser()
        if (arg.endsWith(".xml"))
            parser = XMLParser()

        configContent.add(parser.parseConfig(content))
    }


    if (output == "")
        error("Output file must be specified with -o key")
    if (outputDir != "" && libPath == "")
        error("Path to gdnative-library must be specified with -lib key")


    val classes = configContent.unite()

    val out = File(output)
    out.parentFile.mkdirs()
    out.createNewFile()

    out.writeText(classes.generate())


    if (outputDir != "") {
        if (!libPath.startsWith("res://"))
            libPath = "res://$libPath"

        for (cl in classes.classes) {
            val out = File("$outputDir/Scripts/${cl.name}.gdns")
            out.parentFile.mkdirs()
            out.createNewFile()

            out.writeText("""
[gd_resource type="NativeScript" load_steps=2 format=2]

[ext_resource path="$libPath" type="GDNativeLibrary" id=1]

[resource]

resource_name = "${cl.name}"
class_name = "${cl.name}"
library = ExtResource( 1 )
            """.trimIndent())
        }
    } else
        println("Warning: output dir not specified, NativeScript classes will not be generated")
}