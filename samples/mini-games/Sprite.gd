extends Sprite

export(Curve) var curve: Curve

func _ready() -> void:
	yield(get_parent(), "ready")
#	get_parent().testFunctionWithManyParams(0, 1, false, Vector3.UP, Plane.PLANE_XY, Transform(), curve, texture, "Hello there...", [0, 2])
	get_parent().test_function_with_many_params(0, 1, false, Vector3.UP, Plane.PLANE_XY, Transform(), curve, texture, "Hello there...", [0, 2])
	
	
