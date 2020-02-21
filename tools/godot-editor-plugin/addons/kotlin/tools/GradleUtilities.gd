######################################
# GradleUtilities.gd
# Functions for dealing with calling
# gradle tasks
######################################

extends Node
class_name GradleUtilities


static func gradle_configure():
	if is_windows():
		execute("gradlew.bat")
	else:
		execute("gradlew")


static func gradle_build():
	if is_windows():
		execute("build.bat")
	else:
		execute("build")


static func execute(command: String):
	var output := []
	
	if is_windows():
		OS.execute("CMD.exe", ["/C cd kotlin && %s" % command], true, output)
	else:
		OS.execute("sh", ["cd kotlin && %s" % command], true, output)
	
	print(output)


static func is_windows() -> bool:
	return OS.get_name() == "Windows"
