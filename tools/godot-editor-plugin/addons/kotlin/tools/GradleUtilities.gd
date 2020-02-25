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
		execute("./gradlew")


static func gradle_build():
	if is_windows():
		execute("runBuild.bat")
	else:
		execute("./runBuild")


static func execute(command: String):
	var output := []
	
	if is_windows():
		OS.execute("CMD.exe", ["/C cd kotlin && %s" % command], true, output)
	else:
		var exitStatus = OS.execute('/bin/sh', ["-c", "cd kotlin && %s" % command], true, output)
		print(exitStatus)
	
	print(output)


static func is_windows() -> bool:
	return OS.get_name() == "Windows"
