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
        OUTPUT_DIR ../project
        LIBRARY_PATH samples.gdnlib
        CONFIGS
            src/main/kotlin/godot/samples/games/shmup/classes.json
            src/main/kotlin/godot/samples/games/dodge/classes.json
)
