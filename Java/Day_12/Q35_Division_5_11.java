/*
Q35. Write a Java program to check whether a number is divisible by both 5 and 11.
 Input : Number = 55
 Output : Divisible by 5 and 11
 Explanation : 55 is divisible by both 5 and 11.
*/

public class Q35_Division_5_11
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		String s = (n%5==0 && n%11==0)? "Divisible by 5 and 11" : "Not Divisible by 5 and 11";
		System.out.println(s);
	}
}