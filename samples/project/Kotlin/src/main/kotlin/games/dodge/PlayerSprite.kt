package samples.games.dodge

import godot.AnimatedSprite
import godot.ResourceLoader
import godot.SpriteFrames
import godot.Texture

class PlayerSprite: AnimatedSprite() {

    override fun _ready() {
        val spriteFrames = SpriteFrames()
        spriteFrames.addAnimation("right")
        spriteFrames.addFrame("right", Texture from ResourceLoader.load("res://art/playerGrey_walk1.png"))
        spriteFrames.addFrame("right", Texture from ResourceLoader.load("res://art/playerGrey_walk2.png"))
        spriteFrames.addAnimation("up")
        spriteFrames.addFrame("up", Texture from ResourceLoader.load("res://art/playerGrey_up1.png"))
        spriteFrames.addFrame("up", Texture from ResourceLoader.load("res://art/playerGrey_up2.png"))
        this.setSpriteFrames(spriteFrames)
    }
}