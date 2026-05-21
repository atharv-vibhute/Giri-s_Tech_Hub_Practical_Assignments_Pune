/*
Q.4 Write a java Program to take 2 integer from user start and end and find the sum of even number between start and end.
*/

public class Q4_Sum_Even_Numbers
{
	public static void main(String X[])
	{
		int s = Integer.parseInt(X[0]);
		int e = Integer.parseInt(X[1]);
		int i = s;
		int u = 0;
		while(i <= e)
		{
			if(i % 2 == 0)
			{
				u = u + i;
			}
			i++;
		}
		System.out.println(u);
	}
}