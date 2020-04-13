package godot.codegen

import com.beust.klaxon.Json
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec


class Signal(
    @Json(name = "name")
    var name: String,
    @Json(name = "arguments")
    val arguments: List<SignalArgument>
) {

    val generated: PropertySpec
        get() {
            val builder = if (arguments.isEmpty()) {
                PropertySpec
                    .builder(
                        name.convertToCamelCase().escapeKotlinReservedNames(),
                        ClassName("godot.core", "Signal0")
                    )
                    .delegate(
                        "%M()",
                        MemberName("godot.core", "signal")
                    )
            } else {
                PropertySpec
                    .builder(
                        name.convertToCamelCase().escapeKotlinReservedNames(),
                        ClassName("godot.core", "Signal${arguments.size}")
                            .parameterizedBy(*arguments.map { ClassName(it.type.getPackage(), it.type) }.toTypedArray())
                    )
                    .delegate("%M(${
                        arguments
                            .map { "\"${it.name}\"" + if (it != arguments.last()) ", " else "" }
                            .reduce { acc, s -> acc + s }
                    })",
                        MemberName("godot.core", "signal")
                    )
            }
            return builder.build()
        }
}
