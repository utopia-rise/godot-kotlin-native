package godot.annotation

interface Defaults {
    annotation class Int(val value: kotlin.Int)
    annotation class Long(val value: kotlin.Long)
    annotation class Float(val value: kotlin.Float)
    annotation class Double(val value: kotlin.Double)
    annotation class Boolean(val value: kotlin.Boolean)
    annotation class String(val value: kotlin.String)
}
