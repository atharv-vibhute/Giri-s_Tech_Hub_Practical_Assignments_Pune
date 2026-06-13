/*
Question 13: Write a Java program to demonstrate constructor overloading in a Mobile class and apply discount calculation.

Description: Create Mobile class with mobileId, mobileName and price. Create overloaded constructors (one without discount, one with discount). If discount constructor used, reduce 10% price.
INPUT:
Enter Mobile Id: 101
Enter Mobile Name: Samsung
Enter Price: 20000

OUTPUT:
Original Price: 20000
Discount Price: 18000

EXPLANATION:
Create two constructors: public Mobile(int id, String name, int p) and public Mobile(int id, String name, int p, boolean discount). First constructor stores original price. Second constructor calculates 10% discount: price = price - (price * 10 / 100). Display both original and discounted price.

Asked In Companies:
Practice Assignment
*/

import java.util.Scanner;

class Q13_Mobile
{
	Q13_Mobile(int i, String name, int p)
	{
		System.out.println("Original Price: " + p);
	}

	Q13_Mobile(int i, String name, int p, Boolean d)
	{
		System.out.println("Discount Price: " + (p - (p * 10 / 100)));
	}
}

public class Q13_Discount
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		int i, p;
		String s;
		Boolean d = true;

		System.out.println("Enter Mobile Id: ");
		i = sc.nextInt();

		System.out.println("Enter Mobile Name: ");
		s = sc.next();
	
		System.out.println("Enter Price: ");
		p = sc.nextInt();

		Q13_Mobile n = new Q13_Mobile(i, s, p);
		Q13_Mobile m = new Q13_Mobile(i, s, p, d);	
	}
}