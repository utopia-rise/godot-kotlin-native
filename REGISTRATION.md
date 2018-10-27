# Registering classes

## Main object

Parameteres: Package, RegisterClasses

* Package
    * Type: String
    * Reqiured: No
    * Description: Path for output Godot NativeSctipt files (.gdns)

* RegisterClasses
    * Type: Array of objects (Class)
    * Reqiured: Yes
    * Description: Classes for Godot


## Class object
Parameteres: Name, Class, Extends, Methods, Properties, Signals

* Name
    * Type: String 
    * Reqiured: Yes
    * Description: Name of the class for Godot
* Class
    * Type: String
    * Reqiured: Yes 
    * Description: Full name of the class (include package) in Kotlin\Native

* Extends
    * Type: String
    * Reqiured: Yes
    * Description: Superclass of the class in Kotlin\Native
* Methods
    * Type: Array of objects (method) 
    * Reqiured: No 
    * Description: Methods that Godot should "see"
* Properties
    * Type: Array of objects (property)
    * Reqiured: No
    * Description: Properties that Godot should "see". Also this properties visible in Godot Editor
* Signals
    * Type: Array of objects (signal)
    * Reqiured: No
    * Description: Signals that Godot should "see" 

## Method object

Parameteres: Name, ReturnType Arguments, RPC

* Name
  * Type: String 
  * Reqiured: Yes 
  * Description: Name of the method for Godot 

* ReturnType
  * Type: String
  * Reqiured: Yes (if method return not Unit)
  * Description: Return type of the method

* Arguments
  * Type: Array of strings
  * Reqiured: Yes (if method have arguments)
  * Description: List of argument types 

* RPC
  * Type: String 
  * Reqiured: No
  * Description: Type of the method for RPC. Available types:
    * Remote
    * Sync
    * Master
    * Slave
    * RemoteSync
    * MasterSync
    * SlaveSync
    * Disabled

## Property object

Parameteres: Name, Type, DefaultValue, RPC

* Name
  * Type: String 
  * Reqiured: Yes
  * Description: Name of the property for Godot 

* Type
  * Type: String
  * Reqiured: Yes 
  * Description: Type of the property

* DefaultValue
  * Type: String 
  * Reqiured: Yes
  * Description: Default value of the property. If the property is not of a primitive type, then write a constructor call

* RPC
  * Type: String
  * Reqiured: No
  * Description: Type of the method for RPC. Available types:
    * Remote
    * Sync
    * Master
    * Slave
    * RemoteSync
    * MasterSync
    * SlaveSync
    * Disabled

## Signal object

Parameteres: Name, Arguments, DefaultValues

* Name
  * Type: String 
  * Reqiured: Yes
  * Description: Name of the signal for Godot

* Arguments
  * Type: Array of objects (SignalArgument) 
  * Reqiured: No
  * Description: List of arguments

* DefaultValues
  * Type: Array of strings 
  * Reqiured: No
  * Description: List of default values for arguments

## Signal Argument object

Parameteres: Name, Type

* Name
  * Type: String 
  * Reqiured: Yes
  * Description: Name of the signal argument for Godot

* Arguments
  * Type: String
  * Reqiured: Yes
  * Description: Type of the signal argument for Godot 
