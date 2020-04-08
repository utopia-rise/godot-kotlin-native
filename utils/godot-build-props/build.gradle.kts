import org.apache.tools.ant.filters.ReplaceTokens

plugins {
    `kotlin-dsl`
    `maven-publish`
}

tasks {
    val processResources by getting(Copy::class) {
        outputs.upToDateWhen { false }
        val tokens = mapOf(
            "version" to version.toString()
        )
        from("src/main/resources") {
            include("*.properties")
            filter<ReplaceTokens>("tokens" to tokens)
        }
    }

    build {
        finalizedBy(publishToMavenLocal)
    }
}