compile:
	javac *.java

demo: compile
	java Demo

clean:
	rm -f *.class


.PHONY: compile demo clean
