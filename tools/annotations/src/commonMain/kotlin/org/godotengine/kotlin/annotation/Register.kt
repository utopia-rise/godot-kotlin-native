package org.godotengine.kotlin.annotation

import kotlin.reflect.KClass

@Target(
        AnnotationTarget.CLASS
)
@Retention(AnnotationRetention.RUNTIME)
annotation class RegisterClass

@Target(
        AnnotationTarget.FUNCTION
)
@Retention(AnnotationRetention.RUNTIME)
annotation class RegisterFunction(val rpcMode: KClass<out Annotation> = Disabled::class)

@Target(
        AnnotationTarget.PROPERTY
)
@Retention(AnnotationRetention.RUNTIME)
annotation class RegisterProperty(val visibleInEditor: Boolean, val defaultValue: String, val rpcMode: KClass<out Annotation> = Disabled::class)