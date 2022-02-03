package encapsulationConcept;
/**
 * Implementation of encapsulation concept by calculating the rectangle area
 * Encapsulation is one of the core concepts of OOP
 * Encapsulation is about biding of data & code into a single entity(Class) ie,grouping
 * of variables and methods into a single entity
 * In java,Encapsulation is achieved via access modifiers such as public,private,protected
 * Encapsulation is also known as data hiding mechanism
 * Encapsulation provides modularity(organised),secure and code maintainability
 * 
 * @author ASUS
 *
 */
public class Area 
{
	//class attributes needed to calculate the area
	
	double length;
	double breadth;
	double RecArea;
	
	//Create a constructor to initiate the objects
	
	Area(double length,double breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	/*
	 * This method will return the area
	 */
	
	public void calculateArea()
	{
		RecArea = length * breadth;
		System.out.println("The area of a rectangle is: " + RecArea);
	}
	public static void main(String[] args) {
		Area area = new Area(5.1,2.1);
		area.calculateArea();	
	}
}
