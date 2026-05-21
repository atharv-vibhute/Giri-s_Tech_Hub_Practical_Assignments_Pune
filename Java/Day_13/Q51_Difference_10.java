/*
Q51. Write a Java program to check whether the absolute difference between two numbers is greater than 10.
 Input:
 m = 25
 n = 12
 Output : Difference is greater than 10
Explanation: |25 − 12| = 13.
*/

public class Q51_Difference_10
{
	public static void main(String X[])
	{
		int m = Integer.parseInt(X[0]);
		int n = Integer.parseInt(X[1]);
		String s = (m-n>10 || n-m>10)? "Difference is greater than 10" : "Difference is not greater than 10";
		System.out.println(s);
	}
}

