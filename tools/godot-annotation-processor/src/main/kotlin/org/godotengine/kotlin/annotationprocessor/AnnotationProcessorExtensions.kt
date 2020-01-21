package org.godotengine.kotlin.annotationprocessor

import javax.tools.Diagnostic

fun RegisterAnnotationProcessor.info(message: String) {
    this.logger.printMessage(Diagnostic.Kind.NOTE, message)
}

fun RegisterAnnotationProcessor.warning(message: String, optionalException: Exception? = null) {
    if (optionalException != null) {
        this.logger.printMessage(Diagnostic.Kind.WARNING, "$message\n${optionalException.printStackTrace()}")
    } else {
        this.logger.printMessage(Diagnostic.Kind.WARNING, message)
    }
}

fun RegisterAnnotationProcessor.error(message: String, optionalException: Exception? = null) {
    if (optionalException != null) {
        this.logger.printMessage(Diagnostic.Kind.ERROR, "$message\n${optionalException.printStackTrace()}")
    } else {
        this.logger.printMessage(Diagnostic.Kind.ERROR, message)
    }
}