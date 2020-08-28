[![GitHub](https://img.shields.io/github/license/utopia-rise/godot-kotlin?style=flat-square)](LICENSE)
[![GitHub Workflow Status](https://img.shields.io/github/workflow/status/utopia-rise/godot-kotlin/CI?style=flat-square)](https://github.com/utopia-rise/godot-kotlin/actions?query=workflow%3ACI)

godot-kotlin is a Kotlin Native binding for the Godot game engine which allows you to write your game's logic in Kotlin.

If you are new to this binding, it is recommended to read through versioning section of this page, and the API differences 
section which describes main differences between Godot's in-house scripting language GDScript and this binding.  
Also, make sure you have read and understood the important notes section. For questions and further information, head over to [discord](https://godot-kotl.in).

## Versioning
The binding uses semantic versioning for its own versions but adds a suffix for the supported godot version:
  
`0.1.0-3.2`  
Binding Version: `0.1.0`  
Supported Godot Version: `3.2`

## Important notes

This version of the binding is currently in **Alpha** state and by no means production ready!  

This state will not change in the near foreseeable future. The Kotlin Native performance is not where it needs to be to make this binding efficient. Currently, the build times are incredibly slow due to the lack of incremental build support in Kotlin Native. Also, the runtime performance is much slower than GDScript in many cases.  
The only case where this binding shines at the moment is in computation heavy scenarios like implementing an A* pathfinding algorithm where not many calls through the cinterop layer of K/N are necessary. In all other cases were many calls are needed, like Input checking and small logic in function like `_process`, the performance is not great because of the current performance of the K/N cinterop layer.  
We were and are in touch with JB regarding those issues on youtrack and slack: [KT-40652](https://youtrack.jetbrains.com/issue/KT-40652) and [KT-40679](https://youtrack.jetbrains.com/issue/KT-40679)

To still be able to use kotlin in a performant way, we started another project [(godot-jvm)](https://github.com/utopia-rise/godot-jvm/) which leverages an embedded JVM to use kotlin on the JVM rather than native. On our first tests, this increases performance dramatically and one can leverage the full JVM ecosystem. Head over there to see development updates.  
This binding will not die though. We will provide bugfixes for existing bugs if necessary, keep it as up to date as our time allows us to do, but we will not improve tooling or add new features until the performance of K/N is more acceptable.