/*
Question 38: Write a Java program to implement Product Inventory Management using Array of Objects.
Create a POJO class Product with attributes productId, price, and quantity.
Store product info in array of objects.
Perform:
1. Calculate total inventory value (price * quantity)
2. Find product with maximum price
Input:
Enter number of products : 2

Product Id : 101
Price : 500
Quantity : 4

Product Id : 102
Price : 800
Quantity : 2

Output:
Total Inventory Value : 3600
Highest Price Product : 102

Explanation:
Product prod[] = new Product[2] creates array. Each prod[i] = new Product().
Total Inventory Value = sum of (price * quantity) for all products.
Product 101: 500 * 4 = 2000
Product 102: 800 * 2 = 1600
Total = 2000 + 1600 = 3600.
Highest price: compare getPrice() of all products.
500 vs 800 => Product 102 has the highest price.
This program demonstrates aggregate calculations over array of objects.

Asked In Companies:
Practice assignment
*/

import java.util.Scanner;

class Q38_POJO
{
	private int i;
	private int p;
	private int q;

	public void setI(int i)
	{
		this.i = i;
	}

	public int getI()
	{
		return i;
	}

	public void setP(int p)
	{
		this.p = p;
	}

	public int getP()
	{
		return p;
	}

	public void setQ(int q)
	{
		this.q = q;
	}

	public int getQ()
	{
		return q;
	}
}

public class Q38_Product_Inventory_System
{
	public static void main(String X[])
	{
		int i, n;
		int j = 0;
		int s = 0;
		int m = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of products: ");
		n = sc.nextInt();

		Q38_POJO[] r = new Q38_POJO[n];
		
		for(i = 0; i < n; i++)
		{
			r[i] = new Q38_POJO();

			System.out.println("Product Id : ");
			r[i].setI(sc.nextInt());

			System.out.println("Product Price : ");
			r[i].setP(sc.nextInt());

			System.out.println("Product Quantity: ");
			r[i].setQ(sc.nextInt());

			s = s + r[i].getP() * r[i].getQ();

			if(m < r[i].getP())
			{
				m = r[i].getP();
				j = r[i].getI();
			}			
		}

		sc.close();
		System.out.println("Total Inventory Value : " + s);
		System.out.println("Highest Price Product : " + j);
	}
}