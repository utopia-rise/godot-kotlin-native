extends Node

onready var data = load("res://godot_wrapper/godot_wrapper.gdns").new()

func _ready():
	print(data.method())