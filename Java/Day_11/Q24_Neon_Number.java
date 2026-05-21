/*
Q24. Write a Java program to check whether a number is a Neon number or not.
 Input : 9
 Output : Neon Number
 Explanation : 9² = 81 → 8 + 1 = 9.
*/

public class Q24_Neon_Number
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int sq = n * n;
		int s = 0;
		int r = 0;

		while(sq != 0)
		{
			r = sq % 10;
			sq = sq / 10;
			s = s + r;
		}

		String st = (s == n)? "Neon Number" : "Not Neon Number";
		System.out.println(st);
	}
}