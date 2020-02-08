import com.beust.klaxon.Json
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.PropertySpec


class Signal(
        @Json(name = "name")
        var name: String
) {

    fun generated(target: GeneratorTarget): PropertySpec {
        val modifiers = if (target.implementation) {
            arrayOf(KModifier.ACTUAL)
        } else {
            emptyArray()
        }

        return PropertySpec
                .builder(name.toUpperCase(), String::class, *modifiers)
                .let { if (target.implementation) it.initializer("\"$name\"") else it }
                .build()
    }
}
