package godot.annotation

import godot.MultiplayerAPI.RPCMode

/*
If a change is made to a annotation name or the package path has changed,
remember to also change it here: GodotAnnotationProcessor!
*/

/**
 * Registeres a class in godot so it can be used from another language or from godot
 *
 * @param isTool Same as the `tool` keyword for GDScript. Makes the class usable in the editor
 */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class RegisterClass(val isTool: Boolean = false)

/**
 * Registeres a property in godot so it can be used from another language or from godot
 *
 * **Note:** If a property is registered. Only compile time constant assignments can be used. If this is not possible you have to use lateinit and set the value either in the constructor or in `_ready`
 *
 * @param visibleInEditor If set to true, the property can be set through the inspector. Use one of the many PropertyHintAnnotations to tell the inspector of what kind this property is. **Note:** if also a default value is set in code, the inspector uses that value as the default value. If different the value set in the inspector overrides the one set in code.
 * @param rpcMode Defines the RPC mode for this function. Default: RPCMode.DISABLED
 */
@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
annotation class RegisterProperty(
    val visibleInEditor: Boolean = true,
    val rpcMode: RPCMode = RPCMode.DISABLED
)

/**
 * Registeres a function in godot so it can be called through another language or from godot
 *
 * **Note:** Engine functions like `_ready` also need to be annotated with this annotation in order to work
 *
 * Also you can only register functions that receive and return either primitives, Objects derived from Godot classes or Objects wrapped in `Variant`
 *
 * @param rpcMode Defines the RPC mode for this function. Default: RPCMode.DISABLED
 */
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class RegisterFunction(
    val rpcMode: RPCMode = RPCMode.DISABLED
)

/**
 * Registeres a signal to make it usable
 *
 * **Note:** Properties annotated with this signal have to have the prefix `signal` and have to be assigned through one of the signal delegates.
 *
 * A signal without the delegate, without the prefix or without this annotation WILL NOT WORK.
 *
 * The `signal` prefix is dropped during registration: `signalReverseChanged` becomes `reverseChanged` in Godot
 *
 * Use the signals `connect` method to register receivers in a typesafe way.
 */
@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
annotation class RegisterSignal
