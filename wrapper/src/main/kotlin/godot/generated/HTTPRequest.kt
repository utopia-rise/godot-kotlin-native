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

    enum class Result(val id: Int) {
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
            fun fromInt(value: Int) = values().single { it.id == value }
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
        const val RESULT_SUCCESS: Int = 0
        const val RESULT_CHUNKED_BODY_SIZE_MISMATCH: Int = 1
        const val RESULT_CANT_CONNECT: Int = 2
        const val RESULT_CANT_RESOLVE: Int = 3
        const val RESULT_CONNECTION_ERROR: Int = 4
        const val RESULT_SSL_HANDSHAKE_ERROR: Int = 5
        const val RESULT_NO_RESPONSE: Int = 6
        const val RESULT_BODY_SIZE_LIMIT_EXCEEDED: Int = 7
        const val RESULT_REQUEST_FAILED: Int = 8
        const val RESULT_DOWNLOAD_FILE_CANT_OPEN: Int = 9
        const val RESULT_DOWNLOAD_FILE_WRITE_ERROR: Int = 10
        const val RESULT_REDIRECT_LIMIT_REACHED: Int = 11


    }


    // Properties
    open var downloadFile: String
        get() = _icall_String(getDownloadFileMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setDownloadFileMethodBind, this.rawMemory, value)


    open var useThreads: Boolean
        get() = _icall_Boolean(isUsingThreadsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setUseThreadsMethodBind, this.rawMemory, value)


    open var bodySizeLimit: Int
        get() = _icall_Int(getBodySizeLimitMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setBodySizeLimitMethodBind, this.rawMemory, value)


    open var maxRedirects: Int
        get() = _icall_Int(getMaxRedirectsMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setMaxRedirectsMethodBind, this.rawMemory, value)




    // Methods
    private val requestMethodBind: CPointer<godot_method_bind> by lazy { getMB("HTTPRequest", "request") }
    open fun request(url: String, customHeaders: PoolStringArray = PoolStringArray(), sslValidateDomain: Boolean = true, method: Int = 0, requestData: String = ""): GodotError {
        return GodotError.fromInt(_icall_Int_String_PoolStringArray_Boolean_Int_String(requestMethodBind, this.rawMemory, url, customHeaders, sslValidateDomain, method, requestData))
    }


    private val cancelRequestMethodBind: CPointer<godot_method_bind> by lazy { getMB("HTTPRequest", "cancel_request") }
    open fun cancelRequest() {
        _icall_Unit(cancelRequestMethodBind, this.rawMemory)
    }


    private val getHttpClientStatusMethodBind: CPointer<godot_method_bind> by lazy { getMB("HTTPRequest", "get_http_client_status") }
    open fun getHttpClientStatus(): HTTPClient.Status {
        return HTTPClient.Status.fromInt(_icall_Int(getHttpClientStatusMethodBind, this.rawMemory))
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
    open fun setBodySizeLimit(bytes: Int) {
        _icall_Unit_Int(setBodySizeLimitMethodBind, this.rawMemory, bytes)
    }


    private val getBodySizeLimitMethodBind: CPointer<godot_method_bind> by lazy { getMB("HTTPRequest", "get_body_size_limit") }
    open fun getBodySizeLimit(): Int {
        return _icall_Int(getBodySizeLimitMethodBind, this.rawMemory)
    }


    private val setMaxRedirectsMethodBind: CPointer<godot_method_bind> by lazy { getMB("HTTPRequest", "set_max_redirects") }
    open fun setMaxRedirects(amount: Int) {
        _icall_Unit_Int(setMaxRedirectsMethodBind, this.rawMemory, amount)
    }


    private val getMaxRedirectsMethodBind: CPointer<godot_method_bind> by lazy { getMB("HTTPRequest", "get_max_redirects") }
    open fun getMaxRedirects(): Int {
        return _icall_Int(getMaxRedirectsMethodBind, this.rawMemory)
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
    open fun getDownloadedBytes(): Int {
        return _icall_Int(getDownloadedBytesMethodBind, this.rawMemory)
    }


    private val getBodySizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("HTTPRequest", "get_body_size") }
    open fun getBodySize(): Int {
        return _icall_Int(getBodySizeMethodBind, this.rawMemory)
    }


    open fun _redirect_request(arg0: String) {
    }


    open fun _request_done(arg0: Int, arg1: Int, arg2: PoolStringArray, arg3: PoolByteArray) {
    }


}
