RUN_GRADLE = bash gradlew

build:
	$(RUN_GRADLE) -x test build --daemon
.PHONY: build

test:
	$(RUN_GRADLE) test --info --daemon

run:
	$(RUN_GRADLE) run  --daemon 

jar:
	java -jar build/libs/java-project-1.0.0-SNAPSHOT-all.jar

# TODO may add linting/code formatting?