package learnabstractconcept;

/**This code implements an abstract class in real world examples
 * The use of abstract class is ,reusability and enforcing the derived class to 
 * implement the abstract methods of the abstract class 
 * abstract class can have normal methods and abstract methods
 * @author Emmanuel
 *
 */
abstract class Salary
{
	public int 	GetPAYE(int basic) 
	{
		return 30*basic/100;
    }
	public int GetNSSF_EMPLOYEE_CONTR(int basic) 
	{
		return 5*basic/100;
	}
	public int GetNSSF_EMPLOYER_CONTR(int basic) 
	{
		return 10*basic/100;
	}
	public int GetUnionCharge(int basic) 
	{
		return 1*basic/100;
    }
	public abstract int GetLeavingAllowance();
	public abstract int GetExtraHrs();
	
}
class URA extends Salary
{
	public int GetLeavingAllowance() {
		return 45000;
	}
	public int GetExtraHrs() {
		return 50000;
	}
}
class UCAA extends Salary
{
	public int GetLeavingAllowance() {
		return 95000;
	}
	public int GetExtraHrs() {
		return 70000;
	}
}
class UCC extends Salary
{
	public int GetLeavingAllowance() 
	{
		return 100000;
	}
	public int GetExtraHrs() 
	{
		return 89000;
	}
}


public class MyClass {
	//using the concept of dependency injection
	public static int CalculateSalary(Salary obj) {
		int sal=obj.GetExtraHrs()+obj.GetLeavingAllowance()+obj.GetNSSF_EMPLOYEE_CONTR(2000000)+obj.GetNSSF_EMPLOYER_CONTR(2000000)+
				obj.GetPAYE(2000000)+obj.GetUnionCharge(2000000);
		return sal;
		
	}
	public static void main(String[]args) {
		/*
		Salary obj = new URA();
		int URAsalary=obj.GetExtraHrs()+obj.GetLeavingAllowance()+obj.GetNSSF_EMPLOYEE_CONTR(2000000)+obj.GetNSSF_EMPLOYER_CONTR(2000000)+
				obj.GetPAYE(2000000)+obj.GetUnionCharge(2000000);
		System.out.println(URAsalary);
		
		obj = new UCAA();
		int UCAAsalary=obj.GetExtraHrs()+obj.GetLeavingAllowance()+obj.GetNSSF_EMPLOYEE_CONTR(2000000)+obj.GetNSSF_EMPLOYER_CONTR(2000000)+
				obj.GetPAYE(2000000)+obj.GetUnionCharge(2000000);
		System.out.println(UCAAsalary);
		
		obj = new UCC();
		int UCCsalary=obj.GetExtraHrs()+obj.GetLeavingAllowance()+obj.GetNSSF_EMPLOYEE_CONTR(2000000)+obj.GetNSSF_EMPLOYER_CONTR(2000000)+
				obj.GetPAYE(2000000)+obj.GetUnionCharge(2000000);
		System.out.println(UCCsalary);
		*/
		System.out.println("URA Salary is " + CalculateSalary(new URA()));
		System.out.println("UCAA Salary is " + CalculateSalary(new UCAA()));
		System.out.println("UCC Salary is " + CalculateSalary(new UCC()));
	}
	
}


