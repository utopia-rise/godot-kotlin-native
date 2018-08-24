cmake_minimum_required(VERSION 3.8)
set(CMAKE_MODULE_PATH ${CMAKE_CURRENT_LIST_DIR}/KotlinCMakeModule)
project(wrapper Kotlin C)


set(CMAKE_EXECUTABLE_SUFFIX "")



set(CINTEROP_LIB_NAME GDNative)
set(KLIB_NAME Godot)

set(SAMPLES_LIB_DIR ${CMAKE_CURRENT_SOURCE_DIR}/../samples/project/Kotlin/lib)



if (NOT GODOT_HEADERS_PATH)
    set(GODOT_HEADERS_PATH ../lib/godot_headers)
endif()



cinterop(
        NAME ${CINTEROP_LIB_NAME}
        DEF_FILE src/main/c_interop/godot.def
        COMPILER_OPTS -I${GODOT_HEADERS_PATH} -I${CMAKE_CURRENT_SOURCE_DIR}/src/main/c_interop
)

konanc_library(
        NAME ${KLIB_NAME}
        SOURCES src/main/kotlin
        LIBRARIES ${CINTEROP_LIB_NAME}
)



add_custom_target(CopyLibsToSamples
        DEPENDS ${CINTEROP_LIB_NAME} ${KLIB_NAME})
add_custom_command(TARGET CopyLibsToSamples
        COMMAND ${CMAKE_COMMAND} -E copy ${LIBRARY_${CINTEROP_LIB_NAME}_OUTPUT} ${SAMPLES_LIB_DIR}
        COMMAND ${CMAKE_COMMAND} -E copy ${LIBRARY_${KLIB_NAME}_OUTPUT} ${SAMPLES_LIB_DIR})


konanc_dynamic(
        NAME tests
        SOURCES src/test
        LIBRARIES ${CINTEROP_LIB_NAME} ${KLIB_NAME}
)