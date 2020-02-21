######################################
# GradleUtilities.gd
# Functions for dealing with calling
# gradle tasks
######################################

extends Node
class_name GradleUtilities


static func gradle_configure():
	execute("gradlew.bat")


static func gradle_build():
	execute("build.bat")


static func execute(command: String):
	var output := []
	OS.execute("CMD.exe", ["/C cd kotlin && %s" % command], true, output)
	print(output)
