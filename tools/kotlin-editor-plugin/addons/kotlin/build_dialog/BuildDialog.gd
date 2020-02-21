tool
extends BaseProgressDialog
class_name BuildDialog


var buildType: String = "build"


func set_build_type(newType: String):
	buildType = newType


func start_build():
	var buildThread = Thread.new()
	buildThread.start(self, "build")


func build(data):
	if buildType == "config":
		KotlinUtilities.gradle_configure()
	elif buildType == "build":
		KotlinUtilities.gradle_build()
	else:
		assert(false) # Build type must be valid
	call_deferred("hide")
	call_deferred("queue_free")
