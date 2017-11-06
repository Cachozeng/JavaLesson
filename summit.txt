@echo off
d:
cd D:\eclipse-workspace\JavaLesson
git branch branch1
git checkout branch1
dir > dir.txt
git add .
git commit -m "added the dir.txt"
git push -u origin branch1

REM 合并到主干
git checkout master
git merge branch1
git push -u origin master

REM 删除分支
git branch -d branch1
REM 强制删除 git branch -D branch1
pause