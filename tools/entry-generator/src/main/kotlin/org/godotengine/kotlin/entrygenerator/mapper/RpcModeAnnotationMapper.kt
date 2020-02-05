package org.godotengine.kotlin.entrygenerator.mapper

import com.squareup.kotlinpoet.ClassName
import org.godotengine.kotlin.annotation.*

class RpcModeAnnotationMapper {
    companion object {
        fun mapRpcModeAnnotationToClassName(rpcModeAnnotationAsString: String): ClassName {
            return when(rpcModeAnnotationAsString) {
                Remote::class.java.name -> ClassName("godot.registration.RPCMode", "Remote")
                Sync::class.java.name -> ClassName("godot.registration.RPCMode", "Sync")
                Master::class.java.name -> ClassName("godot.registration.RPCMode", "Master")
                Slave::class.java.name -> ClassName("godot.registration.RPCMode", "Slave")
                RemoteSync::class.java.name -> ClassName("godot.registration.RPCMode", "RemoteSync")
                MasterSync::class.java.name -> ClassName("godot.registration.RPCMode", "MasterSync")
                SlaveSync::class.java.name -> ClassName("godot.registration.RPCMode", "SlaveSync")
                else -> throw IllegalArgumentException("Unknown annotation $rpcModeAnnotationAsString")
            }
        }
    }
}