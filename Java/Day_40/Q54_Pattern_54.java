/*
Q54. Write a java program to print this pattern.

		1
   	    2       2
  	3   		3
    4     		    4
5	5	5	5	5
*/

public class Q54_Pattern_54
{
	public static void main(String X[])
	{
		int i, j;
		for(i = 1; i <= 5; i++)
		{
			System.out.println();
			for(j = 1; j <= 9; System.out.print(((i + j) % 2 == 0 && (6 - i == j || 4 + i == j || i == 5))? i + "   " : "    "), j++);
		}
	}
}