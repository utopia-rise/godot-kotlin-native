package org.godotengine.kotlin.entrygenerator.utils

import org.jetbrains.kotlin.descriptors.CallableMemberDescriptor
import org.jetbrains.kotlin.resolve.descriptorUtil.varargParameterPosition

fun CallableMemberDescriptor.hasVarargParameter(): Boolean {
    return this.varargParameterPosition() != -1
}