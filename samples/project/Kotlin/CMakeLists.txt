cmake_minimum_required(VERSION 3.8)
set(CMAKE_MODULE_PATH ${CMAKE_CURRENT_LIST_DIR}/KotlinCMakeModule)
project(samples Kotlin)



klib(GDNative ${CMAKE_CURRENT_BINARY_DIR}/../lib/GDNative.klib)
klib(Godot ${CMAKE_CURRENT_BINARY_DIR}/../lib/Godot.klib)

konanc_dynamic(
        NAME samples
        SOURCES src/main/kotlin
        LIBRARIES GDNative Godot
)