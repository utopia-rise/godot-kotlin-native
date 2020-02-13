# Compiling from Source

## Cloning and initialising the project
Clone repo on your local machine:
```shell 
git clone https://github.com/utopia-rise/godot-kotlin.git
git submodule init
git submodule update
```

## Building
Use `build` gradle task to automatically build all subprojects. All artifacts will be published to your local maven repository.

## Building the samples
The samples are not built with the top level `build` gradle task.

Instead, navigate to one of the samples kotlin directories:
`samples/games/kotlin`
`samples/coroutines/kotlin`

Then build them manually by directly calling the `build` task of the samples from the IDE or through the commandline:
`./gradlew build`
