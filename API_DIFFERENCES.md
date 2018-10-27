# API differences from GDScript

Kotlin has a lot of differences comparing to GDScript, buf there are a couple of differences we want to pay attention to:


 - No `onready` keyword yet
 
 ---
 
 - Vector modifying:

This code snippet doesn't work:
```kotlin
    override fun _ready() {
        position.x = 5.0
    }
```

This happens because in this way you are modifying local copy of `position`, which makes no sense. You should do like this:
```kotlin
    override fun _ready() {
        position { 
            it.x = 5.0
        }
    }
```

Which is the same to
```kotlin
    override fun _ready() {
        val it = position
        it.x = 5.0
        position = it
    }
```

---

 - `yield`
 
To use `yield` keyword in your program **library extension** is needed.

*build.gradle*:
```groovy
    configure(/*targets*/) {
        compilations.all {
            dependencies {
                implementation 'org.jetbrains.kotlin.godot:godot-library-extension:1.+'
            }
        }
    }
```

Use `GD.yielding` builder to create function:
```kotlin
fun foo() = GD.yielding</*return type*/>(this) {
    yield()
    println(yield<Int>())
    
    yield(/*Object*/, "test_signal")
    
    /*return value*/
}
```

Return value of that function is `FunctionMonitor</*return type*/>`, which has value `result`, flag `finished` and `resume` functions.

---
 - Godot-nullable and Kotlin-nullable
 
 Kotlin has nullable and not-nullable types, which protects you from most *NullPointerException* situations. But also there could be situations when you have not-null instance of Kotlin class which represents null object in Godot.
 
 If some Godot function can provide *null* as result, you should use `isNull` function on it because **even if you get not-null Kotlin object it could be null in Godot**.
 
 
---
So this is basically all perceptible differences. Look [Godot API](http://docs.godotengine.org/ru/latest/index.html) if you have any questions, there you can find a lot of answers.