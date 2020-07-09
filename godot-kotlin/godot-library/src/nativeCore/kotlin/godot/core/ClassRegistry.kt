package godot.core

import kotlinx.cinterop.COpaquePointer

class ClassRegistry(private val nativescriptHandle: COpaquePointer) {
    fun <T : Object> registerClass(
        name: String,
        parent: String,
        factory: () -> T,
        isTool: Boolean,
        builder: ClassBuilder<T>.() -> Unit
    ) {
        val handle = ClassHandle(nativescriptHandle, name, parent, factory, isTool)
        handle.init()
        TypeManager.registerUserType(nativescriptHandle, name, factory)
        builder(ClassBuilder(handle))
    }
}
