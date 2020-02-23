package org.godotengine.kotlin.entrygenerator.mapper

import com.squareup.kotlinpoet.ClassName
import org.godotengine.kotlin.annotation.*

class RpcModeAnnotationMapper {
    companion object {
        fun mapRpcModeAnnotationToClassName(rpcModeAnnotationAsString: String): ClassName {
            return when(rpcModeAnnotationAsString) {
                Disabled::class.java.name, "godot.registration.RPCMode.Disabled" -> ClassName("godot.registration.RPCMode", "Disabled")
                Remote::class.java.name, "godot.registration.RPCMode.Remote" -> ClassName("godot.registration.RPCMode", "Remote")
                Sync::class.java.name, "godot.registration.RPCMode.Sync" -> ClassName("godot.registration.RPCMode", "Sync")
                Master::class.java.name, "godot.registration.RPCMode.Master" -> ClassName("godot.registration.RPCMode", "Master")
                Puppet::class.java.name, "godot.registration.RPCMode.Puppet" -> ClassName("godot.registration.RPCMode", "Puppet")
                RemoteSync::class.java.name, "godot.registration.RPCMode.RemoteSync" -> ClassName("godot.registration.RPCMode", "RemoteSync")
                MasterSync::class.java.name, "godot.registration.RPCMode.MasterSync" -> ClassName("godot.registration.RPCMode", "MasterSync")
                PuppetSync::class.java.name, "godot.registration.RPCMode.PuppetSync" -> ClassName("godot.registration.RPCMode", "PuppetSync")
                else -> throw IllegalArgumentException("Unknown annotation or registration $rpcModeAnnotationAsString")
            }
        }
    }
}