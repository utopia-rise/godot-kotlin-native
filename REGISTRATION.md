# Registering classes

To have access to Kotlin classes from Godot you have to register it. Kotlin wrapper has special utility to register classes. Only thing you have to do is to describe your classes structure in XML or JSON file.  
# Main object

First at all you should specify main object with **Package** and **RegisterClasses** fields.

* **Package**
    * **Type**: String
    * **Reqiured**: No
    * **Description**: Subdirectory in Godot project directory where generated scripts (.gdns files) will be stored.
* **RegisterClasses**
    * **Type**: Array of objects (Class)
    * **Reqiured**: Yes
    * **Description**: Classes for Godot

Now we can start describe our classes.

# Classes

Each class you describe must have the following fields:

* **Name**
    * **Type**: String 
    * **Reqiured**: Yes
    * **Description**: Name of the class for Godot
* **Class**
    * **Type**: String
    * **Reqiured**: Yes 
    * **Description**: Full name of the class (include package) in Kotlin\Native
* **Extends**
    * **Type**: String
    * **Reqiured**: Yes
    * **Description**: Superclass of the class in Kotlin\Native
  
In addition to the name and superclass, you can describe the methods, properties and signals of the class. **These fields are optional.** If a method or property is called only on Kotlin side, then it is not necessary to register it.

* **Methods**
    * **Type**: Array of objects (method) 
    * **Reqiured**: No 
    * **Description**: Methods that Godot should "see"
* **Properties**
    * **Type**: Array of objects (property)
    * **Reqiured**: No
    * **Description**: Properties that Godot should "see". Also this properties visible in Godot Editor
* **Signals**
    * **Type**: Array of objects (signal)
    * **Reqiured**: No
    * **Description**: Signals that Godot should "see" 

# Methods

The description of the methods (name, types of the arguments and return type) must completely coincide with the description of the methods in Kotlin

* **Name**
  * **Type**: String 
  * **Reqiured**: Yes 
  * **Description**: Name of the method for Godot 
* **ReturnType**
  * **Type**: String
  * **Reqiured**: Yes (if method return not Unit)
  * **Description**: Return type of the method
* **Arguments**
  * **Type**: Array of strings
  * **Reqiured**: Yes (if method have arguments)
  * **Description**: List of argument types 

Also here you can specify the RPC type of your method.

* **RPC**
  * **Type**: String 
  * **Reqiured**: No
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

The description of the property (name and type) must completely coincide with the description of the property in Kotlin

* **Name**
  * **Type**: String 
  * **Reqiured**: Yes
  * **Description**: Name of the property for Godot 
* **Type**
  * **Type**: String
  * **Reqiured**: Yes 
  * **Description**: Type of the property

**Important!** Default value specified here has a higher priority than in Kotlin code.

* **DefaultValue**
  * **Type**: String 
  * **Reqiured**: Yes
  * **Description**: Default value of the property. If the property is not of a primitive type, then write a constructor call

Also here you can specify the RPC type of your property.

* **RPC**
  * **Type**: String
  * **Reqiured**: No
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

Signals is the last thing that you can describe here. 

* **Name**
  * **Type**: String 
  * **Reqiured**: Yes
  * **Description**: Name of the signal for Godot
* **Arguments**
  * **Type**: Array of objects (Signal argument) 
  * **Reqiured**: No
  * **Description**: List of arguments
* **DefaultValues**
  * **Type**: Array of strings 
  * **Reqiured**: No
  * **Description**: List of default values for arguments

Also it has an additional object for argument (Signal argument). 

* **Name**
  * **Type**: String 
  * **Reqiured**: Yes
  * **Description**: Name of the signal argument for Godot
* **Arguments**
  * **Type**: String
  * **Reqiured**: Yes
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

At the end you should modify **build.gradle** file:
```groovy
kotlin {
    targets {
        fromPreset(presets.godotMingwX64, 'windows') {
            compilations.all {
                buildTypes = [DEBUG]
            }
        }
    }
    sourceSets {
        configureGodot(windowsMain) {
            sourceSet {
                kotlin.srcDirs 'src/main/kotlin'
            }

            libraryPath 'libraryname.gdnlib'
            generateGDNS '../project'
            
            configs 'src/main/kotlin/com/company/game/login/classes.json'
        }
    }
}
```
Added options in ***configureGodot*** closure is

* **libraryPath**: full path to GDNativeLibrary file in Godot project path. Look at Godot WIKI how to create it.
* **generateGDNS**: path to Godot project directory (relative or absolute). 
* **configs**: list of pathes to configs file.

# What's next?

Now you can register your classes and then go to  [Compiling](GETTING_STARTED.md#Compiling)