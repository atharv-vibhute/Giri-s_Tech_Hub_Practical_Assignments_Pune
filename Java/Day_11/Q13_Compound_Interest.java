/*
Q13. Write a Java program to calculate compound interest.
 Input : Principal = 2000
 	 Rate = 10
	 Time = 2
 Output : Compound Interest = 420
 Explanation : Compound interest formula is used.
*/

import java.lang.Math;

public class Q13_Compound_Interest
{
	public static void main(String X[])
	{
		int p = Integer.parseInt(X[0]);
		float r = Float.parseFloat(X[1]);
		int t = Integer.parseInt(X[2]);

		double c = p * Math.pow((1+r), t);
		double cp = c - p;
		System.out.println(p);
		System.out.println("Compound Interest = " + cp);
	}
}