package kotlin.godot.entry

import godot.*
import konan.internal.CName
import kotlinx.cinterop.*
import kotlin.godot.registration.*



@CName("godot_gdnative_init")
fun ___godot_wrapper_gdnative_init(options: godot_gdnative_init_options) {
    godot_wrapper_gdnative_init(options.ptr)
}

@CName("godot_gdnative_terminate")
fun ___godot_wrapper_gdnative_terminate(options: godot_gdnative_terminate_options) {
    godot_wrapper_gdnative_terminate(options.ptr)
}

@CName("godot_nativescript_init")
fun ___godot_wrapper_nativescript_init(handle: COpaquePointer) {
    godot_wrapper_nativescript_init(handle)
    GodotApiClasses.registerAll()
    UserDefinedClasses.registerAll()

    // Uncomment to enable testing, use "godot_wrapper_test" build config
    //testAll()
}