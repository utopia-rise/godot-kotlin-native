**TODO:** replace this README once the rework is ready to be merged!

---
**Important**

Development will start here after the second Maintainers meeting in week 13

---

# Merge Development branch
This is the Development Branch for the merge of our binding with the one from @raniejade at 
https://github.com/raniejade/godot-kotlin

## Merge Development Notes

### Overview

**Project Structure:**
```
.
├── buildSrc
│   ├── dependency version definitions
│   └── api classes codegeneration
├── entry-generation
│   ├── godot-entry-generator
│   ├── godot-annotation-processor
│   ├── godot-compiler-native-plugin
│   └── godot-compiler-plugin
├── plugins
│   ├── godot-gradle-plugin
│   └── godot-idea-plugin
├── godot-kotlin
│   ├── godot-headers (git submodule)
│   ├── godot-library
│   ├── godot-coroutines
│   ├── godot-analytics
│   └── more-extensions
└── samples
    ├── mini-games
    ├── bunny-benchmark
    ├── platformer-3d
    └── follow-coroutines
```

### Contribution
If you want to contribute to the merge look at the issues page and filter for the label 
[merge](https://github.com/utopia-rise/godot-kotlin/issues?q=is%3Aissue+is%3Aopen+label%3Amerge+). Search for an issue 
you want to implement and comment on it. We'll assign it to you if appropriate and add you to our merge discord channel.  
All merge relevant discussions and decisions will be made there so we recommend having it.

\
**TODO:** further documentation which is relevant for contributing to the merge after the second meeting in week 13

### Discussed topics
These topics are here for documentation purpose. They will be converted to individual issues:

- Registration  
    Using the existing annotation processing logic with some minor changes:  
      
    Adding TypeHint annotations:  
    ```kotlin
    @RegisterProperty
    @IntRange(start = 10, end = 100, step = 2) 
    val myProperty: Int = 100
    ```  
- Annotations as part of core
- Signals  
    Signals defined with generic functions with the number of arguments the signal has:  
    ```kotlin
    fun signal()  
    fun <TYPE1> signal(paramName1: String)  
    fun <TYPE1, TYPE2> signal(paramName1: String, paramName2: String)
    ...
    ```
    Signals as parameters like in @raniejade's binding. Possible to define signal emition after property change:
    ```kotlin
     val signalReverseChanged by signal<Boolean>("someName") 
    var reverse by Delegates.observable(signalReverseChanged.asListener())
    ```
- Gradle Build Script  
    Build script setup like in @raniejade's binding but with parameter support:  
    ```kotlin
    val platform by extra
    val signingIdenty by extra 
    
    godot {
        platforms(platform, android32, android64)
        libraries {
          val nameOfTheProject by creating {
            //individual configurations
          }
        }
    }
  
    val signingIdenty by extra 
    val signIos by tasks.getting<SigningWhatever> { 
        identity = signingIdentity 
    } 
    ```
- Intellij plugin with signal navigation
- Versioning:  
    Semantic, with supported godot version in artefact name:  
    `com.utopia-rise:godot-library-godot_version:x.y.z`