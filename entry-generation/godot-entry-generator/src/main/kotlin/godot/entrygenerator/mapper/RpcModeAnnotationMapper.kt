package godot.entrygenerator.mapper

import com.squareup.kotlinpoet.ClassName

object RpcModeAnnotationMapper {
    /**
     * maps RpcModeAnnotations and RPCMode registration enums to ClassNames to provide import informations for kotlinPoet
     */
    fun mapRpcModeAnnotationToClassName(rpcModeAnnotationAsString: String): ClassName {
        return when (rpcModeAnnotationAsString) {
            "godot.registration.RPCMode.Disabled" -> ClassName("godot.registration.RPCMode", "Disabled")
            "godot.registration.RPCMode.Remote" -> ClassName("godot.registration.RPCMode", "Remote")
            "godot.registration.RPCMode.Sync" -> ClassName("godot.registration.RPCMode", "Sync")
            "godot.registration.RPCMode.Master" -> ClassName("godot.registration.RPCMode", "Master")
            "godot.registration.RPCMode.Puppet" -> ClassName("godot.registration.RPCMode", "Puppet")
            "godot.registration.RPCMode.RemoteSync" -> ClassName("godot.registration.RPCMode", "RemoteSync")
            "godot.registration.RPCMode.MasterSync" -> ClassName("godot.registration.RPCMode", "MasterSync")
            "godot.registration.RPCMode.PuppetSync" -> ClassName("godot.registration.RPCMode", "PuppetSync")
            else -> throw IllegalArgumentException("Unknown annotation or registration $rpcModeAnnotationAsString")
        }
    }
}
