/*
Question 14: Write a Java program to create a Customer class and search a customer by id.

Description: Create Customer POJO class with id, name and city. Store multiple customers using constructor. Accept id from user and search customer.
INPUT:
Enter Customers:
1 Raj Pune
2 Amit Mumbai
3 Neha Nashik

Enter search Id: 2

OUTPUT:
Customer Found
Name: Amit
City: Mumbai

EXPLANATION:
Create Customer class with fields id, name, city. Use constructor to initialize. Create Customer[] array and store 3 customers. Accept search id from user. Loop through array, if id matches print "Customer Found" with name and city else print "Not Found".

Asked In Companies:
Practice Assignment
*/

import java.util.Scanner;

class Q14_POJO
{
	private int i;
	private String n;
	private String c;
	
	Q14_POJO(int i, String n, String c)
	{
		this.i = i;
		this.n = n;
		this.c = c;
	}

	public String getN()
	{
		return n;
	}

	public String getC()
	{
		return c;
	}
}

public class Q14_Customer
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		int n, i, y, z;
		String s;
		String c;

		System.out.println("Enter number of customers: ");
		n = sc.nextInt();
		Q14_POJO[] a = new Q14_POJO[n];
		
		for(i = 0; i < n; i++)
		{
			System.out.println("Enter the customer id: ");
			y = sc.nextInt();
			System.out.println("Enter the custormer name: ");
			s = sc.next();
			System.out.println("Enter the customer city : ");
			c = sc.next();
			a[i] = new Q14_POJO(y, s, c);
		}

		System.out.println("Enter Search Id: ");
		z = sc.nextInt();
		sc.close();

		if(z > 0 && z <= n)
		{
			System.out.println("Found");
			System.out.println("Name: " + a[z - 1].getN());
			System.out.println("City: " + a[z - 1].getC());
		}
		else System.out.println("Not found");
	}
}