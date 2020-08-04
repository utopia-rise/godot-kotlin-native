package godot.extension.injection

/**
 * Properties marked with this annotations will be populated when a corresponding `.inject` method is called
 *
 * Only useful in conjunction with either `JumpTableInjector` or `<YouClassName>Injector` injectors:
 *
 * ```
 * override fun _ready() {
 *     super._ready()
 *     JumpTableInjector.injectNodes(this)
 * }
 * ```
 * or:
 * ```
 * override fun _ready() {
 *     super._ready()
 *     SomeClassOfYoursInjector.injectNodes(this)
 * }
 * ```
 */
@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
annotation class Inject(val exportedNodePathName: String = "", val nodePath: String = "")
