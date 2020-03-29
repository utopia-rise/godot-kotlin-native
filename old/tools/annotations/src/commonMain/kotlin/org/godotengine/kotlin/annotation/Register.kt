package org.godotengine.kotlin.annotation

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class RegisterClass(val outputDir: String = "")

expect annotation class RegisterFunction

expect annotation class RegisterProperty
