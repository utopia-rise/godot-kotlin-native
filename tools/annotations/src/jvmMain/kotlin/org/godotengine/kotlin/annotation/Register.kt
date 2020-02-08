package org.godotengine.kotlin.annotation


@Target(
        AnnotationTarget.PROPERTY
)
@Retention(AnnotationRetention.RUNTIME)
actual annotation class RegisterProperty

@Target(
        AnnotationTarget.FUNCTION
)
@Retention(AnnotationRetention.RUNTIME)
actual annotation class RegisterFunction