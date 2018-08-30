extends Path2D

# class member variables go here, for example:
# var a = 2
# var b = "textvar"

func _ready():
	var tween = Tween.new()
	add_child(tween)
	var follow = get_node("PathFollow2D")
	tween.start()
	pass

#func _process(delta):
#	# Called every frame. Delta is time since last frame.
#	# Update game logic here.
#	pass
