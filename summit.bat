@each off
d:
cd D:\eclipse-workspace\JavaLesson
git branch branch1
git checkout branch1
dir > dir.txt
git add .
git commit -m "added the dir.txt"
git push -u origin branch1
pause