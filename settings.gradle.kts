rootProject.name = "godot-kotlin"

subdir("godot-kotlin") {
    include("godot-library")
}

subdir("plugins") {
    include("godot-gradle-plugin")
}

subdir("entry-generation") {
    include("godot-annotation-processor")
}

subdir("entry-generation") {
    include("godot-compiler-native-plugin")
    include("godot-compiler-plugin")
    include("godot-compiler-plugin-common")
    include("godot-entry-generator")
}

subdir("utils") {
    include("godot-build-props")
    include("composite-build-support")
}

class IncludeDsl(val root: String) {
    fun include(project: String) {
        settings.include(project)
        settings.project(":$project").also {
            it.projectDir = file("$root/$project")
        }
    }
}

fun subdir(root: String, block: IncludeDsl.() -> Unit) {
    block(IncludeDsl(root))
}
