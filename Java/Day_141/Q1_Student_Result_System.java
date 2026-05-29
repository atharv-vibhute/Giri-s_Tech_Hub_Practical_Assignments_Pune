/*
Question 1: Write a Java program to implement a Student Result System.
Create a class Student with attributes id, name, and marks.
Accept marks from the user and determine whether the student Passes or Fails.
If marks >= 35, print Pass, otherwise print Fail.
Input:
Enter Student Id : 101
Enter Student Name : Rahul
Enter Marks : 72

Output:
Student Id : 101
Student Name : Rahul
Marks : 72
Result : Pass

Explanation:
A class Student is created with three instance variables: id, name, and marks.
An object of the Student class is created in main() using: Student s = new Student();
The user inputs id, name, and marks using Scanner.
An if-else condition checks whether marks >= 35.
Since 72 >= 35, the result is Pass.
If the marks were less than 35, the result would be Fail.
This program teaches class creation, object instantiation, and conditional logic in Java.

Asked In Companies:
Practice assignment
*/
import java.util.Scanner;

class Q1_Result
{
	int i;
	String n;
	int m;
	Scanner sc = new Scanner(System.in);

	void set()
	{
		System.out.println("Enter the id: ");
		i = sc.nextInt();
		System.out.println("Enter the name: ");
		n = sc.next();
		System.out.println("Enter the marks: ");
		m = sc.nextInt();
		sc.close();
	}

	void print()
	{
		System.out.println("Student Id : " + i);
		System.out.println("Studnet Name : " + n);
		System.out.println("Marks : " + m);
		System.out.println((m < 35)? "Fail" : "Pass");
	}
}

public class Q1_Student_Result_System
{
	public static void main(String X[])
	{
		Q1_Result r = new Q1_Result();
		r.set();
		r.print();
	}
}

