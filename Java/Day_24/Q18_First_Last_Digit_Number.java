// Q18. Write a java program to find the first and last digit of a number.

public class Q18_First_Last_Digit_Number
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int l = n % 10;
		int f = 0;
		while(n != 0)
		{
			if(n < 10)
			{
				f = n;
			}
			n = n / 10;
		}
		System.out.println(l);
		System.out.println(f);
	}
}