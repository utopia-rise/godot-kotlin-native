cmake_minimum_required(VERSION 3.8)
set(CMAKE_MODULE_PATH ${CMAKE_CURRENT_LIST_DIR}/KotlinCMakeModule)
project(samples Kotlin)


klib(
        NAME GDNative
        PATH lib/GDNative.klib
)

klib(
        NAME Godot
        PATH lib/Godot.klib
        LIBRARIES GDNative
)

konanc_dynamic(
        NAME samples
        SOURCES src/main/kotlin
        LIBRARIES GDNative Godot
)