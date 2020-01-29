package org.godotengine.kotlin.gradleplugin

import godot.tools.entry_generator.EntryGenerator
import java.io.File


fun generateEntry(configs: List<String>, output: String, gdnsDir: String, libPath: String) {
    EntryGenerator.generate(configs, {
        val out = File(output)
        out.parentFile.mkdirs()
        out.createNewFile()
        out.writeText(it)
    }, {
        if (gdnsDir != "") {
            val out = File("$gdnsDir/${this.packageName}/${this.name}.gdns")
            out.parentFile.mkdirs()
            out.createNewFile()
            out.writeText(it)
        }
    }, libPath)
}