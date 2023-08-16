package polymorphism;
/*
 * This code implements the concept of method overriding
 * practical example,a young couple approaches you to design for them a class with their marry date and
 * engagement date to 23rd dec and 25th dec respeectively.But du to xmass on 25th,they intend to change
 * the date to 29th dec.Do you have to open the class and modify the date to 29th?
 * The answer is no,bse It is the worst practice in Java because as per the object-oriented programming 
 * concept, the best practice is that class should not open for modification.
 * So, If you want to add new functionality to the existing class or if you want to modify the 
 * existing functionality of the class, you should not disturb the existing class.
 * You should always write subclass of existing class and add new functionality in subclass like this:
 */
class Marry
{
	public void engagementDate()
	{
		System.out.println("The engagement date will be on 23 rd Dec.");
	}
	public void  marryDate()
	{
		System.out.println("The marry date will be 25th Dec.");
	}
}
//sub class 
class Modification extends Marry
{
	//we use the @Override for readability and understanding
	@Override
	public void marryDate()
	{
		System.out.println("The marry date will be 29th Dec.");
	}
}

public class MyClass {

	public static void main(String[] args) {
		Modification obj = new Modification();
		obj.engagementDate();
		obj.marryDate();
	}
}
