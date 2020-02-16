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
You can also build modules independently in this order:
```shell script
./gradlew :tools:api-classes-generator:build
./gradlew :tools:annotations -Pplatform=windows/linux/macos/android #(add -Pandroid_arch=arm64/X64) for android build
./gradlew :wrapper:godot-library:build -Pplatform=windows/linux/macos/android #(add -Pandroid_arch=arm64/X64) for android build
./gradlew :wrapper:godot-library-extension:build -Pplatform=windows/linux/macos #Extension is not currently supported on android, we're working on that'
./gradlew :tools:godot-gradle-plugin:build
./gradlew :tools:godot-annotation-processor:build
./gradlew :tools:kotlin-compiler-plugin:build
./gradlew :tools:kotlin-compiler-native-plugin:build
```

or you can add the parameter to your `gradle.properties` file if you're supporting only one platform:
```
platform=yourplatformgoeshere
```

## Building the samples
Samples projects are not included in root gradle project, as it is not the way it works for end user. In order to build samples
you have to start `build` task from `samples/games/kotlin` directory.
- Build them manually by directly calling the `build` task of the samples from the IDE or through the commandline:  
`cd samples/games/kotlin`  
`./gradlew build -Pplatform=desired_platform`, `desired_platform` can be either `windows`, `linux`, `macos`, `android`.  
For android, you have to add `android_arch` parameter like:  
`./gradlew build -Pplatform=android -Pplatform=X64`, otherwise it will build `arm64` platform by default. Supported target
are for now `arm64` and `X64`  
or  
`cd samples/coroutines/kotlin`
`./gradlew :samples:coroutines:kotlin:build`  
Coroutines are not supported on android for now.
 
