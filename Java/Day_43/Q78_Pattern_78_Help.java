/*
Q78. Write a java program to print this pattern.

A	B	C	D	E	D	C	B	A	
A	B	C	D	  	D	C	B	A	
A	B	C    				C	B	A
A	B     						B	A
A       							A
A	B     						B	A
A	B	C   				C	B	A
A	B	C	D 		D	C	B	A
A	B	C	D	E	D	C	B	A
*/

public class Q78_Pattern_78_Help
{
	public static void main(String X[])
	{
		int i, j, A;
		int k = 5, m = 5;

		for(i = 1; i <= 9; i++)
		{
			A = 65;

			for(j = 1; j <= 9; j++)
			{
				if(j>k && j<m)
				{
					System.out.print("     ");
		
				}
				else
				{
					
					System.out.print((char)A +"    ");
				}
		
				if(j<5)
					A++;
				else
					A--;

			}
			System.out.println();
			if(i<5)
			{
				k--;
				m++;
			}
			else
			{
				k++;
				m--;
			}
		}
	}
} 