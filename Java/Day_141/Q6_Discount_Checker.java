/*
Question 6: Write a Java program to implement a Product Discount System.
Create a class Product with attributes productId, name, and price.
Apply discount based on price:
- Price > 5000 => 20% Discount
- Price 2000 to 5000 => 10% Discount
- Price < 2000 => No Discount
Display the final price after discount.
Input:
Enter Product Id : 101
Enter Product Name : Headphones
Enter Price : 6000

Output:
Product Id : 101
Product Name : Headphones
Original Price : 6000
Discount : 20%
Final Price : 4800

Explanation:
A class Product is created with productId, name, and price.
The discount logic:
- price > 5000 => 20% discount => Final Price = price - (price * 20 / 100)
- price >= 2000 && price <= 5000 => 10% discount
- price < 2000 => No discount
Since price = 6000 (greater than 5000):
Discount = 6000 * 20 / 100 = 1200
Final Price = 6000 - 1200 = 4800
This program teaches percentage calculation and conditional discounting.

Asked In Companies:
Practice assignment
*/
import java.util.Scanner;

class Q6_Discount
{
	int i;
	String n;
	int p;
	int d;
	int f;
	Scanner sc = new Scanner(System.in);

	void get()
	{
		System.out.println("Enter Product Id : ");
		i = sc.nextInt();
		System.out.println("Enter Product Name : ");
		n = sc.next();
		System.out.println("Enter Price : ");
		p = sc.nextInt();
		sc.close();
	}

	void display()
	{
		System.out.println("Product Id : " + i);
		System.out.println("Proudct Name : " + n);
		System.out.println("Original Price : " + p);
		
		if(p > 5000) d = 20;
		else if(p >= 2000 && p <= 5000) d = 10;
		else d = 0;

		f = p - (d * p / 100);
		System.out.println("Discount : " + d + "%");
		System.out.println("Final Price : " + f);
	}
}

public class Q6_Discount_Checker
{
	public static void main(String X[])
	{
		Q6_Discount l = new Q6_Discount();
		l.get();
		l.display();
	}
}