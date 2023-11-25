RUN_GRADLE = bash gradlew

build:
	$(RUN_GRADLE) -x test build --daemon
.PHONY: build

test:
	$(RUN_GRADLE) test --info --daemon

run:
	$(RUN_GRADLE) :java-project-app:run  --daemon

jar:
	java -jar apps/java-project-app/build/libs/java-project-apps-1.0.0-SNAPSHOT-all.jar

# TODO may add linting/code formatting?