######################################
# KotlinTools.gd
# The main tools window, accessible from:
# Project -> Tools
# Provides new project setup and common gradle actions
######################################

tool
extends WindowDialog

const KOTLIN_ZIP := "res://kotlin.zip"
const DOWNLOAD_FILE := "http://darkrockstudios.com/files/kotlin.zip"

onready var buildDialogScene := preload("res://addons/kotlin/build_dialog/BuildDialog.tscn")
onready var setupDialogScene := preload("res://addons/kotlin/tools/SetupDialog.tscn")
onready var setupDialog: WindowDialog = setupDialogScene.instance()

onready var GradleProperties := load("res://addons/kotlin/tools/GradleProperties.gd")


func _on_AddSupportButton_pressed():
	step_1_create_structure()


func step_1_create_structure():
	add_child(setupDialog)
	setupDialog.show()
	
	print("Step 3: Create project structure")
	var zipFile := File.new()
	if zipFile.file_exists(KOTLIN_ZIP):
		print("Template already downloaded")
		unzip(KOTLIN_ZIP)
	else:
		print("Downloading template")
		download()


func download():
	print("Starting Download...")
	# Create an HTTP request node and connect its completion signal.
	var http_request = HTTPRequest.new()
	add_child(http_request)
	http_request.connect("request_completed", self, "_http_request_completed")
	
	# Perform the HTTP request. The URL below returns some JSON as of writing.
	var error = http_request.request(DOWNLOAD_FILE)
	if error != OK:
		push_error("An error occurred in the HTTP request.")


func _http_request_completed(result: int, response_code: int, headers: PoolStringArray, body: PoolByteArray):
	if response_code == 200:
		print("Download complete.")
		var zipFile := File.new()
		zipFile.open(KOTLIN_ZIP, File.WRITE)
		zipFile.store_buffer(body)
		zipFile.close()
		
		unzip(KOTLIN_ZIP)
	else:
		print("Failed to download zip")
		setupDialog.hide()


func unzip(filePath: String):
	var thread := Thread.new()
	thread.start(self, "background_unzip", filePath)


func background_unzip(filePath: String):
	var dir := Directory.new()
	dir.open("res://")
	
	var gdunzip = load('res://addons/kotlin/gdunzip/gdunzip.gd').new()
	var loaded = gdunzip.load(filePath)
	if loaded:
		for f in gdunzip.files.values():
			var file = File.new()
			print(f.file_name)
			if f.file_name.find("/") > -1:
				
				var pathParts = f.file_name.split("/", false)
				pathParts.remove(pathParts.size()-1) # Remove the file
				var justDirectories := ""
				for part in pathParts:
					justDirectories += "%s/" % part
					print("Making directories: %s" % justDirectories)
					dir.make_dir_recursive(justDirectories)
			
			file.open(f.file_name, File.WRITE)
			var uncompressed = gdunzip.uncompress(f.file_name)
			file.store_buffer(uncompressed)
			file.close()
	
	call_deferred("step_2_cleanup")


func step_2_cleanup():
	print("Step 2: Clean up")
	var dir = Directory.new()
	dir.remove(KOTLIN_ZIP)
	
	step_3_configure()


func step_3_configure():
	print("Step 3: Configure project")
	configure_gradle(true)


func step_4_create_library():
	print("Step 4: Create GDNative library")
	
	# Create the GDNlib file
	var gdnslib := GDNativeLibrary.new()
	
	gdnslib.config_file.set_value("general", "singleton", false)
	gdnslib.config_file.set_value("general", "load_once", true)
	gdnslib.config_file.set_value("general", "symbol_prefix", "godot_")
	gdnslib.config_file.set_value("general", "reloadable", true)
	
	gdnslib.config_file.set_value("entry", "OSX.64", "res://kotlin/build/bin/osx/debugShared/libkotlin.dylib")
	gdnslib.config_file.set_value("entry", "Windows.64", "res://kotlin/build/bin/windows/debugShared/kotlin.dll")
	gdnslib.config_file.set_value("entry", "X11.64", "res://kotlin/build/bin/linux/debugShared/libkotlin.so")
	
	gdnslib.config_file.set_value("dependencies", "OSX.64", [])
	gdnslib.config_file.set_value("dependencies", "Windows.64", [])
	gdnslib.config_file.set_value("dependencies", "X11.64", [])
	
	gdnslib.config_file.save("res://kotlin.gdnlib")
	
	# All done! Close it out
	setupDialog.hide()
	setup_complete()


func configure_gradle(inSetup: bool = false):
	var buildDialog := buildDialogScene.instance() as BuildDialog
	# During setup, continue on to the next step, other wise just finish
	if inSetup:
		buildDialog.connect("build_complete", self, "step_4_create_library")
	add_child(buildDialog)
	buildDialog.show()
	buildDialog.start_build("config")


func setup_complete():
	hide()
	
	var completeDialog := AcceptDialog.new()
	completeDialog.window_title = "Kotlin setup"
	completeDialog.dialog_text = "Setup complete!"
	get_parent().add_child(completeDialog)
	completeDialog.popup_centered()


func _on_ConfigGradleButton_pressed():
	configure_gradle()


func _on_BuildButton_pressed():
	var buildDialog := buildDialogScene.instance()
	add_child(buildDialog)
	buildDialog.show()
	buildDialog.start_build("build")


# Configure the tool window
func _on_KotlinToolMenuItem_about_to_show():
	var dir := Directory.new()
	# Kotlin is already setup, show actions
	if dir.dir_exists("res://kotlin"):
		update_build_target()
		
		$ActionsContainer.show()
		$SetupContainer.hide()
	# Not setup yet, show intro
	else:
		$ActionsContainer.hide()
		$SetupContainer.show()


func _on_BuildTargetButton_item_selected(id):
	match id:
		0:
			GradleProperties.write_property(GradleProperties.KEY_BUILD_TARGET, "debug")
			print("Updating Kotlin Build Target to: DEBUG")
		1:
			GradleProperties.write_property(GradleProperties.KEY_BUILD_TARGET, "release")
			print("Updating Kotlin Build Target to: RELEASE")

# Update the build target selector
func update_build_target():
	
	var buildTarget = GradleProperties.read_build_target()
	
	if buildTarget == "debug":
			$ActionsContainer/BuildTargetButton.selected = 0
	elif buildTarget == "release":
			$ActionsContainer/BuildTargetButton.selected = 1
	# Default to debug
	else:
			$ActionsContainer/BuildTargetButton.selected = 0
