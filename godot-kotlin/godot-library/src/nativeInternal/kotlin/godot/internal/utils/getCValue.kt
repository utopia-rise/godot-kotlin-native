package godot.internal.utils

import kotlinx.cinterop.*

internal fun MemScope.getLongVar(long: Long?) = if (long != null) getLongVar(long) else null

internal fun MemScope.getLongVar(long: Long) = alloc<LongVar>().apply {
    this.value = long
}

internal fun MemScope.getDoubleVar(double: Double?) = if (double != null) getDoubleVar(double) else null

internal fun MemScope.getDoubleVar(double: Double) = alloc<DoubleVar>().apply {
    this.value = double
}

internal fun MemScope.getBooleanVar(boolean: Boolean?)= if (boolean != null) getBooleanVar(boolean) else null

internal fun MemScope.getBooleanVar(boolean: Boolean) = alloc<BooleanVar>().apply {
    this.value = boolean
}
