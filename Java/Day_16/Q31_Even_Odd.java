/*
Q31. Write a Java program to check whether a given number is even or odd.
 Input : Number = 12
 Output : Even
 Explanation : A number divisible by 2 is even; otherwise, it is odd.
*/

public class Q31_Even_Odd
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		if(n % 2 == 0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}
	}
}

