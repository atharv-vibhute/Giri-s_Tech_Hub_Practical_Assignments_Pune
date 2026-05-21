/*
Q61. Write a menu-driven program in java using switch case.
           	1.Addition
           	2.Subtraction
           	3.Multiplication
           	4,Division
*/

import java.util.Scanner;

public class Q61_Menu_Driven_Calcultor
{
	public static void main(String X[])
	{
		System.out.println("Menu Driven Calcultor");
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("Enter the choice Number: ");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float a, b;

		switch(n)
		{
			case 1:
				System.out.println("Enter the first number: ");
				a = sc.nextFloat();
				System.out.println("Enter the second number: ");
				b = sc.nextFloat();
				System.out.println("Addition: " + (a+b));
				break;

			case 2:
				System.out.println("Enter the first number: ");
				a = sc.nextFloat();
				System.out.println("Enter the second number: ");
				b = sc.nextFloat();
				System.out.println("Substraction: " + (a-b));
				break;

			case 3:
				System.out.println("Enter the first number: ");
				a = sc.nextFloat();
				System.out.println("Enter the second number: ");
				b = sc.nextFloat();
				System.out.println("Multiplication: " + (a*b));
				break;

			case 4:
				System.out.println("Enter the first number: ");
				a = sc.nextFloat();
				System.out.println("Enter the second number: ");
				b = sc.nextFloat();
				System.out.println("Division: " + (a/b));
				break;

			default:
				System.out.println("Wrong Input");
		}
		sc.close();
	}
}