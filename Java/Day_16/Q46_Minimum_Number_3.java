/*
Q46. Write a Java program to find the minimum among three numbers. 
Input: 
A = 6 
B = 3 
C = 9 
Output : Minimum = 3 
Explanation : 3 is the smallest number. 
*/

public class Q46_Minimum_Number_3
{
	public static void main(String X[])
	{
		int A = Integer.parseInt(X[0]);
		int B = Integer.parseInt(X[1]);
		int C = Integer.parseInt(X[2]);
		if(A<B && A<C)
		{
			System.out.println("Minimum = " + A);
		}
		else if(B<A && B<C)
		{
			System.out.println("Minimum = " + B);
		}
		else
		{
			System.out.println("Minimum = " + C);
		}
	}
}
