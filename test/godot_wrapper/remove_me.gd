extends Node

onready var data = preload("res://godot_wrapper/TestClass.gdns").new()


func _ready():
	data._set("name", "Renamed")