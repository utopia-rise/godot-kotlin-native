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
│   └── src/main/kotlin
│       ├── DependenciesVersions.kt
│       └── godot/codegen
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

CI status: [![Build Status](https://travis-ci.com/utopia-rise/godot-kotlin.svg?branch=master)](https://travis-ci.com/utopia-rise/godot-kotlin)

## Important notes

The binding will be merged with https://github.com/raniejade/godot-kotlin.  
The development will be in this repository in a new branch. Name: master-merge.
We strongly don't recommend using this binding until the new binding is in place!  
The development of the new binding will probably start by the end of week 13 of 2020 here in [this](https://github.com/utopia-rise/godot-kotlin/tree/master-merge) branch.  
For further information and questions, visit the discord channel linked below.

## Getting started

Look into [**Getting started**](./GETTING_STARTED.md) section to get more information.

## API differences from GDScript

Look into [**API differences from GDScript**](./API_DIFFERENCES.md) section to get more information.

## Registering classes

Look into [**Registration**](./REGISTRATION.md) section to get more information.

## Compiling from sources

Look into [**Compiling from source**](COMPILING_FROM_SOURCE.md) section to get more information.

## Roadmap

### 1.0.0-3.2 release version:
[Annotation processing enhanced with expect and actual implementation](https://github.com/utopia-rise/godot-kotlin/issues/2#issuecomment-589839699).  
[Make test to be sure of core functionality (like missing set in dictionary), maybe port 2D platform to Kotlin native](https://github.com/utopia-rise/godot-kotlin/issues/37).  
[Implement performance test](https://github.com/utopia-rise/godot-kotlin/issues/38).  
[Project setup](https://github.com/utopia-rise/godot-kotlin/pull/33).  

Later:
Change cast that is actually horrible with infix methods.

## Developer discussion

Ask questions and collaborate on Discord:
https://discord.gg/qSU2EQs

## Projects we use

Look into [**Projects we use**](./PROJECTS_WE_USE.md) section to see which projects we use internally.

## Authors

All authors are indicated in [*CONTRIBUTORS*](https://github.com/utopia-rise/godot-kotlin/graphs/contributors) section on **GitHub**.  
This repo is a successor of [**MrAkakuy's** kotlin bindings for godot](https://github.com/MrAkakuy/kotlin-godot-wrapper), who did a great work with his project. We really thank him, without him this project would not exist.

If you have any questions, issues or feature suggestions you can write an [*Issue* here](https://github.com/utopia-rise/godot-kotlin/issues/new/choose).

[License](./LICENSE)

## Other bindings
There is another binding being developed by raniejade at [raniejade/godot-kotlin](https://github.com/raniejade/godot-kotlin), please check it out!
