#!/bin/sh

CURRENT_PATH="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null && pwd )"


ARTIFACTS=(
	"tools/api_classes_generator" "run"
	"wrapper" "publish"
	"tools/entry_generator" "build"
	"tools/gradle_plugin" "publish"
	"samples/games/kotlin" "build"
	)




cd $CURRENT_PATH



function executeGradle() {
	set -x
	cd $1
	./gradlew $2 --stacktrace
	set +x
	cd $CURRENT_PATH
}



artifactLength=${#ARTIFACTS[@]}
i=0

while [ $i -lt $artifactLength ]
do
	executeGradle ${ARTIFACTS[$i]} ${ARTIFACTS[(( i + 1 ))]}
	(( i += 2 )) 
done
