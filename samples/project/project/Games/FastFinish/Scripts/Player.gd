extends Area2D

# class member variables go here, for example:
# var a = 2
# var b = "textvar"
var velocity = 0

func _ready():
	# Called when the node is added to the scene for the first time.
	# Initialization here
	pass

func _process(delta):
	if Input.is_action_just_pressed("ui_select"):
		velocity += 1
	get_parent().offset = get_parent().offset + velocity * delta * 15
	
	pass
