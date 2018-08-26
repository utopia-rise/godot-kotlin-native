import model.*
import parser.*
import java.io.File


fun main(args: Array<String>) {
    if (args.isEmpty())
        println("Warning: list of configs to generate is not specified")


    var output = ""
    var flag = false

    val configContent = mutableListOf<Classes>()
    for (arg in args) {
        if (flag) {
            output = arg
            flag = false
            continue
        }
        if (arg == "-o") {
            flag = true
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


    val classes = configContent.unite()

    File(output).writeText(classes.generate())
}