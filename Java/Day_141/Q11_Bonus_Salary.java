/*
Question 11: Write a Java program to implement an Employee Bonus System.
Create a class Employee with attributes empId, name, salary, and yearsOfExperience.
Calculate bonus:
- Experience > 10 years => 20% bonus
- Experience 5 to 10 years => 10% bonus
- Experience < 5 years => 5% bonus
Display total salary after bonus.
Input:
Enter Employee Id : 501
Enter Name : Anil
Enter Salary : 40000
Enter Experience : 8

Output:
Employee Id : 501
Name : Anil
Salary : 40000
Bonus : 4000
Total Salary : 44000

Explanation:
A class Employee is created with empId, name, salary, and yearsOfExperience.
Bonus percentage is decided based on experience:
- experience > 10 => 20% bonus
- experience >= 5 && experience <= 10 => 10% bonus
- experience < 5 => 5% bonus
Since experience = 8 (between 5 and 10):
Bonus = 40000 * 10 / 100 = 4000
Total Salary = 40000 + 4000 = 44000
This program demonstrates percentage-based bonus calculation using class objects.

Asked In Companies:
Practice assignment
*/

import java.util.Scanner;

class Q11_Bonus
{
	int i, s, b, t, y;
	String n; 
	Scanner sc = new Scanner(System.in);
	
	void get()
	{
		System.out.println("Enter Employee Id : ");
		i = sc.nextInt();
		System.out.println("Enter Name : ");
		n = sc.next();
		System.out.println("Enter Salary : ");
		s = sc.nextInt();
		System.out.println("Enter Experience : ");
		y = sc.nextInt();
	}

	void display()
	{
		if(y > 10) b = s * 20 / 100;
		else if(y >= 5 && y <= 10) b = s * 10 / 100;
		else b = s * 5 / 100;

		t = s + b;
		System.out.println("Employee Id : " + i);
		System.out.println("Name : " + n);
		System.out.println("Bonus : " + b);
		System.out.println("Total Salary : " + t);
	}
}

public class Q11_Bonus_Salary
{
	public static void main(String X[])
	{
		Q11_Bonus g = new Q11_Bonus();
		g.get();
		g.display();
	}
}