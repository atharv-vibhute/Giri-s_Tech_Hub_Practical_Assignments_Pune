/*
Q26. Write a Java program to check whether a number is a Spy number.
 Input: 1412
 Output : Spy Number
 Explanation : Sum = 8, Product = 8.
*/

public class Q26_Spy_Number
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int s = 0;
		int m = 1;
		int r = 0;

		while(n != 0)
		{
			r = n % 10;
			s = s + r;
			m = m * r;
			n = n / 10;			
		}

		if(s == m)
		{
			System.out.println("Spy Number");
		}
		else 
		{
			System.out.println("Not Spy Number");
		}
	}
}