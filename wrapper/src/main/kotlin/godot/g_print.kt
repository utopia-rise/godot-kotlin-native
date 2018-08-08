package kotlin.godot

import godot.*
import kotlinx.cinterop.*
import kotlin.godot.core.Godot
import kotlin.godot.core.GodotString


fun string_tests() {
    Godot.print(GodotString("Hello from constructor"))
    Godot.print("Testing constructors for nums")
    Godot.print(GodotString("Scientific: ") + GodotString.num_scientific(1234567890.0987654321))
    Godot.print(GodotString("Real: ") + GodotString.num_real(1234567890.0987654321))
    Godot.print(GodotString("Num: ") + GodotString.num(1234567890.0987654321, 10))
    Godot.print(GodotString("Int64: ") + GodotString.num_int64(1234567890))
    Godot.print(GodotString("Char: ") + GodotString.char('F'.toShort()))
    val str1 = GodotString("Equal")
    val str2 = GodotString("Equal")
    val str3 = GodotString(str2)
    Godot.print("Testing equals: " +
            if(str1 == str2 && str2 == str3)
                "OK"
            else
                "ERROR")
    Godot.print("Testing length: " +
            if(GodotString("length").length() == 6)
                "OK"
            else
                "ERROR")

    Godot.print("Testing begin_with: " +
            if(GodotString("begin_with").begins_with(GodotString("be")) &&
                    GodotString("begin_with").begins_with(GodotString("begi")) &&
                    GodotString("begin_with").begins_with(GodotString("begin")) &&
                    GodotString("begin_with").begins_with(GodotString("begin_w")) &&
                    GodotString("begin_with").begins_with(GodotString("begin_with")) &&
                    !GodotString("begin_with").begins_with(GodotString("with_begin")))
                "OK"
            else
                "ERROR")
    Godot.print("Testing begin_with_char_array: " +
            if(GodotString("begin_with").begins_with_char_array("be") &&
                    GodotString("begin_with").begins_with_char_array("begi") &&
                    GodotString("begin_with").begins_with_char_array("begin") &&
                    GodotString("begin_with").begins_with_char_array("begin_w") &&
                    GodotString("begin_with").begins_with_char_array("begin_with") &&
                    !GodotString("begin_with").begins_with_char_array("with_begin"))
                "OK"
            else
                "ERROR")
    val str = GodotString("capitalized string")
    Godot.print("Testing capitalize: " +
            if(GodotString("Capitalized String") == str.capitalize())
                "OK"
            else {
                "ERROR"
            } + "  Effect: " + str + " -> " + str.capitalize())
    Godot.print("Testing get: " +
            if(str[0] == 'c' && str[1] == 'a' && str[2] == 'p')
                "OK"
            else
                "ERROR")

    Godot.print("Testing hex_to_int: " +
            if(GodotString("0xFF").hex_to_int() == 255)
                "OK"
            else
                "ERROR")
}