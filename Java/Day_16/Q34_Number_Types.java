/*
Q34. Write a Java program to check whether a number is positive, negative, or zero. 
Input : Number = -8 
Output : Negative 
Explanation : If the number is less than zero, it is negative. 
*/

public class Q34_Number_Types
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		if(n > 0)
		{
			System.out.println("Positive");
		}
		else if(n < 0)
		{
			System.out.println("Negitive");
		}
		else
		{
			System.out.println("Zero");
		}
	}
}