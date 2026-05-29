/*
Question 29: Write a Java program to implement a Bank Balance Validator using POJO class.
Create a POJO class Account with variables accountNumber and balance.
Using getter and setter methods:
- balance >= 10000 => Premium Account
- balance 5000 to 9999 => Normal Account
- balance < 5000 => Low Balance Warning
Input:
Enter Account Number : 87654
Enter Balance : 4200

Output:
Account Number : 87654
Balance : 4200
Status : Low Balance Warning

Explanation:
A POJO class Account has private fields: accountNumber and balance.
Setter methods accept user input. Getter methods are used in the logic block.
If-else ladder:
- balance >= 10000 => Premium Account
- balance >= 5000 && balance <= 9999 => Normal Account
- balance < 5000 => Low Balance Warning
Since 4200 < 5000, Status = Low Balance Warning.
This models a real banking classification system using POJO principles.

Asked In Companies:
Practice assignment
*/
import java.util.Scanner;

class Q29_POJO
{
	private int a, b;

	public void setA(int a)
	{
		this.a = a;
	}

	public int getA()
	{
		return a;
	}

	public void setB(int b)
	{
		this.b = b;
	}

	public int getB()
	{
		return b;
	}
}

public class Q29_Balance
{
	public static void main(String X[])
	{
		Q29_POJO c = new Q29_POJO();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Account Number : ");
		c.setA(sc.nextInt());

		System.out.println("Enter Balance : ");
		c.setB(sc.nextInt());
		
		sc.close();
		int a = c.getA();
		int b = c.getB();

		System.out.println("Account Number : " + a);
		System.out.println("Balance : " + b);
		System.out.println((b >= 10000)? "Primium Account" : (b < 5000)? "Low Balance Warning" : "Normal Account");
	}
}
