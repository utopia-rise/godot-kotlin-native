@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Object : GodotObject {
    constructor() : super("Object")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class ConnectFlags(val id: Long) {
        CONNECT_DEFERRED(1),
        CONNECT_PERSIST(2),
        CONNECT_ONESHOT(4),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
            const val SCRIPT_CHANGED: String = "script_changed"
        }
    }


    companion object {
        infix fun from(other: Variant): Object = fromVariant(Object(""), other)


        // Constants
        const val NOTIFICATION_POSTINITIALIZE: Long = 0
        const val NOTIFICATION_PREDELETE: Long = 1
        const val CONNECT_DEFERRED: Long = 1
        const val CONNECT_PERSIST: Long = 2
        const val CONNECT_ONESHOT: Long = 4


    }


    // Properties


    // Methods
    private val freeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Object", "free") }
    open fun free() {
        _icall_Unit(freeMethodBind, this.rawMemory)
    }


    open fun _notification(what: Long) {
    }


    open fun _set(property: String, value: Variant): Boolean {
        throw NotImplementedError("_set is not implemented for Object")
    }


    open fun _get(property: String): Variant {
        throw NotImplementedError("_get is not implemented for Object")
    }


    open fun _get_property_list(): GDArray {
        throw NotImplementedError("_get_property_list is not implemented for Object")
    }


    open fun _init() {
    }


    private val getClassMethodBind: CPointer<godot_method_bind> by lazy { getMB("Object", "get_class") }
    open fun getClass(): String {
        return _icall_String(getClassMethodBind, this.rawMemory)
    }


    private val isClassMethodBind: CPointer<godot_method_bind> by lazy { getMB("Object", "is_class") }
    open fun isClass(type: String): Boolean {
        return _icall_Boolean_String(isClassMethodBind, this.rawMemory, type)
    }


    private val setMethodBind: CPointer<godot_method_bind> by lazy { getMB("Object", "set") }
    open fun set(property: String, value: Variant) {
        _icall_Unit_String_Variant(setMethodBind, this.rawMemory, property, value)
    }


    private val getMethodBind: CPointer<godot_method_bind> by lazy { getMB("Object", "get") }
    open fun get(property: String): Variant {
        return _icall_Variant_String(getMethodBind, this.rawMemory, property)
    }


    private val setIndexedMethodBind: CPointer<godot_method_bind> by lazy { getMB("Object", "set_indexed") }
    open fun setIndexed(property: NodePath, value: Variant) {
        _icall_Unit_NodePath_Variant(setIndexedMethodBind, this.rawMemory, property, value)
    }


    private val getIndexedMethodBind: CPointer<godot_method_bind> by lazy { getMB("Object", "get_indexed") }
    open fun getIndexed(property: NodePath): Variant {
        return _icall_Variant_NodePath(getIndexedMethodBind, this.rawMemory, property)
    }


    private val getPropertyListMethodBind: CPointer<godot_method_bind> by lazy { getMB("Object", "get_property_list") }
    open fun getPropertyList(): GDArray {
        return _icall_GDArray(getPropertyListMethodBind, this.rawMemory)
    }


    private val getMethodListMethodBind: CPointer<godot_method_bind> by lazy { getMB("Object", "get_method_list") }
    open fun getMethodList(): GDArray {
        return _icall_GDArray(getMethodListMethodBind, this.rawMemory)
    }


    private val notificationMethodBind: CPointer<godot_method_bind> by lazy { getMB("Object", "notification") }
    open fun notification(what: Long, reversed: Boolean = false) {
        _icall_Unit_Long_Boolean(notificationMethodBind, this.rawMemory, what, reversed)
    }


    private val getInstanceIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("Object", "get_instance_id") }
    open fun getInstanceId(): Long {
        return _icall_Long(getInstanceIdMethodBind, this.rawMemory)
    }


    private val setScriptMethodBind: CPointer<godot_method_bind> by lazy { getMB("Object", "set_script") }
    open fun setScript(script: Reference) {
        _icall_Unit_Object(setScriptMethodBind, this.rawMemory, script)
    }


    private val getScriptMethodBind: CPointer<godot_method_bind> by lazy { getMB("Object", "get_script") }
    open fun getScript(): Reference {
        return _icall_Reference(getScriptMethodBind, this.rawMemory)
    }


    private val setMetaMethodBind: CPointer<godot_method_bind> by lazy { getMB("Object", "set_meta") }
    open fun setMeta(name: String, value: Variant) {
        _icall_Unit_String_Variant(setMetaMethodBind, this.rawMemory, name, value)
    }


    private val getMetaMethodBind: CPointer<godot_method_bind> by lazy { getMB("Object", "get_meta") }
    open fun getMeta(name: String): Variant {
        return _icall_Variant_String(getMetaMethodBind, this.rawMemory, name)
    }


    private val hasMetaMethodBind: CPointer<godot_method_bind> by lazy { getMB("Object", "has_meta") }
    open fun hasMeta(name: String): Boolean {
        return _icall_Boolean_String(hasMetaMethodBind, this.rawMemory, name)
    }


    private val getMetaListMethodBind: CPointer<godot_method_bind> by lazy { getMB("Object", "get_meta_list") }
    open fun getMetaList(): PoolStringArray {
        return _icall_PoolStringArray(getMetaListMethodBind, this.rawMemory)
    }


    private val addUserSignalMethodBind: CPointer<godot_method_bind> by lazy { getMB("Object", "add_user_signal") }
    open fun addUserSignal(signal: String, arguments: GDArray = GDArray()) {
        _icall_Unit_String_GDArray(addUserSignalMethodBind, this.rawMemory, signal, arguments)
    }


    private val hasUserSignalMethodBind: CPointer<godot_method_bind> by lazy { getMB("Object", "has_user_signal") }
    open fun hasUserSignal(signal: String): Boolean {
        return _icall_Boolean_String(hasUserSignalMethodBind, this.rawMemory, signal)
    }


    private val emitSignalMethodBind: CPointer<godot_method_bind> by lazy { getMB("Object", "emit_signal") }
    open fun emitSignal(signal: String, vararg __var_args: Any?): Variant {
        return _icall_varargs(emitSignalMethodBind, this.rawMemory, arrayOf(signal, *__var_args))
    }


    private val callMethodBind: CPointer<godot_method_bind> by lazy { getMB("Object", "call") }
    open fun call(method: String, vararg __var_args: Any?): Variant {
        return _icall_varargs(callMethodBind, this.rawMemory, arrayOf(method, *__var_args))
    }


    private val callDeferredMethodBind: CPointer<godot_method_bind> by lazy { getMB("Object", "call_deferred") }
    open fun callDeferred(method: String, vararg __var_args: Any?): Variant {
        return _icall_varargs(callDeferredMethodBind, this.rawMemory, arrayOf(method, *__var_args))
    }


    private val callvMethodBind: CPointer<godot_method_bind> by lazy { getMB("Object", "callv") }
    open fun callv(method: String, argArray: GDArray): Variant {
        return _icall_Variant_String_GDArray(callvMethodBind, this.rawMemory, method, argArray)
    }


    private val hasMethodMethodBind: CPointer<godot_method_bind> by lazy { getMB("Object", "has_method") }
    open fun hasMethod(method: String): Boolean {
        return _icall_Boolean_String(hasMethodMethodBind, this.rawMemory, method)
    }


    private val getSignalListMethodBind: CPointer<godot_method_bind> by lazy { getMB("Object", "get_signal_list") }
    open fun getSignalList(): GDArray {
        return _icall_GDArray(getSignalListMethodBind, this.rawMemory)
    }


    private val getSignalConnectionListMethodBind: CPointer<godot_method_bind> by lazy { getMB("Object", "get_signal_connection_list") }
    open fun getSignalConnectionList(signal: String): GDArray {
        return _icall_GDArray_String(getSignalConnectionListMethodBind, this.rawMemory, signal)
    }


    private val getIncomingConnectionsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Object", "get_incoming_connections") }
    open fun getIncomingConnections(): GDArray {
        return _icall_GDArray(getIncomingConnectionsMethodBind, this.rawMemory)
    }


    private val connectMethodBind: CPointer<godot_method_bind> by lazy { getMB("Object", "connect") }
    open fun connect(signal: String, target: Object, method: String, binds: GDArray = GDArray(), flags: Long = 0): GodotError {
        return GodotError.fromInt(_icall_Long_String_Object_String_GDArray_Long(connectMethodBind, this.rawMemory, signal, target, method, binds, flags))
    }


    private val disconnectMethodBind: CPointer<godot_method_bind> by lazy { getMB("Object", "disconnect") }
    open fun disconnect(signal: String, target: Object, method: String) {
        _icall_Unit_String_Object_String(disconnectMethodBind, this.rawMemory, signal, target, method)
    }


    private val isConnectedMethodBind: CPointer<godot_method_bind> by lazy { getMB("Object", "is_connected") }
    open fun isConnected(signal: String, target: Object, method: String): Boolean {
        return _icall_Boolean_String_Object_String(isConnectedMethodBind, this.rawMemory, signal, target, method)
    }


    private val setBlockSignalsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Object", "set_block_signals") }
    open fun setBlockSignals(enable: Boolean) {
        _icall_Unit_Boolean(setBlockSignalsMethodBind, this.rawMemory, enable)
    }


    private val isBlockingSignalsMethodBind: CPointer<godot_method_bind> by lazy { getMB("Object", "is_blocking_signals") }
    open fun isBlockingSignals(): Boolean {
        return _icall_Boolean(isBlockingSignalsMethodBind, this.rawMemory)
    }


    private val propertyListChangedNotifyMethodBind: CPointer<godot_method_bind> by lazy { getMB("Object", "property_list_changed_notify") }
    open fun propertyListChangedNotify() {
        _icall_Unit(propertyListChangedNotifyMethodBind, this.rawMemory)
    }


    private val setMessageTranslationMethodBind: CPointer<godot_method_bind> by lazy { getMB("Object", "set_message_translation") }
    open fun setMessageTranslation(enable: Boolean) {
        _icall_Unit_Boolean(setMessageTranslationMethodBind, this.rawMemory, enable)
    }


    private val canTranslateMessagesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Object", "can_translate_messages") }
    open fun canTranslateMessages(): Boolean {
        return _icall_Boolean(canTranslateMessagesMethodBind, this.rawMemory)
    }


    private val trMethodBind: CPointer<godot_method_bind> by lazy { getMB("Object", "tr") }
    open fun tr(message: String): String {
        return _icall_String_String(trMethodBind, this.rawMemory, message)
    }


    private val isQueuedForDeletionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Object", "is_queued_for_deletion") }
    open fun isQueuedForDeletion(): Boolean {
        return _icall_Boolean(isQueuedForDeletionMethodBind, this.rawMemory)
    }


}
