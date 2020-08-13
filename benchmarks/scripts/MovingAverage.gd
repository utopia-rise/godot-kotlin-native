var size
var samples
var total
var index

func _init(size):
    self.size = size
    self.samples = []
    for i in range(size):
        self.samples.append(0)
    self.total = 0.0
    self.index = 0


func add(value):
    total -= samples[index]
    samples[index] = value
    total += value
    index += 1
    if index == size:
        index = 0

func get_avg():
    return total / size
