######################################
# BuildDialog.gd
# Build is run in a background thread, so
# this dialog indicates the build is running
# and it will auto-hide when the build is finished
######################################

tool
extends BaseProgressDialog
class_name BuildDialog

signal build_complete

var buildType: String = "build"
var buildThread: Thread


func start_build(type: String):
	buildType = type
	buildThread = Thread.new()
	buildThread.start(self, "build")


func build(data):
	if buildType == "config":
		GradleUtilities.gradle_configure()
	elif buildType == "build":
		GradleUtilities.gradle_build()
	else:
		assert(false) # Build type must be valid
	
	emit_signal("build_complete")
	call_deferred("close")

func close():
	if buildThread != null:
		buildThread.wait_to_finish()
		buildThread = null
	
	hide()
	queue_free()
