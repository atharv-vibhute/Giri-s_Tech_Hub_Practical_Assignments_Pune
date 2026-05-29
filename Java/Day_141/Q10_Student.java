/*
Question 10: Write a Java program to implement a Student Grade Calculator.
Create a class StudentGrade with attributes name and marks.
Calculate grade based on marks:
- 80 to 100 => Grade A
- 60 to 79 => Grade B
- 40 to 59 => Grade C
- Below 40 => Fail
Input:
Enter Name : Priya
Enter Marks : 67

Output:
Name : Priya
Marks : 67
Grade : B

Explanation:
A class StudentGrade is created with name and marks as instance variables.
An object is created and user inputs name and marks.
The grade is determined using an if-else ladder:
- marks >= 80 && marks <= 100 => Grade A
- marks >= 60 && marks <= 79 => Grade B
- marks >= 40 && marks <= 59 => Grade C
- marks < 40 => Fail
Since marks = 67 falls in the 60-79 range, the Grade is B.
This program models a real-world grading system using class objects.

Asked In Companies:
Practice assignment
*/
import java.util.Scanner;

class Q10_Grade
{
	String s;
	String a;
	int m;
	Scanner sc = new Scanner(System.in);

	void get()
	{
		System.out.println("Enter Name : ");
		s = sc.next();
		System.out.println("Enter Marks : ");
		m = sc.nextInt();
		sc.close();
	}

	void display()
	{
		if(m >= 80) a = "A";
		else if(m >= 60 && m < 80) a = "B";
		else if(m >= 40 && m < 60) a = "C";
		else a = "Fail";

		System.out.println("Name : " + s);
		System.out.println("Marks : " + m);
		System.out.println(a);
	}
}

public class Q10_Student
{
	public static void main(String X[])
	{
		Q10_Grade f = new Q10_Grade();
		f.get();
		f.display();
	}
}