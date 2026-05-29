/*
Question 13: Write a Java program to implement a Loan Eligibility Checker.
Create a class Loan with attributes name, salary, and age.
Loan conditions:
- Age >= 21 AND Salary >= 25000 => Eligible
- Otherwise => Not Eligible
Input:
Enter Name : Kiran
Enter Age : 30
Enter Salary : 27000

Output:
Name : Kiran
Age : 30
Salary : 27000
Loan Status : Eligible

Explanation:
A class Loan is created with name, salary, and age as instance variables.
The user inputs all three values.
Loan eligibility uses a compound AND condition:
- if (age >= 21 && salary >= 25000) => Eligible
- else => Not Eligible
Since age = 30 (>= 21) AND salary = 27000 (>= 25000), both conditions are true.
Loan Status = Eligible.
This program demonstrates the use of logical AND (&&) operator with class objects.

Asked In Companies:
Practice assignment
*/
import java.util.Scanner;

class Q13_Bank
{
	String n;
	int a, s;
	Scanner sc = new Scanner(System.in);

	void get()
	{
		System.out.println("Enter Name : ");
		n = sc.next();
		System.out.println("Enter Age : ");
		a = sc.nextInt();
		System.out.println("Enter Salary : ");
		s = sc.nextInt();
		sc.close();
	}

	void display()
	{
		System.out.println("Name : " + n);
		System.out.println("Age : " + a);
		System.out.println("Salary: " + s);
		System.out.println((a >= 21 && s >= 25000)? "Eligible" : "Not Eligible");
	}
}

public class Q13_Loan
{
	public static void main(String X[])
	{
		Q13_Bank b = new Q13_Bank();
		b.get();
		b.display();
	}
}