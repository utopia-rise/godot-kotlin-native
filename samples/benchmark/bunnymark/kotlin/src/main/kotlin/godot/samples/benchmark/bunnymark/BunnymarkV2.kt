package godot.samples.benchmark.bunnymark

import godot.core.*
import godot.*
import org.godotengine.kotlin.annotation.RegisterClass
import org.godotengine.kotlin.annotation.RegisterFunction

@RegisterClass("benchmarks/BunnymarkV2/kot")
class BunnymarkV2 : Node2D() {


    private var gravity = 500
    private var bunnySpeeds = ArrayList<Vector2>()
    private var label = Label()
    private var bunnies = Node2D()
    private var bunnyTexture = Texture from ResourceLoader.load("res://images/godot_bunny.png")
    private val randomNumberGenerator = RandomNumberGenerator()

    lateinit var screenSize: Vector2

    @RegisterFunction
    override fun _ready() {
        addChild(bunnies)
        label.setPosition(Vector2(0, 20))
        addChild(label)
    }

    @RegisterFunction
    override fun _process(delta: Double) {
        screenSize = getViewportRect().size
        label.text = "Bunnies: " + bunnies.getChildCount().toString()

        val bunny_children = bunnies.getChildren()
        for (i in 0 until bunny_children.size()) {
            val bunny = Sprite from bunny_children[i]!!
            val pos = bunny.position
            val speed = bunnySpeeds[i]

            pos.x += speed.x * delta
            pos.y += speed.y * delta

            speed.y += gravity * delta

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
                if (randomNumberGenerator.randf() > 0.5) {
                    speed.y = -(randomNumberGenerator.randi() % 1100 + 50).toDouble()
                } else {
                    speed.y *= -0.85
                }
            }

            if (pos.y < 0) {
                speed.y = 0.0
                pos.y = 0.0
            }

            bunny.position = pos
            bunnySpeeds[i] = speed
        }
    }

    @RegisterFunction
    fun add_bunny() {
        val bunny = Sprite()
        bunny.setTexture(bunnyTexture)
        bunnies.addChild(bunny)
        bunny.position = Vector2(screenSize.x / 2, screenSize.y / 2)
        bunnySpeeds.add(
                Vector2(randomNumberGenerator.randi() % 200 + 50, randomNumberGenerator.randi() % 200 + 50)
        )
    }

    @RegisterFunction
    fun remove_bunny() {
        val child_count = bunnies.getChildCount()
        if (child_count == 0L) return
        val bunny = bunnies.getChild(child_count - 1)
        bunnies.removeChild(bunny)
        bunnySpeeds.removeAt(child_count.toInt() - 1)
    }

    @RegisterFunction
    fun finish() {
        emitSignal("benchmark_finished", bunnySpeeds.size)
    }
}