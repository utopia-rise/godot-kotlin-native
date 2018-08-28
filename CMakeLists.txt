cmake_minimum_required(VERSION 3.12)
project(Kotlin_godot_wrapper C)

set(CMAKE_C_STANDARD 11)

include_directories(.)
include_directories(wrapper)
include_directories(wrapper/lib)
include_directories(wrapper/lib/godot_headers)
include_directories(wrapper/lib/godot_headers/android)
include_directories(wrapper/lib/godot_headers/arvr)
include_directories(wrapper/lib/godot_headers/gdnative)
include_directories(wrapper/lib/godot_headers/nativescript)
include_directories(wrapper/lib/godot_headers/net)
include_directories(wrapper/lib/godot_headers/pluginscript)

add_executable(Kotlin_godot_wrapper
        wrapper/lib/godot_headers/android/godot_android.h
        wrapper/lib/godot_headers/arvr/godot_arvr.h
        wrapper/lib/godot_headers/gdnative/aabb.h
        wrapper/lib/godot_headers/gdnative/array.h
        wrapper/lib/godot_headers/gdnative/basis.h
        wrapper/lib/godot_headers/gdnative/color.h
        wrapper/lib/godot_headers/gdnative/dictionary.h
        wrapper/lib/godot_headers/gdnative/gdnative.h
        wrapper/lib/godot_headers/gdnative/node_path.h
        wrapper/lib/godot_headers/gdnative/plane.h
        wrapper/lib/godot_headers/gdnative/pool_arrays.h
        wrapper/lib/godot_headers/gdnative/quat.h
        wrapper/lib/godot_headers/gdnative/rect2.h
        wrapper/lib/godot_headers/gdnative/rid.h
        wrapper/lib/godot_headers/gdnative/string.h
        wrapper/lib/godot_headers/gdnative/string_name.h
        wrapper/lib/godot_headers/gdnative/transform.h
        wrapper/lib/godot_headers/gdnative/transform2d.h
        wrapper/lib/godot_headers/gdnative/variant.h
        wrapper/lib/godot_headers/gdnative/vector2.h
        wrapper/lib/godot_headers/gdnative/vector3.h
        wrapper/lib/godot_headers/nativescript/godot_nativescript.h
        wrapper/lib/godot_headers/net/godot_net.h
        wrapper/lib/godot_headers/pluginscript/godot_pluginscript.h
        wrapper/lib/godot_headers/gdnative_api_struct.gen.h)
