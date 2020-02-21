######################################
# ProgressDialog.gd
# Base class for showing the user that a
# background task is running.
######################################

tool
extends WindowDialog
class_name BaseProgressDialog

const rollOver := 2.0
var rotating_progress := 0.0

func _process(delta):
	rotating_progress += delta
	if rotating_progress > rollOver:
		rotating_progress = 0.0
	
	$VBoxContainer/ProgressBar.value = (rotating_progress / rollOver) * $VBoxContainer/ProgressBar.max_value


func _on_ProgressDialog_popup_hide():
	get_parent().remove_child(self)
