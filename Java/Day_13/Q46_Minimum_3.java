/*
Q46. Write a Java program to find the minimum among three numbers.
 Input:
 A = 6
 B = 3
 C = 9
 Output : Minimum = 3
 Explanation : 3 is the smallest number.
*/

public class Q46_Minimum_3
{
	public static void main(String X[])
	{
		int A = Integer.parseInt(X[0]);
		int B = Integer.parseInt(X[1]);
		int C = Integer.parseInt(X[2]);
		String s = (A>=B && C>=B)? "Minimum = "+B:(B>=A && C>=A)? "Minimum = "+A:"Minimum = "+C;
		System.out.println(s);
	}
}