![Kotlin GDNative Logo](https://imgur.com/dSL1Vch.png)

# Kotlin/Native wrapper for the Godot Game Engine

## Overview

This is a **Kotlin** language wrapper for the [**Godot**](https://godotengine.org/) game engine. It uses the [**GDNative**](https://godotengine.org/article/dlscript-here) utility to interact with **Godot**'s core api's. The wrapper provides you Godot API's as Kotlin classes, so you can write your game logic completely in Kotlin. It will be compiled into a dynamic library using [*Kotlin/Native*](https://kotlinlang.org/docs/reference/native-overview.html). It contains GDNative bindings which allows Godot core and Kotlin code interact with each other.
You don't have to worry about any binding logic. Just write your game scripts like you would for [GDScript](https://docs.godotengine.org/en/3.1/getting_started/scripting/gdscript/gdscript_basics.html) or [C#](https://docs.godotengine.org/en/3.1/getting_started/scripting/c_sharp/).

CI status: [![Build Status](https://travis-ci.com/utopia-rise/godot-kotlin.svg?branch=master)](https://travis-ci.com/utopia-rise/godot-kotlin)

## Getting started

Look into [**Getting started**](./GETTING_STARTED.md) section to get more information.

## API differences from GDScript

Look into [**API differences from GDScript**](./API_DIFFERENCES.md) section to get more information.

## Registering classes

Look into [**Registration**](./REGISTRATION.md) section to get more information.

## Compiling from sources

Look into [**Compiling from source**](COMPILING_FROM_SOURCE.md) section to get more information.

## Roadmap

### 0.1.0-3.2 beta version:
[Annotation processing (basic) (to be tested if fast enough)](https://github.com/utopia-rise/godot-kotlin/issues/2).  
[Debug sample coroutines](https://github.com/utopia-rise/godot-kotlin/issues/36).

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
