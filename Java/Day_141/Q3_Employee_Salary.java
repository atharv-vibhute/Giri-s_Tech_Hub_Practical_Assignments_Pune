/*
Question 3: Write a Java program to implement Employee Salary Classification.
Create a class Employee with attributes empId, name, and salary.
Determine salary category:
- Salary > 50000 => High Salary
- Salary 20000 to 50000 => Medium Salary
- Salary < 20000 => Low Salary
Input:
Enter Employee Id : 201
Enter Name : Amit
Enter Salary : 45000

Output:
Employee Id : 201
Name : Amit
Salary : 45000
Category : Medium Salary

Explanation:
A class Employee is created with instance variables empId, name, and salary.
An object is created and values are accepted from the user via Scanner.
An if-else ladder is used to classify the salary:
- salary > 50000 prints High Salary
- salary >= 20000 && salary <= 50000 prints Medium Salary
- salary < 20000 prints Low Salary
Since 45000 falls between 20000 and 50000, the category is Medium Salary.
This program teaches multi-condition if-else with class objects.

Asked In Companies:
Practice assignment
*/
import java.util.Scanner;

class Q3_Salary
{
	int i;
	String n;
	int s;
	Scanner sc = new Scanner(System.in);

	void get()
	{
		System.out.println("Enter Employee Id : ");
		i = sc.nextInt();
		System.out.println("Enter Name : ");
		n = sc.next();
		System.out.println("Enter Salary : ");
		s = sc.nextInt();
		sc.close();
	}

	void result()
	{
		System.out.println("Employee Id : " + i);
		System.out.println("Name : " + n);
		System.out.println("Salary : " + s);
		System.out.print("Category : ");
		if(s > 50000) System.out.println("High Salary");
		else if(s >= 20000 && s <= 50000) System.out.println("Medium Salary");
		else System.out.println("Low Salary");
	}
}

public class Q3_Employee_Salary
{
	public static void main(String X[])
	{
		Q3_Salary a = new Q3_Salary();
		a.get();
		a.result();
	}
}