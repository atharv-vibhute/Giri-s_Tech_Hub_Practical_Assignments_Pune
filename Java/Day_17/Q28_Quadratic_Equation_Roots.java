/*
Q28. Write a java program to find all roots of a quadratic equation using if else. How to find all roots of a quadratic equation using if else in java programming.
Example
Input a: 8 ,  b: -4 , c: -2
Output Root1: 0.80
Root2: -0.30
*/

import java.lang.Math;

public class Q28_Quadratic_Equation_Roots
{
	public static void main(String X[])
	{
		int a = Integer.parseInt(X[0]);
		int b = Integer.parseInt(X[1]);
		int c = Integer.parseInt(X[2]);
		int d = b*b - 4*a*c;
		double e = Math.sqrt(d);
		double r1;
		double r2;

		if(d == 0)
		{
			System.out.println("The both roots are same & real");
			r1 = -(double)b/(2*a);
			r2 = r1;
			System.out.printf("Root1: %.2f", r1);
			System.out.printf("\nRoot2: %.2f", r2);
		}
		else if(d > 0)
		{
			System.out.println("The both roots are distinct & real");
			r1 = (-b+e)/(2*a);
			r2 = (-b-e)/(2*a);
			System.out.printf("Root1: %.2f", r1);
			System.out.printf("\nRoot2: %.2f", r2);
		} 
		else 
		{
			System.out.println("The roots are complex");
		}
	}
}