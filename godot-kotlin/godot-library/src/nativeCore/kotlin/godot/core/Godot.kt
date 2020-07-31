package godot.core

import godot.gdnative.*
import godot.internal.type.nullSafe
import godot.registerEngineTypes
import kotlinx.cinterop.*
import kotlin.native.concurrent.AtomicInt
import kotlin.native.concurrent.AtomicReference

object Godot {
    private val gdnativeWrapper = AtomicReference<CPointer<godot_gdnative_core_api_struct>?>(null)
    private val nativescriptWrapper = AtomicReference<CPointer<godot_gdnative_ext_nativescript_api_struct>?>(null)

    internal val gdnative: godot_gdnative_core_api_struct
        get() = nullSafe(gdnativeWrapper.value).pointed

    internal val gdnative11: godot_gdnative_core_1_1_api_struct
        get() = nullSafe(gdnative.next).reinterpret<godot_gdnative_core_1_1_api_struct>().pointed

    internal val gdnative12: godot_gdnative_core_1_2_api_struct
        get() = nullSafe(gdnative11.next).reinterpret<godot_gdnative_core_1_2_api_struct>().pointed

    @PublishedApi
    internal val nativescript: godot_gdnative_ext_nativescript_api_struct
        get() = nullSafe(nativescriptWrapper.value).pointed

    @PublishedApi
    internal val nativescript11: godot_gdnative_ext_nativescript_1_1_api_struct
        get() = nullSafe(nativescript.next).reinterpret<godot_gdnative_ext_nativescript_1_1_api_struct>().pointed

    internal val languageIndex: Int
        get() = languageIndexRef.value

    private val languageIndexRef = AtomicInt(-1)

    private val initHandle = AtomicInt(0)

    fun init(options: godot_gdnative_init_options) {
        val gdnative = nullSafe(options.api_struct)
        val extensionCount = gdnative.pointed.num_extensions.toInt()
        val extensions = nullSafe(gdnative.pointed.extensions)
        lateinit var nativescript: CPointer<godot_gdnative_ext_nativescript_api_struct>
        (0 until extensionCount).forEach { i ->
            val extension = nullSafe(extensions[i])
            val type = extension.pointed.type
            when (GDNATIVE_API_TYPES.byValue(type)) {
                GDNATIVE_API_TYPES.GDNATIVE_EXT_NATIVESCRIPT -> {
                    nativescript = extension.reinterpret()
                }
                else -> {
                }
            }
        }

        gdnativeWrapper.compareAndSwap(null, gdnative)
        nativescriptWrapper.compareAndSwap(null, nativescript)
    }

    fun nativescriptInit(handle: COpaquePointer) {
        memScoped {
            val info = cValue<godot_instance_binding_functions> {
                alloc_instance_binding_data = staticCFunction(::createWrapper)
                free_instance_binding_data = staticCFunction(::destroyWrapper)
            }
            val index = nullSafe(nativescript11.godot_nativescript_register_instance_binding_data_functions)(
                info
            )
            languageIndexRef.compareAndSet(languageIndexRef.value, index)
        }
        TypeManager.registerEngineTypes()
    }

    fun nativescriptTerminate(handle: COpaquePointer) {
        TypeManager.dispose()
        nullSafe(nativescript11.godot_nativescript_unregister_instance_binding_data_functions)(languageIndex)
    }

    fun terminate(options: godot_gdnative_terminate_options) {
        gdnativeWrapper.compareAndSwap(gdnativeWrapper.value, null)
        nativescriptWrapper.compareAndSwap(nativescriptWrapper.value, null)
    }

    fun shouldInitPtr(): Boolean = initHandle.value == 0

    fun <T> noInitZone(cb: () -> T): T {
        initHandle.compareAndSet(initHandle.value, 1)
        val ret = cb()
        initHandle.compareAndSet(initHandle.value, 0)
        return ret
    }

    internal fun print(message: String) {
        memScoped {
            nullSafe(gdnative.godot_print)(message.toGDString().value.ptr)
        }
    }

    internal fun printWarning(description: String, function: String, file: String, line: Int) {
        memScoped {
            nullSafe(gdnative.godot_print_warning)(description.cstr.ptr, function.cstr.ptr, file.cstr.ptr, line)
        }
    }

    internal fun printError(description: String, function: String, file: String, line: Int) {
        memScoped {
            nullSafe(gdnative.godot_print_error)(description.cstr.ptr, function.cstr.ptr, file.cstr.ptr, line)
        }
    }
}
