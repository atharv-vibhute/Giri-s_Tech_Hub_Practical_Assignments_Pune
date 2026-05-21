/*
Q55. Write a java program to check whether the middle digit is greater than the sum of first and last digits.
 Input : Number = 853
 Output : Not Greater
 Explanation : Middle digit 5 < (8 + 3).
*/

public class Q55_Middle_Digit
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int l = n % 10;
		n = n / 10;
		int m = n % 10;
		n = n / 10;
		String s = ((l + n) > m)? "Not Greater" : "Greater";
		System.out.println(s);
	}
}