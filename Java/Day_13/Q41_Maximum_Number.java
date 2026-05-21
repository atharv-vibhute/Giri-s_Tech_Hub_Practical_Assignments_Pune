/*
Q41. Write a Java program to find the maximum among three numbers.
 Input:
 A = 10
 B = 25
 C = 15
 Output : Maximum = 25
 Explanation : 25 is the largest among the three numbers.
*/

public class Q41_Maximum_Number
{
	public static void main(String X[])
	{
		int n1 = Integer.parseInt(X[0]);
		int n2 = Integer.parseInt(X[1]);
		int n3 = Integer.parseInt(X[2]);
		String s = (n1 > n2 && n1 > n3)? "Maximum = " + n1 : (n2 > n1 && n2 > n3)? "Maximum = " + n2 : (n3 > n1 && n3 > n2)? "Maximum = " + n3 : "At least 2 numbers are same & Maximum.";
		System.out.println(s);
	}
}