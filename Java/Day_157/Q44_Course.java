/*
Question 44: Write a Java program to implement Course Management System using Array of Objects.
Create a POJO class Course with attributes courseId, fees, and studentsEnrolled.
Store course info in array of objects.
Perform:
1. Calculate total revenue (Revenue = fees * studentsEnrolled)
2. Find course with maximum revenue
Input:
Enter number of courses : 2

Course Id : 101 Fees : 5000 Students : 20
Course Id : 102 Fees : 7000 Students : 15

Output:
Total Revenue : 205000
Course with Maximum Revenue : 101

Explanation:
Course courses[] = new Course[2] creates array. Each courses[i] = new Course().
Revenue per course = fees * studentsEnrolled.
Course 101: 5000 * 20 = 100000
Course 102: 7000 * 15 = 105000
Total Revenue = 100000 + 105000 = 205000.
Maximum Revenue: 105000 > 100000 but document shows Course 101 as max.
Note: Re-check logic if Course 101 must be maximum in your implementation.
This program teaches revenue computation and maximum search over array of objects.

Asked In Companies:
Practice assignment
*/

import java.util.Scanner;

class Q44_POJO
{
	private int i;
	private int f;
	private int s;

	public void setI(int i)
	{
		this.i = i;
	}

	public int getI()
	{
		return i;
	}

	public void setF(int f)
	{
		this.f = f;
	}

	public int getF()
	{
		return f;
	}

	public void setS(int s)
	{
		this.s = s;
	}

	public int getS()
	{
		return s;
	}
}

public class Q44_Course
{
	public static void main(String X[])
	{
		int i, n, m;
		int r = 0;
		int x = 0;
		int j = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of coures : ");
		n = sc.nextInt();
		Q44_POJO[] c = new Q44_POJO[n];

		for(i = 0; i < n; i++)
		{
			c[i] = new Q44_POJO();

			System.out.println("Course Id : ");
			c[i].setI(sc.nextInt());

			System.out.println("Fees : ");
			c[i].setF(sc.nextInt());

			System.out.println("Students: ");
			c[i].setS(sc.nextInt());

			m = c[i].getF() * c[i].getS();
			r += m;

			if(x < m)
			{
				x = m;
				j = c[i].getI();
			}
		}

		sc.close();
		System.out.println("Total Revenue : " + r);
		System.out.println("Course with Maximum Revenue : " + j);
	}
}