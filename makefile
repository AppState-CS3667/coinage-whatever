JUNIT5_JAR = junit-platform-console-standalone-1.2.0.jar
JUNIT5_RUNNER = org.junit.platform.console.ConsoleLauncher

compile:
	javac -cp .:$(JUNIT5_JAR) *.java

demo: compile
	java Demo

test: $(JUNIT5_JAR)
	java -cp .:$(JUNIT5_JAR) $(JUNIT5_RUNNER) --scan-class-path

clean:
	rm -f *.class


.PHONY: compile demo clean
