package samples.games.dodge

import godot.Curve2D
import godot.Path2D
import godot.core.Vector2

class MobPath: Path2D() {

    var mobSpawnLocation = MobSpawnLocation()

    override fun _ready() {
        addChild(mobSpawnLocation)
        curve = Curve2D()
        curve.addPoint(Vector2(0,0))
        curve.addPoint(Vector2(480,0))
        curve.addPoint(Vector2(480,720))
        curve.addPoint(Vector2(0,720))
        curve.addPoint(Vector2(0,0))
    }

}