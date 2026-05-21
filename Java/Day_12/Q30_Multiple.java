/*
Q30. Write a Java program to check whether a number is a multiple of both 3 and 5.
Input	:  15
Output  :  Multiple of both 3 and 5
Explanation :	A logical AND operator is used.
*/

public class Q30_Multiple 
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		String s = (n % 3 == 0 && n % 3 == 0)? "Multiple of both 3 and 5" : "Not Multiple of both 3 and 5";
		System.out.println(s);
	}
}