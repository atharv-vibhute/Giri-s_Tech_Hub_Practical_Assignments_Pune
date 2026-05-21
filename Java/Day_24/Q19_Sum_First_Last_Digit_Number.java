// Q19. Write a java program to find the sum of the first and last digit of a number.

public class Q19_Sum_First_Last_Digit_Number
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int s = 0;
		int l = n % 10;
		int f = 0;
		if(n < 10)
		{
			s = l;
		} 
		else
		{
			while(n != 0)
			{
				if(n < 10)
				{
					f = n;
				}
				n = n / 10;
			}
			s = f + l;
		}
		System.out.println(s);
	}
}