// Q 7. Write a java program to calculate the compound intrest. 

import java.lang.Math;

public class Q7_Compound_Interest
{
	public static void main(String X[])
	{
		int ip = Integer.parseInt(X[0]);
		float fr = Float.parseFloat(X[1]);
		float ft = Float.parseFloat(X[2]);
		double fa = ip * Math.pow((1 + fr),ft);
		System.out.println("Compound Interest is " + fa); 
	}
}