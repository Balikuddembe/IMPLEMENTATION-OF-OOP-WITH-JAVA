package polymorphism;
/*
 * methodoverriding,trying to change the behaviour of the parent class method in the derived class
 * polymorphism,same method name ,different behavoiur
 * The concept of method overriding can be used to achieve run-time polymorphism in java.
 * overriding is used to change the existing functionality of the superclass method
 */
class EnglishMessage
{
	public void printHi()
	{
		System.out.println("Hi");
	}
	public void printHelo()
	{
		System.out.println("Hello");
	}
	public void printGoodmorning()
	{
		System.out.println("Goodmorning");
	}
}
class FrenchMessage extends EnglishMessage
{
	@Override
	public void printGoodmorning()
	{
		System.out.println("Bonjour");
	}
}
public class MethodOverriding {
	public static void main(String[] args) {
		FrenchMessage obj = new FrenchMessage();
		obj.printGoodmorning();
		obj.printHelo();
		obj.printHi();
		
		

	}

}
