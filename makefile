JUNIT5_JAR = junit-platform-console-standalone-1.2.0.jar
JUNIT5_RUNNER = org.junit.platform.console.ConsoleLauncher
CKSTYLE = java -jar checkstyle-5.5-all.jar -c ./mystyle.xml

default:
	@echo "usage: make target"
	@echo "5 available targets:"
	@echo "- clean   - removes .class files"
	@echo "- compile - compiles .class files"
	@echo "- check   - runs checkstyle"
	@echo "- test    - compiles and runs the JUnit Tests"
	@echo "- all     - runs clean, check, test, and demo back to back"
	@echo "- all_nc  - same as 'all', but skips checkstyle"

compile:
	javac -cp .:$(JUNIT5_JAR) *.java

demo: compile
	java Demo

test: compile $(JUNIT5_JAR)
	java -cp .:$(JUNIT5_JAR) $(JUNIT5_RUNNER) --scan-class-path

clean:
	rm -f *.class

check: compile
	$(CKSTYLE) *.java

# do all the 'testing' things all at once
all: clean check test demo

all_nc: clean test demo

# "PHONY" recipes don't create a file
.PHONY: all check test compile demo clean
