/*
Q57. Write a java program to determine bonus based on performance rating.
 Input : Rating = 9
 Output : 15% Bonus
 Explanation : Rating greater than 8 gets 15% bonus.
*/

public class Q57_Bonus
{
	public static void main(String X[])
	{
		int r = Integer.parseInt(X[0]);
		String s = (r > 8)? "15% Bonus" : "No Bonus";
		System.out.println(s);
	}
}