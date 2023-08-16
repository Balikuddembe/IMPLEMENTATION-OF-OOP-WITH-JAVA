package encapsulationConcept;
/*
 * Achieving encapsulation with private varriables
 */
public class Student 
{
	//Declare the varriables private in the class
	
	private String stdName;
	private String stdEmail;
	private int stdID;
	
	//Apply public getter method for each private variable
	
	public String getStdName()
	{
		return stdName;
	}
	public String getStdEmail()
	{
		return stdEmail;
	}
	public int getStdID()
	{
		return stdID;
	}
	
	//Apply public setter method to every private variable
	
	public void setStdName(String name)
	{
		stdName = name;
	}
	public void setStdEmail(String email)
	{
		stdEmail = email;
	}
	public void setStdID(int ID)
	{
		stdID = ID;
	}

	public static void main(String[] args) {
		Student student = new Student();
		
		//Call the setter method and set the values of the variables
		student.setStdName("Emmanuel");
		student.setStdEmail("balixemma@gmail.com");
		student.setStdID(2009);
		//call the getter method to read the values of the variable and print it
		System.out.println("Student name is : " + student.getStdName());
		System.out.println("Student email address is : " + student.getStdEmail());
		System.out.println("Student id number is : " + student.getStdID());

	}

}
