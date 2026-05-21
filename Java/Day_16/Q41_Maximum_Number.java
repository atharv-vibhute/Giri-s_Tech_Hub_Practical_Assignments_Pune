/*
Q41. Write a Java program to find the maximum among three numbers. 
Input: 
A = 10 
B = 25 
C = 15 
Output : Maximum = 25 
Explanation : 25 is the largest among the three numbers. 
*/

public class Q41_Maximum_Number
{
	public static void main(String X[])
	{
		int A = Integer.parseInt(X[0]);
		int B = Integer.parseInt(X[1]);
		int C = Integer.parseInt(X[2]);
		if(A>B && A>C)
		{
			System.out.println("Maximum = " + A);
		}
		else if(B>C && B>A)
		{
			System.out.println("Maximum = " + B);
		}
		else
		{
			System.out.println("Maximum = " + C);
		}
	}
}