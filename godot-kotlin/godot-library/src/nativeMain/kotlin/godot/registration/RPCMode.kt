package godot.registration

//TODO: temporary enum class! Needs to be properly implemented! Implementation was done to be able to implement register annotations
enum class RPCMode {
    DISABLED,
    REMOTE,
    SYNC,
    MASTER,
    SLAVE,
    PUPPET,
    REMOTE_SYNC,
    MASTER_SYNC,
    PUPPET_SYNC
}