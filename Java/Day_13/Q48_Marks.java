/*
Q48. Write a Java program to print Pass if marks are 40 or above, otherwise Fail.
 Input : Marks = 38
 Output : Fail
 Explanation : Marks are below the passing criteria.
*/

public class Q48_Marks
{
	public static void main(String X[])
	{
		int m = Integer.parseInt(X[0]);
		String s = (m >= 40)? "Pass" : "Fail";
		System.out.println(s);
	}
}