package org.godotengine.kotlin.annotation

@Target(
        AnnotationTarget.CLASS
)
@Retention(AnnotationRetention.RUNTIME)
annotation class RegisterClass

//@Target(
//        AnnotationTarget.FUNCTION
//)
//@Retention(AnnotationRetention.RUNTIME)
expect annotation class RegisterFunction

expect annotation class RegisterProperty
