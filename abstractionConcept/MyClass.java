package abstractionConcept;
/*
 * abstraction in Java is a technique by which we can hide the data that is not required to a user.
 * Let’s first take ATM machine as a real-time example. We all use an ATM machine for cash withdrawal,
 * money transfer, retrieve min-statement, etc in our daily life.
 * But we don’t know internally what things are happening inside ATM machine when you insert an ATM card 
 * for performing any kind of operation.
 * 
 * An abstract class cannot be instantiated ie;You can't write MyTest mytest = new MyTest();
 * 
 */
abstract class MyTest
{
	
	public abstract int calculate(int a,int b);
}
//creat a sub class that inherites the abstarct class
class Addition extends MyTest
{
	
	public int calculate(int a,int b)
	{
		return a+b;
	}
}
	class Subtraction extends MyTest
	{
		public int calculate(int a,int b)
		{
			return a-b;
		}
		
	}
	class Multiplication extends MyTest
	{
		public int calculate(int a,int b)
		{
			return a * b;
		}
	}

public class MyClass
{
	public static void main(String[] args) 
	{
		MyTest mytest = new Addition();
		System.out.println("Addition = " + mytest.calculate(1, 1));
		mytest = new Subtraction();
		System.out.println("Subtraction = " + mytest.calculate(5, 4));
		mytest = new Multiplication();
		System.out.println("Multiplication = " + mytest.calculate(2, 2));
		
	}
}
