/*
Q9. Write a recursive function to count how many digits are present in a given number.
Explanation:
Remove the last digit using division (number / 10).
Increase count in each recursive call.
Stop when the number becomes 0.
Example: Input: 4567	 Output: 4
*/
public class Q9_Function_Recursion_Digit_Count
{
	public static void main(String X[])
	{
		long n = Long.parseLong(X[0]);
		if(n == 0) System.out.println(1);
		else System.out.println(digit_count(0, n));
	}
	public static long digit_count(long i, long n)
	{
		if(n == 0) return i;
		else return digit_count(i + 1, n / 10);
	}
}