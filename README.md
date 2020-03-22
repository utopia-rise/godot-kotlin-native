**TODO:** replace this README once the rework is ready to be merged!

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