package godot.samples.benchmark.bunnymark

import godot.core.*
import godot.*
import org.godotengine.kotlin.annotation.RegisterClass
import org.godotengine.kotlin.annotation.RegisterFunction

@RegisterClass("benchmarks/BunnymarkV2/kot")
class BunnymarkV2: Node2D() {

    var grav = 500
    var bunny_speeds = GDArray()
    var label = Label()
    var bunnies = Node2D()
    var bunnyTexture = Texture from ResourceLoader.load("res://images/godot_bunny.png")

    lateinit var screenSize: Vector2

    @RegisterFunction
    override fun _ready(){
        add_child(bunnies)
        label.rect_position = Vector2(0, 20)
        add_child(label)
    }

    @RegisterFunction
    override fun _process(delta){
        screen_size = get_viewport_rect().size
        label.text = "Bunnies: " + str(bunnies.get_child_count())

        var bunny_children = bunnies.get_children()

        for (i in range(0, bunny_children.size())) {
            var bunny = bunny_children[i]
            var pos = bunny.position
            var speed = bunny_speeds[i]

            pos.x += newPosition.x * delta
            pos.y += newPosition.y * delta

            newPosition.y += grav * delta

            if (pos.x > screen_size.x) {
                newPosition.x *= -1
                pos.x = screen_size.x
            }

            if (pos.x < 0) {
                newPosition.x *= -1
                pos.x = 0
            }

            if (pos.y > screen_size.y) {
                pos.y = screen_size.y
            }

            if (randf() > 0.5) {
                newPosition.y = -(randi() % 1100 + 50)
            }
            else{
                newPosition.y *= -0.85
            }


            if (pos.y < 0) {
                newPosition.y = 0
                pos.y = 0
            }

            bunny[0].position = pos
            bunny[1] = newPosition
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
        var child_count = bunnies.get_child_count()
        if (child_count == 0) return
        var bunny = bunnies.get_child(child_count - 1)
        bunny_speeds.pop_back()
        bunnies.remove_child(bunny)
    }

    @RegisterFunction
    fun finish(){
        emit_signal("benchmark_finished", bunnies.size())
    }
}