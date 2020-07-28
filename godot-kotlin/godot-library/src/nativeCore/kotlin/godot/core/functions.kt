package godot.core

import godot.Object

abstract class Function<T : Object, R>(
    val parameterCount: Int
) {
    abstract operator fun invoke(instance: T, args: List<Variant>): Variant
}

class Function0<T : Object, R>(
    val method: T.() -> R,
    val typeToVariantConverter: (R) -> Variant
) : Function<T, R>(0) {
    override fun invoke(instance: T, args: List<Variant>): Variant {
        return typeToVariantConverter.invoke(
            method(
                instance
            )
        )
    }
}

class Function1<T : Object, P0, R>(
    val method: T.(P0) -> R,
    val typeToVariantConverter: (R) -> Variant,
    val variantToTypeConverters: List<(Variant) -> Any?>
) : Function<T, R>(1) {
    override fun invoke(instance: T, args: List<Variant>): Variant {
        return typeToVariantConverter.invoke(
            method(
                instance,
                variantToTypeConverters[0].invoke(args[0]) as P0
            )
        )
    }
}

class Function2<T : Object, P0, P1, R>(
    val method: T.(P0, P1) -> R,
    val typeToVariantConverter: (R) -> Variant,
    val variantToTypeConverters: List<(Variant) -> Any?>
) : Function<T, R>(2) {
    override fun invoke(instance: T, args: List<Variant>): Variant {
        return typeToVariantConverter.invoke(
            method(
                instance,
                variantToTypeConverters[0].invoke(args[0]) as P0,
                variantToTypeConverters[1].invoke(args[1]) as P1
            )
        )
    }
}

class Function3<T : Object, P0, P1, P2, R>(
    val method: T.(P0, P1, P2) -> R,
    val typeToVariantConverter: (R) -> Variant,
    val variantToTypeConverters: List<(Variant) -> Any?>
) : Function<T, R>(3) {
    override fun invoke(instance: T, args: List<Variant>): Variant {
        return typeToVariantConverter.invoke(
            method(
                instance,
                variantToTypeConverters[0].invoke(args[0]) as P0,
                variantToTypeConverters[1].invoke(args[1]) as P1,
                variantToTypeConverters[2].invoke(args[2]) as P2
            )
        )
    }
}

class Function4<T : Object, P0, P1, P2, P3, R>(
    val method: T.(P0, P1, P2, P3) -> R,
    val typeToVariantConverter: (R) -> Variant,
    val variantToTypeConverters: List<(Variant) -> Any?>
) : Function<T, R>(4) {
    override fun invoke(instance: T, args: List<Variant>): Variant {
        return typeToVariantConverter.invoke(
            method(
                instance,
                variantToTypeConverters[0].invoke(args[0]) as P0,
                variantToTypeConverters[1].invoke(args[1]) as P1,
                variantToTypeConverters[2].invoke(args[2]) as P2,
                variantToTypeConverters[3].invoke(args[3]) as P3
            )
        )
    }
}

class Function5<T : Object, P0, P1, P2, P3, P4, R>(
    val method: T.(P0, P1, P2, P3, P4) -> R,
    val typeToVariantConverter: (R) -> Variant,
    val variantToTypeConverters: List<(Variant) -> Any?>
) : Function<T, R>(5) {
    override fun invoke(instance: T, args: List<Variant>): Variant {
        return typeToVariantConverter.invoke(
            method(
                instance,
                variantToTypeConverters[0].invoke(args[0]) as P0,
                variantToTypeConverters[1].invoke(args[1]) as P1,
                variantToTypeConverters[2].invoke(args[2]) as P2,
                variantToTypeConverters[3].invoke(args[3]) as P3,
                variantToTypeConverters[4].invoke(args[4]) as P4
            )
        )
    }
}

class Function6<T : Object, P0, P1, P2, P3, P4, P5, R>(
    val method: T.(P0, P1, P2, P3, P4, P5) -> R,
    val typeToVariantConverter: (R) -> Variant,
    val variantToTypeConverters: List<(Variant) -> Any?>
) : Function<T, R>(6) {
    override fun invoke(instance: T, args: List<Variant>): Variant {
        return typeToVariantConverter.invoke(
            method(
                instance,
                variantToTypeConverters[0].invoke(args[0]) as P0,
                variantToTypeConverters[1].invoke(args[1]) as P1,
                variantToTypeConverters[2].invoke(args[2]) as P2,
                variantToTypeConverters[3].invoke(args[3]) as P3,
                variantToTypeConverters[4].invoke(args[4]) as P4,
                variantToTypeConverters[5].invoke(args[5]) as P5
            )
        )
    }
}

