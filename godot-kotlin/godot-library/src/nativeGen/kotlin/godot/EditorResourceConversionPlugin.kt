// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD
package godot

import kotlin.NotImplementedError
import kotlin.String

open class EditorResourceConversionPlugin internal constructor() : Reference() {
  open fun _convert(resource: Resource): Resource {
    throw NotImplementedError("_convert is not implemented for EditorResourceConversionPlugin")
  }

  open fun _convertsTo(): String {
    throw NotImplementedError("_converts_to is not implemented for EditorResourceConversionPlugin")
  }
}
