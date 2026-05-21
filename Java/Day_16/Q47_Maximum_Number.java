/*
Q47. Write a Java program to find the maximum between two numbers. 
Input: 
A = 14 
B = 9 
Output : Maximum = 14 
Explanation : 14 is greater than 9.
*/

public class Q47_Maximum_Number
{
	public static void main(String X[])
	{
		int A = Integer.parseInt(X[0]);
		int B = Integer.parseInt(X[1]);
		if(A > B)
		{
			System.out.println("Maximum = " + A);
		}
		else
		{
			System.out.println("Maximum = " + B);
		}
	}
}