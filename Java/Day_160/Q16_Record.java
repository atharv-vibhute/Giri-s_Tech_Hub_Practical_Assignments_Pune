/*
Question 16: Write a Java program to delete a student record from an array using constructor objects.

Description: Create Student class with rollNo, name and percentage. Store student objects. Accept roll number to delete and remove that record (shift array).
Asked In: Practice Assignment

INPUT:
Students:
1 Ravi 70
2 Kiran 65
3 Om 80

Enter roll to delete: 2

OUTPUT:
Remaining Students:
1 Ravi 70
3 Om 80

EXPLANATION:
Create Student class with rollNo, name, percentage. Store students in array using constructor. Accept roll number to delete. Find matching student in array. Shift remaining elements forward (remove element). Display remaining students without deleted record.
*/

import java.util.Scanner;

class Q16_Delete
{
	int d;
	String s;
	int m;

	Q16_Delete(int d, String s, int m)
	{
		this.d = d;
		this.s = s;
		this.m = m;
	} 

	public void setD(int d)
	{
		this.d = d;
	}

	public int getD()
	{
		return d;
	}

	public void setS(String s)
	{
		this.s = s;
	}
	
	public String getS()
	{
		return s;
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

public class Q16_Record
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
	
		int i, n, d, m, j;
		String s;

		System.out.println("Enter the number of students: ");
		n = sc.nextInt();
		Q16_Delete[] a = new Q16_Delete[n];

		for(i = 0; i < n; i++)
		{
			System.out.println("Enter the id: ");
			d = sc.nextInt();

			System.out.println("Enter the name: ");
			s = sc.next();

			System.out.println("Enter the marks: ");
			m = sc.nextInt();
		
			a[i] = new Q16_Delete(d, s, m);
		}

		System.out.println("Enter roll number to delete: ");
		j = sc.nextInt();
		sc.close();

		if(j > 0 && j <= n)
		{
			n--;
			for(i = j - 1; i < n; i++)
			{
				a[i].setD(a[i + 1].getD());
				a[i].setS(a[i + 1].getS());
				a[i].setM(a[i + 1].getM());
			}

			System.out.println("Remaining Students: ");
			for(i = 0; i < n; i++) System.out.println(a[i].getD() + " " + a[i].getS() + " " + a[i].getM());
		}	
		else System.out.println("Wrong id!!!");
	}
}
