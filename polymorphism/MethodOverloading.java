package polymorphism;
/**
 * polymorphism is same method name with different behaviours
 * Polymorphism overloading:same method name,different parameter irrespect of the return type
 * 
 * @author ASUS
 *
 */
class LearnOverloading
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
		LearnOverloading obj = new LearnOverloading();
		System.out.println(obj.calArea(2.1,3.1));
		System.out.println(obj.calArea(1));
	}

}
