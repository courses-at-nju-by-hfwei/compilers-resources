@echo off
SETLOCAL

set DIR=%~dp0%.
set CLASSPATH="%DIR%";"%DIR%\plugins";"%DIR%\lib";%CLASSPATH%
IF "%1" == "" (SET EXE=javaw.exe) ELSE (SET EXE=java.exe)

%EXE% -version > NUL 2> NUL
IF %ERRORLEVEL% LEQ 0 (
  SET JAVA=%EXE%
  GOTO START
)

IF DEFINED JAVA_BIN (
  SET JAVA=%JAVA_BIN%\%EXE%
  GOTO START
)

IF DEFINED JAVA_HOME (
  SET JAVA=%JAVA_HOME%\bin\%EXE%
  GOTO START
)

FOR %%p IN ("%ProgramFiles%" "%ProgramFiles(x86)%" "%ProgramW6432%") DO (
  FOR %%i IN (jre8 jre9) DO (
    IF EXIST %%p\Java\%%i\bin\java.exe (
      SET JAVA=%%p\Java\%%i\bin\%EXE%
      GOTO START
    )
  )
)

:ERROR
echo Failed to find %EXE%. Please make sure that either Java 7 or Java 6 is
echo installed. You may add the path to Java executables to the environment
echo variable PATH. Alternatively, you may set the environment variable JAVA_BIN
echo to the folder containing the Java executables.
pause
GOTO END

:START
IF "%1" == "" (GOTO UI) ELSE (GOTO CONSOLE)

:CONSOLE
%JAVA% %JVMARGS% ^
  -DapplicationRoot="%DIR%" ^
  -Dorg.java.plugin.boot.pluginsRepositories="%DIR%\plugins" ^
  -Djpf.boot.config="%DIR%\boot.properties" ^
  -Dorg.apache.commons.logging.Log=org.apache.commons.logging.impl.SimpleLog ^
  -Dorg.apache.commons.logging.simplelog.log.org.java.plugin=fatal ^
  -jar "%DIR%\lib\jpf-boot.jar" %*
GOTO END

:UI
start "GOAL" %JAVA% %JVMARGS% ^
  -DapplicationRoot="%DIR%" ^
  -Dorg.java.plugin.boot.pluginsRepositories="%DIR%\plugins" ^
  -Djpf.boot.config="%DIR%\boot.properties" ^
  -Dorg.apache.commons.logging.Log=org.apache.commons.logging.impl.SimpleLog ^
  -Dorg.apache.commons.logging.simplelog.log.org.java.plugin=fatal ^
  -jar "%DIR%\lib\jpf-boot.jar"
GOTO END

:END

ENDLOCAL
