/*
Q30. Write a Java program to check whether a number is a multiple of both 3 and 5.
Input	:  15
Output  :  Multiple of both 3 and 5
Explanation :	A logical AND operator is used.
*/

public class Q30_Multiple_3_5
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		if(n%3==0 && n%5==0)
		{
			System.out.println("Multiple of both 3 and 5");
		}
		else
		{
			System.out.println("Not Multiple of both 3 and 5");
		}
	}
}