// Q6. Write a java program to find the sum of all natural numbers between 1 to n.

public class Q6_Sum_Numbers
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int s = 0;
		int i = 1;
		while(i <= n)
		{
			s = s + i;
			i++;
		}
		System.out.println(s);
	}
}