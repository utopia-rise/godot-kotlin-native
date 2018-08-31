import godot.tools.entry_generator.EntryGenerator
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


    val configs = mutableListOf<String>()
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

        configs.add(arg)
    }


    if (output == "")
        error("Output file must be specified with -o key")
    if (outputDir != "" && libPath == "")
        error("Path to gdnative-library must be specified with -lib key")


    if (!libPath.startsWith("res://"))
        libPath = "res://$libPath"
    if (outputDir == "")
        println("Warning: output dir not specified, NativeScript classes will not be generated")


    EntryGenerator.generate(configs, {
        val out = File(output)
        out.parentFile.mkdirs()
        out.createNewFile()
        out.writeText(it)
    }, {
        if (outputDir != "") {
            val out = File("$outputDir/${this.packageName}/${this.name}.gdns")
            out.parentFile.mkdirs()
            out.createNewFile()
            out.writeText(it)
        }
    }, libPath)
}