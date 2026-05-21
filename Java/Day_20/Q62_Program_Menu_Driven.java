/*
Q62. Write a menu-driven program in java using switch case.
           	1.Check Number is positive , negative or zero.
           	2.Check Number is even or odd.
           	3.Write a c program to find the max number using 2 numbers.
*/
/*
 Third one is Java Program.
*/

import java.util.Scanner;

public class Q62_Program_Menu_Driven
{
	public static void main(String X[])
	{
		System.out.println("Programs  -");
		System.out.println("1. Check Number is positive, negative or zero.");
		System.out.println("2. Check Number is even or odd.");
		System.out.println("3. Write a c program to find the max number using 2 numbers.");
		System.out.println("Enter the choice: ");
		
		Scanner sc = new Scanner(System.in);
		int c, n, m, r;
		String s;
		c = sc.nextInt();

		switch(c)
		{
			case 1: 
				System.out.println("Enter the number: ");
				n = sc.nextInt();
				s = (n > 0)? "Positive" : (n < 0)? "Negative": "Zero";
				System.out.println(s);
				break;

			case 2: 
				System.out.println("Enter the number: ");
				n = sc.nextInt();
				s = (n % 2 == 0)? "Even" : "Odd";
				System.out.println(s);
				break;

			case 3:
				System.out.println("Enter the first number: ");
				n = sc.nextInt();
				System.out.println("Enter the second number: ");
				m = sc.nextInt();
				r = (n > m)? n : m;
				System.out.println("Maximum Number: " + r);
				break;
		
			default:
				System.out.println("Wrong Choice");
		}
		sc.close();
	}
}