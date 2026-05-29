/*
Question 14: Write a Java program to implement an Online Order Billing System.
Create a class Order with attributes orderId, productPrice, and quantity.
Calculate:
- Total amount = productPrice * quantity
- If total > 5000 => 15% discount
- Otherwise => No discount
Display final amount after discount.
Input:
Enter Order Id : 1001
Enter Product Price : 1200
Enter Quantity : 5

Output:
Order Id : 1001
Total Amount : 6000
Discount : 900
Final Amount : 5100

Explanation:
A class Order is created with orderId, productPrice, and quantity.
Total Amount = productPrice * quantity = 1200 * 5 = 6000.
Since Total Amount (6000) > 5000, a 15% discount is applied:
Discount = 6000 * 15 / 100 = 900
Final Amount = 6000 - 900 = 5100.
If total were 4000 (< 5000), no discount would be applied.
This program demonstrates multiplication, conditional discount, and subtraction using class objects.

Asked In Companies:
Practice assignment
*/
import java.util.Scanner;

class Q14_Order
{
	int i, p, q, s, d, t;
	Scanner sc = new Scanner(System.in);

	void get()
	{
		System.out.println("Enter Order Id : ");
		i = sc.nextInt();
		System.out.println("Enter Product Price : ");
		p = sc.nextInt();
		System.out.println("Enter Quantity : ");
		q = sc.nextInt();
		sc.close();
	}

	void display()
	{
		s = p * q;
		d = s * 15 / 100;
		if(s >= 5000) t = s - d;
		System.out.println("Order Id : " + i);
		System.out.println("Total Amount : " + s);
		System.out.println("Discount : " + d);
		System.out.println("Final Amount : " + t);
	}
}

public class Q14_Discount
{
	public static void main(String X[])
	{
		Q14_Order m = new Q14_Order();
		m.get();
		m.display();
	}
}