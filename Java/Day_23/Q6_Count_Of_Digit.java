/*
Q6. write java program to count number of digit in given number
*/

public class Q6_Count_Of_Digit
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int i = 0;
		while(n != 0)
		{
			n = n / 10;
			i++;
		}
		System.out.println(i);
	}
}