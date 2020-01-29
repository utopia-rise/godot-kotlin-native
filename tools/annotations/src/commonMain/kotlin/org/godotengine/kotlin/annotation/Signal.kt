package org.godotengine.kotlin.annotation

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class Signal(vararg val defaultValues: String)