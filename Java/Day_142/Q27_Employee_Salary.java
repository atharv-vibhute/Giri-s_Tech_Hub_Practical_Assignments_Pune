/*
Question 27: Write a Java program to implement an Employee Salary Processor using POJO class.
Create a POJO class Employee with variables empId, basicSalary, and bonus.
Using getter and setter methods, calculate:
- Total Salary = basicSalary + bonus
- If salary > 50000 => High Salary
- Otherwise => Normal Salary
Input:
Enter Employee Id : 201
Enter Basic Salary : 40000
Enter Bonus : 15000

Output:
Employee Id : 201
Total Salary : 55000
Category : High Salary

Explanation:
A POJO class Employee has private fields: empId, basicSalary, bonus.
Setter methods store user-entered values. Getter methods retrieve them.
Total Salary = basicSalary + bonus = 40000 + 15000 = 55000.
Condition: if (totalSalary > 50000) => High Salary, else => Normal Salary.
Since 55000 > 50000, Category = High Salary.
This program demonstrates POJO encapsulation combined with business salary logic.

Asked In Companies:
Practice assignment
*/
import java.util.Scanner;

class Q27_POJO
{
	private int i, s, b;
	
	public void setI(int i)
	{
		this.i = i;
	}

	public int getI()
	{
		return i;
	}

	public void setS(int s)
	{
		this.s = s;
	}

	public int getS()
	{
		return s;
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

public class Q27_Employee_Salary
{
	public static void main(String X[])
	{
		Q27_POJO e = new Q27_POJO();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Employee Id : ");
		e.setI(sc.nextInt());

		System.out.println("Enter Basic Salary : ");
		e.setS(sc.nextInt());

		System.out.println("Enter Bonus : ");
		e.setB(sc.nextInt());

		sc.close();
		int i = e.getI();
		int t = e.getS() + e.getB();
		
		System.out.println("Employee Id : " + i);
		System.out.println("Total Salary : " + t);
		System.out.print("Category : ");
		System.out.println((t >= 50000)? "High Salary" : "Normal Salary");
	}
}