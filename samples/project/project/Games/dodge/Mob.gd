extends RigidBody2D
var mob_types = ["walk", "swim", "fly"]

func _ready():
#	var spriteFrames = SpriteFrames.new()
#	spriteFrames.add_animation("dick")
#	spriteFrames.add_animation("hui")
#	var list = spriteFrames.get_animation_names()
	$AnimatedSprite.animation = mob_types[randi() % mob_types.size()]
	$AnimatedSprite.play()
	


#func _process(delta):
#	# Called every frame. Delta is time since last frame.
#	# Update game logic here.
#	pass


func _on_VisibilityNotifier2D_screen_exited():
	queue_free()
