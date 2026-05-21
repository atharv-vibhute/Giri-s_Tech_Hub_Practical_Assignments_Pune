/*
Q51. Write a Java program to check whether the absolute difference between two numbers is greater than 10.
 Input:
 m = 25
 n = 12
 Output : Difference is greater than 10
Explanation: |25 − 12| = 13.
*/

public class Q51_Absolute_Difference 
{
	public static void main(String X[])
	{
		int m = Integer.parseInt(X[0]);
		int n = Integer.parseInt(X[1]);
		if((m-n)>10 || (n-m)>10)
		{
			System.out.println("Difference is greater than 10");
		}
		else
		{
			System.out.println("Difference is not greater than 10");
		}
	}
}