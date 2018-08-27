macro(prepare_godot_args)
    cmake_parse_arguments(
            GODOT
            ""
            "NAME;TARGET"
            "CONFIGS;SOURCES;LIBRARIES;LINKER_OPTS"
            ${ARGN}
    )

    if (NOT GODOT_CONFIGS)
        message(FATAL_ERROR "You must provide a list of configs with registrations for Godot")
    endif ()

    set(GODOT_CONFIGS_FULL_PATHES "")
    foreach (CONFIG ${GODOT_CONFIGS})
        list(APPEND GODOT_CONFIGS_FULL_PATHES ${CMAKE_CURRENT_SOURCE_DIR}/${CONFIG})
    endforeach ()

endmacro()


function(godot_library)
    prepare_godot_args(${ARGV})

    if (NOT GDNative)
        klib(NAME GDNative
            PATH ${GODOT_CMAKE_MODULE_PATH}/lib/GDNative.klib)
    endif()

    if (NOT Godot)
        klib(NAME Godot
            PATH ${GODOT_CMAKE_MODULE_PATH}/lib/Godot.klib
            LIBRARIES GDNative)
    endif()

    add_custom_command(
            OUTPUT ${GODOT_CMAKE_MODULE_PATH}/Entry.kt
            PRE_BUILD
            COMMAND java -jar ${GODOT_CMAKE_MODULE_PATH}/entry_generator.jar ${GODOT_CONFIGS_FULL_PATHES} -o ${GODOT_CMAKE_MODULE_PATH}/Entry.kt)

    konanc_dynamic(
            NAME ${GODOT_NAME}
            TARGET ${GODOT_TARGET}
            SOURCES GodotCMakeModule/Entry.kt ${GODOT_SOURCES} # TODO: remove hardcoded
            LIBRARIES GDNative Godot ${GODOT_LIBRARIES}
            LINKER_OPTS ${GODOT_LINKER_OPTS}
    )

endfunction()
