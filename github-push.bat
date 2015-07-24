@echo off

if not "%1%" == "" goto pushCode
goto exit

:pushCode
echo "Pushing quickstart code to %1% Git Repository ..."
git push --mirror https://sabiraha:sabircoe123@github.com/sabiraha/%1%.git
goto end

:exit
echo "Error Pushing quickstart code to %1% Git Repository. Possible reason: No target repository."
exit /b 1

:end
echo "Pushing quickstart code to %1% Git Repository is complete."
exit /b 0
