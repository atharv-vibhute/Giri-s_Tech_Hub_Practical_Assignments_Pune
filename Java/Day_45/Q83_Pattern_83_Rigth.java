/*
Q83. Write a java program to print this pattern.


1	A	2	B	3  
    C	    4       D       5  
        E	6	F  
    7       J       8       G  
9	H	10	I	11
*/

public class Q83_Pattern_83_Rigth
{
	public static void main(String X[])
	{
		int i, j;
		int A = 65;
		int n = 1;

		for(i = 1; i <= 5; i++)
		{
			System.out.println();
	
			for(j = 1; j <= 9; j++)
			{
				if((i + j) % 2 == 0)
				{
					if(i < 3 && i <= j && i + j <= 10)
					{
						if((i + j) % 4 == 0)
						{
							System.out.print((char)A + " ");
							A++;
						}
						else
						{
							System.out.print(n + " ");	
							n++;
						}
					}
			       		else if(i == 3 && i < j && i + j <= 12)
					{
						if((i + j) % 4 == 0)
						{
							System.out.print((char)A + " ");
							A++;
						}
						else
						{
							System.out.print(n + " ");	
							n++;
						}				
					}
					else if(i > 3 && i + j >= 6 && j - i <= 8)
					{
						if((i + j) % 4 == 0)
						{
							System.out.print((char)A + " ");
							A++;
						}
						else
						{
							System.out.print(n + " ");
							n++;
						}
					}
				}
				else
				{
					System.out.print("   ");
				}
			}
		}
	}
}


