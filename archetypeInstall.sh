#!/usr/bin/env bash

sh archetypeGenerate.sh
cd ./target/generated-sources/archetype || exit
mvn install -DskipTests=true
