package inheritance;
/*
 * This code implements the concept of inheritance.Note the following about inheritance
 * Inheritance is one of the four core cncepts of OOP
 * Inheritance is the process of reusing the base class methods in the derived class
 * The main reason behind inheritance is re-usability
 * There are types of inheritance,include:
 * 1.single inheritance(a child  having a single parent)
 * 2.multiple inheritance(a child having multiple parents)
 * 3.multilevel(two children  having one parent )
 * Java doesnot support multiple inheritance for classes,but it supports it for interfaces
 * 
 */
class Rectangle
{
	double RecArea;
	public void calRec(double length,double breadth)
	{
		RecArea = length * breadth;
		System.out.println("The area of Rectangle is: " + RecArea);
	}
}
class Circle extends Rectangle
{
	double CirArea;
	public void calCirc(double radius)
	{
		CirArea = 3.14 * radius * radius;
		System.out.println("The area of a circle is: " + CirArea);
	}
}
public class TestClass {
	public static void main(String[]args)
	{
		Circle circle = new Circle();
		circle.calCirc(2);
		circle.calRec(2, 2);
		
	}
}
