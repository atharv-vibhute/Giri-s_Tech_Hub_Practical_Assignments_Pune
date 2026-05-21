/*
Q25. Write a Java program to check whether a number is palindrome or not.
 Input : 121
 Output : Palindrome
 Explanation : The reversed number is the same as original.
*/

public class Q25_Palindrome
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int r = 0;
		int s = 0;
		int m = n;
		
		while(n != 0)
		{
			r = n % 10;
			s = s * 10 + r;
			n = n / 10;
		}

		if(s == m)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println("Not Palindrome Number");
		}
	}
}