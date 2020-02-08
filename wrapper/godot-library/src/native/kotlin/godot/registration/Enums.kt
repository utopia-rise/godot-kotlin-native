package godot.registration

import godot.gdnative.*

actual enum class RPCMode(val value: godot_method_rpc_mode) {
    Disabled(GODOT_METHOD_RPC_MODE_DISABLED),
    Remote(GODOT_METHOD_RPC_MODE_REMOTE),
    Sync(GODOT_METHOD_RPC_MODE_SYNC),
    Master(GODOT_METHOD_RPC_MODE_MASTER),
    Slave(GODOT_METHOD_RPC_MODE_SLAVE),
    Puppet(GODOT_METHOD_RPC_MODE_PUPPET),
    RemoteSync(GODOT_METHOD_RPC_MODE_REMOTESYNC),
    MasterSync(GODOT_METHOD_RPC_MODE_MASTERSYNC),
    PuppetSync(GODOT_METHOD_RPC_MODE_PUPPETSYNC)
}


actual class PropertyUsage internal constructor(val value: godot_property_usage_flags) {
    actual companion object {
        actual val AnimateAsTrigger = PropertyUsage(GODOT_PROPERTY_USAGE_ANIMATE_AS_TRIGGER)
        actual val Category = PropertyUsage(GODOT_PROPERTY_USAGE_CATEGORY)
        actual val Checkable = PropertyUsage(GODOT_PROPERTY_USAGE_CHECKABLE)
        actual val Checked = PropertyUsage(GODOT_PROPERTY_USAGE_CHECKED)
        actual val Default = PropertyUsage(GODOT_PROPERTY_USAGE_DEFAULT)
        actual val DefaultIntl = PropertyUsage(GODOT_PROPERTY_USAGE_DEFAULT_INTL)
        actual val Editor = PropertyUsage(GODOT_PROPERTY_USAGE_EDITOR)
        actual val EditorHelper = PropertyUsage(GODOT_PROPERTY_USAGE_EDITOR_HELPER)
        actual val Group = PropertyUsage(GODOT_PROPERTY_USAGE_GROUP)
        actual val Internationalized = PropertyUsage(GODOT_PROPERTY_USAGE_INTERNATIONALIZED)
        actual val Network = PropertyUsage(GODOT_PROPERTY_USAGE_NETWORK)
        actual val NoEditor = PropertyUsage(GODOT_PROPERTY_USAGE_NOEDITOR)
        actual val NoInstanceState = PropertyUsage(GODOT_PROPERTY_USAGE_NO_INSTANCE_STATE)
        actual val RestartIfChanged = PropertyUsage(GODOT_PROPERTY_USAGE_RESTART_IF_CHANGED)
        actual val ScriptVariable = PropertyUsage(GODOT_PROPERTY_USAGE_SCRIPT_VARIABLE)
        actual val Storage = PropertyUsage(GODOT_PROPERTY_USAGE_STORAGE)
        actual val StoreIfNoNone = PropertyUsage(GODOT_PROPERTY_USAGE_STORE_IF_NONONE)
        actual val StoreIfNonZero = PropertyUsage(GODOT_PROPERTY_USAGE_STORE_IF_NONZERO)
        actual val StoreIfNull = PropertyUsage(GODOT_PROPERTY_USAGE_STORE_IF_NULL)
        actual val UpdateAllIfModified = PropertyUsage(GODOT_PROPERTY_USAGE_UPDATE_ALL_IF_MODIFIED)
    }


    actual infix fun or(other: PropertyUsage) = PropertyUsage(value or other.value)
}


actual enum class PropertyHint(val value: godot_property_hint) {
    None(godot_property_hint.GODOT_PROPERTY_HINT_NONE),
    Range(godot_property_hint.GODOT_PROPERTY_HINT_RANGE),
    ExpRange(godot_property_hint.GODOT_PROPERTY_HINT_EXP_RANGE),
    Enum(godot_property_hint.GODOT_PROPERTY_HINT_ENUM),
    ExpEasing(godot_property_hint.GODOT_PROPERTY_HINT_EXP_EASING),
    Length(godot_property_hint.GODOT_PROPERTY_HINT_LENGTH),
    SpriteFrame(godot_property_hint.GODOT_PROPERTY_HINT_SPRITE_FRAME),
    KeyAccel(godot_property_hint.GODOT_PROPERTY_HINT_KEY_ACCEL),
    Flags(godot_property_hint.GODOT_PROPERTY_HINT_FLAGS),
    Layers2dRender(godot_property_hint.GODOT_PROPERTY_HINT_LAYERS_2D_RENDER),
    Layers2dPhysics(godot_property_hint.GODOT_PROPERTY_HINT_LAYERS_2D_PHYSICS),
    Layers3dRender(godot_property_hint.GODOT_PROPERTY_HINT_LAYERS_3D_RENDER),
    Layers3dPhysics(godot_property_hint.GODOT_PROPERTY_HINT_LAYERS_3D_PHYSICS),
    File(godot_property_hint.GODOT_PROPERTY_HINT_FILE),
    Dir(godot_property_hint.GODOT_PROPERTY_HINT_DIR),
    GlobalFile(godot_property_hint.GODOT_PROPERTY_HINT_GLOBAL_FILE),
    GlobalDir(godot_property_hint.GODOT_PROPERTY_HINT_GLOBAL_DIR),
    ResourceType(godot_property_hint.GODOT_PROPERTY_HINT_RESOURCE_TYPE),
    MultilineText(godot_property_hint.GODOT_PROPERTY_HINT_MULTILINE_TEXT),
    PlaceholderText(godot_property_hint.GODOT_PROPERTY_HINT_PLACEHOLDER_TEXT),
    ColorNoAlpha(godot_property_hint.GODOT_PROPERTY_HINT_COLOR_NO_ALPHA),
    ImageCompressLossy(godot_property_hint.GODOT_PROPERTY_HINT_IMAGE_COMPRESS_LOSSY),
    ImageCompressLossless(godot_property_hint.GODOT_PROPERTY_HINT_IMAGE_COMPRESS_LOSSLESS),
    ObjectId(godot_property_hint.GODOT_PROPERTY_HINT_OBJECT_ID),
    TypeString(godot_property_hint.GODOT_PROPERTY_HINT_TYPE_STRING),
    NodePathToEditedNode(godot_property_hint.GODOT_PROPERTY_HINT_NODE_PATH_TO_EDITED_NODE),
    MethodOfVariantType(godot_property_hint.GODOT_PROPERTY_HINT_METHOD_OF_VARIANT_TYPE),
    MethodOfBaseType(godot_property_hint.GODOT_PROPERTY_HINT_METHOD_OF_BASE_TYPE),
    MethodOfInstance(godot_property_hint.GODOT_PROPERTY_HINT_METHOD_OF_INSTANCE),
    MethodOfScript(godot_property_hint.GODOT_PROPERTY_HINT_METHOD_OF_SCRIPT),
    PropertyOfVariantType(godot_property_hint.GODOT_PROPERTY_HINT_PROPERTY_OF_VARIANT_TYPE),
    PropertyOfBaseType(godot_property_hint.GODOT_PROPERTY_HINT_PROPERTY_OF_BASE_TYPE),
    PropertyOfInstance(godot_property_hint.GODOT_PROPERTY_HINT_PROPERTY_OF_INSTANCE),
    PropertyOfScript(godot_property_hint.GODOT_PROPERTY_HINT_PROPERTY_OF_SCRIPT),
    Max(godot_property_hint.GODOT_PROPERTY_HINT_MAX);
}
