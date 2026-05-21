/*
Q34. Check whether a given employee is eligible for bonus:
Input: Years of service and salary.
Logic: If service > 5 years, give 5% bonus.
Output: Display bonus amount or no bonus.
*/

public class Q34_Bonus
{
	public static void main(String X[])
	{
		int se = Integer.parseInt(X[0]);
		int sa = Integer.parseInt(X[1]);
		if(se > 5)
		{
			sa = sa + sa * 5 / 100;
			System.out.println(sa);
		}
		else
		{
			System.out.println("No Bonus");
		}
	}
}