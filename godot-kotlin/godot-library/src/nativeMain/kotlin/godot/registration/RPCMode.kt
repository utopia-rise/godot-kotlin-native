package godot.registration

//TODO: temporary enum class! Needs to be properly implemented! Implementation was done to be able to implement register annotations
enum class RPCMode {
    Disabled,
    Remote,
    Sync,
    Master,
    Slave,
    Puppet,
    RemoteSync,
    MasterSync,
    PuppetSync
}