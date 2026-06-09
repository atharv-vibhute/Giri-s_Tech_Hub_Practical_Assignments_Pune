/*
Question 37: Write a Java program to implement Student Result Management using Array of Objects.
Create a POJO class Student with attributes rollNo and marks.
Store N students in array of objects.
Perform:
1. Count Pass students (marks >= 35)
2. Count Fail students
3. Display student with highest marks
Input:
Enter number of students : 4

Roll No : 1 Marks : 65
Roll No : 2 Marks : 32
Roll No : 3 Marks : 78
Roll No : 4 Marks : 40

Output:
Pass Students : 3
Fail Students : 1
Highest Marks : 78

Explanation:
Student stu[] = new Student[4] creates array of 4 Student references.
Each stu[i] = new Student() creates individual objects. Setters fill data.
Pass count: loop through array, if marks >= 35 => passCount++. Result = 3.
Fail count: if marks < 35 => failCount++. Result = 1 (Student 2, marks=32).
Highest marks: compare all getMarks() values => 78 is the maximum.
Three separate loops or one combined loop can perform all operations.

Asked In Companies:
Practice assignment
*/

import java.util.Scanner;

class Q37_POJO
{
	private int r;
	private int m;

	public void setR(int r)
	{
		this.r = r;
	}
	
	public int getR()
	{
		return r;
	}

	public void setM(int m)
	{
		this.m = m;
	}

	public int getM()
	{
		return m;
	}
}

public class Q37_Student_Pass_Fail
{
	public static void main(String X[])
	{
		int i, n;
		int p = 0;
		int f = 0;
		int m = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		n = sc.nextInt();

		Q37_POJO[] s = new Q37_POJO[n];
		
		for(i = 0; i < n; i++)
		{
			s[i] = new Q37_POJO();
			
			System.out.println("Roll No : ");
			s[i].setR(sc.nextInt());

			System.out.println("Marks : ");
			s[i].setM(sc.nextInt());

			if(s[i].getM() < 35) f++;
			else p++;

			m = Math.max(m, s[i].getM());
		}

		sc.close();
		System.out.println("Pass Students : " + p);
		System.out.println("Fail Students : " + f);
		System.out.println("Highest Marks : " + m);
	}
}