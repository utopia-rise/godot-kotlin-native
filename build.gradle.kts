apply {
    plugin(BuildVersion::class.java)
    plugin(ReleaseMode::class.java)
}

val versionString = project.version.toString()

subprojects {
    group = "com.utopia-rise"
    version = versionString
    repositories {
        mavenLocal()
        jcenter()
    }
}
