# Registering classes
To have access to Kotlin classes from Godot you have to register them. In order to do that you have to annotate the classes, functions, properties and signals.

* [Classes](#classes)
* [Functions](#functions)
* [Properties](#properties)
* [RPC Annotations](#rpc-annotations)
* [Signals](#signals)
    * [The Godot way](#the-godot-way)
    * [The more typesafe way](#the-more-typesafe-way)
* [Summary](#summary)
* [What's next?](#whats-next)

# Classes
Each class you want Godot to know about you have to annotate with `@RegisterClass`.

The annotation processing will register this class in godot and generates a script definition file (`gdns`) so you can use the class like a GDScript class within the editor.  
Per default those files are generated in a folder called `scripts`.  
So the path for `org.godotengine.samples.pong.Ball` would be `<projectfolder>/scripts/org/godotengine/samples/pong/Ball.gdns`.  
For certain project's this could be cumbersome, or you just want to define the path on your own. So you can pass a String parameter to the annotation to define a custom path, starting from the project root:  
`@RegisterClass("very/cool/scripts")"` would yield to `<projectroot>/very/cool/scripts/ClassName.gdns`

Default Example:  
**Class:**
```kotlin
package godot.samples.games.pong

@RegisterClass
class Ball: KinematicBody2D() {
}
```
**Path:** `<projectroot>/godot/samples/games/pong/Ball.gdns`

Custom Example:  
**Class:**
```kotlin
package godot.samples.games.pong

@RegisterClass("Games/Pong/Scripts")
class Ball: KinematicBody2D() {
}
```
**Path:** `<projectroot>/Games/Pong/Scripts/Ball.gdns`


# Functions
Functions you want to register in Godot have to be annotated with `@RegisterFunction`.  
The class containing this function has to be annotated with `@RegisterClass`!  
The annotation takes the following arguments:  

| argument name   | type         | required | description |
| --------------- | ------------ | -------- | ----------- |
| rpcMode         | RPCMode      | no       | defines how/and if this function can be called over the network. The same functionality can be achieved with the corresponding RpcMode annotations (read below) 

Example:
```kotlin
@RegisterFunction
override fun _ready() {
}
```

```kotlin
@RegisterFunction(RPCMode.Remote)
fun clientReady() {
}
```

If no RpcMode is provided, it defaults to `RPCMode.Disabled`.

# Properties
Properties you want to register in Godot have to be annotated with `@RegisterProperty`.  
The class containing this property has to be annotated with `@RegisterClass`!  
The annotation takes the following arguments:  

| argument name   | type         | required | description |
| --------------- | ------------ | -------- | ----------- |
| visibleInEditor | Boolean      | yes      | defines whether the property is visible in the editor or not
| defaultValue    | String       | yes      | defines the default value of the property. Note: A string has to be defined with escaped `"`. See the examples. Note: the default value has a higher priority than the one defined in the script! Godot will override the value defined in script with the value defined in the annotation on initialization! 
| rpcMode         | RPCMode      | no       | defines how/and if this property can be set over the network. The same functionality can be achieved with the corresponding RpcMode annotations (read below)
| propertyHint    | PropertyHint | no       | you can provide a property hint for the editor (so you have a texture picker for example)
| hintString      | String       | no       | you can provide a hint string in addition to the propertyHint. See the [Godot documentation](https://docs.godotengine.org/en/3.2/getting_started/scripting/gdscript/gdscript_exports.html) on how they should be formatted.

Examples:  
**Property exported, visible in the editor, with default value 300:**
```kotlin
@RegisterProperty(true, "300")
var xVel = 300
```

**Property exported, visible in the editor, with default string value "aStringValue":**
```kotlin
@RegisterProperty(true, "\"aStringValue\"")
var xVel = "someString"
```

**Property exported, not visible in the editor, with default instance of class:**
```kotlin
@RegisterProperty(false, "fully.qualified.AClassWithDefaultConstructor()")
lateinit var aClassInstance: AClassWithDefaultConstructor
```

**Property exported, not visible in the editor, with default value 300, rpcMode RemoteSync:**
```kotlin
@RegisterProperty(false, "300", RPCMode.RemoteSync)
var xVel = 300
```

**Property exported, visible in the editor, with default value 300, rpcMode Disabled, typeHint Range, with hintString:**
```kotlin
@RegisterProperty(false, "300", propertyHint = PropertyHint.Range, hintString = "0,100000,1000,or_greater")
var xVel = 300
```

# Rpc Annotations
Functions and properties annotations can take an RPCMode enum to describe their network capabilities.   
However, you might prefer describing it as an annotation. The following annotations are provided to do the same:  
- `@Disabled`
- `@Remote`
- `@Sync`
- `@Master`
- `@Puppet`
- `@RemoteSync`
- `@MasterSync`
- `@PuppetSync`

Example:  
**Property exported, not visible in the editor, with default value 300, rpcMode RemoteSync:**
```kotlin
@RemoteSync
@RegisterProperty(false, "300")
var xVel = 300
```

```kotlin
@Remote
@RegisterFunction
fun clientReady() {
}
```

# Signals
This wrapper provides a simple way of registering signals and optionally (which we recommend) a more typesafe way of defining Signals.  
The class containing this signal has to be annotated with `@RegisterClass`!  

## The Godot Way
### Signal description:
A signal is defined by an empty function annotated with `@RegisterSignal`:
```kotlin
@RegisterSignal
fun startGame() {}
```

### Emiting signals:
You can emit signals like in GDScript:
```kotlin
instanceOfClass.emitSignal("startGame")
```

### Connecting Signals:
Also like in GDScript you can connect signals by method name as string:
```kotlin
instanceOfClass.connect("startGame", this, "gameStarted")
```

### Default arguments:
You can also provide default arguments for signals in the annotation. But note: the number of default arguments must match the number of arguments the signals function has:
```kotlin
@RegisterSignal("\"asStringArgument\"", "1", "fully.qualified.InstanceOfClass()")
fun startGame(aStringArgument: String, anIntegerArgument: Int, aClassInstance: InstanceOfClass) {}
```

## The more typesafe way:
We strongly recommend using signals this way, as it provides more safety against typo's, more typesafety and better refactoring support.

### Signal description:
Signals are defined inside their corresponding class as interface functions:
```kotlin
interface Signal {
    @RegisterSignal
    fun startGame() {}
}
```

### Emiting signals:
Safe:
```kotlin
instanceOfClass.emitSignal(ClassName.Signal::startGame.name)
```

### Connecting signals:
Safe:
```kotlin
instanceOfClass.connect(ClassName.Signal::startGame.name, this, this::gameStarted.name)
```

### Default arguments
You can also provide default arguments for signals in the annotation. But note: the number of default arguments must match the number of arguments the signals function has:
```kotlin
@RegisterClass
class EmitingClass {
    interface Signal {
        @RegisterSignal("\"asStringArgument\"", "1", "fully.qualified.InstanceOfClass()")
        fun startGame(aStringArgument: String, anIntegerArgument: Int, aClassInstance: InstanceOfClass) {}
    }
}
```
If you implement above example you might see why we recommend this way of using signals:
```kotlin
@RegisterClass
class ListeningClass: EmitingClass.Signal { // <- Note the interface implementation
    @RegisterFunction
    override fun _ready() {
        anInstanceFromSomwhere.connect(EmittingClass.Signal::startGame.name, this, this::startGame.name)
    }

    @RegisterFunction
    override fun startGame(aStringArgument: String, anIntegerArgument: Int, aClassInstance: InstanceOfClass) {
        //here you have full typesafety and you are always sure that this function expects exactly the arguments you are emitting in the other class
    }
}
```

# Summary

**@RegisterClass**

| argument name   | type         | required | description |
| --------------- | ------------ | -------- | ----------- |
| outputDir       | String       | no       | alternative output directory for gdns files
<br>

**@RegisterFunction**

| argument name   | type         | required | description |
| --------------- | ------------ | -------- | ----------- |
| rpcMode         | RPCMode      | no       | defines how/and if this function can be called over the network. The same functionality can be achieved with the corresponding RpcMode annotations (read below)
<br>

**@RegisterProperty**

| argument name   | type         | required | description |
| --------------- | ------------ | -------- | ----------- |
| visibleInEditor | Boolean      | yes      | defines whether the property is visible in the editor or not
| defaultValue    | String       | yes      | defines the default value of the property. Note: A string has to be defined with escaped `"`. See the examples. Note: the default value has a higher priority than the one defined in the script! Godot will override the value defined in script with the value defined in the annotation on initialization! 
| rpcMode         | RPCMode      | no       | defines how/and if this property can be set over the network. The same functionality can be achieved with the corresponding RpcMode annotations (read below)
| propertyHint    | PropertyHint | no       | you can provide a property hint for the editor (so you have a texture picker for example)
| hintString      | String       | no       | you can provide a hint string in addition to the propertyHint. See the [Godot documentation](https://docs.godotengine.org/en/3.2/getting_started/scripting/gdscript/gdscript_exports.html) on how they should be formatted.
<br>

**@RegisterSignal**

| argument name   | type         | required | description |
| --------------- | ------------ | -------- | ----------- |
| defaultValues   | vararg String| no       | default arguments which godot provides when the signal is emited with less arguments. Number of default arguments has to match arguments of signal function!
<br>

**RPC Annotations:**  
**@Disabled**  
**@Remote**  
**@Sync**  
**@Master**  
**@Puppet**  
**@RemoteSync**  
**@MasterSync**  
**@PuppetSync**  

# What's next?

Now you can register your classes and then go to [Compiling](GETTING_STARTED.md#Compiling)