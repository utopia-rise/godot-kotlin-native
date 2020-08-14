var data = {}

func add(benchmark, results):
    var name = benchmark.name
    var lang = benchmark.lang
    if not data.has(name):
        data[name] = {}

    data[name][lang] =  results

func to_json():
    return JSON.print(data)
