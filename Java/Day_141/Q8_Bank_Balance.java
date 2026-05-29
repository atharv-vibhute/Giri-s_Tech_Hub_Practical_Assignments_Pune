/*
Question 8: Write a Java program to implement a Bank Balance Checker.
Create a class BankAccount with attributes accountNumber, name, and balance.
Check account status:
- balance >= 10000 => Premium Account
- balance 5000 to 9999 => Normal Account
- balance < 5000 => Low Balance Warning
Input:
Enter Account Number : 98765
Enter Name : Neha
Enter Balance : 4500

Output:
Account Number : 98765
Name : Neha
Balance : 4500
Status : Low Balance Warning

Explanation:
A class BankAccount is created with accountNumber, name, and balance.
The user inputs all three values via Scanner.
An if-else ladder determines the account status:
- balance >= 10000 => Premium Account
- balance >= 5000 && balance <= 9999 => Normal Account
- balance < 5000 => Low Balance Warning
Since 4500 < 5000, the status is Low Balance Warning.
This program models a real-world banking classification using class objects.

Asked In Companies:
Practice assignment
*/
import java.util.Scanner;

class Q8_Account
{
	int n;
	String s;
	int b;
	String a;
	Scanner sc = new Scanner(System.in);

	void get()
	{
		System.out.println("Enter Account Number : ");
		n = sc.nextInt();
		System.out.println("Enter Name : ");
		s = sc.next();
		System.out.println("Enter Balance : ");
		b = sc.nextInt();
		sc.close();
	}

	void display()
	{
		if(b >= 10000) a = "Premium Account";
		else if(b >= 5000 && b < 10000) a = "Normal Account";
		else a = "Low Balance Warning";

		System.out.println("Account Number : " + n);
		System.out.println("Name : " + s);
		System.out.println("Balance : " + b);
		System.out.println("Status : " + a);
	}
}

public class Q8_Bank_Balance
{
	public static void main(String X[])
	{
		Q8_Account c = new Q8_Account();
		c.get();
		c.display();
	}
}
