macro(prepare_godot_args)
    cmake_parse_arguments(
            GODOT
            ""
            "NAME;TARGET"
            "CONFIGS;OUTPUT_DIR;LIBRARY_PATH;SOURCES;LIBRARIES;LINKER_OPTS"
            ${ARGN}
    )

    if (NOT GODOT_CONFIGS)
        message(FATAL_ERROR "You must provide a list of configs with registrations for Godot")
    endif ()

    set(GODOT_LIBRARY_PATH_FLAG)
    if (GODOT_LIBRARY_PATH)
        set(GODOT_LIBRARY_PATH_FLAG -lib "${GODOT_LIBRARY_PATH}")
    endif()

    set(GODOT_OUTPUT_DIR_FLAG)
    if (GODOT_OUTPUT_DIR)
        set(GODOT_OUTPUT_DIR_FLAG --output-dir "${CMAKE_CURRENT_SOURCE_DIR}/${GODOT_OUTPUT_DIR}")
    endif()

    set(GODOT_CONFIGS_FULL_PATHES "")
    foreach (CONFIG ${GODOT_CONFIGS})
        list(APPEND GODOT_CONFIGS_FULL_PATHES "${CMAKE_CURRENT_SOURCE_DIR}/${CONFIG}")
    endforeach ()

endmacro()


function(godot_library)
    prepare_godot_args(${ARGV})

    if (NOT GDNative)
        klib(NAME GDNative
            PATH ${GODOT_CMAKE_MODULE_PATH}/lib/GDNative.klib
        )
    endif()

    if (NOT Godot)
        klib(NAME Godot
            PATH ${GODOT_CMAKE_MODULE_PATH}/lib/Godot.klib
            LIBRARIES GDNative
        )
    endif()

    add_custom_command(
            OUTPUT ${GODOT_CMAKE_MODULE_PATH}/Entry.kt
            DEPENDS ${GODOT_CONFIGS_FULL_PATHES}
            PRE_BUILD
            COMMAND java -jar "${GODOT_CMAKE_MODULE_PATH}/entry_generator.jar" ${GODOT_CONFIGS_FULL_PATHES}
            -o "${GODOT_CMAKE_MODULE_PATH}/Entry.kt"
            ${GODOT_LIBRARY_PATH_FLAG} ${GODOT_OUTPUT_DIR_FLAG}
    )

    konanc_dynamic(
            NAME ${GODOT_NAME}
            TARGET ${GODOT_TARGET}
            SOURCES GodotCMakeModule/Entry.kt ${GODOT_SOURCES} # TODO: remove hardcoded
            LIBRARIES GDNative Godot ${GODOT_LIBRARIES}
            LINKER_OPTS ${GODOT_LINKER_OPTS}
    )

    if (GODOT_OUTPUT_DIR)
        set(OUTPUT_BINARY ${CMAKE_CURRENT_SOURCE_DIR}/${GODOT_OUTPUT_DIR}/${GODOT_NAME}${CMAKE_SHARED_LIBRARY_SUFFIX})

        add_custom_command(
                OUTPUT ${OUTPUT_BINARY}
                DEPENDS ${GODOT_NAME} ${LIBRARY_${GODOT_NAME}_OUTPUT}
                PRE_LINK
                COMMAND ${CMAKE_COMMAND} -E remove ${OUTPUT_BINARY}
                COMMAND ${CMAKE_COMMAND} -E rename ${LIBRARY_${GODOT_NAME}_OUTPUT} ${OUTPUT_BINARY} # TODO: copy
        )
        add_custom_target(${GODOT_NAME}.output
                DEPENDS ${OUTPUT_BINARY}
                SOURCES ${GODOT_SOURCES})
    endif()

endfunction()
