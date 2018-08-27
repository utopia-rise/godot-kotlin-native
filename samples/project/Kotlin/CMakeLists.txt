cmake_minimum_required(VERSION 3.8)

# Kotlin compiler
set(CMAKE_MODULE_PATH ${CMAKE_CURRENT_LIST_DIR}/KotlinCMakeModule)

# Godot files
set(GODOT_CMAKE_MODULE_PATH ${CMAKE_CURRENT_LIST_DIR}/GodotCMakeModule)
include(${GODOT_CMAKE_MODULE_PATH}/CMakeGodot.cmake)


project(samples Kotlin)


godot_library(
        NAME samples
        SOURCES src/main/kotlin
        CONFIGS src/main/kotlin/Games/shmup/classes.json
)


set(LIB_DESTINATION_PATH ${CMAKE_CURRENT_SOURCE_DIR}/../project)


add_custom_target(MoveDllToProjectDir
        DEPENDS samples)
add_custom_command(TARGET MoveDllToProjectDir
        COMMAND ${CMAKE_COMMAND} -E rename ${LIBRARY_samples_OUTPUT} ${LIB_DESTINATION_PATH}/samples${CMAKE_SHARED_LIBRARY_SUFFIX})