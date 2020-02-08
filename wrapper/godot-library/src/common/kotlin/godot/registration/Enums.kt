package godot.registration

expect enum class RPCMode {
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


expect class PropertyUsage {
    companion object {
        val AnimateAsTrigger: PropertyUsage
        val Category: PropertyUsage
        val Checkable: PropertyUsage
        val Checked: PropertyUsage
        val Default: PropertyUsage
        val DefaultIntl: PropertyUsage
        val Editor: PropertyUsage
        val EditorHelper: PropertyUsage
        val Group: PropertyUsage
        val Internationalized: PropertyUsage
        val Network: PropertyUsage
        val NoEditor: PropertyUsage
        val NoInstanceState: PropertyUsage
        val RestartIfChanged: PropertyUsage
        val ScriptVariable: PropertyUsage
        val Storage: PropertyUsage
        val StoreIfNoNone: PropertyUsage
        val StoreIfNonZero: PropertyUsage
        val StoreIfNull: PropertyUsage
        val UpdateAllIfModified: PropertyUsage
    }

    infix fun or(other: PropertyUsage): PropertyUsage
}


expect enum class PropertyHint {
    Range,
    ExpRange,
    Enum,
    ExpEasing,
    Length,
    SpriteFrame,
    KeyAccel,
    Flags,
    Layers2dRender,
    Layers2dPhysics,
    Layers3dRender,
    Layers3dPhysics,
    File,
    Dir,
    GlobalFile,
    GlobalDir,
    ResourceType,
    MultilineText,
    PlaceholderText,
    ColorNoAlpha,
    ImageCompressLossy,
    ImageCompressLossless,
    ObjectId,
    TypeString,
    NodePathToEditedNode,
    MethodOfVariantType,
    MethodOfBaseType,
    MethodOfInstance,
    MethodOfScript,
    PropertyOfVariantType,
    PropertyOfBaseType,
    PropertyOfInstance,
    PropertyOfScript,
    Max;
}
