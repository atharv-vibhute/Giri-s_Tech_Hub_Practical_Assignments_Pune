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
		int m = n;
		int r = 0;
		int s = 0;

		while(n!=0)
		{
			r = n % 10;
			s = s + r;
			n = n / 10;
		}

		if(r == m)
		{
			System.out.println("Neon Number");
		}
		else 
		{
			System.out.println("Not Neon Number");
		}
	}
}