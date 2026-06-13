/*
Question 15: Write a Java program to create a Product inventory and update product price.

Description: Create Product class with id, name and price. Store products using constructor. Accept product id and new price and update it.
Asked In: Practice Assignment

INPUT:
Products:
1 Mouse 500
2 Keyboard 800
3 Monitor 9000

Enter Product Id to update: 2
Enter new price: 1000

OUTPUT:
Updated Product:
Keyboard Price: 1000

EXPLANATION:
Create Product class with fields id, name, price. Store 3 products in array using constructor. Accept product id to update. Search product by id in array. Update price of matching product. Display updated product name and new price
*/

import java.util.Scanner;

class Q15_Product
{
	int d;
	String s;
	int p;

	Q15_Product(int d, String s, int p)
	{
		this.d = d;
		this.s = s;
		this.p = p;
	}

	public void update(int p)
	{
		this.p = p;
	}

	public String getN()
	{
		return s;
	}

	public int getP()
	{
		return p;
	}
}

public class Q15_Update
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		int i, n, p, d;
		String s;

		System.out.println("Enter the number of product: ");
		n = sc.nextInt();
		Q15_Product[] a = new Q15_Product[n];

		for(i = 0; i < n; i++)
		{
			System.out.println("Enter product id: ");
			d = sc.nextInt();

			System.out.println("Enter product name: ");
			s = sc.next();

			System.out.println("Enter product price: ");
			p = sc.nextInt();
			a[i] = new Q15_Product(d, s, p);
		}

		System.out.println("Enter product id for update: ");
		i = sc.nextInt();

		if(i > 0 && i <= n)
		{
			System.out.println("Enter new price: ");
			p = sc.nextInt();
			a[i - 1].update(p);
			s = a[i - 1].getN();
			p = a[i - 1].getP();
		
			System.out.println("Updated Product: ");
			System.out.println(s + " Price: " + p);
		}
		else System.out.println("Product is not found");
		
		sc.close();
	}
}