// Q14. Write a java program to check whether a number is palindrome or not.

public class Q14_Palindrome_Number
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int t = n;
		int r = 0;
		int d;

		do
		{
			d = t % 10;
			r = r * 10 + d;
			t = t / 10;
		} while(t != 0);

		System.out.println((n == r)? "Palindrome Number" : "Not Palindrome Number");
	}
}