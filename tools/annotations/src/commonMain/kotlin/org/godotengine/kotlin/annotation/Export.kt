package org.godotengine.kotlin.annotation

@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
annotation class Export(val propertyHint: String = "", val hintString: String = "")