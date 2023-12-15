#!/usr/bin/env sh

# stop the current node server
ps | grep java
if [ $? -eq 0 ]; then
  killall -9 java
else
  echo "No node process is found"
fi

java -jar app.jar &