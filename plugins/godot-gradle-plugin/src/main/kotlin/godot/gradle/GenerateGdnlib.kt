package godot.gradle

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction
import org.gradle.kotlin.dsl.mapProperty
import org.gradle.kotlin.dsl.property
import java.io.File

open class GenerateGdnlib : DefaultTask() {
    @Input
    val libraries = project.objects.mapProperty<GodotPlatform, File>()

    @Input
    val singleton = project.objects.property<Boolean>()

    @Input
    val loadOnce = project.objects.property<Boolean>()

    @Input
    val reloadable = project.objects.property<Boolean>()

    @OutputFile
    val output = project.objects.fileProperty()

    @TaskAction
    fun generate() {
        val file = output.get().asFile
        file.delete()
        file.bufferedWriter().use { writer ->
            writer.appendln("[entry]")
            writer.appendln()
            libraries.get().forEach { (platform, path) ->
                var normalizedPath = path.toString()
                // on Windows the path separator used is \ but Godot doesn't like it.
                // replace all instances of \ with / (unix path separator)
                if (File.separator == "\\") {
                    normalizedPath = normalizedPath.replace("\\", "/")
                }
                writer.appendln("${platformToKey(platform)}=\"res://$normalizedPath\"")
            }
            writer.appendln()

            writer.appendln("[dependencies]")
            writer.appendln()
            libraries.get().forEach { (platform, _) ->
                writer.appendln("${platformToKey(platform)}=[  ]")
            }
            writer.appendln()

            writer.appendln("[general]")
            writer.appendln()
            writer.appendln("singleton=${singleton.get()}")
            writer.appendln("load_once=${loadOnce.get()}")
            writer.appendln("symbol_prefix=\"godot_\"")
            writer.appendln("reloadable=${reloadable.get()}")
        }
    }

    private fun platformToKey(platform: GodotPlatform): String {
        return when (platform) {
            GodotPlatform.WINDOWS_X64 -> "Windows.64"
            GodotPlatform.LINUX_X64 -> "X11.64"
            GodotPlatform.OSX_X64 -> "OSX.64"
            GodotPlatform.ANDROID_X64 -> "Android.x86_64"
            GodotPlatform.ANDROID_ARM64 -> "Android.arm64-v8a"
            GodotPlatform.IOS_X64 -> "iOS.64"
            GodotPlatform.IOS_ARM64 -> "iOS.arm64"
        }
    }
}
