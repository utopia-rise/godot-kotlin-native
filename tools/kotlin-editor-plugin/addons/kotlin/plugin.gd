tool
extends EditorPlugin

const TOOL_ITEM_NAME := "Kotlin Tools"

var popupScene := preload("res://addons/kotlin/tools/KotlinTools.tscn")
var popup: Popup

func _enter_tree():
	add_tool_menu_item ( TOOL_ITEM_NAME, self, "open" )


func _exit_tree():
	remove_tool_menu_item ( TOOL_ITEM_NAME )
	if popup != null:
		popup.hide()
		popup.queue_free()
		popup = null


func open(ud):
	print("Open popup")
	popup = popupScene.instance()
	add_child(popup)
	popup.popup_centered()
