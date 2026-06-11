/*
Question 2: Write a Java program to create an Employee class and calculate yearly salary using constructor.

Description: Create Employee class with empId, empName and monthlySalary. Use constructor to initialize values. Calculate yearly salary (monthlySalary × 12) and display it.
INPUT:
Enter Employee Id: 201
Enter Employee Name: Amit
Enter Monthly Salary: 25000

OUTPUT:
Employee Name: Amit
Yearly Salary: 300000

EXPLANATION:
Create Employee class with fields empId, empName, monthlySalary. Use constructor public Employee(int empId, String empName, int monthlySalary) to initialize. Calculate yearly salary as monthlySalary * 12 in constructor or display method. Display employee name and yearly salary.

Asked In Companies:
Practice Assignment
*/

import java.util.Scanner;

class Q2_Salary
{
	Q2_Salary(int i, String n, int s)
	{
		System.out.println("Employee Name: " + n);
		System.out.println("Yearly Salary: " + (s * 12));
	}
}

public class Q2_Salary_Calculator
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		int i, s;
		String n;

		System.out.println("Enter Employee Id: ");
		i = sc.nextInt();

		System.out.println("Enter Employee Name: ");
		n = sc.next();

		System.out.println("Enter Monthly Salary: ");
		s = sc.nextInt();

		sc.close();
		Q2_Salary y = new Q2_Salary(i, n, s);
	}
}
