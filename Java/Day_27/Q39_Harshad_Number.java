// Q39. Write a Java program to check whether a given number is a Harshad number (i.e., divisible by the sum of its digits) for numbers from 1 to n.

public class Q39_Harshad_Number
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int r = 0;
		int t = n;
		int s = 0;

		while(t != 0)
		{
			r = t % 10;
			t = t / 10;
			s = s + r;
		}

		if(n % s == 0)
		{
			System.out.println("Harshad Number");
		}
		else
		{
			System.out.println("Not Harshad Number");
		}
	}
}