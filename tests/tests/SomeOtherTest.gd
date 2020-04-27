extends Node2D


func _ready():
	#do some test
	print("Executing test %s" % self.get_script().get_path())
	
	var failed = false
	if failed:
		(get_parent() as TestTrigger).results.append([TestTrigger.Result.FAILED, self.get_script().get_path(), "Some error message"])
	else:
		(get_parent() as TestTrigger).results.append([TestTrigger.Result.OK, self.get_script().get_path(), ""])
	
	#once test finished
	queue_free()
