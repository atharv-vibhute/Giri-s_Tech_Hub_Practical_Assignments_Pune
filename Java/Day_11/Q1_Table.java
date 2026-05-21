// 1. Write a program to print table of a given number 

public class Q1_Table 
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		
		System.out.println("Table of given number is -");
		for(int i = 1; i < 11; i++)
		{
			System.out.println(n + " X " + i + " = " + n*i);
		}
	}
}