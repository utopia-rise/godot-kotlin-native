######################################
# plugin.gd
# GodotKotlin Editor Plugin
# New project setup and gradle builds
######################################

tool
extends EditorPlugin

const TOOL_ITEM_NAME := "Kotlin Tools"

var kotlinToolsScene := load("res://addons/kotlin/tools/KotlinTools.tscn")
var kotlinToolsPopup: Popup

var buildButton := preload("res://addons/kotlin/build_button/GradleBuildButton.tscn").instance()
var buildDialogScene := preload("res://addons/kotlin/build_dialog/BuildDialog.tscn")


func _enter_tree():
	add_tool_menu_item ( TOOL_ITEM_NAME, self, "on_tool_menu_click" )
	add_control_to_container(EditorPlugin.CONTAINER_TOOLBAR, buildButton)
	buildButton.connect("pressed", self, "on_gradle_build_click")


func _exit_tree():
	remove_tool_menu_item ( TOOL_ITEM_NAME )
	if kotlinToolsPopup != null:
		kotlinToolsPopup.hide()
		kotlinToolsPopup.queue_free()
		kotlinToolsPopup = null
	
	remove_control_from_container(EditorPlugin.CONTAINER_TOOLBAR, buildButton)


func on_tool_menu_click(ud):
	open_tools_window()


func open_tools_window():
	kotlinToolsPopup = kotlinToolsScene.instance()
	get_editor_interface().get_editor_viewport().add_child(kotlinToolsPopup)
	kotlinToolsPopup.popup_centered()


func on_gradle_build_click():
	var dir := Directory.new()
	if dir.dir_exists("res://kotlin"):
		open_build_dialog()
	else:
		open_tools_window()


func open_build_dialog():
	var buildDialog = buildDialogScene.instance()
	get_editor_interface().get_editor_viewport().add_child(buildDialog)
	buildDialog.show()
	buildDialog.start_build("build")
