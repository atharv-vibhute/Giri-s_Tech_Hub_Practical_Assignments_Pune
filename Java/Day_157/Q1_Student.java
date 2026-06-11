/*
Question 1: Write a Java program to create a Student POJO class with fields rollNo, name and marks. Use a parameterized constructor to initialize values and display student details.

Description: Create a Student class having private data members rollNo, name and marks. Initialize values using a constructor and display details using an object. Demonstrate object initialization using constructor.
INPUT:
Enter Roll No: 101
Enter Name: Rahul
Enter Marks: 78

OUTPUT:
Student Details:
Roll No: 101
Name: Rahul
Marks: 78

EXPLANATION:
Create Student class with private fields. Use parameterized constructor public Student(int rollNo, String name, int marks) to initialize values. Create display method to show details. Create object with new Student(101, "Rahul", 78) and call display().

Asked In Companies:
Practice Assignment
*/

import java.util.Scanner;

class Q1_POJO
{
	private int r;
	private String n;
	private int m;

	Q1_POJO(int r, String n, int m)
	{
		this.r = r;
		this.n = n;
		this.m = m;
	}

	public void display()
	{
		System.out.println("Roll No: " + r);
		System.out.println("Name: " + n);
		System.out.println("Marks: " + m);
	}
}

public class Q1_Student
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		int r, m;
		String n;

		System.out.println("Enter Roll No: ");
		r = sc.nextInt();

		System.out.println("Enter Name: ");
		n = sc.next();

		System.out.println("Enter Marks: ");
		m = sc.nextInt();
		sc.close();

		Q1_POJO c = new Q1_POJO(r, n, m);
		System.out.println("Student Details:");
		c.display();
	}
}
