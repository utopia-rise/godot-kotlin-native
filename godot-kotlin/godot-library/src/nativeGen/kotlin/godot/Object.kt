// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.core.Godot.shouldInitPtr
import godot.core.GodotError
import godot.core.NodePath
import godot.core.PoolStringArray
import godot.core.Signal0
import godot.core.Signal1
import godot.core.Signal10
import godot.core.Signal2
import godot.core.Signal3
import godot.core.Signal4
import godot.core.Signal5
import godot.core.Signal6
import godot.core.Signal7
import godot.core.Signal8
import godot.core.Signal9
import godot.core.Variant
import godot.core.VariantArray
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Boolean_String
import godot.icalls._icall_Boolean_String_Object_String
import godot.icalls._icall_Long
import godot.icalls._icall_Long_String_Object_String_VariantArray_Long
import godot.icalls._icall_PoolStringArray
import godot.icalls._icall_Reference
import godot.icalls._icall_String
import godot.icalls._icall_String_String
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long_Boolean
import godot.icalls._icall_Unit_NodePath_Variant
import godot.icalls._icall_Unit_Object
import godot.icalls._icall_Unit_String
import godot.icalls._icall_Unit_String_Object_String
import godot.icalls._icall_Unit_String_Variant
import godot.icalls._icall_Unit_String_VariantArray
import godot.icalls._icall_VariantArray
import godot.icalls._icall_VariantArray_String
import godot.icalls._icall_Variant_NodePath
import godot.icalls._icall_Variant_String
import godot.icalls._icall_Variant_String_VariantArray
import godot.icalls._icall_varargs
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.COpaquePointer

