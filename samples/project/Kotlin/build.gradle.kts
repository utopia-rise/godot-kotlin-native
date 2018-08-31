plugins {
    id("org.jetbrains.kotlin.konan") version "0.8.2"
    id("kotlin-godot") version "0.1"
}

konan.targets = mutableListOf("macbook", "linux", "mingw")


konanArtifacts {
    dynamic("samples") {
        libraries {
            useRepo("lib/")

            klib("GDNative")
            klib("Godot")
        }

        srcDir("src/main/kotlin")
    }
}

/*
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
}*/