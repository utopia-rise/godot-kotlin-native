# API differences from GDScript
Kotlin has a lot of differences comparing to GDScript, but there are a couple of differences we want to pay attention to:

* [OnReady](#onready)
* [Local value modification](#local-value-modification)
* [Yield](#yield)
* [Nullability](#nullability)
* [Godot API](#godot-api)

## OnReady
 - No `onready` keyword yet
 
 
## Local value modification:

This code snippet doesn't work:
```kotlin
    override fun _ready() {
        position.x = 5.0
    }
```

This happens because in this way you are modifying the local copy of `position`, which makes no sense. You should do like this:
```kotlin
    override fun _ready() {
        position { 
            it.x = 5.0
        }
    }
```

Which is the same as:
```kotlin
    override fun _ready() {
        val it = position
        it.x = 5.0
        position = it
    }
```


## Yield
 
To use `yield` keyword in your program **library extension** is needed.

*build.gradle*:
```kotlin
    targets.forEach { target ->
        target.compilations.getByName("main") {
            if (this is org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeCompilation) {
                println("Configuring target ${target.name}")
                this.target.binaries {
                    sharedLib(listOf(org.jetbrains.kotlin.gradle.plugin.mpp.NativeBuildType.RELEASE))
                }
                target.compilations.all {
                    dependencies {
                        implementation("org.godotengine.kotlin:godot-library-extension:1.0.0") // <-- This one here
                    }
                }
            } else {
                System.err.println("Not a native target! TargetName: ${target.name}")
            }
        }
    }
```

Use `GD.yielding` builder to create a function that can yield:
```kotlin
fun foo() = GD.yielding</*return type*/>(this) {
    yield()
    println(yield<Int>())
    
    yield(/*Object*/, "test_signal")
    
    /*return value*/
}
```

Return value of that function is `FunctionMonitor</*return type*/>`, which has a value `result`, a flag `finished` and a `resume` function.

## Nullability
Kotlin has nullable and non-nullable types, which protects you from most *NullPointerException* situations. But also there could be situations when you have a not-null instance of Kotlin class which represents null object in Godot.

If some Godot function can provide *null* as result, you should use `isNull` function on it because **even if you get not-null Kotlin object it could be null in Godot and thus can be null during runtime**.
 
## Godot API
So this is are basically all perceptible differences. Look at the [Godot API](https://docs.godotengine.org/en/3.1/classes/index.html) if you wan't to know which classes and functions you can use.