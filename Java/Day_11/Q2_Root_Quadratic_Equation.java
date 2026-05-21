// 2. Write a program to find the root of quadratic equation (use sqrt() function)

import java.lang.Math;

public class Q2_Root_Quadratic_Equation 
{
	public static void main(String X[])
	{
		int a = Integer.parseInt(X[0]);
		int b = Integer.parseInt(X[1]);
		int c = Integer.parseInt(X[2]);
		double d = Math.sqrt(b*b - 4*a*c);
		double r1 = (-b + d)/2*a;
		double r2 = (-b - d)/2*a;
		System.out.println("Roots of Quadratic equation is: " + r1 + " " + r2);
	}
}