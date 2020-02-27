package godot.samples.benchmark.bunnymark

import godot.core.*
import godot.*
import org.godotengine.kotlin.annotation.RegisterClass
import org.godotengine.kotlin.annotation.RegisterFunction

@RegisterClass("benchmarks/BunnymarkV1DrawTexture/kot")
class BunnymarkV1DrawTexture: Node2D() {

    var bunnies: GdArray = GdArray()
    var grav = 500
    var bunnyTexture = Texture from ResourceLoader.load("res://images/godot_bunny.png")

    lateinit var screenSize: Vector2


    @RegisterFunction
    fun _draw() {
        for bunny in bunnies {
            draw_texture(bunny_texture, bunny[0])
        }
    }

    @RegisterFunction
    fun _process(delta){
        screen_size = get_viewport_rect().size

        for bunny in bunnies{
            var pos = bunny[0].position
            var speed = bunny[1]

            pos.x += speed.x * delta
            pos.y += speed.y * delta

            speed.y += grav * delta

            if pos.x > screen_size.x{
                speed.x *= -1
                pos.x = screen_size.x
            }

            if pos.x < 0{
                speed.x *= -1
                pos.x = 0
            }

            if pos.y > screen_size.y{
                pos.y = screen_size.y
            }

            if randf() > 0.5{
                speed.y = -(randi() % 1100 + 50)
            }
            else{
                speed.y *= -0.85
            }

            if pos.y < 0{
                speed.y = 0
                pos.y = 0
            }

            bunny[0].position = pos
            bunny[1] = speed
        }
        update()
    }

    @RegisterFunction
    fun add_bunny() {
        bunnies.append([
                    Vector2(screen_size.x / 2, screen_size.y / 2),
                    Vector2(randi() % 200 + 50, randi() % 200 + 50)
                ])
    }

    @RegisterFunction
    fun remove_bunny() {
        if(bunnies.size() == 0){
            return
        }

        bunnies.pop_back()
    }

    @RegisterFunction
    fun finish(){
        emit_signal("benchmark_finished", bunnies.size())
    }
}
