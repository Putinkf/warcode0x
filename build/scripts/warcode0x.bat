@rem
@rem Copyright 2015 the original author or authors.
@rem
@rem Licensed under the Apache License, Version 2.0 (the "License");
@rem you may not use this file except in compliance with the License.
@rem You may obtain a copy of the License at
@rem
@rem      https://www.apache.org/licenses/LICENSE-2.0
@rem
@rem Unless required by applicable law or agreed to in writing, software
@rem distributed under the License is distributed on an "AS IS" BASIS,
@rem WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
@rem See the License for the specific language governing permissions and
@rem limitations under the License.
@rem

@if "%DEBUG%"=="" @echo off
@rem ##########################################################################
@rem
@rem  warcode0x startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%"=="" set DIRNAME=.
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%..

@rem Resolve any "." and ".." in APP_HOME to make it shorter.
for %%i in ("%APP_HOME%") do set APP_HOME=%%~fi

@rem Add default JVM options here. You can also use JAVA_OPTS and WARCODE0X_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS=

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if %ERRORLEVEL% equ 0 goto execute

echo.
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto execute

echo.
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\lib\warcode0x-1.0.0.jar;%APP_HOME%\lib\authlib-2.1.28.jar;%APP_HOME%\lib\binarypatcher-1.1.1-fatjar.jar;%APP_HOME%\lib\brigadier-1.0.17.jar;%APP_HOME%\lib\commons-codec-1.10.jar;%APP_HOME%\lib\commons-compress-1.8.1.jar;%APP_HOME%\lib\commons-io-2.5.jar;%APP_HOME%\lib\commons-lang3-3.5.jar;%APP_HOME%\lib\commons-logging-1.1.3.jar;%APP_HOME%\lib\datafixerupper-4.0.26.jar;%APP_HOME%\lib\fastutil-8.2.1.jar;%APP_HOME%\lib\forgeflower-1.5.478.16.jar;%APP_HOME%\lib\gson-2.8.0.jar;%APP_HOME%\lib\guava-21.0.jar;%APP_HOME%\lib\httpclient-4.3.3.jar;%APP_HOME%\lib\httpcore-4.3.2.jar;%APP_HOME%\lib\icu4j-66.1.jar;%APP_HOME%\lib\java-objc-bridge-1.0.0-javadoc.jar;%APP_HOME%\lib\java-objc-bridge-1.0.0-natives-osx.jar;%APP_HOME%\lib\java-objc-bridge-1.0.0-sources.jar;%APP_HOME%\lib\java-objc-bridge-1.0.0.jar;%APP_HOME%\lib\javabridge-1.0.22.jar;%APP_HOME%\lib\jinput-2.0.5.jar;%APP_HOME%\lib\jna-4.4.0.jar;%APP_HOME%\lib\jopt-simple-5.0.3.jar;%APP_HOME%\lib\jutils-1.0.0.jar;%APP_HOME%\lib\log4j-api-2.8.1.jar;%APP_HOME%\lib\log4j-core-2.8.1.jar;%APP_HOME%\lib\lwjgl-3.2.1-javadoc.jar;%APP_HOME%\lib\lwjgl-3.2.1-natives-linux.jar;%APP_HOME%\lib\lwjgl-3.2.1-natives-macos.jar;%APP_HOME%\lib\lwjgl-3.2.1-natives-windows.jar;%APP_HOME%\lib\lwjgl-3.2.1-sources.jar;%APP_HOME%\lib\lwjgl-3.2.1.jar;%APP_HOME%\lib\lwjgl-3.2.2-natives-linux.jar;%APP_HOME%\lib\lwjgl-3.2.2-natives-macos.jar;%APP_HOME%\lib\lwjgl-3.2.2-natives-windows.jar;%APP_HOME%\lib\lwjgl-3.2.2.jar;%APP_HOME%\lib\lwjgl-glfw-3.2.1-javadoc.jar;%APP_HOME%\lib\lwjgl-glfw-3.2.1-natives-linux.jar;%APP_HOME%\lib\lwjgl-glfw-3.2.1-natives-macos.jar;%APP_HOME%\lib\lwjgl-glfw-3.2.1-natives-windows.jar;%APP_HOME%\lib\lwjgl-glfw-3.2.1-sources.jar;%APP_HOME%\lib\lwjgl-glfw-3.2.1.jar;%APP_HOME%\lib\lwjgl-glfw-3.2.2-natives-linux.jar;%APP_HOME%\lib\lwjgl-glfw-3.2.2-natives-macos.jar;%APP_HOME%\lib\lwjgl-glfw-3.2.2-natives-windows.jar;%APP_HOME%\lib\lwjgl-glfw-3.2.2.jar;%APP_HOME%\lib\lwjgl-jemalloc-3.2.1-javadoc.jar;%APP_HOME%\lib\lwjgl-jemalloc-3.2.1-natives-linux.jar;%APP_HOME%\lib\lwjgl-jemalloc-3.2.1-natives-macos.jar;%APP_HOME%\lib\lwjgl-jemalloc-3.2.1-natives-windows.jar;%APP_HOME%\lib\lwjgl-jemalloc-3.2.1-sources.jar;%APP_HOME%\lib\lwjgl-jemalloc-3.2.1.jar;%APP_HOME%\lib\lwjgl-jemalloc-3.2.2-natives-linux.jar;%APP_HOME%\lib\lwjgl-jemalloc-3.2.2-natives-macos.jar;%APP_HOME%\lib\lwjgl-jemalloc-3.2.2-natives-windows.jar;%APP_HOME%\lib\lwjgl-jemalloc-3.2.2.jar;%APP_HOME%\lib\lwjgl-openal-3.2.1-javadoc.jar;%APP_HOME%\lib\lwjgl-openal-3.2.1-natives-linux.jar;%APP_HOME%\lib\lwjgl-openal-3.2.1-natives-macos.jar;%APP_HOME%\lib\lwjgl-openal-3.2.1-natives-windows.jar;%APP_HOME%\lib\lwjgl-openal-3.2.1-sources.jar;%APP_HOME%\lib\lwjgl-openal-3.2.1.jar;%APP_HOME%\lib\lwjgl-openal-3.2.2-natives-linux.jar;%APP_HOME%\lib\lwjgl-openal-3.2.2-natives-macos.jar;%APP_HOME%\lib\lwjgl-openal-3.2.2-natives-windows.jar;%APP_HOME%\lib\lwjgl-openal-3.2.2.jar;%APP_HOME%\lib\lwjgl-opengl-3.2.1-javadoc.jar;%APP_HOME%\lib\lwjgl-opengl-3.2.1-natives-linux.jar;%APP_HOME%\lib\lwjgl-opengl-3.2.1-natives-macos.jar;%APP_HOME%\lib\lwjgl-opengl-3.2.1-natives-windows.jar;%APP_HOME%\lib\lwjgl-opengl-3.2.1-sources.jar;%APP_HOME%\lib\lwjgl-opengl-3.2.1.jar;%APP_HOME%\lib\lwjgl-opengl-3.2.2-natives-linux.jar;%APP_HOME%\lib\lwjgl-opengl-3.2.2-natives-macos.jar;%APP_HOME%\lib\lwjgl-opengl-3.2.2-natives-windows.jar;%APP_HOME%\lib\lwjgl-opengl-3.2.2.jar;%APP_HOME%\lib\lwjgl-stb-3.2.1-javadoc.jar;%APP_HOME%\lib\lwjgl-stb-3.2.1-natives-linux.jar;%APP_HOME%\lib\lwjgl-stb-3.2.1-natives-macos.jar;%APP_HOME%\lib\lwjgl-stb-3.2.1-natives-windows.jar;%APP_HOME%\lib\lwjgl-stb-3.2.1-sources.jar;%APP_HOME%\lib\lwjgl-stb-3.2.1.jar;%APP_HOME%\lib\lwjgl-stb-3.2.2-natives-linux.jar;%APP_HOME%\lib\lwjgl-stb-3.2.2-natives-macos.jar;%APP_HOME%\lib\lwjgl-stb-3.2.2-natives-windows.jar;%APP_HOME%\lib\lwjgl-stb-3.2.2.jar;%APP_HOME%\lib\lwjgl-tinyfd-3.2.1-javadoc.jar;%APP_HOME%\lib\lwjgl-tinyfd-3.2.1-natives-linux.jar;%APP_HOME%\lib\lwjgl-tinyfd-3.2.1-natives-macos.jar;%APP_HOME%\lib\lwjgl-tinyfd-3.2.1-natives-windows.jar;%APP_HOME%\lib\lwjgl-tinyfd-3.2.1-sources.jar;%APP_HOME%\lib\lwjgl-tinyfd-3.2.1.jar;%APP_HOME%\lib\lwjgl-tinyfd-3.2.2-javadoc.jar;%APP_HOME%\lib\lwjgl-tinyfd-3.2.2-natives-linux.jar;%APP_HOME%\lib\lwjgl-tinyfd-3.2.2-natives-macos.jar;%APP_HOME%\lib\lwjgl-tinyfd-3.2.2-natives-windows.jar;%APP_HOME%\lib\lwjgl-tinyfd-3.2.2-sources.jar;%APP_HOME%\lib\lwjgl-tinyfd-3.2.2.jar;%APP_HOME%\lib\mcinjector-3.8.0-fatjar.jar;%APP_HOME%\lib\mergetool-1.1.1-fatjar.jar;%APP_HOME%\lib\netty-all-4.1.25.Final.jar;%APP_HOME%\lib\oshi-core-1.1.jar;%APP_HOME%\lib\patchy-1.3.9.jar;%APP_HOME%\lib\platform-3.4.0.jar;%APP_HOME%\lib\SpecialSource-1.8.3-shaded.jar;%APP_HOME%\lib\text2speech-1.11.3-natives-linux.jar;%APP_HOME%\lib\text2speech-1.11.3-natives-windows.jar;%APP_HOME%\lib\text2speech-1.11.3-sources.jar;%APP_HOME%\lib\text2speech-1.11.3.jar


@rem Execute warcode0x
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %WARCODE0X_OPTS%  -classpath "%CLASSPATH%" warcode0x.client.Main %*

:end
@rem End local scope for the variables with windows NT shell
if %ERRORLEVEL% equ 0 goto mainEnd

:fail
rem Set variable WARCODE0X_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
set EXIT_CODE=%ERRORLEVEL%
if %EXIT_CODE% equ 0 set EXIT_CODE=1
if not ""=="%WARCODE0X_EXIT_CONSOLE%" exit %EXIT_CODE%
exit /b %EXIT_CODE%

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
