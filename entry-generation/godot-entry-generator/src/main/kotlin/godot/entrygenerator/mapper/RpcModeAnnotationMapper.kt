package godot.entrygenerator.mapper

import com.squareup.kotlinpoet.ClassName

object RpcModeAnnotationMapper {
    /**
     * maps RpcModeAnnotations and RPCMode registration enums to ClassNames to provide import informations for kotlinPoet
     */
    fun mapRpcModeAnnotationToClassName(rpcModeAnnotationAsString: String): ClassName {
        return when (rpcModeAnnotationAsString) {
            "godot.registration.RPCMode.DISABLED" -> ClassName("godot.registration.RPCMode", "DISABLED")
            "godot.registration.RPCMode.REMOTE" -> ClassName("godot.registration.RPCMode", "REMOTE")
            "godot.registration.RPCMode.MASTER" -> ClassName("godot.registration.RPCMode", "MASTER")
            "godot.registration.RPCMode.PUPPET" -> ClassName("godot.registration.RPCMode", "PUPPET")
            "godot.registration.RPCMode.REMOTE_SYNC" -> ClassName("godot.registration.RPCMode", "REMOTE_SYNC")
            "godot.registration.RPCMode.MASTER_SYNC" -> ClassName("godot.registration.RPCMode", "MASTER_SYNC")
            "godot.registration.RPCMode.PUPPET_SYNC" -> ClassName("godot.registration.RPCMode", "PUPPET_SYNC")
            else -> throw IllegalArgumentException("Unknown annotation or registration $rpcModeAnnotationAsString")
        }
    }
}
