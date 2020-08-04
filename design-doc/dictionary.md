This is an example of how pages inside this category might look like:

---

## Criteria

The next section list down several `Dictionary` implementations, sighting how it compares to a `kotlin.MutableMap` - specifically in the following key areas:

1. Setting a value
2. Getting a value
3. Iteration.



Additionally, it will also compare the implementation to how a `Dictionary` is used in GDScript.



## Implementations



### [1] Using Variant and specialized methods  (current)

```kotlin
class Dictionary : Iterable<Map.Entry<Variant, Variant>> {
    fun set(key: Long, value: Long)
    fun set(key: Long, value: Double)
    // and so on
    fun set(key: String, value: Long)
    fun set(key: String, value: Double)
    // and so on
    
    fun get(key: Long): Variant
    fun get(key: String): Variant
    // and so on
}
```

The idea behind this implementation is to prevent the user from passing on a *wrong value type* to the `Dictionary` by providing specialized methods that only accept the correct value types. *wrong value type*s are either types that can't be converted to a  `Variant` or types that when passed to a `Variant` losses it's type identity - an example of this are the `Int` and `Float` types as `Variant` only work with the mentioned type's wider cousins: `Long` and `Double`, respectively. When creating a `Variant` from an `Int`, the value will be converted to a `Long` first before storing it - so when unwrapping the value from the `Variant` it's impossible to know if the initial value passed to it was an `Int` or a `Long`.

**Setting a value**

```kotlin
dic[1L] = 2L
dic["hello"] = 0.5
dic[1] = "hi" // does not compile, key here is an Int
dic["foo"] = 0.1f // does not compile, value here is a Float
dic[SomeKotlinClass()] = 2L // does not compile as SomeKotlinClass is not Variant compatible
```

In this area, setting a value is similar with `kotlin.MutableMap`.

**Getting a value**

```kotlin
dic["hello"].asString() // returns a variant, use asXXX to convert it to the expected type
dic.get("hello", 1L) // returns a Long value with a default of 1L if not present
```

In a way the second line is similar to how a `kotlin.MutableMap` works, however in the first line you to deal with a `Variant` first then convert it to the expected type. 

**Iteration**

```kotlin
dic.forEach { (keyAsVariant, valueAsVariant) ->
	// do something here
}

for ((keyAsVariant, valueAsVariant) in dic) {
    // do something here
}
```

It is almost similar to `kotlin.MutableMap` however the biggest downside is you have to deal with `Variant`s.

**GDScript comparison**

```kotlin
dic[1] = 2
dic["hello"] = 0.5
dic[1] = "hi"
dic["foo"] = 0.1

print(dic["Hello"]) // no explicit Variant conversion.
```

Everything is a `Variant` in GDScript, but the type itself is not exposed to users - but they are automatically converted. The problems with `Int` and `Float` is not present here because GDScript is using `Long` and `Double` for natural and real  numbers, respectively. If you think about it a `Variant` in Kotlin parlance is `Any`, while in C# it is an `object`.



### [2] Dictionary extending AbstractMutableMap<Any, Any>

```kotlin
class Dictionary : AbstractMutableMap<Any, Any>() {
    // ...
}
```

This is inspired by Godot C#, essentially `Dictionary` is a `IMap<object, object>`. The idea behind this implementation is to make usage of `Dictionary` idiomatic in Kotlin but retains its behaviour in GDScript (i.e, You can assign any key and value - as long as they are `Variant` compatible). A big bonus we get here is that we can use all the API defined for `kotlin.MutableMap`.

**Setting a value**

```kotlin
dic[1L] = 2L
dic["hello"] = 0.5
dic[1] = "hi" // compiles but the type of they key when queried will be a Long (1)
dic["foo"] = 0.1f // compiles but the type of the value when queried will be a Double (2)
dic[SomeKotlinClass()] = 2L // compiles but fails at runtime because SomeKotlinClass is not Variant compatible (3)
```

In a way it's similar to the first implementation except for the last three lines: (1) and (2) will lose the type information of it's key and value, respectively - but alternatively we can change the behaviour to throw an exception at runtime  in a [fail-fast](https://en.wikipedia.org/wiki/Fail-fast) manner. Failing fast here means the user can pick up the mistake during development instead of discovering it after the code has been shipped.

**Getting a value**

```kotlin
dic["hello"] as String // explicit casting to a String
dic.getOrDefault("Hello", 0) // returns an Int, via implicit casting.
```

Since values are `Any`, we have to cast to the appropriate type. This is similar to the first implementation, but doesn't use a `Variant` which in my honest opinion - shouldn't be used by users (It's not exposed in GDScript and C# - why should we? In C# it is only used to namespace: `Variant.Type` and `Variant.OP`: https://godotsharp.net/api/3.1.0/Godot.Variant/)

**Iteration**

```kotlin
dic.forEach { (keyAsAny, valueAsAny) ->
	// do something here
}

for ((keyAsAny, valueAsAny) in dic) {
    // do something here
}
```

Again, similar to the first implementation but not using `Variant`.

**GDScript Comparison**

This has a lot of similarity with GDScript, specifically setting a value. The difference lies in retrieving the value, you have to cast to the expected type in Kotlin due to it being statically typed. Ignoring the difference in typing nature of Kotlin and GDScript, this implementation is equal to the GDScript one.



### [3] Typed Dictionary

```kotlin
class Dictionary<K: Any, V: Any> : AbstractMutableMap<K, V>() {
    // ...
}
```

This approach is a specialization of the second implementation where we allow users to specify more information about the types of its keys and values. This is the most idiomatic compared to the two previous implementation, essentially what you have here is a `kotlin.MutableMap` with a different name. One of the downside of this approach is that it's impossible to prevent users from using types that are not `Variant` compatible (i.e.`Dictionary<Throwable, SomeKotlinClass>`).

**Setting a value**

```kotlin
val dic: Dictionary<String, Int> = ...
dic["Hello"] = 12
dic["Foo"] = true // does not compile, dic can only store Ints values
dic[1] = 12 // does not compile, dic can only use String keys

val dic: Dictionary<Any, Any> = ...
dic["Foo"] = true // works!
dic[1] = 12 // works!
```

This approach allows you to restrict the type you can pass as its keys and values. If you want a `Dictionary` which behaves similarly in GDScript, then you can declare it as `Dictionary<Any, Any>`.

**Getting a value**

```kotlin
val dic: Dictionary<String, Int> = ...
var a = dic["Hello"] + 1 // works!
```

This is the area where this approach shines, you don't have to do any explicit casting to the expected type unless you declared it as `Dictionary<Any, Any>`.

**Iteration**

```kotlin
val dic: Dictionary<String, Int> = ...
dic.forEach { (key, value) ->
	// do something here
}

for ((key, value) in dic) {
    // do something here
}
```

As mentioned in the previous section, this approach shines in reads - no more explicit casting to the expected type.

**GDScript Comparison**

This is very different to GDScript but it is more idiomatic in Kotlin. It is hard to compare how reads are done in both languages due to the difference in typing.
