// Q8. Write a java program to find the sum of all odd numbers between 1 to n.

public class Q8_Sum_Odd_Number
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int i = 1;
		int s = 0;
		while(i <= n)
		{
			s = s + i;
			i = i + 2;
		}
		System.out.println(s);
	}
}