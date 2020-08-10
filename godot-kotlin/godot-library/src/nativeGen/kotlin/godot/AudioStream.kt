// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import godot.icalls._icall_Double
import godot.internal.utils.getMethodBind
import kotlin.Any
import kotlin.Double

open class AudioStream internal constructor(
  _ignore: Any?
) : Resource(_ignore) {
  internal constructor() : this(null)

  open fun getLength(): Double {
    val mb = getMethodBind("AudioStream","get_length")
    return _icall_Double( mb, this.ptr)
  }
}
