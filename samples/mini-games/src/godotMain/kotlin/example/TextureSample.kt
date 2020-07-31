package example

import godot.Spatial
import godot.Sprite
import godot.Texture
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.core.GD
import godot.core.NodePath

@RegisterClass
class TextureSample : Spatial() {
    @RegisterProperty
    lateinit var nodePath: NodePath

    @RegisterProperty
    lateinit var texture: Texture

    @RegisterFunction
    override fun _ready() {
        (getNode(nodePath) as Sprite).texture = texture
    }
}
