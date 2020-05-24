import com.jfrog.bintray.gradle.BintrayExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.kotlin.dsl.extra

class BintrayPublish : Plugin<Project> {
    override fun apply(target: Project) {
        target.plugins.apply("com.jfrog.bintray")
        target.plugins.apply("maven-publish")

        val bintrayUser = target.propOrEnv("BINTRAY_USER")
        val bintrayApiKey = target.propOrEnv("BINTRAY_API_KEY")

        var bintrayRepo = "godot-kotlin-dev"
        var doPublish = true

        //TODO : See how to handle release according to branch and tags
        if (target.extra["releaseMode"] == true) {
            bintrayRepo = "godot-kotlin"
            doPublish = false
        }

        val artifacts = target.extra["artifacts"] as Array<String>

        target.extensions.configure(BintrayExtension::class.java) {
            user = bintrayUser
            key = bintrayApiKey
            publish = doPublish
            with(pkg) {
                userOrg = "utopia-rise"
                repo = bintrayRepo
                desc = "Kotlin Native bindings for Godot Engine"
                name = "godot-kotlin"
                setLicenses("MIT")
                setLabels("kotlin", "godot", "gamedev", "godotengine")
                vcsUrl = "https://github.com/utopia-rise/godot-kotlin.git"
                githubRepo = "utopia-rise/godot-kotlin"
                with(version) {
                    name = project.rootProject.version.toString()
                }
            }

            setPublications(*artifacts)
        }

        target.extensions.configure(PublishingExtension::class.java) {
            publications {
                all {
                    if (this@all is MavenPublication) {
                        pom {
                            url.set("https://github.com/utopia-rise/godot-kotlin")
                            licenses {
                                license {
                                    name.set("MIT")
                                    url.set("https://github.com/utopia-rise/godot-kotlin/blob/master/LICENSE")
                                    distribution.set("repo")
                                }
                            }
                            scm {
                                connection.set("scm:git:https://github.com/utopia-rise/godot-kotlin")
                                developerConnection.set("scm:git:github.com:utopia-rise/godot-kotlin.git")
                                tag.set("master")
                                url.set("https://github.com/utopia-rise/godot-kotlin")
                            }

                            developers {
                                developer {
                                    id.set("core")
                                    name.set("Ranie Jade Ramiso")
                                    url.set("https://github.com/raniejade")
                                    email.set("raniejaderamiso@gmail.com")
                                }
                                developer {
                                    id.set("core")
                                    name.set("Pierre-Thomas Meisels")
                                    url.set("https://github.com/piiertho")
                                    email.set("meisels27@yahoo.fr")
                                }
                                developer {
                                    id.set("core")
                                    name.set("Cedric Hippmann")
                                    url.set("https://github.com/chippmann")
                                    email.set("cedric.hippmann@hotmail.com")
                                }
                                developer {
                                    id.set("core")
                                    name.set("Tristan Grespinet")
                                    url.set("https://github.com/CedNaru")
                                    email.set("ced.naru@gmail.com")
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

fun Project.propOrEnv(name: String): String? {
    var property: String? = findProperty(name) as String?
    if (property == null) {
        property = System.getenv(name)
    }
    return property
}
