package godot.global

import godot.Resource
import godot.ResourceLoader

internal interface gdResource {

    /**
     * Loads a resource from the filesystem located at path.
     * The resource is loaded on the method call (unless it's referenced already elsewhere, e.g. in another script or in the scene), which might cause slight delay, especially when loading scenes.
     * Important: The path must be absolute, a local path will just return null.
     * */
    fun load(path: String): Resource {
        return ResourceLoader.load(path)
    }
}
