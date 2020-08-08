package godot

import kotlin.Any

open class BulletPhysicsDirectBodyState internal constructor(
  _ignore: Any?
) : PhysicsDirectBodyState(_ignore) {
  internal constructor() : this(null)

  companion object
}
