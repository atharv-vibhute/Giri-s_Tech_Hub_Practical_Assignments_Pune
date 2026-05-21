/*
Q11. Print a pattern of numbers from  to  as shown below. Each of the numbers is separated by a single space.

			    for 4
                            4 4 4 4 4 4 4  
                            4 3 3 3 3 3 4   
                            4 3 2 2 2 3 4   
                            4 3 2 1 2 3 4   
                            4 3 2 2 2 3 4   
                            4 3 3 3 3 3 4   
                            4 4 4 4 4 4 4  


			    	for 2
				2 2 2
				2 1 2
				2 2 2 
*/

import java.util.Scanner;

public class Q11_Pattern
{
	public static void main(String X[])
	{
		int i, j, k, a, b, c;

		System.out.println("Enter the value: ");
		Scanner sc = new Scanner(System.in);
		k = sc.nextInt();
		sc.close();

		a = k * 2 - 1;
		b = k * 2;
		c = k + 1;

		for(i = 1; i <= a; i++)
		{
			for(j = 1; j <= a; j++)
			{
				if(i == 1 || i == 7 || j == 1 || j == 7)
				{
					System.out.print(4 + " ");
				}
				else if(i == 2 || i == 6 || j == 2 || j == 6)
				{
					System.out.print(3 + " ");
				}
				else if(i == 3 || i == 5 || j == 3 || j == 5)
				{
					System.out.print(2 + " ");
				}
				else 
				{
					System.out.print(1 + " ");
				}
			}
		
			System.out.println();
		}
	}
}


							
							
				
