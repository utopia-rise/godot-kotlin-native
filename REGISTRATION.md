# Registering classes
To have access to Kotlin classes from Godot you have to register them. Kotlin wrapper has special utility to register classes. The only thing you have to do is to describe your classes structure in XML or JSON file.

* [Main object](#main-object)
* [Classes](#classes)
* [Methods](#methods)
* [Properties](#properties)
* [Signals](#signals)
* [Example](#example)
* [Configuration](#configuration)
* [What's next?](#whats-next)

# Main object
First of all you should specify the main object with the **Package** and the **RegisterClasses** fields.

* **Package**
    * **Type**: String
    * **Required**: No
    * **Description**: Subdirectory in Godot project directory where generated scripts (.gdns files) will be generated.
* **RegisterClasses**
    * **Type**: Array of objects (Class)
    * **Required**: Yes
    * **Description**: Classes for Godot

Now we can start describing our classes.

# Classes
Each class you describe must have the following fields:

* **Name**
    * **Type**: String 
    * **Required**: Yes
    * **Description**: Name of the class for Godot
* **Class**
    * **Type**: String
    * **Required**: Yes 
    * **Description**: Full name of the class (include package) in Kotlin\Native
* **Extends**
    * **Type**: String
    * **Required**: Yes
    * **Description**: Superclass of the class in Kotlin\Native
  
In addition to the name and superclass, you can describe the methods, properties and signals of the class. **These fields are optional.** If a method or property is called only on Kotlin side, then it is not necessary to register it.

* **Methods**
    * **Type**: Array of objects (method) 
    * **Required**: No 
    * **Description**: Methods that Godot should "see"
* **Properties**
    * **Type**: Array of objects (property)
    * **Required**: No
    * **Description**: Properties that Godot should "see". Also this properties are visible in Godot Editor
* **Signals**
    * **Type**: Array of objects (signal)
    * **Required**: No
    * **Description**: Signals that Godot should "see". Note: you cannot use signals that are not defined here. Godot **must** see your signals.

# Methods
The description of the methods (name, types of the arguments and return type) must completely match with the description of the methods in Kotlin

* **Name**
  * **Type**: String 
  * **Required**: Yes 
  * **Description**: Name of the method for Godot 
* **ReturnType**
  * **Type**: String
  * **Required**: Yes (if method does not return Unit)
  * **Description**: Return type of the method
* **Arguments**
  * **Type**: Array of strings
  * **Required**: Yes (if method has arguments)
  * **Description**: List of argument types 

Also here you can specify the RPC type of your method if your method is network aware.

* **RPC**
  * **Type**: String 
  * **Required**: No
  * **Description**: Type of the method for RPC. Available types:
    * Remote
    * Sync
    * Master
    * Slave
    * RemoteSync
    * MasterSync
    * SlaveSync
    * Disabled
  * **Default Value**: "Disabled"

# Properties
The description of the property (name and type) must completely match the description of the property in Kotlin.

* **Name**
  * **Type**: String 
  * **Required**: Yes
  * **Description**: Name of the property
* **Type**
  * **Type**: String
  * **Required**: Yes 
  * **Description**: Type of the property

**Important!** Default value specified here has a higher priority than in Kotlin code.

* **DefaultValue**
  * **Type**: String 
  * **Required**: Yes
  * **Description**: Default value of the property. If the property is not of a primitive type, then write a constructor call

Also here you can specify the RPC type of your property if your property is network aware.

* **RPC**
  * **Type**: String
  * **Required**: No
  * **Description**: Type of the method for RPC. Available types:
    * Remote
    * Sync
    * Master
    * Slave
    * RemoteSync
    * MasterSync
    * SlaveSync
    * Disabled
  * **Default Value**: "Disabled"

# Signals
Signals are the last thing that you can describe here. 

* **Name**
  * **Type**: String 
  * **Required**: Yes
  * **Description**: Name of the signal
* **Arguments**
  * **Type**: Array of objects (Signal argument) 
  * **Required**: No
  * **Description**: List of arguments
* **DefaultValues**
  * **Type**: Array of strings 
  * **Required**: No
  * **Description**: List of default values for arguments

Also it has an additional object for argument (Signal argument). 

* **Name**
  * **Type**: String 
  * **Required**: Yes
  * **Description**: Name of the signal argument for Godot
* **Arguments**
  * **Type**: String
  * **Required**: Yes
  * **Description**: Type of the signal argument for Godot

# Example

Example of `classes.json` file

```json
{
  "package": "Scripts",

  "registerClasses": [
    {
      "name": "MyClass",
      "class": "com.company.game.logic.MyClass",
      "extends": "Node",
      "methods": [
        {
          "name": "_ready",
          "arguments": []
        }
      ]
    }
  ]
}
```


# Configuration

At the end you should modify `build.gradle.kts` file's config closure:
```kotlin
configs {
    "src/main/kotlin/com/company/game/login/classes.json",
    "other class configs go here"
}
```

# What's next?

Now you can register your classes and then go to [Compiling](GETTING_STARTED.md#Compiling)