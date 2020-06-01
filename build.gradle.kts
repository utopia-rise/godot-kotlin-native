apply {
    plugin(ReleaseMode::class.java)
}

version = "0.1.0"

val versionString = "${project.version}-${DependenciesVersions.godotVersion}"

subprojects {
    group = "com.utopia-rise"
    version = versionString
    repositories {
        mavenLocal()
        jcenter()
    }
}
