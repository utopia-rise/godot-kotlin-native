func benchmark_simple_add():
    var a = 1
    var b = 2
    return a + b

func benchmark_avg():
    var size = 10000
    var total = 0
    for i in range(size):
        total += i
    return total / size