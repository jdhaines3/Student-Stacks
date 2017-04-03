/* Honor Pledge: I pledge that I have neither 
* given nor receieved any help on this assignment.
* A4, Student Class
* David Haines */

//import java io for file input readers, exceptions, and possible formatted output (might just use system.out)
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;


///---Driver Class---///
class Driver
{
	//call instance of stack we will be using
	Stack<Student> mainStack = new Stack<Student>(10);
	
	//--Main--//
	public static void main(String[] args)
	{
		//set up exit variable for menu loop
		int keepGoing = 0;
		//set up scanner utility
		Scanner input = new Scanner(System.in);
		
		//menu loop
		while (keepGoing == 0)
		{
			//declare scanner int
			int i;
			
			//print menu
			System.out.println("1) Load Students (from file)");
			System.out.println("2) Print Stack");
			System.out.println("3) Exit Program");
			System.out.println("Please enter your selection (1/2/3): ");
			//Set i to int input
			i = input.nextInt();
			
			if (i == 1)
			{
				//load students onto stack
			}
			else if (i == 2)
			{
				//print the stack
			}
			else if (i == 3)
			{
				//if input was 3, print a goodbye line and exit loop
				System.out.println("Exiting Program... Goodbye!");
				keepGoing = 1;
			}
		}
	}
	
	//possibly do loading students and printing stack in seperate methods/functions and just call in main
}
			
		