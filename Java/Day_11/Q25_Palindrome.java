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
		int n1 = Integer.parseInt(X[0]);
		int r = 0;
		int rn =0;
		int n2 = n1;

		while(n1 != 0)
		{
			r = n1 % 10;
			rn = rn * 10 + r;
			n1 = n1 / 10;
		}

		String s = (n2 == rn)? "Palindrome" : "Not Palindrome";
		System.out.println(s);
	}
}
