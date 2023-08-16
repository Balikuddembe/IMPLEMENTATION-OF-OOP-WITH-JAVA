package interfaceConcept;

interface Shape
{
	void calRecArea();
	void calCircArea();
	
}
class Area implements Shape
{
	int length,breadth,RecArea;
	double radius,CircArea;
	Area(int length,int breadth)
	{
		this.length = length;
		this.breadth=breadth;
	}
	Area(double radius)
	{
		this.radius = radius;
	}
	public void calRecArea()
	{
		RecArea = length * breadth;
		System.out.println(RecArea);
	}
	public void calCircArea()
	{
	CircArea = Math.PI * radius*radius;
	System.out.println(CircArea);

	}
}

public class MyClass {
	public static void main(String[]args)
	{
		Area a = new Area(2,2);
		a.calRecArea();
		Area a1 = new Area(2.1);
		a1.calCircArea();
	}
}
