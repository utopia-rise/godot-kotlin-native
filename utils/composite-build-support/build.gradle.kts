plugins {
    base
}

val depend by configurations.creating

dependencies {
    depend(project(":godot-compiler-native-plugin", configuration = "shadow"))
}

artifacts {
    default(depend.singleFile) {
        builtBy(depend)
    }
}
