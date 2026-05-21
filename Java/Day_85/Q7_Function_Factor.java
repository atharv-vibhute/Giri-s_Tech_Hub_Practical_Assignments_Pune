/*
Q7. Write a Java program using a void function to print all factors of a given number.
Explanation
Function accepts one integer parameter
Use a loop from 1 to the number
If number is divisible, print the factor
No return value
*/
public class Q7_Function_Factor
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		factor(n);
	}
	public static void factor(int n)
	{
		int i;
		for(i = 1; i <= n; i++)
		{
			if(n % i == 0) System.out.print(i + " ");
		}
	}
}