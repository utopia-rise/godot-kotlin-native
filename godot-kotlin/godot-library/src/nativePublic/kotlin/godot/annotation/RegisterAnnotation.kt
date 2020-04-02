package godot.annotation

import godot.registration.RPCMode

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class RegisterClass(val isTool: Boolean = false)

@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
annotation class RegisterProperty(
    val visibleInEditor: Boolean = false,
    val rpcMode: RPCMode = RPCMode.DISABLED
)

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class RegisterFunction(
    val rpcMode: RPCMode = RPCMode.DISABLED
)

@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
annotation class RegisterSignal