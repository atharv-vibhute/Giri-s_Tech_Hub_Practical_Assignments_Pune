/*
Q52.Write a Java program to find the middle value among three distinct integers using ternary operator.
 Input:
 p = 10
 q = 20
 r = 15
 Output : Middle Number = 15
 Explanation : 15 lies between 10 and 20.
*/

public class Q52_Middle_Number
{
	public static void main(String X[])
	{
		int p = Integer.parseInt(X[0]);
		int q = Integer.parseInt(X[1]);
		int r = Integer.parseInt(X[2]);
		if(p>q && p>r)
		{
			if(q>r)
			{
				System.out.println("Middle Number = " + q);
			}
			else
			{
				System.out.println("Middle Number = " + r);
			}
		}
		else if(q>p && q>r)
		{
			if(p>r)
			{
				System.out.println("Middle Number = " + p);
			}
			else
			{
				System.out.println("Middle Number = " + r);
			}
		}
		else
		{
			if(p>q)
			{
				System.out.println("Middle Number = " + p);
			}
			else
			{
				System.out.println("Middle Number = " + r);
			}
		}
	}
}