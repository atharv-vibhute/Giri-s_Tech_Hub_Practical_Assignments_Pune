/*
Q83. Write a java program to print this pattern.


1	A	2	B	3  
    C	    4       D       5  
        6	E	7  
    F       8       G       9  
H	10	I	11	J
*/

public class Q83_Pattern_83
{
	public static void main(String X[])
	{
		int i, j;
		int k = 1;
		int A = 65;

		for(i = 1; i <= 5; i++)
		{
			System.out.println();

			for(j = 0; j <= 9; j++)
			{
				if((i + j) % 2 == 0)
				{
					if(i <= 3 && i <= j && i + j <= 10)
					{
						if((i + j) % 4 == 0)
						{
							System.out.print((char)A + "   ");
							A++;
						}
						else
						{
							System.out.print(k + "   ");
							k++;
						}
					}
					else if(i > 3 && i + j >= 6 && 4 + i >= j)
					{
						if((i + j) % 4 == 0)
						{
							System.out.print(k + "   ");
							k++;
						}
						else
						{
							System.out.print((char)A + "   ");
							A++;						
						}
					}
					else
					{
						System.out.print("    ");
					}

				}
				else
				{
					System.out.print("    ");
				}
			}
		}
	}
}