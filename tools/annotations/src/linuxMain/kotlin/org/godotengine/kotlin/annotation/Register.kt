package org.godotengine.kotlin.annotation

import godot.registration.PropertyHint
import godot.registration.RPCMode
import kotlin.reflect.KClass

@Target(
        AnnotationTarget.PROPERTY
)
@Retention(AnnotationRetention.RUNTIME)
actual annotation class RegisterProperty(
        val visibleInEditor: Boolean,
        val defaultValue: String,
        val rpcMode: RPCMode = RPCMode.Disabled,
        val propertyHint: PropertyHint = PropertyHint.None,
        val hintString: String = ""
)

@Target(
        AnnotationTarget.FUNCTION
)
@Retention(AnnotationRetention.RUNTIME)
actual annotation class RegisterFunction(
        val rpcMode: RPCMode = RPCMode.Disabled
)