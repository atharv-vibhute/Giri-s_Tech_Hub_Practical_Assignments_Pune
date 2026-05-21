/*
Q71. Write a java program to print this pattern.

				1
			A	B	C
		2	3	4	5	6
	D	E	F	G	H	I	J
7	8	9	10	11	12	13	14	15
*/

public class Q71_Pattern_71
{
	public static void main(String X[])
	{
		int i, j;
		int k = 1;
		int A = 65;
		for(i = 1; i <= 5; i++)
		{
			System.out.println();

			for(j = 1; j <= 9; j++)
			{
				if(6 - i <= j && 4 + i >= j && i % 2 == 0)
				{
					System.out.print((char)A + "     ");
					A++;
				} 
				else if(6 - i <= j && 4 + i >= j && i % 2 != 0)
				{
					System.out.print(k + "     ");
					k++;
				}
				else 
				{
					System.out.print("      ");
				}
			}
		}
	}
}	
