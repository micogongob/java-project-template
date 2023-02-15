RUN_GRADLE = sh gradlew

build:
	$(RUN_GRADLE) -x test clean build
.PHONY: build
