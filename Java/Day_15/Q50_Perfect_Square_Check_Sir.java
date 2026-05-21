/*
Q50. Write a Java program to check whether a number is a perfect square using a ternary operator. 
Input : Number = 49 
Output : Perfect Square 
Explanation : 7 × 7 = 49.
*/

import java.lang.Math;

public class Q50_Perfect_Square_Check_Sir
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		double sq = Math.sqrt(n);
		String s = ((int)sq == sq)? "Perfect Square" : "Not Perfect Square";
		System.out.println(s);
	}
}