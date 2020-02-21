tool
extends EditorPlugin

const TOOL_ITEM_NAME := "Kotlin Tools"

var kotlinToolsScene := load("res://addons/kotlin/tools/KotlinTools.tscn")
var kotlinToolsPopup: Popup

var buildButton := preload("res://addons/kotlin/build_button/GradleBuildButton.tscn").instance()
var buildDialogScene := preload("res://addons/kotlin/build_dialog/BuildDialog.tscn")


func _enter_tree():
	add_tool_menu_item ( TOOL_ITEM_NAME, self, "open" )
	add_control_to_container(EditorPlugin.CONTAINER_TOOLBAR, buildButton)
	buildButton.connect("pressed", self, "open_build_dialog")


func _exit_tree():
	remove_tool_menu_item ( TOOL_ITEM_NAME )
	if kotlinToolsPopup != null:
		kotlinToolsPopup.hide()
		kotlinToolsPopup.queue_free()
		kotlinToolsPopup = null
	
	buildButton.disconnect("pressed", self, "open_build_dialog")
	remove_control_from_container(EditorPlugin.CONTAINER_TOOLBAR, buildButton)


func open(ud):
	kotlinToolsPopup = kotlinToolsScene.instance()
	add_child(kotlinToolsPopup)
	kotlinToolsPopup.popup_centered()


func open_build_dialog():
	var buildDialog = buildDialogScene.instance()
	buildDialog.set_build_type("build")
	add_child(buildDialog)
	buildDialog.show()
	buildDialog.start_build()
