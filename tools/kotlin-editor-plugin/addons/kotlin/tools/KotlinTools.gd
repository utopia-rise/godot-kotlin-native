tool
extends WindowDialog

const KOTLIN_ZIP := "res://kotlin.zip"
const DOWNLOAD_FILE := "http://darkrockstudios.com/files/kotlin.zip"

onready var buildDialogScene := preload("res://addons/kotlin/build_dialog/BuildDialog.tscn")
onready var setupDialogScene := preload("res://addons/kotlin/tools/SetupDialog.tscn")
onready var setupDialog: WindowDialog = setupDialogScene.instance()


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
		remove_child(setupDialog)


func unzip(filePath: String):
	var thread := Thread.new()
	thread.start(self, "background_unzip", filePath)


func background_unzip(filePath: String):
	var dir := Directory.new()
	dir.open("res://")
	
	var gdunzip = load('res://addons/gdunzip/gdunzip.gd').new()
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
	setupDialog.hide()
	remove_child(setupDialog)
	
	print("Step 3: Configure project")
	var buildDialog := buildDialogScene.instance() as BuildDialog
	buildDialog.buildType = "config"
	add_child(buildDialog)
	buildDialog.show()


func _on_ConfigGradleButton_pressed():
	step_3_configure()


func _on_BuildButton_pressed():
	var buildDialog := buildDialogScene.instance()
	buildDialog.buildType = "build"
	add_child(buildDialog)
	buildDialog.show()
	buildDialog.start_build()
