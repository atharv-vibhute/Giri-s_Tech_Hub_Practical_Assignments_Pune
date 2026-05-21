// Q11. Write a java program to calculate the sum of digits in a number.

public class Q11_Sum_Of_Digits
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int r = 0;
		int s = 0;
		while(n != 0)
		{
			r = n % 10;
			s = s + r;
			n = n / 10;
		}
		System.out.println(s);
	}
}