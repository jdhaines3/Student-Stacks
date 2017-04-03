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
	private Stack<Student> mainStack = new Stack<Student>(10);
	
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
				loadTxt();
			}
			else if (i == 2)
			{
				//print the stack
				printStack();
			}
			else if (i == 3)
			{
				//if input was 3, print a goodbye line and exit loop
				System.out.println("Exiting Program... Goodbye!");
				keepGoing = 1;
			}
			
		}
		
	}
	
	
	//--load text file method--//
	private void loadTxt()
	{
		//set up input stream
		try 
		{
			//input stream for text file, input stream reader then buffer reader
			InputStream inpStrm = new FileInputStream("students.txt");
			
			InputStreamReader isr = new InputStreamReader(inpStrm);
			
			BufferedReader br = new BufferedReader(isr);
			
			//burn first line of file (header)
			String line = br.readLine();
			
			//loop through other lines in file
			while(line != null)
			{
				//split line by comma and put each string into an array
				String[] values = line.split(",");
				
				//classify which string in the array is what (ie: first name, ID, etc)
				//Student variables
				String name1 = values[1];
				String name2 = values[0];
				String id = values[7];
				String gpa = values[8];
				//Address variables
				String addrLn1 = values[2];
				String addrLn2 = values[3];
				String city = values[4];
				String state = values[5];
				String zip = values[6];
				
				//create new address instance
				Address adr = new Address(addrLn1, addrLn2, city, state, zip);
				Student stu = new Student(name1, name2, gpa, id, adr);
				
				//pop onto stack
				mainStack.push(stu);
				
				// Get the next line in the file...
				line = br.readLine();
			}
			
			//close buffer reader
			br.close();
		}
		//if the file isn't there, print an error
		catch (IOException ex) 
		{
			System.err.println(ex);
		}
		
		//print out message that student file is loaded, put empty line above and below
		System.out.println("");
		System.out.println("Loaded student list from file!");
		System.out.println("");
	}
	
	
	//--Print Stack Method--//
	private void printStack()
	{
		//loop through stack, popping off top element (student) then calling the student's print function
		while (!mainStack.isEmpty())
		{
			//pop top object and set to variable
			obj = mainStack.pop();
			
			//since that variable
			obj.printInfo();
		}
		
		//print out message that printing is complete
		System.out.println("");
		System.out.println("All student information printed!");
		System.out.println("");
	}
	
}