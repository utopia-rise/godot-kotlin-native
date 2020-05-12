package godot.core

import godot.core.type.Variant
import godot.gdnative.godot_variant
import kotlinx.cinterop.*

fun createInstance(instance: COpaquePointer?, methodData: COpaquePointer?): COpaquePointer? {
    val classHandle = checkNotNull(methodData).asStableRef<ClassHandle<Object>>()
        .get()
    val kotlinInstance = classHandle.wrap(checkNotNull(instance))
    kotlinInstance._onInit()
    val stableRef = StableRef.create(kotlinInstance)
    return stableRef.asCPointer()
}

fun disposeClassHandle(ref: COpaquePointer?) {
    val handle = checkNotNull(ref).asStableRef<ClassHandle<Object>>()
    handle.get().dispose()
    handle.dispose()
}

fun destroyInstance(instance: COpaquePointer?, methodData: COpaquePointer?, classData: COpaquePointer?) {
    val kotlinInstanceRef = checkNotNull(classData).asStableRef<Object>()
    val kotlinInstance = kotlinInstanceRef.get()
    kotlinInstance._onDestroy()
    kotlinInstanceRef.dispose()
}

fun invokeMethod(
    instance: COpaquePointer?,
    methodData: COpaquePointer?,
    classData: COpaquePointer?,
    numArgs: Int,
    args: CPointer<CPointerVar<godot_variant>>?
): CValue<godot_variant> {
    val kotlinInstanceRef = checkNotNull(classData).asStableRef<Object>()
    val kotlinInstance = kotlinInstanceRef.get()
    val methodHandleRef = checkNotNull(methodData).asStableRef<Function<Object, *>>()
    val methodHandle = methodHandleRef.get()

    check(methodHandle.parameterCount == numArgs) {
        "Invalid number of arguments, $numArgs passed but ${methodHandle.parameterCount} expected."
    }

    val variantArgs = if (numArgs == 0) {
        emptyList()
    } else {
        requireNotNull(args) { "args is null!" }
        val tmp = mutableListOf<Variant>()
        for (i in 0 until numArgs) {
            tmp.add(Variant(args[i]!!.pointed.readValue()))
        }
        tmp.toList()
    }

    return methodHandle(kotlinInstance, variantArgs).handle
}


fun getProperty(
    instance: COpaquePointer?,
    methodData: COpaquePointer?,
    classData: COpaquePointer?
): CValue<godot_variant> {
    val kotlinInstanceRef = checkNotNull(classData).asStableRef<Object>()
    val kotlinInstance = kotlinInstanceRef.get()
    val propertyHandleRef = checkNotNull(methodData).asStableRef<MutablePropertyHandler<Object, *>>()
    val propertyHandler = propertyHandleRef.get()

    return propertyHandler.get(kotlinInstance).handle
}

fun setProperty(
    instance: COpaquePointer?,
    methodData: COpaquePointer?,
    classData: COpaquePointer?,
    value: CPointer<godot_variant>?
) {
    val kotlinInstanceRef = checkNotNull(classData).asStableRef<Object>()
    val kotlinInstance = kotlinInstanceRef.get()
    val propertyHandleRef = checkNotNull(methodData).asStableRef<MutablePropertyHandler<Object, *>>()
    val propertyHandler = propertyHandleRef.get()
    val arg = if (value == null) {
        Variant()
    } else {
        Variant(value.pointed.readValue())
    }
    propertyHandler.set(kotlinInstance, arg)
}
