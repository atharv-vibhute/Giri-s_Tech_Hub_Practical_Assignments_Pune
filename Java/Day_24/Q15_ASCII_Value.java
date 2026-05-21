// Q15. Write a java program to print all ASCII characters with their values.

public class Q15_ASCII_Value
{
	public static void main(String X[])
	{
		int i = 1;
		while(i <= 128)
		{
			System.out.printf("\n %d - %c", i, (char)i);
			i++;
		}
	}
}