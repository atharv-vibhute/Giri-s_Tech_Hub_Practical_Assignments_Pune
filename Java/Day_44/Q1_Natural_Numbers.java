// Q1. Write a java program to print all natural numbers from 1 to n. using while loop

public class Q1_Natural_Numbers
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int i = 1;
		do 
		{
			System.out.println(i);
			i++;
		} while(i <= n);
	}
}