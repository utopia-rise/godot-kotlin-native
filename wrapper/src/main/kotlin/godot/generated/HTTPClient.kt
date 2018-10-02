@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class HTTPClient : Reference {
    constructor() : super("HTTPClient")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class Status(val id: Long) {
        STATUS_DISCONNECTED(0),
        STATUS_RESOLVING(1),
        STATUS_CANT_RESOLVE(2),
        STATUS_CONNECTING(3),
        STATUS_CANT_CONNECT(4),
        STATUS_CONNECTED(5),
        STATUS_REQUESTING(6),
        STATUS_BODY(7),
        STATUS_CONNECTION_ERROR(8),
        STATUS_SSL_HANDSHAKE_ERROR(9),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class Method(val id: Long) {
        METHOD_GET(0),
        METHOD_HEAD(1),
        METHOD_POST(2),
        METHOD_PUT(3),
        METHOD_DELETE(4),
        METHOD_OPTIONS(5),
        METHOD_TRACE(6),
        METHOD_CONNECT(7),
        METHOD_PATCH(8),
        METHOD_MAX(9),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class ResponseCode(val id: Long) {
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
        RESPONSE_NETWORK_AUTH_REQUIRED(511),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: Reference): HTTPClient = HTTPClient("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): HTTPClient = HTTPClient("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): HTTPClient = fromVariant(HTTPClient(""), other)


        // Constants
        const val METHOD_GET: Long = 0
        const val METHOD_HEAD: Long = 1
        const val METHOD_POST: Long = 2
        const val METHOD_PUT: Long = 3
        const val METHOD_DELETE: Long = 4
        const val METHOD_OPTIONS: Long = 5
        const val METHOD_TRACE: Long = 6
        const val METHOD_CONNECT: Long = 7
        const val METHOD_PATCH: Long = 8
        const val METHOD_MAX: Long = 9
        const val STATUS_DISCONNECTED: Long = 0
        const val STATUS_RESOLVING: Long = 1
        const val STATUS_CANT_RESOLVE: Long = 2
        const val STATUS_CONNECTING: Long = 3
        const val STATUS_CANT_CONNECT: Long = 4
        const val STATUS_CONNECTED: Long = 5
        const val STATUS_REQUESTING: Long = 6
        const val STATUS_BODY: Long = 7
        const val STATUS_CONNECTION_ERROR: Long = 8
        const val STATUS_SSL_HANDSHAKE_ERROR: Long = 9
        const val RESPONSE_CONTINUE: Long = 100
        const val RESPONSE_SWITCHING_PROTOCOLS: Long = 101
        const val RESPONSE_PROCESSING: Long = 102
        const val RESPONSE_OK: Long = 200
        const val RESPONSE_CREATED: Long = 201
        const val RESPONSE_ACCEPTED: Long = 202
        const val RESPONSE_NON_AUTHORITATIVE_INFORMATION: Long = 203
        const val RESPONSE_NO_CONTENT: Long = 204
        const val RESPONSE_RESET_CONTENT: Long = 205
        const val RESPONSE_PARTIAL_CONTENT: Long = 206
        const val RESPONSE_MULTI_STATUS: Long = 207
        const val RESPONSE_ALREADY_REPORTED: Long = 208
        const val RESPONSE_IM_USED: Long = 226
        const val RESPONSE_MULTIPLE_CHOICES: Long = 300
        const val RESPONSE_MOVED_PERMANENTLY: Long = 301
        const val RESPONSE_FOUND: Long = 302
        const val RESPONSE_SEE_OTHER: Long = 303
        const val RESPONSE_NOT_MODIFIED: Long = 304
        const val RESPONSE_USE_PROXY: Long = 305
        const val RESPONSE_SWITCH_PROXY: Long = 306
        const val RESPONSE_TEMPORARY_REDIRECT: Long = 307
        const val RESPONSE_PERMANENT_REDIRECT: Long = 308
        const val RESPONSE_BAD_REQUEST: Long = 400
        const val RESPONSE_UNAUTHORIZED: Long = 401
        const val RESPONSE_PAYMENT_REQUIRED: Long = 402
        const val RESPONSE_FORBIDDEN: Long = 403
        const val RESPONSE_NOT_FOUND: Long = 404
        const val RESPONSE_METHOD_NOT_ALLOWED: Long = 405
        const val RESPONSE_NOT_ACCEPTABLE: Long = 406
        const val RESPONSE_PROXY_AUTHENTICATION_REQUIRED: Long = 407
        const val RESPONSE_REQUEST_TIMEOUT: Long = 408
        const val RESPONSE_CONFLICT: Long = 409
        const val RESPONSE_GONE: Long = 410
        const val RESPONSE_LENGTH_REQUIRED: Long = 411
        const val RESPONSE_PRECONDITION_FAILED: Long = 412
        const val RESPONSE_REQUEST_ENTITY_TOO_LARGE: Long = 413
        const val RESPONSE_REQUEST_URI_TOO_LONG: Long = 414
        const val RESPONSE_UNSUPPORTED_MEDIA_TYPE: Long = 415
        const val RESPONSE_REQUESTED_RANGE_NOT_SATISFIABLE: Long = 416
        const val RESPONSE_EXPECTATION_FAILED: Long = 417
        const val RESPONSE_IM_A_TEAPOT: Long = 418
        const val RESPONSE_MISDIRECTED_REQUEST: Long = 421
        const val RESPONSE_UNPROCESSABLE_ENTITY: Long = 422
        const val RESPONSE_LOCKED: Long = 423
        const val RESPONSE_FAILED_DEPENDENCY: Long = 424
        const val RESPONSE_UPGRADE_REQUIRED: Long = 426
        const val RESPONSE_PRECONDITION_REQUIRED: Long = 428
        const val RESPONSE_TOO_MANY_REQUESTS: Long = 429
        const val RESPONSE_REQUEST_HEADER_FIELDS_TOO_LARGE: Long = 431
        const val RESPONSE_UNAVAILABLE_FOR_LEGAL_REASONS: Long = 451
        const val RESPONSE_INTERNAL_SERVER_ERROR: Long = 500
        const val RESPONSE_NOT_IMPLEMENTED: Long = 501
        const val RESPONSE_BAD_GATEWAY: Long = 502
        const val RESPONSE_SERVICE_UNAVAILABLE: Long = 503
        const val RESPONSE_GATEWAY_TIMEOUT: Long = 504
        const val RESPONSE_HTTP_VERSION_NOT_SUPPORTED: Long = 505
        const val RESPONSE_VARIANT_ALSO_NEGOTIATES: Long = 506
        const val RESPONSE_INSUFFICIENT_STORAGE: Long = 507
        const val RESPONSE_LOOP_DETECTED: Long = 508
        const val RESPONSE_NOT_EXTENDED: Long = 510
        const val RESPONSE_NETWORK_AUTH_REQUIRED: Long = 511


    }


    // Properties
    open var blockingModeEnabled: Boolean
        get() = _icall_Boolean(isBlockingModeEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setBlockingModeMethodBind, this.rawMemory, value)


    open var connection: StreamPeer
        get() = _icall_StreamPeer(getConnectionMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setConnectionMethodBind, this.rawMemory, value)




    // Methods
    private val connectToHostMethodBind: CPointer<godot_method_bind> by lazy { getMB("HTTPClient", "connect_to_host") }
    open fun connectToHost(host: String, port: Long = -1, useSsl: Boolean = false, verifyHost: Boolean = true): GodotError {
        return GodotError.fromInt(_icall_Long_String_Long_Boolean_Boolean(connectToHostMethodBind, this.rawMemory, host, port, useSsl, verifyHost))
    }


    private val setConnectionMethodBind: CPointer<godot_method_bind> by lazy { getMB("HTTPClient", "set_connection") }
    open fun setConnection(connection: StreamPeer) {
        _icall_Unit_Object(setConnectionMethodBind, this.rawMemory, connection)
    }


    private val getConnectionMethodBind: CPointer<godot_method_bind> by lazy { getMB("HTTPClient", "get_connection") }
    open fun getConnection(): StreamPeer {
        return _icall_StreamPeer(getConnectionMethodBind, this.rawMemory)
    }


    private val requestRawMethodBind: CPointer<godot_method_bind> by lazy { getMB("HTTPClient", "request_raw") }
    open fun requestRaw(method: Long, url: String, headers: PoolStringArray, body: PoolByteArray): GodotError {
        return GodotError.fromInt(_icall_Long_Long_String_PoolStringArray_PoolByteArray(requestRawMethodBind, this.rawMemory, method, url, headers, body))
    }


    private val requestMethodBind: CPointer<godot_method_bind> by lazy { getMB("HTTPClient", "request") }
    open fun request(method: Long, url: String, headers: PoolStringArray, body: String = ""): GodotError {
        return GodotError.fromInt(_icall_Long_Long_String_PoolStringArray_String(requestMethodBind, this.rawMemory, method, url, headers, body))
    }


    private val closeMethodBind: CPointer<godot_method_bind> by lazy { getMB("HTTPClient", "close") }
    open fun close() {
        _icall_Unit(closeMethodBind, this.rawMemory)
    }


    private val hasResponseMethodBind: CPointer<godot_method_bind> by lazy { getMB("HTTPClient", "has_response") }
    open fun hasResponse(): Boolean {
        return _icall_Boolean(hasResponseMethodBind, this.rawMemory)
    }


    private val isResponseChunkedMethodBind: CPointer<godot_method_bind> by lazy { getMB("HTTPClient", "is_response_chunked") }
    open fun isResponseChunked(): Boolean {
        return _icall_Boolean(isResponseChunkedMethodBind, this.rawMemory)
    }


    private val getResponseCodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("HTTPClient", "get_response_code") }
    open fun getResponseCode(): Long {
        return _icall_Long(getResponseCodeMethodBind, this.rawMemory)
    }


    private val getResponseHeadersMethodBind: CPointer<godot_method_bind> by lazy { getMB("HTTPClient", "get_response_headers") }
    open fun getResponseHeaders(): PoolStringArray {
        return _icall_PoolStringArray(getResponseHeadersMethodBind, this.rawMemory)
    }


    private val getResponseHeadersAsDictionaryMethodBind: CPointer<godot_method_bind> by lazy { getMB("HTTPClient", "get_response_headers_as_dictionary") }
    open fun getResponseHeadersAsDictionary(): Dictionary {
        return _icall_Dictionary(getResponseHeadersAsDictionaryMethodBind, this.rawMemory)
    }


    private val getResponseBodyLengthMethodBind: CPointer<godot_method_bind> by lazy { getMB("HTTPClient", "get_response_body_length") }
    open fun getResponseBodyLength(): Long {
        return _icall_Long(getResponseBodyLengthMethodBind, this.rawMemory)
    }


    private val readResponseBodyChunkMethodBind: CPointer<godot_method_bind> by lazy { getMB("HTTPClient", "read_response_body_chunk") }
    open fun readResponseBodyChunk(): PoolByteArray {
        return _icall_PoolByteArray(readResponseBodyChunkMethodBind, this.rawMemory)
    }


    private val setReadChunkSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("HTTPClient", "set_read_chunk_size") }
    open fun setReadChunkSize(bytes: Long) {
        _icall_Unit_Long(setReadChunkSizeMethodBind, this.rawMemory, bytes)
    }


    private val setBlockingModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("HTTPClient", "set_blocking_mode") }
    open fun setBlockingMode(enabled: Boolean) {
        _icall_Unit_Boolean(setBlockingModeMethodBind, this.rawMemory, enabled)
    }


    private val isBlockingModeEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("HTTPClient", "is_blocking_mode_enabled") }
    open fun isBlockingModeEnabled(): Boolean {
        return _icall_Boolean(isBlockingModeEnabledMethodBind, this.rawMemory)
    }


    private val getStatusMethodBind: CPointer<godot_method_bind> by lazy { getMB("HTTPClient", "get_status") }
    open fun getStatus(): HTTPClient.Status {
        return HTTPClient.Status.fromInt(_icall_Long(getStatusMethodBind, this.rawMemory))
    }


    private val pollMethodBind: CPointer<godot_method_bind> by lazy { getMB("HTTPClient", "poll") }
    open fun poll(): GodotError {
        return GodotError.fromInt(_icall_Long(pollMethodBind, this.rawMemory))
    }


    private val queryStringFromDictMethodBind: CPointer<godot_method_bind> by lazy { getMB("HTTPClient", "query_string_from_dict") }
    open fun queryStringFromDict(fields: Dictionary): String {
        return _icall_String_Dictionary(queryStringFromDictMethodBind, this.rawMemory, fields)
    }


}
