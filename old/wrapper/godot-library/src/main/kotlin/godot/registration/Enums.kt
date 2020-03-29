package godot.registration

import godot.gdnative.*


enum class RPCMode(val value: godot_method_rpc_mode) {
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


class PropertyUsage internal constructor(val value: godot_property_usage_flags) {
    companion object {
        val AnimateAsTrigger = PropertyUsage(GODOT_PROPERTY_USAGE_ANIMATE_AS_TRIGGER)
        val Category = PropertyUsage(GODOT_PROPERTY_USAGE_CATEGORY)
        val Checkable = PropertyUsage(GODOT_PROPERTY_USAGE_CHECKABLE)
        val Checked = PropertyUsage(GODOT_PROPERTY_USAGE_CHECKED)
        val Default = PropertyUsage(GODOT_PROPERTY_USAGE_DEFAULT)
        val DefaultIntl = PropertyUsage(GODOT_PROPERTY_USAGE_DEFAULT_INTL)
        val Editor = PropertyUsage(GODOT_PROPERTY_USAGE_EDITOR)
        val EditorHelper = PropertyUsage(GODOT_PROPERTY_USAGE_EDITOR_HELPER)
        val Group = PropertyUsage(GODOT_PROPERTY_USAGE_GROUP)
        val Internationalized = PropertyUsage(GODOT_PROPERTY_USAGE_INTERNATIONALIZED)
        val Network = PropertyUsage(GODOT_PROPERTY_USAGE_NETWORK)
        val NoEditor = PropertyUsage(GODOT_PROPERTY_USAGE_NOEDITOR)
        val NoInstanceState = PropertyUsage(GODOT_PROPERTY_USAGE_NO_INSTANCE_STATE)
        val RestartIfChanged = PropertyUsage(GODOT_PROPERTY_USAGE_RESTART_IF_CHANGED)
        val ScriptVariable = PropertyUsage(GODOT_PROPERTY_USAGE_SCRIPT_VARIABLE)
        val Storage = PropertyUsage(GODOT_PROPERTY_USAGE_STORAGE)
        val StoreIfNoNone = PropertyUsage(GODOT_PROPERTY_USAGE_STORE_IF_NONONE)
        val StoreIfNonZero = PropertyUsage(GODOT_PROPERTY_USAGE_STORE_IF_NONZERO)
        val StoreIfNull = PropertyUsage(GODOT_PROPERTY_USAGE_STORE_IF_NULL)
        val UpdateAllIfModified = PropertyUsage(GODOT_PROPERTY_USAGE_UPDATE_ALL_IF_MODIFIED)
    }


    infix fun or(other: PropertyUsage) = PropertyUsage(value or other.value)
}


enum class PropertyHint(val value: godot_property_hint) {
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