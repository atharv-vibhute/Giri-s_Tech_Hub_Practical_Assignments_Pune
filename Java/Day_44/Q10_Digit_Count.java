// Q10. Write a java program to count the number of digits in a number.

public class Q10_Digit_Count
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int i = 0;		
		do
		{
			n = n / 10;
			i++;
		} while(n != 0);
		System.out.println(i);
	}
}