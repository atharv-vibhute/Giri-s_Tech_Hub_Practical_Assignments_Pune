/*
Question 43: Write a Java program to implement Sales Management System using Array of Objects.
Create a POJO class Sales with attributes salesId and salesAmount.
Store sales data in array of objects.
Perform:
1. Calculate total sales
2. Find average sales amount
Input:
Enter number of sales : 3

Sales Id : 1 Amount : 5000
Sales Id : 2 Amount : 7000
Sales Id : 3 Amount : 3000

Output:
Total Sales : 15000
Average Sales : 5000

Explanation:
Sales sal[] = new Sales[3] creates array. Each sal[i] = new Sales().
Total Sales: loop, totalSales += getSalesAmount().
5000 + 7000 + 3000 = 15000.
Average Sales = Total Sales / count = 15000 / 3 = 5000.
Average is always calculated after the total loop completes.
This program teaches summation and average calculation in array of objects.

Asked In Companies:
Practice assignment
*/

import java.util.Scanner;

class Q43_POJO
{
	private int i;
	private int a;

	public void setI(int i)
	{
		this.i = i;
	}

	public int getI()
	{
		return i;
	}

	public void setA(int a)
	{
		this.a = a;
	}

	public int getA()
	{
		return a;
	}
}

public class Q43_Sales
{
	public static void main(String X[])
	{
		int i, n;
		int t = 0;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of sales : ");
		n = sc.nextInt();
		Q43_POJO[] s = new Q43_POJO[n];

		for(i = 0; i < n; i++)
		{
			s[i] = new Q43_POJO();

			System.out.println("Sales Id : ");
			s[i].setI(sc.nextInt());
			
			System.out.println("Amount : ");
			s[i].setA(sc.nextInt());

			t += s[i].getA();
		}

		sc.close();
		System.out.println("Total Sales : " + t);
		System.out.println("Average Salse : " + (t / n));
	}
}