package godot.entrygenerator.extension

import org.jetbrains.kotlin.js.descriptorUtils.getJetTypeFqName
import org.jetbrains.kotlin.types.KotlinType
import org.jetbrains.kotlin.types.typeUtil.supertypes


fun KotlinType.isCoreType(): Boolean {
    return coreTypes.contains(this.toString())
}

fun KotlinType.isResource(): Boolean {
    return this.getJetTypeFqName(false) == "godot.Resource"
        || this
        .supertypes()
        .map { it.getJetTypeFqName(false) }
        .any { it == "godot.Resource" }
}

fun KotlinType.isAnyResourceType(): Boolean {
    return resourceTypes.contains(this.getJetTypeFqName(false))
}

fun KotlinType.getFirstRegistrableInheritedResourceType(): KotlinType? {
    return if (resourceTypes.contains(this.getJetTypeFqName(false))) {
        this
    } else {
        this
            .supertypes()
            .firstOrNull { resourceTypes.contains(it.getJetTypeFqName(false)) }
    }
}

fun KotlinType.isCompatibleList(): Boolean {
    return when {
        getJetTypeFqName(false) == "godot.core.VariantArray" -> true
        else -> false
    }
}

private val coreTypes = listOf(
    "GDArray",
    "Basis",
    "Color",
    "Dictionary",
    "GodotError",
    "NodePath",
    "Plane",
    "PoolByteArray",
    "PoolIntArray",
    "PoolRealArray",
    "PoolStringArray",
    "PoolVector2Array",
    "PoolVector3Array",
    "PoolColorArray",
    "PoolIntArray",
    "PoolRealArray",
    "Quat",
    "Rect2",
    "AABB",
    "RID",
    "String",
    "Transform",
    "Transform2D",
    "Variant",
    "Vector2",
    "Vector3"
)

/**
 * taken from the "inherited by" section here: https://docs.godotengine.org/en/stable/classes/class_resource.html
 */
private val resourceTypes = listOf(
    "godot.Animation",
    "godot.AnimationNode",
    "godot.AnimationNodeStateMachinePlayback",
    "godot.AnimationNodeStateMachineTransition",
    "godot.AudioBusLayout",
    "godot.AudioEffect",
    "godot.AudioStream",
    "godot.BakedLightmapData",
    "godot.BitMap",
    "godot.ButtonGroup",
    "godot.CryptoKey",
    "godot.CubeMap",
    "godot.Curve",
    "godot.Curve2D",
    "godot.Curve3D",
    "godot.DynamicFontData",
    "godot.EditorSettings",
    "godot.EditorSpatialGizmoPlugin",
    "godot.Environment",
    "godot.Font",
    "godot.GDNativeLibrary",
    "godot.GIProbeData",
    "godot.Gradient",
    "godot.Image",
    "godot.InputEvent",
    "godot.Material",
    "godot.Mesh",
    "godot.MeshLibrary",
    "godot.MultiMesh",
    "godot.NavigationMesh",
    "godot.NavigationPolygon",
    "godot.OccluderPolygon2D",
    "godot.OpenSimplexNoise",
    "godot.PackedDataContainer",
    "godot.PackedScene",
    "godot.PhysicsMaterial",
    "godot.PolygonPathFinder",
    "godot.RichTextEffect",
    "godot.Script",
    "godot.Shader",
    "godot.Shape",
    "godot.Shape2D",
    "godot.ShortCut",
    "godot.Skin",
    "godot.Sky",
    "godot.SpriteFrames",
    "godot.StyleBox",
    "godot.TextFile",
    "godot.Texture",
    "godot.TextureLayered",
    "godot.Theme",
    "godot.TileSet",
    "godot.Translation",
    "godot.VideoStream",
    "godot.VisualScriptNode",
    "godot.VisualShaderNode",
    "godot.World",
    "godot.World2D",
    "godot.X509Certificate",


    "godot.Resource" //Base class
)
