extends CanvasLayer
signal start_game

func show_message(text):
	$MessageLabel.text = text
	$MessageLabel.show()
	$MessageTimer.start()
	
func show_menu():
	$StartButton.text = "Start"
	$StartButton.show()
	$MessageLabel.text = "Dodge the\nCreeps!"
	$MessageLabel.show()
	
func show_game_over():
	$MessageLabel.text = "Game over!"
	$MessageLabel.show()
	$WaitingTimer.start()
	
	
func update_score(score):
	$ScoreLabel.text = str(score)
	
func do_nothing():
	{}
	
	
	

func _on_MessageTimer_timeout():
	$MessageLabel.hide()


func _on_StartButton_pressed():
	$StartButton.hide()
	emit_signal("start_game")


func _on_WaitingTimer_timeout():
	$MessageLabel.hide()
	show_menu()
