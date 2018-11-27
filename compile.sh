#!/usr/bin/env bash

javac -d mods --module-source-path simple-modules $(find simple-modules -name "*.java")