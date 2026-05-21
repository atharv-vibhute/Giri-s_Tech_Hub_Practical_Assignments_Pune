/*
Q35. Write a Java program to check whether a number is divisible by both 5 and 11. 
Input : Number = 55 
Output : Divisible by 5 and 11 
Explanation : 55 is divisible by both 5 and 11.
*/

public class Q35_Divisible_5_11
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		if(n%5==0 && n%11==0)
		{
			System.out.println("Divisible by 5 and 11");
		}
		else 
		{
			System.out.println("Not divisible by 5 and 11");
		}
	}
}