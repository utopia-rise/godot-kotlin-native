# Games sample

Go in the kotlin directory and run `gradlew build` to build this sample.
You can add a platform variable inside kotlin/gradle.properties (platform=windows/linux/macos/android/ios)
Open the project in Godot and inspect the root node. 
You can choose between GdScript or Kotlin, the size of the grid and the length of the benchmark (Number of cycles).


## Benchmark Run - March 05, 2020

### Game of life

A Game of life benchmark where each cell is a 3D Cube. Their colors are updated based on their state.
The default grid size is 50x50 = 2500 cells.
Each cell checks the state of its surrounding (8 others cells) to update its own. 2500 x 8 = 20000 checks each cycle.
The benchmark measure the time it takes for the script to complete 1000 cycles.

| Language             | Elapsed seconds       |
|----------------------|-----------------------|
| Kotlin               | 458                   |
| GDScript             | 13                    |


### Hardware:

* CPU: Intel i5 4690k 3.9GHz
* GPU: Nvidia GeForce GTX 970
* RAM: 16GB DDR3

### Build Info:
* OS: Windows 10
* Official Godot 3.2 release
* Kotlin 1.3


Original work: [@Marcin Zawiejski](https://github.com/dragmz/gdlife). Thanks to him.

