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
		int r = 0;
		int s = 0;
		int p = 1;
		
		while(n != 0)
		{
			r = n % 10;
			s = s + r;
			p = p * r;
			n = n / 10;
		}

		String st = (s == p)? "Spy Number" : "Not Spy Number";
		System.out.println(st);
	}
}