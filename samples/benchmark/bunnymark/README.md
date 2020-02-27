![Godot Bunnymark](images/banner.png)

Renders an increasing number of bunny sprites until a stable 60fps is hit.  This is a decent test of real world usage as it combines Godot api usage with raw computation.  I plan to update this README whenever significant performance changes occur or when new languages are added.  Feel free to contribute language implementations or improvements!

## Disclaimer

The performance differences here might appear significant, but these benchmarks test the limits of each language (and the engine), which most games will never hit.  Do not pick a language because it is "fastest" unless you know you need the fastest language.  The smarter choice would be to pick the language you are most productive in.  I personally think that most people will be more productive in GDScript or C#.  A lot of time and energy went into making GDScript an integrated, seamless experience so it is a good starting point if you don't have a preference for any of the other languages listed.

It is also important to note that C#/Mono and GDNative are both very young.  Its possible that their performance characteristics will change.  And please don't use these benchmarks to say "Language X is better / faster than Language Y", we don't have enough data to make those assertions.  If anything this proves that any of the choices below are viable.  Choose the language that you are comfortable with and do your own testing to cover your own scenarios.

## Updates

Follow me on twitter [@cart_cart](https://twitter.com/cart_cart) if you want Bunnymark updates or updates on my other projects!

## Running

* Build C++ files
    * Setup headers and bindings using [these directions](https://github.com/GodotNativeTools/godot-cpp)
    * run ```make``` in the root of this project
* Build C# files
    * run ```msbuild /p:Configuration=Tools;DebugSymbols=false;Optimize=true``` (some terminals might require escaping some of those symbols)
* Build Nim files
    * Setup headers and bindings using [these directions](https://pragmagic.github.io/godot-nim/master/index.html)
    * run ```nake build```
* Build D files
    * `git clone` [godot-d](https://github.com/GodotNativeTools/godot-d) to your favorite directory
    * [generate the bindings](https://github.com/GodotNativeTools/godot-d/blob/master/generator/README.md)
    * run `dub add-local /path/to/godot-d/`
    * run `dub build -b release`
* Build Rust files
    * run `cargo build --release`
* Build Godot with the [ECMAScript module](https://github.com/Geequlim/ECMAScript) if you want to run the ECMAScript tests
* run ```sh run_benchmarks.sh```
* wait!  This will take some time ... the automation code is still a bit naive so it takes awhile to converge on 60 fps
* view the results in ```USER_HOME_DIRECTORY/.godot/app_userdata/Bunnymark/benchmark_results.json```

## Benchmark Run - March 16, 2019

### BunnymarkV2

Attempts to draw as many sprites as possible using Sprite nodes.  It calls GetChildren() to iterate over a list of Sprites and sets their positions.  It also updates a Label's text once per frame.  This test aims to be a better emulation of real world api usage than the V1 tests.

| Language             | Bunnies Rendered |
|----------------------|------------------|
| ECMAScript/Javascript| 4660             |
| GDScript (Release)   | 18560            |
| C#/Mono              | 27555            |
| GDNative (D)         | 28020            |
| GDNative (Nim)       | 29920            |
| GDNative (C++)       | 37480            |

### BunnymarkV1 - DrawTexture

Attempts to draw as many sprites to the screen as possible by drawing textures directly with VisualServer.  This test focuses on compute / render performance and avoids making godot api calls.

| Language             | Bunnies Rendered |
|----------------------|------------------|
| ECMAScript/Javascript| 4340             |
| GDScript (Release)   | 20540            |
| C#/Mono              | 36720            |
| GDNative (Nim)       | 60056            |
| GDNative (C++)       | 65580            |
| GDNative (D)         | 67840            |

### BunnymarkV1 - Sprites

Attempts to draw as many sprites to the screen as possible by adding Sprite nodes.  This test focuses on compute / render performance and avoids making godot api calls.

| Language             | Bunnies Rendered |
|----------------------|------------------|
| ECMAScript/Javascript| 4300             |
| GDScript (Release)   | 17639            |
| GDNative (Nim)       | 37180            |
| C#/Mono              | 37455            |
| GDNative (D)         | 38740            |
| GDNative (C++)       | 41935            |

### Hardware:

* CPU: Intel i7 7700k 4.2GHz
* GPU: Nvidia GeForce GTX 1070
* RAM: 16GB DDR4

### Build Info:
* OS: Arch Linux
* Official Godot 3.1 release

## Credits

* GDScript example adapted from: https://github.com/curly-brace/godot-bunnies.  Thanks [@curly-brace](https://github.com/curly-brace)!
* [@Capital-EX](https://github.com/Capital-EX) provided the initial Nim tests, the D tests, and the display server tests
* [@endragor](https://github.com/endragor) updated the GDNative tests to work with Godot 3.0 stable
* [@Geequlim](https://github.com/Geequlim) added ECMAScript tests
