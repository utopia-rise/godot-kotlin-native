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

    enum class Status(val id: Int) {
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
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class Method(val id: Int) {
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
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class ResponseCode(val id: Int) {
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
            fun fromInt(value: Int) = values().single { it.id == value }
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
        const val METHOD_GET: Int = 0
        const val METHOD_HEAD: Int = 1
        const val METHOD_POST: Int = 2
        const val METHOD_PUT: Int = 3
        const val METHOD_DELETE: Int = 4
        const val METHOD_OPTIONS: Int = 5
        const val METHOD_TRACE: Int = 6
        const val METHOD_CONNECT: Int = 7
        const val METHOD_PATCH: Int = 8
        const val METHOD_MAX: Int = 9
        const val STATUS_DISCONNECTED: Int = 0
        const val STATUS_RESOLVING: Int = 1
        const val STATUS_CANT_RESOLVE: Int = 2
        const val STATUS_CONNECTING: Int = 3
        const val STATUS_CANT_CONNECT: Int = 4
        const val STATUS_CONNECTED: Int = 5
        const val STATUS_REQUESTING: Int = 6
        const val STATUS_BODY: Int = 7
        const val STATUS_CONNECTION_ERROR: Int = 8
        const val STATUS_SSL_HANDSHAKE_ERROR: Int = 9
        const val RESPONSE_CONTINUE: Int = 100
        const val RESPONSE_SWITCHING_PROTOCOLS: Int = 101
        const val RESPONSE_PROCESSING: Int = 102
        const val RESPONSE_OK: Int = 200
        const val RESPONSE_CREATED: Int = 201
        const val RESPONSE_ACCEPTED: Int = 202
        const val RESPONSE_NON_AUTHORITATIVE_INFORMATION: Int = 203
        const val RESPONSE_NO_CONTENT: Int = 204
        const val RESPONSE_RESET_CONTENT: Int = 205
        const val RESPONSE_PARTIAL_CONTENT: Int = 206
        const val RESPONSE_MULTI_STATUS: Int = 207
        const val RESPONSE_ALREADY_REPORTED: Int = 208
        const val RESPONSE_IM_USED: Int = 226
        const val RESPONSE_MULTIPLE_CHOICES: Int = 300
        const val RESPONSE_MOVED_PERMANENTLY: Int = 301
        const val RESPONSE_FOUND: Int = 302
        const val RESPONSE_SEE_OTHER: Int = 303
        const val RESPONSE_NOT_MODIFIED: Int = 304
        const val RESPONSE_USE_PROXY: Int = 305
        const val RESPONSE_SWITCH_PROXY: Int = 306
        const val RESPONSE_TEMPORARY_REDIRECT: Int = 307
        const val RESPONSE_PERMANENT_REDIRECT: Int = 308
        const val RESPONSE_BAD_REQUEST: Int = 400
        const val RESPONSE_UNAUTHORIZED: Int = 401
        const val RESPONSE_PAYMENT_REQUIRED: Int = 402
        const val RESPONSE_FORBIDDEN: Int = 403
        const val RESPONSE_NOT_FOUND: Int = 404
        const val RESPONSE_METHOD_NOT_ALLOWED: Int = 405
        const val RESPONSE_NOT_ACCEPTABLE: Int = 406
        const val RESPONSE_PROXY_AUTHENTICATION_REQUIRED: Int = 407
        const val RESPONSE_REQUEST_TIMEOUT: Int = 408
        const val RESPONSE_CONFLICT: Int = 409
        const val RESPONSE_GONE: Int = 410
        const val RESPONSE_LENGTH_REQUIRED: Int = 411
        const val RESPONSE_PRECONDITION_FAILED: Int = 412
        const val RESPONSE_REQUEST_ENTITY_TOO_LARGE: Int = 413
        const val RESPONSE_REQUEST_URI_TOO_LONG: Int = 414
        const val RESPONSE_UNSUPPORTED_MEDIA_TYPE: Int = 415
        const val RESPONSE_REQUESTED_RANGE_NOT_SATISFIABLE: Int = 416
        const val RESPONSE_EXPECTATION_FAILED: Int = 417
        const val RESPONSE_IM_A_TEAPOT: Int = 418
        const val RESPONSE_MISDIRECTED_REQUEST: Int = 421
        const val RESPONSE_UNPROCESSABLE_ENTITY: Int = 422
        const val RESPONSE_LOCKED: Int = 423
        const val RESPONSE_FAILED_DEPENDENCY: Int = 424
        const val RESPONSE_UPGRADE_REQUIRED: Int = 426
        const val RESPONSE_PRECONDITION_REQUIRED: Int = 428
        const val RESPONSE_TOO_MANY_REQUESTS: Int = 429
        const val RESPONSE_REQUEST_HEADER_FIELDS_TOO_LARGE: Int = 431
        const val RESPONSE_UNAVAILABLE_FOR_LEGAL_REASONS: Int = 451
        const val RESPONSE_INTERNAL_SERVER_ERROR: Int = 500
        const val RESPONSE_NOT_IMPLEMENTED: Int = 501
        const val RESPONSE_BAD_GATEWAY: Int = 502
        const val RESPONSE_SERVICE_UNAVAILABLE: Int = 503
        const val RESPONSE_GATEWAY_TIMEOUT: Int = 504
        const val RESPONSE_HTTP_VERSION_NOT_SUPPORTED: Int = 505
        const val RESPONSE_VARIANT_ALSO_NEGOTIATES: Int = 506
        const val RESPONSE_INSUFFICIENT_STORAGE: Int = 507
        const val RESPONSE_LOOP_DETECTED: Int = 508
        const val RESPONSE_NOT_EXTENDED: Int = 510
        const val RESPONSE_NETWORK_AUTH_REQUIRED: Int = 511


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
    open fun connectToHost(host: String, port: Int = -1, useSsl: Boolean = false, verifyHost: Boolean = true): GodotError {
        return GodotError.fromInt(_icall_Int_String_Int_Boolean_Boolean(connectToHostMethodBind, this.rawMemory, host, port, useSsl, verifyHost))
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
    open fun requestRaw(method: Int, url: String, headers: PoolStringArray, body: PoolByteArray): GodotError {
        return GodotError.fromInt(_icall_Int_Int_String_PoolStringArray_PoolByteArray(requestRawMethodBind, this.rawMemory, method, url, headers, body))
    }


    private val requestMethodBind: CPointer<godot_method_bind> by lazy { getMB("HTTPClient", "request") }
    open fun request(method: Int, url: String, headers: PoolStringArray, body: String = ""): GodotError {
        return GodotError.fromInt(_icall_Int_Int_String_PoolStringArray_String(requestMethodBind, this.rawMemory, method, url, headers, body))
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
    open fun getResponseCode(): Int {
        return _icall_Int(getResponseCodeMethodBind, this.rawMemory)
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
    open fun getResponseBodyLength(): Int {
        return _icall_Int(getResponseBodyLengthMethodBind, this.rawMemory)
    }


    private val readResponseBodyChunkMethodBind: CPointer<godot_method_bind> by lazy { getMB("HTTPClient", "read_response_body_chunk") }
    open fun readResponseBodyChunk(): PoolByteArray {
        return _icall_PoolByteArray(readResponseBodyChunkMethodBind, this.rawMemory)
    }


    private val setReadChunkSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("HTTPClient", "set_read_chunk_size") }
    open fun setReadChunkSize(bytes: Int) {
        _icall_Unit_Int(setReadChunkSizeMethodBind, this.rawMemory, bytes)
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
        return HTTPClient.Status.fromInt(_icall_Int(getStatusMethodBind, this.rawMemory))
    }


    private val pollMethodBind: CPointer<godot_method_bind> by lazy { getMB("HTTPClient", "poll") }
    open fun poll(): GodotError {
        return GodotError.fromInt(_icall_Int(pollMethodBind, this.rawMemory))
    }


    private val queryStringFromDictMethodBind: CPointer<godot_method_bind> by lazy { getMB("HTTPClient", "query_string_from_dict") }
    open fun queryStringFromDict(fields: Dictionary): String {
        return _icall_String_Dictionary(queryStringFromDictMethodBind, this.rawMemory, fields)
    }


}
