./gradlew :tools:api-classes-generator:run
if [ $3 == "linux" ]; then
  ./gradlew :tools:entry-generator:bintrayUpload -PbintrayUser=$1 -PbintrayKey=$2
  ./gradlew :tools:api-classes-generator:bintrayUpload -PbintrayUser=$1 -PbintrayKey=$2
  ./gradlew :tools:annotations-internal:bintrayUpload -PbintrayUser=$1 -PbintrayKey=$2 -Pplatform=kotlinMultiplatform
  ./gradlew :tools:annotations-internal:bintrayUpload -PbintrayUser=$1 -PbintrayKey=$2 -Pplatform=metadata
  ./gradlew :tools:godot-annotation-processor:bintrayUpload -PbintrayUser=$1 -PbintrayKey=$2
  ./gradlew :tools:kotlin-compiler-plugin:bintrayUpload -PbintrayUser=$1 -PbintrayKey=$2
  ./gradlew :tools:kotlin-compiler-native-plugin:bintrayUpload -PbintrayUser=$1 -PbintrayKey=$2
  ./gradlew :tools:godot-gradle-plugin:bintrayUpload -PbintrayUser=$1 -PbintrayKey=$2
  ./gradlew :wrapper:godot-library:bintrayUpload -PbintrayUser=$1 -PbintrayKey=$2 -Pplatform=kotlinMultiplatform
  ./gradlew :wrapper:godot-library:bintrayUpload -PbintrayUser=$1 -PbintrayKey=$2 -Pplatform=metadata
  ./gradlew :wrapper:godot-library-extension:bintrayUpload -PbintrayUser=$1 -PbintrayKey=$2 -Pplatform=kotlinMultiplatform
  ./gradlew :wrapper:godot-library-extension:bintrayUpload -PbintrayUser=$1 -PbintrayKey=$2 -Pplatform=metadata
  ./gradlew :tools:annotations:bintrayUpload -PbintrayUser=$1 -PbintrayKey=$2 -Pplatform=kotlinMultiplatform
  ./gradlew :tools:annotations:bintrayUpload -PbintrayUser=$1 -PbintrayKey=$2 -Pplatform=metadata
fi

if [ $3 == "android" ] || [ $3 == "ios" ]; then
  ./gradlew :tools:annotations-internal:bintrayUpload -PbintrayUser=$1 -PbintrayKey=$2 -Pplatform=$3 -ParmArch=$4
  ./gradlew :wrapper:godot-library:bintrayUpload -PbintrayUser=$1 -PbintrayKey=$2 -Pplatform=$3 -ParmArch=$4
  ./gradlew :tools:annotations:bintrayUpload -PbintrayUser=$1 -PbintrayKey=$2 -Pplatform=$3 -ParmArch=$4
  if [ $3 == "ios" ]; then
      ./gradlew :wrapper:godot-library-extension:bintrayUpload -PbintrayUser=$1 -PbintrayKey=$2 -Pplatform=$3 -ParmArch=$4
  fi
else
  ./gradlew :tools:annotations-internal:bintrayUpload -PbintrayUser=$1 -PbintrayKey=$2 -Pplatform=$3
  ./gradlew :wrapper:godot-library:bintrayUpload -PbintrayUser=$1 -PbintrayKey=$2 -Pplatform=$3
  ./gradlew :wrapper:godot-library-extension:bintrayUpload -PbintrayUser=$1 -PbintrayKey=$2 -Pplatform=$3
  ./gradlew :tools:annotations:bintrayUpload -PbintrayUser=$1 -PbintrayKey=$2 -Pplatform=$3
fi