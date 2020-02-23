package org.godotengine.kotlin.annotation

@Target(
        AnnotationTarget.CLASS
)
@Retention(AnnotationRetention.RUNTIME)
annotation class RegisterClass

expect annotation class RegisterFunction

expect annotation class RegisterProperty