class Function7<T : Object, P0, P1, P2, P3, P4, P5, P6, R>(
    val method: T.(P0, P1, P2, P3, P4, P5, P6) -> R,
    val typeToVariantConverter: (R) -> Variant,
    val variantToTypeConverters: List<(Variant) -> Any?>
) : Function<T, R>(7) {
    override fun invoke(instance: T, args: List<Variant>): Variant {
        return typeToVariantConverter.invoke(
            method(
                instance,
                variantToTypeConverters[0].invoke(args[0]) as P0,
                variantToTypeConverters[1].invoke(args[1]) as P1,
                variantToTypeConverters[2].invoke(args[2]) as P2,
                variantToTypeConverters[3].invoke(args[3]) as P3,
                variantToTypeConverters[4].invoke(args[4]) as P4,
                variantToTypeConverters[5].invoke(args[5]) as P5,
                variantToTypeConverters[6].invoke(args[6]) as P6
            )
        )
    }
}

class Function8<T : Object, P0, P1, P2, P3, P4, P5, P6, P7, R>(
    val method: T.(P0, P1, P2, P3, P4, P5, P6, P7) -> R,
    val typeToVariantConverter: (R) -> Variant,
    val variantToTypeConverters: List<(Variant) -> Any?>
) : Function<T, R>(8) {
    override fun invoke(instance: T, args: List<Variant>): Variant {
        return typeToVariantConverter.invoke(
            method(
                instance,
                variantToTypeConverters[0].invoke(args[0]) as P0,
                variantToTypeConverters[1].invoke(args[1]) as P1,
                variantToTypeConverters[2].invoke(args[2]) as P2,
                variantToTypeConverters[3].invoke(args[3]) as P3,
                variantToTypeConverters[4].invoke(args[4]) as P4,
                variantToTypeConverters[5].invoke(args[5]) as P5,
                variantToTypeConverters[6].invoke(args[6]) as P6,
                variantToTypeConverters[7].invoke(args[7]) as P7
            )
        )
    }
}

class Function9<T : Object, P0, P1, P2, P3, P4, P5, P6, P7, P8, R>(
    val method: T.(P0, P1, P2, P3, P4, P5, P6, P7, P8) -> R,
    val typeToVariantConverter: (R) -> Variant,
    val variantToTypeConverters: List<(Variant) -> Any?>
) : Function<T, R>(9) {
    override fun invoke(instance: T, args: List<Variant>): Variant {
        return typeToVariantConverter.invoke(
            method(
                instance,
                variantToTypeConverters[0].invoke(args[0]) as P0,
                variantToTypeConverters[1].invoke(args[1]) as P1,
                variantToTypeConverters[2].invoke(args[2]) as P2,
                variantToTypeConverters[3].invoke(args[3]) as P3,
                variantToTypeConverters[4].invoke(args[4]) as P4,
                variantToTypeConverters[5].invoke(args[5]) as P5,
                variantToTypeConverters[6].invoke(args[6]) as P6,
                variantToTypeConverters[7].invoke(args[7]) as P7,
                variantToTypeConverters[8].invoke(args[8]) as P8
            )
        )
    }
}

class Function10<T : Object, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, R>(
    val method: T.(P0, P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R,
    val typeToVariantConverter: (R) -> Variant,
    val variantToTypeConverters: List<(Variant) -> Any?>
) : Function<T, R>(10) {
    override fun invoke(instance: T, args: List<Variant>): Variant {
        return typeToVariantConverter.invoke(
            method(
                instance,
                variantToTypeConverters[0].invoke(args[0]) as P0,
                variantToTypeConverters[1].invoke(args[1]) as P1,
                variantToTypeConverters[2].invoke(args[2]) as P2,
                variantToTypeConverters[3].invoke(args[3]) as P3,
                variantToTypeConverters[4].invoke(args[4]) as P4,
                variantToTypeConverters[5].invoke(args[5]) as P5,
                variantToTypeConverters[6].invoke(args[6]) as P6,
                variantToTypeConverters[7].invoke(args[7]) as P7,
                variantToTypeConverters[8].invoke(args[8]) as P8,
                variantToTypeConverters[9].invoke(args[9]) as P9
            )
        )
    }
}
