package org.godotengine.kotlin.entrygenerator.utils

import org.jetbrains.kotlin.descriptors.FunctionDescriptor
import org.jetbrains.kotlin.resolve.descriptorUtil.varargParameterPosition

fun FunctionDescriptor.hasVarargParameter(): Boolean {
    return this.varargParameterPosition() != -1
}