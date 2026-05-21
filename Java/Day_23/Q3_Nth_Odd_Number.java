/*
Q.3 Write a java Program to display 1 to nth odd numbers.
*/

public class Q3_Nth_Odd_Number
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int i = 0;
		while(i <= (n*2))
		{
			if(i % 2 != 0)
			{
				System.out.println(i);
			}
			i++;
		}
	}
}
