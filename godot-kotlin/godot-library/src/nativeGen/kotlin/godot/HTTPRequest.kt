package godot

import godot.HTTPClient
import godot.core.Godot.shouldInitPtr
import godot.core.GodotError
import godot.core.PoolByteArray
import godot.core.PoolStringArray
import godot.core.Signal4
import godot.core.signal
import godot.icalls._icall_Boolean
import godot.icalls._icall_Long
import godot.icalls._icall_Long_String_PoolStringArray_Boolean_Long_String
import godot.icalls._icall_String
import godot.icalls._icall_Unit
import godot.icalls._icall_Unit_Boolean
import godot.icalls._icall_Unit_Long
import godot.icalls._icall_Unit_String
import godot.internal.utils.getConstructor
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.String

open class HTTPRequest internal constructor(
  _ignore: Any?
) : Node(_ignore) {
  val requestCompleted: Signal4<Long, Long, PoolStringArray, PoolByteArray> by signal("result",
      "response_code", "headers", "body")

  open var bodySizeLimit: Long
    get() {
      val mb = getMethodBind("HTTPRequest","get_body_size_limit")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("HTTPRequest","set_body_size_limit")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var downloadChunkSize: Long
    get() {
      val mb = getMethodBind("HTTPRequest","get_download_chunk_size")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("HTTPRequest","set_download_chunk_size")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var downloadFile: String
    get() {
      val mb = getMethodBind("HTTPRequest","get_download_file")
      return _icall_String(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("HTTPRequest","set_download_file")
      _icall_Unit_String(mb, this.ptr, value)
    }

  open var maxRedirects: Long
    get() {
      val mb = getMethodBind("HTTPRequest","get_max_redirects")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("HTTPRequest","set_max_redirects")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var timeout: Long
    get() {
      val mb = getMethodBind("HTTPRequest","get_timeout")
      return _icall_Long(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("HTTPRequest","set_timeout")
      _icall_Unit_Long(mb, this.ptr, value)
    }

  open var useThreads: Boolean
    get() {
      val mb = getMethodBind("HTTPRequest","is_using_threads")
      return _icall_Boolean(mb, this.ptr)
    }
    set(value) {
      val mb = getMethodBind("HTTPRequest","set_use_threads")
      _icall_Unit_Boolean(mb, this.ptr, value)
    }

  constructor() : this(null) {
    if (shouldInitPtr()) {
            this.ptr = getConstructor("HTTPRequest", "HTTPRequest")
        }

  }

  open fun _redirect_request(arg0: String) {
  }

  open fun _request_done(
    arg0: Long,
    arg1: Long,
    arg2: PoolStringArray,
    arg3: PoolByteArray
  ) {
  }

  open fun _timeout() {
  }

  open fun cancelRequest() {
    val mb = getMethodBind("HTTPRequest","cancel_request")
    _icall_Unit( mb, this.ptr)
  }

  open fun getBodySize(): Long {
    val mb = getMethodBind("HTTPRequest","get_body_size")
    return _icall_Long( mb, this.ptr)
  }

  open fun getBodySizeLimit(): Long {
    val mb = getMethodBind("HTTPRequest","get_body_size_limit")
    return _icall_Long( mb, this.ptr)
  }

  open fun getDownloadChunkSize(): Long {
    val mb = getMethodBind("HTTPRequest","get_download_chunk_size")
    return _icall_Long( mb, this.ptr)
  }

  open fun getDownloadFile(): String {
    val mb = getMethodBind("HTTPRequest","get_download_file")
    return _icall_String( mb, this.ptr)
  }

  open fun getDownloadedBytes(): Long {
    val mb = getMethodBind("HTTPRequest","get_downloaded_bytes")
    return _icall_Long( mb, this.ptr)
  }

  open fun getHttpClientStatus(): HTTPClient.Status {
    val mb = getMethodBind("HTTPRequest","get_http_client_status")
    return HTTPClient.Status.from( _icall_Long( mb, this.ptr))
  }

  open fun getMaxRedirects(): Long {
    val mb = getMethodBind("HTTPRequest","get_max_redirects")
    return _icall_Long( mb, this.ptr)
  }

  open fun getTimeout(): Long {
    val mb = getMethodBind("HTTPRequest","get_timeout")
    return _icall_Long( mb, this.ptr)
  }

  open fun isUsingThreads(): Boolean {
    val mb = getMethodBind("HTTPRequest","is_using_threads")
    return _icall_Boolean( mb, this.ptr)
  }

  open fun request(
    url: String,
    customHeaders: PoolStringArray = PoolStringArray(),
    sslValidateDomain: Boolean = true,
    method: Long = 0,
    requestData: String = ""
  ): GodotError {
    val mb = getMethodBind("HTTPRequest","request")
    return GodotError.byValue( _icall_Long_String_PoolStringArray_Boolean_Long_String( mb, this.ptr,
        url, customHeaders, sslValidateDomain, method, requestData).toUInt())
  }

  open fun setBodySizeLimit(bytes: Long) {
    val mb = getMethodBind("HTTPRequest","set_body_size_limit")
    _icall_Unit_Long( mb, this.ptr, bytes)
  }

  open fun setDownloadChunkSize(arg0: Long) {
    val mb = getMethodBind("HTTPRequest","set_download_chunk_size")
    _icall_Unit_Long( mb, this.ptr, arg0)
  }

  open fun setDownloadFile(path: String) {
    val mb = getMethodBind("HTTPRequest","set_download_file")
    _icall_Unit_String( mb, this.ptr, path)
  }

  open fun setMaxRedirects(amount: Long) {
    val mb = getMethodBind("HTTPRequest","set_max_redirects")
    _icall_Unit_Long( mb, this.ptr, amount)
  }

  open fun setTimeout(timeout: Long) {
    val mb = getMethodBind("HTTPRequest","set_timeout")
    _icall_Unit_Long( mb, this.ptr, timeout)
  }

  open fun setUseThreads(enable: Boolean) {
    val mb = getMethodBind("HTTPRequest","set_use_threads")
    _icall_Unit_Boolean( mb, this.ptr, enable)
  }

  enum class Result(
    id: Long
  ) {
    RESULT_SUCCESS(0),

    RESULT_CHUNKED_BODY_SIZE_MISMATCH(1),

    RESULT_CANT_CONNECT(2),

    RESULT_CANT_RESOLVE(3),

    RESULT_CONNECTION_ERROR(4),

    RESULT_SSL_HANDSHAKE_ERROR(5),

    RESULT_NO_RESPONSE(6),

    RESULT_BODY_SIZE_LIMIT_EXCEEDED(7),

    RESULT_REQUEST_FAILED(8),

    RESULT_DOWNLOAD_FILE_CANT_OPEN(9),

    RESULT_DOWNLOAD_FILE_WRITE_ERROR(10),

    RESULT_REDIRECT_LIMIT_REACHED(11),

    RESULT_TIMEOUT(12);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    final const val RESULT_BODY_SIZE_LIMIT_EXCEEDED: Long = 7

    final const val RESULT_CANT_CONNECT: Long = 2

    final const val RESULT_CANT_RESOLVE: Long = 3

    final const val RESULT_CHUNKED_BODY_SIZE_MISMATCH: Long = 1

    final const val RESULT_CONNECTION_ERROR: Long = 4

    final const val RESULT_DOWNLOAD_FILE_CANT_OPEN: Long = 9

    final const val RESULT_DOWNLOAD_FILE_WRITE_ERROR: Long = 10

    final const val RESULT_NO_RESPONSE: Long = 6

    final const val RESULT_REDIRECT_LIMIT_REACHED: Long = 11

    final const val RESULT_REQUEST_FAILED: Long = 8

    final const val RESULT_SSL_HANDSHAKE_ERROR: Long = 5

    final const val RESULT_SUCCESS: Long = 0

    final const val RESULT_TIMEOUT: Long = 12
  }
}
