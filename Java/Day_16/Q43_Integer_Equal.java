/*
Q43. Write a Java program to accept two integers and check whether they are equal. 
Input: 
A = 50 
B = 50 
Output : Equal 
Explanation : Both numbers have the same value.
*/

public class Q43_Integer_Equal
{
	public static void main(String X[])
	{
		int A = Integer.parseInt(X[0]);
		int B = Integer.parseInt(X[1]);
		if(A == B)
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal");
		}
	}
}
