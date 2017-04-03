/* Honor Pledge: I pledge that I have neither 
* given nor receieved any help on this assignment.
* A4, Address Class
* David Haines */

//don't need imports

///---Address class---///
public class Address
{
	
	//list all private attributes--everything will be string from csv
	//update: to use these variables in student, i think they need to be public
	public String addrLine1, addrLine2, city, state, zip;
	
	//--Default Constructor--//
	public Address()
	{
		//set everything equal to null (even though it does all this for you, still including it as good practice)
		this.addrLine1 = "";
		this.addrLine2 = "";
		this.city = "";
		this.state = "";
		this.zip = "";
	}
	
	//--Constructor for CSV input--//
	//when reading from CSV, need each line in constructor, even if the student doesn't have addr line 2
	public Address(String a1, String a2, String c, String s, String z)
	{
		this.addrLine1 = a1;
		this.addrLine2 = a2;
		this.city = c;
		this.state = s;
		this.zip = z;
	}
	
	//no deconstructor needed in java
	
	//include getters and setters for future use
}