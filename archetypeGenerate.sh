#!/usr/bin/env bash

rm -rf ./target

mvn clean archetype:create-from-project -Darchetype.properties=archetype.properties
