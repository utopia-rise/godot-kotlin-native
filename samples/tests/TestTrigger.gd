extends Node2D
class_name TestTrigger

enum Result { OK, FAILED }

export (Array,PackedScene) var tests := []

var results := []

func _process(_delta) -> void:
	for testScenePath in tests:
		var testScene = testScenePath.instance()
		add_child(testScene)
		yield(testScene, "tree_exited")
	
	var someTestsFailed = false
	for i in range(results.size()):
		if results[i][0] != Result.OK:
			someTestsFailed = true
			printerr("Test %s failed with: %s" % [results[i][1], results[i][2]])
		else:
			print("Test %s succeeded" % results[i][1])
	
	if someTestsFailed:
		get_tree().quit(1)
	else:
		get_tree().quit(0)
