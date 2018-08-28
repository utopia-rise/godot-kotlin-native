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
        OUTPUT_DIR output
        LIBRARY_PATH res://Samples.gdnlib
        CONFIGS src/main/kotlin/Games/shmup/classes.json src/main/kotlin/games/dodge/classes.json
)
