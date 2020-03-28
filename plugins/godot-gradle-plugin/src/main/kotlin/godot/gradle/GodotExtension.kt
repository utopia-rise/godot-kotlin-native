package godot.gradle

import org.gradle.api.model.ObjectFactory
import org.gradle.kotlin.dsl.listProperty
import org.gradle.kotlin.dsl.property

open class GodotExtension(objects: ObjectFactory) {
  val debug = objects.property<Boolean>()
  val cleanupGeneratedFiles = objects.property<Boolean>()
  val gdnsDir = objects.fileProperty()
  val platforms = objects.listProperty<Platform>()
}