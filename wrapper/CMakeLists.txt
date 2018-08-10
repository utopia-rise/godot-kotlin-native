cmake_minimum_required(VERSION 3.8)
set(CMAKE_MODULE_PATH ${CMAKE_CURRENT_LIST_DIR}/KotlinCMakeModule)
project(wrapper Kotlin C)


set(CMAKE_EXECUTABLE_SUFFIX "")
set(CMAKE_SHARED_LIBRARY_PREFIX "lib")



set(CINTEROP_LIB_NAME godot)
set(KLIB_NAME godot_wrapper_api)
set(SHARED_LIB_NAME godot_wrapper)



if (NOT GODOT_HEADERS_PATH)
    set(GODOT_HEADERS_PATH lib/godot_headers)
endif()


cinterop(
        NAME ${CINTEROP_LIB_NAME}
        DEF_FILE src/main/c_interop/godot.def
)

konanc_library(
        NAME ${KLIB_NAME}
        SOURCES src/main/kotlin
        LIBRARIES ${CINTEROP_LIB_NAME}
)

konanc_dynamic(
        NAME ${SHARED_LIB_NAME}
        SOURCES src/shared
        LIBRARIES ${CINTEROP_LIB_NAME} ${KLIB_NAME}
)

konanc_dynamic(
        NAME ${SHARED_LIB_NAME}_test
        SOURCES src/shared/entry.kt src/shared/main.kt src/test
        LIBRARIES ${CINTEROP_LIB_NAME} ${KLIB_NAME}
)