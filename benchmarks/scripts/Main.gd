extends MainLoop

var Benchmarks = load("res://scripts/Benchmarks.gd")
var Stats = load("res://scripts/Stats.gd")
var Report = load("res://scripts/Report.gd")

var classes = [
    "Simple"
]
var languages = [
    "gd",
    "kt"
]

func _init():
    var report = Report.new()
    var factory = Benchmarks.new()
    for cls in classes:
        for lang in languages:
            for benchmark in factory.create(lang, cls):
                __run_benchmark(benchmark, report)
    __save_report(report)


func __run_benchmark(benchmark, report, iterations=3, runs=10, warmups=5):
    var stats = Stats.new()
    print("Running benchmark: %s" % str(benchmark))
    for warmup in range(warmups):
        __do_run(warmup, benchmark, stats, runs, true)
    for iteration in range(iterations):
        __do_run(iteration, benchmark, stats, runs, false)
    print("Results: %s" % str(stats))
    report.add(benchmark, stats.get_results())


func __do_run(iteration, benchmark, stats, runs, is_warmup):
    for run in range(runs):
        var start = OS.get_ticks_usec()
        benchmark.exec()
        var duration = OS.get_ticks_usec() - start
        if not is_warmup:
            stats.add(duration)
            #print("[iteration=%d,run=%d] %dus" % [iteration, run, duration])

func __save_report(report):
    var f = File.new()
    f.open("res://build/benchmark-results.json", File.WRITE_READ)
    f.store_string(report.to_json())
    f.close()
