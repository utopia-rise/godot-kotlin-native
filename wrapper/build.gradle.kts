plugins {
    id("org.jetbrains.kotlin.konan").version("0.8.2")
}

konan {
    targets = mutableListOf("macbook", "linux", "mingw")
    jvmArgs = mutableListOf("-Xmx8g")
}


konanArtifacts {
    interop("GDNative") {
        defFile("src/main/c_interop/godot.def")

        includeDirs("lib/godot_headers", "src/main/c_interop")
    }


    library("Godot") {
        libraries {
            artifact("GDNative")
        }

        srcDir("src/main/kotlin")
    }
}


tasks {
    val samplesLibsPath = file("../samples/project/Kotlin/lib/")


    "copyLibsToSamples"(Copy::class) {
        dependsOn(konanArtifacts["GDNative"])
        dependsOn(konanArtifacts["Godot"])

        outputs.upToDateWhen { false }


        for (target in konan.targets) {
            konanArtifacts["GDNative"].findByTarget(target)?.let {
                from(it.artifact)
            }
            konanArtifacts["Godot"].findByTarget(target)?.let {
                from(it.artifact)
            }
        }
        into(samplesLibsPath)
    }
}