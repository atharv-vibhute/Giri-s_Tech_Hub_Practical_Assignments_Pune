/*
Q2. Write a java Program to display 1 to nth Even numbers.
*/

public class Q2_Nth_Even_Number
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int i = 1;
		while(i <= (n*2))
		{
			if(i % 2 == 0)
			{
				System.out.println(i);
			}
			i++;
		}
	}
}