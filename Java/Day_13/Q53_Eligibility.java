/*
Q53. Write a java program to check eligibility based on percentage and income.
 Input:
 Percentage = 78
 Income = 180000
 Output : Eligible
 Explanation : Percentage ≥ 75 and income < 200000.
*/

public class Q53_Eligibility
{
	public static void main(String X[])
	{
		int p = Integer.parseInt(X[0]);
		int i = Integer.parseInt(X[1]);
		String s = (p>=75 && i<200000)? "Eligible" : "Not Eligible";
		System.out.println(s);
	}
}