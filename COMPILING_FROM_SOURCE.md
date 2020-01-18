# Compiling from Source

## Cloning and initialising the project
Clone repo on your local machine:
```shell 
git clone https://github.com/utopia-rise/kotlin-godot-wrapper.git
git submodule init
git submodule update
```

## Building
Use `build` gradle task to automatically build all subprojects. All artifacts will be published to your local maven repository.

## Building the samples
Per default the samples are not built with the top level `build` gradle task. But you can build them the following ways:
- Build them manually by directly calling the `build` task of the samples from the IDE or through the commandline:  
`./gradlew :samples:games:kotlin:build`  
or  
`./gradlew :samples:coroutines:kotlin:build`
- Set the property `skipSamplesBuild` to `false` in the [gradle.properties](gradle.properties) file and build using the top level `build` task.
 