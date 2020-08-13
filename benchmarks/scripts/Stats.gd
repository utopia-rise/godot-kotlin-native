const SEC_IN_USEC = 1000000.0

var data = []

func add(time):
    data.append(time)

func get_avg():
    var total = 0.0
    for i in data:
        total += i
    return total / len(data)

func get_median():
    var copy = data.duplicate()
    copy.sort()
    var length = len(copy)
    var middle = length / 2
    if length % 2 == 1:
        return copy[middle]
    else:
        return (copy[middle - 1] + copy[middle]) / 2.0

func get_percentile(percentile):
    var copy = data.duplicate()
    copy.sort()
    var index = int(percentile * len(copy))
    return copy[index]


func _to_string():
    var avg = SEC_IN_USEC / get_avg()
    # avoid division by zero
    var m = get_median()
    if m == 0:
        m = 1
    var median = SEC_IN_USEC / m
    var pc95 = SEC_IN_USEC / get_percentile(0.95)
    var pc99 = SEC_IN_USEC / get_percentile(0.99)
    var args = [avg, median, pc95, pc99]
    return "avg=%d op/s, median=%d op/s, 95pc=%d op/s, 99pc=%d op/s" % args