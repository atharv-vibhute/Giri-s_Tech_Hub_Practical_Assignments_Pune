// Q16. Write a java program to find power of a number.

public class Q16_Power_Of_Number
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int b = Integer.parseInt(X[1]);
		int i = 0;
		while(n != 1)
		{
			n = n / b;
			i++;
		}
		System.out.println(i);
	}
}