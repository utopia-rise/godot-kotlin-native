@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class HTTPRequest : Node {
    constructor() : super("HTTPRequest")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class Result(val id: Long) {
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
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
            const val REQUEST_COMPLETED: String = "request_completed"
        }
    }


    companion object {
        infix fun from(other: Node): HTTPRequest = HTTPRequest("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): HTTPRequest = HTTPRequest("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): HTTPRequest = fromVariant(HTTPRequest(""), other)


        // Constants
        const val RESULT_SUCCESS: Long = 0
        const val RESULT_CHUNKED_BODY_SIZE_MISMATCH: Long = 1
        const val RESULT_CANT_CONNECT: Long = 2
        const val RESULT_CANT_RESOLVE: Long = 3
        const val RESULT_CONNECTION_ERROR: Long = 4
        const val RESULT_SSL_HANDSHAKE_ERROR: Long = 5
        const val RESULT_NO_RESPONSE: Long = 6
        const val RESULT_BODY_SIZE_LIMIT_EXCEEDED: Long = 7
        const val RESULT_REQUEST_FAILED: Long = 8
        const val RESULT_DOWNLOAD_FILE_CANT_OPEN: Long = 9
        const val RESULT_DOWNLOAD_FILE_WRITE_ERROR: Long = 10
        const val RESULT_REDIRECT_LIMIT_REACHED: Long = 11


    }


    // Properties
    open var downloadFile: String
        get() = _icall_String(getDownloadFileMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setDownloadFileMethodBind, this.rawMemory, value)


    open var useThreads: Boolean
        get() = _icall_Boolean(isUsingThreadsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setUseThreadsMethodBind, this.rawMemory, value)


    open var bodySizeLimit: Long
        get() = _icall_Long(getBodySizeLimitMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setBodySizeLimitMethodBind, this.rawMemory, value)


    open var maxRedirects: Long
        get() = _icall_Long(getMaxRedirectsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setMaxRedirectsMethodBind, this.rawMemory, value)




    // Methods
    private val requestMethodBind: CPointer<godot_method_bind> by lazy { getMB("HTTPRequest", "request") }
    open fun request(url: String, customHeaders: PoolStringArray = PoolStringArray(), sslValidateDomain: Boolean = true, method: Long = 0, requestData: String = ""): GodotError {
        return GodotError.fromInt(_icall_Long_String_PoolStringArray_Boolean_Long_String(requestMethodBind, this.rawMemory, url, customHeaders, sslValidateDomain, method, requestData))
    }


    private val cancelRequestMethodBind: CPointer<godot_method_bind> by lazy { getMB("HTTPRequest", "cancel_request") }
    open fun cancelRequest() {
        _icall_Unit(cancelRequestMethodBind, this.rawMemory)
    }


    private val getHttpClientStatusMethodBind: CPointer<godot_method_bind> by lazy { getMB("HTTPRequest", "get_http_client_status") }
    open fun getHttpClientStatus(): HTTPClient.Status {
        return HTTPClient.Status.fromInt(_icall_Long(getHttpClientStatusMethodBind, this.rawMemory))
    }


    private val setUseThreadsMethodBind: CPointer<godot_method_bind> by lazy { getMB("HTTPRequest", "set_use_threads") }
    open fun setUseThreads(enable: Boolean) {
        _icall_Unit_Boolean(setUseThreadsMethodBind, this.rawMemory, enable)
    }


    private val isUsingThreadsMethodBind: CPointer<godot_method_bind> by lazy { getMB("HTTPRequest", "is_using_threads") }
    open fun isUsingThreads(): Boolean {
        return _icall_Boolean(isUsingThreadsMethodBind, this.rawMemory)
    }


    private val setBodySizeLimitMethodBind: CPointer<godot_method_bind> by lazy { getMB("HTTPRequest", "set_body_size_limit") }
    open fun setBodySizeLimit(bytes: Long) {
        _icall_Unit_Long(setBodySizeLimitMethodBind, this.rawMemory, bytes)
    }


    private val getBodySizeLimitMethodBind: CPointer<godot_method_bind> by lazy { getMB("HTTPRequest", "get_body_size_limit") }
    open fun getBodySizeLimit(): Long {
        return _icall_Long(getBodySizeLimitMethodBind, this.rawMemory)
    }


    private val setMaxRedirectsMethodBind: CPointer<godot_method_bind> by lazy { getMB("HTTPRequest", "set_max_redirects") }
    open fun setMaxRedirects(amount: Long) {
        _icall_Unit_Long(setMaxRedirectsMethodBind, this.rawMemory, amount)
    }


    private val getMaxRedirectsMethodBind: CPointer<godot_method_bind> by lazy { getMB("HTTPRequest", "get_max_redirects") }
    open fun getMaxRedirects(): Long {
        return _icall_Long(getMaxRedirectsMethodBind, this.rawMemory)
    }


    private val setDownloadFileMethodBind: CPointer<godot_method_bind> by lazy { getMB("HTTPRequest", "set_download_file") }
    open fun setDownloadFile(path: String) {
        _icall_Unit_String(setDownloadFileMethodBind, this.rawMemory, path)
    }


    private val getDownloadFileMethodBind: CPointer<godot_method_bind> by lazy { getMB("HTTPRequest", "get_download_file") }
    open fun getDownloadFile(): String {
        return _icall_String(getDownloadFileMethodBind, this.rawMemory)
    }


    private val getDownloadedBytesMethodBind: CPointer<godot_method_bind> by lazy { getMB("HTTPRequest", "get_downloaded_bytes") }
    open fun getDownloadedBytes(): Long {
        return _icall_Long(getDownloadedBytesMethodBind, this.rawMemory)
    }


    private val getBodySizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("HTTPRequest", "get_body_size") }
    open fun getBodySize(): Long {
        return _icall_Long(getBodySizeMethodBind, this.rawMemory)
    }


    open fun _redirect_request(arg0: String) {
    }


    open fun _request_done(arg0: Long, arg1: Long, arg2: PoolStringArray, arg3: PoolByteArray) {
    }


}
