Any Kotlin function can be registered as long as its parameters and return type can be converted to a 
`Variant`, additionally the function must be annotated with `@RegisterFunction`. This binding only support 
methods with at most 10 parameters at the moment.

```kotlin
@RegisterClass
class RotatingCube: Spatial() {
    
    @RegisterFunction  
    override fun _ready() {
        gprint("I am ready!")
    }
}
```

## Virtual methods
Virtual methods (like `_ready`, `_process` and `_physics_process`) are declared as overridable methods. The default implementation throws a `NotImplementedException`, so you have to override it if you plan to expose a virtual method to Godot.