@ECHO off

SET CURRENT_PATH=%0/../


set ARTIFACTS_LIST=^
	"tools/api_classes_generator" "run" ^
	"wrapper" "publish" ^
	"tools/entry_generator" "build" ^
	"tools/gradle_plugin" "publish" ^
	"samples/games/kotlin" "build" ^
	"samples/coroutines/kotlin" "build"



cd %CURRENT_PATH%



setlocal enabledelayedexpansion
set n=0
for %%a in (%ARTIFACTS_LIST%) do (
    set ARTIFACTS[!n!]=%%a
    set /a n+=1
)
set /a n-=1
for /L %%i in (0,2,%n%) do (
	set /a i1=%%i
	set /a i2=%%i+1
	call set arg1=%%ARTIFACTS[!i1!]%%
	call set arg2=%%ARTIFACTS[!i2!]%%
	call :ExecuteGradle !arg1!, !arg2!
)


EXIT /B %ERRORLEVEL%


:ExecuteGradle
	cd %~1
	@ECHO on
	call gradlew %~2 --stacktrace
	@ECHO off
	cd %CURRENT_PATH%
EXIT /B 0