open class Object internal constructor(
  _ignore: Any?
) {
  internal lateinit var ptr: COpaquePointer

  val scriptChanged: Signal0 by signal()

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("Object", "Object")
        }

  }

  open fun _onInit() {
  }

  open fun _onDestroy() {
  }

  fun Signal0.emit() {
    emit(this@Object)
  }

  inline fun <reified K : () -> Unit> Signal0.connect(
    target: Object,
    method: K,
    binds: VariantArray? = null,
    flags: Long = 0
  ) {
    val methodName = (method as KCallable<Unit>).name
    connect(this@Object, target, methodName, binds, flags)
  }

  fun <A0> Signal1<A0>.emit(a0: A0) {
    emit(this@Object, a0)
  }

  inline fun <A0, reified K : (A0) -> Unit> Signal1<A0>.connect(
    target: Object,
    method: K,
    binds: VariantArray? = null,
    flags: Long = 0
  ) {
    val methodName = (method as KCallable<Unit>).name
    connect(this@Object, target, methodName, binds, flags)
  }

  fun <A0, A1> Signal2<A0, A1>.emit(a0: A0, a1: A1) {
    emit(this@Object, a0, a1)
  }

  inline fun <A0, A1, reified K : (A0, A1) -> Unit> Signal2<A0, A1>.connect(
    target: Object,
    method: K,
    binds: VariantArray? = null,
    flags: Long = 0
  ) {
    val methodName = (method as KCallable<Unit>).name
    connect(this@Object, target, methodName, binds, flags)
  }

  fun <A0, A1, A2> Signal3<A0, A1, A2>.emit(
    a0: A0,
    a1: A1,
    a2: A2
  ) {
    emit(this@Object, a0, a1, a2)
  }

  inline fun <A0, A1, A2, reified K : (
    A0,
    A1,
    A2
  ) -> Unit> Signal3<A0, A1, A2>.connect(
    target: Object,
    method: K,
    binds: VariantArray? = null,
    flags: Long = 0
  ) {
    val methodName = (method as KCallable<Unit>).name
    connect(this@Object, target, methodName, binds, flags)
  }

  fun <A0, A1, A2, A3> Signal4<A0, A1, A2, A3>.emit(
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3
  ) {
    emit(this@Object, a0, a1, a2, a3)
  }

  inline fun <A0, A1, A2, A3, reified K : (
    A0,
    A1,
    A2,
    A3
  ) -> Unit> Signal4<A0, A1, A2, A3>.connect(
    target: Object,
    method: K,
    binds: VariantArray? = null,
    flags: Long = 0
  ) {
    val methodName = (method as KCallable<Unit>).name
    connect(this@Object, target, methodName, binds, flags)
  }

  fun <A0, A1, A2, A3, A4> Signal5<A0, A1, A2, A3, A4>.emit(
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3,
    a4: A4
  ) {
    emit(this@Object, a0, a1, a2, a3, a4)
  }

  inline fun <A0, A1, A2, A3, A4, reified K : (
    A0,
    A1,
    A2,
    A3,
    A4
  ) -> Unit> Signal5<A0, A1, A2, A3, A4>.connect(
    target: Object,
    method: K,
    binds: VariantArray? = null,
    flags: Long = 0
  ) {
    val methodName = (method as KCallable<Unit>).name
    connect(this@Object, target, methodName, binds, flags)
  }

  fun <A0, A1, A2, A3, A4, A5> Signal6<A0, A1, A2, A3, A4, A5>.emit(
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3,
    a4: A4,
    a5: A5
  ) {
    emit(this@Object, a0, a1, a2, a3, a4, a5)
  }

  inline fun <A0, A1, A2, A3, A4, A5, reified K : (
    A0,
    A1,
    A2,
    A3,
    A4,
    A5
  ) -> Unit> Signal6<A0, A1, A2, A3, A4, A5>.connect(
    target: Object,
    method: K,
    binds: VariantArray? = null,
    flags: Long = 0
  ) {
    val methodName = (method as KCallable<Unit>).name
    connect(this@Object, target, methodName, binds, flags)
  }

  fun <A0, A1, A2, A3, A4, A5, A6> Signal7<A0, A1, A2, A3, A4, A5, A6>.emit(
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3,
    a4: A4,
    a5: A5,
    a6: A6
  ) {
    emit(this@Object, a0, a1, a2, a3, a4, a5, a6)
  }

  inline fun <A0, A1, A2, A3, A4, A5, A6, reified K : (
    A0,
    A1,
    A2,
    A3,
    A4,
    A5,
    A6
  ) -> Unit> Signal7<A0, A1, A2, A3, A4, A5, A6>.connect(
    target: Object,
    method: K,
    binds: VariantArray? = null,
    flags: Long = 0
  ) {
    val methodName = (method as KCallable<Unit>).name
    connect(this@Object, target, methodName, binds, flags)
  }

  fun <A0, A1, A2, A3, A4, A5, A6, A7> Signal8<A0, A1, A2, A3, A4, A5, A6, A7>.emit(
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3,
    a4: A4,
    a5: A5,
    a6: A6,
    a7: A7
  ) {
    emit(this@Object, a0, a1, a2, a3, a4, a5, a6, a7)
  }

  inline fun <A0, A1, A2, A3, A4, A5, A6, A7, reified K : (
    A0,
    A1,
    A2,
    A3,
    A4,
    A5,
    A6,
    A7
  ) -> Unit> Signal8<A0, A1, A2, A3, A4, A5, A6, A7>.connect(
    target: Object,
    method: K,
    binds: VariantArray? = null,
    flags: Long = 0
  ) {
    val methodName = (method as KCallable<Unit>).name
    connect(this@Object, target, methodName, binds, flags)
  }

  fun <A0, A1, A2, A3, A4, A5, A6, A7, A8> Signal9<A0, A1, A2, A3, A4, A5, A6, A7, A8>.emit(
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3,
    a4: A4,
    a5: A5,
    a6: A6,
    a7: A7,
    a8: A8
  ) {
    emit(this@Object, a0, a1, a2, a3, a4, a5, a6, a7, a8)
  }

  inline fun <A0, A1, A2, A3, A4, A5, A6, A7, A8, reified K : (
    A0,
    A1,
    A2,
    A3,
    A4,
    A5,
    A6,
    A7,
    A8
  ) -> Unit> Signal9<A0, A1, A2, A3, A4, A5, A6, A7, A8>.connect(
    target: Object,
    method: K,
    binds: VariantArray? = null,
    flags: Long = 0
  ) {
    val methodName = (method as KCallable<Unit>).name
    connect(this@Object, target, methodName, binds, flags)
  }

  fun <A0, A1, A2, A3, A4, A5, A6, A7, A8, A9> Signal10<A0, A1, A2, A3, A4, A5, A6, A7, A8,
      A9>.emit(
    a0: A0,
    a1: A1,
    a2: A2,
    a3: A3,
    a4: A4,
    a5: A5,
    a6: A6,
    a7: A7,
    a8: A8,
    a9: A9
  ) {
    emit(this@Object, a0, a1, a2, a3, a4, a5, a6, a7, a8, a9)
  }

  inline fun <A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, reified K : (
    A0,
    A1,
    A2,
    A3,
    A4,
    A5,
    A6,
    A7,
    A8,
    A9
  ) -> Unit> Signal10<A0, A1, A2, A3, A4, A5, A6, A7, A8, A9>.connect(
    target: Object,
    method: K,
    binds: VariantArray? = null,
    flags: Long = 0
  ) {
    val methodName = (method as KCallable<Unit>).name
    connect(this@Object, target, methodName, binds, flags)
  }

  fun toVariant(): Variant = Variant(this)

  open fun _get(property: String): Variant {
    throw NotImplementedError("_get is not implemented for Object")
  }

  open fun _getPropertyList(): VariantArray {
    throw NotImplementedError("_get_property_list is not implemented for Object")
  }

  open fun _init() {
  }

  open fun _notification(what: Long) {
  }

  open fun _set(property: String, value: Variant): Boolean {
    throw NotImplementedError("_set is not implemented for Object")
  }

  open fun _toString(): String {
    throw NotImplementedError("_to_string is not implemented for Object")
  }

  open fun addUserSignal(signal: String, arguments: VariantArray = VariantArray()) {
    val mb = getMethodBind("Object","add_user_signal")
    _icall_Unit_String_VariantArray( mb, this.ptr, signal, arguments)
  }

  open fun call(method: String, vararg __var_args: Any?): Variant {
    val mb = getMethodBind("Object","call")
    return _icall_varargs( mb, this.ptr, arrayOf(method, *__var_args))
  }

  open fun callDeferred(method: String, vararg __var_args: Any?) {
    val mb = getMethodBind("Object","call_deferred")
    _icall_varargs( mb, this.ptr, arrayOf(method, *__var_args))
  }

  open fun callv(method: String, argArray: VariantArray): Variant {
    val mb = getMethodBind("Object","callv")
    return _icall_Variant_String_VariantArray( mb, this.ptr, method, argArray)
  }

  open fun canTranslateMessages(): Boolean {
    val mb = getMethodBind("Object","can_translate_messages")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun connect(
    signal: String,
    target: Object,
    method: String,
    binds: VariantArray = VariantArray(),
    flags: Long = 0
  ): GodotError {
    val mb = getMethodBind("Object","connect")
    return GodotError.byValue( _icall_Long_String_Object_String_VariantArray_Long( mb, this.ptr,
        signal, target, method, binds, flags).toUInt())
  }

  open fun disconnect(
    signal: String,
    target: Object,
    method: String
  ) {
    val mb = getMethodBind("Object","disconnect")
    _icall_Unit_String_Object_String( mb, this.ptr, signal, target, method)
  }

  open fun emitSignal(signal: String, vararg __var_args: Any?) {
    val mb = getMethodBind("Object","emit_signal")
    _icall_varargs( mb, this.ptr, arrayOf(signal, *__var_args))
  }

  open fun free() {
    val mb = getMethodBind("Object","free")
    _icall_Unit( mb, this.ptr)
  }

  open fun get(property: String): Variant {
    val mb = getMethodBind("Object","get")
    return _icall_Variant_String( mb, this.ptr, property)
  }

  open fun getClass(): String {
    val mb = getMethodBind("Object","get_class")
    return _icall_String( mb, this.ptr)
  }

  open fun getIncomingConnections(): VariantArray {
    val mb = getMethodBind("Object","get_incoming_connections")
    return _icall_VariantArray( mb, this.ptr)
  }

  open fun getIndexed(property: NodePath): Variant {
    val mb = getMethodBind("Object","get_indexed")
    return _icall_Variant_NodePath( mb, this.ptr, property)
  }

  open fun getInstanceId(): Long {
    val mb = getMethodBind("Object","get_instance_id")
    return _icall_Long( mb, this.ptr)
  }

  open fun getMeta(name: String): Variant {
    val mb = getMethodBind("Object","get_meta")
    return _icall_Variant_String( mb, this.ptr, name)
  }

  open fun getMetaList(): PoolStringArray {
    val mb = getMethodBind("Object","get_meta_list")
    return _icall_PoolStringArray( mb, this.ptr)
  }

  open fun getMethodList(): VariantArray {
    val mb = getMethodBind("Object","get_method_list")
    return _icall_VariantArray( mb, this.ptr)
  }

  open fun getPropertyList(): VariantArray {
    val mb = getMethodBind("Object","get_property_list")
    return _icall_VariantArray( mb, this.ptr)
  }

  open fun getScript(): Reference {
    val mb = getMethodBind("Object","get_script")
    return _icall_Reference( mb, this.ptr)
  }

  open fun getSignalConnectionList(signal: String): VariantArray {
    val mb = getMethodBind("Object","get_signal_connection_list")
    return _icall_VariantArray_String( mb, this.ptr, signal)
  }

  open fun getSignalList(): VariantArray {
    val mb = getMethodBind("Object","get_signal_list")
    return _icall_VariantArray( mb, this.ptr)
  }

  open fun hasMeta(name: String): Boolean {
    val mb = getMethodBind("Object","has_meta")
    return _icall_Boolean_String( mb, this.ptr, name)
  }

  open fun hasMethod(method: String): Boolean {
    val mb = getMethodBind("Object","has_method")
    return _icall_Boolean_String( mb, this.ptr, method)
  }

  open fun hasSignal(signal: String): Boolean {
    val mb = getMethodBind("Object","has_signal")
    return _icall_Boolean_String( mb, this.ptr, signal)
  }

  open fun hasUserSignal(signal: String): Boolean {
    val mb = getMethodBind("Object","has_user_signal")
    return _icall_Boolean_String( mb, this.ptr, signal)
  }

  open fun isBlockingSignals(): Boolean {
    val mb = getMethodBind("Object","is_blocking_signals")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isClass(_class: String): Boolean {
    val mb = getMethodBind("Object","is_class")
    return _icall_Boolean_String( mb, this.ptr, _class)
  }

  open fun isConnected(
    signal: String,
    target: Object,
    method: String
  ): Boolean {
    val mb = getMethodBind("Object","is_connected")
    return _icall_Boolean_String_Object_String( mb, this.ptr, signal, target, method)
  }

  open fun isQueuedForDeletion(): Boolean {
    val mb = getMethodBind("Object","is_queued_for_deletion")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun notification(what: Long, reversed: Boolean = false) {
    val mb = getMethodBind("Object","notification")
    _icall_Unit_Long_Boolean( mb, this.ptr, what, reversed)
  }

  open fun propertyListChangedNotify() {
    val mb = getMethodBind("Object","property_list_changed_notify")
    _icall_Unit( mb, this.ptr)
  }

  open fun removeMeta(name: String) {
    val mb = getMethodBind("Object","remove_meta")
    _icall_Unit_String( mb, this.ptr, name)
  }

  open fun set(property: String, value: Variant) {
    val mb = getMethodBind("Object","set")
    _icall_Unit_String_Variant( mb, this.ptr, property, value)
  }

  open fun setBlockSignals(enable: Boolean) {
    val mb = getMethodBind("Object","set_block_signals")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setDeferred(property: String, value: Variant) {
    val mb = getMethodBind("Object","set_deferred")
    _icall_Unit_String_Variant( mb, this.ptr, property, value)
  }

  open fun setIndexed(property: NodePath, value: Variant) {
    val mb = getMethodBind("Object","set_indexed")
    _icall_Unit_NodePath_Variant( mb, this.ptr, property, value)
  }

  open fun setMessageTranslation(enable: Boolean) {
    val mb = getMethodBind("Object","set_message_translation")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  open fun setMeta(name: String, value: Variant) {
    val mb = getMethodBind("Object","set_meta")
    _icall_Unit_String_Variant( mb, this.ptr, name, value)
  }

  open fun setScript(script: Reference) {
    val mb = getMethodBind("Object","set_script")
    _icall_Unit_Object( mb, this.ptr, script)
  }

  override fun toString(): String {
    val mb = getMethodBind("Object","to_string")
    return _icall_String( mb, this.ptr)
  }

  open fun tr(message: String): String {
    val mb = getMethodBind("Object","tr")
    return _icall_String_String( mb, this.ptr, message)
  }

  enum class ConnectFlags(
    id: Long
  ) {
    CONNECT_DEFERRED(1),

    CONNECT_PERSIST(2),

    CONNECT_ONESHOT(4),

    CONNECT_REFERENCE_COUNTED(8);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val NOTIFICATION_POSTINITIALIZE: Long = 0

    final const val NOTIFICATION_PREDELETE: Long = 1
  }
}
