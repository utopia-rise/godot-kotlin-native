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


set(LIB_DESTINATION_PATH ${CMAKE_CURRENT_SOURCE_DIR}/../project)


add_custom_target(MoveDllToProjectDir
        DEPENDS samples)
add_custom_command(TARGET MoveDllToProjectDir
        COMMAND ${CMAKE_COMMAND} -E rename ${LIBRARY_samples_OUTPUT} ${LIB_DESTINATION_PATH}/samples${CMAKE_SHARED_LIBRARY_SUFFIX})