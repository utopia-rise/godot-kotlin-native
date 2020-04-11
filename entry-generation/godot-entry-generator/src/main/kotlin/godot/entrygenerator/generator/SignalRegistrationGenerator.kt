package godot.entrygenerator.generator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.MemberName.Companion.member
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe

object SignalRegistrationGenerator {

    fun registerSignals(
        signals: List<PropertyDescriptor>,
        registerClassControlFlow: FunSpec.Builder,
        className: ClassName
    ) {
        signals.forEach { propertyDescriptor ->
            signalSanityCheck(propertyDescriptor)
            registerClassControlFlow
                .addStatement(
                    "signal(%S,·%S,·%L)",
                    propertyDescriptor.name,
                    propertyDescriptor.containingDeclaration.name,
                    className.member(propertyDescriptor.name.asString()).reference()
                )
        }
    }

    private fun signalSanityCheck(propertyDescriptor: PropertyDescriptor) {
        if (propertyDescriptor.type.toString() != "Signal") { //TODO: use correct type
            throw IllegalStateException("You annotated ${propertyDescriptor.fqNameSafe} with @RegisterSignal but it's type is no signal! Use bySignal to define signals.")
        }
    }
}
