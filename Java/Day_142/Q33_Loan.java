/*
Question 33: Write a Java program to implement a Loan Eligibility Checker using POJO class.
Create a POJO class Loan with variables age and salary.
Determine loan eligibility:
- Age >= 21 AND Salary >= 25000 => Eligible
- Otherwise => Not Eligible
Input:
Enter Age : 30
Enter Salary : 28000

Output:
Age : 30
Salary : 28000
Loan Status : Eligible

Explanation:
A POJO class Loan has private fields: age and salary.
setAge(30) and setSalary(28000) store user input using setter methods.
Getter methods retrieve age and salary for the eligibility check.
Compound condition: if (age >= 21 && salary >= 25000) => Eligible.
Since age = 30 (>= 21) AND salary = 28000 (>= 25000), both conditions are true.
Loan Status = Eligible.
This is a POJO-based implementation of loan eligibility with compound conditions.

Asked In Companies:
Practice assignment
*/
import java.util.Scanner;

class Q33_POJO
{
	private int a, s;

	public void setA(int a)
	{
		this.a = a;
	}

	public int getA()
	{
		return a;
	}

	public void setS(int s)
	{
		this.s = s;
	}

	public int getS()
	{
		return s;
	}
}

public class Q33_Loan
{
	public static void main(String X[])
	{
		Q33_POJO l = new Q33_POJO();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Age : ");
		l.setA(sc.nextInt());

		System.out.println("Enter Salary : ");
		l.setS(sc.nextInt());
		sc.close();

		int a = l.getA();
		int s = l.getS();

		System.out.println("Age : " + a);
		System.out.println("Salary : " + s);
		System.out.println((a >= 21 && s >= 25000)? "Eligible" : "Not Eligible");
	}
}