package godot.core

internal interface gdCore {

    /** Returns length of Variant var */
    fun len(s: String) : Int = s.length
    /** Returns length of Variant var */
    fun len(s: NodePath) : Int = len(s.path)
    /** Returns length of Variant var */
    fun <T> len(s: GodotArray<T>) : Int = s.size
    /** Returns length of Variant var */
    fun len(s: Dictionary) : Int = s.size
    /** Returns length of Variant var */
    fun len(s: PoolByteArray) : Int = s.size
    /** Returns length of Variant var */
    fun len(s: PoolColorArray) : Int = s.size
    /** Returns length of Variant var */
    fun len(s: PoolIntArray) : Int = s.size
    /** Returns length of Variant var */
    fun len(s: PoolRealArray) : Int = s.size
    /** Returns length of Variant var */
    fun len(s: PoolStringArray) : Int = s.size
    /** Returns length of Variant var */
    fun len(s: PoolVector2Array) : Int = s.size
    /** Returns length of Variant var */
    fun len(s: PoolVector3Array) : Int = s.size
}
