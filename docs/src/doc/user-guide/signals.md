Use the delegate `signal` to create a signal and annotate it with `@RegisterSignal`. Note that the name of 
the signal must start with a prefix `signal` (see [API differences](../api-differences.md) section for an explanation).
This binding only supports signals with at most 10 parameters at the moment.

```kotlin
@RegisterClass
class RotatingCube: Spatial() {
    @RegisterSignal  
    val signalReverseChanged by signal<Boolean>("reverse")
}
```

!!! danger ""
    All signals that you register, are registered in `snake_case`!  
    Also the `signal` prefix will be dropped (like described in [API differences](../api-differences.md)).  
    So `signalVeryCoolSignal` will become `very_cool_signal`  
    This is done for easier GDScript integration. Also in GDScript signals can have the same name as properties, which is not possible in kotlin as signals **are** properties.  
    Keep this in mind when interacting with in kotlin defined signals from other languages or when using functions like `emit` from an `Object` rather from the signal property. 

## Emitting
Every signal has a `emit` method which can be used to emit it.

```kotlin
signalReverseChanged.emit(false)
```

## Subscribing
A method can be subscribed/connected to a signal via `connect`. The number of parameters of the method and signal must match.

```kotlin
class SomeObject: Object() {
    fun onReverseChanged(reverse: Boolean) {
        GD.print("Value of reverse has changed: $reverse")
    } 
}

val targetObject = SomeObject()
signalReverseChanged.connect(targetObject, targetObject::onReverseChanged)
```