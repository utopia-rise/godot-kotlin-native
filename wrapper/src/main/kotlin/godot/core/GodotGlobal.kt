package kotlin.godot.core

import godot.*
import kotlinx.cinterop.*

lateinit var api: godot_gdnative_core_api_struct
lateinit var nativescript_api: godot_gdnative_ext_nativescript_api_struct
lateinit var nativescript_handle: COpaquePointer

class Godot{
    fun print(message: String){
        TODO()
    }

    fun print_warning(description: String, function: String, file: String, line: Int){
        TODO()
    }

    fun print_error(description: String, function: String, file: String, line: Int){
        TODO()
    }

    fun gdnative_init(options: CPointer<godot_gdnative_init_options>?){
        api = options?.pointed?.api_struct!!.pointed

        for(i in 0..api.num_extensions){
            when(api.extensions?.get(i)?.pointed?.type){
                GDNATIVE_API_TYPES.GDNATIVE_EXT_NATIVESCRIPT.value -> nativescript_api = api.extensions?.get(i)?.pointed?.reinterpret()!!
            }
        }
    }

    fun gdnative_terminate(options: CPointer<godot_gdnative_terminate_options>){

    }

    fun nativescript_init(handle: COpaquePointer){
        nativescript_handle = handle
    }
}