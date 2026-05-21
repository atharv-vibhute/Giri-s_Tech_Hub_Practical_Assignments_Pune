/*
Q56. Write a Java program to display the following series:
7   10   15   22   31   42   55   70
      (Start at 7, differences increasing by 1 each time: +3, +5, +7...)
*/


public class Q56_Series_Addition
{
	public static void main(String X[])
	{
		int n = Integer.parseInt(X[0]);
		int j = 6;
		int i;
		for(i = 0; i < n; i++)
		{
			j = j + i * 2 + 1;
			System.out.print(j + " ");
		} 
	}
}