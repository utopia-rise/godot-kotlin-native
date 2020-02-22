######################################
# GradleProperties.gd
# Class for interacting with gradle.properties
######################################

tool
extends Node

const FILE_PATH := "res://kotlin/gradle.properties"

const KEY_BUILD_TYPE := "buildType"
const KEY_PLATFORM := "platform"


static func read_build_type() -> String:
	var properties := read_properties()
	
	var buildTarget: String
	if properties != null and properties.size() > 0:
		for key in properties:
			if key.to_lower() == KEY_BUILD_TYPE.to_lower():
				var value := properties[key] as String
				buildTarget = value
				break
	
	return buildTarget


static func read_properties() -> Dictionary:
	var properties := {}
	
	var file := File.new()
	
	var openResult := file.open(FILE_PATH, File.READ)
	if openResult == OK:
		
		while not file.eof_reached():
			var line = file.get_line().strip_edges()
			if line.length() > 0 and line[0] != "#":
				var parts = line.split("=")
				properties[ parts[0].strip_edges() ] = parts[1].strip_edges()
	
	file.close()
	
	return properties


static func write_property(key: String, value: String):
	var properties := read_properties()
	properties[key] = value
	write_properties(properties)


static func write_properties(properties: Dictionary):
	var file := File.new()
	
	var openResult := file.open(FILE_PATH, File.WRITE) # Open and truncate
	if openResult == OK:
		file.store_line("# Generated by Godot/Kotlin Editor Plugin")
		file.store_line("# Manual edits to this file may be lost")
		file.store_line("")
		if properties.size() > 0:
			for key in properties:
				var value := properties[key] as String
				var line := "%s=%s" % [key, value]
				file.store_line(line)
	
	file.close()
	print("gradle.properties written.")
