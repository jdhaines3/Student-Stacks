# Honor Pledge: I pledge that I have neither 
# given nor receieved any help on this assignment.
# A4: Stacks on Stacks, aka dolla dolla bill y'all
# Java Makefile
# David Haines

Driver.class: Driver.java
	javac Driver.java
	
Stack.class: Stack.java
	javac Stack.java
	
Student.class: Student.java
	javac Student.java

Address.class: Address.java
	javac Address.java
	
clean:
	rm *.class