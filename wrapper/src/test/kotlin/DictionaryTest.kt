package kotlin

import kotlin.godot.core.*

class DictionaryTest {
    fun test() {
        Godot.print("Testing Dictionary")
        Godot.print("--------------------------------------")
        val dict = Dictionary()
        Godot.print("Testing isEmpty: " +
                if (dict.isEmpty())
                    "OK"
                else
                    "ERROR")
        Godot.print("Testing size: " +
                if (dict.size() == 0)
                    "OK"
                else
                    "ERROR")
        Godot.print("Testing values: " +
                if (dict.values().size() == 0)
                    "OK"
                else
                    "ERROR")
        Godot.print("Testing has:" +
                if (!dict.has(Variant()))
                    "OK"
                else
                    "ERROR")
        Godot.print("Testing toJson: " + dict.toJson())
        Godot.print("--------------------------------------")
        Godot.print("")
    }
}