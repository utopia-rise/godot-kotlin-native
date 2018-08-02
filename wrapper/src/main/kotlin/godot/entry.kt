package kotlin.godot

import godot.godot_gdnative_core_api_struct
import godot.godot_gdnative_ext_nativescript_api_struct


lateinit var API: godot_gdnative_core_api_struct
lateinit var NativeScript_API: godot_gdnative_ext_nativescript_api_struct


fun godot_wrapper_entry(api: godot_gdnative_core_api_struct, nativescript_api: godot_gdnative_ext_nativescript_api_struct) {
    API = api
    NativeScript_API = nativescript_api

    g_print() // TODO: move out
}