@echo off
SETLOCAL

SET PS=org.svvrl.goal.core org.svvrl.goal.gui org.svvrl.goal.cmd
SET TMP=tmp
SET PLUGINS=plugins
SET LIB=lib

ECHO Creating a temporary folder.
mkdir %TMP% > NUL 2> NUL

ECHO Extracting classes of the GOAL plugins.
FOR %%p in (%PS%) DO (
  ECHO   - %PLUGINS%\%%p.zip
  mkdir %TMP%\%%p > NUL 2> NUL
  copy /Y %PLUGINS%\%%p.zip %TMP%\%%p > NUL
  cd %TMP%\%%p
  jar xf %%p.zip > NUL
  del %%p.zip
  cd ..\..
)

ECHO Packing the classes into JAR files.
FOR %%p in (%PS%) DO (
  ECHO   - %LIB%\%%p.jar
  jar cf %LIB%\%%p.jar -C %TMP%\%%p\classes org
)

ECHO Removing the temporary folder.
rmdir /s /q %TMP%

ECHO --------------------
ECHO Finished generating the GOAL libraries.
ECHO The GOAL libraries are placed in the "%LIB%" folder.

ENDLOCAL