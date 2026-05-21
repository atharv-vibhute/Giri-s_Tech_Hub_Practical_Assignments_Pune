/*
Q7. write java program to reverse given number
*/

public class Q7_Reverse_Number
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int u = 0;
		int r = 0;
		while(n != 0)
		{
			r = n % 10;
			u = u * 10 + r;
			n = n / 10;
		}
		System.out.println(u);
	}
}