extends Spatial

export(String, "GdScript", "Kotlin") var language: String = "GdScript"
export(int, 100, 10000, 100) var limit = 1000
export(int, 10, 200, 10) var size = 50

var game = preload("res://game.tscn").instance()

# Called when the node enters the scene tree for the first time.
func _ready():
	if language == "GdScript":
		var script = load("res://scripts/gamelife/game.gd")
		game.set_script(script)
	else:
		var script = load("res://scripts/gamelife/Game.gdns")
		game.set_script(script)
	game.limit = limit
	game.size = size
	add_child(game)
