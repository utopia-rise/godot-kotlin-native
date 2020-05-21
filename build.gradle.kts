apply {
    plugin(BuildVersion::class.java)
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
