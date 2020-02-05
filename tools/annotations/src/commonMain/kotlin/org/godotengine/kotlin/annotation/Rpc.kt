package org.godotengine.kotlin.annotation

import kotlin.reflect.KClass

@Target(
        AnnotationTarget.FUNCTION,
        AnnotationTarget.PROPERTY
)
@Retention(AnnotationRetention.RUNTIME)
annotation class Remote

@Target(
        AnnotationTarget.FUNCTION,
        AnnotationTarget.PROPERTY
)
@Retention(AnnotationRetention.RUNTIME)
annotation class Disabled

@Target(
        AnnotationTarget.FUNCTION,
        AnnotationTarget.PROPERTY
)
@Retention(AnnotationRetention.RUNTIME)
annotation class Sync

@Target(
        AnnotationTarget.FUNCTION,
        AnnotationTarget.PROPERTY
)
@Retention(AnnotationRetention.RUNTIME)
annotation class Master

@Target(
        AnnotationTarget.FUNCTION,
        AnnotationTarget.PROPERTY
)
@Retention(AnnotationRetention.RUNTIME)
annotation class Slave //TODO: rename to match new godot convention -> slave is now puppet

@Target(
        AnnotationTarget.FUNCTION,
        AnnotationTarget.PROPERTY
)
@Retention(AnnotationRetention.RUNTIME)
annotation class RemoteSync

@Target(
        AnnotationTarget.FUNCTION,
        AnnotationTarget.PROPERTY
)
@Retention(AnnotationRetention.RUNTIME)
annotation class MasterSync

@Target(
        AnnotationTarget.FUNCTION,
        AnnotationTarget.PROPERTY
)
@Retention(AnnotationRetention.RUNTIME)
annotation class SlaveSync //TODO: rename to match new godot convention -> slave is now puppet


fun rpcAnnotations(): Set<KClass<out Annotation>> {
    return setOf(
            Remote::class,
            Sync::class,
            Master::class,
            Slave::class,
            RemoteSync::class,
            MasterSync::class,
            SlaveSync::class
    )
}