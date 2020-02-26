######################################
# KotlinTools.gd
# The main tools window, accessible from:
# Project -> Tools
# Provides new project setup and common gradle actions
######################################

tool
extends WindowDialog

const KOTLIN_ZIP := "res://kotlin_template.zip"
const GITHUB_USER := "utopia-rise"
const DOWNLOAD_FILE := "https://github.com/%s/godot-kotlin/releases/latest/download/%s" % [GITHUB_USER, KOTLIN_ZIP]

onready var buildDialogScene := preload("res://addons/kotlin/build_dialog/BuildDialog.tscn")
onready var setupDialogScene := preload("res://addons/kotlin/tools/SetupDialog.tscn")
onready var setupDialog: WindowDialog = setupDialogScene.instance()

onready var GradleProperties := load("res://addons/kotlin/tools/GradleProperties.gd")

export(NodePath) var buildTypeSelectorPath: NodePath
onready var buildTypeSelector: OptionButton = get_node(buildTypeSelectorPath)

export(NodePath) var platformSelectorPath: NodePath
onready var platformSelector: OptionButton = get_node(platformSelectorPath)

export(NodePath) var armArchSelectorPath: NodePath
onready var armArchSelector: OptionButton = get_node(armArchSelectorPath)

export(NodePath) var iosIdentityLineEditPath: NodePath
onready var iosIdentityLineEdit: LineEdit = get_node(iosIdentityLineEditPath)

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
	
	if not GradleUtilities.is_windows():
		print("Setting permissions...")
		var output := []
		OS.execute("/bin/chmod", ["+x", "kotlin/gradlew"], true, output)
		print(output)
		output.clear()
		OS.execute("/bin/chmod", ["+x", "kotlin/runBuild"], true, output)
		print(output)
	
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
		update_ui_from_properties()
		
		$ActionsContainer.show()
		$SetupContainer.hide()
	# Not setup yet, show intro
	else:
		$ActionsContainer.hide()
		$SetupContainer.show()


func _on_BuildTypeButton_item_selected(id):
	match id:
		0:
			print("Updating Kotlin Build Type to: DEBUG")
			GradleProperties.write_property(GradleProperties.KEY_BUILD_TYPE, "debug")
		1:
			print("Updating Kotlin Build Type to: RELEASE")
			GradleProperties.write_property(GradleProperties.KEY_BUILD_TYPE, "release")


func update_ui_from_properties():
	var properties := GradleProperties.read_properties() as Dictionary
	update_build_type(properties)
	update_platform(properties)
	update_arm_arch(properties)
	update_ios_identity(properties)


# Update the build type selector
func update_build_type(properties: Dictionary):
	var buildType = null
	if properties.has(GradleProperties.KEY_BUILD_TYPE):
		buildType = properties[GradleProperties.KEY_BUILD_TYPE]
	
	if buildType == "debug":
		buildTypeSelector.selected = 0
	elif buildType == "release":
		buildTypeSelector.selected = 1
	else:
		buildTypeSelector.selected = 0


func update_platform(properties: Dictionary):
	var platform = null
	if properties.has(GradleProperties.KEY_PLATFORM):
		platform = properties[GradleProperties.KEY_PLATFORM]
	
	if platform == "windows":
		platformSelector.selected = 1
	elif platform == "linux":
		platformSelector.selected = 2
	elif platform == "macos":
		platformSelector.selected = 3
	elif platform == "ios":
		platformSelector.selected = 4
	elif platform == "android":
		platformSelector.selected = 5
	# Default to all
	else:
		platformSelector.selected = 0


func _on_PlatformButton_item_selected(id):
	var newPlatform = null
	match id:
		# all
		0:
			newPlatform = null
		1:
			newPlatform = "windows"
		2:
			newPlatform = "linux"
		3:
			newPlatform = "macos"
		4:
			newPlatform = "ios"
		5:
			newPlatform = "android"
		_:
			newPlatform = null
	
	GradleProperties.write_property(GradleProperties.KEY_PLATFORM, newPlatform)


func update_arm_arch(properties: Dictionary):
	var armArch = null
	if properties.has(GradleProperties.KEY_ARM_ARCH):
		armArch = properties[GradleProperties.KEY_ARM_ARCH]
	
	if armArch == "arm64":
		armArchSelector.selected = 0
	elif armArch == "x64":
		armArchSelector.selected = 1
	else:
		armArchSelector.selected = 0


func _on_ArmArchOptionButton_item_selected(id):
	var newArmArch: String
	match id:
		# all
		0:
			newArmArch = "arm64"
		1:
			newArmArch = "x64"
	
	GradleProperties.write_property(GradleProperties.KEY_ARM_ARCH, newArmArch)


func update_ios_identity(properties: Dictionary):
	var iosSigningIdentity = null
	if properties.has(GradleProperties.KEY_IOS_IDENTITY):
		iosSigningIdentity = properties[GradleProperties.KEY_IOS_IDENTITY]
	
	if iosSigningIdentity != null:
		iosIdentityLineEdit.text = iosSigningIdentity
	else:
		iosIdentityLineEdit.text = ""


func _on_iOSIdentityLineEdit_text_changed(new_text):
	var newIdentity = iosIdentityLineEdit.text.strip_edges()
	if newIdentity.length() == 0:
		newIdentity = null
	
	GradleProperties.write_property(GradleProperties.KEY_IOS_IDENTITY, newIdentity)
