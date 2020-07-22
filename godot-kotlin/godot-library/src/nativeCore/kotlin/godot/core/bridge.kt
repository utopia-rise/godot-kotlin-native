package godot.core

import godot.Object
import godot.gdnative.godot_variant
import godot.internal.type.notNull
import kotlinx.cinterop.*

fun createInstance(instance: COpaquePointer?, methodData: COpaquePointer?): COpaquePointer? {
    val classHandle = notNull(methodData).asStableRef<ClassHandle<Object>>()
        .get()
    val kotlinInstance = classHandle.wrap(notNull(instance))
    kotlinInstance._onInit()
    val stableRef = StableRef.create(kotlinInstance)
    return stableRef.asCPointer()
}

fun disposeClassHandle(ref: COpaquePointer?) {
    val handle = notNull(ref).asStableRef<ClassHandle<Object>>()
    handle.get().dispose()
    handle.dispose()
}

fun destroyInstance(instance: COpaquePointer?, methodData: COpaquePointer?, classData: COpaquePointer?) {
    val kotlinInstanceRef = notNull(classData).asStableRef<Object>()
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
    val kotlinInstanceRef = notNull(classData).asStableRef<Object>()
    val kotlinInstance = kotlinInstanceRef.get()
    val methodHandleRef = notNull(methodData).asStableRef<Function<Object, *>>()
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

    return methodHandle(kotlinInstance, variantArgs)._handle
}


fun getProperty(
    instance: COpaquePointer?,
    methodData: COpaquePointer?,
    classData: COpaquePointer?
): CValue<godot_variant> {
    val kotlinInstanceRef = notNull(classData).asStableRef<Object>()
    val kotlinInstance = kotlinInstanceRef.get()
    val propertyHandleRef = notNull(methodData).asStableRef<MutablePropertyHandler<Object, *>>()
    val propertyHandler = propertyHandleRef.get()

    return propertyHandler.get(kotlinInstance)._handle
}

fun setProperty(
    instance: COpaquePointer?,
    methodData: COpaquePointer?,
    classData: COpaquePointer?,
    value: CPointer<godot_variant>?
) {
    val kotlinInstanceRef = notNull(classData).asStableRef<Object>()
    val kotlinInstance = kotlinInstanceRef.get()
    val propertyHandleRef = notNull(methodData).asStableRef<MutablePropertyHandler<Object, *>>()
    val propertyHandler = propertyHandleRef.get()
    val arg = if (value == null) {
        Variant()
    } else {
        Variant(value.pointed.readValue())
    }
    propertyHandler.set(kotlinInstance, arg)
}
