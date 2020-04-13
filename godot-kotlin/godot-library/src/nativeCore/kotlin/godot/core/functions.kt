package godot.core

import godot.Object

abstract class Function<T : Object, R>(
    val parameterCount: Int
) {
    abstract operator fun invoke(instance: T, args: List<Variant>): Variant
}

class Function0<T : Object, R>(
    val method: T.() -> R
) : Function<T, R>(0) {
    override fun invoke(instance: T, args: List<Variant>): Variant {
        return Variant.wrap(
            method(
                instance
            )
        )
    }
}

class Function1<T : Object, P0, R>(
    val method: T.(P0) -> R
) : Function<T, R>(1) {
    override fun invoke(instance: T, args: List<Variant>): Variant {
        return Variant.wrap(
            method(
                instance,
                args[0].unwrap()
            )
        )
    }
}

class Function2<T : Object, P0, P1, R>(
    val method: T.(P0, P1) -> R
) : Function<T, R>(2) {
    override fun invoke(instance: T, args: List<Variant>): Variant {
        return Variant.wrap(
            method(
                instance,
                args[0].unwrap(),
                args[1].unwrap()
            )
        )
    }
}

class Function3<T : Object, P0, P1, P2, R>(
    val method: T.(P0, P1, P2) -> R
) : Function<T, R>(3) {
    override fun invoke(instance: T, args: List<Variant>): Variant {
        return Variant.wrap(
            method(
                instance,
                args[0].unwrap(),
                args[1].unwrap(),
                args[2].unwrap()
            )
        )
    }
}

class Function4<T : Object, P0, P1, P2, P3, R>(
    val method: T.(P0, P1, P2, P3) -> R
) : Function<T, R>(4) {
    override fun invoke(instance: T, args: List<Variant>): Variant {
        return Variant.wrap(
            method(
                instance,
                args[0].unwrap(),
                args[1].unwrap(),
                args[2].unwrap(),
                args[3].unwrap()
            )
        )
    }
}

class Function5<T : Object, P0, P1, P2, P3, P4, R>(
    val method: T.(P0, P1, P2, P3, P4) -> R
) : Function<T, R>(5) {
    override fun invoke(instance: T, args: List<Variant>): Variant {
        return Variant.wrap(
            method(
                instance,
                args[0].unwrap(),
                args[1].unwrap(),
                args[2].unwrap(),
                args[3].unwrap(),
                args[4].unwrap()
            )
        )
    }
}

class Function6<T : Object, P0, P1, P2, P3, P4, P5, R>(
    val method: T.(P0, P1, P2, P3, P4, P5) -> R
) : Function<T, R>(6) {
    override fun invoke(instance: T, args: List<Variant>): Variant {
        return Variant.wrap(
            method(
                instance,
                args[0].unwrap(),
                args[1].unwrap(),
                args[2].unwrap(),
                args[3].unwrap(),
                args[4].unwrap(),
                args[5].unwrap()
            )
        )
    }
}

class Function7<T : Object, P0, P1, P2, P3, P4, P5, P6, R>(
    val method: T.(P0, P1, P2, P3, P4, P5, P6) -> R
) : Function<T, R>(7) {
    override fun invoke(instance: T, args: List<Variant>): Variant {
        return Variant.wrap(
            method(
                instance,
                args[0].unwrap(),
                args[1].unwrap(),
                args[2].unwrap(),
                args[3].unwrap(),
                args[4].unwrap(),
                args[5].unwrap(),
                args[6].unwrap()
            )
        )
    }
}

class Function8<T : Object, P0, P1, P2, P3, P4, P5, P6, P7, R>(
    val method: T.(P0, P1, P2, P3, P4, P5, P6, P7) -> R
) : Function<T, R>(8) {
    override fun invoke(instance: T, args: List<Variant>): Variant {
        return Variant.wrap(
            method(
                instance,
                args[0].unwrap(),
                args[1].unwrap(),
                args[2].unwrap(),
                args[3].unwrap(),
                args[4].unwrap(),
                args[5].unwrap(),
                args[6].unwrap(),
                args[7].unwrap()
            )
        )
    }
}

class Function9<T : Object, P0, P1, P2, P3, P4, P5, P6, P7, P8, R>(
    val method: T.(P0, P1, P2, P3, P4, P5, P6, P7, P8) -> R
) : Function<T, R>(9) {
    override fun invoke(instance: T, args: List<Variant>): Variant {
        return Variant.wrap(
            method(
                instance,
                args[0].unwrap(),
                args[1].unwrap(),
                args[2].unwrap(),
                args[3].unwrap(),
                args[4].unwrap(),
                args[5].unwrap(),
                args[6].unwrap(),
                args[7].unwrap(),
                args[8].unwrap()
            )
        )
    }
}

class Function10<T : Object, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, R>(
    val method: T.(P0, P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R
) : Function<T, R>(10) {
    override fun invoke(instance: T, args: List<Variant>): Variant {
        return Variant.wrap(
            method(
                instance,
                args[0].unwrap(),
                args[1].unwrap(),
                args[2].unwrap(),
                args[3].unwrap(),
                args[4].unwrap(),
                args[5].unwrap(),
                args[6].unwrap(),
                args[7].unwrap(),
                args[8].unwrap(),
                args[9].unwrap()
            )
        )
    }
}
