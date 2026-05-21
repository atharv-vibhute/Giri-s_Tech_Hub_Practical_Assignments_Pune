/*
Q50. Write a Java program to check whether a number is a perfect square using a ternary operator.
 Input : Number = 49
 Output : Perfect Square
 Explanation : 7 × 7 = 49.
*/

public class Q50_Perfect_Square
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int r = 0;
		for(int i=2; i<=n; i++)
		{
			if(n == i*i)
			{
				r = 1;
				break;
			}
		}
		String s = (r == 1)? "Perfect Square":"Not Perfect Square";
		System.out.println(s);
	}
}