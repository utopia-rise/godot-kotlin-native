package org.godotengine.kotlin.annotation

@Target(
        AnnotationTarget.CLASS
)
@Retention(AnnotationRetention.RUNTIME)
annotation class RegisterClass

@Target(
        AnnotationTarget.FUNCTION
)
@Retention(AnnotationRetention.RUNTIME)
annotation class RegisterFunction

@Target(
        AnnotationTarget.PROPERTY
)
@Retention(AnnotationRetention.RUNTIME)
annotation class RegisterProperty(val visibleInEditor: Boolean, val defaultValue: String)