/*
Question 4: Write a Java program to create a Product class and check whether product price is expensive or affordable.

Description: Create Product POJO class with productId, productName and price. Use constructor to initialize values. If price > 1000 print Expensive otherwise Affordable.
INPUT:
Enter Product Id: 501
Enter Product Name: Headphones
Enter Price: 1200

OUTPUT:
Product Name: Headphones
Category: Expensive Product

EXPLANATION:
Create Product class with fields productId, productName, price. Use constructor public Product(int id, String name, int p) to initialize. In constructor or display method, check if price > 1000 then print "Expensive Product" else "Affordable Product". Display product name and category.

Asked In Companies:
Practice Assignment
*/

import java.util.Scanner;

class Q4_Product
{
	private int i, p;
	private String s;

	Q4_Product(int i, String s, int p)
	{
		this.i = i;
		this.s = s;
		this.p = p;
	}

	public void display()
	{
		System.out.println("Product Name: " + s);
		System.out.print("Category: ");
		System.out.println((p > 1000)? "Expensive Product" : "Affordable Product");
	}
}

public class Q4_Category
{
	public static void main(String X[])
	{
		int i, p;
		String s;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Product Id: ");
		i = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter the Product Name: ");
		s = sc.nextLine();
		
		System.out.println("Enter Price: ");
		p = sc.nextInt();

		sc.close();
		Q4_Product a = new Q4_Product(i, s, p);
		a.display();
	}
}

