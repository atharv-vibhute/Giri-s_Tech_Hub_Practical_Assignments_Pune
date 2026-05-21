/*
Q56. Write a Java expression using arithmetic and assignment operators to calculate net salary.
 Input:
 Basic Salary = 35000
 Tax Rate = 12%
 Output : Net Salary = 30800
 Explanation : Tax is deducted from basic salary.
*/

public class Q56_Net_Salary
{
	public static void main(String X[])
	{
		int b = Integer.parseInt(X[0]);
		int t = b * 12/100;
		int n = b - t;
		System.out.println("Net Salary = " + n);
	}
}