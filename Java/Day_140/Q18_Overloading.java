/*
Question 18: Write a Java program to implement a Salary Calculator using Method Overloading.
Create a class Salary and overload method salary():
- salary(int basic) => Print basic salary
- salary(int basic, int bonus) => Calculate total salary
- salary(int basic, int bonus, int tax) => Calculate final salary after tax
Input:
Enter Basic Salary : 20000
Enter Bonus : 5000
Enter Tax : 2000

Output:
Basic Salary : 20000
Total Salary : 25000
Final Salary : 23000

Explanation:
Three overloaded versions of salary() are created:
salary(20000):
- Prints Basic Salary = 20000 directly.
salary(20000, 5000):
- Total Salary = basic + bonus = 20000 + 5000 = 25000.
salary(20000, 5000, 2000):
- Final Salary = Total Salary - Tax = 25000 - 2000 = 23000.
Each version is called in sequence and Java picks the correct overload.
This demonstrates real-world payroll logic using method overloading.

Asked In Companies:
Practice assignment
*/
import java.util.Scanner;

public class Q18_Overloading
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		int b, t, f;
		
		System.out.println("Enter the salary: ");
		b = sc.nextInt();

		System.out.println("Enter the bonus: ");
		t = sc.nextInt();

		System.out.println("Enter the tax: ");
		f = sc.nextInt();
	
		salary(b);
		salary(b, t);
		salary(b, t, f);
	}

	public static void salary(int b)
	{
		System.out.println("Basic Salary : " + b);
	}

	public static void salary(int b, int t)
	{
		System.out.println("Total Salary : " + (b + t));
	}

	public static void salary(int b, int t, int f)
	{
		System.out.println("Final Salary : " + (b + t - f));
	}
}

