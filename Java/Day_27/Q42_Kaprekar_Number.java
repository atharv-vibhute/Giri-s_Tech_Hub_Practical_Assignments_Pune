/*
Q42. Write a Java program to check whether a given number is a Kaprekar number or not, and to display all Kaprekar numbers up to n.
A Kaprekar number is a non-negative integer, the representation of whose square can be split into two parts that add up to the original number itself.
 For example:
9² = 81 → split as 8 and 1 → 8 + 1 = 9
45² = 2025 → split as 20 and 25 → 20 + 25 = 45   
*/

public class Q42_Kaprekar_Number
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int q = n * n;
		int s = 0;
		int r;

		for(;q!=0;)
		{
			r = q % 100;
			s = s + r;
			q = q / 100;
		}

		if(s == n)
		{
			System.out.println("Kaprekar Number");
		}
		else
		{
			System.out.println("Not Kaprekar Number");
		}
	}
}