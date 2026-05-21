/*
Q1. Write a Java method that takes two integers as input and returns their sum.
Explanation
The method receives two numbers
It adds them
Returns the result to the main method
Method Signature - static int getSum(int a, int b)
Input - a = 10, b = 20
Output - Sum = 30
*/
public class Q1_Function_Sum
{
	public static void main(String X[])
	{
		int a = Integer.parseInt(X[0]);
		int b = Integer.parseInt(X[1]);
		System.out.println("Sum = " + getSum(a, b));
	}
	public static int getSum(int a, int b)
	{
		return a + b;
	}
}