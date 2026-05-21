/*
Q5. Write a Java method that takes an integer and returns the count of digits in that number.
Explanation
Divide the number by 10 repeatedly
Count how many times division happens
Return the count
Method Signature - static int countDigits(int num)
Input - num = 4567
Output - Digits = 4
*/
public class Q5_Function_Digit_Count
{
	public static void main(String X[])
	{
		long n = Long.parseLong(X[0]);
		System.out.println("Digits = " + digit_count(n));
	}
	public static long digit_count(long n)
	{
		long i = 0;
		while(n != 0)
		{
			n /= 10;
			i++;
		}
		return i;
	}
}