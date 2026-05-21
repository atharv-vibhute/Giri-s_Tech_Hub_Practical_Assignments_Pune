/*
Q10. Write a recursive function to reverse a given number.
Explanation:
Take the last digit and place it in reverse order.
Continue recursion by removing the last digit.
Stop when the number becomes 0.
Example: Input: 123		 Output: 321
*/
public class Q10_Function_Recursion_Reverse_Number
{
	static long s = 0;
	public static void main(String X[])
	{
		long n = Long.parseLong(X[0]);
		System.out.println(reverse_number(n));
	}
	public static long reverse_number(long n)
	{
		long r;
		if(n == 0) return s;
		else
		{
			r = n % 10;
			s = s * 10 + r;
			return reverse_number(n / 10);
		}
	}
}