# Compiling from sources

Clone repo on your local machine:
```shell 
git clone https://github.com/MrAkakuy/kotlin-godot-wrapper.git
git submodule init
git submodule update
```

Use `buildAll.sh` or `build.bat` scripts to automatically build all. Artifacts will be stored into `local_repo` directory.

Build order:
 - *tools/api_classes_generator*, task `run`
 - *wrapper*, task `publish`
 - *tools/entry_generator*, task `build`
 - *tools/gradle_plugin*, task `build`
 
 Samples:
 - *samples\games\kotlin*, task `build`
 - *samples\coroutines\kotlin*, task `build`