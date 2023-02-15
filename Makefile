RUN_GRADLE = sh gradlew

build:
	$(RUN_GRADLE) -x test build --daemon
.PHONY: build

test:
	$(RUN_GRADLE) test --info
