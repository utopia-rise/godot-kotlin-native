// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.HTTPClient
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.PoolByteArray
import godot.core.PoolStringArray
import godot.icalls._icall_Boolean
import godot.icalls._icall_Dictionary
import godot.icalls._icall_Long
import godot.icalls._icall_Long_Long_String_PoolStringArray_PoolByteArray
import godot.icalls._icall_Long_Long_String_PoolStringArray_String
import godot.icalls._icall_Long_String_Long_Boolean_Boolean
import godot.icalls._icall_PoolByteArray
import godot.icalls._icall_PoolStringArray
import godot.icalls._icall_StreamPeer
import godot.icalls._icall_String_Dictionary
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_Object
import godot.internal.utils.getMethodBind
import godot.internal.utils.invokeConstructor
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlinx.cinterop.COpaquePointer

open class HTTPClient : Reference() {
  open var blockingModeEnabled: Boolean
    get() {
      val mb = getMethodBind("HTTPClient","is_blocking_mode_enabled")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("HTTPClient","set_blocking_mode")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  open var connection: StreamPeer
    get() {
      val mb = getMethodBind("HTTPClient","get_connection")
      return _icall_StreamPeer(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("HTTPClient","set_connection")
      _icall_Unit_Object(mb, this.ptr, value)
    }

  open var readChunkSize: Long
    get() {
      val mb = getMethodBind("HTTPClient","get_read_chunk_size")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("HTTPClient","set_read_chunk_size")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  override fun __new(): COpaquePointer = invokeConstructor("HTTPClient", "HTTPClient")

  open fun close() {
    val mb = getMethodBind("HTTPClient","close")
    _icall_Unit( mb, this.ptr)
  }

  open fun connectToHost(
    host: String,
    port: Long = -1,
    useSsl: Boolean = false,
    verifyHost: Boolean = true
  ): GodotError {
    val mb = getMethodBind("HTTPClient","connect_to_host")
    return GodotError.byValue( _icall_Long_String_Long_Boolean_Boolean( mb, this.ptr, host, port,
        useSsl, verifyHost).toUInt())
  }

  open fun getConnection(): StreamPeer {
    val mb = getMethodBind("HTTPClient","get_connection")
    return _icall_StreamPeer( mb, this.ptr)
  }

  open fun getReadChunkSize(): Long {
    val mb = getMethodBind("HTTPClient","get_read_chunk_size")
    return _icall_Long( mb, this.ptr)
  }

  open fun getResponseBodyLength(): Long {
    val mb = getMethodBind("HTTPClient","get_response_body_length")
    return _icall_Long( mb, this.ptr)
  }

  open fun getResponseCode(): Long {
    val mb = getMethodBind("HTTPClient","get_response_code")
    return _icall_Long( mb, this.ptr)
  }

  open fun getResponseHeaders(): PoolStringArray {
    val mb = getMethodBind("HTTPClient","get_response_headers")
    return _icall_PoolStringArray( mb, this.ptr)
  }

  open fun getResponseHeadersAsDictionary(): Dictionary {
    val mb = getMethodBind("HTTPClient","get_response_headers_as_dictionary")
    return _icall_Dictionary( mb, this.ptr)
  }

  open fun getStatus(): HTTPClient.Status {
    val mb = getMethodBind("HTTPClient","get_status")
    return HTTPClient.Status.from( _icall_Long( mb, this.ptr))
  }

  open fun hasResponse(): Boolean {
    val mb = getMethodBind("HTTPClient","has_response")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isBlockingModeEnabled(): Boolean {
    val mb = getMethodBind("HTTPClient","is_blocking_mode_enabled")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun isResponseChunked(): Boolean {
    val mb = getMethodBind("HTTPClient","is_response_chunked")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun poll(): GodotError {
    val mb = getMethodBind("HTTPClient","poll")
    return GodotError.byValue( _icall_Long( mb, this.ptr).toUInt())
  }

  open fun queryStringFromDict(fields: Dictionary): String {
    val mb = getMethodBind("HTTPClient","query_string_from_dict")
    return _icall_String_Dictionary( mb, this.ptr, fields)
  }

  open fun readResponseBodyChunk(): PoolByteArray {
    val mb = getMethodBind("HTTPClient","read_response_body_chunk")
    return _icall_PoolByteArray( mb, this.ptr)
  }

  open fun request(
    method: Long,
    url: String,
    headers: PoolStringArray,
    body: String = ""
  ): GodotError {
    val mb = getMethodBind("HTTPClient","request")
    return GodotError.byValue( _icall_Long_Long_String_PoolStringArray_String( mb, this.ptr, method,
        url, headers, body).toUInt())
  }

  open fun requestRaw(
    method: Long,
    url: String,
    headers: PoolStringArray,
    body: PoolByteArray
  ): GodotError {
    val mb = getMethodBind("HTTPClient","request_raw")
    return GodotError.byValue( _icall_Long_Long_String_PoolStringArray_PoolByteArray( mb, this.ptr,
        method, url, headers, body).toUInt())
  }

  open fun setBlockingMode(enabled: Boolean) {
    val mb = getMethodBind("HTTPClient","set_blocking_mode")
    _icall_Unit_Boolean( mb, this.ptr, enabled)
  }

  open fun setConnection(connection: StreamPeer) {
    val mb = getMethodBind("HTTPClient","set_connection")
    _icall_Unit_Object( mb, this.ptr, connection)
  }

  open fun setReadChunkSize(bytes: Long) {
    val mb = getMethodBind("HTTPClient","set_read_chunk_size")
    _icall_Unit_Long( mb, this.ptr, bytes)
  }

  enum class Status(
    id: Long
  ) {
    STATUS_DISCONNECTED(0),

    STATUS_RESOLVING(1),

    STATUS_CANT_RESOLVE(2),

    STATUS_CONNECTING(3),

    STATUS_CANT_CONNECT(4),

    STATUS_CONNECTED(5),

    STATUS_REQUESTING(6),

    STATUS_BODY(7),

    STATUS_CONNECTION_ERROR(8),

    STATUS_SSL_HANDSHAKE_ERROR(9);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class Method(
    id: Long
  ) {
    METHOD_GET(0),

    METHOD_HEAD(1),

    METHOD_POST(2),

    METHOD_PUT(3),

    METHOD_DELETE(4),

    METHOD_OPTIONS(5),

    METHOD_TRACE(6),

    METHOD_CONNECT(7),

    METHOD_PATCH(8),

    METHOD_MAX(9);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  enum class ResponseCode(
    id: Long
  ) {
    RESPONSE_CONTINUE(100),

    RESPONSE_SWITCHING_PROTOCOLS(101),

    RESPONSE_PROCESSING(102),

    RESPONSE_OK(200),

    RESPONSE_CREATED(201),

    RESPONSE_ACCEPTED(202),

    RESPONSE_NON_AUTHORITATIVE_INFORMATION(203),

    RESPONSE_NO_CONTENT(204),

    RESPONSE_RESET_CONTENT(205),

    RESPONSE_PARTIAL_CONTENT(206),

    RESPONSE_MULTI_STATUS(207),

    RESPONSE_ALREADY_REPORTED(208),

    RESPONSE_IM_USED(226),

    RESPONSE_MULTIPLE_CHOICES(300),

    RESPONSE_MOVED_PERMANENTLY(301),

    RESPONSE_FOUND(302),

    RESPONSE_SEE_OTHER(303),

    RESPONSE_NOT_MODIFIED(304),

    RESPONSE_USE_PROXY(305),

    RESPONSE_SWITCH_PROXY(306),

    RESPONSE_TEMPORARY_REDIRECT(307),

    RESPONSE_PERMANENT_REDIRECT(308),

    RESPONSE_BAD_REQUEST(400),

    RESPONSE_UNAUTHORIZED(401),

    RESPONSE_PAYMENT_REQUIRED(402),

    RESPONSE_FORBIDDEN(403),

    RESPONSE_NOT_FOUND(404),

    RESPONSE_METHOD_NOT_ALLOWED(405),

    RESPONSE_NOT_ACCEPTABLE(406),

    RESPONSE_PROXY_AUTHENTICATION_REQUIRED(407),

    RESPONSE_REQUEST_TIMEOUT(408),

    RESPONSE_CONFLICT(409),

    RESPONSE_GONE(410),

    RESPONSE_LENGTH_REQUIRED(411),

    RESPONSE_PRECONDITION_FAILED(412),

    RESPONSE_REQUEST_ENTITY_TOO_LARGE(413),

    RESPONSE_REQUEST_URI_TOO_LONG(414),

    RESPONSE_UNSUPPORTED_MEDIA_TYPE(415),

    RESPONSE_REQUESTED_RANGE_NOT_SATISFIABLE(416),

    RESPONSE_EXPECTATION_FAILED(417),

    RESPONSE_IM_A_TEAPOT(418),

    RESPONSE_MISDIRECTED_REQUEST(421),

    RESPONSE_UNPROCESSABLE_ENTITY(422),

    RESPONSE_LOCKED(423),

    RESPONSE_FAILED_DEPENDENCY(424),

    RESPONSE_UPGRADE_REQUIRED(426),

    RESPONSE_PRECONDITION_REQUIRED(428),

    RESPONSE_TOO_MANY_REQUESTS(429),

    RESPONSE_REQUEST_HEADER_FIELDS_TOO_LARGE(431),

    RESPONSE_UNAVAILABLE_FOR_LEGAL_REASONS(451),

    RESPONSE_INTERNAL_SERVER_ERROR(500),

    RESPONSE_NOT_IMPLEMENTED(501),

    RESPONSE_BAD_GATEWAY(502),

    RESPONSE_SERVICE_UNAVAILABLE(503),

    RESPONSE_GATEWAY_TIMEOUT(504),

    RESPONSE_HTTP_VERSION_NOT_SUPPORTED(505),

    RESPONSE_VARIANT_ALSO_NEGOTIATES(506),

    RESPONSE_INSUFFICIENT_STORAGE(507),

    RESPONSE_LOOP_DETECTED(508),

    RESPONSE_NOT_EXTENDED(510),

    RESPONSE_NETWORK_AUTH_REQUIRED(511);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object
}
