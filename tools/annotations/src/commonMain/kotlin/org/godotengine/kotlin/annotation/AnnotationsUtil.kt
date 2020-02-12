package org.godotengine.kotlin.annotation

import kotlin.reflect.KClass

fun getAllAnnotations(): Set<KClass<out Annotation>> {
    return setOf(
            RegisterClass::class,
            RegisterFunction::class,
            RegisterProperty::class,
            RegisterSignal::class,
            Remote::class,
            Sync::class,
            Master::class,
            Slave::class,
            RemoteSync::class,
            MasterSync::class,
            SlaveSync::class
    )
}