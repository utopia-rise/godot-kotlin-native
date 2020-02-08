import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec

fun TypeSpec.Builder.actualIfImplementation(target: GeneratorTarget): TypeSpec.Builder {
    return if (target.implementation) addModifiers(KModifier.ACTUAL) else this
}

fun TypeSpec.Builder.expectIfInterface(target: GeneratorTarget): TypeSpec.Builder {
    return if (!target.implementation) addModifiers(KModifier.EXPECT) else this
}

fun TypeSpec.Builder.applyToImplementation(target: GeneratorTarget, f: TypeSpec.Builder.() -> TypeSpec.Builder): TypeSpec.Builder {
    return if (target.implementation) this.f() else this
}

fun PropertySpec.Builder.actualIfImplementation(target: GeneratorTarget): PropertySpec.Builder {
    return if (target.implementation) addModifiers(KModifier.ACTUAL) else this
}

fun PropertySpec.Builder.applyToImplementation(target: GeneratorTarget, f: PropertySpec.Builder.() -> PropertySpec.Builder): PropertySpec.Builder {
    return if (target.implementation) this.f() else this
}

fun FunSpec.Builder.actualIfImplementation(target: GeneratorTarget): FunSpec.Builder {
    return if (target.implementation) addModifiers(KModifier.ACTUAL) else this
}

fun FunSpec.Builder.applyToImplementation(target: GeneratorTarget, f: FunSpec.Builder.() -> FunSpec.Builder): FunSpec.Builder {
    return if (target.implementation) this.f() else this
}
