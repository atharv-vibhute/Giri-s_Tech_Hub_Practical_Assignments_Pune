/*
Question 36: Write a Java program to implement Employee Salary Management using Array of Objects.
Create a POJO class Employee with attributes empId, empName, and salary.
Store details of N employees using array of objects.
Perform:
1. Display all employees
2. Find employee with highest salary
3. Find employee with lowest salary
Input:
Enter number of employees : 3

Enter Employee Id : 101
Enter Employee Name : Amit
Enter Salary : 45000

Enter Employee Id : 102
Enter Employee Name : Neha
Enter Salary : 52000

Enter Employee Id : 103
Enter Employee Name : Rahul
Enter Salary : 38000

Output:
Emp Id : 101 Name : Amit Salary : 45000
Emp Id : 102 Name : Neha Salary : 52000
Emp Id : 103 Name : Rahul Salary : 38000

Highest Salary Employee : Neha - 52000
Lowest Salary Employee : Rahul - 38000

Explanation:
Employee emp[] = new Employee[3] creates an array of 3 Employee references.
Each emp[i] = new Employee() creates individual objects.
Setters store empId, empName, salary. Getters retrieve them for display.
Highest salary: loop through all, compare getSalary() => 52000 (Neha).
Lowest salary: loop through all, compare getSalary() => 38000 (Rahul).
Array of objects is the correct way to store and process multiple records in Java.

Asked In Companies:
Practice assignment
*/

import java.util.Scanner;

class Q36_POJO
{
	private int id;
	private String name;
	private int salary;

	public void setId(int id)
	{
		this.id = id;
	}

	public int getId()
	{
		return id;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setSalary(int salary)
	{
		this.salary = salary;
	}

	public int getSalary()
	{
		return salary;
	}
}

public class Q36_Employee_Salary_Management
{
	public static void main(String X[])
	{
		int s, n, m, i;
		int j = 0;
		int k = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of employees: ");
		s = sc.nextInt();
		Q36_POJO[] e = new Q36_POJO[s];
		
		for(i = 0; i < s; i++)
		{
			e[i] = new Q36_POJO();

			System.out.println("Enter Employee Id: ");
			e[i].setId(sc.nextInt());

			System.out.println("Enter Employee Name: ");
			e[i].setName(sc.next());

			System.out.println("Enter Employee Salary: ");
			e[i].setSalary(sc.nextInt());
			sc.nextLine();
		}

		sc.close();
		n = e[0].getSalary();
		m = e[0].getSalary();

		for(i = 0; i < s; i++)
		{
			System.out.println("Emp Id : " + e[i].getId() + " Name : " + e[i].getName() + " Salary : " + e[i].getSalary());

			if(n < e[i].getSalary())
			{
				n = e[i].getSalary();
				j = i;
			}
			
			if(m > e[i].getSalary())
			{
				m = e[i].getSalary();
				k = i;
			}
		}

		System.out.println("\nHighest Salary Employee : " + e[j].getName() + " - " + e[j].getSalary());
		System.out.println("Lowest Salary Employee : " + e[k].getName() + " - " + e[k].getSalary());
	}
}