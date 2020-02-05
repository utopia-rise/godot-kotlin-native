package org.godotengine.kotlin.annotation

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class RegisterSignal(vararg val defaultValues: String)