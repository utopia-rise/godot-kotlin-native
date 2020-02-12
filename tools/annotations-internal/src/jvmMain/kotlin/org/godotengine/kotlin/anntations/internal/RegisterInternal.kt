package org.godotengine.kotlin.anntations.internal

@Target(
        AnnotationTarget.CLASS,
        AnnotationTarget.FUNCTION,
        AnnotationTarget.PROPERTY
)
@Retention(AnnotationRetention.RUNTIME)
actual annotation class RegisterInternal