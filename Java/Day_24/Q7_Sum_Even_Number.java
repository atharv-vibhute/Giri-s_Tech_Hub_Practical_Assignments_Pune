// Q7. Write a java program to find the sum of all even numbers between 1 to n.

public class Q7_Sum_Even_Number
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int i = 2;
		int s = 0;
		while(i <= n)
		{
			s = s + i;
			i = i + 2;
		}
		System.out.println(s);
	}
}