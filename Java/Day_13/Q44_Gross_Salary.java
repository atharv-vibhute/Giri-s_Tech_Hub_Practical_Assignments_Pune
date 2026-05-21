/*
Q44. Write a Java program to calculate gross salary based on basic salary conditions.
 Input : Basic Salary = 18000
 Output : Gross Salary = 34650
 Explanation : HRA and DA percentages are applied based on salary slab.
*/

public class Q44_Gross_Salary
{
	public static void main(String X[])
	{
		int b = Integer.parseInt(X[0]);
		int h = b * 30/100;
		int d = b * 625/1000;
		int g = b + h + d;
		System.out.println("Gross Salary = " + g);
	}
}