// Q13. Write a java program to enter a number and print its reverse.

public class Q13_Reverse_Number
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int r = 0;
		int d;

		do 
		{
			d = n % 10;
			n = n / 10;
			r = r * 10 + d;
		} while(n != 0);

		System.out.println(r);
	}
}