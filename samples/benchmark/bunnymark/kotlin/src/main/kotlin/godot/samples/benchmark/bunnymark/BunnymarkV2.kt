package godot.samples.benchmark.bunnymark

import godot.core.*
import godot.*
import org.godotengine.kotlin.annotation.RegisterClass
import org.godotengine.kotlin.annotation.RegisterFunction

@RegisterClass("benchmarks/BunnymarkV2/kot")
class BunnymarkV2: Node2D() {


    private var grav = 500
    private var bunny_speeds = ArrayList<Vector2>()
    private var label = Label()
    private var bunnies = Node2D()
    private var bunnyTexture = Texture from ResourceLoader.load("res://images/godot_bunny.png")
    private val rng = RandomNumberGenerator()

    lateinit var screenSize: Vector2

    @RegisterFunction
    override fun _ready(){
        addChild(bunnies)
        //label.rectPosition = Vector2(0, 20)
        addChild(label)
    }

    @RegisterFunction
    override fun _process(delta: Double){
        screenSize = getViewportRect().size

        label.text = "Bunnies: " + bunnies.getChildCount().toString()

        var bunny_children = bunnies.getChildren()

        for (i in 0 until bunny_children.size()){
            val bunny = Sprite from bunny_children[i]!!
            val pos = bunny.position
            val speed = bunny_speeds[i]

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
            }

            if (rng.randf() > 0.5) {
                speed.y = -(rng.randi() % 1100 + 50).toDouble()
            }
            else{
                speed.y *= -0.85
            }

            if (pos.y < 0) {
                speed.y = 0.0
                pos.y = 0.0
            }

            bunny.position = pos
            bunny_speeds[i] =  speed
        }
    }

    @RegisterFunction
    fun add_bunny() {
        var bunny = Sprite()
        bunny.setTexture(bunnyTexture)
        addChild(bunny)
        bunny.position = Vector2(screenSize.x / 2, screenSize.y / 2)
        bunny_speeds.add(
                Vector2(rng.randi() % 200 + 50, rng.randi() % 200 + 50)
        )
    }

    @RegisterFunction
    fun remove_bunny() {
        val child_count = bunnies.getChildCount()
        if (child_count == 0L) return
        val bunny = bunnies.getChild(child_count - 1)
        bunnies.removeChild(bunny)
        bunny_speeds.removeAt(child_count.toInt())
    }

    @RegisterFunction
    fun finish(){
        emitSignal("benchmark_finished", bunny_speeds.size)
    }
}