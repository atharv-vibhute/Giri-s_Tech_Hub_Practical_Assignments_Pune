/*
Q52: Create a Java program to simulate a simple calculator using a switch case. It should take two numbers and an operator (+, -, *, /, %) as input and perform the corresponding operation.
Explanation: Use a switch on the operator to handle different arithmetic operations. Add default to handle invalid operators.
*/

import java.util.Scanner;

public class Q52_Calculator
{
	public static void main(String X[])
	{
		Scanner sc = new Scanner(System.in);
		int n, m, x, c;
		float r = 0;

		System.out.println("Enter the first number: ");
		n = sc.nextInt();
		System.out.println("Enter the second number: ");
		m = sc.nextInt();

		System.out.println("Operations -");
		System.out.println("1. Addition +");
		System.out.println("2. Subtraction -");
		System.out.println("3. Multiplication *");
		System.out.println("4. Division /");
		System.out.println("5. Remainder %");

		System.out.println("Enter the choise: ");
		c = sc.nextInt();

		switch(c)
		{
			case 1:
				x = n + m;
				System.out.println(x);
				break;

			case 2:
				x = n - m;
				System.out.println(r);
				break;

			case 3:
				x = n * m;
				System.out.println(x);
				break;

			case 4:
				r = (float)n / m;
				System.out.println(r);
				break;

			case 5:
				x = n % m;
				System.out.println(x);
				break;

			default:
				System.out.println("Wrong Choise");
		}
	}
}

