package kotlin.godot.core

import godot.*
import kotlinx.cinterop.*

lateinit var api: godot_gdnative_core_api_struct
lateinit var nativescript_api: godot_gdnative_ext_nativescript_api_struct
lateinit var nativescript_handle: COpaquePointer


class Godot{
    companion object {
        fun print(message: GodotString) {
            message.godotString.useContents {
                godot_print(this.ptr)
            }
        }

        fun print(message: String){
            memScoped {
                val gMessage = alloc<godot_string>()

                godot_string_new(gMessage.ptr)
                godot_string_parse_utf8(gMessage.ptr, message)
                godot_print(gMessage.ptr)
            }
        }

        fun print_warning(description: GodotString, function: GodotString, file: GodotString, line: Int) {
            godot_print_warning(description.toString(), function.toString(), file.toString(), line)
        }

        fun print_warning(description: String, function: String, file: String, line: Int) {
            godot_print_warning(description, function, file, line)
        }

        fun print_error(description: GodotString, function: GodotString, file: GodotString, line: Int) {
            godot_print_error(description.toString(), function.toString(), file.toString(), line)
        }

        fun print_error(description: String, function: String, file: String, line: Int) {
            godot_print_error(description, function, file, line)
        }

        fun gdnative_init(options: godot_gdnative_init_options) {
            api = options.api_struct?.pointed!!
            memScoped {
                set_api(api.ptr)
            }

            for (i in 0..api.num_extensions) {
                when (api.extensions?.get(i)?.pointed?.type) {
                    GDNATIVE_API_TYPES.GDNATIVE_EXT_NATIVESCRIPT.value -> nativescript_api = api.extensions?.get(i)?.pointed?.reinterpret()!!
                }
            }
        }

        fun gdnative_terminate(options: CPointer<godot_gdnative_terminate_options>) {

        }

        fun nativescript_init(handle: COpaquePointer) {
            nativescript_handle = handle
        }
    }
}