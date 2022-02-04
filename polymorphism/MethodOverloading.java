package polymorphism;
/**
 * polymorphism is same method name with different behaviours
 * Polymorphism overloading:same method name,different parameter irrespect of the return type
 * The concept of method overloading is also known as compile-time polymorphism in java.
 * 
 * @author ASUS
 *
 */
class ShapeArea
{
	double Area;
	public double calArea(double length,double breadth)
	{
		Area = length * breadth;
		return Area;
	}
	public double calArea(int radius)
	{
		Area = 3.14 * radius * radius;
		return Area;
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		ShapeArea obj = new ShapeArea();
		System.out.println("The area of a rectangle is: " + obj.calArea(2.1,3.1));
		System.out.println("The area of a circle is: " + obj.calArea(1));
	}

}
