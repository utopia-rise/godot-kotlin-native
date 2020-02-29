package godot.samples.benchmark.bunnymark

import godot.core.*
import godot.*
import org.godotengine.kotlin.annotation.RegisterClass
import org.godotengine.kotlin.annotation.RegisterFunction

@RegisterClass("benchmarks/BunnymarkV1Sprites/kot")
class BunnymarkV1Sprites: Node2D() {

    private data class Bunny(var sprite: Sprite, var speed: Vector2)

    private var bunnies = ArrayList<Bunny>()
    private var grav = 500
    private var bunnyTexture = Texture from ResourceLoader.load("res://images/godot_bunny.png")
    private val rng = RandomNumberGenerator()

    lateinit var screenSize: Vector2

    @RegisterFunction
    override fun _process(delta: Double) {
        screenSize = getViewportRect().size

        for (bunny in bunnies){
            val pos = bunny.sprite.position
            val speed = bunny.speed

            pos.x += speed.x * delta
            pos.y += speed.y * delta

            speed.y += grav * delta

            if (pos.x > screenSize.x) {
                speed.x *= -1
                pos.x = screenSize.x
            }

            if (pos.x < 0) {
                speed.x *= -1.0
                pos.x = 0.0
            }

            if (pos.y > screenSize.y) {
                pos.y = screenSize.y
                if (rng.randf() > 0.5) {
                    speed.y = -(rng.randi() % 1100 + 50).toDouble()
                }
                else{
                    speed.y *= -0.85
                }
            }



            if (pos.y < 0) {
                speed.y = 0.0
                pos.y = 0.0
            }

            bunny.sprite.position = pos
            bunny.speed =  speed
        }
    }

    @RegisterFunction
    fun add_bunny() {
        val bunny = Sprite()
        bunny.setTexture(bunnyTexture)
        addChild(bunny)
        bunny.position = Vector2(screenSize.x / 2, screenSize.y / 2)
        bunnies.add(
                    Bunny(
                        bunny,
                        Vector2(rng.randi() % 200 + 50, rng.randi() % 200 + 50)
                        )
        )
    }

    @RegisterFunction
    fun remove_bunny() {
        if (bunnies.size == 0) return
        val bunny = bunnies[bunnies.size - 1]
        removeChild(bunny.sprite)
        bunnies.removeAt(bunnies.size - 1)
    }

    @RegisterFunction
    fun finish(){
        emitSignal("benchmark_finished", bunnies.size)
    }
}