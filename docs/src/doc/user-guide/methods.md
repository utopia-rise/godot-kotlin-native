Any Kotlin function can be registered as long as its parameters and return type can be converted to a 
`Variant`, additionally the function must be annotated with `@RegisterFunction`. This binding only support 
methods with at most 10 parameters at the moment.

```kotlin
@RegisterClass
class RotatingCube: Spatial() {
    
    @RegisterFunction  
    override fun _ready() {
        GD.print("I am ready!")
    }
}
```

!!! important ""
    All methods that you register, are registered in `snake_case`! So `myVeryCoolFunction` will become `my_very_cool_function`. This is done for easier GDScript integration and that Godot can properly call overridden virtual functions from other languages. Keep this in mind when calling kotlin functions from other languages or when using functions like `call` and not using our extension functions which handle the conversion for you!

## Virtual methods
Virtual methods (like `_ready`, `_process` and `_physics_process`) are declared as overridable methods. The default implementation throws a `NotImplementedException`, so you have to override it if you plan to expose a virtual method to Godot.  
Remember; just overriding is not enough to use that function. You have to explicitly register it as well with `@RegisterFunction` like you have to with your own methods.

## Registration Configuration
You can customize to some extent how your function should be registered in Godot:

The `@RegisterFunction` annotation takes one argument:

- **rpcMode**: Default: `RPCMode.DISABLED`