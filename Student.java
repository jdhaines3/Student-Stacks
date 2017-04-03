/* Honor Pledge: I pledge that I have neither 
* given nor receieved any help on this assignment.
* A4, Student Class
* David Haines */

//import for formatted printing
import java.io.PrintStream;

///---Student Class---///
public class Student
{
	// add student variables, everything will be string since it is read from csv
	private String fristName, lastName, gpa, id;
	private Address addr;
	
	//--Default Constructor, added for good habit making--//
	public Student()
	{
		//variables set to null as good practice
		this.firstName = "";
		this.lastName = "";
		this.gpa = "";
		this.id = "";
		//Address will just be set to default constructor
		this.addr = new Address();
	}
	
	//--CSV Constructor--//
	public Student(String fn, String ln, String g, String i, Address ad)
	{
		//set variables 
		this.firstName = fn;
		this.lastName = ln;
		this.gpa = g;
		this.id = i;
		this.addr = ad;
	}
	//will have to create instance of Address first when reading csv, then call new instance of Student
	
	//set getters and setters for future use
	
	//was going to put this in the Driver, but realized I can write it here
	void printInfo()
	{
		/*use printstream to format output
		*width formatted to look like table*/
		System.out.printf("ID: %6s /t Name: %10s %10s /t Address: %25s %7s; %15s, %2s, %5s /t GPA: %5s/n", 
			id, firstName, lastName, addr.addrLine1, addr.addrLine2, addr.city, addr.state, addr.zip, gpa);
	}
}
		
		
	
	