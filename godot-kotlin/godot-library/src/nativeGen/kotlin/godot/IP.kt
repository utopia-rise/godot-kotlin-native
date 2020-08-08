package godot

import godot.IP
import godot.core.Godot
import godot.core.VariantArray
import godot.icalls._icall_Long_Long
import godot.icalls._icall_Long_String_Long
import godot.icalls._icall_String_Long
import godot.icalls._icall_String_String_Long
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_String
import godot.icalls._icall_VariantArray
import godot.internal.type.nullSafe
import godot.internal.utils.getMethodBind
import kotlin.Long
import kotlin.String
import kotlin.requireNotNull
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped

object IP : Object() {
  init {
    memScoped {
        val ptr = nullSafe(Godot.gdnative.godot_global_get_singleton).invoke("IP".cstr.ptr)
        requireNotNull(ptr) { "No instance found for singleton IP" }
        this@IP.ptr = ptr
    }
  }

  final const val RESOLVER_INVALID_ID: Long = -1

  final const val RESOLVER_MAX_QUERIES: Long = 32

  final const val RESOLVER_STATUS_DONE: Long = 2

  final const val RESOLVER_STATUS_ERROR: Long = 3

  final const val RESOLVER_STATUS_NONE: Long = 0

  final const val RESOLVER_STATUS_WAITING: Long = 1

  final const val TYPE_ANY: Long = 3

  final const val TYPE_IPV4: Long = 1

  final const val TYPE_IPV6: Long = 2

  final const val TYPE_NONE: Long = 0

  fun clearCache(hostname: String = "") {
    val mb = getMethodBind("IP","clear_cache")
    _icall_Unit_String( mb, this.ptr, hostname)
  }

  fun eraseResolveItem(id: Long) {
    val mb = getMethodBind("IP","erase_resolve_item")
    _icall_Unit_Long( mb, this.ptr, id)
  }

  fun getLocalAddresses(): VariantArray {
    val mb = getMethodBind("IP","get_local_addresses")
    return _icall_VariantArray( mb, this.ptr)
  }

  fun getLocalInterfaces(): VariantArray {
    val mb = getMethodBind("IP","get_local_interfaces")
    return _icall_VariantArray( mb, this.ptr)
  }

  fun getResolveItemAddress(id: Long): String {
    val mb = getMethodBind("IP","get_resolve_item_address")
    return _icall_String_Long( mb, this.ptr, id)
  }

  fun getResolveItemStatus(id: Long): IP.ResolverStatus {
    val mb = getMethodBind("IP","get_resolve_item_status")
    return IP.ResolverStatus.from( _icall_Long_Long( mb, this.ptr, id))
  }

  fun resolveHostname(host: String, ipType: Long = 3): String {
    val mb = getMethodBind("IP","resolve_hostname")
    return _icall_String_String_Long( mb, this.ptr, host, ipType)
  }

  fun resolveHostnameQueueItem(host: String, ipType: Long = 3): Long {
    val mb = getMethodBind("IP","resolve_hostname_queue_item")
    return _icall_Long_String_Long( mb, this.ptr, host, ipType)
  }

  enum class ResolverStatus(
    id: Long
  ) {
    RESOLVER_STATUS_NONE(0),

    RESOLVER_STATUS_WAITING(1),

    RESOLVER_STATUS_DONE(2),

    RESOLVER_STATUS_ERROR(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Type(
    id: Long
  ) {
    TYPE_NONE(0),

    TYPE_IPV4(1),

    TYPE_IPV6(2),

    TYPE_ANY(3);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }
}
