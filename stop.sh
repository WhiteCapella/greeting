#!/bin/bash

JAR_FILE_NAME=greeting-0.1.0-SNAPSHOT.jar

PID=$(pgrep -f $JAR_FILE_NAME)

if [-z "$PID" ]; then
	echo "> 현재 구동중인 어플리케이션이 존재하지 않으므로 종료하지 않습니다."
else
	echo "> kill -9 $PID"
	kill -9 $PID
	echo "> 실행중인 어플리케이션을 종료하고 있습니다."
	sleep 10
fi
