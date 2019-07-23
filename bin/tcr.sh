#!/usr/bin/env bash

MESSAGE="$@"

mvn test &&
git commit -a -m "${MESSAGE}" ||
git reset --hard HEAD