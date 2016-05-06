@echo off 
mode con cols=80 lines=20     
title BOWE, The Text Based Adventure      
java -jar Bowe.jar
echo Press Any Key To Close The Game
timeout /t -1 >nul