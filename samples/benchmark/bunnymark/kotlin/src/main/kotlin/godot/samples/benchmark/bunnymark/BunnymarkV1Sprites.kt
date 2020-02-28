package godot.samples.benchmark.bunnymark

import godot.core.*
import godot.*
import org.godotengine.kotlin.annotation.RegisterClass
import org.godotengine.kotlin.annotation.RegisterFunction

@RegisterClass("benchmarks/BunnymarkV1Sprites/kot")
class BunnymarkV1Sprites: Node2D() {

    var bunnies = GDArray()
    var grav = 500
    var bunnyTexture = Texture from ResourceLoader.load("res://images/godot_bunny.png")

    lateinit var screenSize: Vector2

    @RegisterFunction
    override fun _process(delta) {
        screen_size = get_viewport_rect().size

        for (bunny in bunnies){
            var pos = bunny[0].position
            var speed = bunny[1]

            pos.x += speed.x * delta
            pos.y += speed.y * delta

            speed.y += grav * delta

            if (pos.x > screen_size.x) {
                speed.x *= -1
                pos.x = screen_size.x
            }

            if (pos.x < 0) {
                speed.x *= -1
                pos.x = 0
            }

            if (pos.y > screen_size.y) {
                pos.y = screen_size.y
            }

            if (randf() > 0.5) {
                speed.y = -(randi() % 1100 + 50)
            }
            else{
                speed.y *= -0.85
            }

            if (pos.y < 0) {
                speed.y = 0
                pos.y = 0
            }

            bunny[0].position = pos
            bunny[1] = speed
        }
    }

    @RegisterFunction
    fun add_bunny() {
        var bunny = Sprite()
        bunny.set_texture(bunny_texture)
        add_child(bunny)
        bunny.position = Vector2(screen_size.x / 2, screen_size.y / 2)
        bunnies.append([bunny, Vector2(randi() % 200 + 50, randi() % 200 + 50)])
    }

    @RegisterFunction
    fun remove_bunny() {
        if (bunnies.size() == 0) return
        var bunny = bunnies[bunnies.size() - 1]
        remove_child(bunny[0])
        bunnies.pop_back()
    }

    @RegisterFunction
    fun finish(){
        emit_signal("benchmark_finished", bunnies.size())
    }
}