![Kotlin GDNative Logo](docs/src/doc/assets/img/logo.png)

# Kotlin/Native binding for the Godot Game Engine

## Overview

This is a **Kotlin** language binding for the [**Godot**](https://godotengine.org/) game engine. It uses [**GDNative**](https://godotengine.org/article/dlscript-here) to interact with **Godot**'s core api's. The binding provides you Godot API's as Kotlin classes, so you can write your game logic completely in Kotlin. It will be compiled into a dynamic library using [*Kotlin/Native*](https://kotlinlang.org/docs/reference/native-overview.html).
You don't have to worry about any binding logic. Just write your game scripts like you would for [GDScript](https://docs.godotengine.org/en/3.1/getting_started/scripting/gdscript/gdscript_basics.html) or [C#](https://docs.godotengine.org/en/3.1/getting_started/scripting/c_sharp/) but with all the syntactic sugar of kotlin.

[![GitHub](https://img.shields.io/github/license/utopia-rise/godot-kotlin?style=flat-square)](LICENSE)
[![GitHub Workflow Status](https://img.shields.io/github/workflow/status/utopia-rise/godot-kotlin/CI?style=flat-square)](https://github.com/utopia-rise/godot-kotlin/actions?query=workflow%3ACI)

## Important notes

This version of the binding is currently in **Alpha** state and by no means production ready!  

This state will not change in the near foreseeable future. The Kotlin Native performance is not where it needs to be to make this binding efficient. Currently, the build times are incredibly slow due to the lack of incremental build support in Kotlin Native. Also, the runtime performance is much slower than GDScript in many cases.  
The only case where this binding shines at the moment is in computation heavy scenarios like implementing an A* pathfinding algorithm where not many calls through the cinterop layer of K/N are necessary. In all other cases were many calls are needed, like Input checking and small logic in function like `_process`, the performance is not great because of the current performance of the K/N cinterop layer.  
We were and are in touch with JB regarding those issues on youtrack and slack: [KT-40652](https://youtrack.jetbrains.com/issue/KT-40652) and [KT-40679](https://youtrack.jetbrains.com/issue/KT-40679)

To still be able to use kotlin in a performant way, we started another project [(godot-jvm)](https://github.com/utopia-rise/godot-jvm/) which leverages an embedded JVM to use kotlin on the JVM rather than native. On our first tests, this increases performance dramatically and one can leverage the full JVM ecosystem. Head over there to see development updates.  
This binding will not die though. We will provide bugfixes for existing bugs if necessary, keep it as up to date as our time allows us to do, but we will not improve tooling or add new features until the performance of K/N is more acceptable.

## Documentation

One can find the documentation for this binding [here](https://godot-kotl.in).

## Developer discussion

Ask questions and collaborate on Discord:
https://discord.gg/qSU2EQs

## Setting up IntelliJ IDEA for local builds or contribution
1. Add `godot.kotlin.dev` to `~/.gradle/gradle.properties` (on Windows you might need to stop any Gradle daemons running for this property to be picked up)
2. Run the initial build: `./gradlew publishToMavenLocal`  (this will take a while)
3. In IntelliJ IDEA, import the root `build.gradle.kts`.
4. After importing the main binding, in the Gradle sidebar in IntelliJ IDEA, import the `build.gradle.kts` of the sample you want to import. (repeat for every sample you want to develop)

## Contribution Guidelines:
- **CodeStyle:**  
We enforce the code style to match the official kotlin [coding conventions](https://kotlinlang.org/docs/reference/coding-conventions.html). Read there on how to set those up for your IDE.  
We will enforce this later on through CI and linting.  
- **Branching:**  
We do branching like described in `git-flow`.

Each Issue has a Maintainer that is the "supervisor" for the general topic the issue belongs to. Discuss implementation details with this maintainer.